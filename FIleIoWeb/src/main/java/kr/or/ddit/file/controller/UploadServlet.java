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
@WebServlet("/upload.do")
@MultipartConfig(fileSizeThreshold = 1024*1024*3,
		maxFileSize = 1024*1024*50, maxRequestSize = 1024*1024*50)
public class UploadServlet extends HttpServlet{

	String upload_dir = "upload_files";
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// Multipart parsing 전에 파라미터 조회하기
		
		System.out.println("Multipart parsing 전 : " + req.getParameter("sender"));
		
		String uploadPath = "D:/" + upload_dir;
		File uploadDir = new File(uploadPath);
		if(!uploadDir.exists()) {
			uploadDir.mkdirs();
		}
		
		String fileName = "";
		for(Part part : req.getParts()) { 
			System.out.println("header : "+part.getHeader("content-disposition"));
			
			fileName = getFileName(part);
			
			if(fileName!=null && !fileName.equals("")) {
				part.write(uploadPath+"/"+fileName);
				System.out.println("파일명 => "+fileName+" 저장 완료");
			}
		}
	
	}
	
	/**
	 * Part 정보를 파싱하여 파일 이름 추출하기
	 * @param Part파일 이름 추출할 Part객체
	 * @return 파일명 : 파일명이 존재하지 않으면(폼필드인 경우) null 리턴함
	 *
	 */
	private String getFileName(Part part) {
		
		/*
		 * Content-Disposition 헤더에 대하여
		 * 
		 * 파일 업로드 사용되는 경우
		 * 
		 * Content-Disposition: form-data
		 * Content-Disposition: form-data; name="필드명"
		 * Content-Disposition: form-data; name="필드명"; filename="파일명"
		 */
		
		for(String content : part.getHeader("content-Disposition").split(";")) {
			if(content.trim().startsWith("filename")) {
				return content.substring(content.indexOf("=")+1).trim().replace("\"", "");
			}
		}
		
		return null;
	}
}
