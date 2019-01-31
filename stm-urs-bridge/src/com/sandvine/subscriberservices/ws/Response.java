/**
 * Response.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sandvine.subscriberservices.ws;

public abstract class Response  extends com.sandvine.subscriberservices.ws.Message  implements java.io.Serializable {
    private com.sandvine.subscriberservices.ws.Result result;

    private com.sandvine.subscriberservices.ws.Error[] errors;

    private long requestProcessingTime;

    private com.sandvine.subscriberservices.ws.DelegationSummary delegationSummary;

    public Response() {
    }

    public Response(
           com.sandvine.subscriberservices.ws.Result result,
           com.sandvine.subscriberservices.ws.Error[] errors,
           long requestProcessingTime,
           com.sandvine.subscriberservices.ws.DelegationSummary delegationSummary) {
        this.result = result;
        this.errors = errors;
        this.requestProcessingTime = requestProcessingTime;
        this.delegationSummary = delegationSummary;
    }


    /**
     * Gets the result value for this Response.
     * 
     * @return result
     */
    public com.sandvine.subscriberservices.ws.Result getResult() {
        return result;
    }


    /**
     * Sets the result value for this Response.
     * 
     * @param result
     */
    public void setResult(com.sandvine.subscriberservices.ws.Result result) {
        this.result = result;
    }


    /**
     * Gets the errors value for this Response.
     * 
     * @return errors
     */
    public com.sandvine.subscriberservices.ws.Error[] getErrors() {
        return errors;
    }


    /**
     * Sets the errors value for this Response.
     * 
     * @param errors
     */
    public void setErrors(com.sandvine.subscriberservices.ws.Error[] errors) {
        this.errors = errors;
    }


    /**
     * Gets the requestProcessingTime value for this Response.
     * 
     * @return requestProcessingTime
     */
    public long getRequestProcessingTime() {
        return requestProcessingTime;
    }


    /**
     * Sets the requestProcessingTime value for this Response.
     * 
     * @param requestProcessingTime
     */
    public void setRequestProcessingTime(long requestProcessingTime) {
        this.requestProcessingTime = requestProcessingTime;
    }


    /**
     * Gets the delegationSummary value for this Response.
     * 
     * @return delegationSummary
     */
    public com.sandvine.subscriberservices.ws.DelegationSummary getDelegationSummary() {
        return delegationSummary;
    }


    /**
     * Sets the delegationSummary value for this Response.
     * 
     * @param delegationSummary
     */
    public void setDelegationSummary(com.sandvine.subscriberservices.ws.DelegationSummary delegationSummary) {
        this.delegationSummary = delegationSummary;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Response)) return false;
        Response other = (Response) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.result==null && other.getResult()==null) || 
             (this.result!=null &&
              this.result.equals(other.getResult()))) &&
            ((this.errors==null && other.getErrors()==null) || 
             (this.errors!=null &&
              java.util.Arrays.equals(this.errors, other.getErrors()))) &&
            this.requestProcessingTime == other.getRequestProcessingTime() &&
            ((this.delegationSummary==null && other.getDelegationSummary()==null) || 
             (this.delegationSummary!=null &&
              this.delegationSummary.equals(other.getDelegationSummary())));
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
        if (getResult() != null) {
            _hashCode += getResult().hashCode();
        }
        if (getErrors() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getErrors());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getErrors(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += new Long(getRequestProcessingTime()).hashCode();
        if (getDelegationSummary() != null) {
            _hashCode += getDelegationSummary().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Response.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "Response"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("result");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Result"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "Result"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errors");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Errors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "Error"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "Error"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestProcessingTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RequestProcessingTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("delegationSummary");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DelegationSummary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "DelegationSummary"));
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
