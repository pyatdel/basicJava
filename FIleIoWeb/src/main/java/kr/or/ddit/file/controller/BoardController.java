package kr.or.ddit.file.controller;

import java.io.File;
import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;
@WebServlet("/upload2.do")
@MultipartConfig(fileSizeThreshold = 1024*1204*3,
maxFileSize = 1024*1024*100, maxRequestSize = 1024*1024*100)
public class BoardController extends HttpServlet{
	String upload_dir = "uploar_files";
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
		// form 데이터
		// 게시판 번호, 제목, 내용, 파일 -> 파일 업로드 처리
		String uploadPath = "D:/"+upload_dir;
		File uploadDir = new File(uploadPath);
		if(!uploadDir.exists()){
			uploadDir.mkdirs();
		}
		
		String fileName = "";
		for(Part part : req.getParts()) {
			System.out.println("header : "+part.getHeader("content-disposition"));
			
			fileName = 
			
			
			
		}
		// 데이터 받아지는 지 확인
	}
	
	
}
