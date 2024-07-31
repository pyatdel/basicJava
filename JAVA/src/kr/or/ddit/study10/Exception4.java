package kr.or.ddit.study10;

import java.util.Scanner;

public class Exception4 {

	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Exception4 obj = new Exception4();
		obj.process();
	}

	public void process() {
		while(true) {
			System.out.println("닉네임을 입력하세요");
			try {
				String nick = inputNick();
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
	public String inputNick() {
		String result= sc.nextLine();
		if(result.length()<2 || result.length()>5) {
			throw new NickNameLengthException();
		}
		if(result.contains("바보")) {
			throw new NickNameLengthException();
		}
		return result;
	}
}

class NickNameException extends RuntimeException {
	public NickNameException() {
		super("부적절한 닉네임");
	}
}

class NickNameLengthException extends RuntimeException {
	public NickNameLengthException() {
		super("닉네임 길이가 2~5글자");
	}
}