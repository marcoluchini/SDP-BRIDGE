/**
 * SubscribersWithAttributeCountRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sandvine.subscriberservices.ws;

public class SubscribersWithAttributeCountRequest  extends com.sandvine.subscriberservices.ws.Request  implements java.io.Serializable {
    private com.sandvine.subscriberservices.ws.SubscriberAttributeDefinitionKey subscriberAttributeDefinitionKey;

    private java.lang.String value;

    public SubscribersWithAttributeCountRequest() {
    }

    public SubscribersWithAttributeCountRequest(
           java.lang.Boolean debug,
           com.sandvine.subscriberservices.ws.SubscriberAttributeDefinitionKey subscriberAttributeDefinitionKey,
           java.lang.String value) {
        super(
            debug);
        this.subscriberAttributeDefinitionKey = subscriberAttributeDefinitionKey;
        this.value = value;
    }


    /**
     * Gets the subscriberAttributeDefinitionKey value for this SubscribersWithAttributeCountRequest.
     * 
     * @return subscriberAttributeDefinitionKey
     */
    public com.sandvine.subscriberservices.ws.SubscriberAttributeDefinitionKey getSubscriberAttributeDefinitionKey() {
        return subscriberAttributeDefinitionKey;
    }


    /**
     * Sets the subscriberAttributeDefinitionKey value for this SubscribersWithAttributeCountRequest.
     * 
     * @param subscriberAttributeDefinitionKey
     */
    public void setSubscriberAttributeDefinitionKey(com.sandvine.subscriberservices.ws.SubscriberAttributeDefinitionKey subscriberAttributeDefinitionKey) {
        this.subscriberAttributeDefinitionKey = subscriberAttributeDefinitionKey;
    }


    /**
     * Gets the value value for this SubscribersWithAttributeCountRequest.
     * 
     * @return value
     */
    public java.lang.String getValue() {
        return value;
    }


    /**
     * Sets the value value for this SubscribersWithAttributeCountRequest.
     * 
     * @param value
     */
    public void setValue(java.lang.String value) {
        this.value = value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SubscribersWithAttributeCountRequest)) return false;
        SubscribersWithAttributeCountRequest other = (SubscribersWithAttributeCountRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.subscriberAttributeDefinitionKey==null && other.getSubscriberAttributeDefinitionKey()==null) || 
             (this.subscriberAttributeDefinitionKey!=null &&
              this.subscriberAttributeDefinitionKey.equals(other.getSubscriberAttributeDefinitionKey()))) &&
            ((this.value==null && other.getValue()==null) || 
             (this.value!=null &&
              this.value.equals(other.getValue())));
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
        if (getSubscriberAttributeDefinitionKey() != null) {
            _hashCode += getSubscriberAttributeDefinitionKey().hashCode();
        }
        if (getValue() != null) {
            _hashCode += getValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SubscribersWithAttributeCountRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "SubscribersWithAttributeCountRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriberAttributeDefinitionKey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SubscriberAttributeDefinitionKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "SubscriberAttributeDefinitionKey"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Value"));
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
