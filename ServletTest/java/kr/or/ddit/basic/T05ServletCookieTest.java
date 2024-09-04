package kr.or.ddit.basic;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class T05ServletCookieTest extends HttpServlet{

	/*
	 *    	쿠키 정보에 대하여 
	 *      => 웹 서버와 브라우저는 애플리케이션을 사용하는 동안 필요한 값을 쿠키를 통해 공유하며 
	 *         상태를 유지함 
	 *         
	 *      1. 구성요소 
	 *        - 이름 
	 *        - 값 
	 *        - 유효시간(초) 
	 *        - 도메인 
	 *         => 쿠키의 도메인이 쿠키를 생성한 서버의 도메인을 벗어나면 브라우저는 쿠키를 저장하지 않는다.
	 *      
	 *        - 경로 : 쿠키를 공유할 기준 경로를 저장한다. 
	 *      
	 *      2. 동작 방식 
	 *        - 쿠키생성단계 : 생성한 쿠키를 응답데이터의 헤더에 저장하여 브라우저에 전송한다. 
	 *        - 쿠키저장단계 : 브라우저는 응답데이터에 포함된 쿠키를 쿠키저장소에 저장한다. 
	 *        - 쿠키전송단계 : 브라우저는 저장한 쿠키를 요청이 있을때마다 웹서버에 전송한다. 
	 *         
	 */
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		req.setCharacterEncoding("UTF-8");
//		setCookieExam(req, resp);
//		readCookieExam(req, resp);
		deleteCookieExam(req, resp);
	
	}
	
	private void deleteCookieExam(HttpServletRequest req, HttpServletResponse resp) throws IOException{
		
		Cookie[] cookies = req.getCookies();
		
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html");
		
		PrintWriter out = resp.getWriter();
		
		String title = "쿠키정보 삭제 예제";
		out.print("<html>");
		out.print("<head>");
		out.print("<title>"+title+"</title>");
		out.print("</head>");
		out.print("<body>");
		if(cookies != null) {
			for (Cookie cookie : cookies) {
				cookie.setMaxAge(0);
				resp.addCookie(cookie);
				out.print("<p>삭제 요청한 쿠키 이름: "+cookie.getName()+"</p><br>");
				out.print("<p>삭제 요청한 쿠키 값 : "+cookie.getValue()+"</p><br>");
				
			}
		}
		else {
			out.print("<h2>쿠키 정보가 없습니다.</h2>");
		}
		
		
		out.print("</body>");
		out.print("</html>");
		
		
	}
	
	
	
	
	private void readCookieExam(HttpServletRequest req, HttpServletResponse resp)throws IOException {
		
		Cookie[] cookies = req.getCookies();
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html");
		
		PrintWriter out = resp.getWriter();
		
		String title = "쿠키정보 읽기 예제";
		out.print("<html>");
		out.print("<head>");
		out.print("<title>"+title+"</title>");
		out.print("</head>");
		out.print("<body>");
		for (Cookie cookie : cookies) {
			out.print("<p>name  : "+cookie.getName()+"</p><br>");
			out.print("<p>value : "+cookie.getValue()+"</p><br>");
		}
		out.print("</body>");
		out.print("</html>");
		
	}
	
	
	
	private void setCookieExam(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		// 쿠키 생성하기 
		Cookie userId = new Cookie("userId", req.getParameter("userId"));
		Cookie name   = new Cookie("name", req.getParameter("name"));
		
		// 쿠키 소멸 시간  저장하지 않으면  브라우저가 종료시 쿠키를 삭제한다.
		userId.setMaxAge(60*60*24);
		// javascript 를 이용한 직접 접근 방지
		userId.setHttpOnly(true);
		
		resp.addCookie(userId);
		resp.addCookie(name);
		
		PrintWriter out = resp.getWriter();
		
		String title =  "쿠키 설정 예제";
		out.print("<html>");
		out.print("<head>");
		out.print("<title>"+title+"</title>");
		out.print("</head>");
		out.print("<body>");
		out.print(req.getParameter("userId"));
		out.print(req.getParameter("name"));
		out.print("</body>");
		out.print("</html>");
		
		
		
		
	}
	
	
	
	
}
