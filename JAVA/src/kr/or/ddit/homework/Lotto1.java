package kr.or.ddit.homework;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lotto1 {
	
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Lotto1 obj = new Lotto1();
		obj.process();
	}
	
	public void process() {

	}
	
	public int[] generateLotto() {
		int[] lotto = new int[5];
		System.out.println(lotto.length);
		for(int i=0; i<lotto.length; i++) {
			int ran = new Random().nextInt(45)+1;
			lotto[i] = ran;
			
			for(int j=0; j<i; j++) {
				if(lotto[j] == ran) {
					i--;
					break;
				}
			}
		}
		return lotto;
	}
}
	
	
	
	
