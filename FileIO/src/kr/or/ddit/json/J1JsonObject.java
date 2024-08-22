package kr.or.ddit.json;

import org.json.JSONObject;

public class J1JsonObject {
	public static void main(String[] args) {
//		key, value
//		{"key":"value",
//		 "key2" : "value" 
//		}
		
//		API 
//		디비데이터 외부 사용자가 사용할 수 있게 가공해서 제공
		
		JSONObject json = new JSONObject();
		json.put("prodno", "1");
		json.put("prodname", "컴퓨터");
		
		System.out.println(json);
	}
}
