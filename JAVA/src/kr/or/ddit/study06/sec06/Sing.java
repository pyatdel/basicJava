package kr.or.ddit.study06.sec06;

public class Sing {
//	가수, 가사, 년도
	
//	SingMain에서 2개 생성하고 출력해보기
//	toString 사용하지 말고 getter 이용해 볼 것
	
	
//	_______________________________________(안보고 하기)
	
	
	
	private String Singer;
	private String Lyrics;
	private int Year;
	
	public void setSinger(String singer) {
		this.Singer = singer;
	}
	
	public String getLyrics() {
		return Lyrics;
	}
	
	public void getYears() {
		this.Year=Year;
	}
}
