package kr.or.ddit.study12;

public class MultiThread {
	public static void main(String[] args) {
		ThreadJob t1 = new ThreadJob("작업1");
		ThreadJob t2 = new ThreadJob("작업2");
		ThreadJob t3 = new ThreadJob("작업3");
		ThreadJob t4 = new ThreadJob("작업4");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
