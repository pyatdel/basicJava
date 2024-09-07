<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

	//post로 받을 때 반드시 인코딩 처리 필요
// 	request.setCharacterEncoding("utf-8"); //받아주는 위치에서 한글 깨짐 처리

	//요청 들어온 정보 확인하기 - getParameter(key)
	String userName = request.getParameter("uNm");
%>

여기 작성된 내용이 모두 응답으로 전달됨 .. 나의 이름은: <%=userName %>