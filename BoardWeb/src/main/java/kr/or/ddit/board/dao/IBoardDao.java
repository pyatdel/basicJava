package kr.or.ddit.board.dao;

import java.util.List;

import kr.or.ddit.board.vo.BoardVo;

public interface IBoardDao {

	public List<BoardVo> cateList();

	public List<BoardVo> boardList(BoardVo board);
}
