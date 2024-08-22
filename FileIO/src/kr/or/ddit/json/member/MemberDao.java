package kr.or.ddit.json.member;

import java.util.List;
import java.util.Map;

import kr.or.ddit.util.JDBCUtil;

public class MemberDao {
	private static MemberDao instance;

	private MemberDao() {

	}

	public static MemberDao getInstance() {
		if (instance == null) {
			instance = new MemberDao();
		}
		return instance;
	}

	
	JDBCUtil jdbc = JDBCUtil.getInstance();
	
	public Map<String, Object> getMember(List<Object> param){
		String sql = "SELECT *\r\n"
				+ "FROM MEMBER\r\n"
				+ "WHERE ID = ?\r\n"
				+ "AND PW = ?";
		
		return jdbc.selectOne(sql, param);
	}
	
	public MemberVo getMember2(List<Object> param) {
		String sql = "SELECT *\r\n"
				+ "FROM MEMBER\r\n"
				+ "WHERE ID = ?\r\n"
				+ "AND PW = ?";
		
		return jdbc.selectOne(sql, param, MemberVo.class);
	}
}
