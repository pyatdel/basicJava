package kr.or.ddit.member.controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/member/insert.do")
public class InsertController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		System.out.println("멤버 인덱스페이지");
		req.getRequestDispatcher("/WEB-INF/view/member/form.jsp").forward(req, resp);
		
	}
}
