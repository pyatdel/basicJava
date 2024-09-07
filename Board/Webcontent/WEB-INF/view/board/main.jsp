<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="kr.or.ddit.vo.BoardVo" %>
<%@ page import="java.util.List"%>

<%
	List<BoardVo> cateList  = (List<BoardVo>)request.getAttribute("cateList");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- Custom fonts for this template-->
<link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
<link href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
        rel="stylesheet">

    <!-- Custom styles for this template-->
<link href="/Board/resource/bootStrap/css/sb-admin-2.min.css" rel="stylesheet">

<!-- Bootstrap core JavaScript-->
<script src="/Board/resource/bootStrap/vendor/jquery/jquery.min.js"></script>
<script src="/Board/resource/bootStrap/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

<!-- Core plugin JavaScript-->
<script src="/Board/resource/bootStrap/vendor/jquery-easing/jquery.easing.min.js"></script>

<!-- Custom scripts for all pages-->
<script src="/Board/resource/bootStrap/js/sb-admin-2.min.js"></script>

<!-- Page level plugins -->
<script src="/Board/resource/bootStrap/vendor/chart.js/Chart.min.js"></script>

<!-- Page level custom scripts -->
<script src="/Board/resource/bootStrap/js/demo/chart-area-demo.js"></script>
<script src="/Board/resource/bootStrap/js/demo/chart-pie-demo.js"></script>


</head>
<body>	
	메인페이지<br>
	<button class=".btn-circle"></button>
	<%
		for(BoardVo cate : cateList){
			
	%>
		<a href='/Board/boardList?code_no=<%=cate.getCode_no() %>'><%=cate.getCode_name() %></a><br>
	<%	
		}
	
	%>
	
</body>
</html>