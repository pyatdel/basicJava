package kr.or.ddit.MyStudy.Chapter02;

import java.util.Scanner;

public class Three {
	public static void main(String[] args) {
		Three Test = new Three();
		Test.Start();
	}

	public void Start() {
//		Three09();
//		Three10();
//		Three11();
//		Four01();
//		Four02();
		Four03();
		
	}

	public void Three09() {
		System.out.println("Helloworld");
	long var1 = 2L;
	float var2 = 1.8f;
	double var3 = 2.5;
	String var4 = "3.9";
	int result =(int)var1 + (int)(var2 + var3) + (int)Float.parseFloat(var4);
	System.out.println(result);
	}
	
	public void Three10() {
		String str1 = 2 + 3 + "";
		String str2 = 2 + "" + 3;
		String str3 = "" + 2 + 3;
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
	}
	public void Three11() {
		byte value1 	= Byte.parseByte("10");
		int value2 		= Integer.parseInt("1000");
		float value3	= Float.parseFloat("20.5");
		double value4 	= Double.parseDouble("3.14159");
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);
	}
	
	public void Four01() {
		String name = "감자바";
		int age = 25;
		String tel1="010", tel2="123", tel3="4567";
		System.out.println(name);
		System.out.print(age);
		System.out.printf("\n전화 : %s-%s-%s",tel1, tel2, tel3);
		}
	
	public void Four02() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫 번재 수:");
		String strNum1 = scanner.next();
		
		System.out.print("두 번째 수:");
		String strNum2 = scanner.next();
		
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		
		int result = num1 + num2;
		System.out.println("덧셈결과:" + result);
	}
	
	public void Four03() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요: ");
		String Name = sc.next();
		System.out.print("주민번호 앞 6자리를 입력하세요: ");
		String prNum = sc.next();
		System.out.print("전화번호를 입력하세요: ");
		String phNum = sc.next();
		
		System.out.printf("이름 : %s\n",Name);
		System.out.printf("주민번호 앞 6자리 : %s\n",prNum);
		System.out.printf("전화번호 : %s",phNum);
	}
}
