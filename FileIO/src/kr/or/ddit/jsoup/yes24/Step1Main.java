package kr.or.ddit.jsoup.yes24;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jsoup.Jsoup;

import kr.or.ddit.jsoup.JsoupUtil;

public class Step1Main {
	public static void main(String[] args) {
		Step1Main sm = new Step1Main();
		sm.process();
	}
	
	public void process() {
		String html = "";
		File main = new File("yes24/step1/main.html");
		if(main.exists()) {
			try {
				html = Files.readString(Paths.get(main.toString()));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		else {
			String url = "https://www.yes24.com/Mall/Main/Book/001?CategoryNumber=001";
			html = JsoupUtil.getHtml(url);
			try {
				Files.write(Paths.get(main.toString()), html.getBytes());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		File dir = new File("yes24/step2");
		if(!dir.exists()) dir.mkdirs();
		
		List<Map<String, String>> list = parser(html);
		for (Map<String, String> map : list) {
			String name = map.get("name").replace("/", "_");
			String href = map.get("href");
			File f = new File(dir, name+".html");
			String step2Html = JsoupUtil.getHtml(href);
			try {
				Files.write(Paths.get(f.toString()), step2Html.getBytes());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public List<Map<String , String>> parser(String html){
		List<Map<String, String >> list = new ArrayList();
		String[] lines = html.split("\n");
		for (String line : lines) {
			//cate2d
			if(line.contains("<li class=\"cate2d")) {
				String temp = line.split("href=\"")[1];
				String href = temp.split("\"")[0];
				
				String temp2 = line.split("<em class=\"txt\">")[1];
				String name = temp2.split("</em>")[0];
				Map<String, String> map = new HashMap();
				map.put("href", href);
				map.put("name", name);
				list.add(map);
			}
		}
		return list;
	}
	
}
