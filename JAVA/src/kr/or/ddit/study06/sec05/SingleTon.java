package kr.or.ddit.study06.sec05;

public class SingleTon {
	/*
	 * // 외부접근(x) NULL private static SingleTon instance;
	 * 
	 * // 생성자를 외부에서 사용하지 (x) private SingleTon() {
	 * 
	 * }
	 * 
	 * // 객체를 사용하지 못하게 막음 public static SingleTon getInstance() { if(instance ==
	 * null) { instance = new SingleTon(); // 첫 번째는 싱글톤을 생성하지만, 두 번째는 주소만.. } return
	 * instance; }
	 */
	private static SingleTon instance;

	private SingleTon() {

	}

	public static SingleTon getInstance() {
		if (instance == null) {
			instance = new SingleTon();
		}
		return instance;
	}

	
}
