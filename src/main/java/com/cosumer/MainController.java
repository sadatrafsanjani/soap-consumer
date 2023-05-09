package com.cosumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.xml.soap.*;
import java.io.IOException;

@Slf4j
@RestController
@RequestMapping("/api")
public class MainController {

    @GetMapping
    public ResponseEntity index(){

        String soapEndpointUrl = Constant.URL;
        String soapAction = Constant.URL;
        SOAPMessage response = callSoapWebService(soapEndpointUrl, soapAction);



        try {

            SOAPBody body = response.getSOAPPart().getEnvelope().getBody();

            log.info("Response: {}", body.getChildNodes().item(0).getTextContent());

            return new ResponseEntity(HttpStatus.OK);

        } catch (SOAPException e) {
            throw new RuntimeException(e);
        }


    }

    private SOAPMessage callSoapWebService(String soapEndpointUrl, String soapAction){

        try {
            SOAPConnectionFactory soapConnectionFactory = SOAPConnectionFactory.newInstance();
            SOAPConnection soapConnection = soapConnectionFactory.createConnection();
            SOAPMessage response = soapConnection.call(createSOAPRequest(soapAction), soapEndpointUrl);
            soapConnection.close();

            return response;
        } catch (Exception e) {
            log.error("Error: {}", e.getMessage());
        }

        return null;
    }

    private SOAPMessage createSOAPRequest(String soapAction) {

        try {
            MessageFactory messageFactory = MessageFactory.newInstance();
            SOAPMessage soapMessage = messageFactory.createMessage();
            createSoapEnvelope(soapMessage);


            soapMessage.saveChanges();
            System.out.println("Request SOAP Message:");
            soapMessage.writeTo(System.out);
            System.out.println("");

            return soapMessage;
        } catch (SOAPException | IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void createSoapEnvelope(SOAPMessage soapMessage) {
        
        String request = "<![CDATA[<Saa:DataPDU xmlns:Saa=\"urn:swift:saa:xsd:saa.2.0\" xmlns:Sw=\"urn:swift:snl:ns.Sw\" xmlns:SwGbl=\"urn:swift:snl:ns.SwGbl\" xmlns:SwInt=\"urn:swift:snl:ns.SwInt\" xmlns:SwSec=\"urn:swift:snl:ns.SwSec\">" +
                "<Saa:Body>" +
                "<AppHdr:AppHdr xmlns=\"urn:iso:std:iso:20022:tech:xsd:head.001.001.01\" xmlns:AppHdr=\"urn:iso:std:iso:20022:tech:xsd:head.001.001.01\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">" +
                "<Fr>" +
                "<FIId>" +
                "<FinInstnId>" +
                "<BICFI>CIBLBDDH</BICFI>" +
                "</FinInstnId>" +
                "</FIId>" +
                "</Fr>" +
                "<To>" +
                "<FIId>" +
                "<FinInstnId>" +
                "<BICFI>BBHOBDDH</BICFI>" +
                "</FinInstnId>" +
                "</FIId>" +
                "</To>" +
                "<BizMsgIdr>230509CIBLBDDHAXXX0008145559</BizMsgIdr>" +
                "<MsgDefIdr>camt.018.001.03</MsgDefIdr>" +
                "<BizSvc>RTGS</BizSvc>" +
                "<CreDt>2023-05-09T16:59:04Z</CreDt>" +
                "</AppHdr:AppHdr>" +
                "<Document xmlns=\"urn:swift:xsd:camt.018.001.03\">" +
                "<GetBizDayInf>" +
                "<MsgHdr>" +
                "<MsgId>225392323812555</MsgId>" +
                "<CreDtTm>2023-05-09T16:59:04</CreDtTm>" +
                "</MsgHdr>" +
                "<BizDayInfQryDef>" +
                "<Crit>" +
                "<NewCrit>" +
                "<SchCrit>" +
                "<EvtTp>" +
                "<Prtry>" +
                "<Id>GETBUSINESSDAYPERIOD</Id>" +
                "</Prtry>" +
                "</EvtTp>" +
                "</SchCrit>" +
                "</NewCrit>" +
                "</Crit>" +
                "</BizDayInfQryDef>" +
                "</GetBizDayInf>" +
                "</Document>" +
                "</Saa:Body>" +
                "</Saa:DataPDU>]]>";

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
            block4.addTextNode(request);

            SOAPElement msgPriority = message.addChildElement("msgPriority");
            msgPriority.addTextNode("11");

            SOAPElement msgReceiver = message.addChildElement("msgReceiver");
            msgReceiver.addTextNode("BBHOBDDHXRTG");

            SOAPElement msgSender = message.addChildElement("msgSender");
            msgSender.addTextNode("CIBLBDDHAXXX");

            SOAPElement msgType = message.addChildElement("msgType");
            msgType.addTextNode("camt.018.001.03");

            SOAPElement msgUserReference = message.addChildElement("msgUserReference");
            msgUserReference.addTextNode("FT1337664133");

            SOAPElement format = message.addChildElement("format");
            format.addTextNode("MX");

            SOAPElement msgNetMir = message.addChildElement("msgNetMir");
            msgNetMir.addTextNode("230509CIBLBDDHAXXX0008145559");


        } catch (SOAPException e) {
            throw new RuntimeException(e);
        }

    }
}
