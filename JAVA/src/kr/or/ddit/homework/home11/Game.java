package kr.or.ddit.homework.home11;

import java.util.Scanner;

public class Game {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Game obj = new Game();
		obj.process();
	}

	public void process() {
		Deck deck = new Deck();
//		deck.printCardList(); // shuffle 확인후 주석 처리
		deck.shuffle();
//		deck.printCardList(); // shuffle 확인후 주석 처리
		
		// 내카드는 0 번째 카드
		Card myCard  = deck.getCard(0);
		
		// 컴퓨터 카드는 랜덤 으로 가져올것.
		int ran = (int)(Math.random()*51)+1;
		Card comCard = deck.getCard(ran);
		
		// 승패 출력 
		// 내카드 숫자가 높다면           win 
		//           같거나 낮다면 lose
		// ex)  내카드 : ◆5   컴카드 :♥10
		//      lose 
		System.out.println("내카드 : "+myCard+" 컴퓨터 카드 : "+comCard);
		if(myCard.num > comCard.num) System.out.println("win");
		else System.out.println("lose");
		
	}
	
	
}
