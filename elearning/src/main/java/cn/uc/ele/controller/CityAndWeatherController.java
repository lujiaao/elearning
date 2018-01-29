package cn.uc.ele.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.uc.ele.service.CityAndWeatherService;

@Controller
@RequestMapping("/front")
public class CityAndWeatherController {
	@Autowired
	CityAndWeatherService cityAndWeatherService;

	@RequestMapping("/province")
	@ResponseBody
	public List<String> findProvince() {
		return cityAndWeatherService.getProvince();
	}
	
	@RequestMapping("/city")
	@ResponseBody
	public List<String> findCity(String province) {
		return cityAndWeatherService.getCity(province);
	}

	@RequestMapping("/weather")
	@ResponseBody
	public List<String> findWeather(String city) {
		System.out.println("city:"+city);
		List<String> weather = cityAndWeatherService.getWeather(city);
//		System.out.println("weather:"+weather);
		return weather;
	}
}
