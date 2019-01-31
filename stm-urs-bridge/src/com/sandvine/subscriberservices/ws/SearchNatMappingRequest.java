/**
 * SearchNatMappingRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sandvine.subscriberservices.ws;

public class SearchNatMappingRequest  extends com.sandvine.subscriberservices.ws.Request  implements java.io.Serializable {
    private com.sandvine.subscriberservices.ws.NatRecord[] natRecords;

    private java.util.Calendar pointInTime;

    private java.lang.String[] responseGroups;

    public SearchNatMappingRequest() {
    }

    public SearchNatMappingRequest(
           java.lang.Boolean debug,
           com.sandvine.subscriberservices.ws.NatRecord[] natRecords,
           java.util.Calendar pointInTime,
           java.lang.String[] responseGroups) {
        super(
            debug);
        this.natRecords = natRecords;
        this.pointInTime = pointInTime;
        this.responseGroups = responseGroups;
    }


    /**
     * Gets the natRecords value for this SearchNatMappingRequest.
     * 
     * @return natRecords
     */
    public com.sandvine.subscriberservices.ws.NatRecord[] getNatRecords() {
        return natRecords;
    }


    /**
     * Sets the natRecords value for this SearchNatMappingRequest.
     * 
     * @param natRecords
     */
    public void setNatRecords(com.sandvine.subscriberservices.ws.NatRecord[] natRecords) {
        this.natRecords = natRecords;
    }


    /**
     * Gets the pointInTime value for this SearchNatMappingRequest.
     * 
     * @return pointInTime
     */
    public java.util.Calendar getPointInTime() {
        return pointInTime;
    }


    /**
     * Sets the pointInTime value for this SearchNatMappingRequest.
     * 
     * @param pointInTime
     */
    public void setPointInTime(java.util.Calendar pointInTime) {
        this.pointInTime = pointInTime;
    }


    /**
     * Gets the responseGroups value for this SearchNatMappingRequest.
     * 
     * @return responseGroups
     */
    public java.lang.String[] getResponseGroups() {
        return responseGroups;
    }


    /**
     * Sets the responseGroups value for this SearchNatMappingRequest.
     * 
     * @param responseGroups
     */
    public void setResponseGroups(java.lang.String[] responseGroups) {
        this.responseGroups = responseGroups;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SearchNatMappingRequest)) return false;
        SearchNatMappingRequest other = (SearchNatMappingRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.natRecords==null && other.getNatRecords()==null) || 
             (this.natRecords!=null &&
              java.util.Arrays.equals(this.natRecords, other.getNatRecords()))) &&
            ((this.pointInTime==null && other.getPointInTime()==null) || 
             (this.pointInTime!=null &&
              this.pointInTime.equals(other.getPointInTime()))) &&
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
        if (getNatRecords() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNatRecords());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNatRecords(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPointInTime() != null) {
            _hashCode += getPointInTime().hashCode();
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
        new org.apache.axis.description.TypeDesc(SearchNatMappingRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "SearchNatMappingRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("natRecords");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NatRecords"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "NatRecord"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "NatRecord"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pointInTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PointInTime"));
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
