package kr.or.ddit.basic;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class T04ErrorHandler extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// 예외 객체 
//		Throwable trowable = (Throwable) req.getAttribute("javax.servlet.error.exception");
		
		// 예외 코드
//		Integer statuscode = (Integer)req.getAttribute("javax.servlet.status_code");
		Integer statuscode = (Integer)req.getAttribute("jakarta.servlet.error.status_code");
		//에러 메세지 
//		String message = (String) req.getAttribute("javax.servlet.error.message");
		String message = (String) req.getAttribute("jakarta.servlet.error.message");
		
		// 에러 발생 된 서블릿 
//		String servletName = (String)req.getAttribute("javax.servlet.error.servlet_name");
		String servletName = (String)req.getAttribute("jakarta.servlet.error.servlet_name");
		
		if(servletName == null) {
			servletName ="알수없는 서블릿이름";
		}
		
		// 에러 발생 URI 정보 
//		String requstUri = (String) req.getAttribute("javax.servlet.error.request_uri");
		String requstUri = (String) req.getAttribute("jakarta.servlet.error.request_uri");
		
		if(requstUri == null) {
			requstUri = "알수없는 URI";
		}
		
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/plain");
		
		PrintWriter out = resp.getWriter();
		
		if(statuscode == null) {
			out.print("에러 정보 없음");
		}
		else {
			out.print("예외/에러 정보 ");
			out.print("상태코드 : "+statuscode);
			out.print("에러 메세지 : "+message);
			out.print("서블릿이름 : "+servletName);
			out.print("요청 URI : "+requstUri);
			
		}
		
		
		
		
	
	
	}
}
