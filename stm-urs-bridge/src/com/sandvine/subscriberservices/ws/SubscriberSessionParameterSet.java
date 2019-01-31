/**
 * SubscriberSessionParameterSet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sandvine.subscriberservices.ws;

public class SubscriberSessionParameterSet  implements java.io.Serializable {
    private com.sandvine.subscriberservices.ws.IpEndpoint ipEndpoint;

    private java.util.Calendar assigned;

    private com.sandvine.subscriberservices.ws.SubscriberAttributeParameterSet[] sessionAttributeParameterSets;

    public SubscriberSessionParameterSet() {
    }

    public SubscriberSessionParameterSet(
           com.sandvine.subscriberservices.ws.IpEndpoint ipEndpoint,
           java.util.Calendar assigned,
           com.sandvine.subscriberservices.ws.SubscriberAttributeParameterSet[] sessionAttributeParameterSets) {
           this.ipEndpoint = ipEndpoint;
           this.assigned = assigned;
           this.sessionAttributeParameterSets = sessionAttributeParameterSets;
    }


    /**
     * Gets the ipEndpoint value for this SubscriberSessionParameterSet.
     * 
     * @return ipEndpoint
     */
    public com.sandvine.subscriberservices.ws.IpEndpoint getIpEndpoint() {
        return ipEndpoint;
    }


    /**
     * Sets the ipEndpoint value for this SubscriberSessionParameterSet.
     * 
     * @param ipEndpoint
     */
    public void setIpEndpoint(com.sandvine.subscriberservices.ws.IpEndpoint ipEndpoint) {
        this.ipEndpoint = ipEndpoint;
    }


    /**
     * Gets the assigned value for this SubscriberSessionParameterSet.
     * 
     * @return assigned
     */
    public java.util.Calendar getAssigned() {
        return assigned;
    }


    /**
     * Sets the assigned value for this SubscriberSessionParameterSet.
     * 
     * @param assigned
     */
    public void setAssigned(java.util.Calendar assigned) {
        this.assigned = assigned;
    }


    /**
     * Gets the sessionAttributeParameterSets value for this SubscriberSessionParameterSet.
     * 
     * @return sessionAttributeParameterSets
     */
    public com.sandvine.subscriberservices.ws.SubscriberAttributeParameterSet[] getSessionAttributeParameterSets() {
        return sessionAttributeParameterSets;
    }


    /**
     * Sets the sessionAttributeParameterSets value for this SubscriberSessionParameterSet.
     * 
     * @param sessionAttributeParameterSets
     */
    public void setSessionAttributeParameterSets(com.sandvine.subscriberservices.ws.SubscriberAttributeParameterSet[] sessionAttributeParameterSets) {
        this.sessionAttributeParameterSets = sessionAttributeParameterSets;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SubscriberSessionParameterSet)) return false;
        SubscriberSessionParameterSet other = (SubscriberSessionParameterSet) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ipEndpoint==null && other.getIpEndpoint()==null) || 
             (this.ipEndpoint!=null &&
              this.ipEndpoint.equals(other.getIpEndpoint()))) &&
            ((this.assigned==null && other.getAssigned()==null) || 
             (this.assigned!=null &&
              this.assigned.equals(other.getAssigned()))) &&
            ((this.sessionAttributeParameterSets==null && other.getSessionAttributeParameterSets()==null) || 
             (this.sessionAttributeParameterSets!=null &&
              java.util.Arrays.equals(this.sessionAttributeParameterSets, other.getSessionAttributeParameterSets())));
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
        if (getIpEndpoint() != null) {
            _hashCode += getIpEndpoint().hashCode();
        }
        if (getAssigned() != null) {
            _hashCode += getAssigned().hashCode();
        }
        if (getSessionAttributeParameterSets() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSessionAttributeParameterSets());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSessionAttributeParameterSets(), i);
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
        new org.apache.axis.description.TypeDesc(SubscriberSessionParameterSet.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "SubscriberSessionParameterSet"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipEndpoint");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IpEndpoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "IpEndpoint"));
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
        elemField.setFieldName("sessionAttributeParameterSets");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SessionAttributeParameterSets"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "SubscriberAttributeParameterSet"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "SessionAttributeParameterSet"));
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
