package kr.or.ddit.controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import kr.or.ddit.service.MemberServiceImpl;
import kr.or.ddit.service.iMemberService;
import kr.or.ddit.vo.MemberVo;
@WebServlet("/findId.do")
public class FindIdController extends HttpServlet{

	iMemberService memberService = MemberServiceImpl.getInstance();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		req.getRequestDispatcher("/WEB-INF/view/findId.jsp").forward(req, resp);
	
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		//요청 정보 받기
		String memName = req.getParameter("memName");
		String memMail = req.getParameter("memMail");
		
		if(memName == null || memName.trim().isEmpty() || memMail == null || memMail.trim().isEmpty()) {
			
			req.setAttribute("error", "이름과 이메일을 모두 입력하세요.");
			req.getRequestDispatcher("/WEB-INF/view/findId.jsp").forward(req, resp);
			return;
		}
		
		//memberVo에 데이터 
		MemberVo memberVo = new MemberVo();
		memberVo.setMemName(memName);
		memberVo.setMemMail(memMail);
		
		memberVo = memberService.findId(memberVo);
		
		if(memberVo != null) {
			String id = memberVo.getMemId();
			if(id.length() <= 2) req.setAttribute("foundId", id.substring(0,id.length()-1)+"*");
			else if(id.length() <= 4 && id.length()>2) req.setAttribute("foundId", id.substring(0,id.length()-1)+"**");
			else req.setAttribute("foundId", id.substring(0,id.length()-3) + "***");
		}
		else {
			req.setAttribute("error", "입력한 정보의 아이디가 존재하지 않습니다.");
		}
		
		req.getRequestDispatcher("/WEB-INF/view/findId.jsp").forward(req, resp);
		
		
		
		
		
		
		
		
	
	}
}
