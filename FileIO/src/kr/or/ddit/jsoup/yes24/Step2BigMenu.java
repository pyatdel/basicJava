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
            String name = f.getName().replace(".html", "");
            File save = new File("yes24/step3/", name);
            if (!save.exists()) save.mkdirs();

            List<Map<String, String>> list = parser(f);
            for (Map<String, String> map : list) {
                String htmlName = map.get("name").replace("/", "_").replace(":", "") + ".html";
                String href = JsoupUtil.rootUrl + map.get("href");
                try {
                    File makeFile = new File(save + "/" + htmlName);
                    if (makeFile.exists()) continue;

                    // Jsoup을 사용하여 각 href에서 HTML을 가져옵니다.
                    Document doc = Jsoup.connect(href).get();

                    // UTF-8 meta 태그를 head에 추가합니다.
                    addMetaCharset(doc);

                    String html = doc.outerHtml();

                    // UTF-8로 파일을 저장합니다.
                    Files.write(Paths.get(save + "/" + htmlName), html.getBytes(StandardCharsets.UTF_8));
                    System.out.println("\tCREATE FILE : " + makeFile);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private void addMetaCharset(Document doc) {
        // head 요소를 찾습니다.
        Element head = doc.head();
        // 새로운 meta 요소를 생성합니다.
        Element meta = doc.createElement("meta");
        meta.attr("charset", "UTF-8");
        // meta 요소를 head의 맨 앞에 추가합니다.
        head.prependChild(meta);
    }

    public List<Map<String, String>> parser(File f) {
        List<Map<String, String>> list = new ArrayList<>();
        try {
            // UTF-8로 파일을 읽어옵니다.
            String html = Files.readString(Paths.get(f.toString()), StandardCharsets.UTF_8);
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
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
}
