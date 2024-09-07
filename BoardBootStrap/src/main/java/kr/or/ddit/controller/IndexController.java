package kr.or.ddit.controller;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import kr.or.ddit.service.BoardService;
import kr.or.ddit.service.BoardServiceImpl;
import kr.or.ddit.vo.BoardVo;

@WebServlet("/index")
public class IndexController extends HttpServlet{
	
	BoardService boardService = BoardServiceImpl.getInstacne();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("인덱스 페이지");
		// 카테고리 가져오기
		
		
		req.getRequestDispatcher("/WEB-INF/view/board/index.jsp").forward(req, resp);
	
	}
	
}
