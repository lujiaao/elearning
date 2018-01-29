
package cn.uc.weather;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


@XmlRegistry
public class ObjectFactory {

    private final static QName _DataSet_QNAME = new QName("http://WebXml.com.cn/", "DataSet");
    private final static QName _ArrayOfString_QNAME = new QName("http://WebXml.com.cn/", "ArrayOfString");
    public ObjectFactory() {
    }

    public GetSupportCityDatasetResponse createGetSupportCityDatasetResponse() {
        return new GetSupportCityDatasetResponse();
    }

    public GetRegionDatasetResponse createGetRegionDatasetResponse() {
        return new GetRegionDatasetResponse();
    }
    public GetRegionCountry createGetRegionCountry() {
        return new GetRegionCountry();
    }

    public DataSet createDataSet() {
        return new DataSet();
    }

    public GetSupportCityDatasetResponse.GetSupportCityDatasetResult createGetSupportCityDatasetResponseGetSupportCityDatasetResult() {
        return new GetSupportCityDatasetResponse.GetSupportCityDatasetResult();
    }

    public GetWeather createGetWeather() {
        return new GetWeather();
    }

    public GetRegionProvince createGetRegionProvince() {
        return new GetRegionProvince();
    }

    public GetRegionCountryResponse createGetRegionCountryResponse() {
        return new GetRegionCountryResponse();
    }

    public ArrayOfString createArrayOfString() {
        return new ArrayOfString();
    }

    public GetSupportCityString createGetSupportCityString() {
        return new GetSupportCityString();
    }

    public GetSupportCityStringResponse createGetSupportCityStringResponse() {
        return new GetSupportCityStringResponse();
    }

    public GetRegionDatasetResponse.GetRegionDatasetResult createGetRegionDatasetResponseGetRegionDatasetResult() {
        return new GetRegionDatasetResponse.GetRegionDatasetResult();
    }

    public GetWeatherResponse createGetWeatherResponse() {
        return new GetWeatherResponse();
    }

    public GetRegionDataset createGetRegionDataset() {
        return new GetRegionDataset();
    }

    public GetSupportCityDataset createGetSupportCityDataset() {
        return new GetSupportCityDataset();
    }

    public GetRegionProvinceResponse createGetRegionProvinceResponse() {
        return new GetRegionProvinceResponse();
    }

    @XmlElementDecl(namespace = "http://WebXml.com.cn/", name = "DataSet")
    public JAXBElement<DataSet> createDataSet(DataSet value) {
        return new JAXBElement<DataSet>(_DataSet_QNAME, DataSet.class, null, value);
    }

    @XmlElementDecl(namespace = "http://WebXml.com.cn/", name = "ArrayOfString")
    public JAXBElement<ArrayOfString> createArrayOfString(ArrayOfString value) {
        return new JAXBElement<ArrayOfString>(_ArrayOfString_QNAME, ArrayOfString.class, null, value);
    }

}
