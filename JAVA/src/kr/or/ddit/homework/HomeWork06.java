package kr.or.ddit.homework;

import java.util.Scanner;

public class HomeWork06 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork06 obj = new HomeWork06();
		obj.process();
	}

	public void process() {
//		method1();
//		method2();
//		method3();
		method4();
	}

	public void method1() {
//		스캐너를 이용해서 구구단 한 단만 출력하시오
//		ex) 2
//			2 * 1 = 2
//			2 * 2 = 4
//			.
//			.
//			2 * 9 = 18
		System.out.println("2~9중 하나를 입력하세요");
		int num = sc.nextInt();

		for (int i = num; i <= num; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + "*" + j + "=" + i * j);
			}
		}
	}

	public void method2() {
//		구구단을 보기 좋게 출력하시오

//		2*1=2	3*1=3	4*1=4	...	9*1=9
//		2*2=2	3*2=3	4*2=4	...	9*2=18

		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {
				System.out.print(i + "*" + j + "=" + i * j + "\t");
			}
			System.out.println();
		}

//		for(int i-1; i<=9; i++) {
//			for (int j=2; j<=9; j++) {
//				System.out.print(j+"*"+i+"="+j*i+"\t");
//			}
//		}
	}

	public void method3() {
//		스캐너를 이용해서 특정 단을 뺀 구구단을 출력하시오.
//		ex) 3
//		2*1=2	3*1=3	4*1=4	...	9*1=9
//		2*2=2	3*2=3	4*2=4	...	9*2=18
		
		System.out.println("2~9중 하나를 입력하세요");
		int num = sc.nextInt();
		
		for(int i=1; i<=9; i++) {
			if(i==num) continue;
			for(int j=1; j<=9; j++) {
				System.out.print(i+"*"+j+"="+i*j+"\t");
			}
			System.out.println();
		}
		

//		for(int i=1; i<=9; i++) {
//			for(int j=2; j<=9; j++) {
//				if (j==num) continue;
//				System.out.print(i+"*"+j+"="+i*j+"\t");
//			}
//			System.out.println();
//		}
	}

	public void method4() {
//		홀수를 입력하면 홀수의 합
//		짝수를 입력하면 짝수제곱의 합을 구하시오.
//		ex) 5-> 1+3+5
//			6-> 2*2 + 4*4+6*6
		System.out.println("홀수나 짝수를 입력하세요");
		int num = sc.nextInt();
		int sum = 0;
		
//		if(num%2==0) {
//		for(int i=2; i<=num; i+=2) {
//			sum+=i*i;
//			System.out.println("짝수의 합: " + sum);
//		}
//		else { 
//			for(int i=1; i<=num; i+=2) {
//				sum+=i;
//				System.out.print("홀수의 합: "+ sum);
//			}
//		}
//	}
		
		if(num%2==1) {
			
			for(int i=1; i<=num; i+=2) {
				if(i%9!=0) {
				sum +=i;
				System.out.print(i+"+"+sum+"="+sum+"\t");
				} else {
					System.out.println();
					}
			} System.out.println("\n홀수의 합: "+sum);
			
		} else if(num%2==0) {
			for(int i=2; i<=num; i=i+2) {
				if(i%10!=0) {
					sum = i*i+sum;
					System.out.print(i+"*"+i+"="+sum+"\t");
				} else {
					System.out.println();
				}
				
			}
			System.out.println("\n짝수 제곱의 합: "+sum);
		}
	}
}
		

