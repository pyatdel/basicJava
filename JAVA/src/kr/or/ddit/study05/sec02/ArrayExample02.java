package kr.or.ddit.study05.sec02;

import java.util.Scanner;

public class ArrayExample02 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayExample02 obj = new ArrayExample02();
		obj.process();
	}

	public void process() {
//		method1();
//		method2();
		method3();
	}
	
	public void method1() {
//		배열에서 값을 꺼내면
		int[] arr1 = {1, 2, 3};
		int[] arr2 = {4, 5, 6};
		int[] arr3 = {7, 8, 9};
		
		int[][] total = new int[3][3];
		
		total[0] = arr1;
		total[1] = arr2;
		total[2] = arr3;
		
		System.out.println(total);
		
		System.out.println(total[0]);
		System.out.println(arr1);
	}
	
	public void method2() {
		int[][] total1 = new int [2][3];
		int[][] total2 = { {1,2,3}, {4,5,6} };
		int[][] total3 = new int[2][];
	}
	
	public void method3() {
//		홍길동, 강감찬, 이순신
//		국 영 수
		int[][] score = { {90, 80, 77}, {84, 65, 49}, {97, 98, 94} };
	
//		int[] hong = score[0];
//		int hong_kor = hong[0];
		
		
//		홍길동 국어점수
		int hong_kor = score[0][0];
		System.out.println("홍길동 국어 점수: "+hong_kor);
		
		
//		강감찬 수학점수
		int Kang_math = score[1][2];
		System.out.println("강감찬 수학 점수: "+Kang_math);
		
//		이순신 영어 점수
		int lee_eng = score[2][1];
		System.out.println("이순신 영어 점수: "+lee_eng);
		
//		홍길동 점수 평균
		int[] hong = score[0];
		int hongSum = 0;
		for(int i=0; i<hong.length; i++) {
			hongSum+= hong[i];
		}
		double hongAvg = hongSum/3.0;
		System.out.println("홍길동 점수 평균: "+Math.round(hongAvg));
		
		int korSum=0;
		for(int i=0; i<score.length; i++) {
			int kor = score[i][0];
			korSum +=kor;
		}
		double korAvg = korSum/3.0;
		System.out.println("국어 점수 평균: "+Math.round(korAvg));
		
		int mathSum=0;
		for(int i=0; i<score.length; i++) {
			int math = score[i][1];
			mathSum+=math;
		}
		double mathAvg = mathSum/3.0;
		System.out.println("수학 점수 평균: "+Math.round(mathAvg));
	}
}
