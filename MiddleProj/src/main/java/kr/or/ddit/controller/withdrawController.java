package kr.or.ddit.controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import kr.or.ddit.service.MemberServiceImpl;
import kr.or.ddit.service.iMemberService;
import kr.or.ddit.vo.MemberVo;

@WebServlet("/withdraw.do")
public class withdrawController extends HttpServlet{

	iMemberService memberService = MemberServiceImpl.getInstance();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		MemberVo member = (MemberVo)session.getAttribute("member");

		String memId = member.getMemId();
		
		req.getRequestDispatcher("/WEB-INF/view/withdraw.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		HttpSession session = req.getSession();
		MemberVo member = (MemberVo)session.getAttribute("member");

		String memId = member.getMemId();
		String memPw = member.getMemPw();
		System.out.println("아이디:" + memId+" 비번: "+ memPw);
		String inputPw = req.getParameter("memPw");
		System.out.println("비밀번호 확인:" + inputPw);
		
		//입력한 비밀번호화 데이터베이스의 비밀번호 비교
		if( inputPw.equals(memPw)) {
			int result = memberService.withdraw(member); //회원 탈퇴처리
			session.invalidate(); //세션 무효화
			//탈퇴 완료된 alert 창이 뜨면 좋을 듯
			resp.sendRedirect("/MiddleProj/main.do");
		}
		else {
			req.setAttribute("error", "비밀번호가 일치하지 않습니다.");
			req.getRequestDispatcher("/WEB-INF/view/withdraw.jsp").forward(req, resp);
		}
		
	
	}
}
