/**
 * UnassignIpsRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sandvine.subscriberservices.ws;

public class UnassignIpsRequest  extends com.sandvine.subscriberservices.ws.BulkOperationRequest  implements java.io.Serializable {
    private java.lang.Boolean resultOnly;

    private com.sandvine.subscriberservices.ws.UnassignIpParameterSet[] unassignIpParameterSets;

    public UnassignIpsRequest() {
    }

    public UnassignIpsRequest(
           java.lang.Boolean debug,
           com.sandvine.subscriberservices.ws.BulkOperationFailureBehaviour bulkOperationFailureBehaviour,
           java.lang.Boolean resultOnly,
           com.sandvine.subscriberservices.ws.UnassignIpParameterSet[] unassignIpParameterSets) {
        super(
            debug,
            bulkOperationFailureBehaviour);
        this.resultOnly = resultOnly;
        this.unassignIpParameterSets = unassignIpParameterSets;
    }


    /**
     * Gets the resultOnly value for this UnassignIpsRequest.
     * 
     * @return resultOnly
     */
    public java.lang.Boolean getResultOnly() {
        return resultOnly;
    }


    /**
     * Sets the resultOnly value for this UnassignIpsRequest.
     * 
     * @param resultOnly
     */
    public void setResultOnly(java.lang.Boolean resultOnly) {
        this.resultOnly = resultOnly;
    }


    /**
     * Gets the unassignIpParameterSets value for this UnassignIpsRequest.
     * 
     * @return unassignIpParameterSets
     */
    public com.sandvine.subscriberservices.ws.UnassignIpParameterSet[] getUnassignIpParameterSets() {
        return unassignIpParameterSets;
    }


    /**
     * Sets the unassignIpParameterSets value for this UnassignIpsRequest.
     * 
     * @param unassignIpParameterSets
     */
    public void setUnassignIpParameterSets(com.sandvine.subscriberservices.ws.UnassignIpParameterSet[] unassignIpParameterSets) {
        this.unassignIpParameterSets = unassignIpParameterSets;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UnassignIpsRequest)) return false;
        UnassignIpsRequest other = (UnassignIpsRequest) obj;
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
            ((this.unassignIpParameterSets==null && other.getUnassignIpParameterSets()==null) || 
             (this.unassignIpParameterSets!=null &&
              java.util.Arrays.equals(this.unassignIpParameterSets, other.getUnassignIpParameterSets())));
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
        if (getUnassignIpParameterSets() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUnassignIpParameterSets());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUnassignIpParameterSets(), i);
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
        new org.apache.axis.description.TypeDesc(UnassignIpsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "UnassignIpsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultOnly");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ResultOnly"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unassignIpParameterSets");
        elemField.setXmlName(new javax.xml.namespace.QName("", "UnassignIpParameterSets"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "UnassignIpParameterSet"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "UnassignIpParameterSet"));
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
