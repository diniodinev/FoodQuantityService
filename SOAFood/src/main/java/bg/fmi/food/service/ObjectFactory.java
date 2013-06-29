
package main.java.bg.fmi.food.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the main.java.bg.fmi.food.service package. 
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

    private final static QName _TakeFood_QNAME = new QName("http://ws.fmi.bg.java.main/", "takeFood");
    private final static QName _TakeFoodResponse_QNAME = new QName("http://ws.fmi.bg.java.main/", "takeFoodResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: main.java.bg.fmi.food.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TakeFood }
     * 
     */
    public TakeFood createTakeFood() {
        return new TakeFood();
    }

    /**
     * Create an instance of {@link TakeFoodResponse }
     * 
     */
    public TakeFoodResponse createTakeFoodResponse() {
        return new TakeFoodResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TakeFood }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.fmi.bg.java.main/", name = "takeFood")
    public JAXBElement<TakeFood> createTakeFood(TakeFood value) {
        return new JAXBElement<TakeFood>(_TakeFood_QNAME, TakeFood.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TakeFoodResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.fmi.bg.java.main/", name = "takeFoodResponse")
    public JAXBElement<TakeFoodResponse> createTakeFoodResponse(TakeFoodResponse value) {
        return new JAXBElement<TakeFoodResponse>(_TakeFoodResponse_QNAME, TakeFoodResponse.class, null, value);
    }

}
