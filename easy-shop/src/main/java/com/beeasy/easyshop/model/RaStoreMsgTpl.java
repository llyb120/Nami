package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_store_msg_tpl")
public class RaStoreMsgTpl   {
	
	/*
	模板编码
	*/
	private String smtCode ;
	/*
	邮件强制接收，0否，1是
	*/
	private Integer smtMailForced ;
	/*
	邮件默认开，0关，1开
	*/
	private Integer smtMailSwitch ;
	/*
	站内信强制接收，0否，1是
	*/
	private Integer smtMessageForced ;
	/*
	站内信默认开关，0关，1开
	*/
	private Integer smtMessageSwitch ;
	/*
	短信强制接收，0否，1是
	*/
	private Integer smtShortForced ;
	/*
	短信默认开关，0关，1开
	*/
	private Integer smtShortSwitch ;
	/*
	邮件内容
	*/
	private String smtMailContent ;
	/*
	邮件标题
	*/
	private String smtMailSubject ;
	/*
	站内信内容
	*/
	private String smtMessageContent ;
	/*
	模板名称
	*/
	private String smtName ;
	/*
	短信内容
	*/
	private String smtShortContent ;
	
	public RaStoreMsgTpl() {
	}
	
	/**
	* 模板编码
	*@return 
	*/
	public String getSmtCode(){
		return  smtCode;
	}
	/**
	* 模板编码
	*@param  smtCode
	*/
	public void setSmtCode(String smtCode ){
		this.smtCode = smtCode;
	}
	
	/**
	* 邮件强制接收，0否，1是
	*@return 
	*/
	public Integer getSmtMailForced(){
		return  smtMailForced;
	}
	/**
	* 邮件强制接收，0否，1是
	*@param  smtMailForced
	*/
	public void setSmtMailForced(Integer smtMailForced ){
		this.smtMailForced = smtMailForced;
	}
	
	/**
	* 邮件默认开，0关，1开
	*@return 
	*/
	public Integer getSmtMailSwitch(){
		return  smtMailSwitch;
	}
	/**
	* 邮件默认开，0关，1开
	*@param  smtMailSwitch
	*/
	public void setSmtMailSwitch(Integer smtMailSwitch ){
		this.smtMailSwitch = smtMailSwitch;
	}
	
	/**
	* 站内信强制接收，0否，1是
	*@return 
	*/
	public Integer getSmtMessageForced(){
		return  smtMessageForced;
	}
	/**
	* 站内信强制接收，0否，1是
	*@param  smtMessageForced
	*/
	public void setSmtMessageForced(Integer smtMessageForced ){
		this.smtMessageForced = smtMessageForced;
	}
	
	/**
	* 站内信默认开关，0关，1开
	*@return 
	*/
	public Integer getSmtMessageSwitch(){
		return  smtMessageSwitch;
	}
	/**
	* 站内信默认开关，0关，1开
	*@param  smtMessageSwitch
	*/
	public void setSmtMessageSwitch(Integer smtMessageSwitch ){
		this.smtMessageSwitch = smtMessageSwitch;
	}
	
	/**
	* 短信强制接收，0否，1是
	*@return 
	*/
	public Integer getSmtShortForced(){
		return  smtShortForced;
	}
	/**
	* 短信强制接收，0否，1是
	*@param  smtShortForced
	*/
	public void setSmtShortForced(Integer smtShortForced ){
		this.smtShortForced = smtShortForced;
	}
	
	/**
	* 短信默认开关，0关，1开
	*@return 
	*/
	public Integer getSmtShortSwitch(){
		return  smtShortSwitch;
	}
	/**
	* 短信默认开关，0关，1开
	*@param  smtShortSwitch
	*/
	public void setSmtShortSwitch(Integer smtShortSwitch ){
		this.smtShortSwitch = smtShortSwitch;
	}
	
	/**
	* 邮件内容
	*@return 
	*/
	public String getSmtMailContent(){
		return  smtMailContent;
	}
	/**
	* 邮件内容
	*@param  smtMailContent
	*/
	public void setSmtMailContent(String smtMailContent ){
		this.smtMailContent = smtMailContent;
	}
	
	/**
	* 邮件标题
	*@return 
	*/
	public String getSmtMailSubject(){
		return  smtMailSubject;
	}
	/**
	* 邮件标题
	*@param  smtMailSubject
	*/
	public void setSmtMailSubject(String smtMailSubject ){
		this.smtMailSubject = smtMailSubject;
	}
	
	/**
	* 站内信内容
	*@return 
	*/
	public String getSmtMessageContent(){
		return  smtMessageContent;
	}
	/**
	* 站内信内容
	*@param  smtMessageContent
	*/
	public void setSmtMessageContent(String smtMessageContent ){
		this.smtMessageContent = smtMessageContent;
	}
	
	/**
	* 模板名称
	*@return 
	*/
	public String getSmtName(){
		return  smtName;
	}
	/**
	* 模板名称
	*@param  smtName
	*/
	public void setSmtName(String smtName ){
		this.smtName = smtName;
	}
	
	/**
	* 短信内容
	*@return 
	*/
	public String getSmtShortContent(){
		return  smtShortContent;
	}
	/**
	* 短信内容
	*@param  smtShortContent
	*/
	public void setSmtShortContent(String smtShortContent ){
		this.smtShortContent = smtShortContent;
	}
	

}
