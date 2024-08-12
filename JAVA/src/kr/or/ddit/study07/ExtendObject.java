package kr.or.ddit.study07;

public class ExtendObject extends SuperObject{
	
	public static void main(String[] args) {
		ExtendObject eo = new ExtendObject();
		eo.method1();
		System.out.println(eo);
	}

	public ExtendObject() {
		this(10);
	}
	 

	public ExtendObject(int field) {
//		부모 클래스에 있는 생성자를 호출
		super(field);
	}

//	ctrl + space > method
	@Override
	public void method1() {

//		super(부모 클래스를 접근하는 메소드)
//		super.method1();
		System.out.println("자식 메소드");

	}

	@Override
	public String toString() {

		return "field = " + field;
	}
}
