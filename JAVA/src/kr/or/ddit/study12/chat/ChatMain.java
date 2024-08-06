package kr.or.ddit.study12.chat;

import java.util.ArrayList;
import java.util.List;

import kr.or.ddit.util.ScanUtil;

public class ChatMain {
	public static void main(String[] args) {
		ChatService chatService = ChatService.getInstacne();
		String user = ScanUtil.nextLine("유저 아이디: ");

		ChatJob chat = new ChatJob("b001");
		chat.start();
		
		while(true) {
			System.out.println("0 입력시 종료");
			String sendUser = ScanUtil.nextLine("전송할 유저 : ");
			String message = ScanUtil.nextLine("메시지 : ");
			
			if(sendUser.equals("0")) break;
			List<Object> param = new ArrayList();
			param.add(user);
			param.add(sendUser);
			param.add(message);
			
			chatService.sendMessage(param);
		}
	}
}
