package kr.or.ddit.MyStudy.Practice.today;

public class StudentMain {
	public static void main(String[] args) {
		Student.year = 2023;
		
		Student s1 = new Student();
		s1.name = "양소현";
		
		Student s2 = new Student();
		s2.name = "육수민";
		
		System.out.println(s1);
		System.out.println(s2);
		Student.year++;
		System.out.println(s1);
		System.out.println(s2);
	}
}
