package kr.or.ddit.homework;

import java.util.Scanner;

public class HomeWork08 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork08 obj = new HomeWork08();
		obj.process();
	}

	public void process() {
//		국 영 수 총점 평균 등수

		int[][] scores = { { 90, 80, 70, 0, 0, 1 }, { 84, 72, 65, 0, 0, 1 }, { 87, 99, 42, 0, 0, 1 },
				{ 77, 61, 81, 0, 0, 1 }, { 80, 77, 92, 0, 0, 1 } };

//				총점을 구해서 0,3의 0에 넣기
//				평균을 구해서 0,4의 0에 넣기

		for (int i = 0; i < scores.length; i++) {
			scores[i][3] = scores[i][0] + scores[i][1] + scores[i][2];
			scores[i][4] = scores[i][3] / 3;
		}
//		등수 구하기
		for (int i = 0; i < scores.length; i++) {
			for (int j = 0; j < scores.length; j++) {
				if (scores[i][3] < scores[j][3]) {
					scores[i][5]++;
				}
			}
		}
		
		

			
//		등수'만' 정렬하기 (연습용)
//		for (int i=0; i < scores.length; i++) {
//			for (int j=0; j < scores.length - 1-i; j++) {
//					if (scores[j][5] > scores[j+1][5]) {
//						int temp = scores[j][5];
//						scores[j][5] = scores[j+1][5];
//						scores[j+1][5] = temp;
//					}
//				}
//			}
		
		
		
//		등수를 기준으로 정렬하기 (연습용)
//		for (int i=0; i < scores.length-1; i++) {
//			for (int j=0; j < scores.length -1-i; j++) {
//					if (scores[j][5] > scores[j+1][5]) {
//						int temp = scores[i][j];
//						scores[i][j] = scores[i+1][j];
//						scores[i+1][j] = temp;
//					}
//				}
//			}
		
		
//		등수를 기준으로 정렬하기 (연습용2)
//		for (int i = 0; i < scores.length - 1; i++) {
//            for (int j = 0; j < scores.length - 1-i; j++) {
//                for (int k = 0; k < scores.length - 1-i; k++) {
//                    if (scores[k][5] > scores[k + 1][5]) {
//
//                        int[] temp = scores[k];
//                        scores[k] = scores[k + 1];
//                        scores[k + 1] = temp;
//                    }
//                }
//            }
//        }
		
//		i). 등수'만' 정렬하기
//		System.out.println("국\t영\t수\t총점\t평균\t등수");
//		System.out.println("========================================");
//		for (int i = 0; i < scores.length - 1; i++) {
//			for (int j = 0; j < scores.length - 1-i; j++) {
//					if (scores[j][5] > scores[j+1][5]) {
//						int temp = scores[j][5];
//						scores[j][5] = scores[j + 1][5];
//						scores[j + 1][5] = temp;
		
		
					
		
//		ii) 등수를 기준으로 정렬하기
//		System.out.println("국\t영\t수\t총점\t평균\t등수");
//		System.out.println("========================================");
//		for (int i = 0; i < scores.length - 1; i++) {
//			for (int j = 0; j < scores.length - 1-i; j++) {
//					if (scores[j][5] < scores[j+1][5]) {
//						int temp = scores[i][j];
//						scores[i][j] = scores[i+1][j];
//						scores[i+1][j] = temp;
//
//					}
		
//		iii) 등수를 기준으로 정렬하기2
		System.out.println("국\t영\t수\t총점\t평균\t등수");
		System.out.println("========================================");
		for (int i = 0; i < scores.length - 1; i++) {
			for (int j = 0; j < scores.length - 1-i; j++) {
				for(int k=0; k<scores.length-1-i; k++) {
					if (scores[k][5] < scores[k+1][5]) {
						int[] temp = scores[k];
						scores[k] = scores[k + 1];
						scores[k + 1] = temp;
				}
			}
//
					System.out.print(scores[i][j] + "\t");
				}
				System.out.println();
			}
			System.out.println("========================================");
		
			
			 System.out.println("국\t영\t수\t총점\t평균\t등수");
			 System.out.println("========================================"); for (int i =
			 0; i < scores.length; i++) { for (int j = 0; j < scores[i].length; j++) {
			 System.out.print(scores[i][j] + "\t"); } System.out.println(); }
			 System.out.println("========================================");
//			 
		
	}
}
	

