package kr.or.ddit.study08.board;
//					I > interface
public interface IBoard {

//	CRUD
//	Create, Read, Update, Delete

//	Create
	public BoardVo getBoard(int boardNo);
	
//	Read
//	public void insertBoard(int no, String title, String content, String writer);
	public void insertBoard(BoardVo board);
	
//	Update
//	public void updateBoardTitle(int no, String title);
//	public void updateBoardTitle(int no, String content);
	public void UpdateBoard(BoardVo board);
	
//	Delete
	public void deleteBoard(int boardNo);
}
