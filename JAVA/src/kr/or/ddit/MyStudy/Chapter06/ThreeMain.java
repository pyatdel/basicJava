package kr.or.ddit.MyStudy.Chapter06;

public class ThreeMain {
public static void main(String[] args) {
	Three c1 = new Three("title", "content", "로그인한 회원아이디", "현재 컴퓨터 날짜", 0);
	System.out.println(c1.title+","+c1.content+","+c1.writer+","+c1.date+","+c1.hitcount);
	System.out.println();
	
	
	Three c2 = new Three("title", "content", "로그인한 회원아이디", "가나다라");
	System.out.println(c2.title+","+c2.content+","+c2.writer+","+c2.date+","+c2.hitcount);
	System.out.println();

}
}
