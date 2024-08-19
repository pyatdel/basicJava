package kr.or.ddit.excel;

import java.text.SimpleDateFormat;

import org.apache.poi.hssf.usermodel.HSSFDataFormat;
import org.apache.poi.hssf.usermodel.HSSFDataValidation;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;

public class ExcelUtil {
	public static Object getCellData(Cell cell) {
		String str = "";
		if(cell == null) return "";
		
		CellType type = cell.getCellType();
		if(type == CellType.STRING) {
			return cell.getStringCellValue();
		}
		else if(type == CellType.NUMERIC) {
			// 날짜 처리 
			if(DateUtil.isCellDateFormatted(cell)) {
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
				String result = sdf.format(cell.getDateCellValue());
				return result+"";
			}
			// 
			double val = cell.getNumericCellValue();
			if(Math.rint(val) == val) return (long)val;
			else return val;
		}
		else if(type == CellType._NONE) {
			return cell.getStringCellValue();
		}
		else if(type == CellType.BLANK) {
			return cell.getStringCellValue();
		}
		else if(type == CellType.BOOLEAN) {
			return cell.getBooleanCellValue()+"";
		}
		else if(type == CellType.ERROR) {
			return cell.getErrorCellValue()+"";
		}
		else if(type == CellType.FORMULA) {
			return cell.getCellFormula();
		}
		return str;
	}
	
	
}
