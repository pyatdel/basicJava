package kr.or.ddit.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCUtil {
	
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("클래스 로딩 성공");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getConection() {
		try {
			// 127.0.0.1 , 0:0:0:0:0:1, localhost
			return DriverManager.getConnection("jdbc:oracle:thin:@localhost:8521/FREEPDB1", "JAVA_", "java"); 
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
	
	
}
