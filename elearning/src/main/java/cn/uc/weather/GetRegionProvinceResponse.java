
package cn.uc.weather;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getRegionProvinceResult"
})
@XmlRootElement(name = "getRegionProvinceResponse")
public class GetRegionProvinceResponse {

    protected ArrayOfString getRegionProvinceResult;

    public ArrayOfString getGetRegionProvinceResult() {
        return getRegionProvinceResult;
    }

    public void setGetRegionProvinceResult(ArrayOfString value) {
        this.getRegionProvinceResult = value;
    }

}
