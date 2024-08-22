package kr.or.ddit.jsoup.yes24;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class HtmlTester {
    public static void main(String[] args) {
        String url = "https://www.yes24.com/Mall/Main/Book/001?CategoryNumber=001";
        try {
            Document doc = Jsoup.connect(url).get();
            // 출력 HTML 내용 확인
            System.out.println(doc.html());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
