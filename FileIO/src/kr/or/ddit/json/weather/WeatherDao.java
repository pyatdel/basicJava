package kr.or.ddit.json.weather;

import java.util.List;
import java.util.Map;

import kr.or.ddit.util.JDBCUtil;

public class WeatherDao {
	private static WeatherDao instance;

	private WeatherDao() {

	}

	public static WeatherDao getInstacne() {
		if (instance == null) {
			instance = new WeatherDao();
		}
		return instance;
	}
	
	JDBCUtil jdbc = JDBCUtil.getInstance();
	
	public List<Map<String, Object>> cityList(){
		String sql = " SELECT * FROM CITY ";
		
		return jdbc.selectList(sql);
	}
	
	public Map<String, Object> getWeather(List<Object> param){
		String sql = " SELECT * \r\n"
				+ "FROM WEATHER\r\n"
				+ "WHERE CITY_NO = ? AND TIME= ? ";
		
		return jdbc.selectOne(sql, param);
	}
	
	public void insertWeather(List<Object> param) {
		String sql = " INSERT INTO WEATHER \r\n"
				+ "VALUES ( ?, ?,?,?,?,?) ";
		jdbc.update(sql, param);
	}
	
	
	
	
			
}
