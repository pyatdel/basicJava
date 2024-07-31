package kr.or.ddit.study02.sec01;

public class JavaVar04 {

	int a;
	int b;

	public void method1() {
		int c;
//		a, b, c
		if (1 == 1) {
			int d;
//			a, b, c, d
		}
		int e;
//		a, b, c, e
		int d;
	}

	// 사라진 d의 값을 다시 찾는 방법
	public void method2() {
		int f;
//		a, b, f
		int g;
	}
//	a, b
}

//c와 java의 속도 차이는 거의 없으며
//DB에서의 손실이 훨씬 크다.