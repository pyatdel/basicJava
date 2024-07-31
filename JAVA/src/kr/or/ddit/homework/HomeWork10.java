package kr.or.ddit.homework;

import java.util.Scanner;

public class HomeWork10 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork10 obj = new HomeWork10();
		obj.process();
	}

	public void process() {
		System.out.println("반지름을 입력하세요: ");
		int r = sc.nextInt();
		System.out.println("높이를 입력하세요: ");
		int h = sc.nextInt();


		
		
//		r*r*3.14*h
//		원기둥 부피 출력
		Circle ci = new Circle(r);
		System.out.println("원의 넓이: " + Math.floor(ci.area * 100) / 100.0);
		
		Cylinder cy = new Cylinder(ci, h);
		System.out.println("원기둥의 부피: " + Math.floor(cy.volume * 100) / 100.0);
		
		
		
//		Circle c = new Circle(r);
//		Cylinder cylinder = new Cylinder(c, h);
		Cylinder cylinder = new Cylinder(r, h);
	}
}

class Circle {
	int r;
	double area;

//	반지름을 입력하면, 원의 넓이를 구하는 코드를 작성하세요.

	public Circle(int r) {
		this.r = r;
		
//		Circle c = new Circle(r);
		double pi = Math.PI;
		
		area = r*r*pi;
		
	}
}

class Cylinder {
	int h;
	int r;
//	int volume;
	double volume;



//	원, 높이를 입력 받고 부피를 구하세요
	public Cylinder(Circle c, int h) {
		
		this.h = h;
		this.volume = c.area * h;
//		volume = c.area*h;
		
//		r*r*3.14*h
//		원의 넓이*높이
		
//		this.c = c;
//		this.h = h;
	}

//	반지름, 높이를 입력 받아 부피를 구하시오
	public Cylinder(int r, int h) {
//		Circle c = new Circle(r);
		this.r = r;
		this.h = h;
//		this.volume = c.area * h;
		
		
//		this(new Circle(r), h);
//		오버로딩을 이용해서 해볼것.
	}
}
