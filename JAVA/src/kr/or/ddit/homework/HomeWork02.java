package kr.or.ddit.homework;

import java.util.Scanner;

public class HomeWork02 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork02 obj = new HomeWork02();
		obj.process();
	}

	public void process() {
		method1();
//		method2();
//		method3();
//		method4();
//		method5();
	}
	
	public void method5() {
//		소수점 둘째자리에서 반올림
//		12.32131 => 12.32
//		12.32731 => 12.33
		
		/*
		 * String str = sc.next();

double d1 = Double.valueof(str) + 0.5;

int num = (int)d1;

System.out.pringln(num);

		 */
	}
	
	public void method4() {
//		3자리 숫자의 각 자릿수 합을 구하시오.
//		123 => 1 + 2 + 3 = 6
		System.out.println("3자리 숫자를 입력하시오");
		String str = sc.next();
		char fir = str.charAt(0);
		char sec = str.charAt(1);
		char thi = str.charAt(2);
		System.out.println("fir :"+fir);
		String first = fir + "";
		System.out.println("first :"+first);
		int firsist = Integer.valueOf(first);
		System.out.println("sec :"+sec);
		String second = sec + "";
		System.out.println("second :"+second);
		int seconded = Integer.valueOf(second);
		System.out.println("thi :"+thi);
		String third = thi + "";
		System.out.println("third :"+third);
		int thirdy = Integer.valueOf(third);
		int total = (firsist + seconded + thirdy);
		System.out.println(total);
//		hint :char로 꺼내기, int 값으로 바꿔서 각 자리 수 나누기
		
		
		/// ANOTHER 
		/*
		 * int num = Integer.valueof(str);

int i1 = num / 100;
num = num - i1*100;
		 */
	}
	
	public void method3() {
//		스캐너를 통해 소문자를 입력 받고 대문자로 바꾸시오.
		System.out.println("소문자를 입력하시오.");
		String str = sc.next();
		char c1 = str.charAt(0);
		System.out.println("c1 :" + c1);
		char c3 = (char)(c1-32);
		System.out.println("c3 :" + c3);
	}
	
	public void method2() {
//		스캐너를 통해 대문자를 입력 받고 소문자로 바꾸시오.
		System.out.println("대문자를 입력하시오.");
		String str = sc.next();
		char c1 = str.charAt(0);
		System.out.println("c1 :" + c1);
		char c3 = (char)(c1+32);
		System.out.println("c3 :" + c3);
		
		// ANOTHER
		/*
		 * String str = sc.next();
char c1 = str.charAt(0);
char c2 = str.charAt(1);
char c3 = str.charAt(2);
int i1 = c1 -'0';
int i2 = c2 - 0';
int i3 = c3 -'0';

or
c1 = (char)(c1+32);
c2 = (char)(c2+32);
c3 = (char)(c3+32);
		 */
	}
	
	public void method1() {
//		스캐너를 통해서 실수를 입력 받고
//		소수점 둘째자리까지 출력
//		ex) 12.2346412 -> 12.23
//		hint *100 and /100
		System.out.println("제발 소수점 한 자리의 실수만 입력해주세요.");
		String str = sc.next();
		double charstr = Math.floor(Double.parseDouble(str)*100)/1000;
		System.out.println(charstr);
//		double chastr = Double.valueOf(str);
//		double chastr1 = chastr * 10 / 100;
	
		
//		System.out.println(chastr1);
		
		/// ANOTHER
		
		/*
		 * double d1 = Double.parseDouble(str);

int d100 = (int)(d1*100);

d1 = d100/100.0;
system.out.println(d1);

		 */
	}
}
