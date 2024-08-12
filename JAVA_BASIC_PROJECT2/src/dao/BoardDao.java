package dao;

import java.util.List;
import java.util.Map;

import util.JDBCUtil;

public class BoardDao {
	private static BoardDao instance;

	private BoardDao() {

	}

	public static BoardDao getInstacne() {
		if (instance == null) {
			instance = new BoardDao();
		}
		return instance;
	}

	JDBCUtil jdbc = JDBCUtil.getInstance();
	
	public List<Map<String, Object>> codeList() {
		String sql = "SELECT * FROM BOARD_CODE";
		return jdbc.selectList(sql); 
	}
	
	public List<Map<String, Object>> boardList(List<Object> param){
		String sql =  "SELECT BOARD_NO, TITLE, CONTENT, B.REG_DATE, NAME, CNT\r\n"
					+ "FROM  BOARD B, MEMBER M \r\n"
					+ "WHERE B.MEM_NO = M.MEM_NO\r\n"
					+ "AND CODE_NO = ?\r\n"
					+ "AND STATE = 1\r\n"
					+ "ORDER BY BOARD_NO DESC";
		return jdbc.selectList(sql, param);
	}
	
	public void boardInsert(List<Object> param) {
		String sql =  "  INSERT INTO BOARD \r\n"
					+ "  VALUES((SELECT NVL(MAX(BOARD_NO),0) +1 FROM BOARD),"
					+ "  ?, ?, SYSDATE , ? , 0, 1 ,? ) ";
		jdbc.update(sql, param);
	}
	
	public Map<String, Object> boardDetail(List<Object> param){
		String sql =  "SELECT * FROM\r\n"
					+ "(SELECT BOARD_NO, TITLE, CONTENT, B.REG_DATE, NAME, CNT,\r\n"
					+ "           LAG(BOARD_NO) OVER(ORDER BY BOARD_NO) PREV ,\r\n"
					+ "           LEAD(BOARD_NO) OVER(ORDER BY BOARD_NO) NEXT\r\n"
					+ "FROM  BOARD B, MEMBER M \r\n"
					+ "WHERE B.MEM_NO = M.MEM_NO\r\n"
					+ "AND CODE_NO = ?)\r\n"
					+ "WHERE BOARD_NO = ?";
		return jdbc.selectOne(sql, param);
	}
	
	public void updateCnt(List<Object> param) {
		String sql =  "UPDATE BOARD \r\n"
					+ "SET CNT = CNT+1\r\n"
					+ "WHERE BOARD_NO = ?";
		jdbc.update(sql, param);
	}

	public void boardUpdate(List<Object> param) {
		String sql =  "UPDATE BOARD\r\n"
					+ "SET TITLE = ? , \r\n"
					+ "       CONTENT = ? \r\n"
					+ "WHERE BOARD_NO =?";
		jdbc.update(sql, param);
	}

	public void boardDelete(List<Object> param) {
		String sql =  "UPDATE BOARD \r\n"
					+ "SET STATE = 3\r\n"
					+ "WHERE BOARD_NO = ?";
		jdbc.update(sql, param);
	}
	
	
}