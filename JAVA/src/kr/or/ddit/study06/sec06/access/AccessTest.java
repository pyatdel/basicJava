package kr.or.ddit.study06.sec06.access;

public class AccessTest {
	public static void main(String[] args) {
		AccessTest at = new AccessTest();
		at.method1();
		at.method2();
		at.method3();
		at.method4();
	}
	
	public void method1() {
		
	}
	
	protected void method2() {
		
	}
	
//	Default
	void method3() {
		
	}
	
//	내부 클래스에서만 사용 가능
	private void method4() {
		
	}
}

