package kr.or.ddit.study05.sec01;

import java.util.Scanner;

public class StringTest {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		StringTest obj = new StringTest();
		obj.process();
	}

	public void process() {
		method1();

	}

	public void method1() {
		String s1 = "홍길동";
		String s2 = "홍길동";
		String s3 = "강감찬";
		String s4 = new String("강감찬");
		String s5 = new String("강감찬");

		System.out.println(s1 == s2);
		System.out.println(s3 == s4);
		System.out.println(s4 == s5);
		
//		참조 타입은 equals를 사용해서 비교합니다.
		if(s3.equals(s4)) {
			System.out.println("같은 값");
		}
	}

}
