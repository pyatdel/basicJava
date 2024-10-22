package kr.or.ddit.controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import kr.or.ddit.service.BoardServiceImpl;
import kr.or.ddit.service.iBoardService;
import kr.or.ddit.vo.BoardVo;

@WebServlet("/myboardInsert.do")
public class MyBoardInsertController extends HttpServlet {
	iBoardService boardService = BoardServiceImpl.getInstance();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	 String boardNo = req.getParameter("boardNo");
    	 String boardTitle = req.getParameter("boardTitle");
    	 String boardContent = req.getParameter("boardContent");
    	 String boardCode = req.getParameter("boardCode");
    	    
        BoardVo board = new BoardVo();
        board.setBoard_no(boardNo);
        board.setBoard_title(boardTitle);
        board.setBoard_content(boardContent);
        board.setBoard_code(boardCode);
        System.out.println("boardNo: " + boardNo);
        System.out.println("boardTitle: " + boardTitle);
        System.out.println("boardContent: " + boardContent);
        System.out.println("boardCode: " + boardCode);
       

        boardService.insertBoard(board);
    }

}