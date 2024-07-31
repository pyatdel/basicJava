package kr.or.ddit.study13.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample02 {
	public static void main(String[] args) {
		// 제네릭 <>
		// 내가 원하는 타입으로 설정 할 수 있음.
		// 생략 한다면 Object가 기본 타입.
		List<String> list = new ArrayList();
		list.add("a");
		
		String str = list.get(0);
		
		List<Integer> list2 = new ArrayList();
		list2.add(10);
		
	}
}
