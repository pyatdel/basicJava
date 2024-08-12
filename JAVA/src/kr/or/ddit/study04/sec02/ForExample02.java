package kr.or.ddit.study04.sec02;

//	continue & break문 반드시 익숙해지기!!!

import java.util.Scanner;

public class ForExample02 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ForExample02 obj = new ForExample02();
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

	}

	public void method1() {
//	9x9단을 출력하시오
		int fNum = sc.nextInt();
		int result = 0;

		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + "*" + j + "=" + i * j);

			}
		}
	}

	public void method2() {
//		continue문을 사용해보시오

		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0)
				continue;
			System.out.println(i);
		}
	}

	public void method3() {
//		3x3단과 5x5단을 출력하지 않는 구구단을 작성하시오

		for (int i = 2; i <= 9; i++) {
			if (i == 3 || i == 5)
				continue;
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + "*" + j + "=" + i * j);
			}
		}
	}

	public void method4() {
//		입력한 숫자는 출력하지 않는 구구단을 작성하시오

		System.out.println("숫자 2~9 중 하나를 입력하세요");
		int num = sc.nextInt();

		for (int i = 2; i <= 9; i++) {
			if (i == num)
				continue;
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + "*" + j + "=" + i * j);
			}
		}
	}

	public void method5() {
//		입력한 숫자까지만 출력하는 구구단을 작성하시오

		System.out.println("숫자 2~9 중 하나를 입력하세요");
		int num = sc.nextInt();

//		for(int i=2; i<=num; i++) {
//			for(int j=1; j<=9; j++) {
//				System.out.println(i+"*"+j+"="+i*j);
//			}
//		}

		for (int i = 2; i <= 9; i++) {
			if (i > num)
				continue; // or if(i>num) break;

			for (int j = 1; j <= 9; j++) {
				System.out.println(i + "*" + j + "=" + i * j);
			}
//			if(i>num) break; // or if(i>num) continue;
		}
	}

	public void method6() {

		for (int j = 0; j < 10; j++) {
			for (int i = 0; i < 10; i++) {
				if (i == 4)
					break;
				System.out.println(j + "," + i);
			}
		}
	}

	public void method7() {

		for (int j = 0; j < 10; j++) {
			boolean chk = false;
			for (int i = 0; i < 10; i++) {
				if (i == 4) {
					chk = true;
					break;
				}
				System.out.println(j + "," + i);
			}
			if (chk)
				break;
		}
	}

	public void method8() {

		END: for (int j = 0; j < 10; j++) {
			for (int i = 0; i < 10; i++) {
				if (i == 4)
					break END;
				System.out.println(j + "," + i);
			}
		}
	}
}


