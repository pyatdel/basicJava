package kr.or.ddit.study06.sec05;

public class StaticExample {

	static int a;
	int b;
	
	public void method1() {
		a=10;
		b=10;
	}
	
	public void method2() {
		
	}
	
//	static 은 항상 객체를 만들어야 사용이 가능!
	public static void method3() {
		a=10;
//		b=10;
		method4();
//		method1();
	}
	
	public static void method4() {
		
	}
	}

