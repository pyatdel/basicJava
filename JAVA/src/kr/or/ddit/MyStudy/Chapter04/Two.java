package kr.or.ddit.MyStudy.Chapter04;

import java.util.Scanner;

public class Two {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Two obj = new Two();
		obj.process();
	}

	public void process() {
//		method01();
//		method02();
//		method03();
//		method04();
//		method05();
//		method06();
		method07();
	}

	public void method01() {

	}
	
	public void method02() {
//		for문을 이용해서 1~100까지의 정수중에서 3의 배수의 총합을 구하는 코드입니다.
		int sum=0;
		for(int i=3; i<=100; i=i+3) {
			sum+=i;
			System.out.println(sum);
		} 
	}
	
	public void method03() {
//	while문과 Math.random() 메소드를 이용해서 2개의 주사위를 던졌을 때 나오는 눈을 (눈1, 눈2)	 형태로 출력하고,
//	눈의 합이 5가 아니면 계속 주사위를 던지고, 눈의 합이 5이면 실행을 멈추는 코드를 작성해보세요
		int sum =0;
		while(sum!=5) {
			int dice1 = (int) (Math.random() * 6+1);
			int dice2 = (int) (Math.random() * 6+1);
			
			sum=dice1 + dice2;
			System.out.println("("+dice1+","+dice2+")");
		}
	}
	
	public void method04() {
//		중첩 for문을 이용하여 방정식 4x +5y = 60의 모든 해를 구해서(x, y) 형태로 출력해보세요.
//		단, x와 y는 10 이하의 자연수입니다.
//		int sum=60;
//		int x=1;
//		int y=1;
//		
//		for(int i=1; i<60; i=i+4) {
//			for(int j=0; j<0; j++) {
//				if(i*j)
//			}
		}
		
		public void method05() {
//			for문을 이용해서 다음과 같이 *을 출력하는 코드를 작성해보세요(1)
//			
//			*
//			**
//			***
//			****
			for(int i=1; i<=4; i++) {
				for(int j=1; j<=i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
	}
		
		public void method06() {
//			for문을 이용해서 다음과 같이 *을 출력하는 코드를 작성해보세요(2)
			
//			   *
//			  **
//			 ***
//			****
			
			for(int i=1; i<=4; i++) {
				for(int j=1; j<=4-i; j++) {
					System.out.print(" ");
				}
				for(int j=1; j<=i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
		
		public void method07() {
//			while문과 scanner를 이용해서 키보드로 입력된 데이터로 예금, 출금, 조회, 종료 기능을 제공하는 코드를 
//			( )안에 작성해보세요. 
//			프로그램을 실행하면 다음과 같은 실행결과가 나와야 합니다.(Scanner의 nextLine() 사용)
			
		}
}
