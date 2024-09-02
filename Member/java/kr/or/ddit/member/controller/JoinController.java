package kr.or.ddit.member.controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import kr.or.ddit.member.service.MemberService;
import kr.or.ddit.member.service.MemberServiceImpl;
import kr.or.ddit.member.vo.MemberVo;

public class JoinController extends HttpServlet{
	
	MemberService memberService = MemberServiceImpl.getInstacne();
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		String pw = req.getParameter("pw");
		String name = req.getParameter("name");
		
		System.out.println(id);
		System.out.println(pw);
		System.out.println(name);
		
		MemberVo member = new MemberVo();
		member.setId(id);
		member.setPw(pw);
		member.setName(name);
		
		memberService.join(member);
		
		resp.sendRedirect("/Member/MemberMain");
		
	
	
	}
	
}
