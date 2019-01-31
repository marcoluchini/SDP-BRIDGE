/**
 * CreateSubscriberParameterSet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sandvine.subscriberservices.ws;

public class CreateSubscriberParameterSet  implements java.io.Serializable {
    private com.sandvine.subscriberservices.ws.SubscriberRealmKey subscriberRealmKey;

    private java.lang.String name;

    public CreateSubscriberParameterSet() {
    }

    public CreateSubscriberParameterSet(
           com.sandvine.subscriberservices.ws.SubscriberRealmKey subscriberRealmKey,
           java.lang.String name) {
           this.subscriberRealmKey = subscriberRealmKey;
           this.name = name;
    }


    /**
     * Gets the subscriberRealmKey value for this CreateSubscriberParameterSet.
     * 
     * @return subscriberRealmKey
     */
    public com.sandvine.subscriberservices.ws.SubscriberRealmKey getSubscriberRealmKey() {
        return subscriberRealmKey;
    }


    /**
     * Sets the subscriberRealmKey value for this CreateSubscriberParameterSet.
     * 
     * @param subscriberRealmKey
     */
    public void setSubscriberRealmKey(com.sandvine.subscriberservices.ws.SubscriberRealmKey subscriberRealmKey) {
        this.subscriberRealmKey = subscriberRealmKey;
    }


    /**
     * Gets the name value for this CreateSubscriberParameterSet.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this CreateSubscriberParameterSet.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreateSubscriberParameterSet)) return false;
        CreateSubscriberParameterSet other = (CreateSubscriberParameterSet) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.subscriberRealmKey==null && other.getSubscriberRealmKey()==null) || 
             (this.subscriberRealmKey!=null &&
              this.subscriberRealmKey.equals(other.getSubscriberRealmKey()))) &&
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
        if (getSubscriberRealmKey() != null) {
            _hashCode += getSubscriberRealmKey().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreateSubscriberParameterSet.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "CreateSubscriberParameterSet"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriberRealmKey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SubscriberRealmKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "SubscriberRealmKey"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
