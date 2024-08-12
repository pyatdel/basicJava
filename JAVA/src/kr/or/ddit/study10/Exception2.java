package kr.or.ddit.study10;

import java.util.Scanner;

public class Exception2 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Exception2 obj = new Exception2();
		obj.process();
	}

	public void process() {
		method1();
	}
	private void method1() {
//		java.lang.ArrayIndexOutOfBoundsException 배열 범위
//		ArithmeticException / by zero
		int[] arr = {1, 2, 0};
		System.out.println("배열 번호 입력");
		try {
			int num = sc.nextInt();
			int result = 10/arr[num];
		} catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println("배열 범위를 벗어남");
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		} catch (Exception e) {
			System.out.println("예외 발생");
			e.printStackTrace();
			
		}
		
	}
}
