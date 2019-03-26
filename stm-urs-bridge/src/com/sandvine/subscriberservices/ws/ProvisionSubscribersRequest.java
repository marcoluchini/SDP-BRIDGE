/**
 * ProvisionSubscribersRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sandvine.subscriberservices.ws;

public class ProvisionSubscribersRequest  extends com.sandvine.subscriberservices.ws.BulkOperationRequest  implements java.io.Serializable {
    private java.lang.Boolean resultOnly;

    private com.sandvine.subscriberservices.ws.SubscriberSessionCreate[] provisionSubscriberParameterSets;

    private java.lang.Boolean subscriberAutoCreate;

    private java.lang.String[] responseGroups;

    public ProvisionSubscribersRequest() {
    }

    public ProvisionSubscribersRequest(
           java.lang.Boolean debug,
           com.sandvine.subscriberservices.ws.BulkOperationFailureBehaviour bulkOperationFailureBehaviour,
           java.lang.Boolean resultOnly,
           com.sandvine.subscriberservices.ws.SubscriberSessionCreate[] provisionSubscriberParameterSets,
           java.lang.Boolean subscriberAutoCreate,
           java.lang.String[] responseGroups) {
        super(
            debug,
            bulkOperationFailureBehaviour);
        this.resultOnly = resultOnly;
        this.provisionSubscriberParameterSets = provisionSubscriberParameterSets;
        this.subscriberAutoCreate = subscriberAutoCreate;
        this.responseGroups = responseGroups;
    }


    /**
     * Gets the resultOnly value for this ProvisionSubscribersRequest.
     * 
     * @return resultOnly
     */
    public java.lang.Boolean getResultOnly() {
        return resultOnly;
    }


    /**
     * Sets the resultOnly value for this ProvisionSubscribersRequest.
     * 
     * @param resultOnly
     */
    public void setResultOnly(java.lang.Boolean resultOnly) {
        this.resultOnly = resultOnly;
    }


    /**
     * Gets the provisionSubscriberParameterSets value for this ProvisionSubscribersRequest.
     * 
     * @return provisionSubscriberParameterSets
     */
    public com.sandvine.subscriberservices.ws.SubscriberSessionCreate[] getProvisionSubscriberParameterSets() {
        return provisionSubscriberParameterSets;
    }


    /**
     * Sets the provisionSubscriberParameterSets value for this ProvisionSubscribersRequest.
     * 
     * @param provisionSubscriberParameterSets
     */
    public void setProvisionSubscriberParameterSets(com.sandvine.subscriberservices.ws.SubscriberSessionCreate[] provisionSubscriberParameterSets) {
        this.provisionSubscriberParameterSets = provisionSubscriberParameterSets;
    }


    /**
     * Gets the subscriberAutoCreate value for this ProvisionSubscribersRequest.
     * 
     * @return subscriberAutoCreate
     */
    public java.lang.Boolean getSubscriberAutoCreate() {
        return subscriberAutoCreate;
    }


    /**
     * Sets the subscriberAutoCreate value for this ProvisionSubscribersRequest.
     * 
     * @param subscriberAutoCreate
     */
    public void setSubscriberAutoCreate(java.lang.Boolean subscriberAutoCreate) {
        this.subscriberAutoCreate = subscriberAutoCreate;
    }


    /**
     * Gets the responseGroups value for this ProvisionSubscribersRequest.
     * 
     * @return responseGroups
     */
    public java.lang.String[] getResponseGroups() {
        return responseGroups;
    }


    /**
     * Sets the responseGroups value for this ProvisionSubscribersRequest.
     * 
     * @param responseGroups
     */
    public void setResponseGroups(java.lang.String[] responseGroups) {
        this.responseGroups = responseGroups;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProvisionSubscribersRequest)) return false;
        ProvisionSubscribersRequest other = (ProvisionSubscribersRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.resultOnly==null && other.getResultOnly()==null) || 
             (this.resultOnly!=null &&
              this.resultOnly.equals(other.getResultOnly()))) &&
            ((this.provisionSubscriberParameterSets==null && other.getProvisionSubscriberParameterSets()==null) || 
             (this.provisionSubscriberParameterSets!=null &&
              java.util.Arrays.equals(this.provisionSubscriberParameterSets, other.getProvisionSubscriberParameterSets()))) &&
            ((this.subscriberAutoCreate==null && other.getSubscriberAutoCreate()==null) || 
             (this.subscriberAutoCreate!=null &&
              this.subscriberAutoCreate.equals(other.getSubscriberAutoCreate()))) &&
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
        if (getResultOnly() != null) {
            _hashCode += getResultOnly().hashCode();
        }
        if (getProvisionSubscriberParameterSets() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProvisionSubscriberParameterSets());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProvisionSubscriberParameterSets(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSubscriberAutoCreate() != null) {
            _hashCode += getSubscriberAutoCreate().hashCode();
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
        new org.apache.axis.description.TypeDesc(ProvisionSubscribersRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "ProvisionSubscribersRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultOnly");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ResultOnly"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("provisionSubscriberParameterSets");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ProvisionSubscriberParameterSets"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "SubscriberSessionCreate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "ProvisionSubscriberParameterSet"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriberAutoCreate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SubscriberAutoCreate"));
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
