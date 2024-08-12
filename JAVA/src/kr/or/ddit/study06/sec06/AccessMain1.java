package kr.or.ddit.study06.sec06;

//같은 패키지말고, 다른 패키지에선 import를 해야 한다.
import kr.or.ddit.study06.sec06.access.AccessTest;

public class AccessMain1 {
	public static void main(String[] args) {
		AccessTest at = new AccessTest();
		at.method1(); 
		
//		protected는 같은 패키지에서만 호출 가능
//		at.method2();
		
//		Default는 같은 패키지에서만 호출 가능
//		at.method3();
//	private 는 외부 클래스에서 호출이 불가
//	at.method4();
	}
}
