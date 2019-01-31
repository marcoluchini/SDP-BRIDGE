/**
 * CreateNatMappingParameterSet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sandvine.subscriberservices.ws;

public class CreateNatMappingParameterSet  implements java.io.Serializable {
    private com.sandvine.subscriberservices.ws.NatRecord natRecord;

    private java.util.Calendar assigned;

    public CreateNatMappingParameterSet() {
    }

    public CreateNatMappingParameterSet(
           com.sandvine.subscriberservices.ws.NatRecord natRecord,
           java.util.Calendar assigned) {
           this.natRecord = natRecord;
           this.assigned = assigned;
    }


    /**
     * Gets the natRecord value for this CreateNatMappingParameterSet.
     * 
     * @return natRecord
     */
    public com.sandvine.subscriberservices.ws.NatRecord getNatRecord() {
        return natRecord;
    }


    /**
     * Sets the natRecord value for this CreateNatMappingParameterSet.
     * 
     * @param natRecord
     */
    public void setNatRecord(com.sandvine.subscriberservices.ws.NatRecord natRecord) {
        this.natRecord = natRecord;
    }


    /**
     * Gets the assigned value for this CreateNatMappingParameterSet.
     * 
     * @return assigned
     */
    public java.util.Calendar getAssigned() {
        return assigned;
    }


    /**
     * Sets the assigned value for this CreateNatMappingParameterSet.
     * 
     * @param assigned
     */
    public void setAssigned(java.util.Calendar assigned) {
        this.assigned = assigned;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreateNatMappingParameterSet)) return false;
        CreateNatMappingParameterSet other = (CreateNatMappingParameterSet) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.natRecord==null && other.getNatRecord()==null) || 
             (this.natRecord!=null &&
              this.natRecord.equals(other.getNatRecord()))) &&
            ((this.assigned==null && other.getAssigned()==null) || 
             (this.assigned!=null &&
              this.assigned.equals(other.getAssigned())));
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
        if (getNatRecord() != null) {
            _hashCode += getNatRecord().hashCode();
        }
        if (getAssigned() != null) {
            _hashCode += getAssigned().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreateNatMappingParameterSet.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "CreateNatMappingParameterSet"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("natRecord");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NatRecord"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "NatRecord"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assigned");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Assigned"));
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
