/**
 * SubscriberServicesPortBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sandvine.subscriberservices.ws;

public class SubscriberServicesPortBindingStub extends org.apache.axis.client.Stub implements com.sandvine.subscriberservices.ws.SubscriberServices_PortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[43];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
        _initOperationDesc4();
        _initOperationDesc5();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SearchNatMapping");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "SearchNatMappingRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "SearchNatMappingRequest"), com.sandvine.subscriberservices.ws.SearchNatMappingRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "SearchNatMappingResponse"));
        oper.setReturnClass(com.sandvine.subscriberservices.ws.SearchNatMappingResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "SearchNatMappingResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "WsValidationException"),
                      "com.sandvine.subscriberservices.ws.WsValidationException",
                      new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "WsValidationException"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreateSubscriber");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "CreateSubscriberRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "CreateSubscriberRequest"), com.sandvine.subscriberservices.ws.CreateSubscriberRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "CreateSubscriberResponse"));
        oper.setReturnClass(com.sandvine.subscriberservices.ws.CreateSubscriberResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "CreateSubscriberResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "WsValidationException"),
                      "com.sandvine.subscriberservices.ws.WsValidationException",
                      new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "WsValidationException"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ModifySubscriber");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "ModifySubscriberRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "ModifySubscriberRequest"), com.sandvine.subscriberservices.ws.ModifySubscriberRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "ModifySubscriberResponse"));
        oper.setReturnClass(com.sandvine.subscriberservices.ws.ModifySubscriberResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "ModifySubscriberResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "WsValidationException"),
                      "com.sandvine.subscriberservices.ws.WsValidationException",
                      new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "WsValidationException"), 
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("LookupSubscriber");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "LookupSubscriberRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "LookupSubscriberRequest"), com.sandvine.subscriberservices.ws.LookupSubscriberRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "LookupSubscriberResponse"));
        oper.setReturnClass(com.sandvine.subscriberservices.ws.LookupSubscriberResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "LookupSubscriberResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "WsValidationException"),
                      "com.sandvine.subscriberservices.ws.WsValidationException",
                      new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "WsValidationException"), 
                      true
                     ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("FindSubscriberDataHomes");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "FindSubscriberDataHomesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "FindSubscriberDataHomesRequest"), com.sandvine.subscriberservices.ws.FindSubscriberDataHomesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "FindSubscriberDataHomesResponse"));
        oper.setReturnClass(com.sandvine.subscriberservices.ws.FindSubscriberDataHomesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "FindSubscriberDataHomesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "WsValidationException"),
                      "com.sandvine.subscriberservices.ws.WsValidationException",
                      new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "WsValidationException"), 
                      true
                     ));
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ReconcileIpAddress");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "ReconcileIpAddressRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "ReconcileIpAddressRequest"), com.sandvine.subscriberservices.ws.ReconcileIpAddressRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "ReconcileIpAddressResponse"));
        oper.setReturnClass(com.sandvine.subscriberservices.ws.ReconcileIpAddressResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "ReconcileIpAddressResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "WsValidationException"),
                      "com.sandvine.subscriberservices.ws.WsValidationException",
                      new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "WsValidationException"), 
                      true
                     ));
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeleteSubscriber");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "DeleteSubscriberRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "DeleteSubscriberRequest"), com.sandvine.subscriberservices.ws.DeleteSubscriberRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "DeleteSubscriberResponse"));
        oper.setReturnClass(com.sandvine.subscriberservices.ws.DeleteSubscriberResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "DeleteSubscriberResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "WsValidationException"),
                      "com.sandvine.subscriberservices.ws.WsValidationException",
                      new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "WsValidationException"), 
                      true
                     ));
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeleteSubscribers");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "DeleteSubscribersRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "DeleteSubscribersRequest"), com.sandvine.subscriberservices.ws.DeleteSubscribersRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "DeleteSubscribersResponse"));
        oper.setReturnClass(com.sandvine.subscriberservices.ws.DeleteSubscribersResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "DeleteSubscribersResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "WsValidationException"),
                      "com.sandvine.subscriberservices.ws.WsValidationException",
                      new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "WsValidationException"), 
                      true
                     ));
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SubscriberSearch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "SubscriberSearchRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "SubscriberSearchRequest"), com.sandvine.subscriberservices.ws.SubscriberSearchRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "SubscriberSearchResponse"));
        oper.setReturnClass(com.sandvine.subscriberservices.ws.SubscriberSearchResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "SubscriberSearchResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "WsValidationException"),
                      "com.sandvine.subscriberservices.ws.WsValidationException",
                      new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "WsValidationException"), 
                      true
                     ));
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("LookupSubscribers");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "LookupSubscribersRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "LookupSubscribersRequest"), com.sandvine.subscriberservices.ws.LookupSubscribersRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "LookupSubscribersResponse"));
        oper.setReturnClass(com.sandvine.subscriberservices.ws.LookupSubscribersResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "LookupSubscribersResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "WsValidationException"),
                      "com.sandvine.subscriberservices.ws.WsValidationException",
                      new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "WsValidationException"), 
                      true
                     ));
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreateSubscribers");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "CreateSubscribersRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "CreateSubscribersRequest"), com.sandvine.subscriberservices.ws.CreateSubscribersRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "CreateSubscribersResponse"));
        oper.setReturnClass(com.sandvine.subscriberservices.ws.CreateSubscribersResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "CreateSubscribersResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "WsValidationException"),
                      "com.sandvine.subscriberservices.ws.WsValidationException",
                      new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "WsValidationException"), 
                      true
                     ));
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SubscribersWithAttribute");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "SubscribersWithAttributeRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "SubscribersWithAttributeRequest"), com.sandvine.subscriberservices.ws.SubscribersWithAttributeRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "SubscribersWithAttributeResponse"));
        oper.setReturnClass(com.sandvine.subscriberservices.ws.SubscribersWithAttributeResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "SubscribersWithAttributeResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "WsValidationException"),
                      "com.sandvine.subscriberservices.ws.WsValidationException",
                      new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "WsValidationException"), 
                      true
                     ));
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SubscribersWithAttributeCount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "SubscribersWithAttributeCountRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "SubscribersWithAttributeCountRequest"), com.sandvine.subscriberservices.ws.SubscribersWithAttributeCountRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "SubscribersWithAttributeCountResponse"));
        oper.setReturnClass(com.sandvine.subscriberservices.ws.SubscribersWithAttributeCountResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "SubscribersWithAttributeCountResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "WsValidationException"),
                      "com.sandvine.subscriberservices.ws.WsValidationException",
                      new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "WsValidationException"), 
                      true
                     ));
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("LookupSubscriberRealm");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "LookupSubscriberRealmRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "LookupSubscriberRealmRequest"), com.sandvine.subscriberservices.ws.LookupSubscriberRealmRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "LookupSubscriberRealmResponse"));
        oper.setReturnClass(com.sandvine.subscriberservices.ws.LookupSubscriberRealmResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "LookupSubscriberRealmResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "WsValidationException"),
                      "com.sandvine.subscriberservices.ws.WsValidationException",
                      new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "WsValidationException"), 
                      true
                     ));
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SubscriberRealmSearch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "SubscriberRealmSearchRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "SubscriberRealmSearchRequest"), com.sandvine.subscriberservices.ws.SubscriberRealmSearchRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "SubscriberRealmSearchResponse"));
        oper.setReturnClass(com.sandvine.subscriberservices.ws.SubscriberRealmSearchResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "SubscriberRealmSearchResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "WsValidationException"),
                      "com.sandvine.subscriberservices.ws.WsValidationException",
                      new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "WsValidationException"), 
                      true
                     ));
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("LookupSubscriberAttributeDefinition");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "LookupSubscriberAttributeDefinitionRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "LookupSubscriberAttributeDefinitionRequest"), com.sandvine.subscriberservices.ws.LookupSubscriberAttributeDefinitionRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "LookupSubscriberAttributeDefinitionResponse"));
        oper.setReturnClass(com.sandvine.subscriberservices.ws.LookupSubscriberAttributeDefinitionResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "LookupSubscriberAttributeDefinitionResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "WsValidationException"),
                      "com.sandvine.subscriberservices.ws.WsValidationException",
                      new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "WsValidationException"), 
                      true
                     ));
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SubscriberAttributeDefinitionSearch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "SubscriberAttributeDefinitionSearchRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "SubscriberAttributeDefinitionSearchRequest"), com.sandvine.subscriberservices.ws.SubscriberAttributeDefinitionSearchRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "SubscriberAttributeDefinitionSearchResponse"));
        oper.setReturnClass(com.sandvine.subscriberservices.ws.SubscriberAttributeDefinitionSearchResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "SubscriberAttributeDefinitionSearchResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "WsValidationException"),
                      "com.sandvine.subscriberservices.ws.WsValidationException",
                      new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "WsValidationException"), 
                      true
                     ));
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AttributeAuditSearchBySubscriber");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "AttributeAuditSearchBySubscriberRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "AttributeAuditSearchBySubscriberRequest"), com.sandvine.subscriberservices.ws.AttributeAuditSearchBySubscriberRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "AttributeAuditSearchBySubscriberResponse"));
        oper.setReturnClass(com.sandvine.subscriberservices.ws.AttributeAuditSearchBySubscriberResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "AttributeAuditSearchBySubscriberResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "WsValidationException"),
                      "com.sandvine.subscriberservices.ws.WsValidationException",
                      new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "WsValidationException"), 
                      true
                     ));
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AttributeAuditSearchBySubscribers");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "AttributeAuditSearchBySubscribersRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "AttributeAuditSearchBySubscribersRequest"), com.sandvine.subscriberservices.ws.AttributeAuditSearchBySubscribersRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "AttributeAuditSearchBySubscribersResponse"));
        oper.setReturnClass(com.sandvine.subscriberservices.ws.AttributeAuditSearchBySubscribersResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "AttributeAuditSearchBySubscribersResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "WsValidationException"),
                      "com.sandvine.subscriberservices.ws.WsValidationException",
                      new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "WsValidationException"), 
                      true
                     ));
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SetSubscriberAttributes");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "SetSubscriberAttributesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "SetSubscriberAttributesRequest"), com.sandvine.subscriberservices.ws.SetSubscriberAttributesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "SetSubscriberAttributesResponse"));
        oper.setReturnClass(com.sandvine.subscriberservices.ws.SetSubscriberAttributesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "SetSubscriberAttributesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "WsValidationException"),
                      "com.sandvine.subscriberservices.ws.WsValidationException",
                      new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "WsValidationException"), 
                      true
                     ));
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RemoveSubscriberAttributes");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "RemoveSubscriberAttributesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "RemoveSubscriberAttributesRequest"), com.sandvine.subscriberservices.ws.RemoveSubscriberAttributesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "RemoveSubscriberAttributesResponse"));
        oper.setReturnClass(com.sandvine.subscriberservices.ws.RemoveSubscriberAttributesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "RemoveSubscriberAttributesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "WsValidationException"),
                      "com.sandvine.subscriberservices.ws.WsValidationException",
                      new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "WsValidationException"), 
                      true
                     ));
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SetSessionAttributes");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "SetSessionAttributesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "SetSessionAttributesRequest"), com.sandvine.subscriberservices.ws.SetSessionAttributesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "SetSessionAttributesResponse"));
        oper.setReturnClass(com.sandvine.subscriberservices.ws.SetSessionAttributesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "SetSessionAttributesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "WsValidationException"),
                      "com.sandvine.subscriberservices.ws.WsValidationException",
                      new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "WsValidationException"), 
                      true
                     ));
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AssignIp");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "AssignIpRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "AssignIpRequest"), com.sandvine.subscriberservices.ws.AssignIpRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "AssignIpResponse"));
        oper.setReturnClass(com.sandvine.subscriberservices.ws.AssignIpResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "AssignIpResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "WsValidationException"),
                      "com.sandvine.subscriberservices.ws.WsValidationException",
                      new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "WsValidationException"), 
                      true
                     ));
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UnassignIp");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "UnassignIpRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "UnassignIpRequest"), com.sandvine.subscriberservices.ws.UnassignIpRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "UnassignIpResponse"));
        oper.setReturnClass(com.sandvine.subscriberservices.ws.UnassignIpResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "UnassignIpResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "WsValidationException"),
                      "com.sandvine.subscriberservices.ws.WsValidationException",
                      new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "WsValidationException"), 
                      true
                     ));
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("IpAssignmentSearch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "IpAssignmentSearchRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "IpAssignmentSearchRequest"), com.sandvine.subscriberservices.ws.IpAssignmentSearchRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "IpAssignmentSearchResponse"));
        oper.setReturnClass(com.sandvine.subscriberservices.ws.IpAssignmentSearchResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "IpAssignmentSearchResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "WsValidationException"),
                      "com.sandvine.subscriberservices.ws.WsValidationException",
                      new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "WsValidationException"), 
                      true
                     ));
        _operations[24] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("LookupIpAssignment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "LookupIpAssignmentRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "LookupIpAssignmentRequest"), com.sandvine.subscriberservices.ws.LookupIpAssignmentRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "LookupIpAssignmentResponse"));
        oper.setReturnClass(com.sandvine.subscriberservices.ws.LookupIpAssignmentResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "LookupIpAssignmentResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "WsValidationException"),
                      "com.sandvine.subscriberservices.ws.WsValidationException",
                      new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "WsValidationException"), 
                      true
                     ));
        _operations[25] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AssignIps");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "AssignIpsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "AssignIpsRequest"), com.sandvine.subscriberservices.ws.AssignIpsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "AssignIpsResponse"));
        oper.setReturnClass(com.sandvine.subscriberservices.ws.AssignIpsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "AssignIpsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "WsValidationException"),
                      "com.sandvine.subscriberservices.ws.WsValidationException",
                      new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "WsValidationException"), 
                      true
                     ));
        _operations[26] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UnassignIps");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "UnassignIpsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "UnassignIpsRequest"), com.sandvine.subscriberservices.ws.UnassignIpsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "UnassignIpsResponse"));
        oper.setReturnClass(com.sandvine.subscriberservices.ws.UnassignIpsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "UnassignIpsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "WsValidationException"),
                      "com.sandvine.subscriberservices.ws.WsValidationException",
                      new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "WsValidationException"), 
                      true
                     ));
        _operations[27] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("LookupIpAssignments");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "LookupIpAssignmentsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "LookupIpAssignmentsRequest"), com.sandvine.subscriberservices.ws.LookupIpAssignmentsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "LookupIpAssignmentsResponse"));
        oper.setReturnClass(com.sandvine.subscriberservices.ws.LookupIpAssignmentsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "LookupIpAssignmentsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "WsValidationException"),
                      "com.sandvine.subscriberservices.ws.WsValidationException",
                      new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "WsValidationException"), 
                      true
                     ));
        _operations[28] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("IpAssignmentsForEndpoint");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "IpAssignmentsForEndpointRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "IpAssignmentsForEndpointRequest"), com.sandvine.subscriberservices.ws.IpAssignmentsForEndpointRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "IpAssignmentsForEndpointResponse"));
        oper.setReturnClass(com.sandvine.subscriberservices.ws.IpAssignmentsForEndpointResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "IpAssignmentsForEndpointResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "WsValidationException"),
                      "com.sandvine.subscriberservices.ws.WsValidationException",
                      new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "WsValidationException"), 
                      true
                     ));
        _operations[29] = oper;

    }

    private static void _initOperationDesc4(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("IpAssignmentsForEndpoints");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "IpAssignmentsForEndpointsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "IpAssignmentsForEndpointsRequest"), com.sandvine.subscriberservices.ws.IpAssignmentsForEndpointsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "IpAssignmentsForEndpointsResponse"));
        oper.setReturnClass(com.sandvine.subscriberservices.ws.IpAssignmentsForEndpointsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "IpAssignmentsForEndpointsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "WsValidationException"),
                      "com.sandvine.subscriberservices.ws.WsValidationException",
                      new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "WsValidationException"), 
                      true
                     ));
        _operations[30] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("IpAssignmentsForSubscriber");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "IpAssignmentsForSubscriberRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "IpAssignmentsForSubscriberRequest"), com.sandvine.subscriberservices.ws.IpAssignmentsForSubscriberRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "IpAssignmentsForSubscriberResponse"));
        oper.setReturnClass(com.sandvine.subscriberservices.ws.IpAssignmentsForSubscriberResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "IpAssignmentsForSubscriberResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "WsValidationException"),
                      "com.sandvine.subscriberservices.ws.WsValidationException",
                      new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "WsValidationException"), 
                      true
                     ));
        _operations[31] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("IpAssignmentsForSubscribers");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "IpAssignmentsForSubscribersRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "IpAssignmentsForSubscribersRequest"), com.sandvine.subscriberservices.ws.IpAssignmentsForSubscribersRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "IpAssignmentsForSubscribersResponse"));
        oper.setReturnClass(com.sandvine.subscriberservices.ws.IpAssignmentsForSubscribersResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "IpAssignmentsForSubscribersResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "WsValidationException"),
                      "com.sandvine.subscriberservices.ws.WsValidationException",
                      new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "WsValidationException"), 
                      true
                     ));
        _operations[32] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ProvisionSubscribers");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "ProvisionSubscribersRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "ProvisionSubscribersRequest"), com.sandvine.subscriberservices.ws.ProvisionSubscribersRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "ProvisionSubscribersResponse"));
        oper.setReturnClass(com.sandvine.subscriberservices.ws.ProvisionSubscribersResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "ProvisionSubscribersResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "WsValidationException"),
                      "com.sandvine.subscriberservices.ws.WsValidationException",
                      new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "WsValidationException"), 
                      true
                     ));
        _operations[33] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("LookupSessionQualifierType");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "LookupSessionQualifierTypeRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "LookupSessionQualifierTypeRequest"), com.sandvine.subscriberservices.ws.LookupSessionQualifierTypeRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "LookupSessionQualifierTypeResponse"));
        oper.setReturnClass(com.sandvine.subscriberservices.ws.LookupSessionQualifierTypeResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "LookupSessionQualifierTypeResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "WsValidationException"),
                      "com.sandvine.subscriberservices.ws.WsValidationException",
                      new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "WsValidationException"), 
                      true
                     ));
        _operations[34] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SessionQualifierTypeSearch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "SessionQualifierTypeSearchRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "SessionQualifierTypeSearchRequest"), com.sandvine.subscriberservices.ws.SessionQualifierTypeSearchRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "SessionQualifierTypeSearchResponse"));
        oper.setReturnClass(com.sandvine.subscriberservices.ws.SessionQualifierTypeSearchResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "SessionQualifierTypeSearchResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "WsValidationException"),
                      "com.sandvine.subscriberservices.ws.WsValidationException",
                      new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "WsValidationException"), 
                      true
                     ));
        _operations[35] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("IpAssignmentsForIpAddresses");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "IpAssignmentsForIpAddressesRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "IpAssignmentsForIpAddressesRequest"), com.sandvine.subscriberservices.ws.IpAssignmentsForIpAddressesRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "IpAssignmentsForIpAddressesResponse"));
        oper.setReturnClass(com.sandvine.subscriberservices.ws.IpAssignmentsForIpAddressesResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "IpAssignmentsForIpAddressesResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "WsValidationException"),
                      "com.sandvine.subscriberservices.ws.WsValidationException",
                      new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "WsValidationException"), 
                      true
                     ));
        _operations[36] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreateNatMapping");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "CreateNatMappingRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "CreateNatMappingRequest"), com.sandvine.subscriberservices.ws.CreateNatMappingRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "CreateNatMappingResponse"));
        oper.setReturnClass(com.sandvine.subscriberservices.ws.CreateNatMappingResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "CreateNatMappingResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "WsValidationException"),
                      "com.sandvine.subscriberservices.ws.WsValidationException",
                      new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "WsValidationException"), 
                      true
                     ));
        _operations[37] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreateNatMappings");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "CreateNatMappingsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "CreateNatMappingsRequest"), com.sandvine.subscriberservices.ws.CreateNatMappingsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "CreateNatMappingsResponse"));
        oper.setReturnClass(com.sandvine.subscriberservices.ws.CreateNatMappingsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "CreateNatMappingsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "WsValidationException"),
                      "com.sandvine.subscriberservices.ws.WsValidationException",
                      new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "WsValidationException"), 
                      true
                     ));
        _operations[38] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeleteNatMapping");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "DeleteNatMappingRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "DeleteNatMappingRequest"), com.sandvine.subscriberservices.ws.DeleteNatMappingRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "DeleteNatMappingResponse"));
        oper.setReturnClass(com.sandvine.subscriberservices.ws.DeleteNatMappingResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "DeleteNatMappingResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "WsValidationException"),
                      "com.sandvine.subscriberservices.ws.WsValidationException",
                      new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "WsValidationException"), 
                      true
                     ));
        _operations[39] = oper;

    }

    private static void _initOperationDesc5(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeleteNatMappings");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "DeleteNatMappingsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "DeleteNatMappingsRequest"), com.sandvine.subscriberservices.ws.DeleteNatMappingsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "DeleteNatMappingsResponse"));
        oper.setReturnClass(com.sandvine.subscriberservices.ws.DeleteNatMappingsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "DeleteNatMappingsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "WsValidationException"),
                      "com.sandvine.subscriberservices.ws.WsValidationException",
                      new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "WsValidationException"), 
                      true
                     ));
        _operations[40] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("LookupNatMapping");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "LookupNatMappingRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "LookupNatMappingRequest"), com.sandvine.subscriberservices.ws.LookupNatMappingRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "LookupNatMappingResponse"));
        oper.setReturnClass(com.sandvine.subscriberservices.ws.LookupNatMappingResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "LookupNatMappingResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "WsValidationException"),
                      "com.sandvine.subscriberservices.ws.WsValidationException",
                      new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "WsValidationException"), 
                      true
                     ));
        _operations[41] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("LookupNatMappings");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "LookupNatMappingsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "LookupNatMappingsRequest"), com.sandvine.subscriberservices.ws.LookupNatMappingsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "LookupNatMappingsResponse"));
        oper.setReturnClass(com.sandvine.subscriberservices.ws.LookupNatMappingsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "LookupNatMappingsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "WsValidationException"),
                      "com.sandvine.subscriberservices.ws.WsValidationException",
                      new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "WsValidationException"), 
                      true
                     ));
        _operations[42] = oper;

    }

    public SubscriberServicesPortBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public SubscriberServicesPortBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public SubscriberServicesPortBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
        addBindings0();
        addBindings1();
        addBindings2();
    }

    private void addBindings0() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", ">AssignIpRequest>ResponseGroups");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("", "ResponseGroup");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", ">AssignIpsRequest>AssignIpParameterSets");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.AssignIpParameterSet[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "AssignIpParameterSet");
            qName2 = new javax.xml.namespace.QName("", "AssignIpParameterSet");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", ">AssignIpsRequest>ResponseGroups");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("", "ResponseGroup");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", ">AssignIpsResponse>IpAssignments");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.IpAssignment[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "IpAssignment");
            qName2 = new javax.xml.namespace.QName("", "IpAssignment");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", ">AssignIpsResponse>PartialFailures");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.AssignIpsPartialFailure[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "AssignIpsPartialFailure");
            qName2 = new javax.xml.namespace.QName("", "PartialFailure");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", ">AttributeAuditSearchBySubscriberResponse>SubscriberAttributeAuditRecords");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.SubscriberAttributeAuditRecord[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "SubscriberAttributeAuditRecord");
            qName2 = new javax.xml.namespace.QName("", "SubscriberAttributeAuditRecord");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", ">AttributeAuditSearchBySubscribersRequest>SubscriberKeys");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.SubscriberKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "SubscriberKey");
            qName2 = new javax.xml.namespace.QName("", "SubscriberKey");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", ">AttributeAuditSearchBySubscribersResponse>SubscriberAttributeAuditRecords");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.SubscriberAttributeAuditRecord[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "SubscriberAttributeAuditRecord");
            qName2 = new javax.xml.namespace.QName("", "SubscriberAttributeAuditRecord");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", ">CreateNatMappingRequest>ResponseGroups");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("", "ResponseGroup");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", ">CreateNatMappingsRequest>CreateNatMappingParameterSets");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.CreateNatMappingParameterSet[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "CreateNatMappingParameterSet");
            qName2 = new javax.xml.namespace.QName("", "CreateNatMappingParameterSet");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", ">CreateNatMappingsRequest>ResponseGroups");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("", "ResponseGroup");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", ">CreateNatMappingsResponse>NatMappings");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.NatMapping[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "NatMapping");
            qName2 = new javax.xml.namespace.QName("", "NatMapping");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", ">CreateNatMappingsResponse>PartialFailures");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.CreateNatMappingsPartialFailure[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "CreateNatMappingsPartialFailure");
            qName2 = new javax.xml.namespace.QName("", "PartialFailure");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", ">CreateSubscriberRequest>ResponseGroups");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("", "ResponseGroup");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", ">CreateSubscribersRequest>CreateSubscriberParameterSets");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.CreateSubscriberParameterSet[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "CreateSubscriberParameterSet");
            qName2 = new javax.xml.namespace.QName("", "CreateSubscriberParameterSet");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", ">CreateSubscribersRequest>ResponseGroups");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("", "ResponseGroup");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", ">CreateSubscribersResponse>PartialFailures");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.SubscriberPartialFailure[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "SubscriberPartialFailure");
            qName2 = new javax.xml.namespace.QName("", "PartialFailure");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", ">CreateSubscribersResponse>Subscribers");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.Subscriber[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "Subscriber");
            qName2 = new javax.xml.namespace.QName("", "Subscriber");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", ">Delegation>Errors");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.Error[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "Error");
            qName2 = new javax.xml.namespace.QName("", "Error");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", ">Delegation>SubDelegations");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.Delegation[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "Delegation");
            qName2 = new javax.xml.namespace.QName("", "Delegation");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", ">DelegationSummary>Delegations");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.Delegation[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "Delegation");
            qName2 = new javax.xml.namespace.QName("", "Delegation");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", ">DeleteNatMappingRequest>ResponseGroups");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("", "ResponseGroup");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", ">DeleteNatMappingsRequest>DeleteNatMappingParameterSets");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.DeleteNatMappingParameterSet[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "DeleteNatMappingParameterSet");
            qName2 = new javax.xml.namespace.QName("", "DeleteNatMappingParameterSet");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", ">DeleteNatMappingsRequest>ResponseGroups");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("", "ResponseGroup");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", ">DeleteNatMappingsResponse>NatMappings");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.NatMapping[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "NatMapping");
            qName2 = new javax.xml.namespace.QName("", "NatMapping");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", ">DeleteNatMappingsResponse>PartialFailures");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.DeleteNatMappingsPartialFailure[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "DeleteNatMappingsPartialFailure");
            qName2 = new javax.xml.namespace.QName("", "PartialFailure");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", ">DeleteSubscribersRequest>ResponseGroups");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("", "ResponseGroup");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", ">DeleteSubscribersRequest>SubscriberKeys");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.SubscriberKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "SubscriberKey");
            qName2 = new javax.xml.namespace.QName("", "SubscriberKey");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", ">DeleteSubscribersResponse>PartialFailures");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.SubscriberPartialFailure[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "SubscriberPartialFailure");
            qName2 = new javax.xml.namespace.QName("", "PartialFailure");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", ">DeleteSubscribersResponse>Subscribers");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.Subscriber[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "Subscriber");
            qName2 = new javax.xml.namespace.QName("", "Subscriber");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", ">FindSubscriberDataHomesResponse>DataHomes");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("", "DataHome");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", ">IpAssignment>SessionAttributes");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.SessionAttribute[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "SessionAttribute");
            qName2 = new javax.xml.namespace.QName("", "SessionAttribute");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", ">IpAssignmentSearchRequest>IpEndpoints");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.IpEndpoint[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "IpEndpoint");
            qName2 = new javax.xml.namespace.QName("", "IpEndpoint");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", ">IpAssignmentSearchRequest>ResponseGroups");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("", "ResponseGroup");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", ">IpAssignmentSearchResponse>IpAssignments");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.IpAssignment[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "IpAssignment");
            qName2 = new javax.xml.namespace.QName("", "IpAssignment");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", ">IpAssignmentsForEndpointRequest>ResponseGroups");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("", "ResponseGroup");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", ">IpAssignmentsForEndpointResponse>IpAssignments");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.IpAssignment[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "IpAssignment");
            qName2 = new javax.xml.namespace.QName("", "IpAssignment");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", ">IpAssignmentsForEndpointsRequest>IpEndpoints");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.IpEndpoint[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "IpEndpoint");
            qName2 = new javax.xml.namespace.QName("", "IpEndpoint");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", ">IpAssignmentsForEndpointsRequest>ResponseGroups");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("", "ResponseGroup");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", ">IpAssignmentsForEndpointsResponse>IpAssignments");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.IpAssignment[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "IpAssignment");
            qName2 = new javax.xml.namespace.QName("", "IpAssignment");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", ">IpAssignmentsForIpAddressesRequest>IpAddresses");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "IpAddress");
            qName2 = new javax.xml.namespace.QName("", "IpAddress");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", ">IpAssignmentsForIpAddressesRequest>ResponseGroups");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("", "ResponseGroup");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", ">IpAssignmentsForIpAddressesResponse>IpAssignments");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.IpAssignment[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "IpAssignment");
            qName2 = new javax.xml.namespace.QName("", "IpAssignment");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", ">IpAssignmentsForSubscriberRequest>ResponseGroups");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("", "ResponseGroup");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", ">IpAssignmentsForSubscriberResponse>IpAssignments");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.IpAssignment[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "IpAssignment");
            qName2 = new javax.xml.namespace.QName("", "IpAssignment");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", ">IpAssignmentsForSubscribersRequest>ResponseGroups");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("", "ResponseGroup");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", ">IpAssignmentsForSubscribersRequest>SubscriberKeys");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.SubscriberKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "SubscriberKey");
            qName2 = new javax.xml.namespace.QName("", "SubscriberKey");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", ">IpAssignmentsForSubscribersResponse>IpAssignments");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.IpAssignment[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "IpAssignment");
            qName2 = new javax.xml.namespace.QName("", "IpAssignment");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", ">LookupIpAssignmentRequest>ResponseGroups");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("", "ResponseGroup");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", ">LookupIpAssignmentsRequest>IpAssignmentKeys");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.IpAssignmentKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "IpAssignmentKey");
            qName2 = new javax.xml.namespace.QName("", "IpAssignmentKey");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", ">LookupIpAssignmentsRequest>ResponseGroups");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("", "ResponseGroup");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", ">LookupIpAssignmentsResponse>IpAssignments");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.IpAssignment[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "IpAssignment");
            qName2 = new javax.xml.namespace.QName("", "IpAssignment");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", ">LookupIpAssignmentsResponse>PartialFailures");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.LookupIpAssignmentsPartialFailure[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "LookupIpAssignmentsPartialFailure");
            qName2 = new javax.xml.namespace.QName("", "PartialFailure");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", ">LookupNatMappingRequest>ResponseGroups");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("", "ResponseGroup");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", ">LookupNatMappingsRequest>NatMappingKeys");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.NatMappingKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "NatMappingKey");
            qName2 = new javax.xml.namespace.QName("", "NatMappingKey");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", ">LookupNatMappingsRequest>ResponseGroups");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("", "ResponseGroup");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", ">LookupNatMappingsResponse>NatMappings");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.NatMapping[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "NatMapping");
            qName2 = new javax.xml.namespace.QName("", "NatMapping");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", ">LookupNatMappingsResponse>PartialFailures");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.LookupNatMappingsPartialFailure[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "LookupNatMappingsPartialFailure");
            qName2 = new javax.xml.namespace.QName("", "PartialFailure");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", ">LookupSessionQualifierTypeRequest>ResponseGroups");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("", "ResponseGroup");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", ">LookupSubscriberAttributeDefinitionRequest>ResponseGroups");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("", "ResponseGroup");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", ">LookupSubscriberRealmRequest>ResponseGroups");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("", "ResponseGroup");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", ">LookupSubscriberRequest>ResponseGroups");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("", "ResponseGroup");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", ">LookupSubscribersRequest>ResponseGroups");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("", "ResponseGroup");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", ">LookupSubscribersRequest>SubscriberKeys");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.SubscriberKey[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "SubscriberKey");
            qName2 = new javax.xml.namespace.QName("", "SubscriberKey");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", ">LookupSubscribersResponse>PartialFailures");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.LookupSubscribersPartialFailure[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "LookupSubscribersPartialFailure");
            qName2 = new javax.xml.namespace.QName("", "PartialFailure");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", ">LookupSubscribersResponse>Subscribers");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.Subscriber[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "Subscriber");
            qName2 = new javax.xml.namespace.QName("", "Subscriber");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", ">ModifySubscriberRequest>ResponseGroups");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("", "ResponseGroup");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", ">Network>ChildNetworks");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.Network[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "Network");
            qName2 = new javax.xml.namespace.QName("", "Network");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", ">Network>NetworkAttributes");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.NetworkAttribute[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "NetworkAttribute");
            qName2 = new javax.xml.namespace.QName("", "NetworkAttribute");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", ">Network>StaticIpSubnets");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.IpSubnet[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "IpSubnet");
            qName2 = new javax.xml.namespace.QName("", "IpSubnet");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", ">NetworkAttributeDefinition>EnumeratedValues");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "EnumeratedValue");
            qName2 = new javax.xml.namespace.QName("", "EnumeratedValue");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", ">NetworkElementCluster>ManagedNetworks");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.Network[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "Network");
            qName2 = new javax.xml.namespace.QName("", "Network");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", ">NetworkElementCluster>NetworkElements");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.NetworkElement[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "NetworkElement");
            qName2 = new javax.xml.namespace.QName("", "NetworkElement");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", ">ProvisionSubscribersRequest>ProvisionSubscriberParameterSets");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.SubscriberSessionCreate[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "SubscriberSessionCreate");
            qName2 = new javax.xml.namespace.QName("", "ProvisionSubscriberParameterSet");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", ">ProvisionSubscribersRequest>ResponseGroups");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("", "ResponseGroup");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", ">ProvisionSubscribersResponse>ProvisionSubscriberPartialFailures");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.ProvisionSubscriberPartialFailure[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "ProvisionSubscriberPartialFailure");
            qName2 = new javax.xml.namespace.QName("", "ProvisionSubscriberPartialFailure");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", ">ProvisionSubscribersResponse>Subscribers");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.Subscriber[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "Subscriber");
            qName2 = new javax.xml.namespace.QName("", "Subscriber");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", ">RemoveSubscriberAttributesRequest>ResponseGroups");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("", "ResponseGroup");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", ">RemoveSubscriberAttributesRequest>SubscriberAttributeParameterSets");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.RemoveSubscriberAttributeParameterSet[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "RemoveSubscriberAttributeParameterSet");
            qName2 = new javax.xml.namespace.QName("", "SubscriberAttributeParameterSet");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", ">RemoveSubscriberAttributesResponse>PartialFailures");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.RemoveSubscriberAttributesPartialFailure[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "RemoveSubscriberAttributesPartialFailure");
            qName2 = new javax.xml.namespace.QName("", "PartialFailure");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", ">RemoveSubscriberAttributesResponse>Subscribers");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.Subscriber[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "Subscriber");
            qName2 = new javax.xml.namespace.QName("", "Subscriber");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", ">Response>Errors");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.Error[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "Error");
            qName2 = new javax.xml.namespace.QName("", "Error");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", ">SearchNatMappingRequest>NatRecords");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.NatRecord[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "NatRecord");
            qName2 = new javax.xml.namespace.QName("", "NatRecord");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", ">SearchNatMappingRequest>ResponseGroups");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("", "ResponseGroup");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", ">SearchNatMappingResponse>NatMappings");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.NatMapping[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "NatMapping");
            qName2 = new javax.xml.namespace.QName("", "NatMapping");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", ">SessionQualifierTypeSearchRequest>ObjectStates");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.Status[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "Status");
            qName2 = new javax.xml.namespace.QName("", "ObjectState");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", ">SessionQualifierTypeSearchRequest>ResponseGroups");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("", "ResponseGroup");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", ">SessionQualifierTypeSearchResponse>SessionQualifierTypes");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.SessionQualifierType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "SessionQualifierType");
            qName2 = new javax.xml.namespace.QName("", "SessionQualifierType");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", ">SetSessionAttributesRequest>ResponseGroups");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("", "ResponseGroup");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", ">SetSessionAttributesRequest>SetSessionAttributeParameterSets");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.SetSessionAttributeParameterSet[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "SetSessionAttributeParameterSet");
            qName2 = new javax.xml.namespace.QName("", "SetSessionAttributeParameterSet");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", ">SetSessionAttributesResponse>IpAssignments");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.IpAssignment[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "IpAssignment");
            qName2 = new javax.xml.namespace.QName("", "IpAssignment");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", ">SetSessionAttributesResponse>PartialFailures");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.SetSessionAttributesPartialFailure[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "SetSessionAttributesPartialFailure");
            qName2 = new javax.xml.namespace.QName("", "PartialFailure");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", ">SetSubscriberAttributesRequest>ResponseGroups");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("", "ResponseGroup");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", ">SetSubscriberAttributesRequest>SetSubscriberAttributeParameterSets");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.SetSubscriberAttributeParameterSet[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "SetSubscriberAttributeParameterSet");
            qName2 = new javax.xml.namespace.QName("", "SetSubscriberAttributeParameterSet");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", ">SetSubscriberAttributesResponse>PartialFailures");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.SetSubscriberAttributesPartialFailure[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "SetSubscriberAttributesPartialFailure");
            qName2 = new javax.xml.namespace.QName("", "PartialFailure");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", ">SetSubscriberAttributesResponse>Subscribers");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.Subscriber[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "Subscriber");
            qName2 = new javax.xml.namespace.QName("", "Subscriber");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", ">Subscriber>CurrentIpAssignments");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.IpAssignment[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "IpAssignment");
            qName2 = new javax.xml.namespace.QName("", "IpAssignment");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", ">Subscriber>SubscriberAttributes");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.SubscriberAttribute[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "SubscriberAttribute");
            qName2 = new javax.xml.namespace.QName("", "SubscriberAttribute");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", ">SubscriberAttributeDefinition>EnumeratedValues");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "EnumeratedValue");
            qName2 = new javax.xml.namespace.QName("", "EnumeratedValue");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", ">SubscriberAttributeDefinitionSearchRequest>ResponseGroups");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("", "ResponseGroup");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    }
    private void addBindings1() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", ">SubscriberAttributeDefinitionSearchResponse>SubscriberAttributeDefinitions");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.SubscriberAttributeDefinition[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "SubscriberAttributeDefinition");
            qName2 = new javax.xml.namespace.QName("", "SubscriberAttributeDefinition");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", ">SubscriberRealmSearchRequest>ResponseGroups");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("", "ResponseGroup");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", ">SubscriberRealmSearchRequest>Statuses");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.Status[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "Status");
            qName2 = new javax.xml.namespace.QName("", "Status");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", ">SubscriberRealmSearchResponse>SubscriberRealms");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.SubscriberRealm[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "SubscriberRealm");
            qName2 = new javax.xml.namespace.QName("", "SubscriberRealm");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", ">SubscriberSearchRequest>ResponseGroups");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("", "ResponseGroup");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", ">SubscriberSearchRequest>Statuses");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.Status[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "Status");
            qName2 = new javax.xml.namespace.QName("", "Status");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", ">SubscriberSearchResponse>Subscribers");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.Subscriber[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "Subscriber");
            qName2 = new javax.xml.namespace.QName("", "Subscriber");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", ">SubscriberSessionCreate>SubscriberAttributeParameterSets");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.SubscriberAttributeParameterSet[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "SubscriberAttributeParameterSet");
            qName2 = new javax.xml.namespace.QName("", "SubscriberAttributeParameterSet");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", ">SubscriberSessionCreate>SubscriberSessionParameterSets");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.SubscriberSessionParameterSet[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "SubscriberSessionParameterSet");
            qName2 = new javax.xml.namespace.QName("", "SubscriberSessionParameterSet");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", ">SubscriberSessionParameterSet>SessionAttributeParameterSets");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.SubscriberAttributeParameterSet[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "SubscriberAttributeParameterSet");
            qName2 = new javax.xml.namespace.QName("", "SessionAttributeParameterSet");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", ">SubscribersWithAttributeCountResponse>AttributeValueCounts");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.AttributeValueCount[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "AttributeValueCount");
            qName2 = new javax.xml.namespace.QName("", "AttributeValueCount");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", ">SubscribersWithAttributeRequest>ResponseGroups");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("", "ResponseGroup");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", ">SubscribersWithAttributeResponse>Subscribers");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.Subscriber[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "Subscriber");
            qName2 = new javax.xml.namespace.QName("", "Subscriber");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", ">UnassignIpsRequest>UnassignIpParameterSets");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.UnassignIpParameterSet[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "UnassignIpParameterSet");
            qName2 = new javax.xml.namespace.QName("", "UnassignIpParameterSet");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", ">UnassignIpsResponse>IpAssignments");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.IpAssignment[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "IpAssignment");
            qName2 = new javax.xml.namespace.QName("", "IpAssignment");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", ">UnassignIpsResponse>PartialFailures");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.UnassignIpsPartialFailure[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "UnassignIpsPartialFailure");
            qName2 = new javax.xml.namespace.QName("", "PartialFailure");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "AssignIpParameterSet");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.AssignIpParameterSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "AssignIpRequest");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.AssignIpRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "AssignIpResponse");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.AssignIpResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "AssignIpsPartialFailure");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.AssignIpsPartialFailure.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "AssignIpsRequest");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.AssignIpsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "AssignIpsResponse");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.AssignIpsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "AttributeAuditSearchBySubscriberRequest");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.AttributeAuditSearchBySubscriberRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "AttributeAuditSearchBySubscriberResponse");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.AttributeAuditSearchBySubscriberResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "AttributeAuditSearchBySubscribersRequest");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.AttributeAuditSearchBySubscribersRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "AttributeAuditSearchBySubscribersResponse");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.AttributeAuditSearchBySubscribersResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "AttributeDefinition");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.AttributeDefinition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "AttributeDefinitionKey");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.AttributeDefinitionKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "AttributeValueCount");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.AttributeValueCount.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "BulkOperationFailureBehaviour");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.BulkOperationFailureBehaviour.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "BulkOperationRequest");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.BulkOperationRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "BulkOperationResponse");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.BulkOperationResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "BulkStatistics");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.BulkStatistics.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "CreateNatMappingParameterSet");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.CreateNatMappingParameterSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "CreateNatMappingRequest");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.CreateNatMappingRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "CreateNatMappingResponse");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.CreateNatMappingResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "CreateNatMappingsPartialFailure");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.CreateNatMappingsPartialFailure.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "CreateNatMappingsRequest");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.CreateNatMappingsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "CreateNatMappingsResponse");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.CreateNatMappingsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "CreateSubscriberParameterSet");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.CreateSubscriberParameterSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "CreateSubscriberRequest");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.CreateSubscriberRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "CreateSubscriberResponse");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.CreateSubscriberResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "CreateSubscribersRequest");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.CreateSubscribersRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "CreateSubscribersResponse");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.CreateSubscribersResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "delegateServiceResponse");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.DelegateServiceResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "Delegation");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.Delegation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "DelegationResult");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.DelegationResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "DelegationSummary");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.DelegationSummary.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "DeleteNatMappingParameterSet");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.DeleteNatMappingParameterSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "DeleteNatMappingRequest");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.DeleteNatMappingRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "DeleteNatMappingResponse");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.DeleteNatMappingResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "DeleteNatMappingsPartialFailure");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.DeleteNatMappingsPartialFailure.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "DeleteNatMappingsRequest");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.DeleteNatMappingsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "DeleteNatMappingsResponse");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.DeleteNatMappingsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "DeleteSubscriberRequest");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.DeleteSubscriberRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "DeleteSubscriberResponse");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.DeleteSubscriberResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "DeleteSubscribersRequest");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.DeleteSubscribersRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "DeleteSubscribersResponse");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.DeleteSubscribersResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "EnumeratedValue");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "Error");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.Error.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "FindSubscriberDataHomesRequest");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.FindSubscriberDataHomesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "FindSubscriberDataHomesResponse");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.FindSubscriberDataHomesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "GloballyUniquePrincipalEntityMoKey");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.GloballyUniquePrincipalEntityMoKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "Id");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "IpAddress");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "IpAssignment");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.IpAssignment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "IpAssignmentKey");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.IpAssignmentKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "IpAssignmentSearchRequest");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.IpAssignmentSearchRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "IpAssignmentSearchResponse");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.IpAssignmentSearchResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "IpAssignmentsForEndpointRequest");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.IpAssignmentsForEndpointRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "IpAssignmentsForEndpointResponse");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.IpAssignmentsForEndpointResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "IpAssignmentsForEndpointsRequest");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.IpAssignmentsForEndpointsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "IpAssignmentsForEndpointsResponse");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.IpAssignmentsForEndpointsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "IpAssignmentsForIpAddressesRequest");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.IpAssignmentsForIpAddressesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "IpAssignmentsForIpAddressesResponse");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.IpAssignmentsForIpAddressesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "IpAssignmentsForSubscriberRequest");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.IpAssignmentsForSubscriberRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "IpAssignmentsForSubscriberResponse");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.IpAssignmentsForSubscriberResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "IpAssignmentsForSubscribersRequest");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.IpAssignmentsForSubscribersRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "IpAssignmentsForSubscribersResponse");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.IpAssignmentsForSubscribersResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "IpEndpoint");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.IpEndpoint.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "IpSubnet");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.IpSubnet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "LookupIpAssignmentRequest");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.LookupIpAssignmentRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "LookupIpAssignmentResponse");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.LookupIpAssignmentResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "LookupIpAssignmentsPartialFailure");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.LookupIpAssignmentsPartialFailure.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "LookupIpAssignmentsRequest");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.LookupIpAssignmentsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "LookupIpAssignmentsResponse");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.LookupIpAssignmentsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "LookupNatMappingRequest");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.LookupNatMappingRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "LookupNatMappingResponse");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.LookupNatMappingResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "LookupNatMappingsPartialFailure");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.LookupNatMappingsPartialFailure.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "LookupNatMappingsRequest");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.LookupNatMappingsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "LookupNatMappingsResponse");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.LookupNatMappingsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "LookupSessionQualifierTypeRequest");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.LookupSessionQualifierTypeRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "LookupSessionQualifierTypeResponse");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.LookupSessionQualifierTypeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "LookupSubscriberAttributeDefinitionRequest");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.LookupSubscriberAttributeDefinitionRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "LookupSubscriberAttributeDefinitionResponse");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.LookupSubscriberAttributeDefinitionResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "LookupSubscriberRealmRequest");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.LookupSubscriberRealmRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "LookupSubscriberRealmResponse");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.LookupSubscriberRealmResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "LookupSubscriberRequest");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.LookupSubscriberRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "LookupSubscriberResponse");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.LookupSubscriberResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "LookupSubscribersPartialFailure");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.LookupSubscribersPartialFailure.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings2() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "LookupSubscribersRequest");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.LookupSubscribersRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "LookupSubscribersResponse");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.LookupSubscribersResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "Message");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.Message.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "ModifySubscriberRequest");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.ModifySubscriberRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "ModifySubscriberResponse");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.ModifySubscriberResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "NatMapping");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.NatMapping.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "NatMappingKey");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.NatMappingKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "NatRecord");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.NatRecord.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "Network");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.Network.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "NetworkAttribute");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.NetworkAttribute.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "NetworkAttributeDefinition");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.NetworkAttributeDefinition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "NetworkAttributeDefinitionKey");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.NetworkAttributeDefinitionKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "NetworkElement");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.NetworkElement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "NetworkElementCluster");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.NetworkElementCluster.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "NetworkElementClusterKey");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.NetworkElementClusterKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "NetworkElementKey");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.NetworkElementKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "NetworkKey");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.NetworkKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "PartialFailure");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.PartialFailure.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "PrincipalEntityMoKey");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.PrincipalEntityMoKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "ProvisionSubscriberPartialFailure");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.ProvisionSubscriberPartialFailure.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "ProvisionSubscribersRequest");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.ProvisionSubscribersRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "ProvisionSubscribersResponse");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.ProvisionSubscribersResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "ReconcileIpAddressRequest");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.ReconcileIpAddressRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "ReconcileIpAddressResponse");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.ReconcileIpAddressResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "RemoveSubscriberAttributeParameterSet");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.RemoveSubscriberAttributeParameterSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "RemoveSubscriberAttributesPartialFailure");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.RemoveSubscriberAttributesPartialFailure.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "RemoveSubscriberAttributesRequest");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.RemoveSubscriberAttributesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "RemoveSubscriberAttributesResponse");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.RemoveSubscriberAttributesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "Request");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.Request.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "Response");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.Response.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "Result");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.Result.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "SearchNatMappingRequest");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.SearchNatMappingRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "SearchNatMappingResponse");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.SearchNatMappingResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "SessionAttribute");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.SessionAttribute.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "SessionQualifier");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.SessionQualifier.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "SessionQualifierType");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.SessionQualifierType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "SessionQualifierTypeKey");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.SessionQualifierTypeKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "SessionQualifierTypeSearchRequest");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.SessionQualifierTypeSearchRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "SessionQualifierTypeSearchResponse");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.SessionQualifierTypeSearchResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "SetSessionAttributeParameterSet");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.SetSessionAttributeParameterSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "SetSessionAttributesPartialFailure");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.SetSessionAttributesPartialFailure.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "SetSessionAttributesRequest");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.SetSessionAttributesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "SetSessionAttributesResponse");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.SetSessionAttributesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "SetSubscriberAttributeParameterSet");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.SetSubscriberAttributeParameterSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "SetSubscriberAttributesPartialFailure");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.SetSubscriberAttributesPartialFailure.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "SetSubscriberAttributesRequest");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.SetSubscriberAttributesRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "SetSubscriberAttributesResponse");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.SetSubscriberAttributesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "Status");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.Status.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "Subscriber");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.Subscriber.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "SubscriberAttribute");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.SubscriberAttribute.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "SubscriberAttributeAuditRecord");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.SubscriberAttributeAuditRecord.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "SubscriberAttributeDefinition");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.SubscriberAttributeDefinition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "SubscriberAttributeDefinitionKey");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.SubscriberAttributeDefinitionKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "SubscriberAttributeDefinitionSearchRequest");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.SubscriberAttributeDefinitionSearchRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "SubscriberAttributeDefinitionSearchResponse");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.SubscriberAttributeDefinitionSearchResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "SubscriberAttributeParameterSet");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.SubscriberAttributeParameterSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "SubscriberKey");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.SubscriberKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "SubscriberPartialFailure");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.SubscriberPartialFailure.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "SubscriberRealm");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.SubscriberRealm.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "SubscriberRealmKey");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.SubscriberRealmKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "SubscriberRealmSearchRequest");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.SubscriberRealmSearchRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "SubscriberRealmSearchResponse");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.SubscriberRealmSearchResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "SubscriberSearchRequest");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.SubscriberSearchRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "SubscriberSearchResponse");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.SubscriberSearchResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "SubscriberSessionCreate");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.SubscriberSessionCreate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "SubscriberSessionParameterSet");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.SubscriberSessionParameterSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "SubscribersWithAttributeCountRequest");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.SubscribersWithAttributeCountRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "SubscribersWithAttributeCountResponse");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.SubscribersWithAttributeCountResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "SubscribersWithAttributeRequest");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.SubscribersWithAttributeRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "SubscribersWithAttributeResponse");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.SubscribersWithAttributeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "UnassignIpParameterSet");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.UnassignIpParameterSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "UnassignIpRequest");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.UnassignIpRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "UnassignIpResponse");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.UnassignIpResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "UnassignIpsPartialFailure");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.UnassignIpsPartialFailure.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "UnassignIpsRequest");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.UnassignIpsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "UnassignIpsResponse");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.UnassignIpsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.subscriberservices.sandvine.com", "WsValidationException");
            cachedSerQNames.add(qName);
            cls = com.sandvine.subscriberservices.ws.WsValidationException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public com.sandvine.subscriberservices.ws.SearchNatMappingResponse searchNatMapping(com.sandvine.subscriberservices.ws.SearchNatMappingRequest request) throws java.rmi.RemoteException, com.sandvine.subscriberservices.ws.WsValidationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.sandvine.com");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "SearchNatMapping"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sandvine.subscriberservices.ws.SearchNatMappingResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sandvine.subscriberservices.ws.SearchNatMappingResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.sandvine.subscriberservices.ws.SearchNatMappingResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sandvine.subscriberservices.ws.WsValidationException) {
              throw (com.sandvine.subscriberservices.ws.WsValidationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sandvine.subscriberservices.ws.CreateSubscriberResponse createSubscriber(com.sandvine.subscriberservices.ws.CreateSubscriberRequest request) throws java.rmi.RemoteException, com.sandvine.subscriberservices.ws.WsValidationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.sandvine.com");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CreateSubscriber"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sandvine.subscriberservices.ws.CreateSubscriberResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sandvine.subscriberservices.ws.CreateSubscriberResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.sandvine.subscriberservices.ws.CreateSubscriberResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sandvine.subscriberservices.ws.WsValidationException) {
              throw (com.sandvine.subscriberservices.ws.WsValidationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sandvine.subscriberservices.ws.ModifySubscriberResponse modifySubscriber(com.sandvine.subscriberservices.ws.ModifySubscriberRequest request) throws java.rmi.RemoteException, com.sandvine.subscriberservices.ws.WsValidationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.sandvine.com");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ModifySubscriber"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sandvine.subscriberservices.ws.ModifySubscriberResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sandvine.subscriberservices.ws.ModifySubscriberResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.sandvine.subscriberservices.ws.ModifySubscriberResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sandvine.subscriberservices.ws.WsValidationException) {
              throw (com.sandvine.subscriberservices.ws.WsValidationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sandvine.subscriberservices.ws.LookupSubscriberResponse lookupSubscriber(com.sandvine.subscriberservices.ws.LookupSubscriberRequest request) throws java.rmi.RemoteException, com.sandvine.subscriberservices.ws.WsValidationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.sandvine.com");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "LookupSubscriber"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sandvine.subscriberservices.ws.LookupSubscriberResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sandvine.subscriberservices.ws.LookupSubscriberResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.sandvine.subscriberservices.ws.LookupSubscriberResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sandvine.subscriberservices.ws.WsValidationException) {
              throw (com.sandvine.subscriberservices.ws.WsValidationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sandvine.subscriberservices.ws.FindSubscriberDataHomesResponse findSubscriberDataHomes(com.sandvine.subscriberservices.ws.FindSubscriberDataHomesRequest request) throws java.rmi.RemoteException, com.sandvine.subscriberservices.ws.WsValidationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.sandvine.com");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "FindSubscriberDataHomes"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sandvine.subscriberservices.ws.FindSubscriberDataHomesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sandvine.subscriberservices.ws.FindSubscriberDataHomesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.sandvine.subscriberservices.ws.FindSubscriberDataHomesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sandvine.subscriberservices.ws.WsValidationException) {
              throw (com.sandvine.subscriberservices.ws.WsValidationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sandvine.subscriberservices.ws.ReconcileIpAddressResponse reconcileIpAddress(com.sandvine.subscriberservices.ws.ReconcileIpAddressRequest request) throws java.rmi.RemoteException, com.sandvine.subscriberservices.ws.WsValidationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.sandvine.com");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ReconcileIpAddress"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sandvine.subscriberservices.ws.ReconcileIpAddressResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sandvine.subscriberservices.ws.ReconcileIpAddressResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.sandvine.subscriberservices.ws.ReconcileIpAddressResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sandvine.subscriberservices.ws.WsValidationException) {
              throw (com.sandvine.subscriberservices.ws.WsValidationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sandvine.subscriberservices.ws.DeleteSubscriberResponse deleteSubscriber(com.sandvine.subscriberservices.ws.DeleteSubscriberRequest request) throws java.rmi.RemoteException, com.sandvine.subscriberservices.ws.WsValidationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.sandvine.com");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "DeleteSubscriber"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sandvine.subscriberservices.ws.DeleteSubscriberResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sandvine.subscriberservices.ws.DeleteSubscriberResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.sandvine.subscriberservices.ws.DeleteSubscriberResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sandvine.subscriberservices.ws.WsValidationException) {
              throw (com.sandvine.subscriberservices.ws.WsValidationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sandvine.subscriberservices.ws.DeleteSubscribersResponse deleteSubscribers(com.sandvine.subscriberservices.ws.DeleteSubscribersRequest request) throws java.rmi.RemoteException, com.sandvine.subscriberservices.ws.WsValidationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.sandvine.com");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "DeleteSubscribers"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sandvine.subscriberservices.ws.DeleteSubscribersResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sandvine.subscriberservices.ws.DeleteSubscribersResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.sandvine.subscriberservices.ws.DeleteSubscribersResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sandvine.subscriberservices.ws.WsValidationException) {
              throw (com.sandvine.subscriberservices.ws.WsValidationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sandvine.subscriberservices.ws.SubscriberSearchResponse subscriberSearch(com.sandvine.subscriberservices.ws.SubscriberSearchRequest request) throws java.rmi.RemoteException, com.sandvine.subscriberservices.ws.WsValidationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.sandvine.com");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "SubscriberSearch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sandvine.subscriberservices.ws.SubscriberSearchResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sandvine.subscriberservices.ws.SubscriberSearchResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.sandvine.subscriberservices.ws.SubscriberSearchResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sandvine.subscriberservices.ws.WsValidationException) {
              throw (com.sandvine.subscriberservices.ws.WsValidationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sandvine.subscriberservices.ws.LookupSubscribersResponse lookupSubscribers(com.sandvine.subscriberservices.ws.LookupSubscribersRequest request) throws java.rmi.RemoteException, com.sandvine.subscriberservices.ws.WsValidationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.sandvine.com");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "LookupSubscribers"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sandvine.subscriberservices.ws.LookupSubscribersResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sandvine.subscriberservices.ws.LookupSubscribersResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.sandvine.subscriberservices.ws.LookupSubscribersResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sandvine.subscriberservices.ws.WsValidationException) {
              throw (com.sandvine.subscriberservices.ws.WsValidationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sandvine.subscriberservices.ws.CreateSubscribersResponse createSubscribers(com.sandvine.subscriberservices.ws.CreateSubscribersRequest request) throws java.rmi.RemoteException, com.sandvine.subscriberservices.ws.WsValidationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.sandvine.com");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CreateSubscribers"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sandvine.subscriberservices.ws.CreateSubscribersResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sandvine.subscriberservices.ws.CreateSubscribersResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.sandvine.subscriberservices.ws.CreateSubscribersResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sandvine.subscriberservices.ws.WsValidationException) {
              throw (com.sandvine.subscriberservices.ws.WsValidationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sandvine.subscriberservices.ws.SubscribersWithAttributeResponse subscribersWithAttribute(com.sandvine.subscriberservices.ws.SubscribersWithAttributeRequest request) throws java.rmi.RemoteException, com.sandvine.subscriberservices.ws.WsValidationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.sandvine.com");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "SubscribersWithAttribute"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sandvine.subscriberservices.ws.SubscribersWithAttributeResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sandvine.subscriberservices.ws.SubscribersWithAttributeResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.sandvine.subscriberservices.ws.SubscribersWithAttributeResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sandvine.subscriberservices.ws.WsValidationException) {
              throw (com.sandvine.subscriberservices.ws.WsValidationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sandvine.subscriberservices.ws.SubscribersWithAttributeCountResponse subscribersWithAttributeCount(com.sandvine.subscriberservices.ws.SubscribersWithAttributeCountRequest request) throws java.rmi.RemoteException, com.sandvine.subscriberservices.ws.WsValidationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.sandvine.com");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "SubscribersWithAttributeCount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sandvine.subscriberservices.ws.SubscribersWithAttributeCountResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sandvine.subscriberservices.ws.SubscribersWithAttributeCountResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.sandvine.subscriberservices.ws.SubscribersWithAttributeCountResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sandvine.subscriberservices.ws.WsValidationException) {
              throw (com.sandvine.subscriberservices.ws.WsValidationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sandvine.subscriberservices.ws.LookupSubscriberRealmResponse lookupSubscriberRealm(com.sandvine.subscriberservices.ws.LookupSubscriberRealmRequest request) throws java.rmi.RemoteException, com.sandvine.subscriberservices.ws.WsValidationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.sandvine.com");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "LookupSubscriberRealm"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sandvine.subscriberservices.ws.LookupSubscriberRealmResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sandvine.subscriberservices.ws.LookupSubscriberRealmResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.sandvine.subscriberservices.ws.LookupSubscriberRealmResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sandvine.subscriberservices.ws.WsValidationException) {
              throw (com.sandvine.subscriberservices.ws.WsValidationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sandvine.subscriberservices.ws.SubscriberRealmSearchResponse subscriberRealmSearch(com.sandvine.subscriberservices.ws.SubscriberRealmSearchRequest request) throws java.rmi.RemoteException, com.sandvine.subscriberservices.ws.WsValidationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.sandvine.com");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "SubscriberRealmSearch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sandvine.subscriberservices.ws.SubscriberRealmSearchResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sandvine.subscriberservices.ws.SubscriberRealmSearchResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.sandvine.subscriberservices.ws.SubscriberRealmSearchResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sandvine.subscriberservices.ws.WsValidationException) {
              throw (com.sandvine.subscriberservices.ws.WsValidationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sandvine.subscriberservices.ws.LookupSubscriberAttributeDefinitionResponse lookupSubscriberAttributeDefinition(com.sandvine.subscriberservices.ws.LookupSubscriberAttributeDefinitionRequest request) throws java.rmi.RemoteException, com.sandvine.subscriberservices.ws.WsValidationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.sandvine.com");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "LookupSubscriberAttributeDefinition"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sandvine.subscriberservices.ws.LookupSubscriberAttributeDefinitionResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sandvine.subscriberservices.ws.LookupSubscriberAttributeDefinitionResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.sandvine.subscriberservices.ws.LookupSubscriberAttributeDefinitionResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sandvine.subscriberservices.ws.WsValidationException) {
              throw (com.sandvine.subscriberservices.ws.WsValidationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sandvine.subscriberservices.ws.SubscriberAttributeDefinitionSearchResponse subscriberAttributeDefinitionSearch(com.sandvine.subscriberservices.ws.SubscriberAttributeDefinitionSearchRequest request) throws java.rmi.RemoteException, com.sandvine.subscriberservices.ws.WsValidationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.sandvine.com");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "SubscriberAttributeDefinitionSearch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sandvine.subscriberservices.ws.SubscriberAttributeDefinitionSearchResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sandvine.subscriberservices.ws.SubscriberAttributeDefinitionSearchResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.sandvine.subscriberservices.ws.SubscriberAttributeDefinitionSearchResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sandvine.subscriberservices.ws.WsValidationException) {
              throw (com.sandvine.subscriberservices.ws.WsValidationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sandvine.subscriberservices.ws.AttributeAuditSearchBySubscriberResponse attributeAuditSearchBySubscriber(com.sandvine.subscriberservices.ws.AttributeAuditSearchBySubscriberRequest request) throws java.rmi.RemoteException, com.sandvine.subscriberservices.ws.WsValidationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.sandvine.com");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "AttributeAuditSearchBySubscriber"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sandvine.subscriberservices.ws.AttributeAuditSearchBySubscriberResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sandvine.subscriberservices.ws.AttributeAuditSearchBySubscriberResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.sandvine.subscriberservices.ws.AttributeAuditSearchBySubscriberResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sandvine.subscriberservices.ws.WsValidationException) {
              throw (com.sandvine.subscriberservices.ws.WsValidationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sandvine.subscriberservices.ws.AttributeAuditSearchBySubscribersResponse attributeAuditSearchBySubscribers(com.sandvine.subscriberservices.ws.AttributeAuditSearchBySubscribersRequest request) throws java.rmi.RemoteException, com.sandvine.subscriberservices.ws.WsValidationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.sandvine.com");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "AttributeAuditSearchBySubscribers"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sandvine.subscriberservices.ws.AttributeAuditSearchBySubscribersResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sandvine.subscriberservices.ws.AttributeAuditSearchBySubscribersResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.sandvine.subscriberservices.ws.AttributeAuditSearchBySubscribersResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sandvine.subscriberservices.ws.WsValidationException) {
              throw (com.sandvine.subscriberservices.ws.WsValidationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sandvine.subscriberservices.ws.SetSubscriberAttributesResponse setSubscriberAttributes(com.sandvine.subscriberservices.ws.SetSubscriberAttributesRequest request) throws java.rmi.RemoteException, com.sandvine.subscriberservices.ws.WsValidationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.sandvine.com");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "SetSubscriberAttributes"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sandvine.subscriberservices.ws.SetSubscriberAttributesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sandvine.subscriberservices.ws.SetSubscriberAttributesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.sandvine.subscriberservices.ws.SetSubscriberAttributesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sandvine.subscriberservices.ws.WsValidationException) {
              throw (com.sandvine.subscriberservices.ws.WsValidationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sandvine.subscriberservices.ws.RemoveSubscriberAttributesResponse removeSubscriberAttributes(com.sandvine.subscriberservices.ws.RemoveSubscriberAttributesRequest request) throws java.rmi.RemoteException, com.sandvine.subscriberservices.ws.WsValidationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.sandvine.com");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "RemoveSubscriberAttributes"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sandvine.subscriberservices.ws.RemoveSubscriberAttributesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sandvine.subscriberservices.ws.RemoveSubscriberAttributesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.sandvine.subscriberservices.ws.RemoveSubscriberAttributesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sandvine.subscriberservices.ws.WsValidationException) {
              throw (com.sandvine.subscriberservices.ws.WsValidationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sandvine.subscriberservices.ws.SetSessionAttributesResponse setSessionAttributes(com.sandvine.subscriberservices.ws.SetSessionAttributesRequest request) throws java.rmi.RemoteException, com.sandvine.subscriberservices.ws.WsValidationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.sandvine.com");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "SetSessionAttributes"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sandvine.subscriberservices.ws.SetSessionAttributesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sandvine.subscriberservices.ws.SetSessionAttributesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.sandvine.subscriberservices.ws.SetSessionAttributesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sandvine.subscriberservices.ws.WsValidationException) {
              throw (com.sandvine.subscriberservices.ws.WsValidationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sandvine.subscriberservices.ws.AssignIpResponse assignIp(com.sandvine.subscriberservices.ws.AssignIpRequest request) throws java.rmi.RemoteException, com.sandvine.subscriberservices.ws.WsValidationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.sandvine.com");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "AssignIp"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sandvine.subscriberservices.ws.AssignIpResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sandvine.subscriberservices.ws.AssignIpResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.sandvine.subscriberservices.ws.AssignIpResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sandvine.subscriberservices.ws.WsValidationException) {
              throw (com.sandvine.subscriberservices.ws.WsValidationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sandvine.subscriberservices.ws.UnassignIpResponse unassignIp(com.sandvine.subscriberservices.ws.UnassignIpRequest request) throws java.rmi.RemoteException, com.sandvine.subscriberservices.ws.WsValidationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[23]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.sandvine.com");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "UnassignIp"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sandvine.subscriberservices.ws.UnassignIpResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sandvine.subscriberservices.ws.UnassignIpResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.sandvine.subscriberservices.ws.UnassignIpResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sandvine.subscriberservices.ws.WsValidationException) {
              throw (com.sandvine.subscriberservices.ws.WsValidationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sandvine.subscriberservices.ws.IpAssignmentSearchResponse ipAssignmentSearch(com.sandvine.subscriberservices.ws.IpAssignmentSearchRequest request) throws java.rmi.RemoteException, com.sandvine.subscriberservices.ws.WsValidationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[24]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.sandvine.com");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "IpAssignmentSearch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sandvine.subscriberservices.ws.IpAssignmentSearchResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sandvine.subscriberservices.ws.IpAssignmentSearchResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.sandvine.subscriberservices.ws.IpAssignmentSearchResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sandvine.subscriberservices.ws.WsValidationException) {
              throw (com.sandvine.subscriberservices.ws.WsValidationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sandvine.subscriberservices.ws.LookupIpAssignmentResponse lookupIpAssignment(com.sandvine.subscriberservices.ws.LookupIpAssignmentRequest request) throws java.rmi.RemoteException, com.sandvine.subscriberservices.ws.WsValidationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[25]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.sandvine.com");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "LookupIpAssignment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sandvine.subscriberservices.ws.LookupIpAssignmentResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sandvine.subscriberservices.ws.LookupIpAssignmentResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.sandvine.subscriberservices.ws.LookupIpAssignmentResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sandvine.subscriberservices.ws.WsValidationException) {
              throw (com.sandvine.subscriberservices.ws.WsValidationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sandvine.subscriberservices.ws.AssignIpsResponse assignIps(com.sandvine.subscriberservices.ws.AssignIpsRequest request) throws java.rmi.RemoteException, com.sandvine.subscriberservices.ws.WsValidationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[26]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.sandvine.com");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "AssignIps"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sandvine.subscriberservices.ws.AssignIpsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sandvine.subscriberservices.ws.AssignIpsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.sandvine.subscriberservices.ws.AssignIpsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sandvine.subscriberservices.ws.WsValidationException) {
              throw (com.sandvine.subscriberservices.ws.WsValidationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sandvine.subscriberservices.ws.UnassignIpsResponse unassignIps(com.sandvine.subscriberservices.ws.UnassignIpsRequest request) throws java.rmi.RemoteException, com.sandvine.subscriberservices.ws.WsValidationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[27]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.sandvine.com");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "UnassignIps"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sandvine.subscriberservices.ws.UnassignIpsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sandvine.subscriberservices.ws.UnassignIpsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.sandvine.subscriberservices.ws.UnassignIpsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sandvine.subscriberservices.ws.WsValidationException) {
              throw (com.sandvine.subscriberservices.ws.WsValidationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sandvine.subscriberservices.ws.LookupIpAssignmentsResponse lookupIpAssignments(com.sandvine.subscriberservices.ws.LookupIpAssignmentsRequest request) throws java.rmi.RemoteException, com.sandvine.subscriberservices.ws.WsValidationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[28]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.sandvine.com");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "LookupIpAssignments"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sandvine.subscriberservices.ws.LookupIpAssignmentsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sandvine.subscriberservices.ws.LookupIpAssignmentsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.sandvine.subscriberservices.ws.LookupIpAssignmentsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sandvine.subscriberservices.ws.WsValidationException) {
              throw (com.sandvine.subscriberservices.ws.WsValidationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sandvine.subscriberservices.ws.IpAssignmentsForEndpointResponse ipAssignmentsForEndpoint(com.sandvine.subscriberservices.ws.IpAssignmentsForEndpointRequest request) throws java.rmi.RemoteException, com.sandvine.subscriberservices.ws.WsValidationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[29]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.sandvine.com");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "IpAssignmentsForEndpoint"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sandvine.subscriberservices.ws.IpAssignmentsForEndpointResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sandvine.subscriberservices.ws.IpAssignmentsForEndpointResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.sandvine.subscriberservices.ws.IpAssignmentsForEndpointResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sandvine.subscriberservices.ws.WsValidationException) {
              throw (com.sandvine.subscriberservices.ws.WsValidationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sandvine.subscriberservices.ws.IpAssignmentsForEndpointsResponse ipAssignmentsForEndpoints(com.sandvine.subscriberservices.ws.IpAssignmentsForEndpointsRequest request) throws java.rmi.RemoteException, com.sandvine.subscriberservices.ws.WsValidationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[30]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.sandvine.com");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "IpAssignmentsForEndpoints"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sandvine.subscriberservices.ws.IpAssignmentsForEndpointsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sandvine.subscriberservices.ws.IpAssignmentsForEndpointsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.sandvine.subscriberservices.ws.IpAssignmentsForEndpointsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sandvine.subscriberservices.ws.WsValidationException) {
              throw (com.sandvine.subscriberservices.ws.WsValidationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sandvine.subscriberservices.ws.IpAssignmentsForSubscriberResponse ipAssignmentsForSubscriber(com.sandvine.subscriberservices.ws.IpAssignmentsForSubscriberRequest request) throws java.rmi.RemoteException, com.sandvine.subscriberservices.ws.WsValidationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[31]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.sandvine.com");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "IpAssignmentsForSubscriber"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sandvine.subscriberservices.ws.IpAssignmentsForSubscriberResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sandvine.subscriberservices.ws.IpAssignmentsForSubscriberResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.sandvine.subscriberservices.ws.IpAssignmentsForSubscriberResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sandvine.subscriberservices.ws.WsValidationException) {
              throw (com.sandvine.subscriberservices.ws.WsValidationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sandvine.subscriberservices.ws.IpAssignmentsForSubscribersResponse ipAssignmentsForSubscribers(com.sandvine.subscriberservices.ws.IpAssignmentsForSubscribersRequest request) throws java.rmi.RemoteException, com.sandvine.subscriberservices.ws.WsValidationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[32]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.sandvine.com");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "IpAssignmentsForSubscribers"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sandvine.subscriberservices.ws.IpAssignmentsForSubscribersResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sandvine.subscriberservices.ws.IpAssignmentsForSubscribersResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.sandvine.subscriberservices.ws.IpAssignmentsForSubscribersResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sandvine.subscriberservices.ws.WsValidationException) {
              throw (com.sandvine.subscriberservices.ws.WsValidationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sandvine.subscriberservices.ws.ProvisionSubscribersResponse provisionSubscribers(com.sandvine.subscriberservices.ws.ProvisionSubscribersRequest request) throws java.rmi.RemoteException, com.sandvine.subscriberservices.ws.WsValidationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[33]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.sandvine.com");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ProvisionSubscribers"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sandvine.subscriberservices.ws.ProvisionSubscribersResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sandvine.subscriberservices.ws.ProvisionSubscribersResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.sandvine.subscriberservices.ws.ProvisionSubscribersResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sandvine.subscriberservices.ws.WsValidationException) {
              throw (com.sandvine.subscriberservices.ws.WsValidationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sandvine.subscriberservices.ws.LookupSessionQualifierTypeResponse lookupSessionQualifierType(com.sandvine.subscriberservices.ws.LookupSessionQualifierTypeRequest request) throws java.rmi.RemoteException, com.sandvine.subscriberservices.ws.WsValidationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[34]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.sandvine.com");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "LookupSessionQualifierType"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sandvine.subscriberservices.ws.LookupSessionQualifierTypeResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sandvine.subscriberservices.ws.LookupSessionQualifierTypeResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.sandvine.subscriberservices.ws.LookupSessionQualifierTypeResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sandvine.subscriberservices.ws.WsValidationException) {
              throw (com.sandvine.subscriberservices.ws.WsValidationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sandvine.subscriberservices.ws.SessionQualifierTypeSearchResponse sessionQualifierTypeSearch(com.sandvine.subscriberservices.ws.SessionQualifierTypeSearchRequest request) throws java.rmi.RemoteException, com.sandvine.subscriberservices.ws.WsValidationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[35]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.sandvine.com");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "SessionQualifierTypeSearch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sandvine.subscriberservices.ws.SessionQualifierTypeSearchResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sandvine.subscriberservices.ws.SessionQualifierTypeSearchResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.sandvine.subscriberservices.ws.SessionQualifierTypeSearchResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sandvine.subscriberservices.ws.WsValidationException) {
              throw (com.sandvine.subscriberservices.ws.WsValidationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sandvine.subscriberservices.ws.IpAssignmentsForIpAddressesResponse ipAssignmentsForIpAddresses(com.sandvine.subscriberservices.ws.IpAssignmentsForIpAddressesRequest request) throws java.rmi.RemoteException, com.sandvine.subscriberservices.ws.WsValidationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[36]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.sandvine.com");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "IpAssignmentsForIpAddresses"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sandvine.subscriberservices.ws.IpAssignmentsForIpAddressesResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sandvine.subscriberservices.ws.IpAssignmentsForIpAddressesResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.sandvine.subscriberservices.ws.IpAssignmentsForIpAddressesResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sandvine.subscriberservices.ws.WsValidationException) {
              throw (com.sandvine.subscriberservices.ws.WsValidationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sandvine.subscriberservices.ws.CreateNatMappingResponse createNatMapping(com.sandvine.subscriberservices.ws.CreateNatMappingRequest request) throws java.rmi.RemoteException, com.sandvine.subscriberservices.ws.WsValidationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[37]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.sandvine.com");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CreateNatMapping"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sandvine.subscriberservices.ws.CreateNatMappingResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sandvine.subscriberservices.ws.CreateNatMappingResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.sandvine.subscriberservices.ws.CreateNatMappingResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sandvine.subscriberservices.ws.WsValidationException) {
              throw (com.sandvine.subscriberservices.ws.WsValidationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sandvine.subscriberservices.ws.CreateNatMappingsResponse createNatMappings(com.sandvine.subscriberservices.ws.CreateNatMappingsRequest request) throws java.rmi.RemoteException, com.sandvine.subscriberservices.ws.WsValidationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[38]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.sandvine.com");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CreateNatMappings"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sandvine.subscriberservices.ws.CreateNatMappingsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sandvine.subscriberservices.ws.CreateNatMappingsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.sandvine.subscriberservices.ws.CreateNatMappingsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sandvine.subscriberservices.ws.WsValidationException) {
              throw (com.sandvine.subscriberservices.ws.WsValidationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sandvine.subscriberservices.ws.DeleteNatMappingResponse deleteNatMapping(com.sandvine.subscriberservices.ws.DeleteNatMappingRequest request) throws java.rmi.RemoteException, com.sandvine.subscriberservices.ws.WsValidationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[39]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.sandvine.com");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "DeleteNatMapping"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sandvine.subscriberservices.ws.DeleteNatMappingResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sandvine.subscriberservices.ws.DeleteNatMappingResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.sandvine.subscriberservices.ws.DeleteNatMappingResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sandvine.subscriberservices.ws.WsValidationException) {
              throw (com.sandvine.subscriberservices.ws.WsValidationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sandvine.subscriberservices.ws.DeleteNatMappingsResponse deleteNatMappings(com.sandvine.subscriberservices.ws.DeleteNatMappingsRequest request) throws java.rmi.RemoteException, com.sandvine.subscriberservices.ws.WsValidationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[40]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.sandvine.com");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "DeleteNatMappings"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sandvine.subscriberservices.ws.DeleteNatMappingsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sandvine.subscriberservices.ws.DeleteNatMappingsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.sandvine.subscriberservices.ws.DeleteNatMappingsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sandvine.subscriberservices.ws.WsValidationException) {
              throw (com.sandvine.subscriberservices.ws.WsValidationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sandvine.subscriberservices.ws.LookupNatMappingResponse lookupNatMapping(com.sandvine.subscriberservices.ws.LookupNatMappingRequest request) throws java.rmi.RemoteException, com.sandvine.subscriberservices.ws.WsValidationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[41]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.sandvine.com");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "LookupNatMapping"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sandvine.subscriberservices.ws.LookupNatMappingResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sandvine.subscriberservices.ws.LookupNatMappingResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.sandvine.subscriberservices.ws.LookupNatMappingResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sandvine.subscriberservices.ws.WsValidationException) {
              throw (com.sandvine.subscriberservices.ws.WsValidationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sandvine.subscriberservices.ws.LookupNatMappingsResponse lookupNatMappings(com.sandvine.subscriberservices.ws.LookupNatMappingsRequest request) throws java.rmi.RemoteException, com.sandvine.subscriberservices.ws.WsValidationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[42]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.sandvine.com");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "LookupNatMappings"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sandvine.subscriberservices.ws.LookupNatMappingsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sandvine.subscriberservices.ws.LookupNatMappingsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.sandvine.subscriberservices.ws.LookupNatMappingsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sandvine.subscriberservices.ws.WsValidationException) {
              throw (com.sandvine.subscriberservices.ws.WsValidationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
