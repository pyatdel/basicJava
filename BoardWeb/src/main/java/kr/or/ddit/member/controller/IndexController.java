package kr.or.ddit.member.controller;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import kr.or.ddit.board.service.BoardServiceImpl;
import kr.or.ddit.board.service.IBoardService;
import kr.or.ddit.board.vo.BoardVo;
@WebServlet("/index.do")
public class IndexController extends HttpServlet{
	
	IBoardService boardService = BoardServiceImpl.getinstance();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("인덱스페이지");
		
		//cateList
		List<BoardVo> cateList = boardService.cateList();
		req.setAttribute("catelist", cateList);
		
		req.getRequestDispatcher("/WEB-INF/view/index.jsp").forward(req, resp);
	
	}
	
}
