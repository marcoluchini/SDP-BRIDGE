/**
 * NetworkElementCluster.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sandvine.subscriberservices.ws;

public class NetworkElementCluster  implements java.io.Serializable {
    private com.sandvine.subscriberservices.ws.NetworkElementClusterKey key;

    private java.lang.String name;

    private java.lang.String displayName;

    private java.lang.String description;

    private java.lang.String status;

    private com.sandvine.subscriberservices.ws.NetworkElement[] networkElements;

    private com.sandvine.subscriberservices.ws.Network[] managedNetworks;

    public NetworkElementCluster() {
    }

    public NetworkElementCluster(
           com.sandvine.subscriberservices.ws.NetworkElementClusterKey key,
           java.lang.String name,
           java.lang.String displayName,
           java.lang.String description,
           java.lang.String status,
           com.sandvine.subscriberservices.ws.NetworkElement[] networkElements,
           com.sandvine.subscriberservices.ws.Network[] managedNetworks) {
           this.key = key;
           this.name = name;
           this.displayName = displayName;
           this.description = description;
           this.status = status;
           this.networkElements = networkElements;
           this.managedNetworks = managedNetworks;
    }


    /**
     * Gets the key value for this NetworkElementCluster.
     * 
     * @return key
     */
    public com.sandvine.subscriberservices.ws.NetworkElementClusterKey getKey() {
        return key;
    }


    /**
     * Sets the key value for this NetworkElementCluster.
     * 
     * @param key
     */
    public void setKey(com.sandvine.subscriberservices.ws.NetworkElementClusterKey key) {
        this.key = key;
    }


    /**
     * Gets the name value for this NetworkElementCluster.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this NetworkElementCluster.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the displayName value for this NetworkElementCluster.
     * 
     * @return displayName
     */
    public java.lang.String getDisplayName() {
        return displayName;
    }


    /**
     * Sets the displayName value for this NetworkElementCluster.
     * 
     * @param displayName
     */
    public void setDisplayName(java.lang.String displayName) {
        this.displayName = displayName;
    }


    /**
     * Gets the description value for this NetworkElementCluster.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this NetworkElementCluster.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the status value for this NetworkElementCluster.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this NetworkElementCluster.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the networkElements value for this NetworkElementCluster.
     * 
     * @return networkElements
     */
    public com.sandvine.subscriberservices.ws.NetworkElement[] getNetworkElements() {
        return networkElements;
    }


    /**
     * Sets the networkElements value for this NetworkElementCluster.
     * 
     * @param networkElements
     */
    public void setNetworkElements(com.sandvine.subscriberservices.ws.NetworkElement[] networkElements) {
        this.networkElements = networkElements;
    }


    /**
     * Gets the managedNetworks value for this NetworkElementCluster.
     * 
     * @return managedNetworks
     */
    public com.sandvine.subscriberservices.ws.Network[] getManagedNetworks() {
        return managedNetworks;
    }


    /**
     * Sets the managedNetworks value for this NetworkElementCluster.
     * 
     * @param managedNetworks
     */
    public void setManagedNetworks(com.sandvine.subscriberservices.ws.Network[] managedNetworks) {
        this.managedNetworks = managedNetworks;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NetworkElementCluster)) return false;
        NetworkElementCluster other = (NetworkElementCluster) obj;
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
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.displayName==null && other.getDisplayName()==null) || 
             (this.displayName!=null &&
              this.displayName.equals(other.getDisplayName()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.networkElements==null && other.getNetworkElements()==null) || 
             (this.networkElements!=null &&
              java.util.Arrays.equals(this.networkElements, other.getNetworkElements()))) &&
            ((this.managedNetworks==null && other.getManagedNetworks()==null) || 
             (this.managedNetworks!=null &&
              java.util.Arrays.equals(this.managedNetworks, other.getManagedNetworks())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getDisplayName() != null) {
            _hashCode += getDisplayName().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getNetworkElements() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNetworkElements());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNetworkElements(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getManagedNetworks() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getManagedNetworks());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getManagedNetworks(), i);
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
        new org.apache.axis.description.TypeDesc(NetworkElementCluster.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "NetworkElementCluster"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("key");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Key"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "NetworkElementClusterKey"));
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
        elemField.setFieldName("displayName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DisplayName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("networkElements");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NetworkElements"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "NetworkElement"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "NetworkElement"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("managedNetworks");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ManagedNetworks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "Network"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "Network"));
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
