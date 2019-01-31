/**
 * NatMapping.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sandvine.subscriberservices.ws;

public class NatMapping  implements java.io.Serializable {
    private com.sandvine.subscriberservices.ws.NatMappingKey key;

    private java.util.Calendar assigned;

    private java.util.Calendar unassigned;

    private com.sandvine.subscriberservices.ws.NatRecord natRecord;

    public NatMapping() {
    }

    public NatMapping(
           com.sandvine.subscriberservices.ws.NatMappingKey key,
           java.util.Calendar assigned,
           java.util.Calendar unassigned,
           com.sandvine.subscriberservices.ws.NatRecord natRecord) {
           this.key = key;
           this.assigned = assigned;
           this.unassigned = unassigned;
           this.natRecord = natRecord;
    }


    /**
     * Gets the key value for this NatMapping.
     * 
     * @return key
     */
    public com.sandvine.subscriberservices.ws.NatMappingKey getKey() {
        return key;
    }


    /**
     * Sets the key value for this NatMapping.
     * 
     * @param key
     */
    public void setKey(com.sandvine.subscriberservices.ws.NatMappingKey key) {
        this.key = key;
    }


    /**
     * Gets the assigned value for this NatMapping.
     * 
     * @return assigned
     */
    public java.util.Calendar getAssigned() {
        return assigned;
    }


    /**
     * Sets the assigned value for this NatMapping.
     * 
     * @param assigned
     */
    public void setAssigned(java.util.Calendar assigned) {
        this.assigned = assigned;
    }


    /**
     * Gets the unassigned value for this NatMapping.
     * 
     * @return unassigned
     */
    public java.util.Calendar getUnassigned() {
        return unassigned;
    }


    /**
     * Sets the unassigned value for this NatMapping.
     * 
     * @param unassigned
     */
    public void setUnassigned(java.util.Calendar unassigned) {
        this.unassigned = unassigned;
    }


    /**
     * Gets the natRecord value for this NatMapping.
     * 
     * @return natRecord
     */
    public com.sandvine.subscriberservices.ws.NatRecord getNatRecord() {
        return natRecord;
    }


    /**
     * Sets the natRecord value for this NatMapping.
     * 
     * @param natRecord
     */
    public void setNatRecord(com.sandvine.subscriberservices.ws.NatRecord natRecord) {
        this.natRecord = natRecord;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NatMapping)) return false;
        NatMapping other = (NatMapping) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.key==null && other.getKey()==null) || 
             (this.key!=null &&
              this.key.equals(other.getKey()))) &&
            ((this.assigned==null && other.getAssigned()==null) || 
             (this.assigned!=null &&
              this.assigned.equals(other.getAssigned()))) &&
            ((this.unassigned==null && other.getUnassigned()==null) || 
             (this.unassigned!=null &&
              this.unassigned.equals(other.getUnassigned()))) &&
            ((this.natRecord==null && other.getNatRecord()==null) || 
             (this.natRecord!=null &&
              this.natRecord.equals(other.getNatRecord())));
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
        if (getKey() != null) {
            _hashCode += getKey().hashCode();
        }
        if (getAssigned() != null) {
            _hashCode += getAssigned().hashCode();
        }
        if (getUnassigned() != null) {
            _hashCode += getUnassigned().hashCode();
        }
        if (getNatRecord() != null) {
            _hashCode += getNatRecord().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NatMapping.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "NatMapping"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("key");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Key"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "NatMappingKey"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assigned");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Assigned"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("natRecord");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NatRecord"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "NatRecord"));
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
