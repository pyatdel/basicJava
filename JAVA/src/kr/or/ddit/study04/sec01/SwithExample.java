package kr.or.ddit.study04.sec01;

import java.util.Scanner;

public class SwithExample {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		SwithExample obj = new SwithExample();
		obj.process();
	}

	public void process() {
//		method1();
//		method2();
//		method3();
		method4();
	}

	public void method1() {

		int num = sc.nextInt();
		switch (num) {
		case 1:
			System.out.println("case1");
			break;
		case 2:
			System.out.println("case2");
			break;
		default:
			System.out.println("나머지 경우");
			break;

		}
	}

	public void method2() {
//		grade 값에 따라
//		1 -> 일반 회원
//		2 -> 우수 회원
//		3 -> VIP

		System.out.print("회원 번호를 입력하세요: ");
		int grade = sc.nextInt();

		switch (grade) {

		case 1:
			System.out.println("일반회원");
			break;
		case 2:
			System.out.println("우수회원");
			break;
		case 3:
			System.out.println("VIP");
			break;
		default:
			System.out.println("정식 회원이 아닙니다.");
			break;
		}
	}

	public void method3() {
//		봄 여름 가을 겨울을 출력하시오

		System.out.println("월: ");
		int month = sc.nextInt();

		switch (month) {

		case 12:
		case 1:
			case2: System.out.println("겨울");
			break;
		case 3:
		case 4:
			case5: System.out.println("봄");
			break;
		case 6:
		case 7:
			case8: System.out.println("여름");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("가을");
			break;
		default:
			System.out.println("계절에 속하는 달이 아닙니다.");
			break;

		}
	}

	public void method4() {
		System.out.print("점수: ");
		int score = sc.nextInt();
		switch (score / 10) {
		case 10:
			System.out.println("A+");
			break;
		case 9:
			System.out.println("A");
			switch (score % 10) {
			case 1: case 2: case 3: 
				System.out.println("-");
				break;

			default:
				break;
			}
			break;

		default:
			break;
		}
	}
}
