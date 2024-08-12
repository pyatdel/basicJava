package kr.or.ddit.jsoup;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class JsoupTest {
	public static void main(String[] args) {
		String url = "https://www.yes24.com/Mall/Main/Book/001?CategoryNumber=001";
		
		Document doc = null;
		try {
			doc = Jsoup.connect(url).get();
			System.out.println(doc.html());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
