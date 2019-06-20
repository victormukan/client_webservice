
package com.sofia.soap;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for operationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="operationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ADD"/>
 *     &lt;enumeration value="DISTRACT"/>
 *     &lt;enumeration value="MULTIPLY"/>
 *     &lt;enumeration value="DEVIDE"/>
 *     &lt;enumeration value="PROCENT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "operationType")
@XmlEnum
public enum OperationType {

    ADD,
    DISTRACT,
    MULTIPLY,
    DEVIDE,
    PROCENT;

    public String value() {
        return name();
    }

    public static OperationType fromValue(String v) {
        return valueOf(v);
    }

}
