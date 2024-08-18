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
			if(bigMenu.getName().contains("가정 살림")) {
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
	    Map<String, String> map = new HashMap<>();
	    try {
	        String html = Files.readString(Paths.get(f.getPath()));
	        String[] lines = html.split("\n");
	        String last = "";
	        String href = "";
	        for (String line : lines) {
	            if (line.contains("bgYUI end")) {
	                String[] parts = line.split("다음</a> <a");
	                if (parts.length > 1) {  // parts[1]이 있는지 확인
	                    String temp = parts[1];
	                    // 79" class="bgYUI end">끝</a>
	                    String[] tempParts = temp.split("PageNumber=");
	                    if (tempParts.length > 1) {  // tempParts[1]이 있는지 확인
	                        String temp2 = tempParts[1];
	                        last = temp2.split("\"")[0];
	                        href = temp.split("\\?")[0].split("\"")[1];
	                        map.put("last", last);
	                        map.put("href", href);
	                    }
	                }
	                break;
	            }
	        }
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	    return map;
	}
}
