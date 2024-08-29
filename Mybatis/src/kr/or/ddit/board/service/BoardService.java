package kr.or.ddit.board.service;

import java.util.List;
import java.util.Map;

import kr.or.ddit.board.vo.BoardVo;

public interface BoardService {
	
	
	/** 
	 *  코드 리스트 
	 */
	public List<BoardVo> codeList();
	
	/**
	 *  게시판 입력
	 */
	public int insertBoard(BoardVo board);
	
	/** 
	 * 상세 게시판 조회
	 */
	public BoardVo selectBoard(BoardVo board);
	
	/**
	 * 게시판 리스트 
	 * @param param 시작 startRow, 마지막 endRow 
	 * @return
	 */
	public List<BoardVo> listBoard(Map param);
	
	
	
	/**
	 * 게시판 내용 변경
	 * 제목, 내용, code_no
	 * @param board
	 * @return
	 */
	public int updateBoard(BoardVo board);
	
	
	
	/**
	 * 게시판 삭제
	 * @param boardNo
	 * @return
	 */
	public int deleteBoard(int boardNo);
}
