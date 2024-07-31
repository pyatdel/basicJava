package kr.or.ddit.study08;

//						extend > imple
public class RoundRobin implements Schedular {
	@Override
	public void getNextCall() {
		System.out.println("상담 전화를 대기열에서 차례대로 가져옴");

	}

	@Override
	public void sendCallToAgent() {
		System.out.println("차례대로 상담원에게 상담전화를 분배");

	}

}
