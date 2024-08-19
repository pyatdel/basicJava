package util;

import java.util.Scanner;

public class ScanUtil {
	// 스캐너 객체를 따로 만들지 않고 스캔유틸 이용할 것

	private static Scanner sc = new Scanner(System.in);
	
	public static String nextLine(String message) {
		System.out.print(message);
		return sc.nextLine();
	}
	public static int nextInt(String message) {
		System.out.println(message);
		return nextInt();
	}
	
	private static int nextInt() {
		while(true) {
			try {
				int result = Integer.parseInt(sc.nextLine());
				return result;
			} catch (Exception e) {
				System.out.println("숫자만 입력");
			}
		}
	}
}
