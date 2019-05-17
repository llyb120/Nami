package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_member_msg_tpl")
public class RaMemberMsgTpl   {
	
	/*
	用户消息模板编号
	*/
	private String mmtCode ;
	/*
	邮件接收开关
	*/
	private Integer mmtMailSwitch ;
	/*
	站内信接收开关
	*/
	private Integer mmtMessageSwitch ;
	/*
	短信接收开关
	*/
	private Integer mmtShortSwitch ;
	/*
	邮件内容
	*/
	private String mmtMailContent ;
	/*
	邮件标题
	*/
	private String mmtMailSubject ;
	/*
	站内信消息内容
	*/
	private String mmtMessageContent ;
	/*
	模板名称
	*/
	private String mmtName ;
	/*
	短信接收内容
	*/
	private String mmtShortContent ;
	
	public RaMemberMsgTpl() {
	}
	
	/**
	* 用户消息模板编号
	*@return 
	*/
	public String getMmtCode(){
		return  mmtCode;
	}
	/**
	* 用户消息模板编号
	*@param  mmtCode
	*/
	public void setMmtCode(String mmtCode ){
		this.mmtCode = mmtCode;
	}
	
	/**
	* 邮件接收开关
	*@return 
	*/
	public Integer getMmtMailSwitch(){
		return  mmtMailSwitch;
	}
	/**
	* 邮件接收开关
	*@param  mmtMailSwitch
	*/
	public void setMmtMailSwitch(Integer mmtMailSwitch ){
		this.mmtMailSwitch = mmtMailSwitch;
	}
	
	/**
	* 站内信接收开关
	*@return 
	*/
	public Integer getMmtMessageSwitch(){
		return  mmtMessageSwitch;
	}
	/**
	* 站内信接收开关
	*@param  mmtMessageSwitch
	*/
	public void setMmtMessageSwitch(Integer mmtMessageSwitch ){
		this.mmtMessageSwitch = mmtMessageSwitch;
	}
	
	/**
	* 短信接收开关
	*@return 
	*/
	public Integer getMmtShortSwitch(){
		return  mmtShortSwitch;
	}
	/**
	* 短信接收开关
	*@param  mmtShortSwitch
	*/
	public void setMmtShortSwitch(Integer mmtShortSwitch ){
		this.mmtShortSwitch = mmtShortSwitch;
	}
	
	/**
	* 邮件内容
	*@return 
	*/
	public String getMmtMailContent(){
		return  mmtMailContent;
	}
	/**
	* 邮件内容
	*@param  mmtMailContent
	*/
	public void setMmtMailContent(String mmtMailContent ){
		this.mmtMailContent = mmtMailContent;
	}
	
	/**
	* 邮件标题
	*@return 
	*/
	public String getMmtMailSubject(){
		return  mmtMailSubject;
	}
	/**
	* 邮件标题
	*@param  mmtMailSubject
	*/
	public void setMmtMailSubject(String mmtMailSubject ){
		this.mmtMailSubject = mmtMailSubject;
	}
	
	/**
	* 站内信消息内容
	*@return 
	*/
	public String getMmtMessageContent(){
		return  mmtMessageContent;
	}
	/**
	* 站内信消息内容
	*@param  mmtMessageContent
	*/
	public void setMmtMessageContent(String mmtMessageContent ){
		this.mmtMessageContent = mmtMessageContent;
	}
	
	/**
	* 模板名称
	*@return 
	*/
	public String getMmtName(){
		return  mmtName;
	}
	/**
	* 模板名称
	*@param  mmtName
	*/
	public void setMmtName(String mmtName ){
		this.mmtName = mmtName;
	}
	
	/**
	* 短信接收内容
	*@return 
	*/
	public String getMmtShortContent(){
		return  mmtShortContent;
	}
	/**
	* 短信接收内容
	*@param  mmtShortContent
	*/
	public void setMmtShortContent(String mmtShortContent ){
		this.mmtShortContent = mmtShortContent;
	}
	

}
