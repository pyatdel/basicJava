package kr.or.ddit.study06.sec02;

public class StudentMain {
	public static void main(String[] args) {
		// 학생 3명 만들고 이름 , 점수 입력
		
		Student s1 = new Student();
		s1.name ="성윤정";
		s1.kor  = 100; 
		s1.eng  = 80; 
		s1.math = 87; 
		s1.sum  = s1.kor+s1.eng+s1.math;
		s1.avg  = s1.sum/3.0;
		
		Student s2 = new Student();
		s2.name ="강유정";
		s2.kor  = 91; 
		s2.eng  = 89; 
		s2.math = 75;
		s2.sum  = s2.kor+s2.eng+s2.math;
		s2.avg  = s2.sum/3.0;
		
		Student s3 = new Student();
		s3.name ="전진찬";
		s3.kor  = 84; 
		s3.eng  = 90; 
		s3.math = 82;
		s3.sum  = s3.kor+s3.eng+s3.math;
		s3.avg  = s3.sum/3.0;
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		
	}
}
