package kr.or.ddit.study07.phone;

public class IPhone extends SmartPhone{
	
	public void appStore() {
		super.mobile();
		System.out.println("앱스토어");
	}
	
	@Override
	public void camera() {
//		super.camera();
		System.out.println("1000만 화소 카메라");
	}
}
