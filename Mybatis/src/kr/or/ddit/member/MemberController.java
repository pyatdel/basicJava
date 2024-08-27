package kr.or.ddit.member;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import kr.or.ddit.util.ScanUtil;
import kr.or.ddit.view.View;

public class MemberController {

	public static Map sessionStorage = new HashMap(); 
	MemberService memberService = MemberService.getInstacne();
	
	public static void main(String[] args) {
		MemberController mc = new MemberController();
		mc.process();
	}
	
	public void process() {
		// 1. 회원 가입 
		// 2. 회원 로그인 
		
		// 회원 로그인 
		// 1. 회원 리스트 
		// 2. 회원 정보 수정 
		// 3. 회원 정보 삭제 
		
		// 회원 리스트  
		// 출력 후 메인 이동 
		View view = View.MAIN;
		while(true) {
			switch (view) {
				case MAIN:
					view = memberMain();
					break;
				case JOIN:
					view = memberJoin();
					break;
				case LOGIN:
					view = memberLogin();
					break;
				case MYMENU:
					view = myMenu();
					break;
				case LIST:
					view = memberList();
					break;
				case UPDATE:
					view = memberUpdate();
					break;
				case DELETE:
					view = memberDelete();
					break;
			}
		}
	}

	private View memberDelete() {
		System.out.println("회원 삭제");
		String id = ScanUtil.nextLine("삭제할 ID : ");
		String pw = ScanUtil.nextLine("삭제할 PW : ");
		
		MemberVo member = new MemberVo();
		member.setId(id);
		member.setPw(pw);
		MemberVo targetMember = memberService.getMember(member);
		
//		if(targetMember == null) {
//			System.out.println("해당 회원이 없습니다.");
//			return View.MYMENU;
//		}
//		
//		String result = memberService.deleteMember(targetMember);
//		if(result > 0) {
//			System.out.println("회원 정보를 삭제 했습니다.");
//		} else {
//			System.out.println("회원 정보를 삭제하지 못했습니다.");
//		}
		return View.MYMENU;
	}

	private View memberUpdate() {
		System.out.println("정보 수정");
		System.out.println("1. 패스워드");
		System.out.println("2. 이름");
		
		MemberVo mem = (MemberVo) sessionStorage.get("member");
		
		int sel = ScanUtil.menu();
		MemberVo member = new MemberVo();
		member.setMem_no(mem.getMem_no());
		if(sel ==1) member.setPw(  ScanUtil.nextLine("PW : "));
		if(sel ==2) member.setName(ScanUtil.nextLine("이름 : "));
		
		memberService.updateMember(member);
		
		return View.MYMENU;
	}

	private View memberList() {
		
		List<MemberVo> list = memberService.getAll();
		for (MemberVo memberVo : list) {
			System.out.println(memberVo);
		}
		
		return View.MYMENU;
	}

	private View myMenu() {
		System.out.println("1. 회원 리스트     ");
		System.out.println("2. 회원 정보 수정   ");
		System.out.println("3. 회원 정보 삭제   ");
		int sel = ScanUtil.menu();
		if(sel ==1) return View.LIST;
		if(sel ==2) return View.UPDATE;
		if(sel ==3) return View.DELETE;
		return View.MYMENU;
	}

	private View memberJoin() {
		System.out.println("회원 가입");
		String id = ScanUtil.nextLine(" ID : ");
		String pw = ScanUtil.nextLine(" PW : ");
		String name = ScanUtil.nextLine(" 이름 : ");
		
		MemberVo member = new MemberVo();
		member.setId(id);
		member.setPw(pw);
		member.setName(name);
		
		member = memberService.getMember(member);
	}

	private View memberLogin() {
		System.out.println("로그인");
		String id = ScanUtil.nextLine(" ID : ");
		String pw = ScanUtil.nextLine(" PW : ");
		MemberVo member = new MemberVo();
		member.setId(id);
		member.setPw(pw);
		member = memberService.getMember(member);
		if(member == null) {
			System.out.println("로그인 실패");
			System.out.println("1. 재 로그인");
			System.out.println("2. 회원가입");
			System.out.println("3. 메인");
			int sel = ScanUtil.menu();
			if(sel == 1) return View.LOGIN;
			if(sel == 2) return View.JOIN;
			if(sel == 3) return View.MAIN;
		}
		sessionStorage.put("member", member);
		System.out.println(member.getName()+"님 환영합니다.");
		return View.MYMENU;
	}

	private View memberMain() {
		System.out.println("1. 회원 가입    ");
		System.out.println("2. 회원 로그인   ");
		int sel = ScanUtil.menu();
		if(sel == 1) return View.JOIN; 
		if(sel == 2) return View.LOGIN;
		return View.MAIN;
	}
	
}
