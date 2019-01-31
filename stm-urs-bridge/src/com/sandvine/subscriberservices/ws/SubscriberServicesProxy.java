package com.sandvine.subscriberservices.ws;

public class SubscriberServicesProxy implements com.sandvine.subscriberservices.ws.SubscriberServices_PortType {
  private String _endpoint = null;
  private com.sandvine.subscriberservices.ws.SubscriberServices_PortType subscriberServices_PortType = null;
  
  public SubscriberServicesProxy() {
    _initSubscriberServicesProxy();
  }
  
  public SubscriberServicesProxy(String endpoint) {
    _endpoint = endpoint;
    _initSubscriberServicesProxy();
  }
  
  private void _initSubscriberServicesProxy() {
    try {
      subscriberServices_PortType = (new com.sandvine.subscriberservices.ws.SubscriberServices_ServiceLocator()).getSubscriberServicesPort();
      if (subscriberServices_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)subscriberServices_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)subscriberServices_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (subscriberServices_PortType != null)
      ((javax.xml.rpc.Stub)subscriberServices_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.sandvine.subscriberservices.ws.SubscriberServices_PortType getSubscriberServices_PortType() {
    if (subscriberServices_PortType == null)
      _initSubscriberServicesProxy();
    return subscriberServices_PortType;
  }
  
  public com.sandvine.subscriberservices.ws.SearchNatMappingResponse searchNatMapping(com.sandvine.subscriberservices.ws.SearchNatMappingRequest request) throws java.rmi.RemoteException, com.sandvine.subscriberservices.ws.WsValidationException{
    if (subscriberServices_PortType == null)
      _initSubscriberServicesProxy();
    return subscriberServices_PortType.searchNatMapping(request);
  }
  
  public com.sandvine.subscriberservices.ws.CreateSubscriberResponse createSubscriber(com.sandvine.subscriberservices.ws.CreateSubscriberRequest request) throws java.rmi.RemoteException, com.sandvine.subscriberservices.ws.WsValidationException{
    if (subscriberServices_PortType == null)
      _initSubscriberServicesProxy();
    return subscriberServices_PortType.createSubscriber(request);
  }
  
  public com.sandvine.subscriberservices.ws.ModifySubscriberResponse modifySubscriber(com.sandvine.subscriberservices.ws.ModifySubscriberRequest request) throws java.rmi.RemoteException, com.sandvine.subscriberservices.ws.WsValidationException{
    if (subscriberServices_PortType == null)
      _initSubscriberServicesProxy();
    return subscriberServices_PortType.modifySubscriber(request);
  }
  
  public com.sandvine.subscriberservices.ws.LookupSubscriberResponse lookupSubscriber(com.sandvine.subscriberservices.ws.LookupSubscriberRequest request) throws java.rmi.RemoteException, com.sandvine.subscriberservices.ws.WsValidationException{
    if (subscriberServices_PortType == null)
      _initSubscriberServicesProxy();
    return subscriberServices_PortType.lookupSubscriber(request);
  }
  
  public com.sandvine.subscriberservices.ws.FindSubscriberDataHomesResponse findSubscriberDataHomes(com.sandvine.subscriberservices.ws.FindSubscriberDataHomesRequest request) throws java.rmi.RemoteException, com.sandvine.subscriberservices.ws.WsValidationException{
    if (subscriberServices_PortType == null)
      _initSubscriberServicesProxy();
    return subscriberServices_PortType.findSubscriberDataHomes(request);
  }
  
  public com.sandvine.subscriberservices.ws.ReconcileIpAddressResponse reconcileIpAddress(com.sandvine.subscriberservices.ws.ReconcileIpAddressRequest request) throws java.rmi.RemoteException, com.sandvine.subscriberservices.ws.WsValidationException{
    if (subscriberServices_PortType == null)
      _initSubscriberServicesProxy();
    return subscriberServices_PortType.reconcileIpAddress(request);
  }
  
  public com.sandvine.subscriberservices.ws.DeleteSubscriberResponse deleteSubscriber(com.sandvine.subscriberservices.ws.DeleteSubscriberRequest request) throws java.rmi.RemoteException, com.sandvine.subscriberservices.ws.WsValidationException{
    if (subscriberServices_PortType == null)
      _initSubscriberServicesProxy();
    return subscriberServices_PortType.deleteSubscriber(request);
  }
  
  public com.sandvine.subscriberservices.ws.DeleteSubscribersResponse deleteSubscribers(com.sandvine.subscriberservices.ws.DeleteSubscribersRequest request) throws java.rmi.RemoteException, com.sandvine.subscriberservices.ws.WsValidationException{
    if (subscriberServices_PortType == null)
      _initSubscriberServicesProxy();
    return subscriberServices_PortType.deleteSubscribers(request);
  }
  
  public com.sandvine.subscriberservices.ws.SubscriberSearchResponse subscriberSearch(com.sandvine.subscriberservices.ws.SubscriberSearchRequest request) throws java.rmi.RemoteException, com.sandvine.subscriberservices.ws.WsValidationException{
    if (subscriberServices_PortType == null)
      _initSubscriberServicesProxy();
    return subscriberServices_PortType.subscriberSearch(request);
  }
  
  public com.sandvine.subscriberservices.ws.LookupSubscribersResponse lookupSubscribers(com.sandvine.subscriberservices.ws.LookupSubscribersRequest request) throws java.rmi.RemoteException, com.sandvine.subscriberservices.ws.WsValidationException{
    if (subscriberServices_PortType == null)
      _initSubscriberServicesProxy();
    return subscriberServices_PortType.lookupSubscribers(request);
  }
  
  public com.sandvine.subscriberservices.ws.CreateSubscribersResponse createSubscribers(com.sandvine.subscriberservices.ws.CreateSubscribersRequest request) throws java.rmi.RemoteException, com.sandvine.subscriberservices.ws.WsValidationException{
    if (subscriberServices_PortType == null)
      _initSubscriberServicesProxy();
    return subscriberServices_PortType.createSubscribers(request);
  }
  
  public com.sandvine.subscriberservices.ws.SubscribersWithAttributeResponse subscribersWithAttribute(com.sandvine.subscriberservices.ws.SubscribersWithAttributeRequest request) throws java.rmi.RemoteException, com.sandvine.subscriberservices.ws.WsValidationException{
    if (subscriberServices_PortType == null)
      _initSubscriberServicesProxy();
    return subscriberServices_PortType.subscribersWithAttribute(request);
  }
  
  public com.sandvine.subscriberservices.ws.SubscribersWithAttributeCountResponse subscribersWithAttributeCount(com.sandvine.subscriberservices.ws.SubscribersWithAttributeCountRequest request) throws java.rmi.RemoteException, com.sandvine.subscriberservices.ws.WsValidationException{
    if (subscriberServices_PortType == null)
      _initSubscriberServicesProxy();
    return subscriberServices_PortType.subscribersWithAttributeCount(request);
  }
  
  public com.sandvine.subscriberservices.ws.LookupSubscriberRealmResponse lookupSubscriberRealm(com.sandvine.subscriberservices.ws.LookupSubscriberRealmRequest request) throws java.rmi.RemoteException, com.sandvine.subscriberservices.ws.WsValidationException{
    if (subscriberServices_PortType == null)
      _initSubscriberServicesProxy();
    return subscriberServices_PortType.lookupSubscriberRealm(request);
  }
  
  public com.sandvine.subscriberservices.ws.SubscriberRealmSearchResponse subscriberRealmSearch(com.sandvine.subscriberservices.ws.SubscriberRealmSearchRequest request) throws java.rmi.RemoteException, com.sandvine.subscriberservices.ws.WsValidationException{
    if (subscriberServices_PortType == null)
      _initSubscriberServicesProxy();
    return subscriberServices_PortType.subscriberRealmSearch(request);
  }
  
  public com.sandvine.subscriberservices.ws.LookupSubscriberAttributeDefinitionResponse lookupSubscriberAttributeDefinition(com.sandvine.subscriberservices.ws.LookupSubscriberAttributeDefinitionRequest request) throws java.rmi.RemoteException, com.sandvine.subscriberservices.ws.WsValidationException{
    if (subscriberServices_PortType == null)
      _initSubscriberServicesProxy();
    return subscriberServices_PortType.lookupSubscriberAttributeDefinition(request);
  }
  
  public com.sandvine.subscriberservices.ws.SubscriberAttributeDefinitionSearchResponse subscriberAttributeDefinitionSearch(com.sandvine.subscriberservices.ws.SubscriberAttributeDefinitionSearchRequest request) throws java.rmi.RemoteException, com.sandvine.subscriberservices.ws.WsValidationException{
    if (subscriberServices_PortType == null)
      _initSubscriberServicesProxy();
    return subscriberServices_PortType.subscriberAttributeDefinitionSearch(request);
  }
  
  public com.sandvine.subscriberservices.ws.AttributeAuditSearchBySubscriberResponse attributeAuditSearchBySubscriber(com.sandvine.subscriberservices.ws.AttributeAuditSearchBySubscriberRequest request) throws java.rmi.RemoteException, com.sandvine.subscriberservices.ws.WsValidationException{
    if (subscriberServices_PortType == null)
      _initSubscriberServicesProxy();
    return subscriberServices_PortType.attributeAuditSearchBySubscriber(request);
  }
  
  public com.sandvine.subscriberservices.ws.AttributeAuditSearchBySubscribersResponse attributeAuditSearchBySubscribers(com.sandvine.subscriberservices.ws.AttributeAuditSearchBySubscribersRequest request) throws java.rmi.RemoteException, com.sandvine.subscriberservices.ws.WsValidationException{
    if (subscriberServices_PortType == null)
      _initSubscriberServicesProxy();
    return subscriberServices_PortType.attributeAuditSearchBySubscribers(request);
  }
  
  public com.sandvine.subscriberservices.ws.SetSubscriberAttributesResponse setSubscriberAttributes(com.sandvine.subscriberservices.ws.SetSubscriberAttributesRequest request) throws java.rmi.RemoteException, com.sandvine.subscriberservices.ws.WsValidationException{
    if (subscriberServices_PortType == null)
      _initSubscriberServicesProxy();
    return subscriberServices_PortType.setSubscriberAttributes(request);
  }
  
  public com.sandvine.subscriberservices.ws.RemoveSubscriberAttributesResponse removeSubscriberAttributes(com.sandvine.subscriberservices.ws.RemoveSubscriberAttributesRequest request) throws java.rmi.RemoteException, com.sandvine.subscriberservices.ws.WsValidationException{
    if (subscriberServices_PortType == null)
      _initSubscriberServicesProxy();
    return subscriberServices_PortType.removeSubscriberAttributes(request);
  }
  
  public com.sandvine.subscriberservices.ws.SetSessionAttributesResponse setSessionAttributes(com.sandvine.subscriberservices.ws.SetSessionAttributesRequest request) throws java.rmi.RemoteException, com.sandvine.subscriberservices.ws.WsValidationException{
    if (subscriberServices_PortType == null)
      _initSubscriberServicesProxy();
    return subscriberServices_PortType.setSessionAttributes(request);
  }
  
  public com.sandvine.subscriberservices.ws.AssignIpResponse assignIp(com.sandvine.subscriberservices.ws.AssignIpRequest request) throws java.rmi.RemoteException, com.sandvine.subscriberservices.ws.WsValidationException{
    if (subscriberServices_PortType == null)
      _initSubscriberServicesProxy();
    return subscriberServices_PortType.assignIp(request);
  }
  
  public com.sandvine.subscriberservices.ws.UnassignIpResponse unassignIp(com.sandvine.subscriberservices.ws.UnassignIpRequest request) throws java.rmi.RemoteException, com.sandvine.subscriberservices.ws.WsValidationException{
    if (subscriberServices_PortType == null)
      _initSubscriberServicesProxy();
    return subscriberServices_PortType.unassignIp(request);
  }
  
  public com.sandvine.subscriberservices.ws.IpAssignmentSearchResponse ipAssignmentSearch(com.sandvine.subscriberservices.ws.IpAssignmentSearchRequest request) throws java.rmi.RemoteException, com.sandvine.subscriberservices.ws.WsValidationException{
    if (subscriberServices_PortType == null)
      _initSubscriberServicesProxy();
    return subscriberServices_PortType.ipAssignmentSearch(request);
  }
  
  public com.sandvine.subscriberservices.ws.LookupIpAssignmentResponse lookupIpAssignment(com.sandvine.subscriberservices.ws.LookupIpAssignmentRequest request) throws java.rmi.RemoteException, com.sandvine.subscriberservices.ws.WsValidationException{
    if (subscriberServices_PortType == null)
      _initSubscriberServicesProxy();
    return subscriberServices_PortType.lookupIpAssignment(request);
  }
  
  public com.sandvine.subscriberservices.ws.AssignIpsResponse assignIps(com.sandvine.subscriberservices.ws.AssignIpsRequest request) throws java.rmi.RemoteException, com.sandvine.subscriberservices.ws.WsValidationException{
    if (subscriberServices_PortType == null)
      _initSubscriberServicesProxy();
    return subscriberServices_PortType.assignIps(request);
  }
  
  public com.sandvine.subscriberservices.ws.UnassignIpsResponse unassignIps(com.sandvine.subscriberservices.ws.UnassignIpsRequest request) throws java.rmi.RemoteException, com.sandvine.subscriberservices.ws.WsValidationException{
    if (subscriberServices_PortType == null)
      _initSubscriberServicesProxy();
    return subscriberServices_PortType.unassignIps(request);
  }
  
  public com.sandvine.subscriberservices.ws.LookupIpAssignmentsResponse lookupIpAssignments(com.sandvine.subscriberservices.ws.LookupIpAssignmentsRequest request) throws java.rmi.RemoteException, com.sandvine.subscriberservices.ws.WsValidationException{
    if (subscriberServices_PortType == null)
      _initSubscriberServicesProxy();
    return subscriberServices_PortType.lookupIpAssignments(request);
  }
  
  public com.sandvine.subscriberservices.ws.IpAssignmentsForEndpointResponse ipAssignmentsForEndpoint(com.sandvine.subscriberservices.ws.IpAssignmentsForEndpointRequest request) throws java.rmi.RemoteException, com.sandvine.subscriberservices.ws.WsValidationException{
    if (subscriberServices_PortType == null)
      _initSubscriberServicesProxy();
    return subscriberServices_PortType.ipAssignmentsForEndpoint(request);
  }
  
  public com.sandvine.subscriberservices.ws.IpAssignmentsForEndpointsResponse ipAssignmentsForEndpoints(com.sandvine.subscriberservices.ws.IpAssignmentsForEndpointsRequest request) throws java.rmi.RemoteException, com.sandvine.subscriberservices.ws.WsValidationException{
    if (subscriberServices_PortType == null)
      _initSubscriberServicesProxy();
    return subscriberServices_PortType.ipAssignmentsForEndpoints(request);
  }
  
  public com.sandvine.subscriberservices.ws.IpAssignmentsForSubscriberResponse ipAssignmentsForSubscriber(com.sandvine.subscriberservices.ws.IpAssignmentsForSubscriberRequest request) throws java.rmi.RemoteException, com.sandvine.subscriberservices.ws.WsValidationException{
    if (subscriberServices_PortType == null)
      _initSubscriberServicesProxy();
    return subscriberServices_PortType.ipAssignmentsForSubscriber(request);
  }
  
  public com.sandvine.subscriberservices.ws.IpAssignmentsForSubscribersResponse ipAssignmentsForSubscribers(com.sandvine.subscriberservices.ws.IpAssignmentsForSubscribersRequest request) throws java.rmi.RemoteException, com.sandvine.subscriberservices.ws.WsValidationException{
    if (subscriberServices_PortType == null)
      _initSubscriberServicesProxy();
    return subscriberServices_PortType.ipAssignmentsForSubscribers(request);
  }
  
  public com.sandvine.subscriberservices.ws.ProvisionSubscribersResponse provisionSubscribers(com.sandvine.subscriberservices.ws.ProvisionSubscribersRequest request) throws java.rmi.RemoteException, com.sandvine.subscriberservices.ws.WsValidationException{
    if (subscriberServices_PortType == null)
      _initSubscriberServicesProxy();
    return subscriberServices_PortType.provisionSubscribers(request);
  }
  
  public com.sandvine.subscriberservices.ws.LookupSessionQualifierTypeResponse lookupSessionQualifierType(com.sandvine.subscriberservices.ws.LookupSessionQualifierTypeRequest request) throws java.rmi.RemoteException, com.sandvine.subscriberservices.ws.WsValidationException{
    if (subscriberServices_PortType == null)
      _initSubscriberServicesProxy();
    return subscriberServices_PortType.lookupSessionQualifierType(request);
  }
  
  public com.sandvine.subscriberservices.ws.SessionQualifierTypeSearchResponse sessionQualifierTypeSearch(com.sandvine.subscriberservices.ws.SessionQualifierTypeSearchRequest request) throws java.rmi.RemoteException, com.sandvine.subscriberservices.ws.WsValidationException{
    if (subscriberServices_PortType == null)
      _initSubscriberServicesProxy();
    return subscriberServices_PortType.sessionQualifierTypeSearch(request);
  }
  
  public com.sandvine.subscriberservices.ws.IpAssignmentsForIpAddressesResponse ipAssignmentsForIpAddresses(com.sandvine.subscriberservices.ws.IpAssignmentsForIpAddressesRequest request) throws java.rmi.RemoteException, com.sandvine.subscriberservices.ws.WsValidationException{
    if (subscriberServices_PortType == null)
      _initSubscriberServicesProxy();
    return subscriberServices_PortType.ipAssignmentsForIpAddresses(request);
  }
  
  public com.sandvine.subscriberservices.ws.CreateNatMappingResponse createNatMapping(com.sandvine.subscriberservices.ws.CreateNatMappingRequest request) throws java.rmi.RemoteException, com.sandvine.subscriberservices.ws.WsValidationException{
    if (subscriberServices_PortType == null)
      _initSubscriberServicesProxy();
    return subscriberServices_PortType.createNatMapping(request);
  }
  
  public com.sandvine.subscriberservices.ws.CreateNatMappingsResponse createNatMappings(com.sandvine.subscriberservices.ws.CreateNatMappingsRequest request) throws java.rmi.RemoteException, com.sandvine.subscriberservices.ws.WsValidationException{
    if (subscriberServices_PortType == null)
      _initSubscriberServicesProxy();
    return subscriberServices_PortType.createNatMappings(request);
  }
  
  public com.sandvine.subscriberservices.ws.DeleteNatMappingResponse deleteNatMapping(com.sandvine.subscriberservices.ws.DeleteNatMappingRequest request) throws java.rmi.RemoteException, com.sandvine.subscriberservices.ws.WsValidationException{
    if (subscriberServices_PortType == null)
      _initSubscriberServicesProxy();
    return subscriberServices_PortType.deleteNatMapping(request);
  }
  
  public com.sandvine.subscriberservices.ws.DeleteNatMappingsResponse deleteNatMappings(com.sandvine.subscriberservices.ws.DeleteNatMappingsRequest request) throws java.rmi.RemoteException, com.sandvine.subscriberservices.ws.WsValidationException{
    if (subscriberServices_PortType == null)
      _initSubscriberServicesProxy();
    return subscriberServices_PortType.deleteNatMappings(request);
  }
  
  public com.sandvine.subscriberservices.ws.LookupNatMappingResponse lookupNatMapping(com.sandvine.subscriberservices.ws.LookupNatMappingRequest request) throws java.rmi.RemoteException, com.sandvine.subscriberservices.ws.WsValidationException{
    if (subscriberServices_PortType == null)
      _initSubscriberServicesProxy();
    return subscriberServices_PortType.lookupNatMapping(request);
  }
  
  public com.sandvine.subscriberservices.ws.LookupNatMappingsResponse lookupNatMappings(com.sandvine.subscriberservices.ws.LookupNatMappingsRequest request) throws java.rmi.RemoteException, com.sandvine.subscriberservices.ws.WsValidationException{
    if (subscriberServices_PortType == null)
      _initSubscriberServicesProxy();
    return subscriberServices_PortType.lookupNatMappings(request);
  }
  
  
}