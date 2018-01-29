
package cn.uc.weather;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getSupportCityDatasetResult"
})
@XmlRootElement(name = "getSupportCityDatasetResponse")
public class GetSupportCityDatasetResponse {

    protected GetSupportCityDatasetResponse.GetSupportCityDatasetResult getSupportCityDatasetResult;

    public GetSupportCityDatasetResponse.GetSupportCityDatasetResult getGetSupportCityDatasetResult() {
        return getSupportCityDatasetResult;
    }

    public void setGetSupportCityDatasetResult(GetSupportCityDatasetResponse.GetSupportCityDatasetResult value) {
        this.getSupportCityDatasetResult = value;
    }


    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "any"
    })
    public static class GetSupportCityDatasetResult {

        @XmlAnyElement(lax = true)
        protected Object any;

        public Object getAny() {
            return any;
        }

        public void setAny(Object value) {
            this.any = value;
        }

    }

}
