package kr.or.ddit.study06.sec04;

public class Method03 {
	
	public int method1() {
//		리턴 타입이 나오면 리턴 생성
//		리턴을 만나면 메소드는 즉시 종료
//		>> 이하 코드는 사용 불가
		
		System.out.println("aa");
		return 10;
	}
	
	public double method02() {
		return 5.5;
	}
	
	public String method03() {
		
		return "aaa";
	}
	
	public int[] method04() {
		
//		리턴을 여러개 하고 싶으면?
//		배열 사용
		
		int[] arr = {1,2,3};
		return arr;
	}
	
	public void method5() {
		
		int num =2;
		if(num%2==0) // return ;
//		else return;
		System.out.println("ㅁㅁㅁㅁ");
//		void 형식을 사용할 때, return 사용 방법
		return ;
	}	
}
