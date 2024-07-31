package kr.or.ddit.study07.vehicle;

import kr.or.ddit.util.ScanUtil;

public class VehicleMain {
	public static void main(String[] args) {
		/*
		 * Vehicle 클래스를 만들기 Vehicle run 메소드 만들기 자동차, 오토바이 클래스를 생성 후, 상속 받기 
		 * 자동차 run -> 자동차가 달립니다. 오토바이 run -> 오토바이가 달립니다.
		 * 
		 * 다형성을 이용해서 출력하기
		 */
		
		Vehicle vh = null;
		System.out.println("1. 자동차");
		System.out.println("2. 오토바이");
		
		int sel = ScanUtil.nextInt("선택 : ");
		
		if(sel == 1) vh = new Car(); 
		if(sel == 2) vh = new MotoCycle();
		
		vh.run();
	}
}
