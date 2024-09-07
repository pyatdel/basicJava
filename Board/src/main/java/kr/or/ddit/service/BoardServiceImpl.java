package kr.or.ddit.service;

import java.util.List;

import kr.or.ddit.dao.BoardDao;
import kr.or.ddit.dao.BoardDaoImpl;
import kr.or.ddit.vo.BoardVo;

public class BoardServiceImpl implements BoardService {

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
	public List<BoardVo> cateList() {
		return boardDao.cateList();
	}

	@Override
	public List<BoardVo> boardList(int code_no) {
		return boardDao.boardList(code_no);
	}

	@Override
	public BoardVo boardDetail(int board_no) {
		return boardDao.boardDetail(board_no);
	}

}
