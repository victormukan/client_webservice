
package com.sofia.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for historyRecord complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="historyRecord">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mathOperation" type="{http://soap.web.sofia.com/}mathOperation" minOccurs="0"/>
 *         &lt;element name="requestTime" type="{http://soap.web.sofia.com/}localDateTime" minOccurs="0"/>
 *         &lt;element name="result" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "historyRecord", propOrder = {
    "mathOperation",
    "requestTime",
    "result"
})
public class HistoryRecord {

    protected MathOperation mathOperation;
    protected LocalDateTime requestTime;
    protected Double result;

    /**
     * Gets the value of the mathOperation property.
     * 
     * @return
     *     possible object is
     *     {@link MathOperation }
     *     
     */
    public MathOperation getMathOperation() {
        return mathOperation;
    }

    /**
     * Sets the value of the mathOperation property.
     * 
     * @param value
     *     allowed object is
     *     {@link MathOperation }
     *     
     */
    public void setMathOperation(MathOperation value) {
        this.mathOperation = value;
    }

    /**
     * Gets the value of the requestTime property.
     * 
     * @return
     *     possible object is
     *     {@link LocalDateTime }
     *     
     */
    public LocalDateTime getRequestTime() {
        return requestTime;
    }

    /**
     * Sets the value of the requestTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalDateTime }
     *     
     */
    public void setRequestTime(LocalDateTime value) {
        this.requestTime = value;
    }

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setResult(Double value) {
        this.result = value;
    }

}
