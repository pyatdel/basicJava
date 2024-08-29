package kr.or.ddit.board.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import kr.or.ddit.board.View;
import kr.or.ddit.board.service.BoardService;
import kr.or.ddit.board.service.BoardServiceImpl;
import kr.or.ddit.board.vo.BoardVo;
import kr.or.ddit.member.MemberService;
import kr.or.ddit.member.MemberVo;
import kr.or.ddit.util.ScanUtil;

public class BoardController {
	
	static Map parameterMap = new HashMap();
	static Map sessionStorage = new HashMap();
	
	BoardService  boardService = BoardServiceImpl.getInstacne();
	MemberService memberService = MemberService.getInstacne();
	
	public static void main(String[] args) {
		BoardController bc = new BoardController();
		bc.process();
	}
	
	public void process() {
		View view = View.MAIN;
		while(true) {
			switch (view) {
				case MAIN: view = boardMain();
					break;
				case BOARD_lIST: view = boardList();
					break;
				case BOARD_DETAIL: view = boardDetail();
					break;
				case BOARD_UPDATE: view = boardUpdate();
					break;
				case LOGIN: view = login();
					break;
				default:
					break;
			}
		}
	}

	private View login() {
		String id = ScanUtil.nextLine("ID : ");
		String pw = ScanUtil.nextLine("PW : ");
		
		MemberVo member = new MemberVo();
		member.setId(id);
		member.setPw(pw);
		
		member = memberService.getMember(member);
		if(member == null) {
			System.out.println("로그인 실패");
			return View.LOGIN;
		}
		
		sessionStorage.put("member", member);
		View view = (View) parameterMap.get("View");
		if(view == null) return View.MAIN;
		
		return view;
	}

	private View boardUpdate() {
		if(!sessionStorage.containsKey("member")) {
			parameterMap.put("View", View.BOARD_UPDATE);
			return View.LOGIN;
		}
		
		int boardNo = (int) parameterMap.get("boardNo");
		BoardVo board = new BoardVo();
		board.setBoardNo(boardNo);
		board = boardService.selectBoard(board);
		
		MemberVo member = (MemberVo) sessionStorage.get("member");
		
		if(board.getMemNo() != member.getMem_no()) {
			System.out.println("게시글 작성자가 아닙니다.");
			return View.BOARD_lIST;
		}
		// 게시판 수정
		System.out.println("1. 제목");
		System.out.println("2. 내용");
		int sel = ScanUtil.menu();
		BoardVo board2 = new BoardVo();
		
		if(sel ==1) {
			board2.setTitle(ScanUtil.nextLine("제목 : "));
		}
		if(sel ==2) {
			board2.setContent(ScanUtil.nextLine("내용 : "));
		}
		board2.setBoardNo(boardNo);
		
		boardService.updateBoard(board2);
		
		
		return View.BOARD_DETAIL;
	}

	private View boardDetail() {
		int boardNo = (int) parameterMap.get("boardNo");
		// 
		BoardVo board = new BoardVo();
		board.setBoardNo(boardNo);
		board = boardService.selectBoard(board);
		
		System.out.println(board);
		System.out.println("1. 수정");
		System.out.println("2. 삭제");
		int sel = ScanUtil.menu();
		if(sel == 1) return View.BOARD_UPDATE;
		if(sel == 2) return View.BOARD_DELETE; 
		return View.BOARD_DETAIL;
	}

	private View boardList() {
		int codeNo = (int) parameterMap.get("codeNo");
		
		int pageNo = 1;
		int blockSize = 5;
		int listSize = 100;
		if(parameterMap.containsKey("pageNo")) pageNo = (int) parameterMap.remove("pageNo");
		if(parameterMap.containsKey("blockSize")) pageNo = (int) parameterMap.remove("blockSize");
		
		int maxSize = listSize/blockSize;
		int startNo = 1 + blockSize*(pageNo-1);
		int endNo = blockSize*pageNo;
		
		Map map = new HashMap();
		map.put("codeNo", codeNo);
		map.put("startNo", startNo);
		map.put("endNo", endNo);
		
		List<BoardVo> boardList = boardService.listBoard(map);
		for (BoardVo boardVo : boardList) {
			System.out.println(boardVo);
		}
		
		System.out.println("1. 상세페이지");
		System.out.println("2. 메인");
		System.out.println("< 이전 페이지    다음페이지 >");
		String sel = ScanUtil.nextLine("선택 : ");
		
		if(sel.equals("1")) {
			int boardNo = ScanUtil.nextInt("게시판 번호 : ");
			parameterMap.put("boardNo", boardNo);
			return View.BOARD_DETAIL;
		}
		if(sel.equals("2")) return View.MAIN;
		if(sel.equals("<")) {
			if(pageNo!=1) pageNo--;
		}
		if(sel.equals(">")) {
			if(pageNo!=maxSize) pageNo++;
		}
		parameterMap.put("pageNo", pageNo);
		
		
		return View.BOARD_lIST;
	}

	private View boardMain() {
		List<BoardVo> codeList = boardService.codeList();
		for (BoardVo boardVo : codeList) {
			System.out.println(boardVo.getCodeNo()+". " +boardVo.getCodeName());
		}
		int codeNo = ScanUtil.nextInt("조회할 게시판 : ");
		parameterMap.put("codeNo", codeNo);
		return View.BOARD_lIST;
	}
}
