package kr.or.ddit.file.controller;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URLEncoder;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import kr.or.ddit.file.vo.AttachFileVo;
import kr.or.ddit.member.service.memberService;
import kr.or.ddit.member.service.memberServiceImple;
@WebServlet("/download.do")
public class DownloadServlet extends HttpServlet{

	
	memberService memberService = memberServiceImple.getinstance();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		
		//디비에서 정보 가져오기
		int fileNo = Integer.parseInt(req.getParameter("fileNo"));
		
		AttachFileVo fileVo = memberService.getFile(fileNo);
		
		//fileNO pk 값으로 디비에서 가져오기
		
		String path = "D:/upload_files";
		
		String orgName = fileVo.getFile_org_name();
		String fileName =fileVo.getFile_name();
		
		//file 다운로드
		//download.do 요청
		//디비에서 요청에 해당하는 파일 경로 + 파일 이름
		
		//파일 읽어오기
		
		//파일을 다운로드하기 위한 은답 헤더 정보 설정하기
		resp.setContentType("application/octet-stream");
		
		resp.setHeader("Content-Disposition", "attachment; filename=\""
					+ URLEncoder.encode(fileName,"UTF-8")
					.replaceAll("\\+", "%20")+"\"");
		
		//파일 읽어오기
		File file = new File(path +"/"+fileName);
		FileInputStream fis = new FileInputStream(file);
		BufferedInputStream bis = new BufferedInputStream(fis);
		
		//파일 내보내기
		BufferedOutputStream bos = new BufferedOutputStream(resp.getOutputStream());
		
		int data = 0;
		while((data=bis.read()) !=-1) {
			bos.write(data);
		}
		
		bis.close();
		bos.close();
	}
}
