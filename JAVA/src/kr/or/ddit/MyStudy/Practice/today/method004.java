package kr.or.ddit.MyStudy.Practice.today;

public class method004 {

	public static void main(String[] args) {
		method004 m = new method004();
		
		m.a=20;
		m.method1();
	}
	
	
	int a;
	int b;
	
	
	public void method1() {
		System.out.println("a : "+a);
		System.out.println("method1");
		method2();
	}
	
	public void method2() {
		this.a = 10;
//		m.a = 10;
		System.out.println("a : "+a);
		System.out.println("method2");
	}
}