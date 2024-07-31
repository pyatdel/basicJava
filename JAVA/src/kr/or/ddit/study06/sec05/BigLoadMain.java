package kr.or.ddit.study06.sec05;

import java.util.Date;

public class BigLoadMain {
	public static void main(String[] args) {
		Date d1 = new Date();
		BigLoad.getInstacne();
		BigLoad.getInstacne();
		BigLoad.getInstacne();
		BigLoad.getInstacne();
		BigLoad.getInstacne();
//		new BigLoad();
//		new BigLoad();
//		new BigLoad();
//		new BigLoad();
//		new BigLoad();
		Date d2 = new Date();
		
		System.out.print(d2.getTime()-d1.getTime());
	}
	
}
