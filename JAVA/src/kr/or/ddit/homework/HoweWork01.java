package kr.or.ddit.homework;

import java.util.Date;

public class HoweWork01 {
	public static void main(String[] args) {
//		ctrl + shift + 0
		Date date = new Date();
//		1970년 1월 1일 00시부터 지난 시간
		long time = date.getTime();
//		System.out.println(time);
		// 54년 200일 5시간 40분 40초 지났습니다.

//		double a = 10.3;
//		int b = (int) a;
//		int c = 10 / 3;
//		System.out.println(b);
//		System.out.println(c);
//		System.out.println(time);

		long sec = 1000;
		long min = sec * 60;
		long hour = min * 60;
		
		long day = hour * 24;
		long year = day * 365;

//		System.out.println(time/year);
//		System.out.println((time%year)/day);
//		System.out.println(((time%year)%day)/hour);
//		System.out.println((((time%year)%day)%hour)/min);
//		System.out.println(((((time%year)%day)%hour)%min)/sec);
		
		
		System.out.println(time/year + "년  " + (time%year)/day +"일  "+ 
		((time%year)%day)/hour +"시 "+(((time%year)%day)%hour)/min +"분 "+
		(((((time%year)%day)%hour)%min)/sec)+"초 지났습니다.");
			
//		ToYear = time/year;
//		time = time - To
		
//		System.out.println(time / day);
//		System.out.println(time / hour);
//		System.out.println(time / min);
//		System.out.println(time / sec);
		

		// + time%day + time%hour + time%min + time%sec
		// System.out.printf("%d, %d, %d, %d, %d", time%year, time%day, time%hour, time%min, time%sec);
	}

}
