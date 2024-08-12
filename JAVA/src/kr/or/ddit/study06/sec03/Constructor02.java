package kr.or.ddit.study06.sec03;

public class Constructor02 {
	
//	오버로딩과 오버라이딩의 차이점(면접 질문 단골)
//	생성자 오버로딩
	
//	파라미터 값에 따라 호출되는 생성자가 다르다.
	
//	매개변수의 종류, 갯수에 따라 호출 클래스가 달라진다.
	
	public Constructor02() {
		System.out.println("기본 생성자");
	}
	
	public Constructor02(String a) {
		System.out.println("생성자 String a"+a);
	}
	
	public Constructor02(String a, String b) {
		System.out.println("생성자 String a, String b"+a+","+b);
	}
	
	public Constructor02(String a, int b) {
		System.out.println("생성자 String a, int b"+a+","+b);
	}
	
	public Constructor02(int a, String b) {
		System.out.println("생성자 int a, String b"+a+","+b);
	}

	
	
	/*
	 * 변수 명만 바꾼 파라미터는 중복이 됩니다. public Constructor02(int c, String d) {
	 * System.out.println("생성자 int a, String b"); }
	 */
	
	
}

