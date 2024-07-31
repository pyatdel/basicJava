package kr.or.ddit.study06.sec02;

public class FieldMain {
	public static void main(String[] args) {
		
		FieldExample fe1 = new FieldExample();
		fe1.name = "양형운";
		fe1.age  = 20;
		
		System.out.println(fe1.name+", "+fe1.age);
		
		FieldExample fe2 = new FieldExample();
		fe2.name = "조원근";
		fe2.age  = 20;
		System.out.println(fe2.name+", "+fe2.age);
		
	}
}
