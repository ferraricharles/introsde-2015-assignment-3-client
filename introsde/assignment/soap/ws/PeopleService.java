
package introsde.assignment.soap.ws;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "PeopleService", targetNamespace = "http://ws.soap.assignment.introsde/", wsdlLocation = "http://10.230.203.81:6902/ws/people?wsdl")
public class PeopleService
    extends Service
{

    private final static URL PEOPLESERVICE_WSDL_LOCATION;
    private final static WebServiceException PEOPLESERVICE_EXCEPTION;
    private final static QName PEOPLESERVICE_QNAME = new QName("http://ws.soap.assignment.introsde/", "PeopleService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://10.230.203.81:6902/ws/people?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        PEOPLESERVICE_WSDL_LOCATION = url;
        PEOPLESERVICE_EXCEPTION = e;
    }

    public PeopleService() {
        super(__getWsdlLocation(), PEOPLESERVICE_QNAME);
    }

    public PeopleService(WebServiceFeature... features) {
        super(__getWsdlLocation(), PEOPLESERVICE_QNAME, features);
    }

    public PeopleService(URL wsdlLocation) {
        super(wsdlLocation, PEOPLESERVICE_QNAME);
    }

    public PeopleService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, PEOPLESERVICE_QNAME, features);
    }

    public PeopleService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public PeopleService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns People
     */
    @WebEndpoint(name = "PeopleImplPort")
    public People getPeopleImplPort() {
        return super.getPort(new QName("http://ws.soap.assignment.introsde/", "PeopleImplPort"), People.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns People
     */
    @WebEndpoint(name = "PeopleImplPort")
    public People getPeopleImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.soap.assignment.introsde/", "PeopleImplPort"), People.class, features);
    }

    private static URL __getWsdlLocation() {
        if (PEOPLESERVICE_EXCEPTION!= null) {
            throw PEOPLESERVICE_EXCEPTION;
        }
        return PEOPLESERVICE_WSDL_LOCATION;
    }

}
