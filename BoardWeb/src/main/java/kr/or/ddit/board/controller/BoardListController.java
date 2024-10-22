package kr.or.ddit.board.controller;

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
@WebServlet("/boardList.do")
public class BoardListController extends HttpServlet{

	IBoardService boardService = BoardServiceImpl.getinstance();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		int code_no = Integer.parseInt(req.getParameter("code_no"));
		
		String search = req.getParameter("search");
		String select = req.getParameter("select");
		
		BoardVo searchBoard = new BoardVo();
		searchBoard.setCode_no(code_no);
		if(select.equals("writer")) searchBoard.setWriter(search);
		if(search != null) searchBoard.setSearch(search);
		
		List<BoardVo> boardList = boardService.boardList(searchBoard);
		List<BoardVo> cateList = boardService.cateList();
		
		req.setAttribute("cateList", cateList);
		req.setAttribute("codeName", boardList.get(0).getCode_name());
		req.setAttribute("code_no", boardList.get(0).getCode_no());
		
		req.setAttribute("boardList", boardList);
		
		req.getRequestDispatcher("/WEB-INF/view/board/list.jsp").forward(req, resp);
	
	}
}
