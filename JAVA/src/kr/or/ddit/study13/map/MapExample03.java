	package kr.or.ddit.study13.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapExample03 {
	public static void main(String[] args) {
		MapExample03 obj = new MapExample03();
		obj.process();
	}
	
	public void process() {
		List<Map<String, Object>> list = insertData();
		printData(list);
//		parkTime(list);
	}
	
	public void parkTime(List<Map<String, Object>> list) {
//						중복 허용 (x)
		Set carSet = new HashSet();
		// carSet 차량번호 담기
		for (Map<String, Object> map : list) {
			String carNum = (String) map.get("차량 번호");
			carSet.add(carNum);
		}
		
		Iterator<String> it = carSet.iterator();
		while(it.hasNext()) {
			String key = it.next();
//			총 주차 시간
			int sum = partTimeDetail(list, key);
//			주차 요금
			int money = getMoney(sum);
			List<Map<String, Object>> parkList = parkList(list, key);
			
//			과제_________________________________
			
//			출력
//			주차 시간
//			주차 요금
//			상세 주차 내역
			
			
			
//			______________________________________
		}
	}
	
	public List<Map<String, Object>> parkList(List<Map<String, Object>> list
			, String carNum_){
		
		
		
		
		return null;
	}
	
	
	public int getMoney(int time) {
//		과제 ________________________________________________
		

//		기본 시간		기본 요금		단위 시간		단위 요금
//		180분		5000		10분			600원
//		200분 -> 5000 + 600 * 2 -> 6200원
//		201분 -> 5000 + 600 * 3 -> 
		if(time<=180) return 5000;
	
		return 5000+(time-180)/10*600;
		
		
		
//		_____________________________________________________
	}
	
	public int partTimeDetail(List<Map<String, Object>> list, String carNum_ ) {
		// carNum 같은 값만 출력해보기 
		int in =0;
		int sum = 0;
		for (Map<String, Object> map : list) {
			String time   = (String) map.get("시각");
			String carNum = (String) map.get("차량 번호");
			String inout  = (String) map.get("내역");
			if(!carNum.equals(carNum_)) continue;
			System.out.println(time+"\t"+carNum+"\t"+inout);
			int min = getTime(time);
			if(inout.equals("입차")) {
				in = min;
			}
			if(inout.equals("출차")) {
				int parkTime = min - in;
				sum+=parkTime;
			}
		}
		return sum;
	}
	
	public int getTime(String time) {
		// 05:34 -> 05, 34 
		//          05*60 + 34
		
		String[] tokens = time.split(":");
		int hour = Integer.parseInt(tokens[0]);
		int min  = Integer.parseInt(tokens[1]);
		int time_ = hour*60+min;
		System.out.println(time_);
		System.out.println(tokens);
		return hour*60+min;
		
	}
	
	
	public void printData(List<Map<String, Object>> list) {
		// 출력 해보기 
		System.out.println("시각\t차량번호\t내역");
		for (Map<String, Object> map : list) {
			String time   = (String) map.get("시각");
			String carNum = (String) map.get("차량 번호");
			String inout  = (String) map.get("내역");
			System.out.println(time+"\t"+carNum+"\t"+inout);
		}
		
	}
	
	
	public List<Map<String, Object>> insertData(){
		List<Map<String, Object>> list = new ArrayList();
		// 시각		차량 번호 		내역
		// 05:34	5961 		입차
		// 06:00	0000 		입차
		// 06:34	0000 		출차
		// 07:59	5961 		출차
		// 07:59	0148 		입차
		// 18:59	0000 		입차
		// 19:09	0148 		출차
		// 22:59	5961 		입차
		// 23:00	5961 		출차
		// 23:50	0000 		출차
		Map<String, Object> map1 = new HashMap();
		map1.put("시각", "05:34");
		map1.put("차량 번호", "5961");
		map1.put("내역", "입차");
		Map<String, Object> map2 = new HashMap();
		map2.put("시각", "06:00");
		map2.put("차량 번호", "0000");
		map2.put("내역", "입차");
		Map<String, Object> map3 = new HashMap();
		map3.put("시각", "06:34");
		map3.put("차량 번호", "0000");
		map3.put("내역", "출차");
		Map<String, Object> map4 = new HashMap();
		map4.put("시각", "07:59");
		map4.put("차량 번호", "5961");
		map4.put("내역", "출차");
		Map<String, Object> map5 = new HashMap();
		map5.put("시각", "07:59");
		map5.put("차량 번호", "0148");
		map5.put("내역", "입차");
		Map<String, Object> map6 = new HashMap();
		map6.put("시각", "18:59");
		map6.put("차량 번호", "0000");
		map6.put("내역", "입차");
		Map<String, Object> map7 = new HashMap();
		map7.put("시각", "19:09");
		map7.put("차량 번호", "0148");
		map7.put("내역", "출차");
		Map<String, Object> map8 = new HashMap();
		map8.put("시각", "22:59");
		map8.put("차량 번호", "5961");
		map8.put("내역", "입차");
		Map<String, Object> map9 = new HashMap();
		map9.put("시각", "23:00");
		map9.put("차량 번호", "5961");
		map9.put("내역", "출차");
		Map<String, Object> map10 = new HashMap();
		map10.put("시각", "23:50");
		map10.put("차량 번호", "0000");
		map10.put("내역", "출차");
		
		list.add(map1);
		list.add(map2);
		list.add(map3);
		list.add(map4);
		list.add(map5);
		list.add(map6);
		list.add(map7);
		list.add(map8);
		list.add(map9);
		list.add(map10);
		
		
		
		return list;
	}
	
}