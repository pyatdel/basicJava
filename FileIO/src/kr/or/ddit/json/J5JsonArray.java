package kr.or.ddit.json;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;

public class J5JsonArray {
	public static void main(String[] args) {
		List<String> list = new ArrayList();
		list.add("a");
		list.add("b");
		
		JSONArray array = new JSONArray(list);
		System.out.println(array);
	}
}
