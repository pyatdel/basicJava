package kr.or.ddit.basic;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;



@WebServlet("/T06")
public class T06ServletSessionTest extends HttpServlet{
	
	/*
	 * 		세션 객체에 대하여 
	 *       - 세션을 통해서 사용자별로 구분하여 정보를 관리할수 있다(세션 ID 이용)
	 *       - 쿠키를 사용 할때 보다 보안이 향상된다(서버 사이드에 저장되기 때문에)
	 *     
	 *       - 세션 객체를 가져오는 방법 
	 *       HttpSession session = req.getSession(boolean 값)
	 *        -> boolean : true   => 세션 객체가 존재하지 않으면 새로 생성함 
	 *                     false  => 세션 객체가 존재하지 않으면 null
	 *       
	 *       - 세션 객체 삭제 처리 방법
	 *        1. invalidate() 메소드 사용 
	 *        2. setMaxInactiveInterval(int interval) 메소드 호출 
	 *           => 일정시간 동안 요청이 없으면 세션 객체를 삭제 
	 *        3. web.xml <session-config> 이용하여 설정하기 분단위   
	 * 
	 */
	
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession(true);
		
		// 생성 시간 가져오기 
		Date date = new Date(session.getCreationTime());
		
		//마지막 접근시간 가져오기 
		Date lastAcessTime = new Date(session.getLastAccessedTime());
		
		String title = "";
		int visitCnt = 0;
		String userId = "sem";
		
		session.setMaxInactiveInterval(30);
		if(session.isNew()) {
			title = "처음 방문을 환영합니다.";
			session.setAttribute("userId", userId);
		}
		else {
			visitCnt = (int) session.getAttribute("visitCnt");
			visitCnt++;
			userId = (String) session.getAttribute("userId");
		}
		session.setAttribute("visitCnt", visitCnt);
		
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html");
		
		PrintWriter out = resp.getWriter();
		
		out.println("<html>");
		out.println("<title>" + title+"</title>");
		out.println("<body>");
		out.print("<p> 세션 ID : "+session.getId()+"</p><br>");
		out.print("<p> 생성시간 : "+date+"</p><br>");
		out.print("<p> 마지막 접근시간 : "+lastAcessTime+"</p><br>");
		out.print("<p> 사용자 id : "+userId+"</p><br>");
		out.print("<p> 방문 횟수  : "+visitCnt+"</p><br>");
		
		out.println("</body>");
		out.println("</html>");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
