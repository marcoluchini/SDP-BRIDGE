/**
 * DeleteNatMappingParameterSet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sandvine.subscriberservices.ws;

public class DeleteNatMappingParameterSet  implements java.io.Serializable {
    private com.sandvine.subscriberservices.ws.NatMappingKey natMappingKey;

    private java.util.Calendar unassigned;

    public DeleteNatMappingParameterSet() {
    }

    public DeleteNatMappingParameterSet(
           com.sandvine.subscriberservices.ws.NatMappingKey natMappingKey,
           java.util.Calendar unassigned) {
           this.natMappingKey = natMappingKey;
           this.unassigned = unassigned;
    }


    /**
     * Gets the natMappingKey value for this DeleteNatMappingParameterSet.
     * 
     * @return natMappingKey
     */
    public com.sandvine.subscriberservices.ws.NatMappingKey getNatMappingKey() {
        return natMappingKey;
    }


    /**
     * Sets the natMappingKey value for this DeleteNatMappingParameterSet.
     * 
     * @param natMappingKey
     */
    public void setNatMappingKey(com.sandvine.subscriberservices.ws.NatMappingKey natMappingKey) {
        this.natMappingKey = natMappingKey;
    }


    /**
     * Gets the unassigned value for this DeleteNatMappingParameterSet.
     * 
     * @return unassigned
     */
    public java.util.Calendar getUnassigned() {
        return unassigned;
    }


    /**
     * Sets the unassigned value for this DeleteNatMappingParameterSet.
     * 
     * @param unassigned
     */
    public void setUnassigned(java.util.Calendar unassigned) {
        this.unassigned = unassigned;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DeleteNatMappingParameterSet)) return false;
        DeleteNatMappingParameterSet other = (DeleteNatMappingParameterSet) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.natMappingKey==null && other.getNatMappingKey()==null) || 
             (this.natMappingKey!=null &&
              this.natMappingKey.equals(other.getNatMappingKey()))) &&
            ((this.unassigned==null && other.getUnassigned()==null) || 
             (this.unassigned!=null &&
              this.unassigned.equals(other.getUnassigned())));
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
        if (getNatMappingKey() != null) {
            _hashCode += getNatMappingKey().hashCode();
        }
        if (getUnassigned() != null) {
            _hashCode += getUnassigned().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DeleteNatMappingParameterSet.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "DeleteNatMappingParameterSet"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("natMappingKey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NatMappingKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "NatMappingKey"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unassigned");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Unassigned"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
