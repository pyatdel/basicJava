package kr.or.ddit.study06.sec03;

public class SingMain {
	public static void main(String[] args) {
//		문자열은 , 로 구분
		Sing s1 = new Sing("출발","언덕 위","김동률",99);
		System.out.println(s1.title + "," + s1.lyings + "," + s1.actor+","+s1.score);
	}
	
	
}

