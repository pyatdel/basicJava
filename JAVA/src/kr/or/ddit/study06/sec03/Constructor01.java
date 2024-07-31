package kr.or.ddit.study06.sec03;

public class Constructor01 {
	String field1;
	int field2;

//	기본 생성자
//	기본 생성자는 생성자가 없다면 자동으로 만들어지지만
//	다른 생성자가 있다면 자동으로 만들어지지 않음

	public Constructor01() {

	}

//						파라미터, 매개변수
	public Constructor01(String a, int field2) {
//	this.field1 = field1;
		field1 = a;
//	값을 넣을 때는 this.를 넣어준다.
		this.field2 = field2;

	}
	
	public Constructor01(String field3) {
		this.field1 = field3;
	}
	

	public Constructor01(int field2) {
		this.field2 = field2;
	}
}