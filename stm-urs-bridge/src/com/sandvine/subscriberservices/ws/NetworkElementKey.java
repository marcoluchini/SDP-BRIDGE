/**
 * NetworkElementKey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sandvine.subscriberservices.ws;

public class NetworkElementKey  extends com.sandvine.subscriberservices.ws.GloballyUniquePrincipalEntityMoKey  implements java.io.Serializable {
    private com.sandvine.subscriberservices.ws.NetworkElementClusterKey networkElementClusterKey;

    private java.lang.String name;

    public NetworkElementKey() {
    }

    public NetworkElementKey(
           java.lang.String id,
           com.sandvine.subscriberservices.ws.NetworkElementClusterKey networkElementClusterKey,
           java.lang.String name) {
        super(
            id);
        this.networkElementClusterKey = networkElementClusterKey;
        this.name = name;
    }


    /**
     * Gets the networkElementClusterKey value for this NetworkElementKey.
     * 
     * @return networkElementClusterKey
     */
    public com.sandvine.subscriberservices.ws.NetworkElementClusterKey getNetworkElementClusterKey() {
        return networkElementClusterKey;
    }


    /**
     * Sets the networkElementClusterKey value for this NetworkElementKey.
     * 
     * @param networkElementClusterKey
     */
    public void setNetworkElementClusterKey(com.sandvine.subscriberservices.ws.NetworkElementClusterKey networkElementClusterKey) {
        this.networkElementClusterKey = networkElementClusterKey;
    }


    /**
     * Gets the name value for this NetworkElementKey.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this NetworkElementKey.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NetworkElementKey)) return false;
        NetworkElementKey other = (NetworkElementKey) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.networkElementClusterKey==null && other.getNetworkElementClusterKey()==null) || 
             (this.networkElementClusterKey!=null &&
              this.networkElementClusterKey.equals(other.getNetworkElementClusterKey()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getNetworkElementClusterKey() != null) {
            _hashCode += getNetworkElementClusterKey().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NetworkElementKey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "NetworkElementKey"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("networkElementClusterKey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NetworkElementClusterKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "NetworkElementClusterKey"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
