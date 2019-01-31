/**
 * LookupIpAssignmentResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sandvine.subscriberservices.ws;

public class LookupIpAssignmentResponse  extends com.sandvine.subscriberservices.ws.DelegateServiceResponse  implements java.io.Serializable {
    private com.sandvine.subscriberservices.ws.IpAssignment ipAssignment;

    public LookupIpAssignmentResponse() {
    }

    public LookupIpAssignmentResponse(
           com.sandvine.subscriberservices.ws.Result result,
           com.sandvine.subscriberservices.ws.Error[] errors,
           long requestProcessingTime,
           com.sandvine.subscriberservices.ws.DelegationSummary delegationSummary,
           com.sandvine.subscriberservices.ws.IpAssignment ipAssignment) {
        super(
            result,
            errors,
            requestProcessingTime,
            delegationSummary);
        this.ipAssignment = ipAssignment;
    }


    /**
     * Gets the ipAssignment value for this LookupIpAssignmentResponse.
     * 
     * @return ipAssignment
     */
    public com.sandvine.subscriberservices.ws.IpAssignment getIpAssignment() {
        return ipAssignment;
    }


    /**
     * Sets the ipAssignment value for this LookupIpAssignmentResponse.
     * 
     * @param ipAssignment
     */
    public void setIpAssignment(com.sandvine.subscriberservices.ws.IpAssignment ipAssignment) {
        this.ipAssignment = ipAssignment;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LookupIpAssignmentResponse)) return false;
        LookupIpAssignmentResponse other = (LookupIpAssignmentResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.ipAssignment==null && other.getIpAssignment()==null) || 
             (this.ipAssignment!=null &&
              this.ipAssignment.equals(other.getIpAssignment())));
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
        if (getIpAssignment() != null) {
            _hashCode += getIpAssignment().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LookupIpAssignmentResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "LookupIpAssignmentResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipAssignment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IpAssignment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "IpAssignment"));
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
