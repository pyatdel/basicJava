package kr.or.ddit.homework.home15;

import kr.or.ddit.util.ScanUtil;

//짧은 대기열 먼저
// public class LeastJob extends Schedular {
public class LeastJob extends Schedular {
	
	 @Override
	    public void getNextCall() {
	        System.out.println("대기열에서 상담 업무가 가장 적은 상담원의 전화를 가져옴");
	    }

	    @Override
	    public void sendCallToAgent() {
	        System.out.println("업무가 가장 적은 상담원에게 상담 전화를 분배");
	    }
	    
	    @Override
	    public void write() {
	    	int sel = ScanUtil.nextInt("상담 전화의 분배 방식을 선택하세요 : ");
	    	
	    }
	    
	/*@Override
	public void getNextCall() {
		// TODO Auto-generated method stub
		super.getNextCall("대기열에서 상담 업무가 가장 적은 상담원의 전화를 가져옴");
	}

	@Override
	public void sendCallToAgent() {
		// TODO Auto-generated method stub
		super.sendCallToAgent("업무가 가장 적은 상담원에게 상담 전화를 분배");*/
	    
	}