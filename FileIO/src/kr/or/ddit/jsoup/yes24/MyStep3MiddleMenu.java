package kr.or.ddit.jsoup.yes24;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import kr.or.ddit.jsoup.JsoupUtil;

public class MyStep3MiddleMenu {
    public static void main(String[] args) {
        MyStep3MiddleMenu sm = new MyStep3MiddleMenu();
        sm.process();
    }

    public void process() {
        boolean chk = false;
        // "yes24/step3" 디렉토리를 rootDir로 설정
        File rootDir = new File("yes24/step3");
        // 각 대메뉴 폴더에 대해 반복
        for (File bigMenu : rootDir.listFiles()) {
            if (bigMenu.getName().contains("가정 살림")) {
                chk = true;
            }
            if (!chk) continue;

            System.out.println("FOLDER : " + bigMenu);
            // 각 HTML 파일에 대해 반복
            for (File f : bigMenu.listFiles()) {
                String folder = f.getPath().replace("step3", "step4").replace(".html", "").trim();
                
                // 페이지에서 필요한 정보를 추출하여 map에 저장
                Map<String, String> map = pageParser(f);
                String last = map.get("last");
                String href = map.get("href");

                if (last == null) continue;
                File dir = new File(folder);
                if (!dir.exists()) dir.mkdirs();

                int lastInt = Integer.parseInt(last);

                // 각 페이지에 대해 HTML 파일을 다운로드하고 저장
                for (int i = 1; i <= lastInt; i++) {
                    String url = JsoupUtil.rootUrl + href + "?PageNumber=" + i;
                    File file = new File(dir, "list_" + i + ".html");
                    try {
                        if (file.exists()) continue;
                        
                        // Jsoup을 사용하여 HTML 가져오기
                        String html = JsoupUtil.getHtml(url);
                        Document doc = Jsoup.parse(html);
                        
                        // UTF-8 메타 태그를 추가하는 메서드 호출
                        addMetaCharset(doc);
                        
                        // 수정된 HTML을 파일로 저장
                        Files.write(Paths.get(file.getPath()), doc.outerHtml().getBytes(StandardCharsets.UTF_8));
                        
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    // Document에 <meta charset="UTF-8"> 태그를 추가하는 메서드
    private void addMetaCharset(Document doc) {
        // head 요소를 찾음
        Element head = doc.head();
        // 새로운 meta 요소를 생성
        Element meta = doc.createElement("meta");
        meta.attr("charset", "UTF-8");
        // meta 요소를 head의 맨 앞에 추가
        head.prependChild(meta);
    }

    // HTML 파일을 파싱하여 마지막 페이지 번호와 href를 추출하는 메서드
    public Map<String, String> pageParser(File f) {
        Map<String, String> map = new HashMap<>();
        try {
            // 파일을 UTF-8로 읽어옴
            String html = Files.readString(Paths.get(f.getPath()), StandardCharsets.UTF_8);
            Document doc = Jsoup.parse(html);
            
            // "끝" 페이지 번호와 href 추출
            Element lastElement = doc.select("a.bgYUI.end").first();
            if (lastElement != null) {
                String href = lastElement.attr("href");
                String last = href.split("PageNumber=")[1];
                href = href.split("\\?")[0];
                map.put("last", last);
                map.put("href", href);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return map;
    }
}
