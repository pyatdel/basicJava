package kr.or.ddit.study04.sec01;

import java.util.Scanner;

public class IfExample01 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		IfExample01 obj = new IfExample01();
		obj.process();
	}

	public void process() {
//		method1();
//		method2();
//		method3();
//		method4();
//		method5();
//		method6();
//		method7();
//		method8();
		method9();
		
	}

	public void method1() {
//	if
//	조건식
		if (false) {
			System.out.println("참일 경우 실행");
		}
		System.out.println("언제나 실행");
	}
	
	public void method2() {
//		점수를 입력받고
//		합격인지 출력하시오
//		60점 이상이면 합격 출력
//		60점 미만은 불합격 출력
		System.out.print("점수:");
		int score = sc.nextInt();
		
		if (score >= 60) {
			System.out.println("합격입니다.");
		} else {
			System.out.println("불합격입니다.");
		}
	}
	
	public void method3() {
//		점수를 입력받고
//		점수에 따른 학점을 출력하시오.
//		90점 이상	A
//		80점 이상	B
//		70점 이상	C
//		60점 이상	D
//			미만	F
		
		System.out.print("점수를 입력하세요: ");
		int Sscore = sc.nextInt();
		
//		if (Sscore>=60) {
//			if (Sscore>=70){
//				if(Sscore>=80) {
//					if(Sscore>=90) {
//						System.out.println();
//					}
//				}
//			}
//		}
		
		if(Sscore>= 90) {
			System.out.println("A");
		}
		
		if(Sscore < 90 && Sscore >= 80) {
			System.out.println("B");
		}
		
		if(Sscore < 80 && Sscore >= 70) {
			System.out.println("C");
		}
		
		if(Sscore < 70 && Sscore >= 60) {
			System.out.println("D");
		}
		
		if(Sscore < 60 ) {
			System.out.println("E");
		}	
	}
	
	public void method4() {
		System.out.print("점수를 입력하세요: ");
		int Sscore = sc.nextInt();
		if(Sscore>= 90) {
			System.out.println("A");
		}
		
		else if(Sscore >= 80) {
			System.out.println("B");
		}
		
		else if(Sscore >= 70) {
			System.out.println("C");
		}
		
		else if(Sscore >= 60) {
			System.out.println("D");
		}
		
		else {
			System.out.println("E");
		}
	}
	
	public void method5() {
//		5과목 점수를 입력받으시오
		
//		1과목이라도 40점보다 작다면 불합격
//		평균이 60점 미만이라면 불합격
		
		System.out.print("소프트웨어 설계: ");
		int score1 = sc.nextInt();
		
		System.out.print("소프트웨어 개발: ");
		int score2 = sc.nextInt();
		
		System.out.print("데이터베이스 구축: ");
		int score3 = sc.nextInt();
		
		System.out.print("프로그래밍 언어 활용: ");
		int score4 = sc.nextInt();
		
		System.out.print("정보시스템 구축관리: ");
		int score5 = sc.nextInt();
		
		int total = score1 + score2 + score3 + score4 + score5;
		int avg = total / 5;
		
//		1.
//		if(score1>=40 && score2>=40 && score3>=40 && score4>=40 && score5>=40 && avg>=60){
//			System.out.println("합격");
//		}
//		else {
//			System.out.println("불합격");
//		}
		
//		2.
		if(score1<40 || score2<40 || score3<40 || score4<40 || score5<40 || avg<60){
			System.out.println("불합격");
		}
		else {
			System.out.println("합격");
		}
	}
	
	public void method6() {
//		월을 입력받아 계절을 출력하시오
//		12 ~ 2	겨울
//		3 ~ 5	봄
//		6 ~ 8	여름
//		9 ~ 11	가을
		
//		System.out.print("계절을 입력하세요: ");
//		int month = sc.nextInt();
//		
//		if (month==12 || month==1 || month==2) {
//			System.out.println("겨울");
//		}
//		
//		else if (month==3 ||month==4 || month==5) {
//			System.out.println("봄");
//		}
//		
//		else if (month==6 || month==7 || month==8) {
//			System.out.println();
//		}
		
		System.out.print("계절을 입력하세요: ");
		int month = sc.nextInt();
		
		if (month>=3 &&month<=5) {
			System.out.println("봄");
		}
		else if (month>=6 &&month<=8) {
			System.out.println("여름");
		}
		else if (month>=9 &&month<=11) {
			System.out.println("가을");
		}
		else {
			System.out.println("겨울");
		}
	}
	
	public void method7() {
//		시, 분을 입력받고 30분 후의 시간을 출력하시오
		
		System.out.print("시: ");
		int hour = sc.nextInt();
		
		System.out.print("분: ");
		int min = sc.nextInt();
		
		
		if (min>=30) {
			hour +=1;
			min = min - 30;
			if( hour>=12) {
				hour = 0;
				hour +=1;
			}
		}
		System.out.printf("30분 후의 시간은 %d시 %d분 입니다.", hour, min);
	}
	
	public void method8() {
//		시, 분을 입력받고 30분 전의 시간을 출력하시오
		
		System.out.print("시: ");
		int hour = sc.nextInt();
		
		System.out.print("분: ");
		int min = sc.nextInt();
		
		if(min<30) {
			min = -(30-min); // or min +=60;
			hour --;
			if(hour <=1) {
				hour = 12;
			}
		}
		System.out.printf("30분 전의 시간은 %d시 %d분 입니다.", hour, min);
	}
	
	public void method9() {
		
		int hour = 0;
		int min = 0;
		int sec = 0;
		while(true) {
			sec++;
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if(sec==100) {
				sec		=0;
				min	   +=1;
			}
			
			else if(min==60) {
				min		=0;
				hour   +=1;
			}
			else if(hour>12) {
				hour	=0;
				
			}
			System.out.println(hour+":"+min+":"+sec);
		}
	}
}