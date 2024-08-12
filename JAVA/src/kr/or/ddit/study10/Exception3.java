package kr.or.ddit.study10;

import java.util.Scanner;

/*throw : 예외 강제 발생
	-일반 메소드 내부에서 사용
	사용 형식
	throw 예외클래스 객체명
	-> IoException io = new IOException();
	ex) throw new Exception();
		throw IOException*/

public class Exception3 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Exception3 obj = new Exception3();
		obj.process();
	}

	public void process() {
//		일반  예외(throws Exception)
		while(true) {
			try {
				getNum();
				break;
			} catch (Exception e) {
				System.out.println("0보다 큰 수를 입력하세요");
			}
		}
	}
		
	
	public int getNum() throws Exception {
		int num = sc.nextInt();
		if(num<0) {
//			에러를 일부러 만듦
			throw new Exception();
		}
		return 0;
	}
}
