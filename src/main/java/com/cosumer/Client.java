package com.cosumer;

import com.cosumer.client.ParamsMtMsg;
import com.cosumer.client.SendResponse;
import com.cosumer.client.SendT;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import javax.xml.bind.JAXBElement;

@Slf4j
public class Client extends WebServiceGatewaySupport {

    public JAXBElement<SendResponse> getResponse() {

        SendT request = new SendT();
        ParamsMtMsg paramsMtMsg = new ParamsMtMsg();
        paramsMtMsg.setMsgAmount("Test");
        paramsMtMsg.setBlock4("Test");
        paramsMtMsg.setMsgCopySrvId("Test");
        request.setMessage(paramsMtMsg);

        log.info("Requesting...");

        JAXBElement<SendResponse> response = (JAXBElement<SendResponse>) getWebServiceTemplate()
                .marshalSendAndReceive(
                        Constant.URL, request,
                        new SoapActionCallback( Constant.URL + "send")
                );

        return response;
    }
}
