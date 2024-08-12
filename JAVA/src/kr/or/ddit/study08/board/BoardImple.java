package kr.or.ddit.study08.board;

public class BoardImple implements IBoard {

	@Override
	public BoardVo getBoard(int boardNo) {
		BoardVo board = new BoardVo();
		board.setNo(1);
		board.setContent("삼성전자");
		board.setReg_date("2024.07.24");
		board.setWriter("차병섭");
		board.setTitle("삼성전자, 4세대...");
		return null;
	}

	@Override
	public void insertBoard(BoardVo board) {
		// TODO Auto-generated method stub

	}

	@Override
	public void UpdateBoard(BoardVo board) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteBoard(int boardNo) {
		// TODO Auto-generated method stub

	}

}
