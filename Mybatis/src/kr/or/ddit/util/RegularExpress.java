package kr.or.ddit.util;

import java.util.Arrays;
import java.util.regex.Pattern;

public class RegularExpress {
	public static void main(String[] args) {
//		String str ="testtest";
//		
//		// 
//		boolean result = str.matches("\\d+");
//		System.out.println(result);
		
		
		// 숫자 찾기
//		String str = "1a2b3c";
//		String result = str.replaceAll("\\d", "");
//		System.out.println(result);
		
		// 숫자 찾기2
//		String str = "(1(2(3";
//		String[] tokens = str.split("\\(");
//		System.out.println(Arrays.toString(tokens));
		
//		Pattern.matches("정규식", "대상문자열");
//		boolean b = Pattern.matches("\\d+", "1234");
//		System.out.println(b);
		
		// 자바 변수규칙
		// $ _ , 숫자로 시작할 수 없고 a-z 사용 ->
//		boolean c = Pattern.matches("^[a-z$_][a-zA-Z0-9$_]", "");
		
		String str = "a 		b		c 		\t\t\t de f";
		// 공백이 여러개라면 하나로 바꾸기
		

		String result = str.replaceAll("\\s+", " ");
		System.out.println(result);
	}
}
