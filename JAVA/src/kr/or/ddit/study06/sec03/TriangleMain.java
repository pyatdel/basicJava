package kr.or.ddit.study06.sec03;

public class TriangleMain {
	public static void main(String[] args) {
		Triangle t1 = new Triangle(0, 0, 10, 0, 0, 10);
		System.out.println(t1.area);
		
		Triangle t2 = new Triangle(new Point(0,0),new Point(10,0),new Point(0,10));
		System.out.println(t2.area);
		
		
	}
}
