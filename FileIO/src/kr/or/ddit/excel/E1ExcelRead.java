package kr.or.ddit.excel;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;


public class E1ExcelRead {
	public static void main(String[] args) {
		E1ExcelRead er = new E1ExcelRead();
		er.process();
	}

	// 123
	private void process() {
		File file = new File("excel/file1.xls");
		try {
			FileInputStream fis = new FileInputStream(file);
//			엑셀파일 객체
			Workbook workBook = new HSSFWorkbook(fis);
//			sheet
//			Sheet sheet = workBook.getSheet(0);
			Sheet sheet = workBook.getSheet("Sheet1");
			
			// row 한 줄
//			Row row = sheet.getRow(0);
//			// cell 엑셀에 한 칸을 의미
//			Cell cell1 = row.getCell(0);
//			System.out.print(cell1.getNumbericCellValue()+"\t");
//			Cell cell2 = row.getCell(1);
//			System.out.println(cell2.getStringCellValue()+"\t");
//			Cell cell3 = row.getCell(2);
//			System.out.print(cell3.getStringCellValue());
//			
//			Row row2 = sheet.getRow(1);
//			// cell 엑셀에 한 칸을 의미
//			Cell cell21 = row2.getCell(0);
//			System.out.print(cell21.getNumericCellValue()+"\t");
//			Cell cell22 = row2.getCell(1);
//			System.out.print(cell22.getStringCellValue()+"\t");
//			Cell cell23 = row2.getCell(2);
//			System.out.println(cell23.getStringCellValue());
			
			int max = sheet.getLastRowNum();
			for(int i=0; i<=max; i++) {
				Row row = sheet.getRow(i);
				Cell cell1 = row.getCell(0);
				System.out.print(cell1.getNumericCellValue()+"\t");
				Cell cell2 = row.getCell(1);
				System.out.print(cell2.getStringCellValue()+"\t");
				Cell cell3 = row.getCell(2);
				System.out.println(cell3.getStringCellValue());
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
