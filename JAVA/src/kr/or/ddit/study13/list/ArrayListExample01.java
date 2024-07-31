package kr.or.ddit.study13.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample01 {
	public static void main(String[] args) {
		
		List list = new ArrayList();
		// 
		list.add(1);
		list.add("abc");
		list.add(10.5);
		
//		Object obj = list.get(0);
//		int num = (int)obj;
//		System.out.println(num);
		
//		for(int i=0; i<list.size(); i++) {
//			System.out.println(list.get(i));
//		}
		
		int num = (int)list.get(1);
		
		
	}
}
