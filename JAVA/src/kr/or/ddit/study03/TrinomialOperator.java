package kr.or.ddit.study03;

import java.util.Scanner;

public class TrinomialOperator {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		TrinomialOperator obj = new TrinomialOperator();
		obj.process();
	}

	public void process() {
//	삼항 연산자 : 3개의 피연산자를 필요로 하는 연산
//	삼항 연산자는? 앞의 조건식의 결과에 따라 클론 앞뒤의
//			피연산자가 선택된다.
//			
//			조건식 ? 참 : 거짓
		
//		System.out.print("나이를 입력하세요 : ");
//		int age = sc.nextInt();
//		String message = age >= 18 ? "성년" : "미성년";
//		System.out.println(message);
		
//		a, b를 입력받고
//		a 값이 짝수라면 a+b
//		a 값이 홀수라면 a*b를 실행하시오
		
		System.out.print("첫번째 숫자를 입력하세요  : ");
		int a = sc.nextInt();
		System.out.print("두번째 숫자를 입력하세요 : ");
		int b = sc.nextInt();
		int check = (a%2==0) ? a+b : a*b;
		
		System.out.println(check);
	}
}
