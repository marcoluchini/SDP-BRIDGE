/**
 * SubscriberAttributeParameterSet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sandvine.subscriberservices.ws;

public class SubscriberAttributeParameterSet  implements java.io.Serializable {
    private com.sandvine.subscriberservices.ws.SubscriberAttributeDefinitionKey attributeDefinitionKey;

    private java.lang.String value;

    private java.util.Calendar expiry;

    private java.util.Calendar effective;

    private java.lang.Integer expiryExtension;

    public SubscriberAttributeParameterSet() {
    }

    public SubscriberAttributeParameterSet(
           com.sandvine.subscriberservices.ws.SubscriberAttributeDefinitionKey attributeDefinitionKey,
           java.lang.String value,
           java.util.Calendar expiry,
           java.util.Calendar effective,
           java.lang.Integer expiryExtension) {
           this.attributeDefinitionKey = attributeDefinitionKey;
           this.value = value;
           this.expiry = expiry;
           this.effective = effective;
           this.expiryExtension = expiryExtension;
    }


    /**
     * Gets the attributeDefinitionKey value for this SubscriberAttributeParameterSet.
     * 
     * @return attributeDefinitionKey
     */
    public com.sandvine.subscriberservices.ws.SubscriberAttributeDefinitionKey getAttributeDefinitionKey() {
        return attributeDefinitionKey;
    }


    /**
     * Sets the attributeDefinitionKey value for this SubscriberAttributeParameterSet.
     * 
     * @param attributeDefinitionKey
     */
    public void setAttributeDefinitionKey(com.sandvine.subscriberservices.ws.SubscriberAttributeDefinitionKey attributeDefinitionKey) {
        this.attributeDefinitionKey = attributeDefinitionKey;
    }


    /**
     * Gets the value value for this SubscriberAttributeParameterSet.
     * 
     * @return value
     */
    public java.lang.String getValue() {
        return value;
    }


    /**
     * Sets the value value for this SubscriberAttributeParameterSet.
     * 
     * @param value
     */
    public void setValue(java.lang.String value) {
        this.value = value;
    }


    /**
     * Gets the expiry value for this SubscriberAttributeParameterSet.
     * 
     * @return expiry
     */
    public java.util.Calendar getExpiry() {
        return expiry;
    }


    /**
     * Sets the expiry value for this SubscriberAttributeParameterSet.
     * 
     * @param expiry
     */
    public void setExpiry(java.util.Calendar expiry) {
        this.expiry = expiry;
    }


    /**
     * Gets the effective value for this SubscriberAttributeParameterSet.
     * 
     * @return effective
     */
    public java.util.Calendar getEffective() {
        return effective;
    }


    /**
     * Sets the effective value for this SubscriberAttributeParameterSet.
     * 
     * @param effective
     */
    public void setEffective(java.util.Calendar effective) {
        this.effective = effective;
    }


    /**
     * Gets the expiryExtension value for this SubscriberAttributeParameterSet.
     * 
     * @return expiryExtension
     */
    public java.lang.Integer getExpiryExtension() {
        return expiryExtension;
    }


    /**
     * Sets the expiryExtension value for this SubscriberAttributeParameterSet.
     * 
     * @param expiryExtension
     */
    public void setExpiryExtension(java.lang.Integer expiryExtension) {
        this.expiryExtension = expiryExtension;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SubscriberAttributeParameterSet)) return false;
        SubscriberAttributeParameterSet other = (SubscriberAttributeParameterSet) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
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
        new org.apache.axis.description.TypeDesc(SubscriberAttributeParameterSet.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "SubscriberAttributeParameterSet"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attributeDefinitionKey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AttributeDefinitionKey"));
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
