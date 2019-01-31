/**
 * SubscriberServices_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sandvine.subscriberservices.ws;

public class SubscriberServices_ServiceLocator extends org.apache.axis.client.Service implements com.sandvine.subscriberservices.ws.SubscriberServices_Service {

    public SubscriberServices_ServiceLocator() {
    }


    public SubscriberServices_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SubscriberServices_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for SubscriberServicesPort
    private java.lang.String SubscriberServicesPort_address = "http://10.121.237.25:8081/SubscriberServices/SubscriberServices";

    public java.lang.String getSubscriberServicesPortAddress() {
        return SubscriberServicesPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SubscriberServicesPortWSDDServiceName = "SubscriberServicesPort";

    public java.lang.String getSubscriberServicesPortWSDDServiceName() {
        return SubscriberServicesPortWSDDServiceName;
    }

    public void setSubscriberServicesPortWSDDServiceName(java.lang.String name) {
        SubscriberServicesPortWSDDServiceName = name;
    }

    public com.sandvine.subscriberservices.ws.SubscriberServices_PortType getSubscriberServicesPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SubscriberServicesPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSubscriberServicesPort(endpoint);
    }

    public com.sandvine.subscriberservices.ws.SubscriberServices_PortType getSubscriberServicesPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.sandvine.subscriberservices.ws.SubscriberServicesPortBindingStub _stub = new com.sandvine.subscriberservices.ws.SubscriberServicesPortBindingStub(portAddress, this);
            _stub.setPortName(getSubscriberServicesPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSubscriberServicesPortEndpointAddress(java.lang.String address) {
        SubscriberServicesPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.sandvine.subscriberservices.ws.SubscriberServices_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.sandvine.subscriberservices.ws.SubscriberServicesPortBindingStub _stub = new com.sandvine.subscriberservices.ws.SubscriberServicesPortBindingStub(new java.net.URL(SubscriberServicesPort_address), this);
                _stub.setPortName(getSubscriberServicesPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("SubscriberServicesPort".equals(inputPortName)) {
            return getSubscriberServicesPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com/", "SubscriberServices");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com/", "SubscriberServicesPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("SubscriberServicesPort".equals(portName)) {
            setSubscriberServicesPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
