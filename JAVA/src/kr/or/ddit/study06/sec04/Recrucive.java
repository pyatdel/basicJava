package kr.or.ddit.study06.sec04;

import java.util.Date;
import java.util.Scanner;

public class Recrucive {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Recrucive obj = new Recrucive();
		obj.process();
	}

	public void process() {
//		method1(5);
//		int add = add(5);
//		System.out.println(add);
		
//		long gop = gop(20);
//		System.out.println(gop);
		
		Date d1 = new Date();
		
		long febo = febo(50);
		System.out.println(febo);
		
		Date d2 = new Date();
		long time = d2.getTime() - d1.getTime();
		System.out.println(time+"ms");
	}
	
//	피보나치 수열
//	1	2	3	4	5	6	7	8	9	10
//	1	1	2	3	5	8	13	21	34	55	
	
//	같은 연산을 계속해서 수행(비효율)
//	febo(5) -> febo(4) + febo(3)
//	febo(4) -> febo(3) + febo(2), febo(3) -> febo(2) + febo(1)
//	febo(3) -> febo(2),  febo(1), febo(2) -> 1,
//		febo(2) -> 1, febo(1) -> 1
	
	long[] feboList = new long[500];
	public long febo(int num) {
		if(num==1 || num==2) return 1;
		if(feboList[num]!=0) return feboList[num];
		else {
			long result = febo(num-1) + febo(num-2);
			feboList[num] = result;
			return result;
		}
//		return febo(num-1) + febo(num-2);
	}
	
//	gop(5) -> 5*gop(4)
//	gop(4) -> 4*gop(3)
//	gop(3) -> 3*gop(2)
//	gop(2) -> 2*gop(1)
//	gop(1) -> 1
	
	public long gop(int num) {
		if(num == 1) return 1;
		return num*gop(num-1);
	}
	
//	add(5) -> add(4) + 5
//	add(4) -> add(3) + 4
//	add(3) -> add(2) + 3
//	add(2) -> add(1) + 2
//	add(1) -> 1
	
//	num 5 ~1 더하기
	public int add(int num) {
		if(num==1) return 1;
		return num+add(num-1);
	}

	public void method1(int num) {
		System.out.println(num);
		if(num==1) return;
		method1(num-1);
	}
}
