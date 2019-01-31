/**
 * DeleteNatMappingsPartialFailure.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sandvine.subscriberservices.ws;

public class DeleteNatMappingsPartialFailure  extends com.sandvine.subscriberservices.ws.PartialFailure  implements java.io.Serializable {
    private com.sandvine.subscriberservices.ws.NatMappingKey natMappingKey;

    public DeleteNatMappingsPartialFailure() {
    }

    public DeleteNatMappingsPartialFailure(
           java.lang.String code,
           java.lang.String message,
           com.sandvine.subscriberservices.ws.NatMappingKey natMappingKey) {
        super(
            code,
            message);
        this.natMappingKey = natMappingKey;
    }


    /**
     * Gets the natMappingKey value for this DeleteNatMappingsPartialFailure.
     * 
     * @return natMappingKey
     */
    public com.sandvine.subscriberservices.ws.NatMappingKey getNatMappingKey() {
        return natMappingKey;
    }


    /**
     * Sets the natMappingKey value for this DeleteNatMappingsPartialFailure.
     * 
     * @param natMappingKey
     */
    public void setNatMappingKey(com.sandvine.subscriberservices.ws.NatMappingKey natMappingKey) {
        this.natMappingKey = natMappingKey;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DeleteNatMappingsPartialFailure)) return false;
        DeleteNatMappingsPartialFailure other = (DeleteNatMappingsPartialFailure) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.natMappingKey==null && other.getNatMappingKey()==null) || 
             (this.natMappingKey!=null &&
              this.natMappingKey.equals(other.getNatMappingKey())));
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
        if (getNatMappingKey() != null) {
            _hashCode += getNatMappingKey().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DeleteNatMappingsPartialFailure.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "DeleteNatMappingsPartialFailure"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("natMappingKey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NatMappingKey"));
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
