package kr.or.ddit.excel;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class E2ExcelRead {
	public static void main(String[] args) {
		
		try {
			File file = new File("excel/file1.xlsx");
			FileInputStream fis = new FileInputStream(file);
			// 2003 년 이전 버전  HSSFWorkBook
			//         이후 버전  XSSFWrokBook  사용
			Workbook workbook = null;
			
			if(file.getName().endsWith(".xls"))  workbook = new HSSFWorkbook(fis);
			if(file.getName().endsWith(".xlsx")) workbook = new XSSFWorkbook(fis);
			// 다형성
			Sheet sheet = workbook.getSheetAt(0);
			
			int startRow = sheet.getFirstRowNum();
			int endRow = sheet.getLastRowNum();
			for(int i=startRow; i<=endRow ; i++) {
				Row row = sheet.getRow(i);
				int startCell = row.getFirstCellNum();
				int endCell = row.getLastCellNum();
				for(int j=startCell; j<=endCell; j++) {
					Cell cell = row.getCell(j);
//					String data = ExcelUtil.getCellData(cell);
//					System.out.print(data+"\t");
				}
				System.out.println();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
