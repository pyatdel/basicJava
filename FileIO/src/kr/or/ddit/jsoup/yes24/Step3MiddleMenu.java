package kr.or.ddit.jsoup.yes24;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

import kr.or.ddit.jsoup.JsoupUtil;

public class Step3MiddleMenu {
	public static void main(String[] args) {
		Step3MiddleMenu sm = new Step3MiddleMenu();
		sm.process();
	}

	public void process() {

		boolean chk = false; 
		File rootDir = new File("yes24/step3");
		for (File bigMenu : rootDir.listFiles()) {
			if(bigMenu.getName().contains("IT 모바일")) {
				chk = true;
			}
			if(!chk) continue;
			
			System.out.println("FOLDER : " + bigMenu);
			for (File f : bigMenu.listFiles()) {
//				System.out.println("\t READ HTML FILE : " + f);
				String folder = f.getPath().replace("step3", "step4").replace(".html", "");
				folder = folder.trim();
				
				Map<String, String> map = pageParser(f);
				String last = map.get("last");
				String href = map.get("href");
				
				if(last == null) continue;
				File dir = new File(folder);
				if (!dir.exists()) dir.mkdirs();
				
				int lastInt = Integer.parseInt(last);

				for (int i = 1; i <= lastInt; i++) {
					String url = JsoupUtil.rootUrl + href + "?PageNumber=" + i;
					File file = new File(dir, "list_" + i + ".html");
					try {
						if (file.exists()) continue;
						String html = JsoupUtil.getHtml(url);
						Files.write(Paths.get(file.getPath()), html.getBytes());
//						System.out.println("\t\tCREATE FILE : " + file);
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}

		}

	}

	public Map<String, String> pageParser(File f) {
		Map<String, String> map = new HashMap();
		try {
			String html = Files.readString(Paths.get(f.getPath()));
			String[] lines = html.split("\n");
			String last = "";
			String href = "";
			for (String line : lines) {
//				bgYUI end
				if (line.contains("bgYUI end")) {
//			         <a href="/24/Category/Display/001001003027?PageNumber=1" class="bgYUI first dim">처음</a> <a href="/24/Category/Display/001001003027?PageNumber=1" class="bgYUI prev dim">이전</a> <strong class="num">1</strong> <a href="/24/Category/Display/001001003027?PageNumber=2" class="num">2</a> <a href="/24/Category/Display/001001003027?PageNumber=3" class="num">3</a> <a href="/24/Category/Display/001001003027?PageNumber=4" class="num">4</a> <a href="/24/Category/Display/001001003027?PageNumber=5" class="num">5</a> <a href="/24/Category/Display/001001003027?PageNumber=6" class="num">6</a> <a href="/24/Category/Display/001001003027?PageNumber=7" class="num">7</a> <a href="/24/Category/Display/001001003027?PageNumber=8" class="num">8</a> <a href="/24/Category/Display/001001003027?PageNumber=9" class="num">9</a> <a href="/24/Category/Display/001001003027?PageNumber=10" class="num">10</a> <a href="/24/Category/Display/001001003027?PageNumber=11" class="bgYUI next">다음</a> <a href="/24/Category/Display/001001003027?PageNumber=79" class="bgYUI end">끝</a>
//					href="/24/Category/Display/001001003027?PageNumber=79" class="bgYUI end">끝</a>
					String temp = line.split("다음</a> <a")[1];
					// 79" class="bgYUI end">끝</a>
					String temp2 = temp.split("PageNumber=")[1];
					last = temp2.split("\"")[0];
					href = temp.split("\\?")[0].split("\"")[1];
					map.put("last", last);
					map.put("href", href);
					break;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return map;
	}

}
