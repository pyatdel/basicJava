package dao;

import java.util.List;

import util.JDBCUtil;
import vo.MemberVo;

public class MemberDao {
	private static MemberDao instance;

	private MemberDao() {

	}

	public static MemberDao getInstacne() {
		if (instance == null) {
			instance = new MemberDao();
		}
		return instance;
	}

	
	JDBCUtil jdbc = JDBCUtil.getInstance();
	
	public MemberVo login(List<Object> param) {
		String sql =  " SELECT MEM_NO , ID, NAME, \r\n"
					+ "           TO_CHAR(REG_DATE,'YYYY.MM.DD') REG_DATE\r\n"
					+ "FROM MEMBER\r\n"
					+ "WHERE ID = ? \r\n"
					+ "AND PW = ? \r\n"
					+ "AND DELYN = 'N'";
		return jdbc.selectOne(sql, param, MemberVo.class);
	}
	
	
}
