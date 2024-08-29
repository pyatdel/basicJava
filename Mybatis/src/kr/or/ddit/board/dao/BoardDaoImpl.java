package kr.or.ddit.board.dao;

import java.util.List;
import java.util.Map;

import comm.dao.MyBatisDao;
import kr.or.ddit.board.vo.BoardVo;

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
	public int insertBoard(BoardVo board) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public BoardVo selectBoard(BoardVo board) {
		return selectOne("board.selectBoard", board);
	}

	@Override
	public void updateCnt(int boardNo) {
		update("board.updateCnt", boardNo);
	}

	@Override
	public List<BoardVo> listBoard(Map param) {
		return selectList("board.listBoard", param);
	}

	@Override
	public int updateBoard(BoardVo board) {
		return update("board.updateBoard", board);
	}

	@Override
	public int deleteBoard(int boardNo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<BoardVo> codeList() {
		return selectList("board.codeList");
	}

}
