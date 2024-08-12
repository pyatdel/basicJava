package kr.or.ddit.study02.sec02;

public class CharExample {
	public static void main(String[] args) {
//		 char
//		 부호 없는 2byte 정수(0~65535)
		
		char c1 = 66;
		System.out.println("c1="+c1);
//		문자는 하나 저장 가능
		char c2 = 'a';
//		char c3 = c1 + 1;
		char c3 = (char)(c1+1);
		System.out.println("c3="+c3);
		
		char c4 = '가';
		System.out.println("c4="+c4);
		System.out.println(c4+0);
		char c5 = 44032;
		System.out.println(c5);
	}
}
