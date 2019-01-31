/**
 * LookupSubscribersRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sandvine.subscriberservices.ws;

public class LookupSubscribersRequest  extends com.sandvine.subscriberservices.ws.BulkOperationRequest  implements java.io.Serializable {
    private com.sandvine.subscriberservices.ws.SubscriberKey[] subscriberKeys;

    private java.lang.String dataHome;

    private java.lang.Boolean includeAllDataHomeResponses;

    private java.lang.String[] responseGroups;

    public LookupSubscribersRequest() {
    }

    public LookupSubscribersRequest(
           java.lang.Boolean debug,
           com.sandvine.subscriberservices.ws.BulkOperationFailureBehaviour bulkOperationFailureBehaviour,
           com.sandvine.subscriberservices.ws.SubscriberKey[] subscriberKeys,
           java.lang.String dataHome,
           java.lang.Boolean includeAllDataHomeResponses,
           java.lang.String[] responseGroups) {
        super(
            debug,
            bulkOperationFailureBehaviour);
        this.subscriberKeys = subscriberKeys;
        this.dataHome = dataHome;
        this.includeAllDataHomeResponses = includeAllDataHomeResponses;
        this.responseGroups = responseGroups;
    }


    /**
     * Gets the subscriberKeys value for this LookupSubscribersRequest.
     * 
     * @return subscriberKeys
     */
    public com.sandvine.subscriberservices.ws.SubscriberKey[] getSubscriberKeys() {
        return subscriberKeys;
    }


    /**
     * Sets the subscriberKeys value for this LookupSubscribersRequest.
     * 
     * @param subscriberKeys
     */
    public void setSubscriberKeys(com.sandvine.subscriberservices.ws.SubscriberKey[] subscriberKeys) {
        this.subscriberKeys = subscriberKeys;
    }


    /**
     * Gets the dataHome value for this LookupSubscribersRequest.
     * 
     * @return dataHome
     */
    public java.lang.String getDataHome() {
        return dataHome;
    }


    /**
     * Sets the dataHome value for this LookupSubscribersRequest.
     * 
     * @param dataHome
     */
    public void setDataHome(java.lang.String dataHome) {
        this.dataHome = dataHome;
    }


    /**
     * Gets the includeAllDataHomeResponses value for this LookupSubscribersRequest.
     * 
     * @return includeAllDataHomeResponses
     */
    public java.lang.Boolean getIncludeAllDataHomeResponses() {
        return includeAllDataHomeResponses;
    }


    /**
     * Sets the includeAllDataHomeResponses value for this LookupSubscribersRequest.
     * 
     * @param includeAllDataHomeResponses
     */
    public void setIncludeAllDataHomeResponses(java.lang.Boolean includeAllDataHomeResponses) {
        this.includeAllDataHomeResponses = includeAllDataHomeResponses;
    }


    /**
     * Gets the responseGroups value for this LookupSubscribersRequest.
     * 
     * @return responseGroups
     */
    public java.lang.String[] getResponseGroups() {
        return responseGroups;
    }


    /**
     * Sets the responseGroups value for this LookupSubscribersRequest.
     * 
     * @param responseGroups
     */
    public void setResponseGroups(java.lang.String[] responseGroups) {
        this.responseGroups = responseGroups;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LookupSubscribersRequest)) return false;
        LookupSubscribersRequest other = (LookupSubscribersRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.subscriberKeys==null && other.getSubscriberKeys()==null) || 
             (this.subscriberKeys!=null &&
              java.util.Arrays.equals(this.subscriberKeys, other.getSubscriberKeys()))) &&
            ((this.dataHome==null && other.getDataHome()==null) || 
             (this.dataHome!=null &&
              this.dataHome.equals(other.getDataHome()))) &&
            ((this.includeAllDataHomeResponses==null && other.getIncludeAllDataHomeResponses()==null) || 
             (this.includeAllDataHomeResponses!=null &&
              this.includeAllDataHomeResponses.equals(other.getIncludeAllDataHomeResponses()))) &&
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
        if (getSubscriberKeys() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSubscriberKeys());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSubscriberKeys(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDataHome() != null) {
            _hashCode += getDataHome().hashCode();
        }
        if (getIncludeAllDataHomeResponses() != null) {
            _hashCode += getIncludeAllDataHomeResponses().hashCode();
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
        new org.apache.axis.description.TypeDesc(LookupSubscribersRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "LookupSubscribersRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriberKeys");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SubscriberKeys"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "SubscriberKey"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "SubscriberKey"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataHome");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DataHome"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeAllDataHomeResponses");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IncludeAllDataHomeResponses"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
