/**
 * RemoveSubscriberAttributesRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sandvine.subscriberservices.ws;

public class RemoveSubscriberAttributesRequest  extends com.sandvine.subscriberservices.ws.BulkOperationRequest  implements java.io.Serializable {
    private com.sandvine.subscriberservices.ws.RemoveSubscriberAttributeParameterSet[] subscriberAttributeParameterSets;

    private java.lang.String dataHome;

    private java.lang.String[] responseGroups;

    private java.lang.Boolean resultOnly;

    public RemoveSubscriberAttributesRequest() {
    }

    public RemoveSubscriberAttributesRequest(
           java.lang.Boolean debug,
           com.sandvine.subscriberservices.ws.BulkOperationFailureBehaviour bulkOperationFailureBehaviour,
           com.sandvine.subscriberservices.ws.RemoveSubscriberAttributeParameterSet[] subscriberAttributeParameterSets,
           java.lang.String dataHome,
           java.lang.String[] responseGroups,
           java.lang.Boolean resultOnly) {
        super(
            debug,
            bulkOperationFailureBehaviour);
        this.subscriberAttributeParameterSets = subscriberAttributeParameterSets;
        this.dataHome = dataHome;
        this.responseGroups = responseGroups;
        this.resultOnly = resultOnly;
    }


    /**
     * Gets the subscriberAttributeParameterSets value for this RemoveSubscriberAttributesRequest.
     * 
     * @return subscriberAttributeParameterSets
     */
    public com.sandvine.subscriberservices.ws.RemoveSubscriberAttributeParameterSet[] getSubscriberAttributeParameterSets() {
        return subscriberAttributeParameterSets;
    }


    /**
     * Sets the subscriberAttributeParameterSets value for this RemoveSubscriberAttributesRequest.
     * 
     * @param subscriberAttributeParameterSets
     */
    public void setSubscriberAttributeParameterSets(com.sandvine.subscriberservices.ws.RemoveSubscriberAttributeParameterSet[] subscriberAttributeParameterSets) {
        this.subscriberAttributeParameterSets = subscriberAttributeParameterSets;
    }


    /**
     * Gets the dataHome value for this RemoveSubscriberAttributesRequest.
     * 
     * @return dataHome
     */
    public java.lang.String getDataHome() {
        return dataHome;
    }


    /**
     * Sets the dataHome value for this RemoveSubscriberAttributesRequest.
     * 
     * @param dataHome
     */
    public void setDataHome(java.lang.String dataHome) {
        this.dataHome = dataHome;
    }


    /**
     * Gets the responseGroups value for this RemoveSubscriberAttributesRequest.
     * 
     * @return responseGroups
     */
    public java.lang.String[] getResponseGroups() {
        return responseGroups;
    }


    /**
     * Sets the responseGroups value for this RemoveSubscriberAttributesRequest.
     * 
     * @param responseGroups
     */
    public void setResponseGroups(java.lang.String[] responseGroups) {
        this.responseGroups = responseGroups;
    }


    /**
     * Gets the resultOnly value for this RemoveSubscriberAttributesRequest.
     * 
     * @return resultOnly
     */
    public java.lang.Boolean getResultOnly() {
        return resultOnly;
    }


    /**
     * Sets the resultOnly value for this RemoveSubscriberAttributesRequest.
     * 
     * @param resultOnly
     */
    public void setResultOnly(java.lang.Boolean resultOnly) {
        this.resultOnly = resultOnly;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RemoveSubscriberAttributesRequest)) return false;
        RemoveSubscriberAttributesRequest other = (RemoveSubscriberAttributesRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.subscriberAttributeParameterSets==null && other.getSubscriberAttributeParameterSets()==null) || 
             (this.subscriberAttributeParameterSets!=null &&
              java.util.Arrays.equals(this.subscriberAttributeParameterSets, other.getSubscriberAttributeParameterSets()))) &&
            ((this.dataHome==null && other.getDataHome()==null) || 
             (this.dataHome!=null &&
              this.dataHome.equals(other.getDataHome()))) &&
            ((this.responseGroups==null && other.getResponseGroups()==null) || 
             (this.responseGroups!=null &&
              java.util.Arrays.equals(this.responseGroups, other.getResponseGroups()))) &&
            ((this.resultOnly==null && other.getResultOnly()==null) || 
             (this.resultOnly!=null &&
              this.resultOnly.equals(other.getResultOnly())));
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
        if (getResultOnly() != null) {
            _hashCode += getResultOnly().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RemoveSubscriberAttributesRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "RemoveSubscriberAttributesRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriberAttributeParameterSets");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SubscriberAttributeParameterSets"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "RemoveSubscriberAttributeParameterSet"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "SubscriberAttributeParameterSet"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultOnly");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ResultOnly"));
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
