package kr.or.ddit.study02.sec04;

import java.util.Scanner;

//import java.util.Scanner;

public class PrintExamaple {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		PrintExamaple obj = new PrintExamaple();
		obj.process();
	}

	public void process() {
		method1();
		method2();
		method3();
	}
	
	public void method1() {
//		println - 줄바꿈 기능
		System.out.println("대전시");
		System.out.println("중구");
		System.out.println("계룡로");
		System.out.println("34061");
		
	}
	
	public void method2() {
//		print - 줄바꿈 기능 x
		System.out.print("대전시\n");
		System.out.print("중구\n");
		System.out.print("계룡로\n");
		System.out.print("34061\n");
	}
	
	public void method3() {
//		printf - 형식 지정 문자열
//		정수 : %d, 실수 : %f, 문자열 : %s
//		System.out.printf("형식지정 문자열", 변수 리스트)
		System.out.printf("이름 :%s 나이: %d", "양형운", 20);
		
		String name = "양형운";
		int age = 20;
		System.out.println("이름 :" + name + "나이 :" + age);
	}
}
