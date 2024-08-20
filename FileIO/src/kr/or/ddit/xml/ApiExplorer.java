package kr.or.ddit.xml;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class ApiExplorer {
    public static void main(String[] args) throws IOException {
       // 디비 
       // city 테이블 -> nx, ny  
    	
       // weather 테이블 조회 
       
    	// 데이터 x 
    	// api 조회 
    	
    	// 데이터 있어 
    	// 디비에서 데이터 가져오기
    	
    }
    
    public void getApi(String nx, String ny) throws Exception {
    	 Date date = new Date();
    	 SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
    	 String today = sdf.format(date); 
    	 SimpleDateFormat sdf2 = new SimpleDateFormat("HH");
    	 String time = sdf2.format(date)+"00";
    	
    	 StringBuilder urlBuilder = new StringBuilder("http://apis.data.go.kr/1360000/VilageFcstInfoService_2.0/getUltraSrtFcst"); /*URL*/
         urlBuilder.append("?" + URLEncoder.encode("serviceKey","UTF-8") +"="+ "v6UKjT6p1bshd6P3gYNAFNH%2BcOi5GXt64YW9Y5Sc%2BupYcnuvqrZE2kOVxsvVjDkgtZlAJVJk1Jzt3ie6G0ndjQ%3D%3D"); /*Service Key*/
         urlBuilder.append("&" + URLEncoder.encode("pageNo","UTF-8") + "=" + URLEncoder.encode("1", "UTF-8")); /*페이지번호*/
         urlBuilder.append("&" + URLEncoder.encode("numOfRows","UTF-8") + "=" + URLEncoder.encode("1000", "UTF-8")); /*한 페이지 결과 수*/
         urlBuilder.append("&" + URLEncoder.encode("dataType","UTF-8") + "=" + URLEncoder.encode("XML", "UTF-8")); /*요청자료형식(XML/JSON) Default: XML*/
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
         
         System.out.println(sb.toString());
         
         InputStream is = new ByteArrayInputStream(sb.toString().getBytes());
 		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
 		try {
 			DocumentBuilder build = factory.newDocumentBuilder();
 			Document doc = build.parse(is);
 			Element  el = doc.getDocumentElement();
 			NodeList items = el.getElementsByTagName("item");
 			for(int i=0; i<items.getLength(); i++) {
 				Node node = items.item(i);
 				Element elItem = (Element)node;
 				Element category = (Element) elItem.getElementsByTagName("category").item(0);
 				Element fcstTime = (Element) elItem.getElementsByTagName("fcstTime").item(0);
 				Element fcstValue = (Element) elItem.getElementsByTagName("fcstValue").item(0);
 				String chk = category.getTextContent();
 				if(chk.equals("T1H") || chk.equals("RN1") || chk.equals("SKY") || chk.equals("REH")) {
 					System.out.println(category.getTextContent()+"\t"+fcstTime.getTextContent()+"\t"+fcstValue.getTextContent());
 					
 				}
 				
 				
 			}
 		} catch (Exception e) {
 			e.printStackTrace();
 		}
    }
}