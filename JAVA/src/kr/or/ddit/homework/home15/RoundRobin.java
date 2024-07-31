package kr.or.ddit.homework.home15;

import kr.or.ddit.util.ScanUtil;

//Burst 시간이 긴 것부터
public class RoundRobin extends Schedular {

	@Override
	public void getNextCall() {
		System.out.println("상담 전화를 대기열에서 차례대로 가져옴");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("차례대로 상담원에게 상담 전화를 분배");
	}

	@Override
	public void write() {
		int sel = ScanUtil.nextInt("상담 전화의 분배 방식을 선택하세요 : ");

	}
}