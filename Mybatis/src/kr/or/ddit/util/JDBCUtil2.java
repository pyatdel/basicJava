package kr.or.ddit.util;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class JDBCUtil2 {
	
	static Properties prop; 
	
	static{
		prop = new Properties();
		try {
			
			FileInputStream fis = new FileInputStream("res/db.properties");
			prop.load(fis);
			
			Class.forName(prop.getProperty("driver"));
			System.out.println("드라이버 로딩 성공");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection() {
		try {
			
			return DriverManager.getConnection(prop.getProperty("url"), 
											   prop.getProperty("user"),
											   prop.getProperty("password"));	
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
}
