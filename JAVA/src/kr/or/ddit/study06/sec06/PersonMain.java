package kr.or.ddit.study06.sec06;

public class PersonMain {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setName("박광제");
		p1.setAge(20);
		
		System.out.println(p1.getName() + ", "+p1.getAge());
		
		Person p2 = new Person();
		
		int age = -10;
		if(age < 0) {
			System.out.println("음수는 입력할 수 없습니다.");
		}
//		p2.age = -10;
		p2.setName("박진우");
		p2.setAge(age);
		
//		필드에 있는 값을 메소드로 가져온다
		String str ="abcd";
		str.length();
	}
}
