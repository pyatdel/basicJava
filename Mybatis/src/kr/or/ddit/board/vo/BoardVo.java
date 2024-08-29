package kr.or.ddit.board.vo;

import lombok.Data;

@Data
public class BoardVo {
	private int boardNo;
	private String title;
	private String content;
	private String regDate;
	private int memNo;
	private int cnt;
	private int state;
	private int codeNo;
	
	private String writer;
	private String codeName;
	
}
