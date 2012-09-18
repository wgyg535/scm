
/*
 * 
 */

package com.genscript.gsscm.epicorwebservice.stub.lot;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.2.6
 * Wed Aug 24 10:20:02 CST 2011
 * Generated source version: 2.2.6
 * 
 */


@WebServiceClient(name = "LotSelectUpdateService", 
                  wsdlLocation = "file:LotSelectUpdateService.asmx.xml",
                  targetNamespace = "http://epicor.com/webservices/") 
public class LotSelectUpdateService extends Service {

    public final static URL WSDL_LOCATION;
    public final static QName SERVICE = new QName("http://epicor.com/webservices/", "LotSelectUpdateService");
    public final static QName LotSelectUpdateServiceSoap12 = new QName("http://epicor.com/webservices/", "LotSelectUpdateServiceSoap12");
    public final static QName LotSelectUpdateServiceSoap = new QName("http://epicor.com/webservices/", "LotSelectUpdateServiceSoap");
    static {
        URL url = null;
        try {
            url = new URL("http://10.168.2.131/EpicorServices/LotSelectUpdateService.asmx?WSDL");
        } catch (MalformedURLException e) {
            System.err.println("Can not initialize the default wsdl from http://10.168.2.131/EpicorServices/LotSelectUpdateService.asmx?WSDL");
            // e.printStackTrace();
        }
        WSDL_LOCATION = url;
    }

    public LotSelectUpdateService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public LotSelectUpdateService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public LotSelectUpdateService() {
        super(WSDL_LOCATION, SERVICE);
    }

    /**
     * 
     * @return
     *     returns LotSelectUpdateServiceSoap
     */
    @WebEndpoint(name = "LotSelectUpdateServiceSoap12")
    public LotSelectUpdateServiceSoap getLotSelectUpdateServiceSoap12() {
        return super.getPort(LotSelectUpdateServiceSoap12, LotSelectUpdateServiceSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns LotSelectUpdateServiceSoap
     */
    @WebEndpoint(name = "LotSelectUpdateServiceSoap12")
    public LotSelectUpdateServiceSoap getLotSelectUpdateServiceSoap12(WebServiceFeature... features) {
        return super.getPort(LotSelectUpdateServiceSoap12, LotSelectUpdateServiceSoap.class, features);
    }
    /**
     * 
     * @return
     *     returns LotSelectUpdateServiceSoap
     */
    @WebEndpoint(name = "LotSelectUpdateServiceSoap")
    public LotSelectUpdateServiceSoap getLotSelectUpdateServiceSoap() {
        return super.getPort(LotSelectUpdateServiceSoap, LotSelectUpdateServiceSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns LotSelectUpdateServiceSoap
     */
    @WebEndpoint(name = "LotSelectUpdateServiceSoap")
    public LotSelectUpdateServiceSoap getLotSelectUpdateServiceSoap(WebServiceFeature... features) {
        return super.getPort(LotSelectUpdateServiceSoap, LotSelectUpdateServiceSoap.class, features);
    }

}