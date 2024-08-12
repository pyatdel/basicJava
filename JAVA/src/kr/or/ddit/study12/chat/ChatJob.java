package kr.or.ddit.study12.chat;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ChatJob extends Thread{

	
	String user;
	public ChatJob(String user) {
		this.user = user;
	}
	
	ChatService chat = ChatService.getInstacne();
	
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			List<Object> param = new ArrayList();
			param.add(user);
			
			List<Map<String, Object>> list = chat.receiveMessage(param);
			if(list == null) continue;
			for(Map<String, Object> map : list) {
				System.out.println("보낸 사람 : "+map.get("USER1"));
				System.out.println("메시지 : "+map.get("MESSAGE"));
			}
			chat.updateReceive(param);
		}
	}
}
