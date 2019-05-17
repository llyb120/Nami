package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_message")
public class RaMessage   {
	
	/*
	短消息索引id
	*/
	private Integer messageId ;
	/*
	短消息发送人
	*/
	private Integer fromMemberId ;
	/*
	站内信是否为一条发给多个用户 0为否 1为多条 
	*/
	private Integer messageIsmore ;
	/*
	短消息打开状态
	*/
	private Integer messageOpen ;
	/*
	回复短消息message_id
	*/
	private Integer messageParentId ;
	/*
	短消息状态，0为正常状态，1为发送人删除状态，2为接收人删除状态
	*/
	private Integer messageState ;
	/*
	0为私信、1为系统消息、2为留言
	*/
	private Integer messageType ;
	/*
	已经删除该消息的会员id
	*/
	private String delMemberId ;
	/*
	发信息人用户名
	*/
	private String fromMemberName ;
	/*
	短消息内容
	*/
	private String messageBody ;
	/*
	短消息发送时间
	*/
	private String messageTime ;
	/*
	短消息标题
	*/
	private String messageTitle ;
	/*
	短消息回复更新时间
	*/
	private String messageUpdateTime ;
	/*
	已经读过该消息的会员id
	*/
	private String readMemberId ;
	/*
	短消息接收人
	*/
	private String toMemberId ;
	/*
	接收人用户名
	*/
	private String toMemberName ;
	
	public RaMessage() {
	}
	
	/**
	* 短消息索引id
	*@return 
	*/
	public Integer getMessageId(){
		return  messageId;
	}
	/**
	* 短消息索引id
	*@param  messageId
	*/
	public void setMessageId(Integer messageId ){
		this.messageId = messageId;
	}
	
	/**
	* 短消息发送人
	*@return 
	*/
	public Integer getFromMemberId(){
		return  fromMemberId;
	}
	/**
	* 短消息发送人
	*@param  fromMemberId
	*/
	public void setFromMemberId(Integer fromMemberId ){
		this.fromMemberId = fromMemberId;
	}
	
	/**
	* 站内信是否为一条发给多个用户 0为否 1为多条 
	*@return 
	*/
	public Integer getMessageIsmore(){
		return  messageIsmore;
	}
	/**
	* 站内信是否为一条发给多个用户 0为否 1为多条 
	*@param  messageIsmore
	*/
	public void setMessageIsmore(Integer messageIsmore ){
		this.messageIsmore = messageIsmore;
	}
	
	/**
	* 短消息打开状态
	*@return 
	*/
	public Integer getMessageOpen(){
		return  messageOpen;
	}
	/**
	* 短消息打开状态
	*@param  messageOpen
	*/
	public void setMessageOpen(Integer messageOpen ){
		this.messageOpen = messageOpen;
	}
	
	/**
	* 回复短消息message_id
	*@return 
	*/
	public Integer getMessageParentId(){
		return  messageParentId;
	}
	/**
	* 回复短消息message_id
	*@param  messageParentId
	*/
	public void setMessageParentId(Integer messageParentId ){
		this.messageParentId = messageParentId;
	}
	
	/**
	* 短消息状态，0为正常状态，1为发送人删除状态，2为接收人删除状态
	*@return 
	*/
	public Integer getMessageState(){
		return  messageState;
	}
	/**
	* 短消息状态，0为正常状态，1为发送人删除状态，2为接收人删除状态
	*@param  messageState
	*/
	public void setMessageState(Integer messageState ){
		this.messageState = messageState;
	}
	
	/**
	* 0为私信、1为系统消息、2为留言
	*@return 
	*/
	public Integer getMessageType(){
		return  messageType;
	}
	/**
	* 0为私信、1为系统消息、2为留言
	*@param  messageType
	*/
	public void setMessageType(Integer messageType ){
		this.messageType = messageType;
	}
	
	/**
	* 已经删除该消息的会员id
	*@return 
	*/
	public String getDelMemberId(){
		return  delMemberId;
	}
	/**
	* 已经删除该消息的会员id
	*@param  delMemberId
	*/
	public void setDelMemberId(String delMemberId ){
		this.delMemberId = delMemberId;
	}
	
	/**
	* 发信息人用户名
	*@return 
	*/
	public String getFromMemberName(){
		return  fromMemberName;
	}
	/**
	* 发信息人用户名
	*@param  fromMemberName
	*/
	public void setFromMemberName(String fromMemberName ){
		this.fromMemberName = fromMemberName;
	}
	
	/**
	* 短消息内容
	*@return 
	*/
	public String getMessageBody(){
		return  messageBody;
	}
	/**
	* 短消息内容
	*@param  messageBody
	*/
	public void setMessageBody(String messageBody ){
		this.messageBody = messageBody;
	}
	
	/**
	* 短消息发送时间
	*@return 
	*/
	public String getMessageTime(){
		return  messageTime;
	}
	/**
	* 短消息发送时间
	*@param  messageTime
	*/
	public void setMessageTime(String messageTime ){
		this.messageTime = messageTime;
	}
	
	/**
	* 短消息标题
	*@return 
	*/
	public String getMessageTitle(){
		return  messageTitle;
	}
	/**
	* 短消息标题
	*@param  messageTitle
	*/
	public void setMessageTitle(String messageTitle ){
		this.messageTitle = messageTitle;
	}
	
	/**
	* 短消息回复更新时间
	*@return 
	*/
	public String getMessageUpdateTime(){
		return  messageUpdateTime;
	}
	/**
	* 短消息回复更新时间
	*@param  messageUpdateTime
	*/
	public void setMessageUpdateTime(String messageUpdateTime ){
		this.messageUpdateTime = messageUpdateTime;
	}
	
	/**
	* 已经读过该消息的会员id
	*@return 
	*/
	public String getReadMemberId(){
		return  readMemberId;
	}
	/**
	* 已经读过该消息的会员id
	*@param  readMemberId
	*/
	public void setReadMemberId(String readMemberId ){
		this.readMemberId = readMemberId;
	}
	
	/**
	* 短消息接收人
	*@return 
	*/
	public String getToMemberId(){
		return  toMemberId;
	}
	/**
	* 短消息接收人
	*@param  toMemberId
	*/
	public void setToMemberId(String toMemberId ){
		this.toMemberId = toMemberId;
	}
	
	/**
	* 接收人用户名
	*@return 
	*/
	public String getToMemberName(){
		return  toMemberName;
	}
	/**
	* 接收人用户名
	*@param  toMemberName
	*/
	public void setToMemberName(String toMemberName ){
		this.toMemberName = toMemberName;
	}
	

}
