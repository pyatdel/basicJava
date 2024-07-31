package kr.or.ddit.homework.home11;

public class Deck {
	Card[] cardList;
	
	Deck(){
		int cnt = 0;
		cardList = new Card[52];
		String[] types = {"♠", "◇", "♡","♣"};
		for(int i=0; i<4; i++) {
			for(int j=1; j<=13; j++) {
				cardList[cnt++] = new Card(j, types[i]);
			}
		}
	}
	
	public void printCardList() {
		for(int i=0; i<cardList.length; i++) {
			System.out.println(cardList[i]);
		}
	}
	
	public void shuffle() {
//		카드 섞기
	}
	
	public Card getCard(int num) {
		return cardList[num];
	}
}







/*public void shuffle() {
//	카드 섞기
	
	  for(int i=0; i<10000; i++){
	  int ran = Math.randow()*cardList.length);
	  Cart temp = cardList[0];
	  cardList[0] = cardList[ran];
	  cardList[ran] = temp;
	 
}*/
