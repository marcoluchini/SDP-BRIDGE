/**
 * AssignIpsRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sandvine.subscriberservices.ws;

public class AssignIpsRequest  extends com.sandvine.subscriberservices.ws.BulkOperationRequest  implements java.io.Serializable {
    private java.lang.Boolean resultOnly;

    private com.sandvine.subscriberservices.ws.AssignIpParameterSet[] assignIpParameterSets;

    private java.lang.Boolean subscriberAutoCreate;

    private java.lang.Boolean expandCidrAssignments;

    private java.lang.String[] responseGroups;

    public AssignIpsRequest() {
    }

    public AssignIpsRequest(
           java.lang.Boolean debug,
           com.sandvine.subscriberservices.ws.BulkOperationFailureBehaviour bulkOperationFailureBehaviour,
           java.lang.Boolean resultOnly,
           com.sandvine.subscriberservices.ws.AssignIpParameterSet[] assignIpParameterSets,
           java.lang.Boolean subscriberAutoCreate,
           java.lang.Boolean expandCidrAssignments,
           java.lang.String[] responseGroups) {
        super(
            debug,
            bulkOperationFailureBehaviour);
        this.resultOnly = resultOnly;
        this.assignIpParameterSets = assignIpParameterSets;
        this.subscriberAutoCreate = subscriberAutoCreate;
        this.expandCidrAssignments = expandCidrAssignments;
        this.responseGroups = responseGroups;
    }


    /**
     * Gets the resultOnly value for this AssignIpsRequest.
     * 
     * @return resultOnly
     */
    public java.lang.Boolean getResultOnly() {
        return resultOnly;
    }


    /**
     * Sets the resultOnly value for this AssignIpsRequest.
     * 
     * @param resultOnly
     */
    public void setResultOnly(java.lang.Boolean resultOnly) {
        this.resultOnly = resultOnly;
    }


    /**
     * Gets the assignIpParameterSets value for this AssignIpsRequest.
     * 
     * @return assignIpParameterSets
     */
    public com.sandvine.subscriberservices.ws.AssignIpParameterSet[] getAssignIpParameterSets() {
        return assignIpParameterSets;
    }


    /**
     * Sets the assignIpParameterSets value for this AssignIpsRequest.
     * 
     * @param assignIpParameterSets
     */
    public void setAssignIpParameterSets(com.sandvine.subscriberservices.ws.AssignIpParameterSet[] assignIpParameterSets) {
        this.assignIpParameterSets = assignIpParameterSets;
    }


    /**
     * Gets the subscriberAutoCreate value for this AssignIpsRequest.
     * 
     * @return subscriberAutoCreate
     */
    public java.lang.Boolean getSubscriberAutoCreate() {
        return subscriberAutoCreate;
    }


    /**
     * Sets the subscriberAutoCreate value for this AssignIpsRequest.
     * 
     * @param subscriberAutoCreate
     */
    public void setSubscriberAutoCreate(java.lang.Boolean subscriberAutoCreate) {
        this.subscriberAutoCreate = subscriberAutoCreate;
    }


    /**
     * Gets the expandCidrAssignments value for this AssignIpsRequest.
     * 
     * @return expandCidrAssignments
     */
    public java.lang.Boolean getExpandCidrAssignments() {
        return expandCidrAssignments;
    }


    /**
     * Sets the expandCidrAssignments value for this AssignIpsRequest.
     * 
     * @param expandCidrAssignments
     */
    public void setExpandCidrAssignments(java.lang.Boolean expandCidrAssignments) {
        this.expandCidrAssignments = expandCidrAssignments;
    }


    /**
     * Gets the responseGroups value for this AssignIpsRequest.
     * 
     * @return responseGroups
     */
    public java.lang.String[] getResponseGroups() {
        return responseGroups;
    }


    /**
     * Sets the responseGroups value for this AssignIpsRequest.
     * 
     * @param responseGroups
     */
    public void setResponseGroups(java.lang.String[] responseGroups) {
        this.responseGroups = responseGroups;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AssignIpsRequest)) return false;
        AssignIpsRequest other = (AssignIpsRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.resultOnly==null && other.getResultOnly()==null) || 
             (this.resultOnly!=null &&
              this.resultOnly.equals(other.getResultOnly()))) &&
            ((this.assignIpParameterSets==null && other.getAssignIpParameterSets()==null) || 
             (this.assignIpParameterSets!=null &&
              java.util.Arrays.equals(this.assignIpParameterSets, other.getAssignIpParameterSets()))) &&
            ((this.subscriberAutoCreate==null && other.getSubscriberAutoCreate()==null) || 
             (this.subscriberAutoCreate!=null &&
              this.subscriberAutoCreate.equals(other.getSubscriberAutoCreate()))) &&
            ((this.expandCidrAssignments==null && other.getExpandCidrAssignments()==null) || 
             (this.expandCidrAssignments!=null &&
              this.expandCidrAssignments.equals(other.getExpandCidrAssignments()))) &&
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
        if (getResultOnly() != null) {
            _hashCode += getResultOnly().hashCode();
        }
        if (getAssignIpParameterSets() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAssignIpParameterSets());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAssignIpParameterSets(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSubscriberAutoCreate() != null) {
            _hashCode += getSubscriberAutoCreate().hashCode();
        }
        if (getExpandCidrAssignments() != null) {
            _hashCode += getExpandCidrAssignments().hashCode();
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
        new org.apache.axis.description.TypeDesc(AssignIpsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "AssignIpsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultOnly");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ResultOnly"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assignIpParameterSets");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AssignIpParameterSets"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "AssignIpParameterSet"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "AssignIpParameterSet"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriberAutoCreate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SubscriberAutoCreate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expandCidrAssignments");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ExpandCidrAssignments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
