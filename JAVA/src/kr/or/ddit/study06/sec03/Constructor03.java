package kr.or.ddit.study06.sec03;

public class Constructor03 {
	

//	생성자 오버로딩
	
//	파라미터 값에 따라 호출되는 생성자가 다르다.
	
	public Constructor03() {
		System.out.println("기본생성자");
	}
	
	public Constructor03(String a) {
		this();
		System.out.println("생성자 String a");
	}
	
	public Constructor03(String a, String b) {
		this(a);
		System.out.println("생성자 String a, String b");
	}
	
	
	public Constructor03(String a, String b, String c) {
		this(a, b);
		System.out.println("생성자 String a, String b, String c");
		}
	}
