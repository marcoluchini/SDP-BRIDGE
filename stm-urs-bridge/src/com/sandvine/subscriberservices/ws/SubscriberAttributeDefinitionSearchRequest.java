/**
 * SubscriberAttributeDefinitionSearchRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sandvine.subscriberservices.ws;

public class SubscriberAttributeDefinitionSearchRequest  extends com.sandvine.subscriberservices.ws.Request  implements java.io.Serializable {
    private java.lang.Boolean queryLocalDataHomeOnly;

    private java.lang.String[] responseGroups;

    public SubscriberAttributeDefinitionSearchRequest() {
    }

    public SubscriberAttributeDefinitionSearchRequest(
           java.lang.Boolean debug,
           java.lang.Boolean queryLocalDataHomeOnly,
           java.lang.String[] responseGroups) {
        super(
            debug);
        this.queryLocalDataHomeOnly = queryLocalDataHomeOnly;
        this.responseGroups = responseGroups;
    }


    /**
     * Gets the queryLocalDataHomeOnly value for this SubscriberAttributeDefinitionSearchRequest.
     * 
     * @return queryLocalDataHomeOnly
     */
    public java.lang.Boolean getQueryLocalDataHomeOnly() {
        return queryLocalDataHomeOnly;
    }


    /**
     * Sets the queryLocalDataHomeOnly value for this SubscriberAttributeDefinitionSearchRequest.
     * 
     * @param queryLocalDataHomeOnly
     */
    public void setQueryLocalDataHomeOnly(java.lang.Boolean queryLocalDataHomeOnly) {
        this.queryLocalDataHomeOnly = queryLocalDataHomeOnly;
    }


    /**
     * Gets the responseGroups value for this SubscriberAttributeDefinitionSearchRequest.
     * 
     * @return responseGroups
     */
    public java.lang.String[] getResponseGroups() {
        return responseGroups;
    }


    /**
     * Sets the responseGroups value for this SubscriberAttributeDefinitionSearchRequest.
     * 
     * @param responseGroups
     */
    public void setResponseGroups(java.lang.String[] responseGroups) {
        this.responseGroups = responseGroups;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SubscriberAttributeDefinitionSearchRequest)) return false;
        SubscriberAttributeDefinitionSearchRequest other = (SubscriberAttributeDefinitionSearchRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.queryLocalDataHomeOnly==null && other.getQueryLocalDataHomeOnly()==null) || 
             (this.queryLocalDataHomeOnly!=null &&
              this.queryLocalDataHomeOnly.equals(other.getQueryLocalDataHomeOnly()))) &&
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
        if (getQueryLocalDataHomeOnly() != null) {
            _hashCode += getQueryLocalDataHomeOnly().hashCode();
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
        new org.apache.axis.description.TypeDesc(SubscriberAttributeDefinitionSearchRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "SubscriberAttributeDefinitionSearchRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryLocalDataHomeOnly");
        elemField.setXmlName(new javax.xml.namespace.QName("", "QueryLocalDataHomeOnly"));
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
