package kr.or.ddit.study11;

import java.io.File;
import java.nio.file.Files;

public class StringExample {
	public static void main(String[] args) {
		StringExample se = new StringExample();
		se.process();
		// replace, split, trim (중요!!!!!!!!!!!!!!!!!!)
	}
	
	public void process() {
//		method1();
//		method2();
//		method3();
//		method4();
//		method5();
//		method6();
//		method8();
		method9();
	}
	
	public void method9() {
		String test = "29183";
		String search = "7";
		System.out.println(test.indexOf(search));
	}
	
	public void method8() {
		String abc = "abcdefg";
		System.out.println(abc.substring(3));
		System.out.println(abc.substring(3, 5));
	}
	
	public void method6() {
	String test = "abcd";
	test = test.toUpperCase();
	System.out.println(test);
	
	test = test.toLowerCase();
	System.out.println(test);
	}
	
	public void method5() {
		String id = "abcd123 ";

		if(id.equals("abcd123")) {
			
		}
		String test = "		문자열 테스트	\n";
		test = test.trim(); // 앞, 뒤 공백을 지워준다.
		System.out.println("=========================");
		System.out.println(test);
		System.out.println("=========================");
	}
	
	public void method4() {
		
		String test = "1, 2, 3";
		String[] tokens = test.split(",");
		for(String string : tokens) {
			string = string.trim();
			System.out.println(string); 
		}
	}
	
	public void method3() {
//		String test = "바보dsfsg";
//		
//		test = test.replace("바보", "**");
		
		String test = "터키";
		
		test = test.replace("터키", "튀르키예");
		System.out.println(test);
	}
	
	public void method2() {
		String test = "문자열 테스트";
		if(test.startsWith("문자열")) {
			System.out.println("문자열로 시작합니다.");
		}
		if(test.endsWith("테스트")) {
			System.out.println("테스트를 종료합니다.");
		}
	}
		
//		2024년으로 시작하는 xls 파일 검사
//		File dir = new File("파일 경로 입력");
//		for(File file : dir.listFiles()) {
//			String name = file.getName();
//			if(!name.startsWith("2024")) couninue;
//			if(!name.endsWith("xls")) couninue;
//			System.out.println(name);
//		}
//	}
	
	public void method1(){
		String test = "문자열 테스트";
		if(test.equals("문자열 테스트")) {
			System.out.println("같은 문자열입니다.");
		}
		String a = "문자열";
//		boolean chk = false;
//		for(int i=0; i<test.length(); i++) {
		int cnt =0;
//		for(int j=0; j<a.length(); j++) {
//			if(a.charAt(j) == test.charAt(i));{
//				cnt++;
//			}
//		}
		

//		like '%문자열%';
		if(test.contains("문자열")) {
			System.out.println("'문자열' 이 포함되어 있습니다.");
		}
	}
}
