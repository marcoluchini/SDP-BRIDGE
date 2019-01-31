/**
 * DeleteNatMappingsRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sandvine.subscriberservices.ws;

public class DeleteNatMappingsRequest  extends com.sandvine.subscriberservices.ws.BulkOperationRequest  implements java.io.Serializable {
    private com.sandvine.subscriberservices.ws.DeleteNatMappingParameterSet[] deleteNatMappingParameterSets;

    private java.lang.String[] responseGroups;

    private java.lang.Boolean resultOnly;

    public DeleteNatMappingsRequest() {
    }

    public DeleteNatMappingsRequest(
           java.lang.Boolean debug,
           com.sandvine.subscriberservices.ws.BulkOperationFailureBehaviour bulkOperationFailureBehaviour,
           com.sandvine.subscriberservices.ws.DeleteNatMappingParameterSet[] deleteNatMappingParameterSets,
           java.lang.String[] responseGroups,
           java.lang.Boolean resultOnly) {
        super(
            debug,
            bulkOperationFailureBehaviour);
        this.deleteNatMappingParameterSets = deleteNatMappingParameterSets;
        this.responseGroups = responseGroups;
        this.resultOnly = resultOnly;
    }


    /**
     * Gets the deleteNatMappingParameterSets value for this DeleteNatMappingsRequest.
     * 
     * @return deleteNatMappingParameterSets
     */
    public com.sandvine.subscriberservices.ws.DeleteNatMappingParameterSet[] getDeleteNatMappingParameterSets() {
        return deleteNatMappingParameterSets;
    }


    /**
     * Sets the deleteNatMappingParameterSets value for this DeleteNatMappingsRequest.
     * 
     * @param deleteNatMappingParameterSets
     */
    public void setDeleteNatMappingParameterSets(com.sandvine.subscriberservices.ws.DeleteNatMappingParameterSet[] deleteNatMappingParameterSets) {
        this.deleteNatMappingParameterSets = deleteNatMappingParameterSets;
    }


    /**
     * Gets the responseGroups value for this DeleteNatMappingsRequest.
     * 
     * @return responseGroups
     */
    public java.lang.String[] getResponseGroups() {
        return responseGroups;
    }


    /**
     * Sets the responseGroups value for this DeleteNatMappingsRequest.
     * 
     * @param responseGroups
     */
    public void setResponseGroups(java.lang.String[] responseGroups) {
        this.responseGroups = responseGroups;
    }


    /**
     * Gets the resultOnly value for this DeleteNatMappingsRequest.
     * 
     * @return resultOnly
     */
    public java.lang.Boolean getResultOnly() {
        return resultOnly;
    }


    /**
     * Sets the resultOnly value for this DeleteNatMappingsRequest.
     * 
     * @param resultOnly
     */
    public void setResultOnly(java.lang.Boolean resultOnly) {
        this.resultOnly = resultOnly;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DeleteNatMappingsRequest)) return false;
        DeleteNatMappingsRequest other = (DeleteNatMappingsRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.deleteNatMappingParameterSets==null && other.getDeleteNatMappingParameterSets()==null) || 
             (this.deleteNatMappingParameterSets!=null &&
              java.util.Arrays.equals(this.deleteNatMappingParameterSets, other.getDeleteNatMappingParameterSets()))) &&
            ((this.responseGroups==null && other.getResponseGroups()==null) || 
             (this.responseGroups!=null &&
              java.util.Arrays.equals(this.responseGroups, other.getResponseGroups()))) &&
            ((this.resultOnly==null && other.getResultOnly()==null) || 
             (this.resultOnly!=null &&
              this.resultOnly.equals(other.getResultOnly())));
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
        if (getDeleteNatMappingParameterSets() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDeleteNatMappingParameterSets());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDeleteNatMappingParameterSets(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        if (getResultOnly() != null) {
            _hashCode += getResultOnly().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DeleteNatMappingsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "DeleteNatMappingsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deleteNatMappingParameterSets");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DeleteNatMappingParameterSets"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "DeleteNatMappingParameterSet"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "DeleteNatMappingParameterSet"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseGroups");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ResponseGroups"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "ResponseGroup"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultOnly");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ResultOnly"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
