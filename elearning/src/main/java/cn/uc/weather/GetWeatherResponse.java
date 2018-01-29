
package cn.uc.weather;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getWeatherResult"
})
@XmlRootElement(name = "getWeatherResponse")
public class GetWeatherResponse {

    protected ArrayOfString getWeatherResult;

    public ArrayOfString getGetWeatherResult() {
        return getWeatherResult;
    }

    public void setGetWeatherResult(ArrayOfString value) {
        this.getWeatherResult = value;
    }

}
