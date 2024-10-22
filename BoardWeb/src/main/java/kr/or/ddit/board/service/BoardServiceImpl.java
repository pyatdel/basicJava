package kr.or.ddit.board.service;

import java.util.List;

import kr.or.ddit.board.dao.BoardDaoImpl;
import kr.or.ddit.board.dao.IBoardDao;
import kr.or.ddit.board.vo.BoardVo;

public class BoardServiceImpl implements IBoardService {

	private static BoardServiceImpl instance;

	private BoardServiceImpl() {

	}

	public static BoardServiceImpl getinstance() {
		if (instance == null) {
			instance = new BoardServiceImpl();
		}
		return instance;
	}

	IBoardDao boardDao = BoardDaoImpl.getinstance();
	@Override
	public List<BoardVo> cateList() {
		// TODO Auto-generated method stub
		return boardDao.cateList();
	}

	@Override
	public List<BoardVo> boardList(BoardVo board) {
		// TODO Auto-generated method stub
		return boardDao.boardList(board);
	}

}
