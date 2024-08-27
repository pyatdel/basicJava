package kr.or.ddit.member;

import java.util.Scanner;

public class ScanUtil {
	private static Scanner sc = new Scanner(System.in);
	
	public static String nextLine(String message) {
		System.out.print(message);
		return sc.nextLine();
	}
	
	public static int menu() {
		return nextInt("선택 : ");
	}
	
	public static int nextInt(String message) {
		System.out.print(message);
		return nextInt();
		
	}
	
	private static int nextInt() {
		while(true) {
			try {
				int result = Integer.parseInt(sc.nextLine());
				return result;
			} catch (Exception e) {
				System.out.print("숫자만 입력");
			}
		}
		
	}

}
