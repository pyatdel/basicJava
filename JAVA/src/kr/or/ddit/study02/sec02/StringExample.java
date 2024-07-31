package kr.or.ddit.study02.sec02;

public class StringExample {
	public static void main(String[] args) {
//	문자와 문자열
//	문자: 한글자 데이터로 ''로 묶어 선언 => char
//	문자열 :복수개의 글자로 표현된 자료(기본타입x) ""로 묶어 선언
//	=> String

		String str = "abcdefg";
		str = str + 10;
		System.out.println(str);
		
		int a= 20;
		int b= 24;
		
//		String year = a+b+"";
		String year =""+ a+b;
		System.out.println("year = "+year);
//		string + normal type = string
	}
}
