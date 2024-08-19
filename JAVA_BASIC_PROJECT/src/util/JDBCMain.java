package util;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class JDBCMain {
	public static void main(String[] args) {
		JDBCUtil jdbc = JDBCUtil.getInstance();	// singleton 이용
		
		//
//		String sql = "SELECT * \r\n"
//					+ "FROM MEMBER\r\n"
//					+ "WHERE"
//					+ " ID = 'a001'\r\n"
//					+ "AND PW = 'java'";
//		
//		Map<String, Object> map = jdbc.selectOne(sql);
//		System.out.println(map);

		
//		String sql = "SELECT * \r\n"
//				+ "FROM MEMBER\r\n"
//				+ "WHERE"
//				+ " ID = ? \r\n"
//				+ "AND PW = ?";
//		// ? : 데이터를 동적으로 입력 but, '' 사이에 넣으면 안됨
//		
//		List<Object> param = new ArrayList();
//		String id = ScanUtil.nextLine("아이디 : ");
//		String pw = ScanUtil.nextLine("패스워드 : ");
//		param.add(id);
//		param.add(pw);
//		
//	
//	Map<String, Object> map = jdbc.selectOne(sql, param);
//	System.out.println(map);
		
//		String sql = "SELECT * \r\n"
//				+ "FROM MEMBER\r\n"
//				+ "WHERE DELYN = 'N'";
//
//	List<Map<String, Object>> list = jdbc.selectList(sql);
//		for(Map<String, Object> map : list) {
//			System.out.println(map);
//		}
		
		String sql = "SELECT * \r\n"
				+ "FROM MEMBER\r\n"
				+ "WHERE DELYN = 'N'";

	List<Map<String, Object>> list = jdbc.selectList(sql);
		for(Map<String, Object> map : list) {
			System.out.println(map);
		}
	
	}

}
