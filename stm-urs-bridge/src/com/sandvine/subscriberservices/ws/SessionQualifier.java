/**
 * SessionQualifier.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sandvine.subscriberservices.ws;

public class SessionQualifier  implements java.io.Serializable {
    private java.lang.Integer siteNumber;

    private java.lang.Integer lowPort;

    private java.lang.Integer highPort;

    public SessionQualifier() {
    }

    public SessionQualifier(
           java.lang.Integer siteNumber,
           java.lang.Integer lowPort,
           java.lang.Integer highPort) {
           this.siteNumber = siteNumber;
           this.lowPort = lowPort;
           this.highPort = highPort;
    }


    /**
     * Gets the siteNumber value for this SessionQualifier.
     * 
     * @return siteNumber
     */
    public java.lang.Integer getSiteNumber() {
        return siteNumber;
    }


    /**
     * Sets the siteNumber value for this SessionQualifier.
     * 
     * @param siteNumber
     */
    public void setSiteNumber(java.lang.Integer siteNumber) {
        this.siteNumber = siteNumber;
    }


    /**
     * Gets the lowPort value for this SessionQualifier.
     * 
     * @return lowPort
     */
    public java.lang.Integer getLowPort() {
        return lowPort;
    }


    /**
     * Sets the lowPort value for this SessionQualifier.
     * 
     * @param lowPort
     */
    public void setLowPort(java.lang.Integer lowPort) {
        this.lowPort = lowPort;
    }


    /**
     * Gets the highPort value for this SessionQualifier.
     * 
     * @return highPort
     */
    public java.lang.Integer getHighPort() {
        return highPort;
    }


    /**
     * Sets the highPort value for this SessionQualifier.
     * 
     * @param highPort
     */
    public void setHighPort(java.lang.Integer highPort) {
        this.highPort = highPort;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SessionQualifier)) return false;
        SessionQualifier other = (SessionQualifier) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.siteNumber==null && other.getSiteNumber()==null) || 
             (this.siteNumber!=null &&
              this.siteNumber.equals(other.getSiteNumber()))) &&
            ((this.lowPort==null && other.getLowPort()==null) || 
             (this.lowPort!=null &&
              this.lowPort.equals(other.getLowPort()))) &&
            ((this.highPort==null && other.getHighPort()==null) || 
             (this.highPort!=null &&
              this.highPort.equals(other.getHighPort())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getSiteNumber() != null) {
            _hashCode += getSiteNumber().hashCode();
        }
        if (getLowPort() != null) {
            _hashCode += getLowPort().hashCode();
        }
        if (getHighPort() != null) {
            _hashCode += getHighPort().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SessionQualifier.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "SessionQualifier"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("siteNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SiteNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lowPort");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LowPort"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("highPort");
        elemField.setXmlName(new javax.xml.namespace.QName("", "HighPort"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
