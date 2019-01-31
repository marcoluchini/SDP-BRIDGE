/**
 * IpAssignmentsForEndpointsRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sandvine.subscriberservices.ws;

public class IpAssignmentsForEndpointsRequest  extends com.sandvine.subscriberservices.ws.Request  implements java.io.Serializable {
    private com.sandvine.subscriberservices.ws.IpEndpoint[] ipEndpoints;

    private java.util.Calendar rangeStart;

    private java.util.Calendar rangeEnd;

    private java.lang.String[] responseGroups;

    public IpAssignmentsForEndpointsRequest() {
    }

    public IpAssignmentsForEndpointsRequest(
           java.lang.Boolean debug,
           com.sandvine.subscriberservices.ws.IpEndpoint[] ipEndpoints,
           java.util.Calendar rangeStart,
           java.util.Calendar rangeEnd,
           java.lang.String[] responseGroups) {
        super(
            debug);
        this.ipEndpoints = ipEndpoints;
        this.rangeStart = rangeStart;
        this.rangeEnd = rangeEnd;
        this.responseGroups = responseGroups;
    }


    /**
     * Gets the ipEndpoints value for this IpAssignmentsForEndpointsRequest.
     * 
     * @return ipEndpoints
     */
    public com.sandvine.subscriberservices.ws.IpEndpoint[] getIpEndpoints() {
        return ipEndpoints;
    }


    /**
     * Sets the ipEndpoints value for this IpAssignmentsForEndpointsRequest.
     * 
     * @param ipEndpoints
     */
    public void setIpEndpoints(com.sandvine.subscriberservices.ws.IpEndpoint[] ipEndpoints) {
        this.ipEndpoints = ipEndpoints;
    }


    /**
     * Gets the rangeStart value for this IpAssignmentsForEndpointsRequest.
     * 
     * @return rangeStart
     */
    public java.util.Calendar getRangeStart() {
        return rangeStart;
    }


    /**
     * Sets the rangeStart value for this IpAssignmentsForEndpointsRequest.
     * 
     * @param rangeStart
     */
    public void setRangeStart(java.util.Calendar rangeStart) {
        this.rangeStart = rangeStart;
    }


    /**
     * Gets the rangeEnd value for this IpAssignmentsForEndpointsRequest.
     * 
     * @return rangeEnd
     */
    public java.util.Calendar getRangeEnd() {
        return rangeEnd;
    }


    /**
     * Sets the rangeEnd value for this IpAssignmentsForEndpointsRequest.
     * 
     * @param rangeEnd
     */
    public void setRangeEnd(java.util.Calendar rangeEnd) {
        this.rangeEnd = rangeEnd;
    }


    /**
     * Gets the responseGroups value for this IpAssignmentsForEndpointsRequest.
     * 
     * @return responseGroups
     */
    public java.lang.String[] getResponseGroups() {
        return responseGroups;
    }


    /**
     * Sets the responseGroups value for this IpAssignmentsForEndpointsRequest.
     * 
     * @param responseGroups
     */
    public void setResponseGroups(java.lang.String[] responseGroups) {
        this.responseGroups = responseGroups;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IpAssignmentsForEndpointsRequest)) return false;
        IpAssignmentsForEndpointsRequest other = (IpAssignmentsForEndpointsRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.ipEndpoints==null && other.getIpEndpoints()==null) || 
             (this.ipEndpoints!=null &&
              java.util.Arrays.equals(this.ipEndpoints, other.getIpEndpoints()))) &&
            ((this.rangeStart==null && other.getRangeStart()==null) || 
             (this.rangeStart!=null &&
              this.rangeStart.equals(other.getRangeStart()))) &&
            ((this.rangeEnd==null && other.getRangeEnd()==null) || 
             (this.rangeEnd!=null &&
              this.rangeEnd.equals(other.getRangeEnd()))) &&
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
        if (getIpEndpoints() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIpEndpoints());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIpEndpoints(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRangeStart() != null) {
            _hashCode += getRangeStart().hashCode();
        }
        if (getRangeEnd() != null) {
            _hashCode += getRangeEnd().hashCode();
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
        new org.apache.axis.description.TypeDesc(IpAssignmentsForEndpointsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "IpAssignmentsForEndpointsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipEndpoints");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IpEndpoints"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "IpEndpoint"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "IpEndpoint"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rangeStart");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RangeStart"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rangeEnd");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RangeEnd"));
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
