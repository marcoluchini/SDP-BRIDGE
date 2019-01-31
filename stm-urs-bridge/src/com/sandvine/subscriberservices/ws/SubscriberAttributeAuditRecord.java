/**
 * SubscriberAttributeAuditRecord.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sandvine.subscriberservices.ws;

public class SubscriberAttributeAuditRecord  implements java.io.Serializable {
    private com.sandvine.subscriberservices.ws.Subscriber subscriber;

    private java.lang.String attributeDefinitionName;

    private java.lang.String eventType;

    private java.util.Calendar eventDate;

    private java.lang.String previousValue;

    private java.lang.String newValue;

    private java.util.Calendar effectiveDate;

    private java.util.Calendar expirationDate;

    public SubscriberAttributeAuditRecord() {
    }

    public SubscriberAttributeAuditRecord(
           com.sandvine.subscriberservices.ws.Subscriber subscriber,
           java.lang.String attributeDefinitionName,
           java.lang.String eventType,
           java.util.Calendar eventDate,
           java.lang.String previousValue,
           java.lang.String newValue,
           java.util.Calendar effectiveDate,
           java.util.Calendar expirationDate) {
           this.subscriber = subscriber;
           this.attributeDefinitionName = attributeDefinitionName;
           this.eventType = eventType;
           this.eventDate = eventDate;
           this.previousValue = previousValue;
           this.newValue = newValue;
           this.effectiveDate = effectiveDate;
           this.expirationDate = expirationDate;
    }


    /**
     * Gets the subscriber value for this SubscriberAttributeAuditRecord.
     * 
     * @return subscriber
     */
    public com.sandvine.subscriberservices.ws.Subscriber getSubscriber() {
        return subscriber;
    }


    /**
     * Sets the subscriber value for this SubscriberAttributeAuditRecord.
     * 
     * @param subscriber
     */
    public void setSubscriber(com.sandvine.subscriberservices.ws.Subscriber subscriber) {
        this.subscriber = subscriber;
    }


    /**
     * Gets the attributeDefinitionName value for this SubscriberAttributeAuditRecord.
     * 
     * @return attributeDefinitionName
     */
    public java.lang.String getAttributeDefinitionName() {
        return attributeDefinitionName;
    }


    /**
     * Sets the attributeDefinitionName value for this SubscriberAttributeAuditRecord.
     * 
     * @param attributeDefinitionName
     */
    public void setAttributeDefinitionName(java.lang.String attributeDefinitionName) {
        this.attributeDefinitionName = attributeDefinitionName;
    }


    /**
     * Gets the eventType value for this SubscriberAttributeAuditRecord.
     * 
     * @return eventType
     */
    public java.lang.String getEventType() {
        return eventType;
    }


    /**
     * Sets the eventType value for this SubscriberAttributeAuditRecord.
     * 
     * @param eventType
     */
    public void setEventType(java.lang.String eventType) {
        this.eventType = eventType;
    }


    /**
     * Gets the eventDate value for this SubscriberAttributeAuditRecord.
     * 
     * @return eventDate
     */
    public java.util.Calendar getEventDate() {
        return eventDate;
    }


    /**
     * Sets the eventDate value for this SubscriberAttributeAuditRecord.
     * 
     * @param eventDate
     */
    public void setEventDate(java.util.Calendar eventDate) {
        this.eventDate = eventDate;
    }


    /**
     * Gets the previousValue value for this SubscriberAttributeAuditRecord.
     * 
     * @return previousValue
     */
    public java.lang.String getPreviousValue() {
        return previousValue;
    }


    /**
     * Sets the previousValue value for this SubscriberAttributeAuditRecord.
     * 
     * @param previousValue
     */
    public void setPreviousValue(java.lang.String previousValue) {
        this.previousValue = previousValue;
    }


    /**
     * Gets the newValue value for this SubscriberAttributeAuditRecord.
     * 
     * @return newValue
     */
    public java.lang.String getNewValue() {
        return newValue;
    }


    /**
     * Sets the newValue value for this SubscriberAttributeAuditRecord.
     * 
     * @param newValue
     */
    public void setNewValue(java.lang.String newValue) {
        this.newValue = newValue;
    }


    /**
     * Gets the effectiveDate value for this SubscriberAttributeAuditRecord.
     * 
     * @return effectiveDate
     */
    public java.util.Calendar getEffectiveDate() {
        return effectiveDate;
    }


    /**
     * Sets the effectiveDate value for this SubscriberAttributeAuditRecord.
     * 
     * @param effectiveDate
     */
    public void setEffectiveDate(java.util.Calendar effectiveDate) {
        this.effectiveDate = effectiveDate;
    }


    /**
     * Gets the expirationDate value for this SubscriberAttributeAuditRecord.
     * 
     * @return expirationDate
     */
    public java.util.Calendar getExpirationDate() {
        return expirationDate;
    }


    /**
     * Sets the expirationDate value for this SubscriberAttributeAuditRecord.
     * 
     * @param expirationDate
     */
    public void setExpirationDate(java.util.Calendar expirationDate) {
        this.expirationDate = expirationDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SubscriberAttributeAuditRecord)) return false;
        SubscriberAttributeAuditRecord other = (SubscriberAttributeAuditRecord) obj;
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
            ((this.attributeDefinitionName==null && other.getAttributeDefinitionName()==null) || 
             (this.attributeDefinitionName!=null &&
              this.attributeDefinitionName.equals(other.getAttributeDefinitionName()))) &&
            ((this.eventType==null && other.getEventType()==null) || 
             (this.eventType!=null &&
              this.eventType.equals(other.getEventType()))) &&
            ((this.eventDate==null && other.getEventDate()==null) || 
             (this.eventDate!=null &&
              this.eventDate.equals(other.getEventDate()))) &&
            ((this.previousValue==null && other.getPreviousValue()==null) || 
             (this.previousValue!=null &&
              this.previousValue.equals(other.getPreviousValue()))) &&
            ((this.newValue==null && other.getNewValue()==null) || 
             (this.newValue!=null &&
              this.newValue.equals(other.getNewValue()))) &&
            ((this.effectiveDate==null && other.getEffectiveDate()==null) || 
             (this.effectiveDate!=null &&
              this.effectiveDate.equals(other.getEffectiveDate()))) &&
            ((this.expirationDate==null && other.getExpirationDate()==null) || 
             (this.expirationDate!=null &&
              this.expirationDate.equals(other.getExpirationDate())));
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
        if (getAttributeDefinitionName() != null) {
            _hashCode += getAttributeDefinitionName().hashCode();
        }
        if (getEventType() != null) {
            _hashCode += getEventType().hashCode();
        }
        if (getEventDate() != null) {
            _hashCode += getEventDate().hashCode();
        }
        if (getPreviousValue() != null) {
            _hashCode += getPreviousValue().hashCode();
        }
        if (getNewValue() != null) {
            _hashCode += getNewValue().hashCode();
        }
        if (getEffectiveDate() != null) {
            _hashCode += getEffectiveDate().hashCode();
        }
        if (getExpirationDate() != null) {
            _hashCode += getExpirationDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SubscriberAttributeAuditRecord.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "SubscriberAttributeAuditRecord"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Subscriber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "Subscriber"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attributeDefinitionName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AttributeDefinitionName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EventType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EventDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("previousValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PreviousValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NewValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("effectiveDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EffectiveDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expirationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ExpirationDate"));
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
