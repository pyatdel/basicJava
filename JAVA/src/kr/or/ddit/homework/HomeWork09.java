package kr.or.ddit.homework;


import java.util.Scanner;


public class HomeWork09 {
	Scanner sc = new Scanner(System.in);


	public static void main(String[] args) {
		HomeWork09 obj = new HomeWork09();
		obj.process();
	}


	public void process() {
		
		System.out.println();
		Student[] stuList = new Student[5];
		Student s1 = new Student();
		
		s1.name = "미연";
		s1.kor = 90;
		s1.eng = 87;
		s1.math = 65;

		Student s2 = new Student();
		s2.name = "민니";
		s2.kor = 99;
		s2.eng = 77;
		s2.math = 85;

		Student s3 = new Student();
		s3.name = "소연";
		s3.kor = 42;
		s3.eng = 70;
		s3.math = 80;
		
		Student s4 = new Student();
		s4.name = "우기";
		s4.kor = 61;
		s4.eng = 44;
		s4.math = 90;

		Student s5 = new Student();
		s5.name = "슈화";
		s5.kor = 100;
		s5.eng = 78;
		s5.math = 51;

		
//		학생 5명을 배열에 연결합니다.
		stuList[0] = s1;
		stuList[1] = s2;
		stuList[2] = s3;
		stuList[3] = s4;
		stuList[4] = s5;

		



		

//		총점 && 평균 구하기
		for(int i=0; i<stuList.length; i++) {
			Student stu = stuList[i];
			stu.sum = stu.kor+stu.eng+stu.math;
			
//			소수점 첫째자리까지 출력(숙제)
			stu.avg = Math.round(stu.sum / 3.0);  // 반올림
//			stu.avg = Math.ceil(stu.sum / 3.0);		  올림
//			stu.avg = Math.floor(stu.sum / 3.0); 	  버림


		}

		

//		등수 비교하기(숙제)
//		for(int i=0; i<stuList.length; i++) {
//			for(int j=0; j<stuList.length; j++) {
//				if(stuList[i].sum < stuList[j].sum) {
//					stuList[i].rank++;
//				}
//			}
//		}

		
//		등수'만' 나열(오름차순)
//		for(int i=0; i<stuList.length; i++) {
//			for(int j=0; j<stuList.length; j++) {
//				if(stuList[i].rank < stuList[j].rank) {
//					int temp = stuList[i].rank;
//					stuList[i].rank = stuList[j].rank;
//					stuList[j].rank = temp;
//			}
//		}
//	}

		

//		등수'만' 나열2(오름차순)
//		for(int i=0; i<stuList.length; i++) {
//			for(int j=0; j<stuList.length; j++) {
//				for(int k=0; k<stuList.length; k++) {
//					if(stuList[j].rank < stuList[k].rank) {
//						int temp = stuList[k].rank;
//						stuList[k].rank = stuList[j].rank;
//						stuList[j].rank = temp;
//					}
//			}
//		}

//	}

		

//		for(int i=0; i<stuList.length; i++) {
//			for(int j=0; j<stuList.length; j++) {
//				if(stuList[i].rank < stuList[j].rank) {
//					int[] temp = stuList[i];
//					stuList[i].rank = stuList[j].rank;
//					stuList[j].rank = temp;

//					

//					

//			}

//		}

//	}

	

//		등수를 제외하고 나열 (s)

//		for (int i = 0; i < stuList.length - 1; i++) {

//	            for (int j = 0; j < stuList.length - 1 - i; j++) {

//	                if (stuList[j].sum > stuList[j + 1].sum) {

//	                    Student temp = stuList[j];

//	                    stuList[j] = stuList[j + 1];

//	                    stuList[j + 1] = temp;

//	                }

//	            }

//	        }

		

//		나열된 데이터를 기준으로 등수 계산 (s)
//		for (int i = 0; i < stuList.length; i++) {
//        stuList[i].rank = 1; 
//        for (int j = 0; j < stuList.length; j++) {
//            if (stuList[i].sum < stuList[j].sum) {
//                stuList[i].rank++;
//            }
//        }
//    }

		

		for (int i = 0; i < stuList.length - 1; i++) {
	        for (int j = 0; j < stuList.length - 1 - i; j++) {
	            if (stuList[j].sum > stuList[j + 1].sum) {
	            	Student temp = stuList[j];
	                stuList[j] = stuList[j + 1];
	                stuList[j + 1] = temp;
	            }
	        }
	    }
		
		for (int i = 0; i < stuList.length; i++) {
            stuList[i].rank = 1; 
            for (int j = 0; j < stuList.length; j++) {
                if (stuList[i].sum < stuList[j].sum) {
                    stuList[i].rank++;
                }
            }
        }

		

		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t등수");
		System.out.println("===========================================");
		for(int i=0; i<stuList.length; i++) {
			System.out.println(stuList[i]);
		}
		System.out.println("===========================================");
	}

		

		

		

//		정렬하기(숙제)
//		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t등수");
//		System.out.println("===========================================");
//		for(int i=0; i<stuList.length; i++) {
//			System.out.println(stuList[i]);
//		}
//		System.out.println("===========================================");
//	}



		



	



class Student {

	String name;

	int kor;

	int eng;

	int math;

	int sum/* = kor + eng + math*/;

	double avg/* = sum / 3.0*/;

	int rank=1;	

	

	@Override

	public String toString() {

		return name+"\t"+kor+"\t"+eng+"\t"+math+"\t"+sum+"\t"+avg+"\t"+rank;

	}

}

}

