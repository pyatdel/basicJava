package kr.or.ddit.member.controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import kr.or.ddit.file.vo.AttachFileVo;
import kr.or.ddit.member.service.memberService;
import kr.or.ddit.member.service.memberServiceImple;
import kr.or.ddit.member.vo.MemberVo;
@WebServlet("/member/view.do")
public class ViewController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("/member/view.do 페이지");
		
		memberService memberService = memberServiceImple.getinstance();
		
		int memNo = Integer.parseInt(req.getParameter("memNo"));
		
		//디비에서 회원 정보  + file정보 가져오기
		
		MemberVo member = memberService.getMember(memNo);
		
		
		int fileNo = member.getImg();
		
//		AttachFileVo file = memberService.getFile(fileNo);
		
		req.setAttribute("member", member);	
		
		
		
		
		req.getRequestDispatcher("WEB-INf/view/member/view.jsp").forward(req, resp);	
	
	}
}
