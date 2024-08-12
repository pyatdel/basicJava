package controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import service.BoardService;
import service.MemberService;
import util.ScanUtil;
import view.View;
import vo.BoardVo;
import vo.MemberVo;

public class MainController {
	BoardService boardService = BoardService.getInstacne();
	MemberService memberService = MemberService.getInstacne();
	Map<String, Object> parameterMap = new HashMap();
	public static Map<String, Object> session = new HashMap();
	
	public static void main(String[] args) {
		MainController mc = new MainController();
		mc.process();
	}
	
	public void process() {
		View view = View.HOME;
		while(true) {
			switch (view) {
				case HOME:
					view = home();
					break;
				case BOARD_LIST:
					view = boardList();
					break;
				case BOARD_INSERT:
					view = boardInsert();
					break;
				case LOGIN:
					view = login();
					break;
			}
		}
	}

	private View login() {
		System.out.println("=== 로그인 ===");
		String id = ScanUtil.nextLine("아이디 : ");
		String pw = ScanUtil.nextLine("PW : ");
		List<Object> param = new ArrayList();
		param.add(id);
		param.add(pw); 
		
		boolean pass = memberService.login(param);
		if(!pass) {
			System.out.println("로그인에 실패 하셨습니다.");
			return View.LOGIN;
		}
		MemberVo member = (MemberVo) session.get("member");
		System.out.println(member.getName()+"님 환영합니다.");
		View view = (View) parameterMap.get("view");
		if(view!=null) return view;
		return View.HOME;
	}

	private View boardInsert() {
		if(!session.containsKey("member")) {
			parameterMap.put("view", View.BOARD_INSERT);
			return View.LOGIN;
		}
		
		MemberVo member = (MemberVo) session.get("member");
		
		String title = ScanUtil.nextLine("제목 : ");
		String content = ScanUtil.nextLine("내용 : ");
		int mem_no = member.getMem_no();
		
		List<Object> param  = new ArrayList();
		param.add(title);
		param.add(content);
		param.add(mem_no);
		param.add(parameterMap.get("CODE_NO"));
		// 쿼리 ~ 작성
		
		boardService.insertBoard(param);
		
		return View.BOARD_LIST;
	}

	private View boardList() {
		System.out.println("=== 게시판 리스트 ===");
		int codeNo = (int) parameterMap.get("CODE_NO");
		int pageNo = 1;
		if(parameterMap.containsKey("pageNo")) {
			pageNo = (int) parameterMap.remove("pageNo");
		}
		int blockSize = 5;
		int startNo =1+(pageNo-1)*blockSize;
		int endNo= pageNo*blockSize;
		
		List<Object> lastParam = new ArrayList();
		lastParam.add(blockSize);
		lastParam.add(codeNo);
		
		int lastNum = boardService.lastNum(lastParam);
		
		List<Object> param = new ArrayList();
		param.add(codeNo);
		param.add(startNo);
		param.add(endNo);
		
//		List<Map<String, Object>> list = boardService.boardList(param);
//		for (Map<String, Object> map : list) {
//			// 맵 데이터 꺼내서 출력
//			BigDecimal boardNo = (BigDecimal) map.get("BOARD_NO");
//			String title   = (String) map.get("TITLE");
//			String content = (String) map.get("CONTENT");
//			Timestamp date = (Timestamp) map.get("REG_DATE");
//			String name = (String) map.get("NAME");
//			BigDecimal cnt = (BigDecimal) map.get("CNT");
//			System.out.println(boardNo+"\t"+title+"\t"+content+"\t"+date+"\t"+name+"\t"+cnt);
//		}
		
		List<BoardVo> list = boardService.boardList2(param);
		for (BoardVo boardVo : list) {
			int no = boardVo.getBoard_no();
			String title = boardVo.getTitle();
			String content = boardVo.getContent();
			String date = boardVo.getReg_date();
			String name = boardVo.getName();
			int cnt = boardVo.getCnt();
			System.out.println(no+"\t"+title+"\t"+content+"\t"+date+"\t"+name+"\t"+cnt);
		}
		
		System.out.println("1. 게시판 작성");
		System.out.println("2. 상세 조회");
		System.out.println("<이전글 다음글>");
		String sel = ScanUtil.nextLine("선택 >>"); 
		if(sel.equals("<")) {
			if(pageNo !=1) {
				pageNo--;
				parameterMap.put("pageNo", pageNo);
			}
			else System.out.println("첫 페이지 입니다.");
			return View.BOARD_LIST;
		}
		if(sel.equals(">")) {
			// 디비에서 마지막 페이지 값 가져와서 처리 해야됨
			if(pageNo !=lastNum) {
				pageNo++;
				parameterMap.put("pageNo", pageNo);
			}
			else System.out.println("마지막 페이지 입니다.");
			return View.BOARD_LIST;
		}
		if(sel.equals("1")) return View.BOARD_INSERT;
		if(sel.equals("2")) {
			return View.BOARD_DETAIL;
		}
		return View.BOARD_LIST;
		
	}

	private View home() {
		System.out.println("=== 홈 ===");
		List<Map<String, Object>> list = boardService.codeList();
		for (Map<String, Object> map : list) {
			System.out.println(map.get("CODE_NO")+"."+map.get("CODE_NAME"));
		}
		int sel = ScanUtil.nextInt("선택 >>");
		parameterMap.put("CODE_NO", sel);
		return View.BOARD_LIST;
	}
}
