package kr.or.ddit.member.controller;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import kr.or.ddit.member.service.MemberService;
import kr.or.ddit.member.service.MemberServiceImpl;
import kr.or.ddit.member.vo.MemberVo;

public class LoginController extends HttpServlet{

	
	MemberService memberService = MemberServiceImpl.getInstacne();
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String id = req.getParameter("id");
		String pw = req.getParameter("pw");
		
		System.out.println("id : "+id);
		System.out.println("pw : "+pw);
		
		MemberVo member = new MemberVo();
		member.setId(id);
		member.setPw(pw);
		
		member = memberService.login(member);
		
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html");
		
		PrintWriter out = resp.getWriter();
		if(member == null) {
			// 로그인 실패시 기존페이지 이동 
			System.out.println("로그인 실패");
			resp.sendRedirect("/Member/MemberMain");
		}
		else {
			// 로그인 성공시 회원 페이지 이동.
			System.out.println("로그인 성공");
			resp.sendRedirect("/Member/member.html");
		}
		
	}
	
}
