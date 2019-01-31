/**
 * RemoveSubscriberAttributesResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sandvine.subscriberservices.ws;

public class RemoveSubscriberAttributesResponse  extends com.sandvine.subscriberservices.ws.BulkOperationResponse  implements java.io.Serializable {
    private com.sandvine.subscriberservices.ws.Subscriber[] subscribers;

    private com.sandvine.subscriberservices.ws.RemoveSubscriberAttributesPartialFailure[] partialFailures;

    public RemoveSubscriberAttributesResponse() {
    }

    public RemoveSubscriberAttributesResponse(
           com.sandvine.subscriberservices.ws.Result result,
           com.sandvine.subscriberservices.ws.Error[] errors,
           long requestProcessingTime,
           com.sandvine.subscriberservices.ws.DelegationSummary delegationSummary,
           com.sandvine.subscriberservices.ws.BulkStatistics bulkStatistics,
           com.sandvine.subscriberservices.ws.BulkOperationFailureBehaviour bulkOperationFailureBehaviour,
           com.sandvine.subscriberservices.ws.Subscriber[] subscribers,
           com.sandvine.subscriberservices.ws.RemoveSubscriberAttributesPartialFailure[] partialFailures) {
        super(
            result,
            errors,
            requestProcessingTime,
            delegationSummary,
            bulkStatistics,
            bulkOperationFailureBehaviour);
        this.subscribers = subscribers;
        this.partialFailures = partialFailures;
    }


    /**
     * Gets the subscribers value for this RemoveSubscriberAttributesResponse.
     * 
     * @return subscribers
     */
    public com.sandvine.subscriberservices.ws.Subscriber[] getSubscribers() {
        return subscribers;
    }


    /**
     * Sets the subscribers value for this RemoveSubscriberAttributesResponse.
     * 
     * @param subscribers
     */
    public void setSubscribers(com.sandvine.subscriberservices.ws.Subscriber[] subscribers) {
        this.subscribers = subscribers;
    }


    /**
     * Gets the partialFailures value for this RemoveSubscriberAttributesResponse.
     * 
     * @return partialFailures
     */
    public com.sandvine.subscriberservices.ws.RemoveSubscriberAttributesPartialFailure[] getPartialFailures() {
        return partialFailures;
    }


    /**
     * Sets the partialFailures value for this RemoveSubscriberAttributesResponse.
     * 
     * @param partialFailures
     */
    public void setPartialFailures(com.sandvine.subscriberservices.ws.RemoveSubscriberAttributesPartialFailure[] partialFailures) {
        this.partialFailures = partialFailures;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RemoveSubscriberAttributesResponse)) return false;
        RemoveSubscriberAttributesResponse other = (RemoveSubscriberAttributesResponse) obj;
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
            ((this.partialFailures==null && other.getPartialFailures()==null) || 
             (this.partialFailures!=null &&
              java.util.Arrays.equals(this.partialFailures, other.getPartialFailures())));
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
        if (getPartialFailures() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPartialFailures());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPartialFailures(), i);
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
        new org.apache.axis.description.TypeDesc(RemoveSubscriberAttributesResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "RemoveSubscriberAttributesResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscribers");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Subscribers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "Subscriber"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "Subscriber"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partialFailures");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PartialFailures"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "RemoveSubscriberAttributesPartialFailure"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "PartialFailure"));
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
