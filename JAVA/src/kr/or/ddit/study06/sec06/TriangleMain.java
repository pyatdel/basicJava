package kr.or.ddit.study06.sec06;

public class TriangleMain {
	public static void main(String[] args) {
		Triangle t1 = new Triangle(0, 0, 10, 0, 0, 10);
//		System.out.println(t1.area);
//		t1.area = 10; field에 private 붙이기
		
		System.out.println(t1.getArea());
	}
}
