
package cn.uc.weather;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getRegionDatasetResult"
})
@XmlRootElement(name = "getRegionDatasetResponse")
public class GetRegionDatasetResponse {

    protected GetRegionDatasetResponse.GetRegionDatasetResult getRegionDatasetResult;

   
    public GetRegionDatasetResponse.GetRegionDatasetResult getGetRegionDatasetResult() {
        return getRegionDatasetResult;
    }

   
    public void setGetRegionDatasetResult(GetRegionDatasetResponse.GetRegionDatasetResult value) {
        this.getRegionDatasetResult = value;
    }


    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "any"
    })
    public static class GetRegionDatasetResult {

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
