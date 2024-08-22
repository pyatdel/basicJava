package kr.or.ddit.json;

import java.util.Iterator;

import org.json.JSONObject;

public class J3JsonObject {
	public static void main(String[] args) {
		String str = "{\"prodno\":\"1\",\"prodname\":\"컴퓨터\"}";
		
//		String을 json 객체로 만듦
		JSONObject json = new JSONObject(str);
		
		Iterator<String> it = json.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			String val = json.getString(key);
			System.out.println(key+"\t"+val);
		}
		System.out.println(json);
	}
}
