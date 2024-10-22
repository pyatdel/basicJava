package kr.or.ddit.board.dao;

import java.util.List;

import kr.or.ddit.board.vo.BoardVo;
import kr.or.ddit.mybatis.MyBatisDao;

public class BoardDaoImpl extends MyBatisDao implements IBoardDao {

	
	private static BoardDaoImpl instance;

	private BoardDaoImpl() {

	}

	public static BoardDaoImpl getinstance() {
		if (instance == null) {
			instance = new BoardDaoImpl();
		}
		return instance;
	}

	
	@Override
	public List<BoardVo> cateList() {

		return selectList("board.cateList");
	}

	@Override
	public List<BoardVo> boardList(BoardVo board) {
		// TODO Auto-generated method stub
		return selectList("board.boardList",board);
	}

}
