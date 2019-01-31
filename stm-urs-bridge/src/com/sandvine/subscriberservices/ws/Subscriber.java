/**
 * Subscriber.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sandvine.subscriberservices.ws;

public class Subscriber  implements java.io.Serializable {
    private com.sandvine.subscriberservices.ws.SubscriberKey key;

    private com.sandvine.subscriberservices.ws.SubscriberRealm subscriberRealm;

    private java.lang.String name;

    private java.lang.String status;

    private java.lang.String dataHome;

    private com.sandvine.subscriberservices.ws.IpAssignment[] currentIpAssignments;

    private com.sandvine.subscriberservices.ws.SubscriberAttribute[] subscriberAttributes;

    public Subscriber() {
    }

    public Subscriber(
           com.sandvine.subscriberservices.ws.SubscriberKey key,
           com.sandvine.subscriberservices.ws.SubscriberRealm subscriberRealm,
           java.lang.String name,
           java.lang.String status,
           java.lang.String dataHome,
           com.sandvine.subscriberservices.ws.IpAssignment[] currentIpAssignments,
           com.sandvine.subscriberservices.ws.SubscriberAttribute[] subscriberAttributes) {
           this.key = key;
           this.subscriberRealm = subscriberRealm;
           this.name = name;
           this.status = status;
           this.dataHome = dataHome;
           this.currentIpAssignments = currentIpAssignments;
           this.subscriberAttributes = subscriberAttributes;
    }


    /**
     * Gets the key value for this Subscriber.
     * 
     * @return key
     */
    public com.sandvine.subscriberservices.ws.SubscriberKey getKey() {
        return key;
    }


    /**
     * Sets the key value for this Subscriber.
     * 
     * @param key
     */
    public void setKey(com.sandvine.subscriberservices.ws.SubscriberKey key) {
        this.key = key;
    }


    /**
     * Gets the subscriberRealm value for this Subscriber.
     * 
     * @return subscriberRealm
     */
    public com.sandvine.subscriberservices.ws.SubscriberRealm getSubscriberRealm() {
        return subscriberRealm;
    }


    /**
     * Sets the subscriberRealm value for this Subscriber.
     * 
     * @param subscriberRealm
     */
    public void setSubscriberRealm(com.sandvine.subscriberservices.ws.SubscriberRealm subscriberRealm) {
        this.subscriberRealm = subscriberRealm;
    }


    /**
     * Gets the name value for this Subscriber.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Subscriber.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the status value for this Subscriber.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Subscriber.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the dataHome value for this Subscriber.
     * 
     * @return dataHome
     */
    public java.lang.String getDataHome() {
        return dataHome;
    }


    /**
     * Sets the dataHome value for this Subscriber.
     * 
     * @param dataHome
     */
    public void setDataHome(java.lang.String dataHome) {
        this.dataHome = dataHome;
    }


    /**
     * Gets the currentIpAssignments value for this Subscriber.
     * 
     * @return currentIpAssignments
     */
    public com.sandvine.subscriberservices.ws.IpAssignment[] getCurrentIpAssignments() {
        return currentIpAssignments;
    }


    /**
     * Sets the currentIpAssignments value for this Subscriber.
     * 
     * @param currentIpAssignments
     */
    public void setCurrentIpAssignments(com.sandvine.subscriberservices.ws.IpAssignment[] currentIpAssignments) {
        this.currentIpAssignments = currentIpAssignments;
    }


    /**
     * Gets the subscriberAttributes value for this Subscriber.
     * 
     * @return subscriberAttributes
     */
    public com.sandvine.subscriberservices.ws.SubscriberAttribute[] getSubscriberAttributes() {
        return subscriberAttributes;
    }


    /**
     * Sets the subscriberAttributes value for this Subscriber.
     * 
     * @param subscriberAttributes
     */
    public void setSubscriberAttributes(com.sandvine.subscriberservices.ws.SubscriberAttribute[] subscriberAttributes) {
        this.subscriberAttributes = subscriberAttributes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Subscriber)) return false;
        Subscriber other = (Subscriber) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.key==null && other.getKey()==null) || 
             (this.key!=null &&
              this.key.equals(other.getKey()))) &&
            ((this.subscriberRealm==null && other.getSubscriberRealm()==null) || 
             (this.subscriberRealm!=null &&
              this.subscriberRealm.equals(other.getSubscriberRealm()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.dataHome==null && other.getDataHome()==null) || 
             (this.dataHome!=null &&
              this.dataHome.equals(other.getDataHome()))) &&
            ((this.currentIpAssignments==null && other.getCurrentIpAssignments()==null) || 
             (this.currentIpAssignments!=null &&
              java.util.Arrays.equals(this.currentIpAssignments, other.getCurrentIpAssignments()))) &&
            ((this.subscriberAttributes==null && other.getSubscriberAttributes()==null) || 
             (this.subscriberAttributes!=null &&
              java.util.Arrays.equals(this.subscriberAttributes, other.getSubscriberAttributes())));
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
        if (getKey() != null) {
            _hashCode += getKey().hashCode();
        }
        if (getSubscriberRealm() != null) {
            _hashCode += getSubscriberRealm().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getDataHome() != null) {
            _hashCode += getDataHome().hashCode();
        }
        if (getCurrentIpAssignments() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCurrentIpAssignments());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCurrentIpAssignments(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSubscriberAttributes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSubscriberAttributes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSubscriberAttributes(), i);
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
        new org.apache.axis.description.TypeDesc(Subscriber.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "Subscriber"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("key");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Key"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "SubscriberKey"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriberRealm");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SubscriberRealm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "SubscriberRealm"));
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
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("currentIpAssignments");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CurrentIpAssignments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "IpAssignment"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "IpAssignment"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriberAttributes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SubscriberAttributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "SubscriberAttribute"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "SubscriberAttribute"));
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
