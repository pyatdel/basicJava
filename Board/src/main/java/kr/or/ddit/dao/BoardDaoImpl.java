package kr.or.ddit.dao;

import java.util.List;

import kr.or.ddit.mybatis.MyBatisDao;
import kr.or.ddit.vo.BoardVo;

public class BoardDaoImpl extends MyBatisDao implements BoardDao {

	private static BoardDaoImpl instance;

	private BoardDaoImpl() {

	}

	public static BoardDaoImpl getInstacne() {
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
	public List<BoardVo> boardList(int code_no) {
		return selectList("board.boardList", code_no);
	}

	@Override
	public BoardVo boardDetail(int board_no) {
		return selectOne("board.boardDetail", board_no);
	}

}
