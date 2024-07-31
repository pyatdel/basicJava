package kr.or.ddit.homework.home15;

import kr.or.ddit.util.ScanUtil;

public class SchedularMain {
	public static void main(String[] args) {
		System.out.println("전화 상담의 분배 방식 선택");
		System.out.println("R : RoundRobn");
		System.out.println("L : LeastJob");
		System.out.println("P : PriorityAllocation");

//	Schedular 클래스
//	추상 클래스로 만들것.
//	getNextCall();
//	sendCallToAgent();

		// RoundRobn, LeastJob, PriorityAllocation 클래스를 만들고
		// Schedular 클래스를 상속 받기

		// RoundRobn
		// GetNextCall()
		// -> 상담 전화를 대기열에서 차례대로 가져옴
		// sendCallToAgent()
		// -> 차례대로 상담원에게 상담전화를 분배

		// PriorityAllocation
		// getNextCall()
		// -> 우선 순위가 높은 상담전화를 대기열에서 가져옴
		// sendCallToAgent()
		// -> 업무 스킬이 가장 우수한 상담원에게 상담전화를 분배

		Schedular sch = null;

		int sel = ScanUtil.nextInt("상담 전화의 분배 방식을 선택하세요 : ");
		if (sel == 1)
			sch = new RoundRobin();
		if (sel == 2)
			sch = new LeastJob();
		if (sel == 3)
			sch = new PriorityAllocation();
		else
			System.out.println("잘못 입력하셨습니다.");
		System.exit(0);
//	sch.getNextCall()
//	sch.sendCallToAgent();

		int sel2 = ScanUtil.nextInt("상담 전화의 분배 방식을 선택하세요(2) : ");
		if (sel2 == 1)
			sch.getNextCall();
		if (sel2 == 2)
			sch.sendCallToAgent();
		else
			System.out.println("잘못 입력하셨습니다.");
		System.exit(0);
	}
}