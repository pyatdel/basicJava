package kr.or.ddit.homework.home14;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
//import java.util.Scanner;

import kr.or.ddit.util.ScanUtil;

public class DBMain {
	Connection conn; 
	Statement  stmt;
	ResultSet  rs;
	
	public static void main(String[] args) {
		DBMain db = new DBMain();
		db.selectAll();
	}

	
	public void selectAll() {
		try {
			conn = DBconn.getConnection();
			stmt = conn.createStatement();
			String sql = "SELECT * FROM MEMBER";	
			rs = stmt.executeQuery(sql);
			
			// 취미랑 직업 중에 선택 하고 
			// 취미 선택후  -> 바둑 입력하면 바둑 취미인 사람만 출력 할것.
			// 직업 선택후  -> 주부 입력하면 주부 직업인 사람만 출력 할것.
			System.out.println("1. 취미");
			System.out.println("2. 직업");
			int sel = ScanUtil.nextInt("선택 :");
			String search ="";
			Member mem = new Member();
			if(sel == 1) {
				search = ScanUtil.nextLine("검색");
			}
			if(sel ==2) {
				search = ScanUtil.nextLine("검색");
			}
			
			while(rs.next()) {
//				System.out.println("123");
				String id = rs.getString("mem_id");
				String name = rs.getString("mem_name");
				String like = rs.getString("mem_like");
				String job = rs.getString("mem_job");
				
				if(sel == 1) {
					if(!like.equals(search)) continue; 
				}
				if(sel == 2) {
					if(!job.equals(search)) continue; 
				}
				System.out.println(id+"\t"+name+"\t"+like+"\t"+job);
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
