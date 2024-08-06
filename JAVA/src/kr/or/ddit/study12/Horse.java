package kr.or.ddit.study12;

public class Horse extends Thread {

	private String name;

	public Horse(String name) {
		this.name = name;
	}

	@Override
	public  void run() { // synchronized : 스레드 독점 역

		for (int i = 0; i < 50; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			synchronized (name) {
				System.out.println(name + " : \t");
				for (int j = 0; j < 50; j++) {
					System.out.print("■");
				}
				System.out.println();
			}
		}
	}
}
