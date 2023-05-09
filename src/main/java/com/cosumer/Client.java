package com.cosumer;

import com.cosumer.client.ObjectFactory;
import com.cosumer.client.ParamsMtMsg;
import com.cosumer.client.SendResponse;
import com.cosumer.client.SendT;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import javax.xml.bind.JAXBElement;
import javax.xml.soap.*;
import java.io.IOException;

@Slf4j
public class Client /*extends WebServiceGatewaySupport*/ {

    public SOAPMessage getResponse() {

//        ObjectFactory factory = new ObjectFactory();
//        SendT request = factory.createSendT();
//        ParamsMtMsg paramsMtMsg = new ParamsMtMsg();
//        paramsMtMsg.setBlock4("<![CDATA[<Saa:DataPDU xmlns:Saa=\"urn:swift:saa:xsd:saa.2.0\" xmlns:Sw=\"urn:swift:snl:ns.Sw\" xmlns:SwGbl=\"urn:swift:snl:ns.SwGbl\" xmlns:SwInt=\"urn:swift:snl:ns.SwInt\" xmlns:SwSec=\"urn:swift:snl:ns.SwSec\">\n" +
//                "\t\t\t\t<Saa:Body>\n" +
//                "\t\t\t\t\t <AppHdr:AppHdr xmlns=\"urn:iso:std:iso:20022:tech:xsd:head.001.001.01\" xmlns:AppHdr=\"urn:iso:std:iso:20022:tech:xsd:head.001.001.01\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">\n" +
//                "\t\t\t\t\t  <Fr>\n" +
//                "\t\t\t\t\t\t<FIId>\n" +
//                "\t\t\t\t\t\t  <FinInstnId>\n" +
//                "\t\t\t\t\t\t\t<BICFI>CIBLBDDH</BICFI>\n" +
//                "\t\t\t\t\t\t  </FinInstnId>\n" +
//                "\t\t\t\t\t\t</FIId>\n" +
//                "\t\t\t\t\t  </Fr>\n" +
//                "\t\t\t\t\t  <To>\n" +
//                "\t\t\t\t\t\t<FIId>\n" +
//                "\t\t\t\t\t\t  <FinInstnId>\n" +
//                "\t\t\t\t\t\t\t<BICFI>BBHOBDDH</BICFI>\n" +
//                "\t\t\t\t\t\t  </FinInstnId>\n" +
//                "\t\t\t\t\t\t</FIId>\n" +
//                "\t\t\t\t\t  </To>\n" +
//                "\t\t\t\t\t  <BizMsgIdr>230330CIBLBDDHAXXX0008147611</BizMsgIdr>\n" +
//                "\t\t\t\t\t  <MsgDefIdr>camt.018.001.03</MsgDefIdr>\n" +
//                "\t\t\t\t\t  <BizSvc>RTGS</BizSvc>\n" +
//                "\t\t\t\t\t  <CreDt>2023-05-08T15:43:04Z</CreDt>\n" +
//                "\t\t\t\t\t</AppHdr:AppHdr>\n" +
//                "\t\t\t\t\t<Document xmlns=\"urn:swift:xsd:camt.018.001.03\">\n" +
//                "\t\t\t\t\t  <GetBizDayInf>\n" +
//                "\t\t\t\t\t\t<MsgHdr>\n" +
//                "\t\t\t\t\t\t  <MsgId>2253923238148433</MsgId>\n" +
//                "\t\t\t\t\t\t  <CreDtTm>2023-05-08T15:43:04</CreDtTm>\n" +
//                "\t\t\t\t\t\t</MsgHdr>\n" +
//                "\t\t\t\t\t\t<BizDayInfQryDef>\n" +
//                "\t\t\t\t\t\t  <Crit>\n" +
//                "\t\t\t\t\t\t\t<NewCrit>\n" +
//                "\t\t\t\t\t\t\t  <SchCrit>\n" +
//                "\t\t\t\t\t\t\t\t<EvtTp>\n" +
//                "\t\t\t\t\t\t\t\t  <Prtry>\n" +
//                "\t\t\t\t\t\t\t\t\t<Id>GETBUSINESSDAYPERIOD</Id>\n" +
//                "\t\t\t\t\t\t\t\t  </Prtry>\n" +
//                "\t\t\t\t\t\t\t\t</EvtTp>\n" +
//                "\t\t\t\t\t\t\t  </SchCrit>\n" +
//                "\t\t\t\t\t\t\t</NewCrit>\n" +
//                "\t\t\t\t\t\t  </Crit>\n" +
//                "\t\t\t\t\t\t</BizDayInfQryDef>\n" +
//                "\t\t\t\t\t  </GetBizDayInf>\n" +
//                "\t\t\t\t\t</Document>\n" +
//                "\t\t\t\t</Saa:Body>\n" +
//                "\t\t\t</Saa:DataPDU>]]>");
//        paramsMtMsg.setMsgPriority("11");
//        paramsMtMsg.setMsgReceiver("BBHOBDDHXRTG");
//        paramsMtMsg.setMsgSender("CIBLBDDHAXXX");
//        paramsMtMsg.setMsgType("camt.018.001.03");
//        paramsMtMsg.setMsgUserReference("FT1337664429");
//        paramsMtMsg.setFormat("MX");
//        paramsMtMsg.setMsgNetMir("230330CIBLBDDHAXXX0008147611");
//        request.setMessage(paramsMtMsg);
//        log.info("Requesting: {}", request);


        String soapEndpointUrl = Constant.URL;
        String soapAction = Constant.URL + "send";

        return callSoapWebService(soapEndpointUrl, soapAction);



//        JAXBElement<SendResponse> response = (JAXBElement<SendResponse>) getWebServiceTemplate()
//                .marshalSendAndReceive(Constant.URL, request);
    }

    private SOAPMessage callSoapWebService(String soapEndpointUrl, String soapAction){

        try {
            SOAPConnectionFactory soapConnectionFactory = SOAPConnectionFactory.newInstance();
            SOAPConnection soapConnection = soapConnectionFactory.createConnection();
            SOAPMessage response = soapConnection.call(createSOAPRequest(soapAction), soapEndpointUrl);
            log.info("Response: {}", response);
            soapConnection.close();

            return response;
        } catch (Exception e) {
            log.error("Error: {}", e.getMessage());
        }

        return null;
    }

    private SOAPMessage createSOAPRequest(String soapAction) {

        try {
            MessageFactory messageFactory = MessageFactory.newInstance(SOAPConstants.SOAP_1_1_CONTENT_TYPE);
            SOAPMessage soapMessage = messageFactory.createMessage();
            createSoapEnvelope(soapMessage);

            MimeHeaders headers = soapMessage.getMimeHeaders();
            headers.addHeader("SOAPAction", soapAction);

            soapMessage.saveChanges();
            System.out.println("Request SOAP Message:");
            soapMessage.writeTo(System.out);
            System.out.println("\n");

            return soapMessage;
        } catch (SOAPException | IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void createSoapEnvelope(SOAPMessage soapMessage) {

        SOAPPart soapPart = soapMessage.getSOAPPart();

        String myNamespace = "int";
        String myNamespaceURI = "http://integration.gwclient.smallsystems.cma.se/";

        try {
            SOAPEnvelope envelope = soapPart.getEnvelope();
            envelope.addNamespaceDeclaration(myNamespace, myNamespaceURI);

            SOAPBody body = envelope.getBody();

            SOAPElement send = body.addChildElement("send", myNamespace);

            SOAPElement message = send.addChildElement("message");

            SOAPElement block4 = message.addChildElement("block4");
            block4.addTextNode("Test");

            SOAPElement msgPriority = message.addChildElement("msgPriority");
            msgPriority.addTextNode("11");


        } catch (SOAPException e) {
            throw new RuntimeException(e);
        }

    }

}
