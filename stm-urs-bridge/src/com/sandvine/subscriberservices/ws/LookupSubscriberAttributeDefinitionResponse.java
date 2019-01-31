/**
 * LookupSubscriberAttributeDefinitionResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sandvine.subscriberservices.ws;

public class LookupSubscriberAttributeDefinitionResponse  extends com.sandvine.subscriberservices.ws.DelegateServiceResponse  implements java.io.Serializable {
    private com.sandvine.subscriberservices.ws.SubscriberAttributeDefinition subscriberAttributeDefinition;

    public LookupSubscriberAttributeDefinitionResponse() {
    }

    public LookupSubscriberAttributeDefinitionResponse(
           com.sandvine.subscriberservices.ws.Result result,
           com.sandvine.subscriberservices.ws.Error[] errors,
           long requestProcessingTime,
           com.sandvine.subscriberservices.ws.DelegationSummary delegationSummary,
           com.sandvine.subscriberservices.ws.SubscriberAttributeDefinition subscriberAttributeDefinition) {
        super(
            result,
            errors,
            requestProcessingTime,
            delegationSummary);
        this.subscriberAttributeDefinition = subscriberAttributeDefinition;
    }


    /**
     * Gets the subscriberAttributeDefinition value for this LookupSubscriberAttributeDefinitionResponse.
     * 
     * @return subscriberAttributeDefinition
     */
    public com.sandvine.subscriberservices.ws.SubscriberAttributeDefinition getSubscriberAttributeDefinition() {
        return subscriberAttributeDefinition;
    }


    /**
     * Sets the subscriberAttributeDefinition value for this LookupSubscriberAttributeDefinitionResponse.
     * 
     * @param subscriberAttributeDefinition
     */
    public void setSubscriberAttributeDefinition(com.sandvine.subscriberservices.ws.SubscriberAttributeDefinition subscriberAttributeDefinition) {
        this.subscriberAttributeDefinition = subscriberAttributeDefinition;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LookupSubscriberAttributeDefinitionResponse)) return false;
        LookupSubscriberAttributeDefinitionResponse other = (LookupSubscriberAttributeDefinitionResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.subscriberAttributeDefinition==null && other.getSubscriberAttributeDefinition()==null) || 
             (this.subscriberAttributeDefinition!=null &&
              this.subscriberAttributeDefinition.equals(other.getSubscriberAttributeDefinition())));
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
        if (getSubscriberAttributeDefinition() != null) {
            _hashCode += getSubscriberAttributeDefinition().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LookupSubscriberAttributeDefinitionResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "LookupSubscriberAttributeDefinitionResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriberAttributeDefinition");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SubscriberAttributeDefinition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "SubscriberAttributeDefinition"));
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
