package kr.or.ddit.MyStudy.Practice.today;

public class method03 {
	public static void main(String[] args) {
		method03 m = new method03();
		
		m.method1();
		m.method2();
		m.method3();
		m.method4();
		m.method5();
		
	}
	public int method1() {
//		리턴 타입이 나오면 리턴 생성
//		리턴을 만나면 메소드는 즉시 종료
//		이하 코드는 사용 불가
		System.out.println("aa");
		return 10;
	}
	
	public double method2() {
		return 5.5;
	}
	
	public String method3() {
		
		return "aaa";
	}
	
	public int[] method4() {
		
		int[] arr = {1, 2, 3};
		return arr;
	}
	
	public void method5() {
		
		int num=2;
		if(num%2==0)
			System.out.println("ㅁㅁㅁㅁ");
		return;
	}
}
