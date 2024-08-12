<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%-- 
	JSP: JAVA SERVER PAGE
	JAVAEE에 포함된 하위 기술
	클라이언트 요청으로 동적 컨텐츠를 생성하여 응답해주는 기술을 제공
	
	한 페이지에서 자바코드와 HTML및 텍스트를 병행 작업 가능

	자바 코드는 약속된 공간<% JAVACODE %>안에서만 기술 가능
	그 외 공간에서는 HTML과 텍스트를 자유롭게 기술 가능
 --%>

<!-- 넘어오는 요청 정보를 받아서 가공(처리)후 응답으로 다시 전달예정 -->

<%
	//java code
	
	//request - 요청객체
	String name = request.getParameter("erum");
	String alias = request.getParameter("alias");
%>

<!-- 변수 내용 확인을 위해 표현식 영역을 사용 -->
나의 이름은 <%=name %> <br>
나의 별명은 <%=alias %>


















