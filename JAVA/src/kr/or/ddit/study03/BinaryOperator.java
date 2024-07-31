package kr.or.ddit.study03;

import java.util.Scanner;

public class BinaryOperator {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		BinaryOperator obj = new BinaryOperator();
		obj.process();
	}

	public void process() {
//	이항 연산자: 대부분의 연산자
//	피연산자가 2개인 것 2+3 <- 피연산자 2, 3
//	산술 연산자, 관계 연산자, 논리 연산자, 비트 연산자, 대입 연산자
//		method1();
//		method2();
//		method3();
//		method4();
//		method5();
//		method6();		
	}

	public void method1() {
//		산술 연산자
//		+ - / * %
		
		int a = 10;
		int b = 7;
		System.out.println("a+b = "+(a+b));
		System.out.println("a-b = "+(a-b));
		System.out.println("a/b = "+(a/b));
		System.out.println("a*b = "+(a*b));
		System.out.println("a%b = "+(a%b));
	}
	
	public void method2() {
//		관계 연산자
//		> < == >= <= !=
		
		System.out.println("점수를 입력하세요");
		int num = sc.nextInt();
		
//		if(num>60) {
//			System.out.println("합격");
//		} 
//		
//		if(num<=60) {
//			System.out.println("불합격");
//		}
		
		if(num%2!=0) {
			System.out.println("짝수");
		}
	}
	
	public void method3() {
//		논리 연산자
//		&& || !
//		A && B: A, B 중 하나라도 거짓이면 거짓
//		A || B: A, B 중 하나라도 참이면 참
		
		boolean a = true;
		boolean b = false;
		
		System.out.println(a&&b); // 거짓
		System.out.println(a||b); // 참
		
		System.out.println(!a||!b); // 참
		System.out.println(a&&!b); // 참
		
		System.out.println(!(a&&b)||b); // 참
		
//		1보다 크고 5보다 작으면 참
		int num = 3;
		boolean result = (1<num)&&(num<5);
		
//		0보다 작거나 100보다 크다면 참
		int test = 48;
		boolean check = (0<test)||(test>100);

		System.out.printf("결과는 %s", check);
	}
	
	public void method4() {
//		논리 연산자
//		A	00010111
//		B	00001010
//		%	00000100
//		|	00111101
		
		int a = 45;
		int b = 20;
		
		System.out.println(a&b);
		System.out.println(a|b);
	}
	
	public void method5() {
//		시프트 연산자
//		>> <<
//		0010000 >> 0000100
		
		System.out.println(32>>2);
		System.out.println(32<<2);		
	}
	
	public void method6() {
//		- : '='	오른쪽 값을 '=' 왼쪽에 저장 우선순위가 늦다
//		=과 다른 연산자 결합가능
//		+=	a=a+b -> a+=b
//		-=
//		*=
//		%=
		
		int a = 10;
		int b = 4;
		
		System.out.println("a=a+b => a+=b "+(a+=b));
		System.out.println("a=a-b => a-=b "+(a-=b));
		System.out.println("a=a*b => a*=b "+(a*=b));
		System.out.println("a=a/b => a/=b "+(a/=b));
		System.out.println("a=a%b => a%=b "+(a%=b));
		
//		a값에 10을 더하시오
		a += 10;
		System.out.println(a);
	}
}

