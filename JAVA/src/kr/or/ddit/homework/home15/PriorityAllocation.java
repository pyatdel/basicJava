package kr.or.ddit.homework.home15;

// 우선순위 할당
public class PriorityAllocation extends Schedular {

	@Override
	public void getNextCall() {
		System.out.println("우선 순위가 높은 상담전화를 대기열에서 가져옴");
	}
	
	@Override
	public void sendCallToAgent() {
		System.out.println("업무 스킬이 가장 우수한 상담원에게 상담전화를 분배");
	}
	@Override
	public void write() {
		
	}
}