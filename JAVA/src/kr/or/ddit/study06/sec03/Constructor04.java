package kr.or.ddit.study06.sec03;

public class Constructor04 {
	

//	생성자 오버로딩
	
//	파라미터 값에 따라 호출되는 생성자가 다르다.
	
	public Constructor04() {
		System.out.println("기본생성자");
	}
	
	public Constructor04(String a) {
		this();
		System.out.println("생성자 String a");
	}
	
	public Constructor04(String a, String b) {
		this(a);
		System.out.println("생성자 String a, String b");
	}
	
	
	public Constructor04(String a, String b, String c) {
		this(a, b);
		System.out.println("생성자 String a, String b, String c");
		}
	
	public static void main(String[] args) {
		Constructor03 c1 = new Constructor03("a", "b", "c");
		System.out.println(c1);
	}
	}