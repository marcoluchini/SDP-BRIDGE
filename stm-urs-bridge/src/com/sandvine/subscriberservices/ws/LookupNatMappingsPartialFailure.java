/**
 * LookupNatMappingsPartialFailure.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sandvine.subscriberservices.ws;

public class LookupNatMappingsPartialFailure  extends com.sandvine.subscriberservices.ws.PartialFailure  implements java.io.Serializable {
    private com.sandvine.subscriberservices.ws.NatMappingKey m_natMappingKey;

    public LookupNatMappingsPartialFailure() {
    }

    public LookupNatMappingsPartialFailure(
           java.lang.String code,
           java.lang.String message,
           com.sandvine.subscriberservices.ws.NatMappingKey m_natMappingKey) {
        super(
            code,
            message);
        this.m_natMappingKey = m_natMappingKey;
    }


    /**
     * Gets the m_natMappingKey value for this LookupNatMappingsPartialFailure.
     * 
     * @return m_natMappingKey
     */
    public com.sandvine.subscriberservices.ws.NatMappingKey getM_natMappingKey() {
        return m_natMappingKey;
    }


    /**
     * Sets the m_natMappingKey value for this LookupNatMappingsPartialFailure.
     * 
     * @param m_natMappingKey
     */
    public void setM_natMappingKey(com.sandvine.subscriberservices.ws.NatMappingKey m_natMappingKey) {
        this.m_natMappingKey = m_natMappingKey;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LookupNatMappingsPartialFailure)) return false;
        LookupNatMappingsPartialFailure other = (LookupNatMappingsPartialFailure) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.m_natMappingKey==null && other.getM_natMappingKey()==null) || 
             (this.m_natMappingKey!=null &&
              this.m_natMappingKey.equals(other.getM_natMappingKey())));
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
        if (getM_natMappingKey() != null) {
            _hashCode += getM_natMappingKey().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LookupNatMappingsPartialFailure.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "LookupNatMappingsPartialFailure"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("m_natMappingKey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "m_natMappingKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "NatMappingKey"));
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
