package kr.or.ddit.basic;

import java.io.IOException;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class T01ServletLifeCycle extends HttpServlet {
	
	public T01ServletLifeCycle() {
		System.out.println("T01ServletLifeCycle 생성자 호출됨");
	}
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		String initParam = config.getInitParameter("initParam");
		System.out.println("initParam : "+ initParam);
	}
	
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// 실제적인 작업수행이 시작되는 지점 (자바에서 메인 메소드 역활을 함)
		System.out.println("서비스 호출됨");
		super.service(req, res);
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 메소드 방식이 GET 방식인 경우 호출됨
		System.out.println("doGet() 호출됨");
		doPost(req, resp);
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 메소드 방식이 POST 방식인 경우 호출됨
		System.out.println("doPost() 호출됨");
	}
	
	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPut(req, resp);
	}
	
	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doDelete(req, resp);
	}
	
	@Override
	public void destroy() {
		// 객체 소멸시 
		System.out.println("destroy() 호출됨");
	}
	
	
	
	
}
