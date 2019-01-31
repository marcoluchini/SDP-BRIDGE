/**
 * SetSessionAttributesPartialFailure.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sandvine.subscriberservices.ws;

public class SetSessionAttributesPartialFailure  extends com.sandvine.subscriberservices.ws.PartialFailure  implements java.io.Serializable {
    private com.sandvine.subscriberservices.ws.IpEndpoint ipEndpoint;

    private com.sandvine.subscriberservices.ws.SubscriberKey subscriberKey;

    private com.sandvine.subscriberservices.ws.AttributeDefinitionKey attributeDefinitionKey;

    public SetSessionAttributesPartialFailure() {
    }

    public SetSessionAttributesPartialFailure(
           java.lang.String code,
           java.lang.String message,
           com.sandvine.subscriberservices.ws.IpEndpoint ipEndpoint,
           com.sandvine.subscriberservices.ws.SubscriberKey subscriberKey,
           com.sandvine.subscriberservices.ws.AttributeDefinitionKey attributeDefinitionKey) {
        super(
            code,
            message);
        this.ipEndpoint = ipEndpoint;
        this.subscriberKey = subscriberKey;
        this.attributeDefinitionKey = attributeDefinitionKey;
    }


    /**
     * Gets the ipEndpoint value for this SetSessionAttributesPartialFailure.
     * 
     * @return ipEndpoint
     */
    public com.sandvine.subscriberservices.ws.IpEndpoint getIpEndpoint() {
        return ipEndpoint;
    }


    /**
     * Sets the ipEndpoint value for this SetSessionAttributesPartialFailure.
     * 
     * @param ipEndpoint
     */
    public void setIpEndpoint(com.sandvine.subscriberservices.ws.IpEndpoint ipEndpoint) {
        this.ipEndpoint = ipEndpoint;
    }


    /**
     * Gets the subscriberKey value for this SetSessionAttributesPartialFailure.
     * 
     * @return subscriberKey
     */
    public com.sandvine.subscriberservices.ws.SubscriberKey getSubscriberKey() {
        return subscriberKey;
    }


    /**
     * Sets the subscriberKey value for this SetSessionAttributesPartialFailure.
     * 
     * @param subscriberKey
     */
    public void setSubscriberKey(com.sandvine.subscriberservices.ws.SubscriberKey subscriberKey) {
        this.subscriberKey = subscriberKey;
    }


    /**
     * Gets the attributeDefinitionKey value for this SetSessionAttributesPartialFailure.
     * 
     * @return attributeDefinitionKey
     */
    public com.sandvine.subscriberservices.ws.AttributeDefinitionKey getAttributeDefinitionKey() {
        return attributeDefinitionKey;
    }


    /**
     * Sets the attributeDefinitionKey value for this SetSessionAttributesPartialFailure.
     * 
     * @param attributeDefinitionKey
     */
    public void setAttributeDefinitionKey(com.sandvine.subscriberservices.ws.AttributeDefinitionKey attributeDefinitionKey) {
        this.attributeDefinitionKey = attributeDefinitionKey;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SetSessionAttributesPartialFailure)) return false;
        SetSessionAttributesPartialFailure other = (SetSessionAttributesPartialFailure) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.ipEndpoint==null && other.getIpEndpoint()==null) || 
             (this.ipEndpoint!=null &&
              this.ipEndpoint.equals(other.getIpEndpoint()))) &&
            ((this.subscriberKey==null && other.getSubscriberKey()==null) || 
             (this.subscriberKey!=null &&
              this.subscriberKey.equals(other.getSubscriberKey()))) &&
            ((this.attributeDefinitionKey==null && other.getAttributeDefinitionKey()==null) || 
             (this.attributeDefinitionKey!=null &&
              this.attributeDefinitionKey.equals(other.getAttributeDefinitionKey())));
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
        if (getIpEndpoint() != null) {
            _hashCode += getIpEndpoint().hashCode();
        }
        if (getSubscriberKey() != null) {
            _hashCode += getSubscriberKey().hashCode();
        }
        if (getAttributeDefinitionKey() != null) {
            _hashCode += getAttributeDefinitionKey().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SetSessionAttributesPartialFailure.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "SetSessionAttributesPartialFailure"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipEndpoint");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IpEndpoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "IpEndpoint"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriberKey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SubscriberKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "SubscriberKey"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attributeDefinitionKey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AttributeDefinitionKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "AttributeDefinitionKey"));
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
