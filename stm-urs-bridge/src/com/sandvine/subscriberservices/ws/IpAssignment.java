/**
 * IpAssignment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sandvine.subscriberservices.ws;

public class IpAssignment  implements java.io.Serializable {
    private com.sandvine.subscriberservices.ws.IpAssignmentKey key;

    private java.util.Calendar assigned;

    private java.util.Calendar unassigned;

    private com.sandvine.subscriberservices.ws.IpEndpoint ipEndpoint;

    private com.sandvine.subscriberservices.ws.Subscriber subscriber;

    private com.sandvine.subscriberservices.ws.Network network;

    private com.sandvine.subscriberservices.ws.SessionAttribute[] sessionAttributes;

    private java.lang.String sessionId;

    public IpAssignment() {
    }

    public IpAssignment(
           com.sandvine.subscriberservices.ws.IpAssignmentKey key,
           java.util.Calendar assigned,
           java.util.Calendar unassigned,
           com.sandvine.subscriberservices.ws.IpEndpoint ipEndpoint,
           com.sandvine.subscriberservices.ws.Subscriber subscriber,
           com.sandvine.subscriberservices.ws.Network network,
           com.sandvine.subscriberservices.ws.SessionAttribute[] sessionAttributes,
           java.lang.String sessionId) {
           this.key = key;
           this.assigned = assigned;
           this.unassigned = unassigned;
           this.ipEndpoint = ipEndpoint;
           this.subscriber = subscriber;
           this.network = network;
           this.sessionAttributes = sessionAttributes;
           this.sessionId = sessionId;
    }


    /**
     * Gets the key value for this IpAssignment.
     * 
     * @return key
     */
    public com.sandvine.subscriberservices.ws.IpAssignmentKey getKey() {
        return key;
    }


    /**
     * Sets the key value for this IpAssignment.
     * 
     * @param key
     */
    public void setKey(com.sandvine.subscriberservices.ws.IpAssignmentKey key) {
        this.key = key;
    }


    /**
     * Gets the assigned value for this IpAssignment.
     * 
     * @return assigned
     */
    public java.util.Calendar getAssigned() {
        return assigned;
    }


    /**
     * Sets the assigned value for this IpAssignment.
     * 
     * @param assigned
     */
    public void setAssigned(java.util.Calendar assigned) {
        this.assigned = assigned;
    }


    /**
     * Gets the unassigned value for this IpAssignment.
     * 
     * @return unassigned
     */
    public java.util.Calendar getUnassigned() {
        return unassigned;
    }


    /**
     * Sets the unassigned value for this IpAssignment.
     * 
     * @param unassigned
     */
    public void setUnassigned(java.util.Calendar unassigned) {
        this.unassigned = unassigned;
    }


    /**
     * Gets the ipEndpoint value for this IpAssignment.
     * 
     * @return ipEndpoint
     */
    public com.sandvine.subscriberservices.ws.IpEndpoint getIpEndpoint() {
        return ipEndpoint;
    }


    /**
     * Sets the ipEndpoint value for this IpAssignment.
     * 
     * @param ipEndpoint
     */
    public void setIpEndpoint(com.sandvine.subscriberservices.ws.IpEndpoint ipEndpoint) {
        this.ipEndpoint = ipEndpoint;
    }


    /**
     * Gets the subscriber value for this IpAssignment.
     * 
     * @return subscriber
     */
    public com.sandvine.subscriberservices.ws.Subscriber getSubscriber() {
        return subscriber;
    }


    /**
     * Sets the subscriber value for this IpAssignment.
     * 
     * @param subscriber
     */
    public void setSubscriber(com.sandvine.subscriberservices.ws.Subscriber subscriber) {
        this.subscriber = subscriber;
    }


    /**
     * Gets the network value for this IpAssignment.
     * 
     * @return network
     */
    public com.sandvine.subscriberservices.ws.Network getNetwork() {
        return network;
    }


    /**
     * Sets the network value for this IpAssignment.
     * 
     * @param network
     */
    public void setNetwork(com.sandvine.subscriberservices.ws.Network network) {
        this.network = network;
    }


    /**
     * Gets the sessionAttributes value for this IpAssignment.
     * 
     * @return sessionAttributes
     */
    public com.sandvine.subscriberservices.ws.SessionAttribute[] getSessionAttributes() {
        return sessionAttributes;
    }


    /**
     * Sets the sessionAttributes value for this IpAssignment.
     * 
     * @param sessionAttributes
     */
    public void setSessionAttributes(com.sandvine.subscriberservices.ws.SessionAttribute[] sessionAttributes) {
        this.sessionAttributes = sessionAttributes;
    }


    /**
     * Gets the sessionId value for this IpAssignment.
     * 
     * @return sessionId
     */
    public java.lang.String getSessionId() {
        return sessionId;
    }


    /**
     * Sets the sessionId value for this IpAssignment.
     * 
     * @param sessionId
     */
    public void setSessionId(java.lang.String sessionId) {
        this.sessionId = sessionId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IpAssignment)) return false;
        IpAssignment other = (IpAssignment) obj;
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
            ((this.ipEndpoint==null && other.getIpEndpoint()==null) || 
             (this.ipEndpoint!=null &&
              this.ipEndpoint.equals(other.getIpEndpoint()))) &&
            ((this.subscriber==null && other.getSubscriber()==null) || 
             (this.subscriber!=null &&
              this.subscriber.equals(other.getSubscriber()))) &&
            ((this.network==null && other.getNetwork()==null) || 
             (this.network!=null &&
              this.network.equals(other.getNetwork()))) &&
            ((this.sessionAttributes==null && other.getSessionAttributes()==null) || 
             (this.sessionAttributes!=null &&
              java.util.Arrays.equals(this.sessionAttributes, other.getSessionAttributes()))) &&
            ((this.sessionId==null && other.getSessionId()==null) || 
             (this.sessionId!=null &&
              this.sessionId.equals(other.getSessionId())));
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
        if (getIpEndpoint() != null) {
            _hashCode += getIpEndpoint().hashCode();
        }
        if (getSubscriber() != null) {
            _hashCode += getSubscriber().hashCode();
        }
        if (getNetwork() != null) {
            _hashCode += getNetwork().hashCode();
        }
        if (getSessionAttributes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSessionAttributes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSessionAttributes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSessionId() != null) {
            _hashCode += getSessionId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IpAssignment.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "IpAssignment"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("key");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Key"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "IpAssignmentKey"));
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
        elemField.setFieldName("ipEndpoint");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IpEndpoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "IpEndpoint"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Subscriber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "Subscriber"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("network");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Network"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "Network"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionAttributes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SessionAttributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "SessionAttribute"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "SessionAttribute"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SessionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
