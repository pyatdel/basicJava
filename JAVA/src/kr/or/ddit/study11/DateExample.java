package kr.or.ddit.study11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import kr.or.ddit.util.ScanUtil;

public class DateExample {

	public static void main(String[] args) {
		DateExample obj = new DateExample();
		obj.process();
	}

	public void process() {
//		method1();
//		method2();
//		method3();
//		method4();
//		method5();
//		method6();
		method7();
//		method8();
//		method9();
//		method10();
		
	}
	
	public void method10() {
		Calendar cal = Calendar.getInstance();
//		int week = cal.get(Calendar.DAY_OF_WEEK);
//		System.out.println(week);
//		20일 뒤의 날짜를 주말 빼고 출력
//		ex) 영업일 기준으로 ~일 이후
		int cnt = 20;
		while (cnt>0) {
			cal.add(Calendar.DATE, 1);
//			주말 체크
			int week = cal.get(Calendar.DAY_OF_WEEK);
			if(week==1 || week ==7) continue;
			cnt--;
			System.out.println(cal.getTime());
		}
		Date date = cal.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		System.out.println(sdf.format(date));
	}
	
	public void method9() {
//		스캐너를 통해 더할 날짜를 입력받고 해당 날짜를 
//		yyyy/MM/dd 형식으로 출력 하시오 
		int day = ScanUtil.nextInt("더할 날짜 입력 : ");
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, day);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		Date date = cal.getTime();
		System.out.println(sdf.format(date));
	}
	
	public void method8() {
//		Calendar 사용 예제
		Calendar cal = Calendar.getInstance();
//		데이터 변경 set
		cal.set(Calendar.HOUR, 1);
		cal.set(Calendar.DATE, 28);
		cal.set(Calendar.YEAR, 2028);
		
//		시간 더하기
		cal.add(Calendar.DATE, 100);
		cal.add(Calendar.HOUR, 30);
//		Calander -> date
		Date date = cal.getTime();
//		System.out.println(date);
		
//		값 가져오기
		int day = cal.get(Calendar.DATE);
		System.out.println(date);
	}
	
	public void method7() { 
//		오늘로부터 특정 날짜가 몇일 뒤인지, 출력해보기
//		Date date = new Date();
//		String str = "2025.02.06";
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd	HH.mm.ss");
//		String str2 = str.format(str);
//		System.out.println(str2);
//		
//		Date date = new Date();
		
		
		
		String str= ScanUtil.nextLine("날짜 : ");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
		try {
			Date date = sdf.parse(str);
			Date cur  = new Date();
			// 2.6일과 현재 시간 ms 
			long time = date.getTime() - cur.getTime();
			long days = time/1000/60/60/24;
			System.out.println(days);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
	}
//	x = a + b;
//	a =  x - b 
	public void method6() {
//		오늘로부터 100일 뒤가 어떤 날짜인지 출력해보기.
		long sec=1000;
		long min=sec*60;
		long hour=min*60;
		long day=hour*24;
		long year=day*365;
		
		
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd	HH.mm.ss");
		String str = sdf.format(date);
		
//		Date date2 =  new Date(date2.getTime()+1000);
		Date date2 = new Date(date.getTime()+year + sec + hour); // day + 1
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy.MM.dd	HH.mm.ss");
		String str2 = sdf2.format(date2);
		
		System.out.println(str);
		System.out.println(str2);
		
		
//		2024.07.25
	}
	
	public void method5() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
		String str = ScanUtil.nextLine("날짜 : ");
		
//		TO_DATE
		try {
			Date date = sdf.parse(str);
			System.out.println(date);
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
	}
	
	public void method4() {
		Date date = new Date();
		System.out.println(date);
		
//		HH 0~23
//		hh 1~12
//		MM Month
//		mm min
//		a am/pm
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss"); // mm -> min 
		System.out.println(sdf.format(date));
		String str = sdf.format(date);
		System.out.println(str);
	}
	
	public void method3() {
//		1~100만까지 더하고 걸리는 시간을 출력하시오
		Date d1 = new Date();
		long sum=0;
		for(long i=0; i<=1000000; i++) {
			sum+=i;
		}
		
		Date d2 = new Date();
		long time  = d2.getTime() - d1.getTime();
		System.out.println(time+"ms");
	}
	
	public void method2() {
		Date d1 = new Date();
		

		  try { 
			  Thread.sleep(1000); 
			  } catch (Exception e) {
				  e.printStackTrace();
		  }
		 
		
	
		
		Date d2 = new Date();
		
		long time = d2.getTime() - d1.getTime();
		System.out.println(time+"ms");
	}

	public void method1() {
//		날짜 시간 처리
		
//		Date 시간 날짜 관련한 클래스
		Date date = new Date();
//		getTime 1970년 1월 1일 0시로부터 지난 시간을 나타냄
//		단위 ms
		
		
	
		long sec=1000;
		long min=sec*60;
		long hour=min*60;
		long day=hour*24;
		long year=day*365;
		
		long time = date.getTime();
		
		
//		몇년 몇일 몇시 몇분 몇초 지났는지 출력하시오.
		
		long years = time/year;
		time%=year;
		
		long days = time/day;
		time%=day;
		
		long hours = time/hour;
		time%=hour;
		
		long mins = time/min;
		time%=min;
		
		long secs = time/sec;
		
		System.out.println(years+", "+days+", "+hours+", "+mins+", "+secs);
		

//		System.out.println(time);
//		
//		System.out.println((time/year)+((time%year)/day+
//				((time/year/day)));
		
	}
}
