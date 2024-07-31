package kr.or.ddit.MyStudy.Chapter05;

import java.util.Scanner;

public class Two {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Two obj = new Two();
		obj.process();
	}

	public void process() {
//		method4();
//		method5();
		method6();
	}

	public void method4() {
		
		int[] array = { 1, 5, 3, 8, 9 };

		int max = Integer.MIN_VALUE;
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
				count++;
			}
		}
		System.out.println(count);
		System.out.println("Max : " + max);
	}

	public void method5() {

		int[][] array = { 
				{ 95, 86 }, 
				{ 83, 92, 96 }, 
				{ 78, 83, 93, 87, 88 } };

		int sum = 0;
		double avg = 0.0;


		for(int i=0; i<array.length-1; i++) {
			for(int j=0; j<array.length-1; j++) {
				sum += array[i][j];
				
			}
		}
		
		avg = (Math.round(sum / 3 * 100)/100.0);
		System.out.println("sum : " + sum);
		System.out.println("avg : " + avg);
	}
	
	public void method6() {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		
		while(run){
			System.out.println("_______________________________________");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("_______________________________________");
			System.out.println("선택 >");
			
			int selectNo = Integer.parseInt(sc.nextLine());
			
			
			if(selectNo == 1) {
				
				System.out.print("학생수> ");
				studentNum = Integer.parseInt(sc.nextLine());
				scores = new int[studentNum];
				
			} else if (selectNo == 2) {
				for(int i=0; i<scores.length; i++) {
					scores[i] = Integer.parseInt(sc.nextLine());
				}
				
			} else if (selectNo == 3) {
				for(int i=0; i<scores.length; i++) {
					System.out.println(scores[i]);
				}
				
			} else if (selectNo == 4) {
				int max = Integer.MIN_VALUE;
				for(int i=0; i<scores.length; i++) {
					if(max < scores[i]) {
						max = scores[i];
					}
				}
				System.out.println(max);
			} else if (selectNo == 5) {
				run = false;
			} 
		}
		System.out.println("프로그램 종료");
	}
}
	