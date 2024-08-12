package kr.or.ddit.study06.sec03;

public class Constructor02Main {
	public static void main(String[] args) {


//	기본 생성자
		Constructor02 c1 = new Constructor02();

//	생성자 String a
		Constructor02 c2 = new Constructor02("a"); // 호출할 떄, 값을 불러오지 않는 이유?
		System.out.println(c2);

//	생성자 String a, String b
		Constructor02 c3 = new Constructor02("a", "b");

//	생성자 String a, int b
		Constructor02 c4 = new Constructor02("a", 123);

//	생성자 int a, String b
		Constructor02 c5 = new Constructor02(123, "b");
	}
}