package cn.uc.weather;

import java.util.List;

public class TestMain {
	public static void main(String[] args) {
		WeatherWS weatherWS = new WeatherWS();
		WeatherWSSoap weatherWSSoap = weatherWS.getWeatherWSSoap();
		
		ArrayOfString arrayOfString = weatherWSSoap.getRegionCountry();
		List<String> countrys = arrayOfString.getString();
		for(String country:countrys ){
			System.out.println(country);
		}
		
	}
}
