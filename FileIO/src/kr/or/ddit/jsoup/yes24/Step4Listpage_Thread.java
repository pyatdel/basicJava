package kr.or.ddit.jsoup.yes24;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import kr.or.ddit.jsoup.JsoupUtil;

public class Step4Listpage_Thread {
	public static void main(String[] args) {
		Step4Listpage_Thread sl = new Step4Listpage_Thread();
		sl.process();
	}

	ExecutorService exe = Executors.newFixedThreadPool(1);
	
	public void process() {

		File root = new File("yes24/step4");

		boolean chk = false;
		for (File bigMenu : root.listFiles()) {
			System.out.println("대메뉴 : " + bigMenu);
			if(bigMenu.getName().contains("자기계발")) continue;
			if(bigMenu.getName().contains("자연과학")) continue;
			if(bigMenu.getName().contains("잡지")) continue;
			if(bigMenu.getName().contains("전집")) continue;
			if(bigMenu.getName().contains("중등참고서")) continue;
			for (File middle : bigMenu.listFiles()) {
				System.out.println("\t중메뉴 : " + middle);
//				if(middle.getName().contains("초등 중학년")) chk = true;
//				if(!chk) continue;
				for (File f : middle.listFiles()) {
					System.out.println("\t\t리스트 : " + f);
					String folder = f.getPath().replace("step4", "step5").replace(".html", "");
					File dir = new File(folder);
					if (!dir.exists())	dir.mkdirs();
//					else continue;

					List<Map<String, String>> list = parser(f);
					for (Map<String, String> map : list) {
						String name = map.get("name");
						name = changeName(name);
						String href = map.get("href");
						File file = new File(dir, name + ".html");
						if (file.length() !=0 && file.exists()) continue;
						exe.execute(new ThreadJob(href, file));
					}
//					try {
//						exe.wait();
//					} catch (Exception e) {
//						e.printStackTrace();
//					}
				}
			}
		}
	}
	
	public String changeName(String name) {
		String[] change = {"&amp;", ":", "?","/","\"","|","*"};
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
class ThreadJob extends Thread{
	
	String href;
	File file; 
	public ThreadJob(String href, File file) {
		this.href = href;
		this.file = file;
	}
	
	@Override
	public void run() {
		String url = JsoupUtil.rootUrl + href;
		try {
			String html ="";
			try {
				
				html = JsoupUtil.getHtml(url);
			} catch (Exception e) {
			}
			if(html.equals("")) {
				html = JsoupUtil.getHtml(url);
			}
			Files.write(Paths.get(file.getPath()), html.getBytes());
			System.out.println("\t\t\t 파일 : "+file);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}