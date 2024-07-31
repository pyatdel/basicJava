package kr.or.ddit.study06.sec04;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lotto {
	
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Lotto obj = new Lotto();
		obj.process();
	}
	
	
	public void process() {
		System.out.print("금액 : ");

		int money = sc.nextInt();
//		(1)
		int[][][] bundle= lottoBundle(money);
//		(3)
		printBundle(bundle);
	}
	
	public void printBundle(int[][][] bundle) {
		for(int[][] paper : bundle) {
			System.out.println("===========================");
			for(int[] lotto : paper) {
				System.out.println(array2String(lotto));
			}
			System.out.println("===========================");
		}
	}
	
	public int[][][] lottoBundle(int money){
//		(2)
		int papers = money/5000;
		if(money%5000 != 0) papers++;
		int[][][] bundle = new int[papers][5][6];  // int bundle의 3번째 배열 역할..?
		System.out.println(bundle.length); // 번들 길이 확인용 (papers)
//		papers만큼 반복
		for(int i=0; i<bundle.length; i++) {
			bundle[i] = lottoPaper();
		}
		if(money%5000!=0) {
			bundle[bundle.length-1] = lottoPaper(money%5000/1000);
		}

		return bundle;
	}
	
//	로또 종이 하나의 배열
	public int[][] lottoPaper(int num){
//		(4)
		int[][] paper = new int[num][6];
		System.out.println(paper.length); // 종이 길이 확인용, 2번째 배열 길이
		for(int k =0; k<paper.length; k++) {
//			(7),(10)
			paper[k] = generateLotto();
		}
		return paper;
	}
	
	public int[][] lottoPaper(){
//		(3), (row)
		return lottoPaper(5);
	}
	
	
	
	public int[] generateLotto() {
		int[] lotto = new int[6];
//		(5),(8),(11)
		System.out.println(lotto.length); // 로또 길이 확인용 (종이 수)
		for(int i=0; i<lotto.length; i++) {
			int ran = new Random().nextInt(45)+1;
			lotto[i] = ran;
			
			for(int j=0; j<i/*lotto.length?*/; j++) {
				if(lotto[j] == ran) {
					i--;
					break;
				}
			}
		}
//		sort(lotto);
		return lotto;
	}
	
	public String array2String(int[] lotto) {
		String result = "[";
		for(int i=0; i<lotto.length ; i++) {
			result += lotto[i];
			if(lotto.length-1 != i) result+=", ";
		}
		result += "]";
		return result;
	}
	
	public void sort(int[] lotto) {
//		(6),(9)
		for(int i=0; i<lotto.length-1; i++) {
			for(int j=0; j<lotto.length-1; j++) {
				if(lotto[j] > lotto[j+1]) {
					int temp = lotto[j];
					lotto[j] = lotto[j+1];
					lotto[j+1] = temp;
				}
			}
		}
	}
}