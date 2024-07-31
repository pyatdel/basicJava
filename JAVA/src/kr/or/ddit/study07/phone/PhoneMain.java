package kr.or.ddit.study07.phone;

public class PhoneMain {
	public static void main(String[] args) {
//		HandPhone hp = new HandPhone();
//		hp.call();
//		hp.mobile();
		
		SmartPhone sp = new SmartPhone();
		sp.call(); // Phone class
		sp.camera(); // SmartPhone class
		sp.mobile(); // HandPhone class
		sp.touch(); // SmartPhone class
		
		IPhone ip = new IPhone();
		ip.call();
		ip.camera();
		ip.mobile();
		ip.touch();
		ip.appStore();
	}
}
