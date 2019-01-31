/**
 * LookupIpAssignmentsPartialFailure.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sandvine.subscriberservices.ws;

public class LookupIpAssignmentsPartialFailure  extends com.sandvine.subscriberservices.ws.PartialFailure  implements java.io.Serializable {
    private com.sandvine.subscriberservices.ws.IpAssignmentKey ipAssignmentKey;

    public LookupIpAssignmentsPartialFailure() {
    }

    public LookupIpAssignmentsPartialFailure(
           java.lang.String code,
           java.lang.String message,
           com.sandvine.subscriberservices.ws.IpAssignmentKey ipAssignmentKey) {
        super(
            code,
            message);
        this.ipAssignmentKey = ipAssignmentKey;
    }


    /**
     * Gets the ipAssignmentKey value for this LookupIpAssignmentsPartialFailure.
     * 
     * @return ipAssignmentKey
     */
    public com.sandvine.subscriberservices.ws.IpAssignmentKey getIpAssignmentKey() {
        return ipAssignmentKey;
    }


    /**
     * Sets the ipAssignmentKey value for this LookupIpAssignmentsPartialFailure.
     * 
     * @param ipAssignmentKey
     */
    public void setIpAssignmentKey(com.sandvine.subscriberservices.ws.IpAssignmentKey ipAssignmentKey) {
        this.ipAssignmentKey = ipAssignmentKey;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LookupIpAssignmentsPartialFailure)) return false;
        LookupIpAssignmentsPartialFailure other = (LookupIpAssignmentsPartialFailure) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.ipAssignmentKey==null && other.getIpAssignmentKey()==null) || 
             (this.ipAssignmentKey!=null &&
              this.ipAssignmentKey.equals(other.getIpAssignmentKey())));
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
        if (getIpAssignmentKey() != null) {
            _hashCode += getIpAssignmentKey().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LookupIpAssignmentsPartialFailure.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "LookupIpAssignmentsPartialFailure"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipAssignmentKey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IpAssignmentKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "IpAssignmentKey"));
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
