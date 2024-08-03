package kr.or.ddit.study06.sec04;

import java.util.Scanner;

import kr.or.ddit.util.ScanUtil;

public class Car {

	public static void main(String[] args) {
		Car obj = new Car();
		obj.process();
	}
	
	public void process() {
		run();
	}
	int gas=10;
	
	public void run() {
		while(gas > 0) {
			gas--;
			String yn = ScanUtil.nextLine("계속 달리시겠습니까? >>");
			if(yn.equals("y")) {
			
			} else {
				break;
			}
		}
	}
}
