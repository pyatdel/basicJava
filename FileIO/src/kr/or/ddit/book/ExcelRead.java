package kr.or.ddit.book;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import kr.or.ddit.excel.ExcelUtil;

public class ExcelRead {
	public static void main(String[] args) {
		// book.xlsx 파일 읽어서 출력 할것.
		ExcelRead er = new ExcelRead();
		er.process();
	}
	
	BookService bookService = BookService.getInstacne();
	
	public void process() {
		File f = new File("excel/book.xlsx");
		try {
			FileInputStream fis = new FileInputStream(f);
			Workbook workbook = new XSSFWorkbook(fis);
			
			Sheet sheet = workbook.getSheetAt(0);
			
			int endRow = sheet.getLastRowNum();
			for(int i=1; i<=endRow; i++) {
				Row row = sheet.getRow(i);
				int endCell = row.getLastCellNum();
				List<Object> param = new ArrayList();
				for(int j =0; j<12; j++) {
					Cell cell = row.getCell(j);
					Object value = ExcelUtil.getCellData(cell);
					param.add(value);
					System.out.print(value+"\t");
				}
				bookService.insertBook(param);
				System.out.println();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
