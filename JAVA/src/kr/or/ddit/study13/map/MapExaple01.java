package kr.or.ddit.study13.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExaple01 {
	public static void main(String[] args) {
		/*
		 *   HashMap 
		 *    key 와 value로 이루어짐 
		 *    key 값은 중복을 허용하지 않고 순서가 보장되지 않음
		 *    
		 *   Map 타입의 대표 컬렉션 
		 *   
		 *   주요 메소드 
		 *   .put(key, value)  : 데이터 입력 key 값은 중복 허용 x 
		 *                               value값은 중복 허용 
		 *   .get(key)         : value 값을 key 값을 통해 꺼내올수 있음.
		 *   .keySet()         : key로 이루어진 hashSet 값을 가져옴. 
		 *     
		 */
		
		Map<String, Integer> map = new HashMap();
		map.put("홍길동", 95);
		map.put("이순신", 75);
		map.put("정몽주", 100);
		map.put("정몽주", 60);
		map.put("이성계", 80);
		
		int hongScore = map.get("홍길동");
		System.out.println(hongScore);
		// 정몽주 점수 출력
		int jungScroe = map.get("정몽주");
		System.out.println(jungScroe);
		
		Set keySet = map.keySet();
		Iterator<String> it = keySet.iterator();
		while(it.hasNext()) {
			String key = it.next();
			int value = map.get(key);
			System.out.println(key+", "+value);
		}
		
		
	}
}
