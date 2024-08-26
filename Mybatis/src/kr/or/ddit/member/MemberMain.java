package kr.or.ddit.member;

import java.util.HashMap;
import java.util.Map;

public class MemberMain {
	public static void main(String[] args) {
		MemberMain mm = new MemberMain();
		mm.process();
	}
	
	MemberService service = MemberService.getInstacne();
	
	public void process() {
//		List<MemberVo> memList = service.getAll();
//		for (MemberVo memberVo : memList) {
//			System.out.println(memberVo);
//		}
		
//		MemberVo search = new MemberVo();
//		search.setId("a001");
//		search.setPw("java");
//		
//		MemberVo result = service.getMember(search);
//		System.out.println(result);
		
//		HashMap search = new HashMap();
//		search.put("id", "a001");
//		search.put("pw", "java");
//		
//		MemberVo result = service.getMember(search);
//		System.out.println(result);
//		
		MemberVo mem = new MemberVo();
		mem.setId("1231231" );
		mem.setPw("aaa");
		mem.setName("aaa");
		
		service.insertMember(mem);
	}
	
}
