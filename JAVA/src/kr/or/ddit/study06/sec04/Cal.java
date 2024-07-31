package kr.or.ddit.study06.sec04;

public class Cal {
	public static void main(String[] args) {
		Cal cal = new Cal();
		cal.add(1, 2);
		cal.minus(5, 3);
		cal.mul(4, 3);
		cal.div(52, 4);
	}
//	메소드 명을 작성할 때는 소문자 시작으로!
//	파라미터 int a, b 넣어주고 a+b 값을 출력
	public void add(int a, int b) {
		System.out.println(a+b);
	}
	
//	파라미터 int a, b 넣어주고 a-b 값을 출력
	public void minus(int a, int b) {
		System.out.println(a-b);
	}

//	파라미터 int a, b 넣어주고 a*b 값을 출력
	public void mul(int a, int b) {
		System.out.println(a*b);
	}
	
//	파라미터 int a, b 넣어주고 a/b 값을 출력
	public void div(int a, int b) {
		System.out.println(a/b);
	}
}

