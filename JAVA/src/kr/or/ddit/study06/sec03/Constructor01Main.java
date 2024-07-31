package kr.or.ddit.study06.sec03;

public class Constructor01Main {
public static void main(String[] args) {
	
//							기본 생성자
	Constructor01 c = new Constructor01();
	
//	클래스 생성 방법 : new 클래스 이름()
	
	Constructor01 c1 = new Constructor01("필드", 123);
	
	Constructor01 c2 = new Constructor01("평야");
	
	Constructor01 c3 = new Constructor01(4747);
	
	System.out.println(c1.field1 + c2.field1 + c3.field2);
	
	}
}
