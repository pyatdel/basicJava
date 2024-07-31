package kr.or.ddit.MyStudy.Chapter03;

import java.util.Scanner;

public class One {
	public static void main(String[] args) {
		One Test = new One();
		Test.Start();
	}

	public void Start() {
//		one01();
//		one02();
//		one03();
//		one04();
//		one05();
//		one06();
//		one07();
//		one08();
//		one09();
//		one10();
		one11();
	}

	public void one01() {
		byte b = 5;
		b = (byte)-b;
		int result = 10 / b;
		System.out.println(result);
	}
	
	public void one02() {
		int x = 10;
		int y = 20;
		int z = (++x) + (y--);
		System.out.println(z);
	}
	
	public void one03() {
//		boolean stop = ''';
//		while() {
//			
//		}
	}
	
	public void one04() {
		int pencils = 534;
		int students = 30;
		
//		학생 1명이 갖는 연필 개수
		int pencilsPerStudent = pencils/students;
		System.out.println(pencilsPerStudent);
		
//		남은 연필 개수
		int pencilsLeft = pencils%students;
		System.out.println(pencilsLeft);
	}
	
	public void one05() {
		int var1 = 5;
		int var2 = 2; 
		double var3 = var1 / var2; 
		int var4 = (int)(var3*var2); 
		System.out.println(var4);
	}
	
	public void one06() {
		int value = 356;
		
		System.out.println(value - value % 100);
		System.out.println(value / 100*100);
	}
	
	public void one07() {
		float var1 = 10f;
		float var2 = var1 / 100;
		if(var2 == 0.1) {
			System.out.println("10%입니다.");
		} else {
			System.out.println("10%가 아닙니다.");
			System.out.println(var2);
		}
	}
	
	public void one08() {
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		double area = (lengthTop+lengthBottom)*height/2.0;
		System.out.println(area);	
	}
	
	public void one09() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫 번째 수를 입력하세요 :");
		String fNum = sc.next();
		
		System.out.println("두 번째 수를 입력하세요 :");
		String tNum = sc.next();
		
		System.out.println("첫 번째 수 :"+fNum);
		System.out.println("두 번째 수 :"+tNum);
		
		double fcNum = Double.parseDouble(fNum);
		double tcNum = Double.parseDouble(tNum);
		
		double cal = fcNum / tcNum;
		String out = (tcNum==0)||(tcNum==0.0) ? "(or 결과: 무한대)" : ""+cal;
		
		System.out.println(out);
	}
	
	public void one10() {
		int var1 = 10;
		int var2 = 3;
		int var3 = 14;
		double var4 = var1 * var1 * Double.parseDouble(var2 + "." + var3);
		System.out.println("원의 넓이: " + var4);
	}
	
	public void one11() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("아이디:");
		String name = scanner.nextLine();
		
		System.out.print("패스워드:");
		String strPassword = scanner.nextLine();
		int password = Integer.parseInt(strPassword);
		
		if("java".equals(name)) {
			if (password==12345) {
				System.out.println("로그인 성공");
			} else {
				System.out.println("로그인 실패: 패스워드가 틀림");
			}
		} else {
			System.out.println("로그인 실패: 아이디가 존재하지 않음");
		}
	}
}
