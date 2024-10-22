package kr.or.ddit.controller;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import kr.or.ddit.service.BoardServiceImpl;
import kr.or.ddit.service.iBoardService;
import kr.or.ddit.vo.BoardVo;

@WebServlet("/boardModify.do")
public class BoardModifyController extends HttpServlet {
    private iBoardService boardService = BoardServiceImpl.getInstance();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        long startTime = System.currentTimeMillis();
        System.out.println("BoardModifyController: doGet started");

        String boardNo = req.getParameter("boardNo");
        System.out.println("BoardModifyController: Fetching board for modification, boardNo = " + boardNo);

        try {
            BoardVo board = boardService.getBoard(boardNo);
            List<BoardVo> categoryList = boardService.cateList();

            req.setAttribute("board", board);
            req.setAttribute("categoryList", categoryList);
            req.getRequestDispatcher("/WEB-INF/view/boardModify.jsp").forward(req, resp);
        } catch (Exception e) {
            System.err.println("Error in doGet: " + e.getMessage());
            e.printStackTrace();
            req.setAttribute("error", "게시글 정보를 불러오는 데 실패했습니다.");
            req.getRequestDispatcher("/WEB-INF/view/error.jsp").forward(req, resp);
        }

        long endTime = System.currentTimeMillis();
        System.out.println("BoardModifyController: doGet completed in " + (endTime - startTime) + "ms");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        long startTime = System.currentTimeMillis();
        System.out.println("BoardModifyController: doPost started");

        String boardNo = req.getParameter("boardNo");
        String boardCode = req.getParameter("board_code");
        String title = req.getParameter("board_title");
        String content = req.getParameter("board_content");

        System.out.println("Received parameters - boardNo: " + boardNo + ", boardCode: " + boardCode + ", title: " + title);
        System.out.println("Content length: " + (content != null ? content.length() : "null"));

        BoardVo board = new BoardVo();
        board.setBoard_no(boardNo);
        board.setBoard_code(boardCode);
        board.setBoard_title(title);
        board.setBoard_content(content);

        try {
            System.out.println("Calling updateBoard...");
            boolean result = boardService.updateBoard(board);
            System.out.println("updateBoard result: " + result);

            if (result) {
                System.out.println("BoardModifyController: Board updated successfully");
                resp.sendRedirect("boardDetail.do?boardNo=" + boardNo);
            } else {
                System.out.println("BoardModifyController: Failed to update board");
                req.setAttribute("error", "게시글 수정에 실패했습니다.");
                req.setAttribute("board", board);
                List<BoardVo> categoryList = boardService.cateList();
                req.setAttribute("categoryList", categoryList);
                req.getRequestDispatcher("/WEB-INF/view/boardModify.jsp").forward(req, resp);
            }
        } catch (Exception e) {
            System.err.println("Error in doPost: " + e.getMessage());
            e.printStackTrace();
            req.setAttribute("error", "게시글 수정 중 오류가 발생했습니다: " + e.getMessage());
            req.setAttribute("board", board);
            try {
                List<BoardVo> categoryList = boardService.cateList();
                req.setAttribute("categoryList", categoryList);
            } catch (Exception ex) {
                System.err.println("Error fetching category list: " + ex.getMessage());
            }
            req.getRequestDispatcher("/WEB-INF/view/boardModify.jsp").forward(req, resp);
        }

        long endTime = System.currentTimeMillis();
        System.out.println("BoardModifyController: doPost completed in " + (endTime - startTime) + "ms");
    }
}