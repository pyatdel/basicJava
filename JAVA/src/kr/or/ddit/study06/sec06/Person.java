package kr.or.ddit.study06.sec06;

public class Person {
	
	private String name;
	private int age;
	
//	getter/setter
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
//		값을 가져옵니다.
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		
		if(age<0) {
			System.out.println("음수는 입력할 수 없습니다.");
			return;
		}
		
		this.age = age;
	}
}
