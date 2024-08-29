package kr.or.ddit.jsoup.yes24;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class MyStep5Detail {
    public static void main(String[] args) {
        MyStep5Detail sd = new MyStep5Detail();
        sd.process();
    }

    public void process() {
        // 절대 경로 지정
        String basePath = "C:\\Users\\PC-04\\git\\basicJava\\FileIO\\yes24"; 
        File dir = new File(basePath + "\\step6");
        if (!dir.exists()) dir.mkdirs();

        File root = new File(basePath + "\\step5");
        // 디렉터리 존재 여부 확인
        if (!root.exists() || !root.isDirectory()) {
            System.out.println("디렉터리가 존재하지 않거나 디렉터리가 아닙니다: " + root.getPath());
            return;
        }

        for (File bigMenu : root.listFiles()) {
            if (!bigMenu.isDirectory()) continue; // 디렉터리가 아닌 경우 스킵

            File[] middleDirs = bigMenu.listFiles();
            if (middleDirs == null) continue; // Null 체크 추가

            for (File middle : middleDirs) {
                if (!middle.isDirectory()) continue; // 디렉터리가 아닌 경우 스킵

                Workbook workbook = new XSSFWorkbook();
                Sheet sheet = workbook.createSheet();
                int cnt = 0;

                File[] listDirs = middle.listFiles();
                if (listDirs == null) continue; // Null 체크 추가

                for (File list : listDirs) {
                    if (!list.isDirectory()) continue; // 디렉터리가 아닌 경우 스킵

                    File[] htmlFiles = list.listFiles();
                    if (htmlFiles == null) continue; // Null 체크 추가

                    for (File html : htmlFiles) { // row 한 개씩 생성
                        Row row = sheet.createRow(cnt++);
                        try {
                            String htmlStr = Files.readString(Paths.get(html.getPath()));
                            Map<String, String> map = parser(htmlStr);
                            int cell = 0;
                            Cell c1 = row.createCell(cell++);
                            c1.setCellValue(map.get("title"));
                            // 다른 셀 값들도 설정
                            // c1.setCellValue(map.get("다른필드"));
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
                File excel = new File(middle.getPath().replace("step5", "step6") + ".xlsx");
                try {
                    FileOutputStream fos = new FileOutputStream(excel);
                    workbook.write(fos);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public Map<String, String> parser(String html) {
        Document doc = Jsoup.parse(html);
        String title = doc.getElementsByClass("gd_name").get(0).text();
        String author = doc.getElementsByClass("gd_auth").get(0).text();
        String date = doc.getElementsByClass("gd_date").get(0).text();
        String review = doc.getElementsByClass("yes_b").get(0).text();
        String regula_price = doc.getElementsByClass("yes_m").get(0).text();
        String sale_price = doc.getElementsByClass("yes_m").get(1).text();
        String img = doc.getElementsByClass("gimg").get(0).attr("src");
        String content = doc.getElementsByClass("txtContentText").get(0).text();
        String index = doc.getElementsByClass("txtContentText").get(1).text();
        String isbn10 = doc.getElementsByClass("lastCol").get(4).text();
        String isbn13 = doc.getElementsByClass("lastCol").get(5).text();

        Map<String, String> map = new HashMap<>();
        map.put("title", title);
        map.put("author", author);
        map.put("date", date);
        map.put("review", review);
        map.put("regula_price", regula_price);
        map.put("sale_price", sale_price);
        map.put("img", img);
        map.put("content", content);
        map.put("index", index);
        map.put("isbn10", isbn10);
        map.put("isbn13", isbn13);
        
        return map;
    }
}
