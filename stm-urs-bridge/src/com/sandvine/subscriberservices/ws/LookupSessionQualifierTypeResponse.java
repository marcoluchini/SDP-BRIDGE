/**
 * LookupSessionQualifierTypeResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sandvine.subscriberservices.ws;

public class LookupSessionQualifierTypeResponse  extends com.sandvine.subscriberservices.ws.Response  implements java.io.Serializable {
    private com.sandvine.subscriberservices.ws.SessionQualifierType sessionQualifierType;

    public LookupSessionQualifierTypeResponse() {
    }

    public LookupSessionQualifierTypeResponse(
           com.sandvine.subscriberservices.ws.Result result,
           com.sandvine.subscriberservices.ws.Error[] errors,
           long requestProcessingTime,
           com.sandvine.subscriberservices.ws.DelegationSummary delegationSummary,
           com.sandvine.subscriberservices.ws.SessionQualifierType sessionQualifierType) {
        super(
            result,
            errors,
            requestProcessingTime,
            delegationSummary);
        this.sessionQualifierType = sessionQualifierType;
    }


    /**
     * Gets the sessionQualifierType value for this LookupSessionQualifierTypeResponse.
     * 
     * @return sessionQualifierType
     */
    public com.sandvine.subscriberservices.ws.SessionQualifierType getSessionQualifierType() {
        return sessionQualifierType;
    }


    /**
     * Sets the sessionQualifierType value for this LookupSessionQualifierTypeResponse.
     * 
     * @param sessionQualifierType
     */
    public void setSessionQualifierType(com.sandvine.subscriberservices.ws.SessionQualifierType sessionQualifierType) {
        this.sessionQualifierType = sessionQualifierType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LookupSessionQualifierTypeResponse)) return false;
        LookupSessionQualifierTypeResponse other = (LookupSessionQualifierTypeResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.sessionQualifierType==null && other.getSessionQualifierType()==null) || 
             (this.sessionQualifierType!=null &&
              this.sessionQualifierType.equals(other.getSessionQualifierType())));
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
        if (getSessionQualifierType() != null) {
            _hashCode += getSessionQualifierType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LookupSessionQualifierTypeResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "LookupSessionQualifierTypeResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionQualifierType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SessionQualifierType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "SessionQualifierType"));
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
