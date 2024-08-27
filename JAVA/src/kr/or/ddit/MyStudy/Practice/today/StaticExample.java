package kr.or.ddit.MyStudy.Practice.today;

public class StaticExample {

	static int a;
	int b;
	
	public void method1() {
		a=10;
		b=10;
	}
	
	public void method2() {
		
	}
	
	public static void method3() {
		a=10;
//		b=10;
		method4();
//		method1();
	}
	
	public static void method4() {
		
	}
}
