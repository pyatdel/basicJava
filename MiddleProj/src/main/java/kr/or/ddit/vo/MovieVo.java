package kr.or.ddit.vo;

import lombok.Data;

@Data
public class MovieVo {
	private String movieNo;
	private String movieName;
	private String moviePoster;
	private String movieCompany;
	private int movieRelease;
	private String movieCountry;
	private String movieContent;
	private int movieRunningtime;
	private String movieTrailer;
	private String movieLevel;
	private String movieState;
	private int start;
	private int end;
	private String genNo;
	private String search;
	
    private int rank; // 랭크 속성 추가

	
}
