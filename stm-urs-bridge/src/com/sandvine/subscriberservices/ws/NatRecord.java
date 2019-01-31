/**
 * NatRecord.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sandvine.subscriberservices.ws;

public class NatRecord  implements java.io.Serializable {
    private com.sandvine.subscriberservices.ws.IpEndpoint privateIpEndpoint;

    private com.sandvine.subscriberservices.ws.IpEndpoint publicIpEndpoint;

    public NatRecord() {
    }

    public NatRecord(
           com.sandvine.subscriberservices.ws.IpEndpoint privateIpEndpoint,
           com.sandvine.subscriberservices.ws.IpEndpoint publicIpEndpoint) {
           this.privateIpEndpoint = privateIpEndpoint;
           this.publicIpEndpoint = publicIpEndpoint;
    }


    /**
     * Gets the privateIpEndpoint value for this NatRecord.
     * 
     * @return privateIpEndpoint
     */
    public com.sandvine.subscriberservices.ws.IpEndpoint getPrivateIpEndpoint() {
        return privateIpEndpoint;
    }


    /**
     * Sets the privateIpEndpoint value for this NatRecord.
     * 
     * @param privateIpEndpoint
     */
    public void setPrivateIpEndpoint(com.sandvine.subscriberservices.ws.IpEndpoint privateIpEndpoint) {
        this.privateIpEndpoint = privateIpEndpoint;
    }


    /**
     * Gets the publicIpEndpoint value for this NatRecord.
     * 
     * @return publicIpEndpoint
     */
    public com.sandvine.subscriberservices.ws.IpEndpoint getPublicIpEndpoint() {
        return publicIpEndpoint;
    }


    /**
     * Sets the publicIpEndpoint value for this NatRecord.
     * 
     * @param publicIpEndpoint
     */
    public void setPublicIpEndpoint(com.sandvine.subscriberservices.ws.IpEndpoint publicIpEndpoint) {
        this.publicIpEndpoint = publicIpEndpoint;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NatRecord)) return false;
        NatRecord other = (NatRecord) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.privateIpEndpoint==null && other.getPrivateIpEndpoint()==null) || 
             (this.privateIpEndpoint!=null &&
              this.privateIpEndpoint.equals(other.getPrivateIpEndpoint()))) &&
            ((this.publicIpEndpoint==null && other.getPublicIpEndpoint()==null) || 
             (this.publicIpEndpoint!=null &&
              this.publicIpEndpoint.equals(other.getPublicIpEndpoint())));
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
        if (getPrivateIpEndpoint() != null) {
            _hashCode += getPrivateIpEndpoint().hashCode();
        }
        if (getPublicIpEndpoint() != null) {
            _hashCode += getPublicIpEndpoint().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NatRecord.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "NatRecord"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("privateIpEndpoint");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PrivateIpEndpoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "IpEndpoint"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publicIpEndpoint");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PublicIpEndpoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "IpEndpoint"));
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
