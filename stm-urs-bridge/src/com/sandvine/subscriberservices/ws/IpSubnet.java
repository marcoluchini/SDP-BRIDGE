/**
 * IpSubnet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sandvine.subscriberservices.ws;

public class IpSubnet  implements java.io.Serializable {
    private com.sandvine.subscriberservices.ws.IpEndpoint ipEndpoint;

    private int prefixLength;

    public IpSubnet() {
    }

    public IpSubnet(
           com.sandvine.subscriberservices.ws.IpEndpoint ipEndpoint,
           int prefixLength) {
           this.ipEndpoint = ipEndpoint;
           this.prefixLength = prefixLength;
    }


    /**
     * Gets the ipEndpoint value for this IpSubnet.
     * 
     * @return ipEndpoint
     */
    public com.sandvine.subscriberservices.ws.IpEndpoint getIpEndpoint() {
        return ipEndpoint;
    }


    /**
     * Sets the ipEndpoint value for this IpSubnet.
     * 
     * @param ipEndpoint
     */
    public void setIpEndpoint(com.sandvine.subscriberservices.ws.IpEndpoint ipEndpoint) {
        this.ipEndpoint = ipEndpoint;
    }


    /**
     * Gets the prefixLength value for this IpSubnet.
     * 
     * @return prefixLength
     */
    public int getPrefixLength() {
        return prefixLength;
    }


    /**
     * Sets the prefixLength value for this IpSubnet.
     * 
     * @param prefixLength
     */
    public void setPrefixLength(int prefixLength) {
        this.prefixLength = prefixLength;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IpSubnet)) return false;
        IpSubnet other = (IpSubnet) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ipEndpoint==null && other.getIpEndpoint()==null) || 
             (this.ipEndpoint!=null &&
              this.ipEndpoint.equals(other.getIpEndpoint()))) &&
            this.prefixLength == other.getPrefixLength();
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
        if (getIpEndpoint() != null) {
            _hashCode += getIpEndpoint().hashCode();
        }
        _hashCode += getPrefixLength();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IpSubnet.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "IpSubnet"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipEndpoint");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IpEndpoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "IpEndpoint"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prefixLength");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PrefixLength"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
