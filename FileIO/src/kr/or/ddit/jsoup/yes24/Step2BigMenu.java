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

public class Step2BigMenu {
	public static void main(String[] args) {
		Step2BigMenu sb = new Step2BigMenu();
		sb.process();
	}
	public void process() {
		
		File dir = new File("yes24/step2");
		for (File f : dir.listFiles()) {
			System.out.println(f);
			// f 이름 출력 .html 제거 
			String name = f.getName().replace(".html","");
			File save = new File("yes24/step3/",name);
			if(!save.exists()) save.mkdirs();
			List<Map<String , String>> list = parser(f);
			for (Map<String, String> map : list) {
				String htmlName = map.get("name").replace("/", "_").replace(":","")+".html";
				String href = JsoupUtil.rootUrl+map.get("href");
				try {
					File makeFile = new File(save+"/"+htmlName);
					if(makeFile.exists()) continue;
					String html = JsoupUtil.getHtml(href);
					Files.write(Paths.get(save+"/"+htmlName), html.getBytes());
					System.out.println("\tCREATE FILE : "+makeFile);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		
		
	}
	
	
	public List<Map<String, String>> parser(File f){
		List<Map<String, String>> list = new ArrayList();
		try {
			String html = Files.readString(Paths.get(f.toString()));
			String[] lines = html.split("\n");
			boolean chk1 = false;
			boolean chk2 = false;
			for (String line : lines) {
				//<div id="cateSubListWrap" class="cateSubListArea clearfix">
				if(line.contains("<div id=\"cateSubListWrap\" class=\"cateSubListArea clearfix\">")) {
					chk1 = true;
				}
				if(line.contains("</div>")) chk1 = false;
				if(chk1) {
					if(line.contains("<dt>")) {
						chk2 = true;
					}
					if(chk2) {
						if(line.contains("<a")) {
							// <a href="/24/Category/Display/001001001011">육아</a>
							String temp = line.split("<a href=\"")[1];
							String href = temp.split("\"")[0];
							
							String temp2 = line.split(">")[1];
							String name = temp2.split("<")[0];
							Map<String, String> map = new HashMap();
							map.put("name", name);
							map.put("href", href);
							list.add(map);
						}
						if(line.contains("</dt>")) chk2 = false;
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	
	
	
	
	
}
