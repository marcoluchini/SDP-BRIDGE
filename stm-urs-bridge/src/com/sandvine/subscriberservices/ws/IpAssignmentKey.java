/**
 * IpAssignmentKey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sandvine.subscriberservices.ws;

public class IpAssignmentKey  extends com.sandvine.subscriberservices.ws.GloballyUniquePrincipalEntityMoKey  implements java.io.Serializable {
    private java.util.Calendar assigned;

    private com.sandvine.subscriberservices.ws.IpEndpoint ipEndpoint;

    public IpAssignmentKey() {
    }

    public IpAssignmentKey(
           java.lang.String id,
           java.util.Calendar assigned,
           com.sandvine.subscriberservices.ws.IpEndpoint ipEndpoint) {
        super(
            id);
        this.assigned = assigned;
        this.ipEndpoint = ipEndpoint;
    }


    /**
     * Gets the assigned value for this IpAssignmentKey.
     * 
     * @return assigned
     */
    public java.util.Calendar getAssigned() {
        return assigned;
    }


    /**
     * Sets the assigned value for this IpAssignmentKey.
     * 
     * @param assigned
     */
    public void setAssigned(java.util.Calendar assigned) {
        this.assigned = assigned;
    }


    /**
     * Gets the ipEndpoint value for this IpAssignmentKey.
     * 
     * @return ipEndpoint
     */
    public com.sandvine.subscriberservices.ws.IpEndpoint getIpEndpoint() {
        return ipEndpoint;
    }


    /**
     * Sets the ipEndpoint value for this IpAssignmentKey.
     * 
     * @param ipEndpoint
     */
    public void setIpEndpoint(com.sandvine.subscriberservices.ws.IpEndpoint ipEndpoint) {
        this.ipEndpoint = ipEndpoint;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IpAssignmentKey)) return false;
        IpAssignmentKey other = (IpAssignmentKey) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.assigned==null && other.getAssigned()==null) || 
             (this.assigned!=null &&
              this.assigned.equals(other.getAssigned()))) &&
            ((this.ipEndpoint==null && other.getIpEndpoint()==null) || 
             (this.ipEndpoint!=null &&
              this.ipEndpoint.equals(other.getIpEndpoint())));
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
        if (getAssigned() != null) {
            _hashCode += getAssigned().hashCode();
        }
        if (getIpEndpoint() != null) {
            _hashCode += getIpEndpoint().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IpAssignmentKey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "IpAssignmentKey"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assigned");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Assigned"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipEndpoint");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IpEndpoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "IpEndpoint"));
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
