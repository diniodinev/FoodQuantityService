
package main.java.bg.fmi.quality.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for calculateQuantity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="calculateQuantity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arg0" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="arg1" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="arg2" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="arg3" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="arg4" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="arg5" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "calculateQuantity", propOrder = {
    "arg0",
    "arg1",
    "arg2",
    "arg3",
    "arg4",
    "arg5"
})
public class CalculateQuantity {

    protected double arg0;
    protected double arg1;
    protected double arg2;
    protected double arg3;
    protected double arg4;
    protected double arg5;

    /**
     * Gets the value of the arg0 property.
     * 
     */
    public double getArg0() {
        return arg0;
    }

    /**
     * Sets the value of the arg0 property.
     * 
     */
    public void setArg0(double value) {
        this.arg0 = value;
    }

    /**
     * Gets the value of the arg1 property.
     * 
     */
    public double getArg1() {
        return arg1;
    }

    /**
     * Sets the value of the arg1 property.
     * 
     */
    public void setArg1(double value) {
        this.arg1 = value;
    }

    /**
     * Gets the value of the arg2 property.
     * 
     */
    public double getArg2() {
        return arg2;
    }

    /**
     * Sets the value of the arg2 property.
     * 
     */
    public void setArg2(double value) {
        this.arg2 = value;
    }

    /**
     * Gets the value of the arg3 property.
     * 
     */
    public double getArg3() {
        return arg3;
    }

    /**
     * Sets the value of the arg3 property.
     * 
     */
    public void setArg3(double value) {
        this.arg3 = value;
    }

    /**
     * Gets the value of the arg4 property.
     * 
     */
    public double getArg4() {
        return arg4;
    }

    /**
     * Sets the value of the arg4 property.
     * 
     */
    public void setArg4(double value) {
        this.arg4 = value;
    }

    /**
     * Gets the value of the arg5 property.
     * 
     */
    public double getArg5() {
        return arg5;
    }

    /**
     * Sets the value of the arg5 property.
     * 
     */
    public void setArg5(double value) {
        this.arg5 = value;
    }

}
