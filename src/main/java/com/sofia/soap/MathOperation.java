
package com.sofia.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mathOperation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mathOperation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="firstNumber" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="operationType" type="{http://soap.web.sofia.com/}operationType" minOccurs="0"/>
 *         &lt;element name="secondNumber" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mathOperation", propOrder = {
    "firstNumber",
    "operationType",
    "secondNumber"
})
public class MathOperation {

    public double firstNumber;
    public OperationType operationType;
    public double secondNumber;

    public MathOperation() {
    }

    public MathOperation(double firstNumber, OperationType operationType, double secondNumber) {
        this.firstNumber = firstNumber;
        this.operationType = operationType;
        this.secondNumber = secondNumber;
    }

    /**
     * Gets the value of the firstNumber property.
     * 
     */
    public double getFirstNumber() {
        return firstNumber;
    }

    /**
     * Sets the value of the firstNumber property.
     * 
     */
    public void setFirstNumber(double value) {
        this.firstNumber = value;
    }

    /**
     * Gets the value of the operationType property.
     * 
     * @return
     *     possible object is
     *     {@link OperationType }
     *     
     */
    public OperationType getOperationType() {
        return operationType;
    }

    /**
     * Sets the value of the operationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationType }
     *     
     */
    public void setOperationType(OperationType value) {
        this.operationType = value;
    }

    /**
     * Gets the value of the secondNumber property.
     * 
     */
    public double getSecondNumber() {
        return secondNumber;
    }

    /**
     * Sets the value of the secondNumber property.
     * 
     */
    public void setSecondNumber(double value) {
        this.secondNumber = value;
    }

}
