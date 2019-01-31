/**
 * DeleteNatMappingRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sandvine.subscriberservices.ws;

public class DeleteNatMappingRequest  extends com.sandvine.subscriberservices.ws.Request  implements java.io.Serializable {
    private com.sandvine.subscriberservices.ws.NatMappingKey natMappingKey;

    private java.util.Calendar unassigned;

    private java.lang.String[] responseGroups;

    public DeleteNatMappingRequest() {
    }

    public DeleteNatMappingRequest(
           java.lang.Boolean debug,
           com.sandvine.subscriberservices.ws.NatMappingKey natMappingKey,
           java.util.Calendar unassigned,
           java.lang.String[] responseGroups) {
        super(
            debug);
        this.natMappingKey = natMappingKey;
        this.unassigned = unassigned;
        this.responseGroups = responseGroups;
    }


    /**
     * Gets the natMappingKey value for this DeleteNatMappingRequest.
     * 
     * @return natMappingKey
     */
    public com.sandvine.subscriberservices.ws.NatMappingKey getNatMappingKey() {
        return natMappingKey;
    }


    /**
     * Sets the natMappingKey value for this DeleteNatMappingRequest.
     * 
     * @param natMappingKey
     */
    public void setNatMappingKey(com.sandvine.subscriberservices.ws.NatMappingKey natMappingKey) {
        this.natMappingKey = natMappingKey;
    }


    /**
     * Gets the unassigned value for this DeleteNatMappingRequest.
     * 
     * @return unassigned
     */
    public java.util.Calendar getUnassigned() {
        return unassigned;
    }


    /**
     * Sets the unassigned value for this DeleteNatMappingRequest.
     * 
     * @param unassigned
     */
    public void setUnassigned(java.util.Calendar unassigned) {
        this.unassigned = unassigned;
    }


    /**
     * Gets the responseGroups value for this DeleteNatMappingRequest.
     * 
     * @return responseGroups
     */
    public java.lang.String[] getResponseGroups() {
        return responseGroups;
    }


    /**
     * Sets the responseGroups value for this DeleteNatMappingRequest.
     * 
     * @param responseGroups
     */
    public void setResponseGroups(java.lang.String[] responseGroups) {
        this.responseGroups = responseGroups;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DeleteNatMappingRequest)) return false;
        DeleteNatMappingRequest other = (DeleteNatMappingRequest) obj;
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
              this.natMappingKey.equals(other.getNatMappingKey()))) &&
            ((this.unassigned==null && other.getUnassigned()==null) || 
             (this.unassigned!=null &&
              this.unassigned.equals(other.getUnassigned()))) &&
            ((this.responseGroups==null && other.getResponseGroups()==null) || 
             (this.responseGroups!=null &&
              java.util.Arrays.equals(this.responseGroups, other.getResponseGroups())));
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
        if (getUnassigned() != null) {
            _hashCode += getUnassigned().hashCode();
        }
        if (getResponseGroups() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getResponseGroups());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getResponseGroups(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DeleteNatMappingRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "DeleteNatMappingRequest"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseGroups");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ResponseGroups"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "ResponseGroup"));
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
