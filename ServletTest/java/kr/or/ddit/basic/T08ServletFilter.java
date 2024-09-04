package kr.or.ddit.basic;

import java.io.IOException;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class T08ServletFilter implements Filter{
	
	@Override
	public void destroy() {
		// 필터 객체가 웹 컨테이너에 의해 서비스로부터 제거되기 전에 호출됨
		System.out.println("T08ServletFilter => destroy() 호출됨");
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
			throws IOException, ServletException {
		
		System.out.println("T08ServletFilter => doFilter 시작 ");
		
		String ipAddress = req.getRemoteAddr();
		
		System.out.println("IP 주소 : "+ipAddress);
		// 필터 체인을 실행한다.
		// req 및 resp 객체 전달
		resp.setCharacterEncoding("UTF-8");
		chain.doFilter(req, resp);
		System.out.println("T08ServletFilter => doFilter 완료 ");
	}
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		String initParam = filterConfig.getInitParameter("initParam");
		System.out.println("initPara : "+initParam);
	}
	
	/*
	 *  서블릿 필터 
	 *  
	 *  1. 사용 목적 
	 *   - 클라이언트 요청을 수행하기 전에 가로채 필요한 작업을 수행할수 있다. 
	 *   - 클라이언트 응답을 제공하기 전에 응답정보에 필요한 작업을 수행할수 있다(인코딩 처리 등등.. )
	 *   
	 *  2. 사용 예 
	 *   - 인증 
	 *   - 데이터 압축 
	 *   - 인코딩 
	 *   - 로깅 및 감시 처리 
	 *   - 이미지 변환 필터 등등
	 *    
	 */
	
}
