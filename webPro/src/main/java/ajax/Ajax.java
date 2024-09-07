package ajax;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

@WebServlet("/Ajax")
public class Ajax extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Ajax() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		String param = request.getParameter("uNm"); //key=value
		
		//json데이터를 받기 위해 BufferedReader객체의 도움을 받음
		BufferedReader reader = request.getReader();
		String param = reader.readLine(); //Enter로 경계를 인식해 string을 반환받음
		
//		System.out.println(">>>>>>>>>>>>>>>" + param);
		
		//gson라이브러리를 사용해 json문자열 >> 자바에서 사용가능한 객체 형태로 변환 처리
		JsonParser parser = new JsonParser();
		JsonObject obj = (JsonObject)parser.parse(param);
		System.out.println(">>>>>>>>>>>>>>>" + obj.get("반장").getAsString());
		
		//응답에 대한 인코딩 처리 해 주기
		response.setCharacterEncoding("utf-8");
		
		//요청한 위치로 응답 전달하기 - Writer객체 사용하기
		PrintWriter writer = response.getWriter();
//		writer.write(obj.get("반장").getAsString() + " 응답정보받아라~~");
		
		String data = obj.get("반장").getAsString();
		
		//json형식으로 응답 전달하기
		writer.write("{\"pkj\":\"" + data + "\"}");
		
		
		
	}

}
