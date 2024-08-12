package kr.or.ddit.study06.sec06;

public class Triangle {
	private Point p1;
	private Point p2;
	private Point p3;
	private double area;
	
	public Triangle(Point p1, Point p2, Point p3) {
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
		
		area = Math.abs(((p1.getX()*p2.getY()+p2.getX()*p3.getY()+p3.getX()*p1.getY())
				-(p1.getX()*p3.getY()+p2.getX()*p1.getY()+p3.getX()*p2.getY())))/2.0;
		
		
	}
	
	public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
//		p1 = new Point(x1, y1);
//		p2 = new Point(x2, y2);
//		p3 = new Point(x3, y3);
		this(new Point(x1, y1), new Point(x2, y2), new Point(x3, y3));
	}
	
	public double getArea() {
		return area;
	}

	@Override
	public String toString() {
		return "넓이 : "+area+"\n"+p1+", "+p2+", "+p3;
	}
	
}
