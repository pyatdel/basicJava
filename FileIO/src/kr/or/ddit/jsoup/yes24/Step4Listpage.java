package kr.or.ddit.jsoup.yes24;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import kr.or.ddit.jsoup.JsoupUtil;

public class Step4Listpage {
	public static void main(String[] args) {
		Step4Listpage sl = new Step4Listpage();
		sl.process();
	}

	public void process() {

		File root = new File("yes24/step4");

		for (File bigMenu : root.listFiles()) {
			System.out.println("대메뉴 : " + bigMenu);
			for (File middle : bigMenu.listFiles()) {
				System.out.println("\t중메뉴 : " + middle);
				for (File f : middle.listFiles()) {
					System.out.println("\t\t리스트 : " + f);
					String folder = f.getPath().replace("step4", "step5").replace(".html", "");
					File dir = new File(folder);
					if (!dir.exists())
						dir.mkdirs();

					List<Map<String, String>> list = parser(f);
					for (Map<String, String> map : list) {
						String name = map.get("name");
						name = name.replace("&amp;", "&").replace(":", "").replace("?", "").replace("\\", "")
					               .replace("/", "").replace("*", "").replace("\"", "").replace("<", "")
					               .replace(">", "").replace("|", "");
//						name = changeName(name);
						
						
						String href = map.get("href");
						File file = new File(dir, name + ".html");
						if (file.exists()) continue;
						String url = JsoupUtil.rootUrl + href;
						String html = JsoupUtil.getHtml(url);
						try {
							Files.write(Paths.get(file.getPath()), html.getBytes());
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
				}
			}
		}
	}
	
	public String changeName(String name) {
		String[] change = {"&amp;", ":", "?", "/"};
		for(String c : change) name = name.replace(c, "");
		return name;
	}

	public List<Map<String, String>> parser(File f) {
		List<Map<String, String>> list = new ArrayList();
		try {
			String html = Files.readString(Paths.get(f.getPath()));
			if ((html.equals(""))) {
				System.out.println("html 수집 에러");
			}
			String[] lines = html.split("\n");
			for (String line : lines) {
				//
				if (line.contains("gd_nameF")) {
//			        <span class="gd_nameF"></span> <a href="/Product/Goods/76899643">로지컬 씽킹
					String temp = line.split("</a>")[0];
					String href = temp.split("href=\"")[1].split("\"")[0];
					String name = temp.split(">")[3];
					Map<String, String> map = new HashMap();
					map.put("name", name);
					map.put("href", href);
					list.add(map);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return list;
	}

}
