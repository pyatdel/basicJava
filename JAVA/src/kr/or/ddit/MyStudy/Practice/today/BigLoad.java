package kr.or.ddit.MyStudy.Practice.today;

public class BigLoad {
	private static BigLoad instance;
	
	BigLoad(){
		System.out.println("로딩중");
		for(int i=0; i<10; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(".");
		}
	}
	
	public static BigLoad getInstancne() {
		if(instance == null) {
			instance = new BigLoad();
		}
		return instance;
	}
}
