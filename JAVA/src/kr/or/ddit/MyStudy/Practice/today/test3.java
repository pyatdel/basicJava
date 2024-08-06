package kr.or.ddit.MyStudy.Practice.today;


public class test3 {
	public static void main(String[] args) {
		test3 m = new test3();
		m.a = 20;
		m.method1();
	}

	
	int a;
	int b;
	
	
	public void method1() {
		System.out.println("method1 a : "+a);
		method2(a);
	}
	
	public void method2(int a) {
		this.a = 10;
		System.out.println("method2 a : "+this.a);
	}
}
