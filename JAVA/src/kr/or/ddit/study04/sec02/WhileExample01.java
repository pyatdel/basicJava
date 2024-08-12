package kr.or.ddit.study04.sec02;

import java.util.Scanner;

public class WhileExample01 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		WhileExample01 obj = new WhileExample01();
		obj.process();
	}

	public void process() {
//		method1();
//		method2();
//		method3();
//		method4();
		method5();
	}

	public void method1() {
//		while(조건식) 끝나는 시점이 언제인지 잘 모를때 사용
//		for( ;true;) {
//		
//		}
		int i=0;
		while (i<10) { // while(true) =무한루프
			System.out.println("실행");
			i++;
		}
	}
	
	public void method2() {
//		키오스크(종료하는 시점이 언제인지 모름)
		
		String menu="";
		menu+="1. 아메리카노(2000)\n";
		menu+="2. 딸기에이드(3000)\n";
		menu+="3. 종료\n";
		
		int sum=0;
		while(true) {
			System.out.println(menu);
			
			int sel = sc.nextInt();
			if(sel ==1) sum+=2000;
			if(sel ==2) sum+=3000;
			if(sel ==3) break;
		}
		System.out.println("총 결제 금액은 : "+sum+"원 입니다.");
	}
	
	public void method3() {
		short s = 10;
		while(s>0) {
			System.out.println(s++);
		}
	}
	
	public void method4() {
//		각 자리수의 합을 구하시오
//		123 -> 1+2+3

		System.out.println("숫자를 입력해주세요");
		int num = sc.nextInt();

//		while(num>0) {
//			for(int i=0; i<num; i++) {
//				a  = num.charAt(i);
//			}
//			
//		}

		int sum = 0;
		while (num > 0) {
			sum += num % 10;
			num /= 10;
		}
		System.out.println(sum);
	}
	
	public void method5() {
//		do while의 경우, 최초 1회 실행은 무조건 보장합니다.
		do {
			System.out.println("실행");
		} while (false);
	}
}