package kr.or.ddit.vo;

import lombok.Data;

@Data
public class BoardVo {
	private int board_no;
	private String title;
	private String content;
	private String reg_date;
	private int mem_no;
	private int cnt;
	private int state;
	private int code_no;
	
	// 작성자 
	private String writer;
	
	// 게시판 타입 이름 
	private String code_name;
	
}
