/*
 * package kr.or.ddit.MyStudy.Practice.today;
 * 
 * import kr.or.ddit.study06.sec03.Point;
 * 
 * public class Rectangle { Point topLeft; Point bottomRight; double area;
 * 
 * // Point 객체 두 개를 받는 생성자 public Rectangle(Point topLeft, Point bottomRight) {
 * this.topLeft = topLeft; this.bottomRight = bottomRight; this.area =
 * calculateArea(); this(new Point(x1, y1), new Point(x2, y2), new Point(x3,
 * y3)); }
 * 
 * // int 좌표 네 개를 받는 생성자 public Rectangle(int x1, int y1, int x2, int y2) {
 * this(new Point(x1, y1), new Point(x2, y2)); }
 * 
 * // int 좌표 두 개와 너비, 높이를 받는 생성자 public Rectangle(int x, int y, int width, int
 * height) { this(new Point(x, y), new Point(x + width, y + height)); }
 * 
 * // 면적 계산 private double calculateArea() { int width = Math.abs(bottomRight.x
 * - topLeft.x); int height = Math.abs(topLeft.y - bottomRight.y); return width
 * * height; }
 * 
 * @Override public String toString() { return "Rectangle [topLeft=" + topLeft +
 * ", bottomRight=" + bottomRight + ", area=" + area + "]"; }
 * 
 * public static void main(String[] args) { Rectangle rect1 = new Rectangle(new
 * Point(0, 5), new Point(5, 0)); Rectangle rect2 = new Rectangle(0, 5, 5, 0);
 * Rectangle rect3 = new Rectangle(0, 5, 5, 5);
 * 
 * System.out.println(rect1); System.out.println(rect2);
 * System.out.println(rect3); } }
 */