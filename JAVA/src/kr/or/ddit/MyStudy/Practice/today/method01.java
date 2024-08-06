package kr.or.ddit.MyStudy.Practice.today;

public class method01 {

	public static void main(String[] args) {
		method01 m = new method01();
		m.method1();
		m.method1(10, 12);
	}
	
	public void method1() {
		System.out.println("void method1()");
	}
	
	public void method1(int a, int b) {
		System.out.println(a+","+b);
	}
}
