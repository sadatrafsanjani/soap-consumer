//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.04.29 at 01:31:32 AM BDT 
//


package com.cosumer.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParamsMtMsg complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParamsMtMsg"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="block4" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="msgCopySrvId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="msgCopySrvInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="msgDelNotifRq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="msgFinValidation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="msgFormat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="msgId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="msgMacResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="msgNetInputTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="msgNetMir" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="msgNetOutputDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="msgPacResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="msgPde" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="msgPdm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="msgPriority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="msgReceiver" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="msgSender" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="msgSequence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="msgSession" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="msgSubFormat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="msgType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="msgSrvTpId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="msgEnd2EndRef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="msgUserPriority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="msgUserReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="format" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="refMsgUserReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="msgNumOfBatches" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="msgAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParamsMtMsg", propOrder = {
    "block4",
    "msgCopySrvId",
    "msgCopySrvInfo",
    "msgDelNotifRq",
    "msgFinValidation",
    "msgFormat",
    "msgId",
    "msgMacResult",
    "msgNetInputTime",
    "msgNetMir",
    "msgNetOutputDate",
    "msgPacResult",
    "msgPde",
    "msgPdm",
    "msgPriority",
    "msgReceiver",
    "msgSender",
    "msgSequence",
    "msgSession",
    "msgSubFormat",
    "msgType",
    "msgSrvTpId",
    "msgEnd2EndRef",
    "msgUserPriority",
    "msgUserReference",
    "format",
    "refMsgUserReference",
    "msgNumOfBatches",
    "msgAmount"
})
public class ParamsMtMsg {

    @XmlElement(required = true)
    protected String block4;
    protected String msgCopySrvId;
    protected String msgCopySrvInfo;
    protected String msgDelNotifRq;
    protected String msgFinValidation;
    protected String msgFormat;
    protected Long msgId;
    protected String msgMacResult;
    protected String msgNetInputTime;
    protected String msgNetMir;
    protected String msgNetOutputDate;
    protected String msgPacResult;
    protected String msgPde;
    protected String msgPdm;
    protected String msgPriority;
    @XmlElement(required = true)
    protected String msgReceiver;
    @XmlElement(required = true)
    protected String msgSender;
    protected String msgSequence;
    protected String msgSession;
    protected String msgSubFormat;
    @XmlElement(required = true)
    protected String msgType;
    protected String msgSrvTpId;
    protected String msgEnd2EndRef;
    protected String msgUserPriority;
    protected String msgUserReference;
    @XmlElement(required = true)
    protected String format;
    protected String refMsgUserReference;
    protected Integer msgNumOfBatches;
    protected String msgAmount;

    /**
     * Gets the value of the block4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlock4() {
        return block4;
    }

    /**
     * Sets the value of the block4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlock4(String value) {
        this.block4 = value;
    }

    /**
     * Gets the value of the msgCopySrvId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgCopySrvId() {
        return msgCopySrvId;
    }

    /**
     * Sets the value of the msgCopySrvId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgCopySrvId(String value) {
        this.msgCopySrvId = value;
    }

    /**
     * Gets the value of the msgCopySrvInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgCopySrvInfo() {
        return msgCopySrvInfo;
    }

    /**
     * Sets the value of the msgCopySrvInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgCopySrvInfo(String value) {
        this.msgCopySrvInfo = value;
    }

    /**
     * Gets the value of the msgDelNotifRq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgDelNotifRq() {
        return msgDelNotifRq;
    }

    /**
     * Sets the value of the msgDelNotifRq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgDelNotifRq(String value) {
        this.msgDelNotifRq = value;
    }

    /**
     * Gets the value of the msgFinValidation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgFinValidation() {
        return msgFinValidation;
    }

    /**
     * Sets the value of the msgFinValidation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgFinValidation(String value) {
        this.msgFinValidation = value;
    }

    /**
     * Gets the value of the msgFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgFormat() {
        return msgFormat;
    }

    /**
     * Sets the value of the msgFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgFormat(String value) {
        this.msgFormat = value;
    }

    /**
     * Gets the value of the msgId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMsgId() {
        return msgId;
    }

    /**
     * Sets the value of the msgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMsgId(Long value) {
        this.msgId = value;
    }

    /**
     * Gets the value of the msgMacResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgMacResult() {
        return msgMacResult;
    }

    /**
     * Sets the value of the msgMacResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgMacResult(String value) {
        this.msgMacResult = value;
    }

    /**
     * Gets the value of the msgNetInputTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgNetInputTime() {
        return msgNetInputTime;
    }

    /**
     * Sets the value of the msgNetInputTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgNetInputTime(String value) {
        this.msgNetInputTime = value;
    }

    /**
     * Gets the value of the msgNetMir property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgNetMir() {
        return msgNetMir;
    }

    /**
     * Sets the value of the msgNetMir property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgNetMir(String value) {
        this.msgNetMir = value;
    }

    /**
     * Gets the value of the msgNetOutputDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgNetOutputDate() {
        return msgNetOutputDate;
    }

    /**
     * Sets the value of the msgNetOutputDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgNetOutputDate(String value) {
        this.msgNetOutputDate = value;
    }

    /**
     * Gets the value of the msgPacResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgPacResult() {
        return msgPacResult;
    }

    /**
     * Sets the value of the msgPacResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgPacResult(String value) {
        this.msgPacResult = value;
    }

    /**
     * Gets the value of the msgPde property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgPde() {
        return msgPde;
    }

    /**
     * Sets the value of the msgPde property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgPde(String value) {
        this.msgPde = value;
    }

    /**
     * Gets the value of the msgPdm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgPdm() {
        return msgPdm;
    }

    /**
     * Sets the value of the msgPdm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgPdm(String value) {
        this.msgPdm = value;
    }

    /**
     * Gets the value of the msgPriority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgPriority() {
        return msgPriority;
    }

    /**
     * Sets the value of the msgPriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgPriority(String value) {
        this.msgPriority = value;
    }

    /**
     * Gets the value of the msgReceiver property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgReceiver() {
        return msgReceiver;
    }

    /**
     * Sets the value of the msgReceiver property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgReceiver(String value) {
        this.msgReceiver = value;
    }

    /**
     * Gets the value of the msgSender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgSender() {
        return msgSender;
    }

    /**
     * Sets the value of the msgSender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgSender(String value) {
        this.msgSender = value;
    }

    /**
     * Gets the value of the msgSequence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgSequence() {
        return msgSequence;
    }

    /**
     * Sets the value of the msgSequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgSequence(String value) {
        this.msgSequence = value;
    }

    /**
     * Gets the value of the msgSession property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgSession() {
        return msgSession;
    }

    /**
     * Sets the value of the msgSession property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgSession(String value) {
        this.msgSession = value;
    }

    /**
     * Gets the value of the msgSubFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgSubFormat() {
        return msgSubFormat;
    }

    /**
     * Sets the value of the msgSubFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgSubFormat(String value) {
        this.msgSubFormat = value;
    }

    /**
     * Gets the value of the msgType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgType() {
        return msgType;
    }

    /**
     * Sets the value of the msgType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgType(String value) {
        this.msgType = value;
    }

    /**
     * Gets the value of the msgSrvTpId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgSrvTpId() {
        return msgSrvTpId;
    }

    /**
     * Sets the value of the msgSrvTpId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgSrvTpId(String value) {
        this.msgSrvTpId = value;
    }

    /**
     * Gets the value of the msgEnd2EndRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgEnd2EndRef() {
        return msgEnd2EndRef;
    }

    /**
     * Sets the value of the msgEnd2EndRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgEnd2EndRef(String value) {
        this.msgEnd2EndRef = value;
    }

    /**
     * Gets the value of the msgUserPriority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgUserPriority() {
        return msgUserPriority;
    }

    /**
     * Sets the value of the msgUserPriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgUserPriority(String value) {
        this.msgUserPriority = value;
    }

    /**
     * Gets the value of the msgUserReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgUserReference() {
        return msgUserReference;
    }

    /**
     * Sets the value of the msgUserReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgUserReference(String value) {
        this.msgUserReference = value;
    }

    /**
     * Gets the value of the format property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormat() {
        return format;
    }

    /**
     * Sets the value of the format property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormat(String value) {
        this.format = value;
    }

    /**
     * Gets the value of the refMsgUserReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefMsgUserReference() {
        return refMsgUserReference;
    }

    /**
     * Sets the value of the refMsgUserReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefMsgUserReference(String value) {
        this.refMsgUserReference = value;
    }

    /**
     * Gets the value of the msgNumOfBatches property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMsgNumOfBatches() {
        return msgNumOfBatches;
    }

    /**
     * Sets the value of the msgNumOfBatches property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMsgNumOfBatches(Integer value) {
        this.msgNumOfBatches = value;
    }

    /**
     * Gets the value of the msgAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgAmount() {
        return msgAmount;
    }

    /**
     * Sets the value of the msgAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgAmount(String value) {
        this.msgAmount = value;
    }

}
