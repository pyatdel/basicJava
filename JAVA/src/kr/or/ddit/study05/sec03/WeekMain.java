package kr.or.ddit.study05.sec03;


import java.util.Scanner;

//alt + shift + j 
/**
 * @since 24.07.17
 * @version 1.00
 * @author PC-04
 *
 */
public class WeekMain {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		WeekMain obj = new WeekMain();
		obj.process();
	}

	public void process() {
		week(Week.FRI);
	}
	
	public void week(Week week) {
		if(week == Week.SUN)System.out.println("일요일"); 
		if(week == Week.MON)System.out.println("월요일"); 
		if(week == Week.TUE)System.out.println("화요일"); 
		if(week == Week.WED)System.out.println("수요일"); 
		if(week == Week.THU)System.out.println("목요일"); 
		if(week == Week.FRI)System.out.println("금요일"); 
		if(week == Week.SAT)System.out.println("토요일"); 
	}


	/**
	 * @param num 1 일요일 ~ 7 토요일 
	 */
	public void week/*(int num)*/(String day) {
//		1
//		if (num==1) System.out.println("일요일");
//		if (num==2) System.out.println("월요일");
//		if (num==3) System.out.println("화요일");
//		if (num==4) System.out.println("수요일");
//		if (num==5) System.out.println("목요일");
//		if (num==6) System.out.println("금요일");
//		if (num==7) System.out.println("토요일");
		
		if (day.equals("sun")) System.out.println("일요일");
		
	}
}
