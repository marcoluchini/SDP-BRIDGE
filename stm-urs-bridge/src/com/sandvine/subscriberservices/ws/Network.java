/**
 * Network.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sandvine.subscriberservices.ws;

public class Network  implements java.io.Serializable {
    private com.sandvine.subscriberservices.ws.NetworkKey key;

    private java.lang.String name;

    private java.lang.String displayName;

    private java.lang.String description;

    private java.lang.String status;

    private com.sandvine.subscriberservices.ws.NetworkElementCluster networkElementCluster;

    private com.sandvine.subscriberservices.ws.Network parentNetwork;

    private com.sandvine.subscriberservices.ws.Network[] childNetworks;

    private com.sandvine.subscriberservices.ws.IpSubnet[] staticIpSubnets;

    private com.sandvine.subscriberservices.ws.NetworkAttribute[] networkAttributes;

    public Network() {
    }

    public Network(
           com.sandvine.subscriberservices.ws.NetworkKey key,
           java.lang.String name,
           java.lang.String displayName,
           java.lang.String description,
           java.lang.String status,
           com.sandvine.subscriberservices.ws.NetworkElementCluster networkElementCluster,
           com.sandvine.subscriberservices.ws.Network parentNetwork,
           com.sandvine.subscriberservices.ws.Network[] childNetworks,
           com.sandvine.subscriberservices.ws.IpSubnet[] staticIpSubnets,
           com.sandvine.subscriberservices.ws.NetworkAttribute[] networkAttributes) {
           this.key = key;
           this.name = name;
           this.displayName = displayName;
           this.description = description;
           this.status = status;
           this.networkElementCluster = networkElementCluster;
           this.parentNetwork = parentNetwork;
           this.childNetworks = childNetworks;
           this.staticIpSubnets = staticIpSubnets;
           this.networkAttributes = networkAttributes;
    }


    /**
     * Gets the key value for this Network.
     * 
     * @return key
     */
    public com.sandvine.subscriberservices.ws.NetworkKey getKey() {
        return key;
    }


    /**
     * Sets the key value for this Network.
     * 
     * @param key
     */
    public void setKey(com.sandvine.subscriberservices.ws.NetworkKey key) {
        this.key = key;
    }


    /**
     * Gets the name value for this Network.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Network.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the displayName value for this Network.
     * 
     * @return displayName
     */
    public java.lang.String getDisplayName() {
        return displayName;
    }


    /**
     * Sets the displayName value for this Network.
     * 
     * @param displayName
     */
    public void setDisplayName(java.lang.String displayName) {
        this.displayName = displayName;
    }


    /**
     * Gets the description value for this Network.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Network.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the status value for this Network.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Network.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the networkElementCluster value for this Network.
     * 
     * @return networkElementCluster
     */
    public com.sandvine.subscriberservices.ws.NetworkElementCluster getNetworkElementCluster() {
        return networkElementCluster;
    }


    /**
     * Sets the networkElementCluster value for this Network.
     * 
     * @param networkElementCluster
     */
    public void setNetworkElementCluster(com.sandvine.subscriberservices.ws.NetworkElementCluster networkElementCluster) {
        this.networkElementCluster = networkElementCluster;
    }


    /**
     * Gets the parentNetwork value for this Network.
     * 
     * @return parentNetwork
     */
    public com.sandvine.subscriberservices.ws.Network getParentNetwork() {
        return parentNetwork;
    }


    /**
     * Sets the parentNetwork value for this Network.
     * 
     * @param parentNetwork
     */
    public void setParentNetwork(com.sandvine.subscriberservices.ws.Network parentNetwork) {
        this.parentNetwork = parentNetwork;
    }


    /**
     * Gets the childNetworks value for this Network.
     * 
     * @return childNetworks
     */
    public com.sandvine.subscriberservices.ws.Network[] getChildNetworks() {
        return childNetworks;
    }


    /**
     * Sets the childNetworks value for this Network.
     * 
     * @param childNetworks
     */
    public void setChildNetworks(com.sandvine.subscriberservices.ws.Network[] childNetworks) {
        this.childNetworks = childNetworks;
    }


    /**
     * Gets the staticIpSubnets value for this Network.
     * 
     * @return staticIpSubnets
     */
    public com.sandvine.subscriberservices.ws.IpSubnet[] getStaticIpSubnets() {
        return staticIpSubnets;
    }


    /**
     * Sets the staticIpSubnets value for this Network.
     * 
     * @param staticIpSubnets
     */
    public void setStaticIpSubnets(com.sandvine.subscriberservices.ws.IpSubnet[] staticIpSubnets) {
        this.staticIpSubnets = staticIpSubnets;
    }


    /**
     * Gets the networkAttributes value for this Network.
     * 
     * @return networkAttributes
     */
    public com.sandvine.subscriberservices.ws.NetworkAttribute[] getNetworkAttributes() {
        return networkAttributes;
    }


    /**
     * Sets the networkAttributes value for this Network.
     * 
     * @param networkAttributes
     */
    public void setNetworkAttributes(com.sandvine.subscriberservices.ws.NetworkAttribute[] networkAttributes) {
        this.networkAttributes = networkAttributes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Network)) return false;
        Network other = (Network) obj;
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
            ((this.networkElementCluster==null && other.getNetworkElementCluster()==null) || 
             (this.networkElementCluster!=null &&
              this.networkElementCluster.equals(other.getNetworkElementCluster()))) &&
            ((this.parentNetwork==null && other.getParentNetwork()==null) || 
             (this.parentNetwork!=null &&
              this.parentNetwork.equals(other.getParentNetwork()))) &&
            ((this.childNetworks==null && other.getChildNetworks()==null) || 
             (this.childNetworks!=null &&
              java.util.Arrays.equals(this.childNetworks, other.getChildNetworks()))) &&
            ((this.staticIpSubnets==null && other.getStaticIpSubnets()==null) || 
             (this.staticIpSubnets!=null &&
              java.util.Arrays.equals(this.staticIpSubnets, other.getStaticIpSubnets()))) &&
            ((this.networkAttributes==null && other.getNetworkAttributes()==null) || 
             (this.networkAttributes!=null &&
              java.util.Arrays.equals(this.networkAttributes, other.getNetworkAttributes())));
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
        if (getNetworkElementCluster() != null) {
            _hashCode += getNetworkElementCluster().hashCode();
        }
        if (getParentNetwork() != null) {
            _hashCode += getParentNetwork().hashCode();
        }
        if (getChildNetworks() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getChildNetworks());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getChildNetworks(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStaticIpSubnets() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStaticIpSubnets());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStaticIpSubnets(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNetworkAttributes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNetworkAttributes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNetworkAttributes(), i);
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
        new org.apache.axis.description.TypeDesc(Network.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "Network"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("key");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Key"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "NetworkKey"));
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
        elemField.setFieldName("networkElementCluster");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NetworkElementCluster"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "NetworkElementCluster"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentNetwork");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ParentNetwork"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "Network"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("childNetworks");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ChildNetworks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "Network"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "Network"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("staticIpSubnets");
        elemField.setXmlName(new javax.xml.namespace.QName("", "StaticIpSubnets"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "IpSubnet"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "IpSubnet"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("networkAttributes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NetworkAttributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "NetworkAttribute"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "NetworkAttribute"));
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
