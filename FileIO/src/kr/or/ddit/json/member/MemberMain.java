package kr.or.ddit.json.member;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.json.JSONObject;

public class MemberMain {
	public static void main(String[] args) {
		MemberService service = MemberService.getInstance();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 : ");
		String id = sc.next();
		System.out.print("패스워드 : ");
		String pw = sc.next();
		
		List<Object> param = new ArrayList();
		param.add(id);
		param.add(pw);
		
//		아이디, 패스워드를 입력해서
//		Map map = service.getMember(param);
//		if(map !=null) {
//		데이터가 있다면 Json 형태로 출력
//			JSONObject json = new JSONObject(map);
//			System.out.println(json);
//		} else {
//		없다면 "아이디, 비번을 확인하세요" 출력
//			System.out.println("아이디 비번을 확인하세요");
//		}
		
		MemberVo member = service.getMember2(param);
		if(member !=null) {
			JSONObject json = new JSONObject(member);
		}
	}
}
