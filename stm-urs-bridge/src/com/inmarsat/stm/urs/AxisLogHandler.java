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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AxisLogHandler extends BasicHandler {
private static final long serialVersionUID = 1L;
 
@Override public void invoke(MessageContext msgContext) throws AxisFault {
		try {
			logMessage(msgContext);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

final static Logger logger = LoggerFactory.getLogger(AxisLogHandler.class);

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
if (STMGlobals.currAccessNetwork == STMGlobals.accessNetBGAN ) {
	soapHeaderElement.addTextNode(STMGlobals.spbuser_bgan_primary);
} else {
	soapHeaderElement.addTextNode(STMGlobals.spbuser_gx_primary);
};

Name name2 = soapEnv.createName("password", "svsec", "http://services.sandvine.com");
SOAPHeaderElement soapHeaderElement2 = soapHeader.addHeaderElement(name2);
//
////soapHeaderElement.setActor(SOAPConstants.URI_SOAP_ACTOR_NEXT);
if (STMGlobals.currAccessNetwork == STMGlobals.accessNetBGAN ) {
	soapHeaderElement2.addTextNode(STMGlobals.spbpasswd_bgan_primary);
} else {
	soapHeaderElement2.addTextNode(STMGlobals.spbpasswd_gx_primary);
}
soapMsg.saveChanges();
//System.out.println("============================= REQUEST ============================================");
//System.out.println(Messages.getMessage("inMsg00", (inMsg == null ? "" : inMsg.getSOAPEnvelope().getAsString())));
logger.debug("============================= REQUEST ============================================");
logger.debug(Messages.getMessage("inMsg00", (inMsg == null ? "" : inMsg.getSOAPEnvelope().getAsString())));
}
else {
//System.out.println("===================================RESPONSE======================================");
//System.out.println(Messages.getMessage("outMsg00", (outMsg == null ? "" : outMsg.getSOAPEnvelope().getAsString())));
logger.debug("===================================RESPONSE======================================");
logger.debug(Messages.getMessage("outMsg00", (outMsg == null ? "" : outMsg.getSOAPEnvelope().getAsString())));
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