package kr.or.ddit.study08.board;

import lombok.Data;

@Data

public class BoardVo {
	private int no;
	private String title;
	private String content;
	private String writer;
	private String reg_date;
	
	
}
