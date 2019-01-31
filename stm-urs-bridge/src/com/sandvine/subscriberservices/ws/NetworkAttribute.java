/**
 * NetworkAttribute.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sandvine.subscriberservices.ws;

public class NetworkAttribute  implements java.io.Serializable {
    private com.sandvine.subscriberservices.ws.Network network;

    private com.sandvine.subscriberservices.ws.NetworkAttributeDefinition networkAttributeDefinition;

    private java.lang.String name;

    private java.lang.String value;

    private java.util.Calendar effective;

    private java.util.Calendar expiry;

    public NetworkAttribute() {
    }

    public NetworkAttribute(
           com.sandvine.subscriberservices.ws.Network network,
           com.sandvine.subscriberservices.ws.NetworkAttributeDefinition networkAttributeDefinition,
           java.lang.String name,
           java.lang.String value,
           java.util.Calendar effective,
           java.util.Calendar expiry) {
           this.network = network;
           this.networkAttributeDefinition = networkAttributeDefinition;
           this.name = name;
           this.value = value;
           this.effective = effective;
           this.expiry = expiry;
    }


    /**
     * Gets the network value for this NetworkAttribute.
     * 
     * @return network
     */
    public com.sandvine.subscriberservices.ws.Network getNetwork() {
        return network;
    }


    /**
     * Sets the network value for this NetworkAttribute.
     * 
     * @param network
     */
    public void setNetwork(com.sandvine.subscriberservices.ws.Network network) {
        this.network = network;
    }


    /**
     * Gets the networkAttributeDefinition value for this NetworkAttribute.
     * 
     * @return networkAttributeDefinition
     */
    public com.sandvine.subscriberservices.ws.NetworkAttributeDefinition getNetworkAttributeDefinition() {
        return networkAttributeDefinition;
    }


    /**
     * Sets the networkAttributeDefinition value for this NetworkAttribute.
     * 
     * @param networkAttributeDefinition
     */
    public void setNetworkAttributeDefinition(com.sandvine.subscriberservices.ws.NetworkAttributeDefinition networkAttributeDefinition) {
        this.networkAttributeDefinition = networkAttributeDefinition;
    }


    /**
     * Gets the name value for this NetworkAttribute.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this NetworkAttribute.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the value value for this NetworkAttribute.
     * 
     * @return value
     */
    public java.lang.String getValue() {
        return value;
    }


    /**
     * Sets the value value for this NetworkAttribute.
     * 
     * @param value
     */
    public void setValue(java.lang.String value) {
        this.value = value;
    }


    /**
     * Gets the effective value for this NetworkAttribute.
     * 
     * @return effective
     */
    public java.util.Calendar getEffective() {
        return effective;
    }


    /**
     * Sets the effective value for this NetworkAttribute.
     * 
     * @param effective
     */
    public void setEffective(java.util.Calendar effective) {
        this.effective = effective;
    }


    /**
     * Gets the expiry value for this NetworkAttribute.
     * 
     * @return expiry
     */
    public java.util.Calendar getExpiry() {
        return expiry;
    }


    /**
     * Sets the expiry value for this NetworkAttribute.
     * 
     * @param expiry
     */
    public void setExpiry(java.util.Calendar expiry) {
        this.expiry = expiry;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NetworkAttribute)) return false;
        NetworkAttribute other = (NetworkAttribute) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.network==null && other.getNetwork()==null) || 
             (this.network!=null &&
              this.network.equals(other.getNetwork()))) &&
            ((this.networkAttributeDefinition==null && other.getNetworkAttributeDefinition()==null) || 
             (this.networkAttributeDefinition!=null &&
              this.networkAttributeDefinition.equals(other.getNetworkAttributeDefinition()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.value==null && other.getValue()==null) || 
             (this.value!=null &&
              this.value.equals(other.getValue()))) &&
            ((this.effective==null && other.getEffective()==null) || 
             (this.effective!=null &&
              this.effective.equals(other.getEffective()))) &&
            ((this.expiry==null && other.getExpiry()==null) || 
             (this.expiry!=null &&
              this.expiry.equals(other.getExpiry())));
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
        if (getNetwork() != null) {
            _hashCode += getNetwork().hashCode();
        }
        if (getNetworkAttributeDefinition() != null) {
            _hashCode += getNetworkAttributeDefinition().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getValue() != null) {
            _hashCode += getValue().hashCode();
        }
        if (getEffective() != null) {
            _hashCode += getEffective().hashCode();
        }
        if (getExpiry() != null) {
            _hashCode += getExpiry().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NetworkAttribute.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "NetworkAttribute"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("network");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Network"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "Network"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("networkAttributeDefinition");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NetworkAttributeDefinition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "NetworkAttributeDefinition"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("effective");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Effective"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expiry");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Expiry"));
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
