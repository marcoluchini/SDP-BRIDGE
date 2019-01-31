/**
 * SubscriberServices_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sandvine.subscriberservices.ws;

public interface SubscriberServices_PortType extends java.rmi.Remote {
    public com.sandvine.subscriberservices.ws.SearchNatMappingResponse searchNatMapping(com.sandvine.subscriberservices.ws.SearchNatMappingRequest request) throws java.rmi.RemoteException, com.sandvine.subscriberservices.ws.WsValidationException;
    public com.sandvine.subscriberservices.ws.CreateSubscriberResponse createSubscriber(com.sandvine.subscriberservices.ws.CreateSubscriberRequest request) throws java.rmi.RemoteException, com.sandvine.subscriberservices.ws.WsValidationException;
    public com.sandvine.subscriberservices.ws.ModifySubscriberResponse modifySubscriber(com.sandvine.subscriberservices.ws.ModifySubscriberRequest request) throws java.rmi.RemoteException, com.sandvine.subscriberservices.ws.WsValidationException;
    public com.sandvine.subscriberservices.ws.LookupSubscriberResponse lookupSubscriber(com.sandvine.subscriberservices.ws.LookupSubscriberRequest request) throws java.rmi.RemoteException, com.sandvine.subscriberservices.ws.WsValidationException;
    public com.sandvine.subscriberservices.ws.FindSubscriberDataHomesResponse findSubscriberDataHomes(com.sandvine.subscriberservices.ws.FindSubscriberDataHomesRequest request) throws java.rmi.RemoteException, com.sandvine.subscriberservices.ws.WsValidationException;
    public com.sandvine.subscriberservices.ws.ReconcileIpAddressResponse reconcileIpAddress(com.sandvine.subscriberservices.ws.ReconcileIpAddressRequest request) throws java.rmi.RemoteException, com.sandvine.subscriberservices.ws.WsValidationException;
    public com.sandvine.subscriberservices.ws.DeleteSubscriberResponse deleteSubscriber(com.sandvine.subscriberservices.ws.DeleteSubscriberRequest request) throws java.rmi.RemoteException, com.sandvine.subscriberservices.ws.WsValidationException;
    public com.sandvine.subscriberservices.ws.DeleteSubscribersResponse deleteSubscribers(com.sandvine.subscriberservices.ws.DeleteSubscribersRequest request) throws java.rmi.RemoteException, com.sandvine.subscriberservices.ws.WsValidationException;
    public com.sandvine.subscriberservices.ws.SubscriberSearchResponse subscriberSearch(com.sandvine.subscriberservices.ws.SubscriberSearchRequest request) throws java.rmi.RemoteException, com.sandvine.subscriberservices.ws.WsValidationException;
    public com.sandvine.subscriberservices.ws.LookupSubscribersResponse lookupSubscribers(com.sandvine.subscriberservices.ws.LookupSubscribersRequest request) throws java.rmi.RemoteException, com.sandvine.subscriberservices.ws.WsValidationException;
    public com.sandvine.subscriberservices.ws.CreateSubscribersResponse createSubscribers(com.sandvine.subscriberservices.ws.CreateSubscribersRequest request) throws java.rmi.RemoteException, com.sandvine.subscriberservices.ws.WsValidationException;
    public com.sandvine.subscriberservices.ws.SubscribersWithAttributeResponse subscribersWithAttribute(com.sandvine.subscriberservices.ws.SubscribersWithAttributeRequest request) throws java.rmi.RemoteException, com.sandvine.subscriberservices.ws.WsValidationException;
    public com.sandvine.subscriberservices.ws.SubscribersWithAttributeCountResponse subscribersWithAttributeCount(com.sandvine.subscriberservices.ws.SubscribersWithAttributeCountRequest request) throws java.rmi.RemoteException, com.sandvine.subscriberservices.ws.WsValidationException;
    public com.sandvine.subscriberservices.ws.LookupSubscriberRealmResponse lookupSubscriberRealm(com.sandvine.subscriberservices.ws.LookupSubscriberRealmRequest request) throws java.rmi.RemoteException, com.sandvine.subscriberservices.ws.WsValidationException;
    public com.sandvine.subscriberservices.ws.SubscriberRealmSearchResponse subscriberRealmSearch(com.sandvine.subscriberservices.ws.SubscriberRealmSearchRequest request) throws java.rmi.RemoteException, com.sandvine.subscriberservices.ws.WsValidationException;
    public com.sandvine.subscriberservices.ws.LookupSubscriberAttributeDefinitionResponse lookupSubscriberAttributeDefinition(com.sandvine.subscriberservices.ws.LookupSubscriberAttributeDefinitionRequest request) throws java.rmi.RemoteException, com.sandvine.subscriberservices.ws.WsValidationException;
    public com.sandvine.subscriberservices.ws.SubscriberAttributeDefinitionSearchResponse subscriberAttributeDefinitionSearch(com.sandvine.subscriberservices.ws.SubscriberAttributeDefinitionSearchRequest request) throws java.rmi.RemoteException, com.sandvine.subscriberservices.ws.WsValidationException;
    public com.sandvine.subscriberservices.ws.AttributeAuditSearchBySubscriberResponse attributeAuditSearchBySubscriber(com.sandvine.subscriberservices.ws.AttributeAuditSearchBySubscriberRequest request) throws java.rmi.RemoteException, com.sandvine.subscriberservices.ws.WsValidationException;
    public com.sandvine.subscriberservices.ws.AttributeAuditSearchBySubscribersResponse attributeAuditSearchBySubscribers(com.sandvine.subscriberservices.ws.AttributeAuditSearchBySubscribersRequest request) throws java.rmi.RemoteException, com.sandvine.subscriberservices.ws.WsValidationException;
    public com.sandvine.subscriberservices.ws.SetSubscriberAttributesResponse setSubscriberAttributes(com.sandvine.subscriberservices.ws.SetSubscriberAttributesRequest request) throws java.rmi.RemoteException, com.sandvine.subscriberservices.ws.WsValidationException;
    public com.sandvine.subscriberservices.ws.RemoveSubscriberAttributesResponse removeSubscriberAttributes(com.sandvine.subscriberservices.ws.RemoveSubscriberAttributesRequest request) throws java.rmi.RemoteException, com.sandvine.subscriberservices.ws.WsValidationException;
    public com.sandvine.subscriberservices.ws.SetSessionAttributesResponse setSessionAttributes(com.sandvine.subscriberservices.ws.SetSessionAttributesRequest request) throws java.rmi.RemoteException, com.sandvine.subscriberservices.ws.WsValidationException;
    public com.sandvine.subscriberservices.ws.AssignIpResponse assignIp(com.sandvine.subscriberservices.ws.AssignIpRequest request) throws java.rmi.RemoteException, com.sandvine.subscriberservices.ws.WsValidationException;
    public com.sandvine.subscriberservices.ws.UnassignIpResponse unassignIp(com.sandvine.subscriberservices.ws.UnassignIpRequest request) throws java.rmi.RemoteException, com.sandvine.subscriberservices.ws.WsValidationException;
    public com.sandvine.subscriberservices.ws.IpAssignmentSearchResponse ipAssignmentSearch(com.sandvine.subscriberservices.ws.IpAssignmentSearchRequest request) throws java.rmi.RemoteException, com.sandvine.subscriberservices.ws.WsValidationException;
    public com.sandvine.subscriberservices.ws.LookupIpAssignmentResponse lookupIpAssignment(com.sandvine.subscriberservices.ws.LookupIpAssignmentRequest request) throws java.rmi.RemoteException, com.sandvine.subscriberservices.ws.WsValidationException;
    public com.sandvine.subscriberservices.ws.AssignIpsResponse assignIps(com.sandvine.subscriberservices.ws.AssignIpsRequest request) throws java.rmi.RemoteException, com.sandvine.subscriberservices.ws.WsValidationException;
    public com.sandvine.subscriberservices.ws.UnassignIpsResponse unassignIps(com.sandvine.subscriberservices.ws.UnassignIpsRequest request) throws java.rmi.RemoteException, com.sandvine.subscriberservices.ws.WsValidationException;
    public com.sandvine.subscriberservices.ws.LookupIpAssignmentsResponse lookupIpAssignments(com.sandvine.subscriberservices.ws.LookupIpAssignmentsRequest request) throws java.rmi.RemoteException, com.sandvine.subscriberservices.ws.WsValidationException;
    public com.sandvine.subscriberservices.ws.IpAssignmentsForEndpointResponse ipAssignmentsForEndpoint(com.sandvine.subscriberservices.ws.IpAssignmentsForEndpointRequest request) throws java.rmi.RemoteException, com.sandvine.subscriberservices.ws.WsValidationException;
    public com.sandvine.subscriberservices.ws.IpAssignmentsForEndpointsResponse ipAssignmentsForEndpoints(com.sandvine.subscriberservices.ws.IpAssignmentsForEndpointsRequest request) throws java.rmi.RemoteException, com.sandvine.subscriberservices.ws.WsValidationException;
    public com.sandvine.subscriberservices.ws.IpAssignmentsForSubscriberResponse ipAssignmentsForSubscriber(com.sandvine.subscriberservices.ws.IpAssignmentsForSubscriberRequest request) throws java.rmi.RemoteException, com.sandvine.subscriberservices.ws.WsValidationException;
    public com.sandvine.subscriberservices.ws.IpAssignmentsForSubscribersResponse ipAssignmentsForSubscribers(com.sandvine.subscriberservices.ws.IpAssignmentsForSubscribersRequest request) throws java.rmi.RemoteException, com.sandvine.subscriberservices.ws.WsValidationException;
    public com.sandvine.subscriberservices.ws.ProvisionSubscribersResponse provisionSubscribers(com.sandvine.subscriberservices.ws.ProvisionSubscribersRequest request) throws java.rmi.RemoteException, com.sandvine.subscriberservices.ws.WsValidationException;
    public com.sandvine.subscriberservices.ws.LookupSessionQualifierTypeResponse lookupSessionQualifierType(com.sandvine.subscriberservices.ws.LookupSessionQualifierTypeRequest request) throws java.rmi.RemoteException, com.sandvine.subscriberservices.ws.WsValidationException;
    public com.sandvine.subscriberservices.ws.SessionQualifierTypeSearchResponse sessionQualifierTypeSearch(com.sandvine.subscriberservices.ws.SessionQualifierTypeSearchRequest request) throws java.rmi.RemoteException, com.sandvine.subscriberservices.ws.WsValidationException;
    public com.sandvine.subscriberservices.ws.IpAssignmentsForIpAddressesResponse ipAssignmentsForIpAddresses(com.sandvine.subscriberservices.ws.IpAssignmentsForIpAddressesRequest request) throws java.rmi.RemoteException, com.sandvine.subscriberservices.ws.WsValidationException;
    public com.sandvine.subscriberservices.ws.CreateNatMappingResponse createNatMapping(com.sandvine.subscriberservices.ws.CreateNatMappingRequest request) throws java.rmi.RemoteException, com.sandvine.subscriberservices.ws.WsValidationException;
    public com.sandvine.subscriberservices.ws.CreateNatMappingsResponse createNatMappings(com.sandvine.subscriberservices.ws.CreateNatMappingsRequest request) throws java.rmi.RemoteException, com.sandvine.subscriberservices.ws.WsValidationException;
    public com.sandvine.subscriberservices.ws.DeleteNatMappingResponse deleteNatMapping(com.sandvine.subscriberservices.ws.DeleteNatMappingRequest request) throws java.rmi.RemoteException, com.sandvine.subscriberservices.ws.WsValidationException;
    public com.sandvine.subscriberservices.ws.DeleteNatMappingsResponse deleteNatMappings(com.sandvine.subscriberservices.ws.DeleteNatMappingsRequest request) throws java.rmi.RemoteException, com.sandvine.subscriberservices.ws.WsValidationException;
    public com.sandvine.subscriberservices.ws.LookupNatMappingResponse lookupNatMapping(com.sandvine.subscriberservices.ws.LookupNatMappingRequest request) throws java.rmi.RemoteException, com.sandvine.subscriberservices.ws.WsValidationException;
    public com.sandvine.subscriberservices.ws.LookupNatMappingsResponse lookupNatMappings(com.sandvine.subscriberservices.ws.LookupNatMappingsRequest request) throws java.rmi.RemoteException, com.sandvine.subscriberservices.ws.WsValidationException;
}
