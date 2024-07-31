package kr.or.ddit.study06.sec04;

import java.util.Scanner;

public class Car {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Car obj = new Car();
		obj.process();
	}

	public void process() {
		
	}
	int gas;
	
	public void run() {
		while(gas > 0) {
			gas--;
			System.out.println("계속 달리시겠습니까?");
			String yn = sc.next();
			if(yn.equals("y")) {
				
			} else {
				break;
			}
		}
	}
}
