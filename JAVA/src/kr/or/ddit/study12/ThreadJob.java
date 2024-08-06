package kr.or.ddit.study12;

public class ThreadJob extends Thread{

	private String name;
	
	public ThreadJob(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		/*
		 * while(true) { try { Thread.sleep(1000); } catch (InterruptedException e) {
		 * e.printStackTrace(); } System.out.println(name); }
		 */
		for(int i=1; i<10000; i++) {
			
		}
//		순서를 정확하게 알기 어렵다
		System.out.println(name+"작업 완료");
	}
}
