package kr.or.ddit.study13.list;

public class ArrayMain {
	public static void main(String[] args) {
		// 10까지의 숫자 중에 3의 배수 값을 넣으시오.
		
//		int count =0; 
//		for(int i=1; i<=10; i++) {
//			if(i%3==0) count++;
//		}
//		
//		String[] str = new String[count];
//		
//		count = 0;
//		for(int i=1; i<=10; i++) {
//			if(i%3==0) {
//				str[count++] = i+"";
//			}
//		}
		
		CustumArrayList list = new CustumArrayList();
		for(int i=1; i<=100; i++) {
			if(i%3==0) list.add(i+"");
		}
		String str = list.remove(1);
		System.out.println(str+"님이 탈퇴하셨습니다.");
		System.out.println();
		
		
		
	}
}
