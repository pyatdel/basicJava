package kr.or.ddit.basic;

import java.io.IOException;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/T09")
public class T09Attribute extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setAttribute("attr1", "속성1");
		
		HttpSession session = req.getSession();
		session.setAttribute("attr2", "속성2");
		
		ServletContext ctx = req.getServletContext();
		
		ctx.setAttribute("attr3", "속성3");
		
		System.out.println(req.getAttribute("attr1"));
		System.out.println(session.getAttribute("attr2"));
		System.out.println(ctx.getAttribute("attr3"));
		
		
	
	}
	
}
