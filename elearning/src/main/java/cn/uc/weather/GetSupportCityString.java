
package cn.uc.weather;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "theRegionCode"
})
@XmlRootElement(name = "getSupportCityString")
public class GetSupportCityString {

    protected String theRegionCode;
    public String getTheRegionCode() {
        return theRegionCode;
    }

    public void setTheRegionCode(String value) {
        this.theRegionCode = value;
    }

}
