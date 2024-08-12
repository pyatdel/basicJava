package kr.or.ddit.study07;
//				super(부모)
public class SuperObject {
	int field;
	
	public void method1() {
		System.out.println("부모 메소드");
	}
	
	SuperObject(int field){
		this.field=field;
	}
}
