package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_store_msg_tpl")
public class RaStoreMsgTpl   {
	
	// alias
	public static final String ALIAS_smt_code = "smt_code";
	public static final String ALIAS_smt_mail_forced = "smt_mail_forced";
	public static final String ALIAS_smt_mail_switch = "smt_mail_switch";
	public static final String ALIAS_smt_message_forced = "smt_message_forced";
	public static final String ALIAS_smt_message_switch = "smt_message_switch";
	public static final String ALIAS_smt_short_forced = "smt_short_forced";
	public static final String ALIAS_smt_short_switch = "smt_short_switch";
	public static final String ALIAS_smt_mail_content = "smt_mail_content";
	public static final String ALIAS_smt_mail_subject = "smt_mail_subject";
	public static final String ALIAS_smt_message_content = "smt_message_content";
	public static final String ALIAS_smt_name = "smt_name";
	public static final String ALIAS_smt_short_content = "smt_short_content";
	
	/*
	模板编码
	*/
	private String smt_code ;
	/*
	邮件强制接收，0否，1是
	*/
	private Integer smt_mail_forced ;
	/*
	邮件默认开，0关，1开
	*/
	private Integer smt_mail_switch ;
	/*
	站内信强制接收，0否，1是
	*/
	private Integer smt_message_forced ;
	/*
	站内信默认开关，0关，1开
	*/
	private Integer smt_message_switch ;
	/*
	短信强制接收，0否，1是
	*/
	private Integer smt_short_forced ;
	/*
	短信默认开关，0关，1开
	*/
	private Integer smt_short_switch ;
	/*
	邮件内容
	*/
	private String smt_mail_content ;
	/*
	邮件标题
	*/
	private String smt_mail_subject ;
	/*
	站内信内容
	*/
	private String smt_message_content ;
	/*
	模板名称
	*/
	private String smt_name ;
	/*
	短信内容
	*/
	private String smt_short_content ;
	
	public RaStoreMsgTpl() {
	}
	
	/**
	* 模板编码
	*@return 
	*/
	public String getSmt_code(){
		return  smt_code;
	}
	/**
	* 模板编码
	*@param  smt_code
	*/
	public void setSmt_code(String smt_code ){
		this.smt_code = smt_code;
	}
	
	/**
	* 邮件强制接收，0否，1是
	*@return 
	*/
	public Integer getSmt_mail_forced(){
		return  smt_mail_forced;
	}
	/**
	* 邮件强制接收，0否，1是
	*@param  smt_mail_forced
	*/
	public void setSmt_mail_forced(Integer smt_mail_forced ){
		this.smt_mail_forced = smt_mail_forced;
	}
	
	/**
	* 邮件默认开，0关，1开
	*@return 
	*/
	public Integer getSmt_mail_switch(){
		return  smt_mail_switch;
	}
	/**
	* 邮件默认开，0关，1开
	*@param  smt_mail_switch
	*/
	public void setSmt_mail_switch(Integer smt_mail_switch ){
		this.smt_mail_switch = smt_mail_switch;
	}
	
	/**
	* 站内信强制接收，0否，1是
	*@return 
	*/
	public Integer getSmt_message_forced(){
		return  smt_message_forced;
	}
	/**
	* 站内信强制接收，0否，1是
	*@param  smt_message_forced
	*/
	public void setSmt_message_forced(Integer smt_message_forced ){
		this.smt_message_forced = smt_message_forced;
	}
	
	/**
	* 站内信默认开关，0关，1开
	*@return 
	*/
	public Integer getSmt_message_switch(){
		return  smt_message_switch;
	}
	/**
	* 站内信默认开关，0关，1开
	*@param  smt_message_switch
	*/
	public void setSmt_message_switch(Integer smt_message_switch ){
		this.smt_message_switch = smt_message_switch;
	}
	
	/**
	* 短信强制接收，0否，1是
	*@return 
	*/
	public Integer getSmt_short_forced(){
		return  smt_short_forced;
	}
	/**
	* 短信强制接收，0否，1是
	*@param  smt_short_forced
	*/
	public void setSmt_short_forced(Integer smt_short_forced ){
		this.smt_short_forced = smt_short_forced;
	}
	
	/**
	* 短信默认开关，0关，1开
	*@return 
	*/
	public Integer getSmt_short_switch(){
		return  smt_short_switch;
	}
	/**
	* 短信默认开关，0关，1开
	*@param  smt_short_switch
	*/
	public void setSmt_short_switch(Integer smt_short_switch ){
		this.smt_short_switch = smt_short_switch;
	}
	
	/**
	* 邮件内容
	*@return 
	*/
	public String getSmt_mail_content(){
		return  smt_mail_content;
	}
	/**
	* 邮件内容
	*@param  smt_mail_content
	*/
	public void setSmt_mail_content(String smt_mail_content ){
		this.smt_mail_content = smt_mail_content;
	}
	
	/**
	* 邮件标题
	*@return 
	*/
	public String getSmt_mail_subject(){
		return  smt_mail_subject;
	}
	/**
	* 邮件标题
	*@param  smt_mail_subject
	*/
	public void setSmt_mail_subject(String smt_mail_subject ){
		this.smt_mail_subject = smt_mail_subject;
	}
	
	/**
	* 站内信内容
	*@return 
	*/
	public String getSmt_message_content(){
		return  smt_message_content;
	}
	/**
	* 站内信内容
	*@param  smt_message_content
	*/
	public void setSmt_message_content(String smt_message_content ){
		this.smt_message_content = smt_message_content;
	}
	
	/**
	* 模板名称
	*@return 
	*/
	public String getSmt_name(){
		return  smt_name;
	}
	/**
	* 模板名称
	*@param  smt_name
	*/
	public void setSmt_name(String smt_name ){
		this.smt_name = smt_name;
	}
	
	/**
	* 短信内容
	*@return 
	*/
	public String getSmt_short_content(){
		return  smt_short_content;
	}
	/**
	* 短信内容
	*@param  smt_short_content
	*/
	public void setSmt_short_content(String smt_short_content ){
		this.smt_short_content = smt_short_content;
	}
	

}
