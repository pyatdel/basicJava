package kr.or.ddit.homework;

import java.util.Scanner;

public class HomeWork03 {
Scanner sc = new Scanner(System.in);

public static void main(String[] args) {
	HomeWork03 obj = new HomeWork03();
	obj.process();
}

public void process() {
//	method1();
	method2();
	
}
public void method2() {
//	윤년 구하기
//	4년마다 윤년		1992, 1996 (2)
//	100년 마다 윤년 x	1900, 1800 (2)
//	400년 마다 윤년		2000, 1600, 1200 (1)
	System.out.print("년도 입력 : ");
	int year = sc.nextInt();
	
//	boolean fourhund	= year%400==0;
//	boolean hund		= year%100==0;
//	boolean four		= year==0;
//	
//	if(fourhund || (four && !hund)) {
//		
//	}
	
	if((year%400==0)||(year%4==0)&&(year%100!=0)) {
		System.out.println("윤년입니다.");
	}
	else {
		System.out.println("평년입니다.");
	}
	
//	String ckYear = (year%400==0)||(year%4==0)&&(year%100!=0) ? 
//				"윤년입니다." : "평년입니다.";
//	System.out.println(ckYear);
}

public void method1() {
//	1~50 사이 숫자를 맞추는 게임을 완성하시오
	
	double r = Math.random();
	System.out.println(r);
	
	int ran = (int)(Math.random()*50)+1;
	int cnt = 0;
	while(true) {
		System.out.print("0~50에 속하는, 랜덤한  숫자를 맞춰보세요 : ");
		int ans = sc.nextInt();
//		시행될 때마다 cnt 값을 1증가
		cnt +=1;
		if(ans>ran) {
			System.out.println("더 작은 수를 입력하세요");
		}
		if(ans<ran) {
			System.out.println("더 큰 수를 입력하세요");
		}
		if(ans==ran) {
			System.out.println("정답입니다.");
			break;
		}
	}
	System.out.println(cnt+ "번 만에 맞추셨습니다.");
}
}
