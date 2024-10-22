package kr.or.ddit.controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import kr.or.ddit.service.ReviewServiceImpl;
import kr.or.ddit.service.iReviewService;

@WebServlet("/deleteReview.do")
public class ReviewDeleteController extends HttpServlet {
    iReviewService reviewService = ReviewServiceImpl.getInstance();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String reviewCode = req.getParameter("reviewCode");
        String movieNo = req.getParameter("movie_no");
        reviewService.deleteReview(reviewCode); 
        resp.sendRedirect(req.getContextPath() + "/movieDetail.do?movie_no=" + req.getParameter("movie_no")); // 삭제 후 상세 페이지로 리다이렉트
    }
}