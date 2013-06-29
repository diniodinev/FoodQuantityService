
package main.java.bg.fmi.quality.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the main.java.bg.fmi.quality.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CalculateQuantity_QNAME = new QName("http://ws.fmi.bg.java.main/", "calculateQuantity");
    private final static QName _CalculateQuantityResponse_QNAME = new QName("http://ws.fmi.bg.java.main/", "calculateQuantityResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: main.java.bg.fmi.quality.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CalculateQuantity }
     * 
     */
    public CalculateQuantity createCalculateQuantity() {
        return new CalculateQuantity();
    }

    /**
     * Create an instance of {@link CalculateQuantityResponse }
     * 
     */
    public CalculateQuantityResponse createCalculateQuantityResponse() {
        return new CalculateQuantityResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculateQuantity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.fmi.bg.java.main/", name = "calculateQuantity")
    public JAXBElement<CalculateQuantity> createCalculateQuantity(CalculateQuantity value) {
        return new JAXBElement<CalculateQuantity>(_CalculateQuantity_QNAME, CalculateQuantity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculateQuantityResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.fmi.bg.java.main/", name = "calculateQuantityResponse")
    public JAXBElement<CalculateQuantityResponse> createCalculateQuantityResponse(CalculateQuantityResponse value) {
        return new JAXBElement<CalculateQuantityResponse>(_CalculateQuantityResponse_QNAME, CalculateQuantityResponse.class, null, value);
    }

}
