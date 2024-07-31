package kr.or.ddit.study04.sec01;

import java.util.Scanner;

public class IfExample02 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		IfExample02 obj = new IfExample02();
		obj.process();
	}

	public void process() {
//		method1();
//		method2();
		method3();
	}

	public void method1() {
//	숫자 a, b 중 큰 숫자를 출력하시오

		System.out.print("숫자: ");
		int a = sc.nextInt();

		System.out.print("숫자: ");
		int b = sc.nextInt();

		if (a < b) {
			System.out.print("더 큰 숫자" + a);
		}

		else if (a > b) {
			System.out.print("더 큰 숫자" + b);
		}

		else {
			System.out.println("a와 b가 같습니다.");
		}
	}

	public void method2() {
//		숫자 a, b를 큰 숫자부터 출력하시오

		System.out.print("a: ");
		int a = sc.nextInt();

		System.out.print("b: ");
		int b = sc.nextInt();

		int temp = 0;

		if (a < b) {
			temp = a;
			a = b;
			b = temp;
		}
		System.out.println(a + ", " + b);
	}

	public void method3() {
//		수정필요
//		점수를 입력받고
//		점수에 따른 학점을 출력하시오.
//		90점 이상	A
//		80점 이상	B
//		70점 이상	C
//		60점 이상	D
//			미만	F

//		끝자리가 0~3 -, 4~6 0, 7~9 +

		System.out.print("점수를 입력하세요: ");
		int score = sc.nextInt();
		String grade = "";
		if (score == 100)
			grade = "A+";
		else if (score >= 90)
			grade += "A";
		else if (score >= 80)
			grade += "B";
		else if (score >= 70)
			grade += "C";
		else if (score >= 60)
			grade += "D";
		else
			grade += "F";
		if (score != 100 && score >= 60) {
			if (score % 10 <= 3) {
				grade += "-";
			} else if (score % 10 <= 6) {
				grade += "0";
			} else {
				grade += "+";
			}
		}
		System.out.println(grade);
	}
}

