/**
 * CreateSubscriberRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sandvine.subscriberservices.ws;

public class CreateSubscriberRequest  extends com.sandvine.subscriberservices.ws.Request  implements java.io.Serializable {
    private com.sandvine.subscriberservices.ws.SubscriberRealmKey subscriberRealmKey;

    private java.lang.String name;

    private java.lang.String dataHome;

    private java.lang.String[] responseGroups;

    public CreateSubscriberRequest() {
    }

    public CreateSubscriberRequest(
           java.lang.Boolean debug,
           com.sandvine.subscriberservices.ws.SubscriberRealmKey subscriberRealmKey,
           java.lang.String name,
           java.lang.String dataHome,
           java.lang.String[] responseGroups) {
        super(
            debug);
        this.subscriberRealmKey = subscriberRealmKey;
        this.name = name;
        this.dataHome = dataHome;
        this.responseGroups = responseGroups;
    }


    /**
     * Gets the subscriberRealmKey value for this CreateSubscriberRequest.
     * 
     * @return subscriberRealmKey
     */
    public com.sandvine.subscriberservices.ws.SubscriberRealmKey getSubscriberRealmKey() {
        return subscriberRealmKey;
    }


    /**
     * Sets the subscriberRealmKey value for this CreateSubscriberRequest.
     * 
     * @param subscriberRealmKey
     */
    public void setSubscriberRealmKey(com.sandvine.subscriberservices.ws.SubscriberRealmKey subscriberRealmKey) {
        this.subscriberRealmKey = subscriberRealmKey;
    }


    /**
     * Gets the name value for this CreateSubscriberRequest.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this CreateSubscriberRequest.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the dataHome value for this CreateSubscriberRequest.
     * 
     * @return dataHome
     */
    public java.lang.String getDataHome() {
        return dataHome;
    }


    /**
     * Sets the dataHome value for this CreateSubscriberRequest.
     * 
     * @param dataHome
     */
    public void setDataHome(java.lang.String dataHome) {
        this.dataHome = dataHome;
    }


    /**
     * Gets the responseGroups value for this CreateSubscriberRequest.
     * 
     * @return responseGroups
     */
    public java.lang.String[] getResponseGroups() {
        return responseGroups;
    }


    /**
     * Sets the responseGroups value for this CreateSubscriberRequest.
     * 
     * @param responseGroups
     */
    public void setResponseGroups(java.lang.String[] responseGroups) {
        this.responseGroups = responseGroups;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreateSubscriberRequest)) return false;
        CreateSubscriberRequest other = (CreateSubscriberRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.subscriberRealmKey==null && other.getSubscriberRealmKey()==null) || 
             (this.subscriberRealmKey!=null &&
              this.subscriberRealmKey.equals(other.getSubscriberRealmKey()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.dataHome==null && other.getDataHome()==null) || 
             (this.dataHome!=null &&
              this.dataHome.equals(other.getDataHome()))) &&
            ((this.responseGroups==null && other.getResponseGroups()==null) || 
             (this.responseGroups!=null &&
              java.util.Arrays.equals(this.responseGroups, other.getResponseGroups())));
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
        if (getSubscriberRealmKey() != null) {
            _hashCode += getSubscriberRealmKey().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getDataHome() != null) {
            _hashCode += getDataHome().hashCode();
        }
        if (getResponseGroups() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getResponseGroups());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getResponseGroups(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreateSubscriberRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "CreateSubscriberRequest"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataHome");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DataHome"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseGroups");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ResponseGroups"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "ResponseGroup"));
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
