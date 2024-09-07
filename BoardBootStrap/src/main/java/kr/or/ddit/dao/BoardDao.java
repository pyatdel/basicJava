package kr.or.ddit.dao;

import java.util.List;

import kr.or.ddit.vo.BoardVo;

public interface BoardDao {
	public List<BoardVo> cateList();
	
	public List<BoardVo> boardList(int cateNo);

	public BoardVo boardDetail(int board_no);
}
