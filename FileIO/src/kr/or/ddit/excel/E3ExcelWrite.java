package kr.or.ddit.excel;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class E3ExcelWrite {
	public static void main(String[] args) {
		E3ExcelWrite ew = new E3ExcelWrite();
		ew.process();
	}
	
	public void process() {
		
		File f = new File("write.xlsx");
		try {
			Workbook workbook = new XSSFWorkbook();
			Sheet sheet = workbook.createSheet();
			
			int rowCnt = 0;
			Row row1 = sheet.createRow(rowCnt++);
			
			Cell cell11 = row1.createCell(0);
			cell11.setCellValue("이름");
			Cell cell12 = row1.createCell(1);
			cell12.setCellValue("나이");
			
			Row row2 = sheet.createRow(rowCnt++);
			Cell cell21 = row2.createCell(0);
			cell21.setCellValue("김정민");
			Cell cell22 = row2.createCell(1);
			cell22.setCellValue(20);
			
			Row row3 = sheet.createRow(rowCnt++);
			Cell cell31 = row3.createCell(0);
			cell31.setCellValue("박진우");
			Cell cell32 = row3.createCell(1);
			cell32.setCellValue(20);
			
			FileOutputStream fos = new FileOutputStream(f);
			workbook.write(fos);
			fos.close();
			workbook.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
