package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_member_msg_tpl")
public class RaMemberMsgTpl   {
	
	// alias
	public static final String ALIAS_mmt_code = "mmt_code";
	public static final String ALIAS_mmt_mail_switch = "mmt_mail_switch";
	public static final String ALIAS_mmt_message_switch = "mmt_message_switch";
	public static final String ALIAS_mmt_short_switch = "mmt_short_switch";
	public static final String ALIAS_mmt_mail_content = "mmt_mail_content";
	public static final String ALIAS_mmt_mail_subject = "mmt_mail_subject";
	public static final String ALIAS_mmt_message_content = "mmt_message_content";
	public static final String ALIAS_mmt_name = "mmt_name";
	public static final String ALIAS_mmt_short_content = "mmt_short_content";
	
	/*
	用户消息模板编号
	*/
	private String mmt_code ;
	/*
	邮件接收开关
	*/
	private Integer mmt_mail_switch ;
	/*
	站内信接收开关
	*/
	private Integer mmt_message_switch ;
	/*
	短信接收开关
	*/
	private Integer mmt_short_switch ;
	/*
	邮件内容
	*/
	private String mmt_mail_content ;
	/*
	邮件标题
	*/
	private String mmt_mail_subject ;
	/*
	站内信消息内容
	*/
	private String mmt_message_content ;
	/*
	模板名称
	*/
	private String mmt_name ;
	/*
	短信接收内容
	*/
	private String mmt_short_content ;
	
	public RaMemberMsgTpl() {
	}
	
	/**
	* 用户消息模板编号
	*@return 
	*/
	public String getMmt_code(){
		return  mmt_code;
	}
	/**
	* 用户消息模板编号
	*@param  mmt_code
	*/
	public void setMmt_code(String mmt_code ){
		this.mmt_code = mmt_code;
	}
	
	/**
	* 邮件接收开关
	*@return 
	*/
	public Integer getMmt_mail_switch(){
		return  mmt_mail_switch;
	}
	/**
	* 邮件接收开关
	*@param  mmt_mail_switch
	*/
	public void setMmt_mail_switch(Integer mmt_mail_switch ){
		this.mmt_mail_switch = mmt_mail_switch;
	}
	
	/**
	* 站内信接收开关
	*@return 
	*/
	public Integer getMmt_message_switch(){
		return  mmt_message_switch;
	}
	/**
	* 站内信接收开关
	*@param  mmt_message_switch
	*/
	public void setMmt_message_switch(Integer mmt_message_switch ){
		this.mmt_message_switch = mmt_message_switch;
	}
	
	/**
	* 短信接收开关
	*@return 
	*/
	public Integer getMmt_short_switch(){
		return  mmt_short_switch;
	}
	/**
	* 短信接收开关
	*@param  mmt_short_switch
	*/
	public void setMmt_short_switch(Integer mmt_short_switch ){
		this.mmt_short_switch = mmt_short_switch;
	}
	
	/**
	* 邮件内容
	*@return 
	*/
	public String getMmt_mail_content(){
		return  mmt_mail_content;
	}
	/**
	* 邮件内容
	*@param  mmt_mail_content
	*/
	public void setMmt_mail_content(String mmt_mail_content ){
		this.mmt_mail_content = mmt_mail_content;
	}
	
	/**
	* 邮件标题
	*@return 
	*/
	public String getMmt_mail_subject(){
		return  mmt_mail_subject;
	}
	/**
	* 邮件标题
	*@param  mmt_mail_subject
	*/
	public void setMmt_mail_subject(String mmt_mail_subject ){
		this.mmt_mail_subject = mmt_mail_subject;
	}
	
	/**
	* 站内信消息内容
	*@return 
	*/
	public String getMmt_message_content(){
		return  mmt_message_content;
	}
	/**
	* 站内信消息内容
	*@param  mmt_message_content
	*/
	public void setMmt_message_content(String mmt_message_content ){
		this.mmt_message_content = mmt_message_content;
	}
	
	/**
	* 模板名称
	*@return 
	*/
	public String getMmt_name(){
		return  mmt_name;
	}
	/**
	* 模板名称
	*@param  mmt_name
	*/
	public void setMmt_name(String mmt_name ){
		this.mmt_name = mmt_name;
	}
	
	/**
	* 短信接收内容
	*@return 
	*/
	public String getMmt_short_content(){
		return  mmt_short_content;
	}
	/**
	* 短信接收内容
	*@param  mmt_short_content
	*/
	public void setMmt_short_content(String mmt_short_content ){
		this.mmt_short_content = mmt_short_content;
	}
	

}
