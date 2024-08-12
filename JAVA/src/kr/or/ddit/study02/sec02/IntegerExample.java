package kr.or.ddit.study02.sec02;

public class IntegerExample {
	public static void main(String[] args) {
//	정수형
//	1. byte : 1byte(-128!127)
//	2. short : 2byte (-32768~32767)
//	3. int : 4byte (-2~^31~2^31-1) 정수 기본형
//	4. long : 8byte(-2^63~2^63-1) 뒤에 L, l

		byte b1 = 127;
		System.out.println("b1=" + b1);

//	byte 사용 범위를 벗어난  경우 컴파일 에러 발생
//	byte b2 = 128;

		short s1 = 100;
		System.out.println("s1="+s1);
//	short s2 = s1+10;
		short s2 = (short) (s1 + 10);
		
		int i1 = 100;
		System.out.println("i1="+i1);
		int i2 = i1+10;
		
		long l1 = 100;
		System.out.println("l1="+l1);
		long l2 = l1+10;
		long l3 = 1000000001;
		
		int var1 = 200;
//		8진법 -> 0~7을 사용하는 숫자체계
		int var2 = 0200;
//		16진법 -> 0~f 까지 사용
//		ff -> 16*15 + 15
//		200 -> 16^2*2
		int var3 = 0x200;
//		2진법 -> 0, 1 사용
		int var4 = 0b1011;
		System.out.println("var1="+var1);
		System.out.println("var2="+var2);
		System.out.println("var3="+var3);
		System.out.println("var4="+var4);

	}
}
