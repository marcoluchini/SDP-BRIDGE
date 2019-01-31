/**
 * AttributeDefinition.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sandvine.subscriberservices.ws;

public class AttributeDefinition  implements java.io.Serializable {
    private com.sandvine.subscriberservices.ws.AttributeDefinitionKey attributeDefinitionKey;

    private java.lang.String name;

    public AttributeDefinition() {
    }

    public AttributeDefinition(
           com.sandvine.subscriberservices.ws.AttributeDefinitionKey attributeDefinitionKey,
           java.lang.String name) {
           this.attributeDefinitionKey = attributeDefinitionKey;
           this.name = name;
    }


    /**
     * Gets the attributeDefinitionKey value for this AttributeDefinition.
     * 
     * @return attributeDefinitionKey
     */
    public com.sandvine.subscriberservices.ws.AttributeDefinitionKey getAttributeDefinitionKey() {
        return attributeDefinitionKey;
    }


    /**
     * Sets the attributeDefinitionKey value for this AttributeDefinition.
     * 
     * @param attributeDefinitionKey
     */
    public void setAttributeDefinitionKey(com.sandvine.subscriberservices.ws.AttributeDefinitionKey attributeDefinitionKey) {
        this.attributeDefinitionKey = attributeDefinitionKey;
    }


    /**
     * Gets the name value for this AttributeDefinition.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this AttributeDefinition.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AttributeDefinition)) return false;
        AttributeDefinition other = (AttributeDefinition) obj;
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
        int _hashCode = 1;
        if (getAttributeDefinitionKey() != null) {
            _hashCode += getAttributeDefinitionKey().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AttributeDefinition.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "AttributeDefinition"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attributeDefinitionKey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AttributeDefinitionKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "AttributeDefinitionKey"));
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
