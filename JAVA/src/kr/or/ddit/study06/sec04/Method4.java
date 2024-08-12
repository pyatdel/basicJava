package kr.or.ddit.study06.sec04;

public class Method4 {
	int a;
	int b;
	
	public void method1() {
		System.out.println("a : "+a);
		System.out.println("method1");
		method2();
//		외부에서 메소드를 이용하고 싶으면?
//		새로운 객체를 생성해야 한다
//		Cal2 cal = new Cal2();
//		cal.add(a, b);
	}
	
	public void method2() {
		System.out.println("method2");
	}
}
