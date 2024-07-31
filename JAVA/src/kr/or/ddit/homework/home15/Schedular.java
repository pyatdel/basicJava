package kr.or.ddit.homework.home15;

// public class Schedular {
 public abstract class Schedular {

	/*public void getNextCall() {
//		상담전화를 차례대로
	}
	
	public void sendCallToAgent() {
//		차례대로 상담원에게 상담전화를 분배
	}*/
	
	public abstract void getNextCall();  
    public abstract void sendCallToAgent();  
    
    public abstract void write();
}