/**
 * DelegationSummary.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sandvine.subscriberservices.ws;

public class DelegationSummary  implements java.io.Serializable {
    private java.util.Calendar startTime;

    private java.util.Calendar endTime;

    private int total;

    private int success;

    private int failure;

    private int timeout;

    private com.sandvine.subscriberservices.ws.DelegationResult result;

    private com.sandvine.subscriberservices.ws.Delegation[] delegations;

    public DelegationSummary() {
    }

    public DelegationSummary(
           java.util.Calendar startTime,
           java.util.Calendar endTime,
           int total,
           int success,
           int failure,
           int timeout,
           com.sandvine.subscriberservices.ws.DelegationResult result,
           com.sandvine.subscriberservices.ws.Delegation[] delegations) {
           this.startTime = startTime;
           this.endTime = endTime;
           this.total = total;
           this.success = success;
           this.failure = failure;
           this.timeout = timeout;
           this.result = result;
           this.delegations = delegations;
    }


    /**
     * Gets the startTime value for this DelegationSummary.
     * 
     * @return startTime
     */
    public java.util.Calendar getStartTime() {
        return startTime;
    }


    /**
     * Sets the startTime value for this DelegationSummary.
     * 
     * @param startTime
     */
    public void setStartTime(java.util.Calendar startTime) {
        this.startTime = startTime;
    }


    /**
     * Gets the endTime value for this DelegationSummary.
     * 
     * @return endTime
     */
    public java.util.Calendar getEndTime() {
        return endTime;
    }


    /**
     * Sets the endTime value for this DelegationSummary.
     * 
     * @param endTime
     */
    public void setEndTime(java.util.Calendar endTime) {
        this.endTime = endTime;
    }


    /**
     * Gets the total value for this DelegationSummary.
     * 
     * @return total
     */
    public int getTotal() {
        return total;
    }


    /**
     * Sets the total value for this DelegationSummary.
     * 
     * @param total
     */
    public void setTotal(int total) {
        this.total = total;
    }


    /**
     * Gets the success value for this DelegationSummary.
     * 
     * @return success
     */
    public int getSuccess() {
        return success;
    }


    /**
     * Sets the success value for this DelegationSummary.
     * 
     * @param success
     */
    public void setSuccess(int success) {
        this.success = success;
    }


    /**
     * Gets the failure value for this DelegationSummary.
     * 
     * @return failure
     */
    public int getFailure() {
        return failure;
    }


    /**
     * Sets the failure value for this DelegationSummary.
     * 
     * @param failure
     */
    public void setFailure(int failure) {
        this.failure = failure;
    }


    /**
     * Gets the timeout value for this DelegationSummary.
     * 
     * @return timeout
     */
    public int getTimeout() {
        return timeout;
    }


    /**
     * Sets the timeout value for this DelegationSummary.
     * 
     * @param timeout
     */
    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }


    /**
     * Gets the result value for this DelegationSummary.
     * 
     * @return result
     */
    public com.sandvine.subscriberservices.ws.DelegationResult getResult() {
        return result;
    }


    /**
     * Sets the result value for this DelegationSummary.
     * 
     * @param result
     */
    public void setResult(com.sandvine.subscriberservices.ws.DelegationResult result) {
        this.result = result;
    }


    /**
     * Gets the delegations value for this DelegationSummary.
     * 
     * @return delegations
     */
    public com.sandvine.subscriberservices.ws.Delegation[] getDelegations() {
        return delegations;
    }


    /**
     * Sets the delegations value for this DelegationSummary.
     * 
     * @param delegations
     */
    public void setDelegations(com.sandvine.subscriberservices.ws.Delegation[] delegations) {
        this.delegations = delegations;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DelegationSummary)) return false;
        DelegationSummary other = (DelegationSummary) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.startTime==null && other.getStartTime()==null) || 
             (this.startTime!=null &&
              this.startTime.equals(other.getStartTime()))) &&
            ((this.endTime==null && other.getEndTime()==null) || 
             (this.endTime!=null &&
              this.endTime.equals(other.getEndTime()))) &&
            this.total == other.getTotal() &&
            this.success == other.getSuccess() &&
            this.failure == other.getFailure() &&
            this.timeout == other.getTimeout() &&
            ((this.result==null && other.getResult()==null) || 
             (this.result!=null &&
              this.result.equals(other.getResult()))) &&
            ((this.delegations==null && other.getDelegations()==null) || 
             (this.delegations!=null &&
              java.util.Arrays.equals(this.delegations, other.getDelegations())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getStartTime() != null) {
            _hashCode += getStartTime().hashCode();
        }
        if (getEndTime() != null) {
            _hashCode += getEndTime().hashCode();
        }
        _hashCode += getTotal();
        _hashCode += getSuccess();
        _hashCode += getFailure();
        _hashCode += getTimeout();
        if (getResult() != null) {
            _hashCode += getResult().hashCode();
        }
        if (getDelegations() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDelegations());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDelegations(), i);
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
        new org.apache.axis.description.TypeDesc(DelegationSummary.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "DelegationSummary"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "StartTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EndTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("total");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Total"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("success");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Success"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("failure");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Failure"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeout");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Timeout"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("result");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Result"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "DelegationResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("delegations");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Delegations"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "Delegation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "Delegation"));
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
