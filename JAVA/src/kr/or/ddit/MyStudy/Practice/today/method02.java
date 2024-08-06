package kr.or.ddit.MyStudy.Practice.today;

public class method02 {
	public static void main(String[] args) {
		method02 m = new method02();

		m.method1(10);
		m.method2("테스트");
		m.method3("테스트1", "테스트2");
		m.method4("테스트1", "테스트2");
	}
	
	public void method1(int a) {
		System.out.println("외부에서 준 파라미터 값 : "+a);
	}
	
	public void method2(String str) {
		System.out.println("외부에서 준 파라미터 값 : "+str);
	}

	public void method3(String str, String str2) {
		System.out.println("외부에서 준 파라미터 값 : "+str+","+str2);
	}
	
	public void method4(String str2, String str) {
		System.out.println("외부에서 준 파라미터 값 : "+str2+","+str);
	}
}
