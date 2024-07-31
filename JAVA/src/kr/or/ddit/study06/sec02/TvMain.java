package kr.or.ddit.study06.sec02;

public class TvMain {
	public static void main(String[] args) {
		// Tv 에 데이터 담고 출력하기 2개 
		// 벽걸이 티비 , 삼성, 100 
		Tv tv1 = new Tv();
		tv1.name ="벽걸이 티비";
		tv1.company = "삼성";
		tv1.size = 100;
		
		// 대형 티비 , LG , 150
		Tv tv2 = new Tv();
		tv2.name ="대형 티비";
		tv2.company = "LG";
		tv2.size = 150;
		
		System.out.println(tv1.name+", "+tv1.company+", "+tv1.size);
		System.out.println(tv2.name+", "+tv2.company+", "+tv2.size);
	}
}
