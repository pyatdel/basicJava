package kr.or.ddit.controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import kr.or.ddit.service.BoardService;
import kr.or.ddit.service.BoardServiceImpl;
import kr.or.ddit.vo.BoardVo;


@WebServlet("/board")
public class BoardController extends HttpServlet{

	BoardService boardService = BoardServiceImpl.getInstacne();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int board_no = Integer.parseInt(req.getParameter("board_no"));
		System.out.println(board_no);
		BoardVo board = boardService.boardDetail(board_no);
		
		System.out.println("boardVo : "+board);
		
		req.setAttribute("board", board);
		
		req.getRequestDispatcher("/WEB-INF/view/board/boardDetail.jsp").forward(req, resp);
		
	}
	
	
}
