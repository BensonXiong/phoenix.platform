//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.20 at 08:57:45 AM CST 
//


package org.suren.autotest.platform.schemas;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for strategyEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="strategyEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="priority"/>
 *     &lt;enumeration value="cyle"/>
 *     &lt;enumeration value="zone"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "strategyEnum")
@XmlEnum
public enum StrategyEnum {


    /**
     * ���ȼ�����
     * 
     */
    @XmlEnumValue("priority")
    PRIORITY("priority"),

    /**
     * ѭ������
     * 
     */
    @XmlEnumValue("cyle")
    CYLE("cyle"),

    /**
     * �������
     * 
     */
    @XmlEnumValue("zone")
    ZONE("zone");
    private final String value;

    StrategyEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StrategyEnum fromValue(String v) {
        for (StrategyEnum c: StrategyEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}