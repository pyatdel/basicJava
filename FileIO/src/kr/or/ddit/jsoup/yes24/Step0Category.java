package kr.or.ddit.jsoup.yes24;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class Step0Category {
	public static void main(String[] args) throws Exception {
		File f = new File("yes24/step1/main.html");
		
		String str = Files.readString(Paths.get(f.getPath()));
		
		String[] lines = str.split("\n");
		
		boolean chk = false;
		String big = "";
		
		for (String line : lines) {
			if(line.contains("<ul id=\"mCateLi\" class=\"cate2depth \">")) {
				chk = true;
			}
			if(chk) {
				if(line.contains("<script type=\"text/javascript\">")) chk = false;
				if(line.contains("<li class=\"cate2d")) {
					String temp = line.split("href=\"")[1];
					String href = temp.split("\"")[0];
					String code = href.split("Display/")[1];
					
					String temp2 = line.split("<em class=\"txt\">")[1];
					String name = temp2.split("</em>")[0];
					big = code;
//					System.out.println(code+"\t"+name+"\t"+"001");
				}else {
					if(line.contains("<a href")) {
						String temp = line.split("href=\"")[1];
						String href = temp.split("\"")[0];
						String code = href.split("Display/")[1];
//						System.out.println(line);
//						System.out.println(code);
//						
						String temp2 = line.split("</a>")[0];
						String name = temp2.split("\">")[1];
						System.out.println(code+"\t"+name+"\t"+big);
						
					}
					
				}
				
			}
		}
		
		
	}
}
