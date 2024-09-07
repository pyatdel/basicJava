<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="kr.or.ddit.vo.BoardVo"%>
<%@page import="java.util.List"%>
<%
	List<BoardVo> boardList = (List<BoardVo>)request.getAttribute("boardList");
%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
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
				for(BoardVo board : boardList){
			%>
			<tr>
				<td><%=board.getBoard_no() %> </td>
				<td><%=board.getTitle().substring(0, 20) %> </td>
				<td><a href="/Board/board?board_no=<%=board.getBoard_no() %>">
						<%=board.getContent().substring(0, 20)%></a> 
				</td>
				<td><%=board.getReg_date() %> </td>
				<td><%=board.getWriter() %> </td>
				<td><%=board.getCnt() %> </td>
			</tr>
			<%		
				}
			%>		
		</tbody>
	</table>
</body>
</html>