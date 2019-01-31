/**
 * DeleteNatMappingsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sandvine.subscriberservices.ws;

public class DeleteNatMappingsResponse  extends com.sandvine.subscriberservices.ws.BulkOperationResponse  implements java.io.Serializable {
    private com.sandvine.subscriberservices.ws.NatMapping[] natMappings;

    private com.sandvine.subscriberservices.ws.DeleteNatMappingsPartialFailure[] partialFailures;

    public DeleteNatMappingsResponse() {
    }

    public DeleteNatMappingsResponse(
           com.sandvine.subscriberservices.ws.Result result,
           com.sandvine.subscriberservices.ws.Error[] errors,
           long requestProcessingTime,
           com.sandvine.subscriberservices.ws.DelegationSummary delegationSummary,
           com.sandvine.subscriberservices.ws.BulkStatistics bulkStatistics,
           com.sandvine.subscriberservices.ws.BulkOperationFailureBehaviour bulkOperationFailureBehaviour,
           com.sandvine.subscriberservices.ws.NatMapping[] natMappings,
           com.sandvine.subscriberservices.ws.DeleteNatMappingsPartialFailure[] partialFailures) {
        super(
            result,
            errors,
            requestProcessingTime,
            delegationSummary,
            bulkStatistics,
            bulkOperationFailureBehaviour);
        this.natMappings = natMappings;
        this.partialFailures = partialFailures;
    }


    /**
     * Gets the natMappings value for this DeleteNatMappingsResponse.
     * 
     * @return natMappings
     */
    public com.sandvine.subscriberservices.ws.NatMapping[] getNatMappings() {
        return natMappings;
    }


    /**
     * Sets the natMappings value for this DeleteNatMappingsResponse.
     * 
     * @param natMappings
     */
    public void setNatMappings(com.sandvine.subscriberservices.ws.NatMapping[] natMappings) {
        this.natMappings = natMappings;
    }


    /**
     * Gets the partialFailures value for this DeleteNatMappingsResponse.
     * 
     * @return partialFailures
     */
    public com.sandvine.subscriberservices.ws.DeleteNatMappingsPartialFailure[] getPartialFailures() {
        return partialFailures;
    }


    /**
     * Sets the partialFailures value for this DeleteNatMappingsResponse.
     * 
     * @param partialFailures
     */
    public void setPartialFailures(com.sandvine.subscriberservices.ws.DeleteNatMappingsPartialFailure[] partialFailures) {
        this.partialFailures = partialFailures;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DeleteNatMappingsResponse)) return false;
        DeleteNatMappingsResponse other = (DeleteNatMappingsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.natMappings==null && other.getNatMappings()==null) || 
             (this.natMappings!=null &&
              java.util.Arrays.equals(this.natMappings, other.getNatMappings()))) &&
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
        if (getNatMappings() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNatMappings());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNatMappings(), i);
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
        new org.apache.axis.description.TypeDesc(DeleteNatMappingsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "DeleteNatMappingsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("natMappings");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NatMappings"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "NatMapping"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "NatMapping"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partialFailures");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PartialFailures"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "DeleteNatMappingsPartialFailure"));
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
