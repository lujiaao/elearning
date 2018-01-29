
package cn.uc.weather;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "theCityCode",
    "theUserID"
})
@XmlRootElement(name = "getWeather")
public class GetWeather {

    protected String theCityCode;
    protected String theUserID;

    public String getTheCityCode() {
        return theCityCode;
    }

    public void setTheCityCode(String value) {
        this.theCityCode = value;
    }

    public String getTheUserID() {
        return theUserID;
    }
    public void setTheUserID(String value) {
        this.theUserID = value;
    }

}
