/**
 * UnassignIpRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sandvine.subscriberservices.ws;

public class UnassignIpRequest  extends com.sandvine.subscriberservices.ws.Request  implements java.io.Serializable {
    private com.sandvine.subscriberservices.ws.SubscriberKey subscriberKey;

    private com.sandvine.subscriberservices.ws.IpEndpoint ipEndpoint;

    private java.util.Calendar unassigned;

    public UnassignIpRequest() {
    }

    public UnassignIpRequest(
           java.lang.Boolean debug,
           com.sandvine.subscriberservices.ws.SubscriberKey subscriberKey,
           com.sandvine.subscriberservices.ws.IpEndpoint ipEndpoint,
           java.util.Calendar unassigned) {
        super(
            debug);
        this.subscriberKey = subscriberKey;
        this.ipEndpoint = ipEndpoint;
        this.unassigned = unassigned;
    }


    /**
     * Gets the subscriberKey value for this UnassignIpRequest.
     * 
     * @return subscriberKey
     */
    public com.sandvine.subscriberservices.ws.SubscriberKey getSubscriberKey() {
        return subscriberKey;
    }


    /**
     * Sets the subscriberKey value for this UnassignIpRequest.
     * 
     * @param subscriberKey
     */
    public void setSubscriberKey(com.sandvine.subscriberservices.ws.SubscriberKey subscriberKey) {
        this.subscriberKey = subscriberKey;
    }


    /**
     * Gets the ipEndpoint value for this UnassignIpRequest.
     * 
     * @return ipEndpoint
     */
    public com.sandvine.subscriberservices.ws.IpEndpoint getIpEndpoint() {
        return ipEndpoint;
    }


    /**
     * Sets the ipEndpoint value for this UnassignIpRequest.
     * 
     * @param ipEndpoint
     */
    public void setIpEndpoint(com.sandvine.subscriberservices.ws.IpEndpoint ipEndpoint) {
        this.ipEndpoint = ipEndpoint;
    }


    /**
     * Gets the unassigned value for this UnassignIpRequest.
     * 
     * @return unassigned
     */
    public java.util.Calendar getUnassigned() {
        return unassigned;
    }


    /**
     * Sets the unassigned value for this UnassignIpRequest.
     * 
     * @param unassigned
     */
    public void setUnassigned(java.util.Calendar unassigned) {
        this.unassigned = unassigned;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UnassignIpRequest)) return false;
        UnassignIpRequest other = (UnassignIpRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.subscriberKey==null && other.getSubscriberKey()==null) || 
             (this.subscriberKey!=null &&
              this.subscriberKey.equals(other.getSubscriberKey()))) &&
            ((this.ipEndpoint==null && other.getIpEndpoint()==null) || 
             (this.ipEndpoint!=null &&
              this.ipEndpoint.equals(other.getIpEndpoint()))) &&
            ((this.unassigned==null && other.getUnassigned()==null) || 
             (this.unassigned!=null &&
              this.unassigned.equals(other.getUnassigned())));
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
        if (getSubscriberKey() != null) {
            _hashCode += getSubscriberKey().hashCode();
        }
        if (getIpEndpoint() != null) {
            _hashCode += getIpEndpoint().hashCode();
        }
        if (getUnassigned() != null) {
            _hashCode += getUnassigned().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UnassignIpRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "UnassignIpRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriberKey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SubscriberKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "SubscriberKey"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipEndpoint");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IpEndpoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "IpEndpoint"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unassigned");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Unassigned"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
