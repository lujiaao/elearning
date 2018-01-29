
package cn.uc.weather;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getSupportCityStringResult"
})
@XmlRootElement(name = "getSupportCityStringResponse")
public class GetSupportCityStringResponse {

    protected ArrayOfString getSupportCityStringResult;

    public ArrayOfString getGetSupportCityStringResult() {
        return getSupportCityStringResult;
    }

    public void setGetSupportCityStringResult(ArrayOfString value) {
        this.getSupportCityStringResult = value;
    }

}
