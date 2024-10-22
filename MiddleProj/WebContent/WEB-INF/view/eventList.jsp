<%@page import="java.util.List"%>
<%@page import="kr.or.ddit.vo.EventVo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	List<EventVo> eventList = (List<EventVo>)request.getAttribute("eventList");
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
table{
	width : 100%;
	text-align : center;
	border: 1px solid black;
}


</style>

</head>


<body>
<%@include file="../../includes/top.jsp" %>
    <input type="button" value="글쓰기" onclick="location.href='eventInsert'">
    <input type="button" value="메인으로" onclick="location.href='main.do'">
    <input type="button" value="1번" onclick="location.href = 'Event1.jsp'">
    
    

<script>
    function openJspPage() {
        window.location.href = 'Event1.jsp';
    }
</script>
    
    
    
<!-- 	리스트 페이지  -->
	<table border = "">
	
		<thead>
			<tr>
				<th>게시판 번호</th>
				<th>제목</th>
				<th>내용</th>
				<th>날짜</th>
				<th>작성자</th>
				<th>조회수</th>
			</tr>
		</thead>
		<tbody>
			<%
					for(EventVo event : eventList){
			%>
				<tr>
					<td><%=event.getBoardNo() %></td>
					<td><%=event.getBoardTitle() %></td>
					<td><a href="/MiddleProj/event?boardNo=<%= event.getBoardNo()%>">
						<%=event.getBoardContent() %></a>
						</td>
					<td><%=event.getBoardWriteDate() %></td>
					<td><%=event.getWriter() %></td>
					<td><%=event.getBoardCnt() %></td>
				</tr>
			<%
				}
			%>
		</tbody>
	</table>
</body>
</html>