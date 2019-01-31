/**
 * SessionAttribute.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sandvine.subscriberservices.ws;

public class SessionAttribute  implements java.io.Serializable {
    private com.sandvine.subscriberservices.ws.IpAssignment ipAssignment;

    private com.sandvine.subscriberservices.ws.AttributeDefinition attributeDefinition;

    private java.lang.String name;

    private java.lang.String value;

    private java.util.Calendar effective;

    private java.util.Calendar expiry;

    public SessionAttribute() {
    }

    public SessionAttribute(
           com.sandvine.subscriberservices.ws.IpAssignment ipAssignment,
           com.sandvine.subscriberservices.ws.AttributeDefinition attributeDefinition,
           java.lang.String name,
           java.lang.String value,
           java.util.Calendar effective,
           java.util.Calendar expiry) {
           this.ipAssignment = ipAssignment;
           this.attributeDefinition = attributeDefinition;
           this.name = name;
           this.value = value;
           this.effective = effective;
           this.expiry = expiry;
    }


    /**
     * Gets the ipAssignment value for this SessionAttribute.
     * 
     * @return ipAssignment
     */
    public com.sandvine.subscriberservices.ws.IpAssignment getIpAssignment() {
        return ipAssignment;
    }


    /**
     * Sets the ipAssignment value for this SessionAttribute.
     * 
     * @param ipAssignment
     */
    public void setIpAssignment(com.sandvine.subscriberservices.ws.IpAssignment ipAssignment) {
        this.ipAssignment = ipAssignment;
    }


    /**
     * Gets the attributeDefinition value for this SessionAttribute.
     * 
     * @return attributeDefinition
     */
    public com.sandvine.subscriberservices.ws.AttributeDefinition getAttributeDefinition() {
        return attributeDefinition;
    }


    /**
     * Sets the attributeDefinition value for this SessionAttribute.
     * 
     * @param attributeDefinition
     */
    public void setAttributeDefinition(com.sandvine.subscriberservices.ws.AttributeDefinition attributeDefinition) {
        this.attributeDefinition = attributeDefinition;
    }


    /**
     * Gets the name value for this SessionAttribute.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this SessionAttribute.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the value value for this SessionAttribute.
     * 
     * @return value
     */
    public java.lang.String getValue() {
        return value;
    }


    /**
     * Sets the value value for this SessionAttribute.
     * 
     * @param value
     */
    public void setValue(java.lang.String value) {
        this.value = value;
    }


    /**
     * Gets the effective value for this SessionAttribute.
     * 
     * @return effective
     */
    public java.util.Calendar getEffective() {
        return effective;
    }


    /**
     * Sets the effective value for this SessionAttribute.
     * 
     * @param effective
     */
    public void setEffective(java.util.Calendar effective) {
        this.effective = effective;
    }


    /**
     * Gets the expiry value for this SessionAttribute.
     * 
     * @return expiry
     */
    public java.util.Calendar getExpiry() {
        return expiry;
    }


    /**
     * Sets the expiry value for this SessionAttribute.
     * 
     * @param expiry
     */
    public void setExpiry(java.util.Calendar expiry) {
        this.expiry = expiry;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SessionAttribute)) return false;
        SessionAttribute other = (SessionAttribute) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ipAssignment==null && other.getIpAssignment()==null) || 
             (this.ipAssignment!=null &&
              this.ipAssignment.equals(other.getIpAssignment()))) &&
            ((this.attributeDefinition==null && other.getAttributeDefinition()==null) || 
             (this.attributeDefinition!=null &&
              this.attributeDefinition.equals(other.getAttributeDefinition()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.value==null && other.getValue()==null) || 
             (this.value!=null &&
              this.value.equals(other.getValue()))) &&
            ((this.effective==null && other.getEffective()==null) || 
             (this.effective!=null &&
              this.effective.equals(other.getEffective()))) &&
            ((this.expiry==null && other.getExpiry()==null) || 
             (this.expiry!=null &&
              this.expiry.equals(other.getExpiry())));
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
        if (getIpAssignment() != null) {
            _hashCode += getIpAssignment().hashCode();
        }
        if (getAttributeDefinition() != null) {
            _hashCode += getAttributeDefinition().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getValue() != null) {
            _hashCode += getValue().hashCode();
        }
        if (getEffective() != null) {
            _hashCode += getEffective().hashCode();
        }
        if (getExpiry() != null) {
            _hashCode += getExpiry().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SessionAttribute.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "SessionAttribute"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipAssignment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IpAssignment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "IpAssignment"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attributeDefinition");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AttributeDefinition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "AttributeDefinition"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("expiry");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Expiry"));
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
