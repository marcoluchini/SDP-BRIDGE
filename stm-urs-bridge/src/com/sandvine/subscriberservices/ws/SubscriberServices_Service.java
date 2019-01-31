/**
 * SubscriberServices_Service.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sandvine.subscriberservices.ws;

import javax.jws.HandlerChain;

@HandlerChain(file="handler-chain.xml")
public interface SubscriberServices_Service extends javax.xml.rpc.Service {
    public java.lang.String getSubscriberServicesPortAddress();

    public com.sandvine.subscriberservices.ws.SubscriberServices_PortType getSubscriberServicesPort() throws javax.xml.rpc.ServiceException;

    public com.sandvine.subscriberservices.ws.SubscriberServices_PortType getSubscriberServicesPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
