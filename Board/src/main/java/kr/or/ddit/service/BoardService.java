package kr.or.ddit.service;

import java.util.List;

import kr.or.ddit.vo.BoardVo;

public interface BoardService {
	public List<BoardVo> cateList();
	
	public List<BoardVo> boardList(int code_no);
	
	public BoardVo boardDetail(int board_no);
}
