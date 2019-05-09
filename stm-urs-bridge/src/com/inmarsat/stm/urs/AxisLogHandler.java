package com.inmarsat.stm.urs;

import javax.xml.soap.Name;
import javax.xml.soap.SOAPConstants;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPHeaderElement;
import javax.xml.soap.SOAPMessage;

import org.apache.axis.AxisFault;
import org.apache.axis.Message;
import org.apache.axis.MessageContext;
import org.apache.axis.handlers.BasicHandler;
import org.apache.axis.utils.Messages;

public class AxisLogHandler extends BasicHandler {
 private static final long serialVersionUID = 1L;
 
@Override public void invoke(MessageContext msgContext) throws AxisFault {
try {
logMessage(msgContext);
 } catch (Exception e) {
e.printStackTrace();
}
 }

private void logMessage(MessageContext msgContext) throws Exception{
Message inMsg = msgContext.getRequestMessage();
 Message outMsg = msgContext.getResponseMessage();
if(outMsg == null) {
//replace it with logger if you need it log in different file.
//System.out.println("============================= REQUEST ============================================");
//System.out.println(Messages.getMessage("inMsg00", (inMsg == null ? "" : inMsg.getSOAPEnvelope().getAsString())));

SOAPMessage soapMsg = msgContext.getRequestMessage();
javax.xml.soap.SOAPEnvelope soapEnv = soapMsg.getSOAPPart().getEnvelope();
SOAPHeader soapHeader = (SOAPHeader) soapEnv.getHeader();
if (soapHeader == null) {
    soapHeader = soapEnv.addHeader();
    soapHeader.addNamespaceDeclaration("svsec", "http://services.sandvine.com");
}

//org.apache.axis.message.SOAPHeader implements javax.xml.soap.SOAPHeader
//but keeps the addHeaderElement(QName) method abstract.
//
//When using this implementation then, we have to use the addHeaderElement(javax.xml.soap.Name) method instead.

//QName qname = new QName("", "macAddress");
//
Name name = soapEnv.createName("username", "svsec", "http://services.sandvine.com");
SOAPHeaderElement soapHeaderElement = soapHeader.addHeaderElement(name);
//
////soapHeaderElement.setActor(SOAPConstants.URI_SOAP_ACTOR_NEXT);
if (STMConstants.currAccessNetwork == 2 ) {
	soapHeaderElement.addTextNode(STMConstants.spbuser2);
} else {
	soapHeaderElement.addTextNode(STMConstants.spbuser);
};

Name name2 = soapEnv.createName("password", "svsec", "http://services.sandvine.com");
SOAPHeaderElement soapHeaderElement2 = soapHeader.addHeaderElement(name2);
//
////soapHeaderElement.setActor(SOAPConstants.URI_SOAP_ACTOR_NEXT);
if (STMConstants.currAccessNetwork == 2 ) {
	soapHeaderElement2.addTextNode(STMConstants.spbpasswd2);
} else {
	soapHeaderElement2.addTextNode(STMConstants.spbpasswd);
}
soapMsg.saveChanges();
System.out.println("============================= REQUEST ============================================");
System.out.println(Messages.getMessage("inMsg00", (inMsg == null ? "" : inMsg.getSOAPEnvelope().getAsString())));
}
else {
System.out.println("===================================RESPONSE======================================");
 System.out.println(Messages.getMessage("outMsg00", (outMsg == null ? "" : outMsg.getSOAPEnvelope().getAsString())));
}
}
 @Override public void onFault(MessageContext msgContext) { super.onFault(msgContext);
 try {
 logMessage(msgContext);
 } catch (Exception e) {
 e.printStackTrace();
 }
}
}