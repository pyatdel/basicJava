package kr.or.ddit.homework;

import java.util.Scanner;

public class HomeWork04 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork04 obj = new HomeWork04();
		obj.process();
	}

	public void process() {
//	가위바위보
//	0 -> 가위 , 1 - > 바위, 2 - > 보
//	컴퓨터는 랜덤하게 0~2 범위의 값을 가져올 것

//		U	C
//		0	2 :win
//		0	1 :lose
//		0	0 :draw

//		1	0 :win
//		1	2 :lose
//		1	1 :draw
//		
//		2	1 :win
//		2	0 :lose
//		2	2 :draw

//	컴퓨터 : 가위, 유저 : 보
//	결과 : 졌다.

		RSP();
	}

	public void RSP() {
		double com = Math.random();
		int cHand = (int) (Math.random() * 3);

		System.out.print("숫자를 입력해주세요: ");
		int user = sc.nextInt();

		if (user == 0) {
			if (user != cHand) {
				String scissors = (cHand == 2) ? "1" : "2";
				int sci = Integer.parseInt(scissors);
				switch (sci) {

				case 1:
					System.out.println("내가 낸 값: " + user + "\n컴퓨터가 낸 값: " + cHand);
					System.out.println("이겼습니다.");
					break;

				case 2:
					System.out.println("내가 낸 값: " + user + "\n컴퓨터가 낸 값: " + cHand);
					System.out.println("졌습니다.");
					break;
				default:
					break;
				}
			} else {
				System.out.println("내가 낸 값: " + user + "\n컴퓨터가 낸 값: " + cHand);
				System.out.println("비겼습니다.");
			}

		} else if (user == 1) {
			if (user != cHand) {
				String rock = (cHand == 0) ? "1" : "2";
				int roc = Integer.parseInt(rock);

				switch (roc) {

				case 1:
					System.out.println("내가 낸 값: " + user + "\n컴퓨터가 낸 값: " + cHand);
					System.out.println("이겼습니다.");
					break;

				case 2:
					System.out.println("내가 낸 값: " + user + "\n컴퓨터가 낸 값: " + cHand);
					System.out.println("졌습니다.");
					break;
				default:
					break;
				}
			} else {
				System.out.println("내가 낸 값: " + user + "\n컴퓨터가 낸 값: " + cHand);
				System.out.println("비겼습니다.");
			}

		} else if (user == 2) {
			if (user != cHand) {
				String paper = (cHand == 1) ? "1" : "2";
				int pap = Integer.parseInt(paper);

				switch (pap) {

				case 1:
					System.out.println("내가 낸 값: " + user + "\n컴퓨터가 낸 값: " + cHand);
					System.out.println("이겼습니다.");
					break;

				case 2:
					System.out.println("내가 낸 값: " + user + "\n컴퓨터가 낸 값: " + cHand);
					System.out.println("졌습니다.");
					break;
				default:
					break;
				}
			} else {
				System.out.println("내가 낸 값: " + user + "\n컴퓨터가 낸 값: " + cHand);
				System.out.println("비겼습니다.");
			}

		} else if (user > 2 || user < 0) {
			System.out.println("0~2의 숫자만 입력해주세요");

		} else
			System.out.println("숫자가 아닙니다.");
	}
}
