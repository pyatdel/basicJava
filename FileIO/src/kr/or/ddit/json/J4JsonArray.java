package kr.or.ddit.json;

import org.json.JSONArray;
import org.json.JSONObject;

public class J4JsonArray {
	public static void main(String[] args) {
//		JSONArray jsonArray = new JSONArray();
//		jsonArray.put("test1");
//		jsonArray.put("test2");
//		
//		System.out.println(jsonArray);
		
		JSONObject root = new JSONObject();
		
		JSONObject pageInfo = new JSONObject();
		pageInfo.put("pageName", "1");
		pageInfo.put("pagePic", "2");
		
		root.put("pageInfo", pageInfo);
		
		JSONArray posts = new JSONArray();
		JSONObject post1 = new JSONObject();
		post1.put("post_id", "3");
		post1.put("message", "4");
		post1.put("likesCount", "5");
		
		JSONObject post2 = new JSONObject();
		post1.put("post_id", "6");
		post1.put("message", "7");
		post1.put("likesCount", "8");
		
		posts.put(post1);
		posts.put(post2);
		
		root.put("posts", posts);
		
		System.out.println(root);
	}
}
