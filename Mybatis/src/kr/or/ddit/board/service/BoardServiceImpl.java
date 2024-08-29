package kr.or.ddit.board.service;

import java.util.List;
import java.util.Map;

import kr.or.ddit.board.dao.BoardDao;
import kr.or.ddit.board.dao.BoardDaoImpl;
import kr.or.ddit.board.vo.BoardVo;

public class BoardServiceImpl implements BoardService{

	private static BoardServiceImpl instance;

	private BoardServiceImpl() {

	}

	public static BoardServiceImpl getInstacne() {
		if (instance == null) {
			instance = new BoardServiceImpl();
		}
		return instance;
	}

	private BoardDao boardDao = BoardDaoImpl.getInstacne();
	
	@Override
	public int insertBoard(BoardVo board) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public BoardVo selectBoard(BoardVo board) {
		
		boardDao.updateCnt(board.getBoardNo());
		
		return boardDao.selectBoard(board);
	}

	@Override
	public List<BoardVo> listBoard(Map param) {
		return boardDao.listBoard(param);
	}

	@Override
	public int updateBoard(BoardVo board) {
		return boardDao.updateBoard(board);
	}

	@Override
	public int deleteBoard(int boardNo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<BoardVo> codeList() {
		return boardDao.codeList();
	}

}
