package kr.or.ddit.study05.sec03;

import java.util.Scanner;

public class Cal {
	
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Cal obj = new Cal();
		obj.process();
	}

	public void process() {
		double result = cal(3, 4, Operator.PER);
		System.out.println(result);
		
	}
//	enum 계산기
	
	public double cal(int a, int b, Operator oper) {
		
		if(oper == Operator.ADD) return add(a, b);
		if(oper == Operator.SUB) return sub(a, b);
		if(oper == Operator.MUL) return mul(a, b);
		if(oper == Operator.DIV) return div(a, b);
		if(oper == Operator.PER) return per(a, b);
//		else System.out.println("지원되지 않는 연산자입니다.");
		return 0;
	}
	
	public double per(int a, int b) {
		return a%b;
	}
	
	public double add(int a, int b) {
		return a+b;
	}
	
	public double sub(int a, int b) {
		return a-b;
	}
	
	public double mul(int a, int b) {
		return a*b;
	}
	
	public double div(int a, int b) {
		return a/b;
	}
}
