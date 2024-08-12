package kr.or.ddit.homework.home14;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconn {
	
	private static Connection conn ;
	
	public static Connection getConnection() {
		// xe :  서비스 이름 / 
		String url  = "jdbc:oracle:thin:@localhost:8521/FREEPDB1";
		String user = "pc18";
		String pwd  = "java";
		
		if(conn == null) {
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				conn = DriverManager.getConnection(url, user, pwd);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return conn;
	}
	
}
