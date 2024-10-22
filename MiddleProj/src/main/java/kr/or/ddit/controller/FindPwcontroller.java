package kr.or.ddit.controller;

import java.io.IOException;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.websocket.Session;
import kr.or.ddit.service.MemberServiceImpl;
import kr.or.ddit.service.iMemberService;
import kr.or.ddit.vo.MemberVo;
@WebServlet("/findPw.do")
public class FindPwcontroller extends HttpServlet{

	iMemberService memberService = MemberServiceImpl.getInstance();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		req.getRequestDispatcher("/WEB-INF/view/findPw.jsp").forward(req, resp);
	
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		//요청 정보 받기
		String memId = req.getParameter("memId");
		String memName = req.getParameter("memName");
		String memMail = req.getParameter("memMail");
		
		
		if(memId == null || memId.trim().isEmpty()|| memName == null || memName.trim().isEmpty() || memMail == null || memMail.trim().isEmpty()) {
			
			req.setAttribute("error", "각 항목을 모두 입력하세요.");
			req.getRequestDispatcher("/WEB-INF/view/findPw.jsp").forward(req, resp);
			return;
		}
		
		//memberVo에 데이터 
		MemberVo memberVo = new MemberVo();
		memberVo.setMemId(memId);
		memberVo.setMemName(memName);
		memberVo.setMemMail(memMail);
		
		memberVo = memberService.findPw(memberVo);
		int memState = memberVo.getMemState();
		
		//비밀번호 일치했을 때 어떻게 진행할건지 고민
		if(memState != 2) {
//			sendMail(memMail, "비밀번호 찾기", "귀하의 비밀번호는: " + memberVo.getMemPw()+" 입니다.");
//			String pw = memberVo.getMemPw();
			int result = memberService.pwUpdate(memId);
			
			req.setAttribute("sendPw", "임시 비밀번호 qwer123! 를 발급했습니다.");
			
		}
		
		else {
			req.setAttribute("error", "입력한 정보의 계정이 존재하지 않습니다.");
		}
		req.getRequestDispatcher("/WEB-INF/view/findPw.jsp").forward(req, resp);
		
	}
	
//	private void sendMail(String to, String subject, String body) {
//		String host = "smtp.gmail.com";
//		final String user = "dditdockertest@gmail.com";
//		final String pw = "uitn wggh yipv prcg";
//		
//		Properties props = new Properties();
//		props.put("mail.smtp.host", host);
//		props.put("mail.smtp.auth", "true");
//		props.put("mail.smtp.port", "465");
//		props.put("mail.smtp.socketfactory.port", "465");
//		props.put("mail.smtp.socketfactory.class", "javax.net.ssl.SSLSocketFactory");
//		
//		javax.mail.Session session = javax.mail.Session.getInstance(props, new javax.mail.Authenticator() {
//			protected javax.mail.PasswordAuthentication getPasswordAuthentication(){
//				return new javax.mail.PasswordAuthentication(user, pw);
//			}
//		});
//		
//		try {
//			MimeMessage message = new MimeMessage(session);
//			message.setFrom(new InternetAddress(user));
//			message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
//			message.setSubject(subject);
//			message.setText(body);
//			Transport.send(message);
//		} catch (MessagingException e) {
//			e.printStackTrace();
//		}
//	}
}
