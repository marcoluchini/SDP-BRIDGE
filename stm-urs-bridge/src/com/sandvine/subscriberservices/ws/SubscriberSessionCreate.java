/**
 * SubscriberSessionCreate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sandvine.subscriberservices.ws;

public class SubscriberSessionCreate  implements java.io.Serializable {
    private com.sandvine.subscriberservices.ws.SubscriberKey subscriber;

    private com.sandvine.subscriberservices.ws.SubscriberSessionParameterSet[] subscriberSessionParameterSets;

    private com.sandvine.subscriberservices.ws.SubscriberAttributeParameterSet[] subscriberAttributeParameterSets;

    private java.lang.Boolean subscriberSingleIp;

    public SubscriberSessionCreate() {
    }

    public SubscriberSessionCreate(
           com.sandvine.subscriberservices.ws.SubscriberKey subscriber,
           com.sandvine.subscriberservices.ws.SubscriberSessionParameterSet[] subscriberSessionParameterSets,
           com.sandvine.subscriberservices.ws.SubscriberAttributeParameterSet[] subscriberAttributeParameterSets,
           java.lang.Boolean subscriberSingleIp) {
           this.subscriber = subscriber;
           this.subscriberSessionParameterSets = subscriberSessionParameterSets;
           this.subscriberAttributeParameterSets = subscriberAttributeParameterSets;
           this.subscriberSingleIp = subscriberSingleIp;
    }


    /**
     * Gets the subscriber value for this SubscriberSessionCreate.
     * 
     * @return subscriber
     */
    public com.sandvine.subscriberservices.ws.SubscriberKey getSubscriber() {
        return subscriber;
    }


    /**
     * Sets the subscriber value for this SubscriberSessionCreate.
     * 
     * @param subscriber
     */
    public void setSubscriber(com.sandvine.subscriberservices.ws.SubscriberKey subscriber) {
        this.subscriber = subscriber;
    }


    /**
     * Gets the subscriberSessionParameterSets value for this SubscriberSessionCreate.
     * 
     * @return subscriberSessionParameterSets
     */
    public com.sandvine.subscriberservices.ws.SubscriberSessionParameterSet[] getSubscriberSessionParameterSets() {
        return subscriberSessionParameterSets;
    }


    /**
     * Sets the subscriberSessionParameterSets value for this SubscriberSessionCreate.
     * 
     * @param subscriberSessionParameterSets
     */
    public void setSubscriberSessionParameterSets(com.sandvine.subscriberservices.ws.SubscriberSessionParameterSet[] subscriberSessionParameterSets) {
        this.subscriberSessionParameterSets = subscriberSessionParameterSets;
    }


    /**
     * Gets the subscriberAttributeParameterSets value for this SubscriberSessionCreate.
     * 
     * @return subscriberAttributeParameterSets
     */
    public com.sandvine.subscriberservices.ws.SubscriberAttributeParameterSet[] getSubscriberAttributeParameterSets() {
        return subscriberAttributeParameterSets;
    }


    /**
     * Sets the subscriberAttributeParameterSets value for this SubscriberSessionCreate.
     * 
     * @param subscriberAttributeParameterSets
     */
    public void setSubscriberAttributeParameterSets(com.sandvine.subscriberservices.ws.SubscriberAttributeParameterSet[] subscriberAttributeParameterSets) {
        this.subscriberAttributeParameterSets = subscriberAttributeParameterSets;
    }


    /**
     * Gets the subscriberSingleIp value for this SubscriberSessionCreate.
     * 
     * @return subscriberSingleIp
     */
    public java.lang.Boolean getSubscriberSingleIp() {
        return subscriberSingleIp;
    }


    /**
     * Sets the subscriberSingleIp value for this SubscriberSessionCreate.
     * 
     * @param subscriberSingleIp
     */
    public void setSubscriberSingleIp(java.lang.Boolean subscriberSingleIp) {
        this.subscriberSingleIp = subscriberSingleIp;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SubscriberSessionCreate)) return false;
        SubscriberSessionCreate other = (SubscriberSessionCreate) obj;
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
            ((this.subscriberSessionParameterSets==null && other.getSubscriberSessionParameterSets()==null) || 
             (this.subscriberSessionParameterSets!=null &&
              java.util.Arrays.equals(this.subscriberSessionParameterSets, other.getSubscriberSessionParameterSets()))) &&
            ((this.subscriberAttributeParameterSets==null && other.getSubscriberAttributeParameterSets()==null) || 
             (this.subscriberAttributeParameterSets!=null &&
              java.util.Arrays.equals(this.subscriberAttributeParameterSets, other.getSubscriberAttributeParameterSets()))) &&
            ((this.subscriberSingleIp==null && other.getSubscriberSingleIp()==null) || 
             (this.subscriberSingleIp!=null &&
              this.subscriberSingleIp.equals(other.getSubscriberSingleIp())));
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
        if (getSubscriberSessionParameterSets() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSubscriberSessionParameterSets());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSubscriberSessionParameterSets(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSubscriberAttributeParameterSets() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSubscriberAttributeParameterSets());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSubscriberAttributeParameterSets(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSubscriberSingleIp() != null) {
            _hashCode += getSubscriberSingleIp().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SubscriberSessionCreate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "SubscriberSessionCreate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Subscriber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "SubscriberKey"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriberSessionParameterSets");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SubscriberSessionParameterSets"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "SubscriberSessionParameterSet"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "SubscriberSessionParameterSet"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriberAttributeParameterSets");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SubscriberAttributeParameterSets"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "SubscriberAttributeParameterSet"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "SubscriberAttributeParameterSet"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriberSingleIp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SubscriberSingleIp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
