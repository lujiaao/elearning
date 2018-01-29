
package cn.uc.weather;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


@WebService(name = "WeatherWSSoap", targetNamespace = "http://WebXml.com.cn/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WeatherWSSoap {


    
    @WebMethod(action = "http://WebXml.com.cn/getRegionDataset")
    @WebResult(name = "getRegionDatasetResult", targetNamespace = "http://WebXml.com.cn/")
    @RequestWrapper(localName = "getRegionDataset", targetNamespace = "http://WebXml.com.cn/", className = "cn.uc.weather.GetRegionDataset")
    @ResponseWrapper(localName = "getRegionDatasetResponse", targetNamespace = "http://WebXml.com.cn/", className = "cn.uc.weather.GetRegionDatasetResponse")
    public cn.uc.weather.GetRegionDatasetResponse.GetRegionDatasetResult getRegionDataset();

   
    @WebMethod(action = "http://WebXml.com.cn/getRegionProvince")
    @WebResult(name = "getRegionProvinceResult", targetNamespace = "http://WebXml.com.cn/")
    @RequestWrapper(localName = "getRegionProvince", targetNamespace = "http://WebXml.com.cn/", className = "cn.uc.weather.GetRegionProvince")
    @ResponseWrapper(localName = "getRegionProvinceResponse", targetNamespace = "http://WebXml.com.cn/", className = "cn.uc.weather.GetRegionProvinceResponse")
    public ArrayOfString getRegionProvince();

   
    @WebMethod(action = "http://WebXml.com.cn/getRegionCountry")
    @WebResult(name = "getRegionCountryResult", targetNamespace = "http://WebXml.com.cn/")
    @RequestWrapper(localName = "getRegionCountry", targetNamespace = "http://WebXml.com.cn/", className = "cn.uc.weather.GetRegionCountry")
    @ResponseWrapper(localName = "getRegionCountryResponse", targetNamespace = "http://WebXml.com.cn/", className = "cn.uc.weather.GetRegionCountryResponse")
    public ArrayOfString getRegionCountry();

    
    @WebMethod(action = "http://WebXml.com.cn/getSupportCityDataset")
    @WebResult(name = "getSupportCityDatasetResult", targetNamespace = "http://WebXml.com.cn/")
    @RequestWrapper(localName = "getSupportCityDataset", targetNamespace = "http://WebXml.com.cn/", className = "cn.uc.weather.GetSupportCityDataset")
    @ResponseWrapper(localName = "getSupportCityDatasetResponse", targetNamespace = "http://WebXml.com.cn/", className = "cn.uc.weather.GetSupportCityDatasetResponse")
    public cn.uc.weather.GetSupportCityDatasetResponse.GetSupportCityDatasetResult getSupportCityDataset(
        @WebParam(name = "theRegionCode", targetNamespace = "http://WebXml.com.cn/")
        String theRegionCode);

    @WebMethod(action = "http://WebXml.com.cn/getSupportCityString")
    @WebResult(name = "getSupportCityStringResult", targetNamespace = "http://WebXml.com.cn/")
    @RequestWrapper(localName = "getSupportCityString", targetNamespace = "http://WebXml.com.cn/", className = "cn.uc.weather.GetSupportCityString")
    @ResponseWrapper(localName = "getSupportCityStringResponse", targetNamespace = "http://WebXml.com.cn/", className = "cn.uc.weather.GetSupportCityStringResponse")
    public ArrayOfString getSupportCityString(
        @WebParam(name = "theRegionCode", targetNamespace = "http://WebXml.com.cn/")
        String theRegionCode);

    
    @WebMethod(action = "http://WebXml.com.cn/getWeather")
    @WebResult(name = "getWeatherResult", targetNamespace = "http://WebXml.com.cn/")
    @RequestWrapper(localName = "getWeather", targetNamespace = "http://WebXml.com.cn/", className = "cn.uc.weather.GetWeather")
    @ResponseWrapper(localName = "getWeatherResponse", targetNamespace = "http://WebXml.com.cn/", className = "cn.uc.weather.GetWeatherResponse")
    public ArrayOfString getWeather(
        @WebParam(name = "theCityCode", targetNamespace = "http://WebXml.com.cn/")
        String theCityCode,
        @WebParam(name = "theUserID", targetNamespace = "http://WebXml.com.cn/")
        String theUserID);

}
