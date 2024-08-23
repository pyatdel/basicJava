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

public class Step5Detail {
	public static void main(String[] args) {
		Step5Detail sd = new Step5Detail();
		sd.process();
	}

	public void process() {
		File dir = new File("step6");
		if(!dir.exists()) dir.mkdirs();
		
		File root = new File("step5");
		for(File bigMenu : root.listFiles()) {
			for(File middle : bigMenu.listFiles()) {
				Workbook workbook = new XSSFWorkbook();
				Sheet sheet = workbook.createSheet();
				int cnt = 0;
				for(File list : middle.listFiles()) {
					for(File html : list.listFiles()) { // row 한 개씩 생성
						Row row = sheet.createRow(cnt++);
						try {
							String htmlStr = Files.readString(Paths.get(html.getPath()));
							Map<String, String> map = parser(htmlStr);
							int cell = 0;
							Cell c1 = row.createCell(cnt);
							c1.setCellValue(map.get(cell++));
							c1.setCellValue(map.get("title"));
							c1.setCellValue(map.get(cell++));
							c1.setCellValue(map.get("title"));
							c1.setCellValue(map.get("title"));
							c1.setCellValue(map.get("title"));
							c1.setCellValue(map.get("title"));
							c1.setCellValue(map.get("title"));
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
				}
				File excel = new File(middle.getPath().replace("step5","step6")+"xlsx");
				try {
					FileOutputStream fos = new FileOutputStream(excel);
					workbook.write(fos);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public Map<String, String> parser(String html){
//		작성해보기
//		Document doc = Jsoup.parse(html);
//		String title = doc.getElementsByClass("gd_name").get(0).text();
//		String authur = doc.getElementsByClass("gd_auth").get(0).text();
//		String date = doc.getElementsByClass("gd_date").get(0).text();
//		String review = doc.getElementsByClass("yes_b").get(0).text();
//		String regula_price = doc.getElementsByClass("yes_m").get(0).text();
//		String sale_price = doc.getElementsByClass("yes_m").get(1).text();
//		String img = doc.getElementsByClass("gimg").get(0).attr("src");
//		String content = doc.getElementsByClass("txtContentText").get(0).text();
//		String index = doc.getElementsByClass("txtContentText").get(1).text();
//		String isbn10 = doc.getElementsByClass("lastCol").get(4).text();
//		String isbn13 = doc.getElementsByClass("lastCol").get(5).text();
//		System.out.println(title);
//		System.out.println(authur);
//		System.out.println(date);
//		System.out.println(review);
//		System.out.println(regula_price);
//		System.out.println(sale_price);
//		System.out.println(img);
//		System.out.println(content);
//		System.out.println(index);
//		System.out.println(isbn10);
//		System.out.println(isbn13);
		
		
		Document doc = Jsoup.parse(html);
		String title = doc.getElementsByClass("gd_name").get(0).text();
		String authur = doc.getElementsByClass("gd_auth").get(0).text();
		String date = doc.getElementsByClass("gd_date").get(0).text();
		String review = doc.getElementsByClass("yes_b").get(0).text();
		String regula_price = doc.getElementsByClass("yes_m").get(0).text();
		String sale_price = doc.getElementsByClass("yes_m").get(1).text();
		String img = doc.getElementsByClass("gimg").get(0).attr("src");
		String content = doc.getElementsByClass("txtContentText").get(0).text();
		String index = doc.getElementsByClass("txtContentText").get(1).text();
		String isbn10 = doc.getElementsByClass("lastCol").get(4).text();
		String isbn13 = doc.getElementsByClass("lastCol").get(5).text();
		System.out.println(title);
		System.out.println(authur);
		System.out.println(date);
		System.out.println(review);
		System.out.println(regula_price);
		System.out.println(sale_price);
		System.out.println(img);
		System.out.println(content);
		System.out.println(index);
		System.out.println(isbn10);
		System.out.println(isbn13);
		
		
		Map<String, String> map = new HashMap(); // 채워넣어야 하는 부분
		return map;
	}
}
