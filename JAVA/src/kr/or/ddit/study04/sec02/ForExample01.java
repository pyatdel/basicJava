package kr.or.ddit.study04.sec02;

import java.util.Scanner;

public class ForExample01 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ForExample01 obj = new ForExample01();
		obj.process();
	}

	public void process() {
//		method1();
//		method2();
//		method3();
//		method4();
//		method5();
//		method6();
//		method7();
//		method8();
//		method9();
//		method10();
//		method11();
//		method12();
//		method13();
//		method14();
		method15();
//		method16();
	}

	public void method1() {
		for(int i=0; i<3; i++) {
			System.out.println("실행");
		}
	}
	
	public void method2() {
//		반복문을 이용해서 1~5까지 출력
		int count=0;
		for(int i=0; i<5; i++) {
			count +=1;
			System.out.println(count);
		}
	}
	
	public void method3() {
//		1~10까지의 합을 구하시오

		int sum = 0;
		for(int i=1; i<11; i++) {
			sum  +=i;
			
			System.out.println(sum);
		}
	}
	
	public void method4() {
//		5~10까지의 합을 구하시오
		

		int sum = 0;
		for(int i=5; i<=10; i++) {
			sum +=i;

			System.out.println(sum);
		}
	}
	
	public void method5() {
//		1~10까지 홀수의 합을 구하시오
		int sum = 0;
		for (int i=1; i<=10; i++) {
			if (i%2==1) {
				sum +=i;			
			}
		}
		System.out.println(sum);
	}
	
	public void method6() {
//		1~10까지 짝수의 합을 구하시오

		int sum = 0;
		for (int i=2; i<=10; i+=2) {
			
				sum +=i;				
		}
		System.out.println(sum);
	}
	
	public void method7() {
//		a~z까지 출력하시오
		
//		char ch = 'a';
//		for(int i=0; i<26; i++) {
//			ch = (char)(ch+1);
//			System.out.println(ch);
			
			for(char ch='a'; ch<'z'; ch++) {
				System.out.println(ch);
		}
	}
	
	public void method8() {
//		입력한 문자부터 ~z까지 출력하시오
		System.out.println("문자를 입력하세요: ");
		String alpha = sc.next();
		
		
		for(char ch = alpha.charAt(0); ch<'z'; ch++) {
			System.out.println(ch);
		}
	}
	
	public void method9() {
//		a부터 입력한 문자까지 출력하시오
		
		System.out.println("문자를 입력하세요: ");
		String alpha = sc.next();
		

		for(char ch='a'; ch <= alpha.charAt(0); ch++) {
			System.out.println(ch);
		}
	}
	
	public void method10() {
//		z~a까지 출력하시오

		for (char ch = 'z'; ch >= 'a'; ch--) {
			System.out.println(ch);
		}
	}
	
	public void method11() {
//		문자를 거꾸로 출력하시오
//		cup -> puc
//		str.length(); : 문자 길이를 구하는 함수
		
		System.out.println("문자를 입력하세요: ");
		String str = sc.next();
		
//		for(int i=str.length()-1; i>=0; i--) {
//			System.out.print(str.charAt(i));
//		}
		
//		권장방법
		for(int i=0; i<=str.length()-1; i++) {
			System.out.print(str.charAt(str.length()-1-i));
		}
	}
	
	public void method12() {
//		1	2	3	4
//		8	7	6	5
//		9	10	11	12
//		16	14	14	13
		
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++){
				int num = 0;
				if (i%2==0) num = i*4+j+1;
				if (i%2==1) num = i*4+4-j;
				System.out.print(num + "\t");
			}
			System.out.println();
		}
	}
	
	public void method13() {
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.println(i+", "+j);
			}
		}
	}
	
	public void method14() {
//		1	2	3	4
//		5	6	7	8
//		9	10	11	12
//		13	14	15	16
		

		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++){
				int num = i*4+j+1;
				System.out.print(num + "\t");
			}
			System.out.println();
		}
	}
	
	public void method15() {
//		1	5	9	13
//		2	6	10	14
//		3	7	11	15
//		4	8	12	16
		

		
//		for(int i=0; i<4; i++) {
//			int num = i+1;
//			System.out.print(num + "\n");
//			for(int j=0; j<4; j++){
//				
//			}
//			System.out.println();
//		}
		
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				int num = i+j*4+1;
				System.out.print(num+"\t");
			}
			System.out.println();
		}
	}
	
	public void method16() {
//		1	8	9	16
//		2	7	10	15
//		3	6	11	14
//		4	5	12	13
		
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				int num=0;
				if(j%2==0) num =  i+j*4+1;
				if(j%2==1) num = -i+j*4+4;
				System.out.print(num+"\t");
			}
			System.out.println();
		}
	}
}
