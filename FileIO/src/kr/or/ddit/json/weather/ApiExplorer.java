package kr.or.ddit.json.weather;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.json.JSONArray;
import org.json.JSONObject;

public class ApiExplorer {
    public static void main(String[] args) throws IOException {
    	ApiExplorer ae = new ApiExplorer();
    	ae.process();
    }
       // 디비 
       // city 테이블 -> nx, ny  
    	
       // weather 테이블 조회 
       
    	// 데이터 x 
    	// api 조회 
    	
    	// 데이터 있어 
    	// 디비에서 데이터 가져오기
    	
    WeatherService service = WeatherService.getInstacne();
    
    Scanner sc = new Scanner(System.in);
    
    private void process() {
//		try {
//			getApi("36", "127");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
    	List<Map<String, Object>> cityList = service.cityList();
    	for(Map<String, Object> map : cityList) {
    		System.out.println(map);
    	}
    	
    	System.out.println("조회할 도시 입력");
    	int no = sc.nextInt();
    	Map<String, Object> selectCity = null;
    	for(Map<String, Object> map : cityList) {
    		BigDecimal cityNo = (BigDecimal) map.get("CITY_NO");
    		if(cityNo.intValue() == no) selectCity = map;
    	}
    	
    	// 날씨 디비에 있는지 조회
    	List<Object> param = new ArrayList();
    	param.add(no);
    	
    	Date date = new Date();
    	SimpleDateFormat sdf = new SimpleDateFormat("HH");
    	String time = sdf.format(date)+":00";
    	param.add(time);
    	
    	Map<String, Object> map = service.getWeather(param);
    	// 날씨가 디비에 없다면 -> api를 가져온다
    	
    	if(map == null) {
    		try {
    			
    			Map<String, String> api = getApi(selectCity.get("NX")+"", selectCity.get("NY")+"");
    			param.add(api.get("T1H"));
    			param.add(api.get("RN1"));
    			param.add(api.get("SKY"));
    			param.add(api.get("REH"));
    			service.insertWeather(param);
    			
    			System.out.println(time + "\t" + api.get("T1H") + api.get("RN1") + "\t" + api.get("REH"));
    		} catch(Exception e) {
    			e.printStackTrace();
    		}
    	} else {
    		System.out.println(time + "\t" + map.get("T1H") + map.get("RN1") + "\t" + map.get("REH"));
    	}
	}
    
    public Map getApi(String nx, String ny) throws Exception {
    	 Date date = new Date();
    	 SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
    	 String today = sdf.format(date); 
    	 SimpleDateFormat sdf2 = new SimpleDateFormat("HH");
    	 SimpleDateFormat sdf3 = new SimpleDateFormat("mm");
    	 int min = Integer.parseInt(sdf3.format(date));
    	 if(min<30) date.setHours(date.getHours()-1);
    	 String time = sdf2.format(date)+"00";
 
    	 
    	 
    	 StringBuilder urlBuilder = new StringBuilder("http://apis.data.go.kr/1360000/VilageFcstInfoService_2.0/getUltraSrtFcst"); /*URL*/
         urlBuilder.append("?" + URLEncoder.encode("serviceKey","UTF-8") +"="+ "v6UKjT6p1bshd6P3gYNAFNH%2BcOi5GXt64YW9Y5Sc%2BupYcnuvqrZE2kOVxsvVjDkgtZlAJVJk1Jzt3ie6G0ndjQ%3D%3D"); /*Service Key*/
         urlBuilder.append("&" + URLEncoder.encode("pageNo","UTF-8") + "=" + URLEncoder.encode("1", "UTF-8")); /*페이지번호*/
         urlBuilder.append("&" + URLEncoder.encode("numOfRows","UTF-8") + "=" + URLEncoder.encode("1000", "UTF-8")); /*한 페이지 결과 수*/
         urlBuilder.append("&" + URLEncoder.encode("dataType","UTF-8") + "=" + URLEncoder.encode("JSON", "UTF-8")); /*요청자료형식(XML/JSON) Default: XML*/
         urlBuilder.append("&" + URLEncoder.encode("base_date","UTF-8") + "=" + URLEncoder.encode(today, "UTF-8")); /*‘21년 6월 28일 발표*/
         urlBuilder.append("&" + URLEncoder.encode("base_time","UTF-8") + "=" + URLEncoder.encode(time, "UTF-8")); /*06시 발표(정시단위) */
         urlBuilder.append("&" + URLEncoder.encode("nx","UTF-8") + "=" + URLEncoder.encode(nx, "UTF-8")); /*예보지점의 X 좌표값*/
         urlBuilder.append("&" + URLEncoder.encode("ny","UTF-8") + "=" + URLEncoder.encode(ny, "UTF-8")); /*예보지점의 Y 좌표값*/
         URL url = new URL(urlBuilder.toString());
         HttpURLConnection conn = (HttpURLConnection) url.openConnection();
         conn.setRequestMethod("GET");
         conn.setRequestProperty("Content-type", "application/json");
         System.out.println("Response code: " + conn.getResponseCode());
         BufferedReader rd;
         if(conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
             rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
         } else {
             rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
         }
         StringBuilder sb = new StringBuilder();
         String line;
         while ((line = rd.readLine()) != null) {
             sb.append(line);
         }
         rd.close();
         conn.disconnect();
         
//         System.out.println(sb.toString());
         
         if(min<30) {
        	 date.setHours(date.getHours()+1);
        	 time = sdf2.format(date)+"00";
         }
         Map<String, String> map = new HashMap();
         
         JSONObject root = new JSONObject(sb.toString());
         JSONObject response = (JSONObject) root.get("response");
         JSONObject body = response.getJSONObject("body");
         JSONObject items = body.getJSONObject("items");
         JSONArray itemArray = items.getJSONArray("item");
         for(Object object : itemArray) {
        	 JSONObject item = (JSONObject)object;
        	 String fcstTime = (String) item.get("fcstTime");
        	 String category = (String) item.get("category");
        	 String fcstValue = (String) item.get("fcstValue");
        	 if(category.equals("T1H") || category.equals("RN1") || category.equals("SKY") ||
        			 category.equals("REH")) {
        		 if(fcstTime.equals(time)) continue;
//        		 System.out.println(fcstTime + "\t"+category + "\t" + fcstValue);
        		 map.put(category, fcstValue);
        	 }
         }
         System.out.println(map);
         return map;
         
//        InputStream is = new ByteArrayInputStream(sb.toString().getBytes());
// 		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
// 		try {
// 			DocumentBuilder build = factory.newDocumentBuilder();
// 			Document doc = build.parse(is);
// 			Element  el = doc.getDocumentElement();
// 			NodeList items = el.getElementsByTagName("item");
// 			for(int i=0; i<items.getLength(); i++) {
// 				Node node = items.item(i);
// 				Element elItem = (Element)node;
// 				Element category = (Element) elItem.getElementsByTagName("category").item(0);
// 				Element fcstTime = (Element) elItem.getElementsByTagName("fcstTime").item(0);
// 				Element fcstValue = (Element) elItem.getElementsByTagName("fcstValue").item(0);
// 				String chk = category.getTextContent();
// 				if(chk.equals("T1H") || chk.equals("RN1") || chk.equals("SKY") || chk.equals("REH")) {
// 					System.out.println(category.getTextContent()+"\t"+fcstTime.getTextContent()+"\t"+fcstValue.getTextContent());
// 					
// 				}
// 				
// 				
// 			}
// 		} catch (Exception e) {
// 			e.printStackTrace();
// 		}
    }
}