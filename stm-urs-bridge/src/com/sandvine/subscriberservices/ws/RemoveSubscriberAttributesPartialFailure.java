/**
 * RemoveSubscriberAttributesPartialFailure.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sandvine.subscriberservices.ws;

public class RemoveSubscriberAttributesPartialFailure  extends com.sandvine.subscriberservices.ws.PartialFailure  implements java.io.Serializable {
    private com.sandvine.subscriberservices.ws.SubscriberKey subscriberKey;

    private com.sandvine.subscriberservices.ws.SubscriberAttributeDefinitionKey subscriberAttributeDefinitionKey;

    public RemoveSubscriberAttributesPartialFailure() {
    }

    public RemoveSubscriberAttributesPartialFailure(
           java.lang.String code,
           java.lang.String message,
           com.sandvine.subscriberservices.ws.SubscriberKey subscriberKey,
           com.sandvine.subscriberservices.ws.SubscriberAttributeDefinitionKey subscriberAttributeDefinitionKey) {
        super(
            code,
            message);
        this.subscriberKey = subscriberKey;
        this.subscriberAttributeDefinitionKey = subscriberAttributeDefinitionKey;
    }


    /**
     * Gets the subscriberKey value for this RemoveSubscriberAttributesPartialFailure.
     * 
     * @return subscriberKey
     */
    public com.sandvine.subscriberservices.ws.SubscriberKey getSubscriberKey() {
        return subscriberKey;
    }


    /**
     * Sets the subscriberKey value for this RemoveSubscriberAttributesPartialFailure.
     * 
     * @param subscriberKey
     */
    public void setSubscriberKey(com.sandvine.subscriberservices.ws.SubscriberKey subscriberKey) {
        this.subscriberKey = subscriberKey;
    }


    /**
     * Gets the subscriberAttributeDefinitionKey value for this RemoveSubscriberAttributesPartialFailure.
     * 
     * @return subscriberAttributeDefinitionKey
     */
    public com.sandvine.subscriberservices.ws.SubscriberAttributeDefinitionKey getSubscriberAttributeDefinitionKey() {
        return subscriberAttributeDefinitionKey;
    }


    /**
     * Sets the subscriberAttributeDefinitionKey value for this RemoveSubscriberAttributesPartialFailure.
     * 
     * @param subscriberAttributeDefinitionKey
     */
    public void setSubscriberAttributeDefinitionKey(com.sandvine.subscriberservices.ws.SubscriberAttributeDefinitionKey subscriberAttributeDefinitionKey) {
        this.subscriberAttributeDefinitionKey = subscriberAttributeDefinitionKey;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RemoveSubscriberAttributesPartialFailure)) return false;
        RemoveSubscriberAttributesPartialFailure other = (RemoveSubscriberAttributesPartialFailure) obj;
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
        int _hashCode = super.hashCode();
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
        new org.apache.axis.description.TypeDesc(RemoveSubscriberAttributesPartialFailure.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "RemoveSubscriberAttributesPartialFailure"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriberKey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SubscriberKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "SubscriberKey"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriberAttributeDefinitionKey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SubscriberAttributeDefinitionKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "SubscriberAttributeDefinitionKey"));
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
