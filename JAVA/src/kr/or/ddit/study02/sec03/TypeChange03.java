package kr.or.ddit.study02.sec03;

import java.util.Scanner;

public class TypeChange03 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		TypeChange03 obj = new TypeChange03();
		obj.process();
	}

	public void process() {
		method1();
		method2();
//		method3();
//		method4();
		method5();
	}
	
	public void method5() {
		System.out.println("           국어 점수 입력 :\n");
		String kor = sc.next();
		System.out.println("           영어 점수 입력 :\n");
		String eng = sc.next();
		System.out.println("           수학 점수 입력 :\n");
		String math = sc.next();
		
		System.out.println("국어 : "+ kor+",  영어 :" + eng+",  수학 :" + math);
//		총점, 평균 구하기
		int k = Integer.valueOf(kor);
		int e = Integer.valueOf(eng);
		int m = Integer.valueOf(math);
		
		int sum = k+e+m;
		double avg = sum/3.0;
		int avg10 = (int)(avg*10);
		avg = avg10/10.0;
		
		System.out.println("총점: "+sum);
		System.out.println("평균: "+avg);
	}
	
	public void method4() {
//		10.3231 -> 10.3
		
		/*System.out.println("실수를 입력하세요.");
		String num1 = sc.next();
		
		double chanum1 = Double.parseDouble(num1);
		
		System.out.println("실수를 입력하세요.");
		String num2 = sc.next();
		
		double chanum2 = Double.parseDouble(num2);
		
		double avg1 = chanum1 / chanum2 ;
		System.out.println(avg1);
		
		System.out.println("실수를 입력하세요.");
		String num3 = sc.next();
		
		double chanum3 = Double.parseDouble(num3);
		
		double avg2 = avg1 / chanum3 ;
		System.out.println(avg2);
	
		*/
//		==>>
		System.out.println("실수를 입력하세요.");
		String num = sc.next();
		
		double numDouble = Double.parseDouble(num);
		System.out.println(numDouble);
		
		int numInt = (int)(numDouble*10);
		
		double result = numInt / 10.0;
		System.out.println("소수점 첫째자리까지 출력 :"+ result);
	}
	
	public void method3() {
		System.out.println("           국어 점수 입력 :\n");
		String kor1 = sc.next();
		System.out.println("           영어 점수 입력 :\n");
		String eng1 = sc.next();
		System.out.println("           수학 점수 입력 :\n");
		String math1 = sc.next();
		
//		총점, 평균 구하기
		int kor2 = Integer.valueOf(kor1);
		int eng2 = Integer.valueOf(eng1);
		int math2 = Integer.valueOf(math1);
		
		int total = kor2 + eng2 + math2;
		double aver = (double)total / 3;
//		or double aver = total / 3.0;
		
//		System.out.println("총점 :" + tatal + "\n평균 :" + aver);
		
	}
	
	public void method2() {
//		String -> basicType
		
//		String -> 기본 타입
//		대문자 기본타입.valueof();
//		대문자 기본타입.parse대문자 기본타입();
		String s1 = "10";
		byte b1 = Byte.valueOf(s1);
		short sh1 = Short.parseShort(s1);
		int i1 = Integer.valueOf(s1);
		long l1 = Long.valueOf(s1);
		float f1 = Float.valueOf(s1);
		double d1 = Double.valueOf(s1);
		
		String s2 = "True";
		boolean bl1 = Boolean.valueOf(s2);
	}
	public void method1() {
//		기본타입 -> String
//		String + anyType -> String
		int i1 = 20;
		String s1 = "" + i1;
		String s2 = String.valueOf(i1);
		
		
	}

}
