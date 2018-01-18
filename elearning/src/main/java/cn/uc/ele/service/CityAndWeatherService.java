package cn.uc.ele.service;

import java.util.List;

public interface CityAndWeatherService {
	
	List<String> getProvince();
	
	List<String> getCity(String province);
	
	List<String> getWeather(String city);
}
