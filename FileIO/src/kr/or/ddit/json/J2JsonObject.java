package kr.or.ddit.json;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONObject;

public class J2JsonObject {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap();
		map.put("prodno", "1");
		map.put("prodname", "컴퓨터");
		
		JSONObject json = new JSONObject(map);
		System.out.println(json);
		
		
	}
}
