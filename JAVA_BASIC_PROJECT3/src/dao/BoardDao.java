package dao;

import java.util.List;
import java.util.Map;

import util.JDBCUtil;
import vo.BoardVo;

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
	
	public List<Map<String, Object>> codeList(){
		String sql = "SELECT * FROM BOARD_CODE";
		return jdbc.selectList(sql);
	}
	
	public List<Map<String, Object>> boardList(List<Object> param) {
		String sql =  "SELECT *\r\n"
					+ "FROM   (SELECT ROWNUM RN, BOARD_NO, TITLE, CONTENT, B.REG_DATE, NAME, CNT \r\n"
					+ "            FROM BOARD B, MEMBER M \r\n"
					+ "            WHERE  B.MEM_NO = M.MEM_NO\r\n"
					+ "            AND CODE_NO = ?\r\n"
					+ "            AND STATE = 1\r\n"
					+ "            ORDER BY BOARD_NO DESC)\r\n"
					+ "WHERE RN>=? AND RN<=?";
		return jdbc.selectList(sql, param);
	}
	
	public List<BoardVo> boardList2(List<Object> param) {
		String sql =  "SELECT *\r\n"
					+ "FROM   (SELECT ROWNUM RN, BOARD_NO, TITLE, CONTENT, TO_CHAR(B.REG_DATE,'YYYY.MM.DD') REG_DATE, NAME, CNT \r\n"
					+ "            FROM BOARD B, MEMBER M \r\n"
					+ "            WHERE  B.MEM_NO = M.MEM_NO\r\n"
					+ "            AND CODE_NO = ?\r\n"
					+ "            AND STATE = 1\r\n"
					+ "            ORDER BY BOARD_NO DESC)\r\n"
					+ "WHERE RN>=? AND RN<=?";
		return jdbc.selectList(sql, param, BoardVo.class);
	}
	
	
	public Map<String, Object> lastNum(List<Object> param){
		String sql =  "SELECT CEIL(COUNT(*)/?) LASTNUM \r\n"
					+ "FROM BOARD B, MEMBER M \r\n"
					+ "WHERE  B.MEM_NO = M.MEM_NO\r\n"
					+ "AND CODE_NO = ?\r\n"
					+ "AND STATE = 1";
		
		return jdbc.selectOne(sql, param);
	}

	public void insertBoard(List<Object> param) {
		String sql = " INSERT INTO BOARD\r\n"
				+ "	   VALUES((SELECT NVL(MAX(BOARD_NO),0)+1 FROM BOARD),"
				+ "           ? , ?,SYSDATE , ?,0,1, ?)";
		jdbc.update(sql, param);
	}
	
	
	
}
