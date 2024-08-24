package kr.or.ddit.excel;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class MyE2ExcelRead2 {
    public static void main(String[] args) {
        try {
            File file = new File("excel/file1.xlsx");
            FileInputStream fis = new FileInputStream(file);
            Workbook workbook = null;

            if (file.getName().endsWith(".xls")) {
                workbook = new HSSFWorkbook(fis);
            } else if (file.getName().endsWith(".xlsx")) {
                workbook = new XSSFWorkbook(fis);
            }

            Sheet sheet = workbook.getSheetAt(0);
            int startRow = sheet.getFirstRowNum();
            int endRow = sheet.getLastRowNum();

            for (int i = startRow; i <= endRow; i++) {
                Row row = sheet.getRow(i);
                if (row == null) continue;  // 빈 행 처리

                int startCell = row.getFirstCellNum();
                int endCell = row.getLastCellNum();

                for (int j = startCell; j < endCell; j++) {  // endCell은 Exclusive 범위
                    Cell cell = row.getCell(j);
                    Object data = ExcelUtil.getCellData(cell);
                    System.out.print(data + "\t");
                }
                System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
