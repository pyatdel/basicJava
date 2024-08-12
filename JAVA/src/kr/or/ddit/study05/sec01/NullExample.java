package kr.or.ddit.study05.sec01;

import java.util.Scanner;

public class NullExample {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		NullExample obj = new NullExample();
		obj.process();
	}

	public void process() {
		
		String str1 = "";
		String str2 = null;
		
//		if(str1.equals("") || str1 == null) {
//			System.out.println("값이 없다.");
//		}
		
		if(str2 == null || str2.equals("") ) {
			System.out.println("값이 없다.");
		}
		
		
		
	}
}
