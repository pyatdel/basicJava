<%@page import="kr.or.ddit.vo.BoardVo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
	BoardVo board = (BoardVo)request.getAttribute("board");
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
				<th><%= board.getBoard_no() %></th>
				<th>제목</th>
				<th colspan="3"><%= board.getTitle() %></th>
			</tr>
			<tr>
				<th>날짜</th>
				<th><%= board.getReg_date() %></th>
				<th>작성자</th>
				<th><%= board.getWriter() %></th>
				<th>조회수</th>
				<th><%= board.getCnt() %></th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td colspan="6"> <%= board.getContent() %></td>
			</tr>
		</tbody>
	</table>
	<a href="/Board/boardList?code_no=<%=board.getCode_no() %>"><%=board.getCode_name() %>으로 이동 </a>
	<a href="/Board/boardWrite">게시글 작성</a>
	<a href="/Board/boardUpate">게시글 수정</a>
	<a href="/Board/boardDelete">게시글 삭제</a>

</body>
</html>
