package kr.or.ddit.controller;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;

import org.apache.commons.beanutils.BeanUtils;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import kr.or.ddit.service.MemberServiceImpl;
import kr.or.ddit.service.iMemberService;
import kr.or.ddit.vo.MemberVo;
@WebServlet("/myinfo.do")
public class myinfoController extends HttpServlet{

	iMemberService memberService = MemberServiceImpl.getInstance();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession session = req.getSession();
		MemberVo member = (MemberVo)session.getAttribute("member");
		
//		SimpleDateFormat sdate = new SimpleDateFormat("yyyy-MM-dd");
		
		
		
		String memId= member.getMemId();
		String memPw = member.getMemPw();
		String memPhone = member.getMemPhone();
		String memName = member.getMemName();
		String memMail = member.getMemMail();
		String memGender = member.getMemGender();
	
		
		
		req.getRequestDispatcher("/WEB-INF/view/myinfo.jsp").forward(req, resp);
	
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	MemberVo member = new MemberVo();
		
		//urlencoding형식(key=value)
		try {
			BeanUtils.populate(member, req.getParameterMap());
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		int result = memberService.update(member); 
		
//		System.out.println(">>>>>>>>" + result); 
		resp.sendRedirect("/MiddleProj/mypage.do");
	
	}
}
