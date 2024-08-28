package kr.or.ddit.ham.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import kr.or.ddit.ham.View;
import kr.or.ddit.ham.service.HamService;
import kr.or.ddit.ham.service.HamServiceImpl;
import kr.or.ddit.ham.vo.MenuVo;
import kr.or.ddit.util.ScanUtil;

public class HamController {
	public static Map sessionStorage = new HashMap(); 
	
	private HamService hamService = HamServiceImpl.getInstacne();
	
	public static void main(String[] args) {
		HamController mc = new HamController();
		mc.process();
	}
	
	public void process() {
		View view = View.MAIN;
		while(true) {
			switch (view) {
				case MAIN : view = hamMain(); 
					break;
				case CUS : view = cusMain(); 
					break;
				case HAM_SET : view = hamSet(); 
					break;
				case HAM_SET_SINGLE : view = hamSetSingle(); 
					break;
				case ADMIN : view = adminMain(); 
					break;	
				case AD_MENU : view = adMenu();
					break;
				case AD_MENU_LIST : view = adMenuList();
					break;
				case AD_MEMU_ADD : view = adMenuAdd();
					break;
					
			}
		}
	}

	private View adMenuAdd() {
		
		String name = ScanUtil.nextLine("메뉴 이름 : ");
		// 그룹 번호 출력 할것 .
		List<Map<String, Object>> groupList = hamService.getGroup();
		for (Map<String, Object> map : groupList) {
			System.out.println(map);
		}
		int group_no = ScanUtil.nextInt("그룹 번호");
		int price = ScanUtil.nextInt("금액");
		
		MenuVo menu = new MenuVo();
		menu.setMenu_name(name);
		menu.setGroup_no(group_no);
		menu.setMemu_price(price);
		
		hamService.ineserMenu(menu);
		
		
		return null;
	}

	private View adMenuList() {
		MenuVo menu = new MenuVo();
		List<MenuVo> menuList = hamService.getSetSingle(menu);
		for (MenuVo menuVo : menuList) {
			System.out.println(menuVo);
		}
		
		System.out.println("1. 상세조회");
		System.out.println("2. 상위 메뉴");
		int sel = ScanUtil.menu();
		if(sel ==1) return null;
		if(sel ==2) return View.AD_MENU;
		return View.AD_MENU_LIST;
	}

	private View adMenu() {
		System.out.println("1. 메뉴 조회");
		System.out.println("2. 메뉴 추가");
		
		int sel = ScanUtil.menu();
		if(sel ==1 ) return View.AD_MENU_LIST;
		if(sel ==2 ) return View.AD_MEMU_ADD; 
		return View.AD_MENU;
	}

	private View adminMain() {
		System.out.println("1. 메뉴 ");
		System.out.println("2. 세트메뉴");
		System.out.println("3. 재료");
		
		int sel = ScanUtil.menu();
		if(sel == 1) return View.AD_MENU;
		if(sel == 2) return View.AD_SETMENU;
		if(sel == 3) return View.AD_STUFF;
		return View.ADMIN;
	}

	private View hamSetSingle() {
		MenuVo menu = new MenuVo();
		if(sessionStorage.containsKey("groupNo")) {
			int groupNo = (int) sessionStorage.remove("groupNo");
			menu.setGroup_no(groupNo);
		}
		List<MenuVo> menuList = new ArrayList();
		menuList = hamService.getSetSingle(menu);
		for (MenuVo menuVo : menuList) {
			System.out.println(menuVo);
		}
		System.out.println("1. 버거");
		System.out.println("2. 사이드 메뉴");
		System.out.println("3. 음료수");
		int sel = ScanUtil.menu();
		sessionStorage.put("groupNo", sel);
		
		
		return View.HAM_SET_SINGLE;
	}

	private View hamSet() {
		List<Map<String, Object>> list = hamService.getSetMenu();
		for (Map<String, Object> map : list) {
			System.out.println(map);
		}
		
		
		return View.CUS;
	}

	private View cusMain() {
		System.out.println("1. 단품 메뉴조회");
		System.out.println("2. 세트 메뉴 조회");
		int sel = ScanUtil.menu();
		if(sel ==1) return View.HAM_SET_SINGLE;
		if(sel ==2) return View.HAM_SET;
		return View.CUS;
	}

	private View hamMain() {
		System.out.println("1. 관리자");
		System.out.println("2. 직원");
		System.out.println("3. 고객");
		int sel = ScanUtil.menu();
		if(sel==1) return View.ADMIN;
		if(sel==2) return View.EMP;
		if(sel==3) return View.CUS;
		return View.MAIN;
	}

}
