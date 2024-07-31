package kr.or.ddit.homework;

import java.util.Scanner;

public class HomeWork07 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork07 obj = new HomeWork07();
		obj.process();
	}

	public void process() {
//		문자 맞추기 게임
		String[] words = {"airplane", "apple", "bicycle", "cloud", "fruits" };

		int wordSel = (int)(Math.random()*words.length);

		String word = words[wordSel];
//		System.out.println(word);

//		문자열 -> 문자 배열
//		toCharArray
		char[] wordChars = word.toCharArray();

//		for(int i=0; i<10000; i++) {
//			System.out.println(wordChars[i]);
//		}

		for (int i=0; i <10000; i++) {
			int ran = (int)(Math.random()*wordChars.length);
//				f
			char temp = wordChars[0];
//				f			u
			wordChars[0] = wordChars[ran];
//				u			f
			wordChars[ran] = temp;
		}
		int cnt = 0;
		while(true) {
//			섞인 문자열을 출력하고
//			섞이기 전의 문자를 맞추세요.
//			정답이 틀린 경우, 계속 진행하고
//			정답을 맞힌 경우, 반복문 종료 후, 몇 번 시행했는지 출력하세요
			
//			ex) (출력) oudlc
//				(입력) cloud
			cnt++;
			for (int i=0; i<wordChars.length; i++) {
				System.out.println(wordChars[i]);
			}
			System.out.println();
			System.out.println("정답: ");
			String str = sc.next();
			
			if(str.contentEquals(word)) {
				break;
			}
		}
		System.out.println(cnt+"번 만에 맞추셨습니다.");
	}

}
