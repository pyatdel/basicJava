package kr.or.ddit.basic;

import java.io.IOException;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/T07")
public class T07ServletContextTest extends HttpServlet{

	/*
	 *  	서블릿 컨텍스트에 대하여 
	 *      1. 서블릿 프로그램이 컨테이너와 정보를 주고 받기 위한 메소드를 제공한다. 
	 *         ex) 파일의 MIME type 정보 가져오기, 요청 정보 보내기, 로깅 등 
	 *      2. 웹 애플리케이션당 1개씩 생성된다.(웹프로그램이 적재될때 생성된다.)    
	 */
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		ServletContext ctx = req.getServletContext();
		System.out.println("서블릿 컨텍스트이 기본 경로 : "+ctx.getContextPath());
		System.out.println("서버정보 : "+ctx.getServerInfo());
		System.out.println("서블릿 API의 메이저 정보 : "+ctx.getMajorVersion());
		System.out.println("서블릿 API의 마이너 정보 : "+ctx.getMinorVersion());
		System.out.println("배포 기술자에 기술된 컨텍스트명  : "+ctx.getServletContextName());
		System.out.println("파일에 대한 MIME type 정보 : "+ctx.getMimeType("abc.mp3"));
		System.out.println("파일 시스템 상의 실제 경로 : "+ctx.getRealPath("/"));
		System.out.println("리소스 URL 정보 : "+ctx.getResource("/formdata.html"));
		
		//속성값 설정 
		ctx.setAttribute("attr1", "속성1");
		
		//속성 가져오기 
		System.out.println("att1 속성 값 : "+ctx.getAttribute("attr1"));
		
		//속성 삭제
		ctx.removeAttribute("att1");
	
		ctx.getRequestDispatcher("/formdata.html").forward(req, resp);
		
	}
	
}
