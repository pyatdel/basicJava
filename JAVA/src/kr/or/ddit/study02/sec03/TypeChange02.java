package kr.or.ddit.study02.sec03;

public class TypeChange02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		byte < short < int < long < float < double < String
		
//		강제 타입 변환
//		type1 변수명 (type1)type2
		
//		int -> short
		int i1 = 10;
		short s1 = (short)i1;
		
//		int -> byte
		int i2 = 10;
		int s2 = (byte)i2;
		
//		long -> int
		long i3 = 10;
		long s3 = (int)i3;
		
//		double -> int
		double i4 = 10;
		double s4 = (byte)i4;
		
		System.out.println(i4);
		
//		int -> char
//		c5 를 대문자 A로 바꾸기
		char c5 = 'a';
		System.out.println(c5);
		int c10 = Integer.valueOf(c5);
		System.out.println("c10 =" + c10);
		char c6 = (char)(c5-32);
		
		System.out.println(c6);
		
//		c7을 소문자 a로 바꾸기
		char c7 = 'A';
		char c8 = (char)(c7+32);
		
		System.out.println("정수형 : " + (int)c7 + "\n문자형 : " + (char)c7 );
	}

}
