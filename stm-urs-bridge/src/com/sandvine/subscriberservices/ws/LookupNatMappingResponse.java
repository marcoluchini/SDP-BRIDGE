/**
 * LookupNatMappingResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sandvine.subscriberservices.ws;

public class LookupNatMappingResponse  extends com.sandvine.subscriberservices.ws.Response  implements java.io.Serializable {
    private com.sandvine.subscriberservices.ws.NatMapping natMapping;

    public LookupNatMappingResponse() {
    }

    public LookupNatMappingResponse(
           com.sandvine.subscriberservices.ws.Result result,
           com.sandvine.subscriberservices.ws.Error[] errors,
           long requestProcessingTime,
           com.sandvine.subscriberservices.ws.DelegationSummary delegationSummary,
           com.sandvine.subscriberservices.ws.NatMapping natMapping) {
        super(
            result,
            errors,
            requestProcessingTime,
            delegationSummary);
        this.natMapping = natMapping;
    }


    /**
     * Gets the natMapping value for this LookupNatMappingResponse.
     * 
     * @return natMapping
     */
    public com.sandvine.subscriberservices.ws.NatMapping getNatMapping() {
        return natMapping;
    }


    /**
     * Sets the natMapping value for this LookupNatMappingResponse.
     * 
     * @param natMapping
     */
    public void setNatMapping(com.sandvine.subscriberservices.ws.NatMapping natMapping) {
        this.natMapping = natMapping;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LookupNatMappingResponse)) return false;
        LookupNatMappingResponse other = (LookupNatMappingResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.natMapping==null && other.getNatMapping()==null) || 
             (this.natMapping!=null &&
              this.natMapping.equals(other.getNatMapping())));
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
        if (getNatMapping() != null) {
            _hashCode += getNatMapping().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LookupNatMappingResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "LookupNatMappingResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("natMapping");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NatMapping"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "NatMapping"));
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
