package kr.or.ddit.study06.sec04;

import java.util.Scanner;

public class Cal3 {
	
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Cal3 obj = new Cal3();
		obj.process();
	}

	public void process() {
		System.out.println("숫자를 입력하세요: ");
		int a = sc.nextInt();
		System.out.println("연산자를 입력하세요: ");
		String oper = sc.next();
		System.out.println("숫자를 입력하세요: ");
		int b = sc.nextInt();
		double result = cal(a, b, oper);
		System.out.println(a+oper+b+"="+result);
		}
	
	
	
	
	
	

	public double cal(int a, int b, String oper) {
		if(oper.equals("+")) return add(a, b);
		if(oper.equals("-")) return minus(a, b);
		if(oper.equals("*")) return mul(a, b);
		if(oper.equals("/")) return div(a, b);
		return 0;
	}
	
	public int add(int a, int b) {
		
//		int[] sum = {2, 4};
		
		return a+b;
	}
	
	public int minus(int a, int b) {
		
//		int[] minus = {6, 5};
		return a-b;
	}
	
	public int mul(int a, int b) {
		
//		int[] mul = {4, 5};
		return a*b;
	}
	public double div(int a, int b) {
//		int[] div = {56, 8};
		return (double)a/b;
	}
}

