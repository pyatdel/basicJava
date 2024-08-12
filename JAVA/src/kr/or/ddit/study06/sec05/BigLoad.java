package kr.or.ddit.study06.sec05;

public class BigLoad {
	private static BigLoad instance;

	BigLoad() {
		System.out.println("로딩중");
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(".");
		}
	}

	public static BigLoad getInstacne() {
		if (instance == null) {
			instance = new BigLoad();
		}
		return instance;
	}

}
