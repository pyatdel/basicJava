package kr.or.ddit.study08.board;

import kr.or.ddit.util.ScanUtil;

public class BoardFront {
	public static void main(String[] args) {

//	협업을 할 때는 인터페이스를 만들어야 한다

		IBoard board = new BoardImple();
		System.out.println("1. 게시판 등록");
		System.out.println("2. 게시판 조회");

		int sel = ScanUtil.nextInt("선택 : ");
		if (sel == 1) {
			System.out.println("== 게시판 등록 ==");
			String title = ScanUtil.nextLine("제목 : ");
			String content = ScanUtil.nextLine("내용 : ");
			String writer = ScanUtil.nextLine("작성자 : ");
			BoardVo bo = new BoardVo();
			bo.setTitle(title);
			bo.setContent(content);
			bo.setWriter(writer);
			board.insertBoard(bo);

		}
		if (sel == 2) {
			System.out.println("==게시판 조회==");
			int boardNo = ScanUtil.nextInt("게시판 번호 : ");
			BoardVo bo = board.getBoard(boardNo);
			System.out.println("====================================");
			System.out.println(bo.getNo()+'\t'+bo.getWriter()+'\t'+bo.getReg_date());
			System.out.println("====================================");
			System.out.println(bo.getContent());
			System.out.println("====================================");
		}
	}
}