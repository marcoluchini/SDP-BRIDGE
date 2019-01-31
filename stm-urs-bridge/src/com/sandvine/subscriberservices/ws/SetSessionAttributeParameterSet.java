/**
 * SetSessionAttributeParameterSet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sandvine.subscriberservices.ws;

public class SetSessionAttributeParameterSet  implements java.io.Serializable {
    private com.sandvine.subscriberservices.ws.SubscriberKey subscriberKey;

    private com.sandvine.subscriberservices.ws.IpAssignmentKey sessionKey;

    private com.sandvine.subscriberservices.ws.AttributeDefinitionKey attributeDefinitionKey;

    private java.lang.String value;

    private java.util.Calendar expiry;

    private java.util.Calendar effective;

    private java.lang.Integer expiryExtension;

    public SetSessionAttributeParameterSet() {
    }

    public SetSessionAttributeParameterSet(
           com.sandvine.subscriberservices.ws.SubscriberKey subscriberKey,
           com.sandvine.subscriberservices.ws.IpAssignmentKey sessionKey,
           com.sandvine.subscriberservices.ws.AttributeDefinitionKey attributeDefinitionKey,
           java.lang.String value,
           java.util.Calendar expiry,
           java.util.Calendar effective,
           java.lang.Integer expiryExtension) {
           this.subscriberKey = subscriberKey;
           this.sessionKey = sessionKey;
           this.attributeDefinitionKey = attributeDefinitionKey;
           this.value = value;
           this.expiry = expiry;
           this.effective = effective;
           this.expiryExtension = expiryExtension;
    }


    /**
     * Gets the subscriberKey value for this SetSessionAttributeParameterSet.
     * 
     * @return subscriberKey
     */
    public com.sandvine.subscriberservices.ws.SubscriberKey getSubscriberKey() {
        return subscriberKey;
    }


    /**
     * Sets the subscriberKey value for this SetSessionAttributeParameterSet.
     * 
     * @param subscriberKey
     */
    public void setSubscriberKey(com.sandvine.subscriberservices.ws.SubscriberKey subscriberKey) {
        this.subscriberKey = subscriberKey;
    }


    /**
     * Gets the sessionKey value for this SetSessionAttributeParameterSet.
     * 
     * @return sessionKey
     */
    public com.sandvine.subscriberservices.ws.IpAssignmentKey getSessionKey() {
        return sessionKey;
    }


    /**
     * Sets the sessionKey value for this SetSessionAttributeParameterSet.
     * 
     * @param sessionKey
     */
    public void setSessionKey(com.sandvine.subscriberservices.ws.IpAssignmentKey sessionKey) {
        this.sessionKey = sessionKey;
    }


    /**
     * Gets the attributeDefinitionKey value for this SetSessionAttributeParameterSet.
     * 
     * @return attributeDefinitionKey
     */
    public com.sandvine.subscriberservices.ws.AttributeDefinitionKey getAttributeDefinitionKey() {
        return attributeDefinitionKey;
    }


    /**
     * Sets the attributeDefinitionKey value for this SetSessionAttributeParameterSet.
     * 
     * @param attributeDefinitionKey
     */
    public void setAttributeDefinitionKey(com.sandvine.subscriberservices.ws.AttributeDefinitionKey attributeDefinitionKey) {
        this.attributeDefinitionKey = attributeDefinitionKey;
    }


    /**
     * Gets the value value for this SetSessionAttributeParameterSet.
     * 
     * @return value
     */
    public java.lang.String getValue() {
        return value;
    }


    /**
     * Sets the value value for this SetSessionAttributeParameterSet.
     * 
     * @param value
     */
    public void setValue(java.lang.String value) {
        this.value = value;
    }


    /**
     * Gets the expiry value for this SetSessionAttributeParameterSet.
     * 
     * @return expiry
     */
    public java.util.Calendar getExpiry() {
        return expiry;
    }


    /**
     * Sets the expiry value for this SetSessionAttributeParameterSet.
     * 
     * @param expiry
     */
    public void setExpiry(java.util.Calendar expiry) {
        this.expiry = expiry;
    }


    /**
     * Gets the effective value for this SetSessionAttributeParameterSet.
     * 
     * @return effective
     */
    public java.util.Calendar getEffective() {
        return effective;
    }


    /**
     * Sets the effective value for this SetSessionAttributeParameterSet.
     * 
     * @param effective
     */
    public void setEffective(java.util.Calendar effective) {
        this.effective = effective;
    }


    /**
     * Gets the expiryExtension value for this SetSessionAttributeParameterSet.
     * 
     * @return expiryExtension
     */
    public java.lang.Integer getExpiryExtension() {
        return expiryExtension;
    }


    /**
     * Sets the expiryExtension value for this SetSessionAttributeParameterSet.
     * 
     * @param expiryExtension
     */
    public void setExpiryExtension(java.lang.Integer expiryExtension) {
        this.expiryExtension = expiryExtension;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SetSessionAttributeParameterSet)) return false;
        SetSessionAttributeParameterSet other = (SetSessionAttributeParameterSet) obj;
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
            ((this.sessionKey==null && other.getSessionKey()==null) || 
             (this.sessionKey!=null &&
              this.sessionKey.equals(other.getSessionKey()))) &&
            ((this.attributeDefinitionKey==null && other.getAttributeDefinitionKey()==null) || 
             (this.attributeDefinitionKey!=null &&
              this.attributeDefinitionKey.equals(other.getAttributeDefinitionKey()))) &&
            ((this.value==null && other.getValue()==null) || 
             (this.value!=null &&
              this.value.equals(other.getValue()))) &&
            ((this.expiry==null && other.getExpiry()==null) || 
             (this.expiry!=null &&
              this.expiry.equals(other.getExpiry()))) &&
            ((this.effective==null && other.getEffective()==null) || 
             (this.effective!=null &&
              this.effective.equals(other.getEffective()))) &&
            ((this.expiryExtension==null && other.getExpiryExtension()==null) || 
             (this.expiryExtension!=null &&
              this.expiryExtension.equals(other.getExpiryExtension())));
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
        if (getSessionKey() != null) {
            _hashCode += getSessionKey().hashCode();
        }
        if (getAttributeDefinitionKey() != null) {
            _hashCode += getAttributeDefinitionKey().hashCode();
        }
        if (getValue() != null) {
            _hashCode += getValue().hashCode();
        }
        if (getExpiry() != null) {
            _hashCode += getExpiry().hashCode();
        }
        if (getEffective() != null) {
            _hashCode += getEffective().hashCode();
        }
        if (getExpiryExtension() != null) {
            _hashCode += getExpiryExtension().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SetSessionAttributeParameterSet.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "SetSessionAttributeParameterSet"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriberKey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SubscriberKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "SubscriberKey"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionKey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SessionKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "IpAssignmentKey"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attributeDefinitionKey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AttributeDefinitionKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "AttributeDefinitionKey"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expiry");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Expiry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("effective");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Effective"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expiryExtension");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ExpiryExtension"));
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
