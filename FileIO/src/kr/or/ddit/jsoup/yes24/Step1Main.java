package kr.or.ddit.jsoup.yes24;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Step1Main {
    public static void main(String[] args) {
        Step1Main sm = new Step1Main();
        sm.process();
    }

    public void process() {
        String html = "";
        File main = new File("yes24/step1/main.html");
        if (main.exists()) {
            try {
                // UTF-8로 파일을 읽어옵니다.
                html = Files.readString(Paths.get(main.toString()), StandardCharsets.UTF_8);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            String url = "https://www.yes24.com/Mall/Main/Book/001?CategoryNumber=001";
            try {
                // Jsoup을 사용하여 URL에서 HTML을 가져옵니다.
                Document doc = Jsoup.connect(url).get();
                // Add UTF-8 meta tag to the head
                addMetaCharset(doc);
                // HTML 내용을 올바르게 가져오기
                html = doc.outerHtml();
                // UTF-8로 파일을 저장합니다.
                Files.write(Paths.get(main.toString()), html.getBytes(StandardCharsets.UTF_8));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        File dir = new File("yes24/step2");
        if (!dir.exists()) dir.mkdirs();

        List<Map<String, String>> list = parser(html);
        for (Map<String, String> map : list) {
            String name = map.get("name").replace("/", "_");
            String href = map.get("href");
            File f = new File(dir, name + ".html");
            try {
                // Jsoup을 사용하여 각 href에서 HTML을 가져옵니다.
                Document doc = Jsoup.connect(href).get();
                // Add UTF-8 meta tag to the head
                addMetaCharset(doc);
                String step2Html = doc.outerHtml();
                // UTF-8로 파일을 저장합니다.
                Files.write(Paths.get(f.toString()), step2Html.getBytes(StandardCharsets.UTF_8));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void addMetaCharset(Document doc) {
        // Find the head element
        Element head = doc.head();
        // Create a new meta element
        Element meta = doc.createElement("meta");
        meta.attr("charset", "UTF-8");
        // Prepend the meta element to the head
        head.prependChild(meta);
    }

    public List<Map<String, String>> parser(String html) {
        List<Map<String, String>> list = new ArrayList<>();
        Document doc = Jsoup.parse(html);
        Elements elements = doc.select("li.cate2d a");

        for (Element element : elements) {
            String href = element.attr("href");
            String name = element.select("em.txt").text();
            Map<String, String> map = new HashMap<>();
            map.put("href", href);
            map.put("name", name);
            list.add(map);
        }

        return list;
    }
}
