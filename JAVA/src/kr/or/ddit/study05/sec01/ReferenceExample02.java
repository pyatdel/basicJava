package kr.or.ddit.study05.sec01;

import java.util.Scanner;

public class ReferenceExample02 {
Scanner sc = new Scanner(System.in);

public static void main(String[] args) {
	ReferenceExample02 obj = new ReferenceExample02();
	obj.process();
}

public void process() {
	method1();
}

public void method1() {
	int a = 10;
//	스택에 int 10의 값 저장
	if(a==10) {
//		스택에 int sum = 0의 값 저장
		int sum =0;
//		
		for(int i=0; i<=2; i++) {
//			스택에 int i=0의 값 저장
			sum+=i;
//			sum을 i만큼 더함
		}
//		i 값이 사라짐
		
//		int b = 20의 값을 만듦
		int b =20;
		
//		스택에 주소값 10이 들어감
		String str = "abc";
	}
//	int sum이 스택 영역에서 사라짐
	
//	스택 영역에 int sum = 0의 값을 넣어줌
	int sum = 0;
	
	for(int i=2; i<4; i++) {
//		스택에 int i=2를 만듦
		
//		sum에 i의 값을 더함
		sum+=i;
		
	}
//	int i의 값이 사라짐
	
//	new가 있으면 무조건 힙 영역에 새로 만듦
	String str2 = new String("abc");
	
//	힙 영역에 만들어줌
	String str3 = "def";
}
}
