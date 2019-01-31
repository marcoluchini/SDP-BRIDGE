/**
 * SubscribersWithAttributeCountResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sandvine.subscriberservices.ws;

public class SubscribersWithAttributeCountResponse  extends com.sandvine.subscriberservices.ws.DelegateServiceResponse  implements java.io.Serializable {
    private com.sandvine.subscriberservices.ws.AttributeValueCount[] attributeValueCounts;

    public SubscribersWithAttributeCountResponse() {
    }

    public SubscribersWithAttributeCountResponse(
           com.sandvine.subscriberservices.ws.Result result,
           com.sandvine.subscriberservices.ws.Error[] errors,
           long requestProcessingTime,
           com.sandvine.subscriberservices.ws.DelegationSummary delegationSummary,
           com.sandvine.subscriberservices.ws.AttributeValueCount[] attributeValueCounts) {
        super(
            result,
            errors,
            requestProcessingTime,
            delegationSummary);
        this.attributeValueCounts = attributeValueCounts;
    }


    /**
     * Gets the attributeValueCounts value for this SubscribersWithAttributeCountResponse.
     * 
     * @return attributeValueCounts
     */
    public com.sandvine.subscriberservices.ws.AttributeValueCount[] getAttributeValueCounts() {
        return attributeValueCounts;
    }


    /**
     * Sets the attributeValueCounts value for this SubscribersWithAttributeCountResponse.
     * 
     * @param attributeValueCounts
     */
    public void setAttributeValueCounts(com.sandvine.subscriberservices.ws.AttributeValueCount[] attributeValueCounts) {
        this.attributeValueCounts = attributeValueCounts;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SubscribersWithAttributeCountResponse)) return false;
        SubscribersWithAttributeCountResponse other = (SubscribersWithAttributeCountResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.attributeValueCounts==null && other.getAttributeValueCounts()==null) || 
             (this.attributeValueCounts!=null &&
              java.util.Arrays.equals(this.attributeValueCounts, other.getAttributeValueCounts())));
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
        if (getAttributeValueCounts() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAttributeValueCounts());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAttributeValueCounts(), i);
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
        new org.apache.axis.description.TypeDesc(SubscribersWithAttributeCountResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "SubscribersWithAttributeCountResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attributeValueCounts");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AttributeValueCounts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "AttributeValueCount"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "AttributeValueCount"));
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
