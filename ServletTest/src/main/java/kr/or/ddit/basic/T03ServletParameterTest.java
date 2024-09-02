package kr.or.ddit.basic;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class T03ServletParameterTest extends HttpServlet {

	
	  @Override protected void doGet(HttpServletRequest req, HttpServletResponse
	  resp) throws ServletException, IOException {
	  
	  String id = req.getParameter("id"); String pw = req.getParameter("pw");
	  String username = req.getParameter("username"); String gender =
	  req.getParameter("gender"); String[] hobby = req.getParameterValues("hobby");
	  String religion = req.getParameter("religion");
	  
	  resp.setCharacterEncoding("UTF-8"); resp.setContentType("text/plain");
	  
	  PrintWriter out = resp.getWriter();
	  
	  out.print("<html>"); out.print("<body>"); out.print("<p> id : "+id+"</p>");
	  out.print("<p> pw : "+pw+"</p>");
	  out.print("<p> username : "+username+"</p>");
	  out.print("<p> gender : "+gender+"</p>"); out.print("<p> hobby : ");
	  for(String h : hobby) out.print(h+" "); out.print("</p>");
	  out.print("<p> id : "+religion+"</p>");
	  
	  out.print("</body>"); out.print("</html>");
	  
	  }
	 
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String id = req.getParameter("id");
		String pw = req.getParameter("pw");
		String username = req.getParameter("username");
		String gender = req.getParameter("gender");
		String[] hobby = req.getParameterValues("hobby");
		String religion = req.getParameter("religion");
		
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/plain");
		
		PrintWriter out = resp.getWriter();
		
		out.print("<html>");
		out.print("<body>");
		out.print("<p> id : "+id+"</p>");
		out.print("<p> pw : "+pw+"</p>");
		out.print("<p> username : "+username+"</p>");
		out.print("<p> gender : "+gender+"</p>");
		out.print("<p> hobby : ");
		for(String h : hobby) out.print(h+" ");
		out.print("</p>");
		out.print("<p> id : "+religion+"</p>");
		
		out.print("</body>");
		out.print("</html>");
	}
}
