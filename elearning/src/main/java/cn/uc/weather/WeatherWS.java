
package cn.uc.weather;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;



@WebServiceClient(name = "WeatherWS", targetNamespace = "http://WebXml.com.cn/", wsdlLocation = "http://ws.webxml.com.cn/WebServices/WeatherWS.asmx?wsdl")
public class WeatherWS
    extends Service
{

    private final static URL WEATHERWS_WSDL_LOCATION;
    private final static WebServiceException WEATHERWS_EXCEPTION;
    private final static QName WEATHERWS_QNAME = new QName("http://WebXml.com.cn/", "WeatherWS");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://ws.webxml.com.cn/WebServices/WeatherWS.asmx?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WEATHERWS_WSDL_LOCATION = url;
        WEATHERWS_EXCEPTION = e;
    }

    public WeatherWS() {
        super(__getWsdlLocation(), WEATHERWS_QNAME);
    }

    public WeatherWS(WebServiceFeature... features) {
        super(__getWsdlLocation(), WEATHERWS_QNAME, features);
    }

    public WeatherWS(URL wsdlLocation) {
        super(wsdlLocation, WEATHERWS_QNAME);
    }

    public WeatherWS(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WEATHERWS_QNAME, features);
    }

    public WeatherWS(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WeatherWS(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    @WebEndpoint(name = "WeatherWSSoap")
    public WeatherWSSoap getWeatherWSSoap() {
        return super.getPort(new QName("http://WebXml.com.cn/", "WeatherWSSoap"), WeatherWSSoap.class);
    }

    @WebEndpoint(name = "WeatherWSSoap")
    public WeatherWSSoap getWeatherWSSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://WebXml.com.cn/", "WeatherWSSoap"), WeatherWSSoap.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WEATHERWS_EXCEPTION!= null) {
            throw WEATHERWS_EXCEPTION;
        }
        return WEATHERWS_WSDL_LOCATION;
    }

}
