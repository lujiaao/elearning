package cn.uc.ele.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import cn.uc.ele.service.CityAndWeatherService;
import cn.uc.weather.WeatherWS;
import cn.uc.weather.WeatherWSSoap;

@Service
public class CityAndWeatherServiceImpl implements CityAndWeatherService {
	
	WeatherWS weatherWS = new WeatherWS();
	WeatherWSSoap weatherWSSoap = weatherWS.getWeatherWSSoap(); 

	@Override
	public List<String> getProvince() {
		// TODO Auto-generated method stub
		return weatherWSSoap.getRegionProvince().getString();
	}

	@Override
	public List<String> getCity(String province) {
		// TODO Auto-generated method stub
		return weatherWSSoap.getSupportCityString(province).getString();
	}

	@Override
	public List<String> getWeather(String city) {
		// TODO Auto-generated method stub
		return weatherWSSoap.getWeather(city, null).getString();
	}

}
