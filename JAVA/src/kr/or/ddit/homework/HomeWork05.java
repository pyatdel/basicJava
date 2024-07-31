package kr.or.ddit.homework;

import java.util.Scanner;

public class HomeWork05 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork05 obj = new HomeWork05();
		obj.process();
	}

	public void process() {
//	method1();
//	method2();
//	method3();
//	method4();
//	method5();
//	method6();
//	method7();
	}

	public void method1() {
//	ex) row = 4일 경우 아래와 같이 출력
//	*
//	**
//	***
//	****

		int row = sc.nextInt();
		for (int i = 0; i < row; i++) {
			for (int star = 0; star < i + 1; star++) {
				System.out.print("*");
			}
			for (int space = row; space < row-i-1; space++) {
				System.out.print(" ");
			}
			
			System.out.println();
		}
		
	}

	public void method2() {
//	ex) row = 4일 경우 아래와 같이 출력
//	alt + shift + r : 변수명 변경
//	tip: 공백을 사용
//	    *
//	   **
//	  ***
//	 ****

		int row = sc.nextInt();
		for (int i = 0; i < row; i++) {
			for (int space = 0; space < row - 1 - i; space++) {
				System.out.print(" ");
			}
			for (int star = 0; star < i+1; star++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

	public void method3() {
//	ex) row = 4일 경우 아래와 같이 출력

//	 ****
//	 ***
//	 **
//	 *
		int row = sc.nextInt();
		for(int i=1; i<=row; i++) {
			for(int j=1; j<=row-i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
//		for (int i = 0; i < row; i++) {
//			for (int star = row; star < row - i; star++) {
//				System.out.print("*");
//			}
//			for (int space = 0; space < i; space++) {
//				System.out.print(" ");
//			}
//			System.out.println();
//		}
		
		
	}

	public void method4() {
//	ex) row = 4일 경우 아래와 같이 출력

//	 ****
//	  ***
//	   **
//	    *

		int row = sc.nextInt();
		for(int i=1; i<=row; i++) {
			for(int j=1; j<=i-1; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=row-i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
//		for (int i = 0; i < row; i++) {
//			for (int space = 0; space < i; space++) {
//				System.out.print(" ");
//			}
//			for (int star = row-1; star > i-1; star--) {
//				System.out.print("*");
//			}
//			
//			System.out.println();
//		}
		
		
		
	}

	

	public void method5() {
//	ex) row = 4일 경우 아래와 같이 출력

//	   *
//	  ***
//	 *****
//	*******

		int row = sc.nextInt();
		for(int i=1; i<=row; i++) {
			for(int j=1; j<=row-i; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i+i-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
//		int row = sc.nextInt();
//		for(int i=0; i<row; i++) {
//			for(int space=0; space<row-i; space++) {
//				System.out.print(" ");
//			}
//			for(int star=0; star<2*i+1; star++) {
//				System.out.print("*");	
//			}
//			System.out.println();
//		}
		
	}

	public void method6() {
//	ex) row = 4일 경우 아래와 같이 출력

//	*******
//	 *****
//	  ***
//	   *

		int row = sc.nextInt();
		
		for(int i=1; i<=row; i++) {
			for(int j=0; j<i-1; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=2*row-2*i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
//		for(int i=0; i<row; i++) {
//			for(int space=0; space<i; space++) {
//				System.out.print(" ");
//			}
//			for(int star =0; star<(row-i-1)*2+1; star++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
	}

	public void method7() {
//	홀수만

//	*   *
//	 * *
//	  *
//	 * *
//	*   *

		int row = sc.nextInt();
//		
		for(int i=0; i<row; i++) {
			for(int j=0; j<row; j++) {
				if(i==j || row-i-1 == j) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
