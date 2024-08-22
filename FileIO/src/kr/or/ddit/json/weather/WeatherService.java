package kr.or.ddit.json.weather;

import java.util.List;
import java.util.Map;

public class WeatherService {
	private static WeatherService instance;

	private WeatherService() {

	}

	public static WeatherService getInstacne() {
		if (instance == null) {
			instance = new WeatherService();
		}
		return instance;
	}

	WeatherDao dao = WeatherDao.getInstacne();
	
	public List<Map<String, Object>> cityList(){
		return dao.cityList();
	}
	public Map<String, Object> getWeather(List<Object> param){
		return dao.getWeather(param);
	}
	
	public void insertWeather(List<Object> param) {
		dao.insertWeather(param);
	}
	
}