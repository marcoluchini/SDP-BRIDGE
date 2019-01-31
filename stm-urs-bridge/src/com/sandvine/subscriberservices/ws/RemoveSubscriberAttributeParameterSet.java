/**
 * RemoveSubscriberAttributeParameterSet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sandvine.subscriberservices.ws;

public class RemoveSubscriberAttributeParameterSet  implements java.io.Serializable {
    private com.sandvine.subscriberservices.ws.SubscriberKey subscriberKey;

    private com.sandvine.subscriberservices.ws.SubscriberAttributeDefinitionKey subscriberAttributeDefinitionKey;

    public RemoveSubscriberAttributeParameterSet() {
    }

    public RemoveSubscriberAttributeParameterSet(
           com.sandvine.subscriberservices.ws.SubscriberKey subscriberKey,
           com.sandvine.subscriberservices.ws.SubscriberAttributeDefinitionKey subscriberAttributeDefinitionKey) {
           this.subscriberKey = subscriberKey;
           this.subscriberAttributeDefinitionKey = subscriberAttributeDefinitionKey;
    }


    /**
     * Gets the subscriberKey value for this RemoveSubscriberAttributeParameterSet.
     * 
     * @return subscriberKey
     */
    public com.sandvine.subscriberservices.ws.SubscriberKey getSubscriberKey() {
        return subscriberKey;
    }


    /**
     * Sets the subscriberKey value for this RemoveSubscriberAttributeParameterSet.
     * 
     * @param subscriberKey
     */
    public void setSubscriberKey(com.sandvine.subscriberservices.ws.SubscriberKey subscriberKey) {
        this.subscriberKey = subscriberKey;
    }


    /**
     * Gets the subscriberAttributeDefinitionKey value for this RemoveSubscriberAttributeParameterSet.
     * 
     * @return subscriberAttributeDefinitionKey
     */
    public com.sandvine.subscriberservices.ws.SubscriberAttributeDefinitionKey getSubscriberAttributeDefinitionKey() {
        return subscriberAttributeDefinitionKey;
    }


    /**
     * Sets the subscriberAttributeDefinitionKey value for this RemoveSubscriberAttributeParameterSet.
     * 
     * @param subscriberAttributeDefinitionKey
     */
    public void setSubscriberAttributeDefinitionKey(com.sandvine.subscriberservices.ws.SubscriberAttributeDefinitionKey subscriberAttributeDefinitionKey) {
        this.subscriberAttributeDefinitionKey = subscriberAttributeDefinitionKey;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RemoveSubscriberAttributeParameterSet)) return false;
        RemoveSubscriberAttributeParameterSet other = (RemoveSubscriberAttributeParameterSet) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.subscriberKey==null && other.getSubscriberKey()==null) || 
             (this.subscriberKey!=null &&
              this.subscriberKey.equals(other.getSubscriberKey()))) &&
            ((this.subscriberAttributeDefinitionKey==null && other.getSubscriberAttributeDefinitionKey()==null) || 
             (this.subscriberAttributeDefinitionKey!=null &&
              this.subscriberAttributeDefinitionKey.equals(other.getSubscriberAttributeDefinitionKey())));
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
        if (getSubscriberKey() != null) {
            _hashCode += getSubscriberKey().hashCode();
        }
        if (getSubscriberAttributeDefinitionKey() != null) {
            _hashCode += getSubscriberAttributeDefinitionKey().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RemoveSubscriberAttributeParameterSet.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "RemoveSubscriberAttributeParameterSet"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriberKey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SubscriberKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "SubscriberKey"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriberAttributeDefinitionKey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SubscriberAttributeDefinitionKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "SubscriberAttributeDefinitionKey"));
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
