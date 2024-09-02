package kr.or.ddit.basic;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class T02ServletTest extends HttpServlet {

	/*
	 * 서블릿 동작 방식에 대하여
	 * 1. 사용자(클라이언트가) URL을 클릭하면 Http Request를 서블릿 컨테이너로 전송함
	 * 2. 컨테이너는 web.xml에 정의된 Url 패턴을 확인하여 어느 서블릿을 통해 처리할지를
	 * 	  검색함.(아직 로딩이 안된 경우에는 생성하여 적재함. 로딩시 init()메소드 호출됨.)
	 * 3. 서블릿 컨테이너는 요청을 처리할 개별 스레드를 생성하여 해당 서블릿 객체의 service()
	 * 	  메소드를 호출함(HttpServletRequest 및 HttpServletResponse 객체를 생성하여
	 * 	  파라미터로 넘겨준다.)
	 * 4. service 메소드는 메소드 타입을 체크하여 적절한 메소드를 호출한다.
	 * 	  (doGet, doPost, doPut, doDelete 등)
	 * 
	 * 5. 요청 처리가 완료된 HttpServletRequest 및 HttpServletResoponse 객체는 소멸된다.
	 * 6. 컨테이너로부터 서블릿이 제거되는 경우에 destory 메소드가 호출됨.
	 * 
	 */
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		Request 객체의 메서드 확인하기
		System.out.println("req.getCharacterEncoding()"+req.getCharacterEncoding());
		System.out.println("req.getContentLength()"+req.getContentLength());
		System.out.println("req.getProtocol()"+req.getProtocol());
		System.out.println("req.getMethod()"+req.getMethod());
		System.out.println("req.getRequestURI()"+req.getRequestURI());
		System.out.println("req.getRequestedSessionId()"+req.getRequestedSessionId());
		System.out.println("req.getHeaderNames()"+req.getHeaderNames());
		System.out.println("req.getRemoteAddr()"+req.getRemoteAddr());
		System.out.println("req.getRemotePort()"+req.getRemotePort());
		
		Map<String, String[]> map = req.getParameterMap();
		String name = req.getParameter("name");
		String age = req.getParameter("age");
		
		System.out.println("name => " + name);
		System.out.println("age => " + age);
		
		System.out.println(map.get("name")[0]);
		
		
		req.setAttribute("tel", "1234-5678");
		req.setAttribute("addr", "대전시 중구 오류동");
		
		System.out.println(req.getAttribute("tel"));
		System.out.println(req.getAttribute("addr"));
//		파라미터 클라이언트(브라우저) 		String만 담을 수 있음
//		애트리뷰트 세션 등에 담을 수 있다. 	Object를 담을 수 있음
		
		resp.setContentType("text/plain;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		out.println("name => " + name);
		out.println("age => " + age);
		
		out.println("서블릿 경로 : " + req.getServletPath());
		out.println("서블릿 컨텍스트 경로" + req.getContextPath());
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
