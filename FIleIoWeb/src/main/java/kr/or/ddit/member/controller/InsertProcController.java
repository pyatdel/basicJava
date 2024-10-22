package kr.or.ddit.member.controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;
import kr.or.ddit.file.vo.AttachFileVo;
import kr.or.ddit.member.service.memberService;
import kr.or.ddit.member.service.memberServiceImple;
import kr.or.ddit.member.vo.MemberVo;
import kr.or.ddit.util.UploadUtil;
@WebServlet("/member/insertProc.do")
@MultipartConfig(fileSizeThreshold = 1024*1024, maxFileSize = 1024*1024*50, maxRequestSize = 1024*1024*50)
public class InsertProcController extends HttpServlet{

	
	//form.jsp 내용 받아오기
	// /member/insertProc.do

	memberService memberService = memberServiceImple.getinstance();
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		Part part = req.getPart("img");
		AttachFileVo fileVo = UploadUtil.writeFile(part);
		
		// file insert
		int fileNo = memberService.getMaxFileNo();
		fileVo.setFile_no(fileNo);
		
		memberService.insertFile(fileVo);
		
		String id = req.getParameter("id");
		String pw = req.getParameter("pw");
		String name = req.getParameter("name");
		String juso = req.getParameter("juso");
		String tell = req.getParameter("tell");
		
		int memNo = memberService.getMaXMemNo();
		

		MemberVo member = new MemberVo();
		member.setMem_no(memNo);
		member.setId(id);
		member.setPw(pw);
		member.setName(name);
		member.setJuso(juso);
		member.setTell(tell);
		member.setImg(fileNo);
		
		int cnt = memberService.insertMember(member);
		if(cnt == 0) {
			req.setAttribute("message", "fail");
			req.getRequestDispatcher("WEB-INf/view/member/form.jsp").forward(req, resp);
		}
		else {
			req.getRequestDispatcher("WEB-INf/view/member/view.jsp").forward(req, resp);
		}
	}
}
