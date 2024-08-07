package kr.or.ddit.MyStudy.Practice.today;

import java.util.Date;

public class BigLoadMain {
	public static void main(String[] args) {
		Date d1 = new Date();
		BigLoad.getInstancne();
		BigLoad.getInstancne();
		BigLoad.getInstancne();
		BigLoad.getInstancne();
		BigLoad.getInstancne();

		new BigLoad();
		new BigLoad();
		new BigLoad();
		new BigLoad();
		new BigLoad();
		
		Date d2 = new Date();
		
		System.out.print(d1.getTime() - d1.getTime());
	}
}
