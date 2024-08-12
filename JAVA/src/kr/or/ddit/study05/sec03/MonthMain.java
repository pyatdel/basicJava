package kr.or.ddit.study05.sec03;

import java.util.Scanner;

public class MonthMain {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		MonthMain obj = new MonthMain();
		obj.process();
	}

	public void process() {
//		1 ~ 12월에 해당하는 enum을 만들고
//		출력하시오
//		ex) month(Month.JAN)-> 1월 
		month(Month.MARCH);
	}

	public void month(Month month) {
//		if(month == Month.JANUARY) System.out.println("1월");
//		if(month == Month.FABRUARY) System.out.println("2월");
//		if(month == Month.MARCH) System.out.println("3월");
//		if(month == Month.APRIL) System.out.println("4월");
//		if(month == Month.MAY) System.out.println("5월");
//		if(month == Month.JANUARY) System.out.println("6월");
//		if(month == Month.JANUARY) System.out.println("7월");
//		if(month == Month.JANUARY) System.out.println("8월");
//		if(month == Month.JANUARY) System.out.println("9월");
//		if(month == Month.JANUARY) System.out.println("10월");
//		if(month == Month.JANUARY) System.out.println("11월");
//		if(month == Month.JANUARY) System.out.println("12월");
		System.out.println(month.num);

	}
}
