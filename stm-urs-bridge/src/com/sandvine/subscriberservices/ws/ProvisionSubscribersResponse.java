/**
 * ProvisionSubscribersResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sandvine.subscriberservices.ws;

public class ProvisionSubscribersResponse  extends com.sandvine.subscriberservices.ws.BulkOperationResponse  implements java.io.Serializable {
    private com.sandvine.subscriberservices.ws.Subscriber[] subscribers;

    private com.sandvine.subscriberservices.ws.ProvisionSubscriberPartialFailure[] provisionSubscriberPartialFailures;

    public ProvisionSubscribersResponse() {
    }

    public ProvisionSubscribersResponse(
           com.sandvine.subscriberservices.ws.Result result,
           com.sandvine.subscriberservices.ws.Error[] errors,
           long requestProcessingTime,
           com.sandvine.subscriberservices.ws.DelegationSummary delegationSummary,
           com.sandvine.subscriberservices.ws.BulkStatistics bulkStatistics,
           com.sandvine.subscriberservices.ws.BulkOperationFailureBehaviour bulkOperationFailureBehaviour,
           com.sandvine.subscriberservices.ws.Subscriber[] subscribers,
           com.sandvine.subscriberservices.ws.ProvisionSubscriberPartialFailure[] provisionSubscriberPartialFailures) {
        super(
            result,
            errors,
            requestProcessingTime,
            delegationSummary,
            bulkStatistics,
            bulkOperationFailureBehaviour);
        this.subscribers = subscribers;
        this.provisionSubscriberPartialFailures = provisionSubscriberPartialFailures;
    }


    /**
     * Gets the subscribers value for this ProvisionSubscribersResponse.
     * 
     * @return subscribers
     */
    public com.sandvine.subscriberservices.ws.Subscriber[] getSubscribers() {
        return subscribers;
    }


    /**
     * Sets the subscribers value for this ProvisionSubscribersResponse.
     * 
     * @param subscribers
     */
    public void setSubscribers(com.sandvine.subscriberservices.ws.Subscriber[] subscribers) {
        this.subscribers = subscribers;
    }


    /**
     * Gets the provisionSubscriberPartialFailures value for this ProvisionSubscribersResponse.
     * 
     * @return provisionSubscriberPartialFailures
     */
    public com.sandvine.subscriberservices.ws.ProvisionSubscriberPartialFailure[] getProvisionSubscriberPartialFailures() {
        return provisionSubscriberPartialFailures;
    }


    /**
     * Sets the provisionSubscriberPartialFailures value for this ProvisionSubscribersResponse.
     * 
     * @param provisionSubscriberPartialFailures
     */
    public void setProvisionSubscriberPartialFailures(com.sandvine.subscriberservices.ws.ProvisionSubscriberPartialFailure[] provisionSubscriberPartialFailures) {
        this.provisionSubscriberPartialFailures = provisionSubscriberPartialFailures;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProvisionSubscribersResponse)) return false;
        ProvisionSubscribersResponse other = (ProvisionSubscribersResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.subscribers==null && other.getSubscribers()==null) || 
             (this.subscribers!=null &&
              java.util.Arrays.equals(this.subscribers, other.getSubscribers()))) &&
            ((this.provisionSubscriberPartialFailures==null && other.getProvisionSubscriberPartialFailures()==null) || 
             (this.provisionSubscriberPartialFailures!=null &&
              java.util.Arrays.equals(this.provisionSubscriberPartialFailures, other.getProvisionSubscriberPartialFailures())));
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
        if (getSubscribers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSubscribers());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSubscribers(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getProvisionSubscriberPartialFailures() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProvisionSubscriberPartialFailures());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProvisionSubscriberPartialFailures(), i);
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
        new org.apache.axis.description.TypeDesc(ProvisionSubscribersResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "ProvisionSubscribersResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscribers");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Subscribers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "Subscriber"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "Subscriber"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("provisionSubscriberPartialFailures");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ProvisionSubscriberPartialFailures"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "ProvisionSubscriberPartialFailure"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "ProvisionSubscriberPartialFailure"));
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
