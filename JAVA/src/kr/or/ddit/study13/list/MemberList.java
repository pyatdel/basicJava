package kr.or.ddit.study13.list;

import java.util.ArrayList;
import java.util.List;

import kr.or.ddit.util.ScanUtil;
import lombok.Data;

public class MemberList {
	// crud 
	// create read update delete 
	// 회원가입   조회    변경        삭제
	public static void main(String[] args) {
		MemberList obj = new MemberList();
		obj.process();
	}
	
	List<Member> list = new ArrayList();
	public void process() {
		while(true) {
			System.out.println("1. 회원 가입");
			System.out.println("2. 회원 조회");
			System.out.println("3. 회원 변경");
			System.out.println("4. 회원 탈퇴");
			int sel = ScanUtil.nextInt("선택 : ");
			if(sel ==1) addMember();
			if(sel ==2) printMember();
			if(sel ==3) updateMember();
			if(sel ==4) removeMember();
		}
	}
	//선생님 왜 update랑 remove만 private인가요??
	private void updateMember() {
		printMember();
		int num = ScanUtil.nextInt("수정할 회원 번호 : ");
		Member mem = list.get(num);
		mem.setName(ScanUtil.nextLine("이름 : "));
		mem.setAge(ScanUtil.nextInt("나이 : "));
		mem.setAddr(ScanUtil.nextLine("주소 : "));
	}

	private void removeMember() {
		printMember();
		int num = ScanUtil.nextInt("삭제할 회원 번호 : ");
		Member mem = list.remove(num);
		System.out.println(mem.getName()+"님이 탈퇴 되었습니다.");
	}

	public void printMember() {
//		for(int i=0; i<list.size(); i++) {
//			Member mem = list.get(i);
//			System.out.println(mem);
//		}
		
		for(Member mem : list) {
			System.out.println(mem);
		}
		
	}
	
	
	public void addMember() {
		Member member = new Member();
		// 회원 정보 입력 받고 list에 넣어보기.
		member.setName(ScanUtil.nextLine("이름 : "));
		member.setAge(ScanUtil.nextInt("나이 : "));
		member.setAddr(ScanUtil.nextLine("주소 : "));
		list.add(member);
	}
	
	
}
@Data
class Member{
	private String name;
	private int age;
	private String addr;
}



