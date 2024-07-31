package kr.or.ddit.study05.sec01;

import java.util.Scanner;

public class ReferenceExample01 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ReferenceExample01 obj = new ReferenceExample01();
		obj.process();
	}

	public void process() {
		method1();
	}

	public void method1() {
		int a = 10;

		if (a == 10) {
			int b = 15;

			String str1 = "abc";

			String str2 = new String("abc");

			if (str1 == str2) {
//				스킵
				int c = 20;

				String str3 = "def";
			} else {
//				힙 영역에 test가 만들어진다.
				String test = "test";
			}
//			스택 영역에서 test가 사라진다.(힙 영역에선 사라지지 않았다.)
//			힙 영역에 def가 새로 만들어진다, 스택 영역에 def 주소 값이 들어간다.
			String str4 = "def";

//			스택에 30의 값을 넣어준다.
			int d = 30;
		}
//		위의 영역이 모두 스택에서 사라진다.
//		스택에 50값이 저장된다.
		int e = 50;
		
//		스택에 test1의 주소값을 넣어준다. 
		String test1 = "test";
	}
}


