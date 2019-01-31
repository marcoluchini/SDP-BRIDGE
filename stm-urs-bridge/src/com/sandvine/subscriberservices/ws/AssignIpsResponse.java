/**
 * AssignIpsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sandvine.subscriberservices.ws;

public class AssignIpsResponse  extends com.sandvine.subscriberservices.ws.BulkOperationResponse  implements java.io.Serializable {
    private com.sandvine.subscriberservices.ws.IpAssignment[] ipAssignments;

    private com.sandvine.subscriberservices.ws.AssignIpsPartialFailure[] partialFailures;

    public AssignIpsResponse() {
    }

    public AssignIpsResponse(
           com.sandvine.subscriberservices.ws.Result result,
           com.sandvine.subscriberservices.ws.Error[] errors,
           long requestProcessingTime,
           com.sandvine.subscriberservices.ws.DelegationSummary delegationSummary,
           com.sandvine.subscriberservices.ws.BulkStatistics bulkStatistics,
           com.sandvine.subscriberservices.ws.BulkOperationFailureBehaviour bulkOperationFailureBehaviour,
           com.sandvine.subscriberservices.ws.IpAssignment[] ipAssignments,
           com.sandvine.subscriberservices.ws.AssignIpsPartialFailure[] partialFailures) {
        super(
            result,
            errors,
            requestProcessingTime,
            delegationSummary,
            bulkStatistics,
            bulkOperationFailureBehaviour);
        this.ipAssignments = ipAssignments;
        this.partialFailures = partialFailures;
    }


    /**
     * Gets the ipAssignments value for this AssignIpsResponse.
     * 
     * @return ipAssignments
     */
    public com.sandvine.subscriberservices.ws.IpAssignment[] getIpAssignments() {
        return ipAssignments;
    }


    /**
     * Sets the ipAssignments value for this AssignIpsResponse.
     * 
     * @param ipAssignments
     */
    public void setIpAssignments(com.sandvine.subscriberservices.ws.IpAssignment[] ipAssignments) {
        this.ipAssignments = ipAssignments;
    }


    /**
     * Gets the partialFailures value for this AssignIpsResponse.
     * 
     * @return partialFailures
     */
    public com.sandvine.subscriberservices.ws.AssignIpsPartialFailure[] getPartialFailures() {
        return partialFailures;
    }


    /**
     * Sets the partialFailures value for this AssignIpsResponse.
     * 
     * @param partialFailures
     */
    public void setPartialFailures(com.sandvine.subscriberservices.ws.AssignIpsPartialFailure[] partialFailures) {
        this.partialFailures = partialFailures;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AssignIpsResponse)) return false;
        AssignIpsResponse other = (AssignIpsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.ipAssignments==null && other.getIpAssignments()==null) || 
             (this.ipAssignments!=null &&
              java.util.Arrays.equals(this.ipAssignments, other.getIpAssignments()))) &&
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
        if (getIpAssignments() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIpAssignments());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIpAssignments(), i);
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
        new org.apache.axis.description.TypeDesc(AssignIpsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "AssignIpsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipAssignments");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IpAssignments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "IpAssignment"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "IpAssignment"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partialFailures");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PartialFailures"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "AssignIpsPartialFailure"));
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
