package kr.or.ddit.study02.sec04;

import java.util.Scanner;

public class test {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		test obj = new test();
		obj.process();
	}

	public void process() {
		method1();
		method2();
	}
	
	public void method2() {
		System.out.println("method2");
		System.out.println("method2");
		System.out.println("method2");
		System.out.println("method2");
		System.out.println("method2");
	}
	public void method1() {
		System.out.println("method1");
		System.out.println("method1");
		System.out.println("method1");
		System.out.println("method1");
		System.out.println("method1");
	}
}
