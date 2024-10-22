package kr.or.ddit.board.service;

import java.util.List;

import kr.or.ddit.board.vo.BoardVo;

public interface IBoardService {
	
	/**
	 * 카테고리 리스트
	 * @return
	 */
	public List<BoardVo> cateList();
	
	
	/**
	 * 게시판 리스트
	 * @return
	 */
	public List<BoardVo> boardList(BoardVo board);
}
