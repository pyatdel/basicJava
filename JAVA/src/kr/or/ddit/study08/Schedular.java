package kr.or.ddit.study08;

public interface Schedular {
	
//	인터페이스는 기본적으로 추상 메소드 형식. public abstract void getNextCall(); => (x)
	public void getNextCall();
	
	public void sendCallToAgent();
}
