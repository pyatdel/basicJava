package kr.or.ddit.study02.sec02;

public class StringExample02 {
	public static void main(String[] args) {
//		제어문자
//		인쇄할 수 없거나 키보드로 표현할 수 없는 특별한 문자를 가리키며
//		역슬래시(\)와 한개의 문자와 결합하여 작성
		
//		\n 		: 개행 문자
//		\r 		: 개행 문자
//		\r\n	: 개행 문자
//		\t		: 수평 탭 스크린 커서를 다음 탭으로 옮김
//		\\		: 역슬래시를 출력
//		\"		: 큰 따옴표를 출력
		
		String str1 ="가\r\n나";
		String str2 ="가\n\r나";
		
		System.out.println(str1);
		System.out.println(str2);
		
		System.out.println("\"401\"" + "호\t" + "\"박승민\"");
	}
}
