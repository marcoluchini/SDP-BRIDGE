/**
 * FindSubscriberDataHomesResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sandvine.subscriberservices.ws;

public class FindSubscriberDataHomesResponse  extends com.sandvine.subscriberservices.ws.Response  implements java.io.Serializable {
    private java.lang.String[] dataHomes;

    public FindSubscriberDataHomesResponse() {
    }

    public FindSubscriberDataHomesResponse(
           com.sandvine.subscriberservices.ws.Result result,
           com.sandvine.subscriberservices.ws.Error[] errors,
           long requestProcessingTime,
           com.sandvine.subscriberservices.ws.DelegationSummary delegationSummary,
           java.lang.String[] dataHomes) {
        super(
            result,
            errors,
            requestProcessingTime,
            delegationSummary);
        this.dataHomes = dataHomes;
    }


    /**
     * Gets the dataHomes value for this FindSubscriberDataHomesResponse.
     * 
     * @return dataHomes
     */
    public java.lang.String[] getDataHomes() {
        return dataHomes;
    }


    /**
     * Sets the dataHomes value for this FindSubscriberDataHomesResponse.
     * 
     * @param dataHomes
     */
    public void setDataHomes(java.lang.String[] dataHomes) {
        this.dataHomes = dataHomes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FindSubscriberDataHomesResponse)) return false;
        FindSubscriberDataHomesResponse other = (FindSubscriberDataHomesResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.dataHomes==null && other.getDataHomes()==null) || 
             (this.dataHomes!=null &&
              java.util.Arrays.equals(this.dataHomes, other.getDataHomes())));
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
        if (getDataHomes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDataHomes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDataHomes(), i);
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
        new org.apache.axis.description.TypeDesc(FindSubscriberDataHomesResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "FindSubscriberDataHomesResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataHomes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DataHomes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "DataHome"));
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
