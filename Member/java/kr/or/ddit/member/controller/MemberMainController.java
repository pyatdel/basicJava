package kr.or.ddit.member.controller;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MemberMainController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		System.out.println("멤버 메인페이지");
		// 로그인 , 회원가입 
		
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html");
		
		PrintWriter out = resp.getWriter();
		
		out.print("<html>");
		out.print("<body>");
		
		out.print("<form method='post' action='/Member/login' >");
		out.print("<table>");
		out.print("<tr>"
				+ "	<td>아이디</td>"
				+ "	<td><input type='text' name ='id'></td>"
				+ "</tr>");
		out.print("<tr>"
				+ "	<td>패스워드</td>"
				+ "	<td><input type='text' name ='pw'></td>"
				+ "</tr>");
		out.print("</table>");
		out.print("<input type='submit' vlaue='로그인'> ");
		out.print("</form>");
		out.print("<button onclick =\"location.href='/Member/join.html'\" >회원 가입</button");
		
		out.print("</body>");
		out.print("</html>");
		
		
	}
	
}
