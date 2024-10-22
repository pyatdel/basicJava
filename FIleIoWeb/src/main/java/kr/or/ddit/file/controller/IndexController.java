package kr.or.ddit.file.controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/index.do")
public class IndexController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		System.out.println("인덱스 페이지");
		
		//forward -> 데이터 다 들고 이동
		
		//redirect -> url 재로딩
		req.getRequestDispatcher("WEB-INF/view/file/index.jsp").forward(req, resp);
	}
}
