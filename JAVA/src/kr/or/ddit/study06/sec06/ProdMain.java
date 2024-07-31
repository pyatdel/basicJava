package kr.or.ddit.study06.sec06;

public class ProdMain {
	public static void main(String[] args) {
		Prod p1 = new Prod();
		p1.SetName("음료수");
		p1.setMenual("설명");
		p1.setPrice(10000);
		p1.setManuDate(20240722);

		System.out.println(p1.getName() + ", " + p1.getMenual() + ", " + p1.getPrice() + ", " + p1.getManuDate());
	}
}
