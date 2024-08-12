package kr.or.ddit.homework;

import java.util.Calendar;

import kr.or.ddit.util.ScanUtil;

public class HomeWork16 {
	public static void main(String[] args) {
		// 클래스를 바로 사용할 수 없으므로 객체를 만들어야 한다.
		HomeWork16 obj = new HomeWork16();
		obj.process();
	}

	public void process() {
		

//		달력 만들기
//		1 2 3 4 5 6
//	  7 8 9 ..

//	 31
//	<이전달	다음달>
/*
 * Calendar cal = Calendar.getInstance(); while(true) { cal.set(Calendar.DATE,
 * 1); int month = cal.getActualMaximum(Calendar.DAY_OF_MONTH); int start =
 * cal.get(Calendar.DAY_OF_WEEK); for(int i=1; i<start; i++)
 * System.out.print("\t"); for(int i=1; i<=month; i++) {
 * System.out.print(i+"\t"); int week = cal.get(Calendar.DAY_OF_WEEK); if(week
 * == 7 ) System.out.println(); if(i!=month) cal.add(Calendar.DATE, 1); }
 * System.out.println(); String np = ScanUtil.nextLine("<이전달\t\t\t\t\t\t다음달>");
 * if(np.equals("<")) cal.add(Calendar.MONTH, -1); if(np.equals(">"))
 * cal.add(Calendar.MONTH, 1); }
 * 
 * } }
 */
		Calendar cal = Calendar.getInstance();
		while(true) {
			cal.set(Calendar.DATE, 1); // 캘린더 생성(날짜 참조)
			int week = cal.get(Calendar.DAY_OF_WEEK); // week는 캘린더의 한 주를 집어넣음
			int year = cal.get(Calendar.YEAR); // year는 캘린더의 년도를 집어넣음
			int m = cal.get(Calendar.MONTH)+1; // m은 캘린더의 월을 집어넣음(1을 더함)
			System.out.println("================== "+year+"년 "+m+"월 =========================="); // 캘린더의 년도와 월을 출력
			System.out.println("일\t월\t화\t수\t목\t금\t토"); // tab 키를 이용한 요일 출력
			System.out.println("======================================================");
			for(int i=1; i<week; i++ ) System.out.print("\t"); 
			int month = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
			for(int i=1; i<=month; i++) { // 일 출력
				System.out.print(i+"\t");
				int week2 = cal.get(Calendar.DAY_OF_WEEK);
				if(week2 == 7) System.out.println();
				if(i!=month) cal.add(Calendar.DATE, 1);
			}
			String str = ScanUtil.nextLine("");
			if(str.equals("<")) cal.add(Calendar.MONTH, -1);
			if(str.equals(">")) cal.add(Calendar.MONTH, 1);
		}
	}
	
}
