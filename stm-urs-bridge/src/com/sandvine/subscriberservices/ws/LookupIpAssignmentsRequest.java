/**
 * LookupIpAssignmentsRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sandvine.subscriberservices.ws;

public class LookupIpAssignmentsRequest  extends com.sandvine.subscriberservices.ws.BulkOperationRequest  implements java.io.Serializable {
    private com.sandvine.subscriberservices.ws.IpAssignmentKey[] ipAssignmentKeys;

    private java.lang.String[] responseGroups;

    public LookupIpAssignmentsRequest() {
    }

    public LookupIpAssignmentsRequest(
           java.lang.Boolean debug,
           com.sandvine.subscriberservices.ws.BulkOperationFailureBehaviour bulkOperationFailureBehaviour,
           com.sandvine.subscriberservices.ws.IpAssignmentKey[] ipAssignmentKeys,
           java.lang.String[] responseGroups) {
        super(
            debug,
            bulkOperationFailureBehaviour);
        this.ipAssignmentKeys = ipAssignmentKeys;
        this.responseGroups = responseGroups;
    }


    /**
     * Gets the ipAssignmentKeys value for this LookupIpAssignmentsRequest.
     * 
     * @return ipAssignmentKeys
     */
    public com.sandvine.subscriberservices.ws.IpAssignmentKey[] getIpAssignmentKeys() {
        return ipAssignmentKeys;
    }


    /**
     * Sets the ipAssignmentKeys value for this LookupIpAssignmentsRequest.
     * 
     * @param ipAssignmentKeys
     */
    public void setIpAssignmentKeys(com.sandvine.subscriberservices.ws.IpAssignmentKey[] ipAssignmentKeys) {
        this.ipAssignmentKeys = ipAssignmentKeys;
    }


    /**
     * Gets the responseGroups value for this LookupIpAssignmentsRequest.
     * 
     * @return responseGroups
     */
    public java.lang.String[] getResponseGroups() {
        return responseGroups;
    }


    /**
     * Sets the responseGroups value for this LookupIpAssignmentsRequest.
     * 
     * @param responseGroups
     */
    public void setResponseGroups(java.lang.String[] responseGroups) {
        this.responseGroups = responseGroups;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LookupIpAssignmentsRequest)) return false;
        LookupIpAssignmentsRequest other = (LookupIpAssignmentsRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.ipAssignmentKeys==null && other.getIpAssignmentKeys()==null) || 
             (this.ipAssignmentKeys!=null &&
              java.util.Arrays.equals(this.ipAssignmentKeys, other.getIpAssignmentKeys()))) &&
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
        if (getIpAssignmentKeys() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIpAssignmentKeys());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIpAssignmentKeys(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        new org.apache.axis.description.TypeDesc(LookupIpAssignmentsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "LookupIpAssignmentsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipAssignmentKeys");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IpAssignmentKeys"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "IpAssignmentKey"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "IpAssignmentKey"));
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
