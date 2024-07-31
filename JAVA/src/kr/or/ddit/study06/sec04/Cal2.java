package kr.or.ddit.study06.sec04;

public class Cal2 {
	public static void main(String[] args) {
		Cal2 cal = new Cal2();
		int a=10;
		int b=3;
		int add= cal.add(a,b);
		System.out.println(a+"+"+b+"="+add);
		int minus = cal.minus(a, b);
		System.out.println(a+"-"+b+"="+minus);
		int mul = cal.mul(a, b);
		System.out.println(a+"*"+b+"="+mul);
		double div = cal.div(a, b);
		System.out.println(a+"/"+b+"="+(Math.floor(div)*100)/100.0);
	}
	


	
	public int add(int a, int b) {
		
//		int[] sum = {2, 4};
		
		return a+b;
	}
	
	public int minus(int a, int b) {
		
//		int[] minus = {6, 5};
		return a-b;
	}
	
	public int mul(int a, int b) {
		
//		int[] mul = {4, 5};
		return a*b;
	}
	public double div(int a, int b) {
//		int[] div = {56, 8};
		return (double)a/b;
	}
}

