/**
 * AttributeAuditSearchBySubscriberRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sandvine.subscriberservices.ws;

public class AttributeAuditSearchBySubscriberRequest  extends com.sandvine.subscriberservices.ws.Request  implements java.io.Serializable {
    private com.sandvine.subscriberservices.ws.SubscriberKey subscriberKey;

    private java.util.Calendar rangeStart;

    private java.util.Calendar rangeEnd;

    public AttributeAuditSearchBySubscriberRequest() {
    }

    public AttributeAuditSearchBySubscriberRequest(
           java.lang.Boolean debug,
           com.sandvine.subscriberservices.ws.SubscriberKey subscriberKey,
           java.util.Calendar rangeStart,
           java.util.Calendar rangeEnd) {
        super(
            debug);
        this.subscriberKey = subscriberKey;
        this.rangeStart = rangeStart;
        this.rangeEnd = rangeEnd;
    }


    /**
     * Gets the subscriberKey value for this AttributeAuditSearchBySubscriberRequest.
     * 
     * @return subscriberKey
     */
    public com.sandvine.subscriberservices.ws.SubscriberKey getSubscriberKey() {
        return subscriberKey;
    }


    /**
     * Sets the subscriberKey value for this AttributeAuditSearchBySubscriberRequest.
     * 
     * @param subscriberKey
     */
    public void setSubscriberKey(com.sandvine.subscriberservices.ws.SubscriberKey subscriberKey) {
        this.subscriberKey = subscriberKey;
    }


    /**
     * Gets the rangeStart value for this AttributeAuditSearchBySubscriberRequest.
     * 
     * @return rangeStart
     */
    public java.util.Calendar getRangeStart() {
        return rangeStart;
    }


    /**
     * Sets the rangeStart value for this AttributeAuditSearchBySubscriberRequest.
     * 
     * @param rangeStart
     */
    public void setRangeStart(java.util.Calendar rangeStart) {
        this.rangeStart = rangeStart;
    }


    /**
     * Gets the rangeEnd value for this AttributeAuditSearchBySubscriberRequest.
     * 
     * @return rangeEnd
     */
    public java.util.Calendar getRangeEnd() {
        return rangeEnd;
    }


    /**
     * Sets the rangeEnd value for this AttributeAuditSearchBySubscriberRequest.
     * 
     * @param rangeEnd
     */
    public void setRangeEnd(java.util.Calendar rangeEnd) {
        this.rangeEnd = rangeEnd;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AttributeAuditSearchBySubscriberRequest)) return false;
        AttributeAuditSearchBySubscriberRequest other = (AttributeAuditSearchBySubscriberRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.subscriberKey==null && other.getSubscriberKey()==null) || 
             (this.subscriberKey!=null &&
              this.subscriberKey.equals(other.getSubscriberKey()))) &&
            ((this.rangeStart==null && other.getRangeStart()==null) || 
             (this.rangeStart!=null &&
              this.rangeStart.equals(other.getRangeStart()))) &&
            ((this.rangeEnd==null && other.getRangeEnd()==null) || 
             (this.rangeEnd!=null &&
              this.rangeEnd.equals(other.getRangeEnd())));
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
        if (getSubscriberKey() != null) {
            _hashCode += getSubscriberKey().hashCode();
        }
        if (getRangeStart() != null) {
            _hashCode += getRangeStart().hashCode();
        }
        if (getRangeEnd() != null) {
            _hashCode += getRangeEnd().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AttributeAuditSearchBySubscriberRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "AttributeAuditSearchBySubscriberRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriberKey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SubscriberKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "SubscriberKey"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rangeStart");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RangeStart"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rangeEnd");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RangeEnd"));
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
