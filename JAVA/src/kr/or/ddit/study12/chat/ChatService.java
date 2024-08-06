package kr.or.ddit.study12.chat;

import java.util.List;
import java.util.Map;

public class ChatService {
private static ChatService instance;

private ChatService() {

}

public static ChatService getInstacne() {
	if (instance == null) {
		instance = new ChatService();
	}
	return instance;
}

ChatDao dao = ChatDao.getInstacne();

public void sendMessage(List<Object> param) {
	dao.sendMessage(param);
}

public List<Map<String, Object>> receiveMessage(List<Object> param) { 
	return dao.receiveMessage(param);
}

public void updateReceive(List<Object> param) {
	dao.updateReceive(param);
}

}
