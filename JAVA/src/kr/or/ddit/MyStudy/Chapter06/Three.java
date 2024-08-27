package kr.or.ddit.MyStudy.Chapter06;

public class Three {
	String title;
	String content;
	String writer;
	String date;
	int hitcount;
		
	Three(String title, String content) {
		this.title = title;
		this.content = content;
		this.writer = "로그인한 회원아이디";
		this.date = "현재 컴퓨터 날짜";
		this.hitcount = 0;
//		this(title, content, "로그인한 회원아이디", "현재 컴퓨터 날짜", 0);
	}
	
	Three(String title, String content, String writer) { 
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.date = "현재 컴퓨터 날짜";
		this.hitcount = 0;
//		this(title, content, writer, "현재 컴퓨터 날짜", 0);
	}
	
	Three(String title, String content, String writer, String date) {
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.date = date;
		this.hitcount = 0;
//		this(title, content, writer, date, 0);
	}
	
	Three(String title, String content, String writer, String date, int hitcount) {
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.date = date;
		this.hitcount = hitcount;
	}
}

