/**
 * SubscriberAttribute.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sandvine.subscriberservices.ws;

public class SubscriberAttribute  implements java.io.Serializable {
    private com.sandvine.subscriberservices.ws.Subscriber subscriber;

    private com.sandvine.subscriberservices.ws.SubscriberAttributeDefinition subscriberAttributeDefinition;

    private java.lang.String name;

    private java.lang.String value;

    private java.util.Calendar effective;

    private java.util.Calendar expiry;

    public SubscriberAttribute() {
    }

    public SubscriberAttribute(
           com.sandvine.subscriberservices.ws.Subscriber subscriber,
           com.sandvine.subscriberservices.ws.SubscriberAttributeDefinition subscriberAttributeDefinition,
           java.lang.String name,
           java.lang.String value,
           java.util.Calendar effective,
           java.util.Calendar expiry) {
           this.subscriber = subscriber;
           this.subscriberAttributeDefinition = subscriberAttributeDefinition;
           this.name = name;
           this.value = value;
           this.effective = effective;
           this.expiry = expiry;
    }


    /**
     * Gets the subscriber value for this SubscriberAttribute.
     * 
     * @return subscriber
     */
    public com.sandvine.subscriberservices.ws.Subscriber getSubscriber() {
        return subscriber;
    }


    /**
     * Sets the subscriber value for this SubscriberAttribute.
     * 
     * @param subscriber
     */
    public void setSubscriber(com.sandvine.subscriberservices.ws.Subscriber subscriber) {
        this.subscriber = subscriber;
    }


    /**
     * Gets the subscriberAttributeDefinition value for this SubscriberAttribute.
     * 
     * @return subscriberAttributeDefinition
     */
    public com.sandvine.subscriberservices.ws.SubscriberAttributeDefinition getSubscriberAttributeDefinition() {
        return subscriberAttributeDefinition;
    }


    /**
     * Sets the subscriberAttributeDefinition value for this SubscriberAttribute.
     * 
     * @param subscriberAttributeDefinition
     */
    public void setSubscriberAttributeDefinition(com.sandvine.subscriberservices.ws.SubscriberAttributeDefinition subscriberAttributeDefinition) {
        this.subscriberAttributeDefinition = subscriberAttributeDefinition;
    }


    /**
     * Gets the name value for this SubscriberAttribute.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this SubscriberAttribute.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the value value for this SubscriberAttribute.
     * 
     * @return value
     */
    public java.lang.String getValue() {
        return value;
    }


    /**
     * Sets the value value for this SubscriberAttribute.
     * 
     * @param value
     */
    public void setValue(java.lang.String value) {
        this.value = value;
    }


    /**
     * Gets the effective value for this SubscriberAttribute.
     * 
     * @return effective
     */
    public java.util.Calendar getEffective() {
        return effective;
    }


    /**
     * Sets the effective value for this SubscriberAttribute.
     * 
     * @param effective
     */
    public void setEffective(java.util.Calendar effective) {
        this.effective = effective;
    }


    /**
     * Gets the expiry value for this SubscriberAttribute.
     * 
     * @return expiry
     */
    public java.util.Calendar getExpiry() {
        return expiry;
    }


    /**
     * Sets the expiry value for this SubscriberAttribute.
     * 
     * @param expiry
     */
    public void setExpiry(java.util.Calendar expiry) {
        this.expiry = expiry;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SubscriberAttribute)) return false;
        SubscriberAttribute other = (SubscriberAttribute) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.subscriber==null && other.getSubscriber()==null) || 
             (this.subscriber!=null &&
              this.subscriber.equals(other.getSubscriber()))) &&
            ((this.subscriberAttributeDefinition==null && other.getSubscriberAttributeDefinition()==null) || 
             (this.subscriberAttributeDefinition!=null &&
              this.subscriberAttributeDefinition.equals(other.getSubscriberAttributeDefinition()))) &&
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
        if (getSubscriber() != null) {
            _hashCode += getSubscriber().hashCode();
        }
        if (getSubscriberAttributeDefinition() != null) {
            _hashCode += getSubscriberAttributeDefinition().hashCode();
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
        new org.apache.axis.description.TypeDesc(SubscriberAttribute.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "SubscriberAttribute"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Subscriber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "Subscriber"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriberAttributeDefinition");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SubscriberAttributeDefinition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "SubscriberAttributeDefinition"));
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
