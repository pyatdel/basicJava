package kr.or.ddit.book;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class ExcelWrite {
	public static void main(String[] args) {
		ExcelWrite ew = new ExcelWrite();
		ew.process();
	}
	
	BookService bookService = BookService.getInstacne();
	
	public void process() {
		// 디비에서 데이터 읽어서 엑셀파일 만들기

		Workbook workbook = new HSSFWorkbook();
		Sheet sheet = workbook.createSheet();
		int rowCnt = 0;
		List<BookVo> bookList = bookService.getList();
		for (BookVo bookVo : bookList) {
			Row row = sheet.createRow(rowCnt++);
//			title	writer	publisher	pub_date	review	regula_price	sale_price	image	content	book_index	isbn13	isbn10
			int i=0;
			Cell title = row.createCell(i++);
			title.setCellValue(bookVo.getTitle());
			Cell writer = row.createCell(i++);
			writer.setCellValue(bookVo.getWriter());
			Cell publisher = row.createCell(i++);
			publisher.setCellValue(bookVo.getPublisher());
			Cell pub_date = row.createCell(i++);
			pub_date.setCellValue(bookVo.getPub_date());
			Cell review = row.createCell(i++);
			review.setCellValue(bookVo.getReview());
			Cell regula_price = row.createCell(i++);
			regula_price.setCellValue(bookVo.getRegula_price());
			Cell sale_price = row.createCell(i++);
			sale_price.setCellValue(bookVo.getSale_price());
			Cell image = row.createCell(i++);
			image.setCellValue(bookVo.getImage());
			Cell content = row.createCell(i++);
			content.setCellValue(bookVo.getContent());
			Cell book_index = row.createCell(i++);
			book_index.setCellValue(bookVo.getBook_index());
			Cell isbn13 = row.createCell(i++);
			isbn13.setCellValue(bookVo.getIsbn13());
			Cell isbn10 = row.createCell(i++);
			isbn10.setCellValue(bookVo.getIsbn10());
		}
		File f = new File("excel/write.xls");
		try {
			FileOutputStream fos = new FileOutputStream(f);
			workbook.write(fos);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
