package kr.or.ddit.jsoup;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class JsoupUtil {
	
	public static String rootUrl = "https://www.yes24.com";
	
	public static String getHtml(String url) {
		Document doc = null;
		try {
			doc = Jsoup.connect(url).get();
//			Thread.sleep(1000);
			return doc.html();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "";
	}
	
}
