package kr.or.ddit.study08;

import kr.or.ddit.util.ScanUtil;

public class ScheldularMain {
public static void main(String[] args) {
	System.out.println(("전화 상담의 분배 방식 선택"));
	System.out.println(("R : RoundRobin"));
	System.out.println(("L : LeastJob"));
	System.out.println(("P : ProiorityAllocation"));
	String sel = ScanUtil.nextLine("선택 : ");
	
	Schedular schedular = null;
	if(sel.equalsIgnoreCase("R")) schedular = new RoundRobin();
	if(sel.equalsIgnoreCase("L")) schedular = new LeastJob();
	if(sel.equalsIgnoreCase("P")) schedular = new PriorityAllocation();
	
	schedular.getNextCall();
	schedular.sendCallToAgent();
}
}
