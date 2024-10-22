<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var ="contextPath" value="${pageContext.request.contextPath}"></c:set>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	${message}
	<form action="${contextPath}/member/insertProc.do"
		method="post" enctype="multipart/form-data">
		
		<input type="text" name="id" value="아이디"> <br>
		<input type="text" name="pw" value="pw"> <br>
		<input type="text" name="name" value="name"> <br>
		<input type="text" name="juso" value="juso"><br>
		<input type="text" name="tell" value="tell"> <br>
		<input type="file" name="img"> <br>
		<input type="submit" value="회원가입">


	</form>
	<script type="text/javascript">
		
	</script>
	
</body>
</html>