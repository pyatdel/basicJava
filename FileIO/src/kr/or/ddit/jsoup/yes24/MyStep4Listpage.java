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

public class MyStep4Listpage {
    public static void main(String[] args) {
        MyStep4Listpage sl = new MyStep4Listpage();
        sl.process();
    }

    public void process() {
        File root = new File("yes24/step4");

        File[] bigMenus = root.listFiles();
        if (bigMenus == null) {
            System.err.println("Error: 'yes24/step4' directory does not exist or is not a directory.");
            return;
        }

        for (File bigMenu : bigMenus) {
            System.out.println("대메뉴 : " + bigMenu);

            File[] middleFiles = bigMenu.listFiles();
            if (middleFiles == null) {
                System.err.println("Error: '" + bigMenu.getPath() + "' is not a directory or is empty.");
                continue;
            }

            for (File middle : middleFiles) {
                System.out.println("\t중메뉴 : " + middle);

                File[] listFiles = middle.listFiles();
                if (listFiles == null) {
                    System.err.println("Error: '" + middle.getPath() + "' is not a directory or is empty.");
                    continue;
                }

                for (File f : listFiles) {
                    System.out.println("\t\t리스트 : " + f);
                    String folder = f.getPath().replace("step4", "step5").replace(".html", "");
                    File dir = new File(folder);
                    if (!dir.exists()) dir.mkdirs();

                    List<Map<String, String>> list = parser(f);
                    for (Map<String, String> map : list) {
                        String name = sanitizeFileName(map.get("name"));

                        String href = map.get("href");
                        File file = new File(dir, name + ".html");
                        if (file.exists()) continue;

                        String url = JsoupUtil.rootUrl + href;
                        String html = JsoupUtil.getHtml(url);
                        try {
                            // UTF-8로 파일을 저장합니다.
                            Files.write(Paths.get(file.getPath()), html.getBytes(StandardCharsets.UTF_8));
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }

    public String sanitizeFileName(String name) {
        if (name == null || name.isEmpty()) {
            name = "untitled";
        }
        return name.replace("&amp;", "&").replace(":", "").replace("?", "").replace("\\", "")
                   .replace("/", "").replace("*", "").replace("\"", "").replace("<", "")
                   .replace(">", "").replace("|", "").trim();
    }

    public List<Map<String, String>> parser(File f) {
        List<Map<String, String>> list = new ArrayList<>();
        try {
            // UTF-8로 파일을 읽어옴
            String html = Files.readString(Paths.get(f.getPath()), StandardCharsets.UTF_8);
            Document doc = Jsoup.parse(html);

            // "gd_nameF" 클래스를 가진 요소를 선택 (이 부분을 정확한 CSS 셀렉터로 변경할 수 있음)
            Elements elements = doc.select(".gd_nameF a");

            for (Element element : elements) {
                String href = element.attr("href");
                String name = element.text();

                Map<String, String> map = new HashMap<>();
                map.put("name", name);
                map.put("href", href);
                list.add(map);
            }

            // 파싱된 데이터 출력 (디버깅 용도)
            for (Map<String, String> map : list) {
                System.out.println("Parsed data: " + map);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
}
