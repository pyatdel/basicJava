package kr.or.ddit.study12.chat;

import java.util.List;
import java.util.Map;

import kr.or.ddit.util.JDBCUtil;

public class ChatDao {

	private static ChatDao instance;

	private ChatDao() {

	}

	public static ChatDao getInstacne() {
		if (instance == null) {
			instance = new ChatDao();
		}
		return instance;
	}

	JDBCUtil jdbc = JDBCUtil.getInstance();
	
	public void sendMessage(List<Object> param) {
		String sql = "INSERT INTO CHAT\r\n"
				+ "VALUES(?, ?, ?, 'F')";
		
		jdbc.update(sql, param);
		// insert
	}
	public List<Map<String, Object>> receiveMessage(List<Object> param){
		//누구에게 메시지를 보낼 지, 적어준다.(select)
		
		String sql = "SELECT * FROM CHAT\r\n"
				+ "WHERE USER2 = ?\r\n"
				+ "AND reception\r\n"
				+ " = 'F'";
		return jdbc.selectList(sql, param);
	}
	
	public void updateReceive(List<Object> param) {
		
		String sql = " UPDATE CHAT\r\n"
				+ " SET RECEPTION = 'T'\r\n"
				+ " WHERE USER2 = ?";
		//update
		
		jdbc.update(sql, param);
	}
	
}
