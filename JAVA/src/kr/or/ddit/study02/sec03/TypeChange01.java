package kr.or.ddit.study02.sec03;

public class TypeChange01 {
public static void main(String[] args) {
//	타입별 크기
//	byte < short < int < long < float < double < String
//			char < 

	
//	자동 타입 변환
//	작은 타입 값 -> 큰 타입으로 자동으로 변경된다.
//	byte -> int
	byte b1 = 10;
	int t1 = b1;
	
//	byte -> short
	byte b2 = 11;
	short s2 = b2;
	
//	byte -> char 자동 타입 변환 x
//	char -> int
	char c3 = 'a';
	int i3 = c3;
	}
}
