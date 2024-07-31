package kr.or.ddit.homework;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeWork13 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork13 obj = new HomeWork13();
		obj.process();
	}

	public void process() {
		Lotto l = new Lotto();
		int money = 100000;
		while (money > 0) {
			System.out.println("보유 금액 : " + money);
			System.out.print("구매할 로또 금액 : ");
			int pay = sc.nextInt();

			if (pay == 0)
				break;
			if (pay > money) {
				System.out.println("구매 하실 금액이 모자릅니다.");
				continue;
			}
			money -= pay;
			// 당첨 번호 한줄 생성 할것 .
			int[] win = l.generateLotto();
			// 로또 번들 에서 당첨 번호랑 같은 값이 있다면
			int[][][] bundle = l.lottoBundle(pay);
			for (int paper[][] : bundle) {
				for (int[] lotto : paper) {
					if (Arrays.toString(win).equals(Arrays.toString(lotto))) {
						money += 30000;
					}
				}
			}
			// 상금 3만원
		}
	}
}

class Lotto {
	public void printBundle(int[][][] bundle) {
		for (int[][] paper : bundle) {
			System.out.println("===========================");
			for (int[] lotto : paper) {
				System.out.println(array2String(lotto));
			}
			System.out.println("===========================");
		}
	}

	public int[][][] lottoBundle(int money) {

		int papers = money / 5000;
		if (money % 5000 != 0)
			papers++;
		int[][][] bundle = new int[papers][5][6];
		for (int i = 0; i < bundle.length; i++) {
			bundle[i] = lottoPaper();
		}
		if (money % 5000 != 0) {
			bundle[bundle.length - 1] = lottoPaper(money % 5000 / 1000);
		}
		return bundle;
	}

	public int[][] lottoPaper(int num) {
		int[][] paper = new int[num][6];
		for (int k = 0; k < paper.length; k++) {
			paper[k] = generateLotto();
		}
		return paper;
	}

	public int[][] lottoPaper() {
		return lottoPaper(5);
	}

	public int[] generateLotto() {
		int[] lotto = new int[6];
		// 36 45 23 36 0 0
		// 36
		for (int i = 0; i < lotto.length; i++) {
			int ran = new Random().nextInt(8) + 1;
			lotto[i] = ran;
			for (int j = 0; j < i; j++) {
				if (lotto[j] == ran) {
					i--;
					break;
				}
			}
		}
		sort(lotto);
		return lotto;
	}

	public String array2String(int[] lotto) {
		String result = "[";
		for (int i = 0; i < lotto.length; i++) {
			result += lotto[i];
			if (lotto.length - 1 != i)
				result += ", ";
		}
		result += "]";
		return result;
	}

	public void sort(int[] lotto) {
		for (int i = 0; i < lotto.length - 1; i++) {
			for (int j = 0; j < lotto.length - 1; j++) {
				if (lotto[j] > lotto[j + 1]) {
					int temp = lotto[j];
					lotto[j] = lotto[j + 1];
					lotto[j + 1] = temp;
				}
			}
		}
	}
}
