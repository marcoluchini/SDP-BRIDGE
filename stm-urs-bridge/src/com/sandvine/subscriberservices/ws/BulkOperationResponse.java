/**
 * BulkOperationResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sandvine.subscriberservices.ws;

public abstract class BulkOperationResponse  extends com.sandvine.subscriberservices.ws.Response  implements java.io.Serializable {
    private com.sandvine.subscriberservices.ws.BulkStatistics bulkStatistics;

    private com.sandvine.subscriberservices.ws.BulkOperationFailureBehaviour bulkOperationFailureBehaviour;

    public BulkOperationResponse() {
    }

    public BulkOperationResponse(
           com.sandvine.subscriberservices.ws.Result result,
           com.sandvine.subscriberservices.ws.Error[] errors,
           long requestProcessingTime,
           com.sandvine.subscriberservices.ws.DelegationSummary delegationSummary,
           com.sandvine.subscriberservices.ws.BulkStatistics bulkStatistics,
           com.sandvine.subscriberservices.ws.BulkOperationFailureBehaviour bulkOperationFailureBehaviour) {
        super(
            result,
            errors,
            requestProcessingTime,
            delegationSummary);
        this.bulkStatistics = bulkStatistics;
        this.bulkOperationFailureBehaviour = bulkOperationFailureBehaviour;
    }


    /**
     * Gets the bulkStatistics value for this BulkOperationResponse.
     * 
     * @return bulkStatistics
     */
    public com.sandvine.subscriberservices.ws.BulkStatistics getBulkStatistics() {
        return bulkStatistics;
    }


    /**
     * Sets the bulkStatistics value for this BulkOperationResponse.
     * 
     * @param bulkStatistics
     */
    public void setBulkStatistics(com.sandvine.subscriberservices.ws.BulkStatistics bulkStatistics) {
        this.bulkStatistics = bulkStatistics;
    }


    /**
     * Gets the bulkOperationFailureBehaviour value for this BulkOperationResponse.
     * 
     * @return bulkOperationFailureBehaviour
     */
    public com.sandvine.subscriberservices.ws.BulkOperationFailureBehaviour getBulkOperationFailureBehaviour() {
        return bulkOperationFailureBehaviour;
    }


    /**
     * Sets the bulkOperationFailureBehaviour value for this BulkOperationResponse.
     * 
     * @param bulkOperationFailureBehaviour
     */
    public void setBulkOperationFailureBehaviour(com.sandvine.subscriberservices.ws.BulkOperationFailureBehaviour bulkOperationFailureBehaviour) {
        this.bulkOperationFailureBehaviour = bulkOperationFailureBehaviour;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BulkOperationResponse)) return false;
        BulkOperationResponse other = (BulkOperationResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.bulkStatistics==null && other.getBulkStatistics()==null) || 
             (this.bulkStatistics!=null &&
              this.bulkStatistics.equals(other.getBulkStatistics()))) &&
            ((this.bulkOperationFailureBehaviour==null && other.getBulkOperationFailureBehaviour()==null) || 
             (this.bulkOperationFailureBehaviour!=null &&
              this.bulkOperationFailureBehaviour.equals(other.getBulkOperationFailureBehaviour())));
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
        if (getBulkStatistics() != null) {
            _hashCode += getBulkStatistics().hashCode();
        }
        if (getBulkOperationFailureBehaviour() != null) {
            _hashCode += getBulkOperationFailureBehaviour().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BulkOperationResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "BulkOperationResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bulkStatistics");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BulkStatistics"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "BulkStatistics"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bulkOperationFailureBehaviour");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BulkOperationFailureBehaviour"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "BulkOperationFailureBehaviour"));
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
