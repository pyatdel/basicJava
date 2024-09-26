<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var='contextPath' value='${pageContext.request.contextPath}'></c:set>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	view 페이지
	<table>
		<tr><td>${member.id}</td></tr>
		<tr><td>${member.pw}</td></tr>
		<tr><td>${member.name}</td></tr>
		<tr><td>${member.juso}</td></tr>
		<tr><td>${member.tell}</td></tr>
		<tr><td><img src='${contextPath}/download.do?fileNo=${member.img}'</td></tr>
	</table>
	
	
</body>
</html>