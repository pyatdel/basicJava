package kr.or.ddit.study07.shape;

import kr.or.ddit.util.ScanUtil;

public class ShapeMain {
	public static void main(String[] args) {
		/*
		 * shape 클래스를 만드세요 원 클래스, 사각형 클래스를 만드세요 shape를 상속하세요
		 * 
		 * shape 메소드에 draw 메소드를 만드세요 원 draw에는 "원을 그립니다." 를 출력하세요 사각형 draw에는
		 * "사각형을 그립니다."를 출력하세요
		 * 
		 * 이 모든 걸 다형성을 이용해서 구현해보세요
		 */
		Shape shape = null;
		System.out.println("1. 원");
		System.out.println("2. 사각형");
		int sel = ScanUtil.nextInt("선택 : ");
		if(sel == 1) shape = new Circle();
		if(sel == 2) shape = new Rect();
		
		shape.draw();
	}
}
