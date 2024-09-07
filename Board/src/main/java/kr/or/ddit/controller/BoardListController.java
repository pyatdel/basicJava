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


@WebServlet("/boardList")
public class BoardListController extends HttpServlet{

	BoardService boardService = BoardServiceImpl.getInstacne();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// 파라미터 출력 
		int code_no = Integer.parseInt(req.getParameter("code_no"));
		// 게시판 리스트
		List<BoardVo> boardList = boardService.boardList(code_no);
		// 출력해보기 
		System.out.println(boardList);
		req.setAttribute("boardList", boardList);
		
		
		req.getRequestDispatcher("WEB-INF/view/board/boardList.jsp").forward(req, resp);
	}
	
}
