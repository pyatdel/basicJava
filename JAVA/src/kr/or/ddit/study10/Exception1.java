package kr.or.ddit.study10;

import java.util.Scanner;

//일반 예외와 실행 예외
public class Exception1 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Exception1 obj = new Exception1();
		obj.process();
	}

	public void process() {
//		method1();
//		method2();
//		method3();
		method4();
	}
	
//	java.lang.NullPointerException
	/*
	 * public void method4() { String str = null; if(str.equals("") && str == null)
	 * { System.out.println("값이 없다."); } }
	 */
	
	public void method4() {
		String str = null;
		try {
			if(str.equals("") && str == null) {
				System.out.println("값이 없다.");
			}
		} catch (Exception e) {
			System.out.println("널 포인트 에러");
		}
		
	}
	
//	java.lang.ArrayIndexOutOfBoundsException
	/*
	 * public void method3() { int[] arr = new int[3]; for(int i=0; i<=arr.length;
	 * i++) { System.out.println(arr[i]); } }
	 */
	
	public void method3() {
		int[] arr = new int[3];
		try {
			for(int i=0; i<=arr.length; i++) {
				System.out.println(arr[i]);
			}
		} catch (Exception e) {
			System.out.println("배열 범위를 벗어남");
		}
		
	}
	
	public void method2() {
//		실행 예외(Runtime Exception)
//		컴파일 과정에서 체크하지 않음
//		실행 시, 예측할 수 없이 갑자기 발생함.
//		ex) int를 string으로 잘못 입력
		System.out.println("숫자 입력 : ");
		try {
			System.out.println("1");
			int num = sc.nextInt();
			System.out.println("2");
			} catch (Exception e) {
			// 에러 발생 시, catch 구문으로 이동됨.
				System.out.println("숫자만 입력해주세요");
		}
		System.out.println("4");
	}

	public void method1() {
//		일반 예외
//		컴파일러 체크 예외
//		자바 소스 컴파일 과정에서 해당 예외 처리가 있는지 검사 함
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
