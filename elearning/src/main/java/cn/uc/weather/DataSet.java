
package cn.uc.weather;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "any"
})
public class DataSet {

    @XmlAnyElement(lax = true)
    protected Object any;

    public Object getAny() {
        return any;
    }

    public void setAny(Object value) {
        this.any = value;
    }

}
