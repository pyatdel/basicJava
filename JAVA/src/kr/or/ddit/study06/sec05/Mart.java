package kr.or.ddit.study06.sec05;

public class Mart {
//	공통 특성
//	스태틱으로 만들지 않았다면 속성을 각각 부여해야 한다.
	static int count =0;
	
	public static void main(String[] args) {
		Mart mart = new Mart();
		System.out.println("고객1");
		mart.sell();
		System.out.println("고객2");
		mart.sell();
		System.out.println("고객3");
		mart.sell();
		System.out.println("고객4");
		mart.sell();
	}
	public void sell() {
		System.out.println("상품을 판매 합니다.");
		if(count++<3) {
			System.out.println("서비스를 증정합니다.");
		}
	}
}
