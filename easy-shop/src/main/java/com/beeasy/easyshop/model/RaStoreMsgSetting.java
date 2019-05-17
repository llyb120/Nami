package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_store_msg_setting")
public class RaStoreMsgSetting   {
	
	// alias
	public static final String ALIAS_smt_code = "smt_code";
	public static final String ALIAS_store_id = "store_id";
	public static final String ALIAS_sms_mail_switch = "sms_mail_switch";
	public static final String ALIAS_sms_message_switch = "sms_message_switch";
	public static final String ALIAS_sms_short_switch = "sms_short_switch";
	public static final String ALIAS_sms_mail_number = "sms_mail_number";
	public static final String ALIAS_sms_short_number = "sms_short_number";
	
	/*
	模板编码
	*/
	private String smt_code ;
	/*
	店铺id
	*/
	private Integer store_id ;
	/*
	邮件接收开关，0关闭，1开启
	*/
	private Integer sms_mail_switch ;
	/*
	站内信接收开关，0关闭，1开启
	*/
	private Integer sms_message_switch ;
	/*
	短消息接收开关，0关闭，1开启
	*/
	private Integer sms_short_switch ;
	/*
	邮箱号码
	*/
	private String sms_mail_number ;
	/*
	手机号码
	*/
	private String sms_short_number ;
	
	public RaStoreMsgSetting() {
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
	* 店铺id
	*@return 
	*/
	public Integer getStore_id(){
		return  store_id;
	}
	/**
	* 店铺id
	*@param  store_id
	*/
	public void setStore_id(Integer store_id ){
		this.store_id = store_id;
	}
	
	/**
	* 邮件接收开关，0关闭，1开启
	*@return 
	*/
	public Integer getSms_mail_switch(){
		return  sms_mail_switch;
	}
	/**
	* 邮件接收开关，0关闭，1开启
	*@param  sms_mail_switch
	*/
	public void setSms_mail_switch(Integer sms_mail_switch ){
		this.sms_mail_switch = sms_mail_switch;
	}
	
	/**
	* 站内信接收开关，0关闭，1开启
	*@return 
	*/
	public Integer getSms_message_switch(){
		return  sms_message_switch;
	}
	/**
	* 站内信接收开关，0关闭，1开启
	*@param  sms_message_switch
	*/
	public void setSms_message_switch(Integer sms_message_switch ){
		this.sms_message_switch = sms_message_switch;
	}
	
	/**
	* 短消息接收开关，0关闭，1开启
	*@return 
	*/
	public Integer getSms_short_switch(){
		return  sms_short_switch;
	}
	/**
	* 短消息接收开关，0关闭，1开启
	*@param  sms_short_switch
	*/
	public void setSms_short_switch(Integer sms_short_switch ){
		this.sms_short_switch = sms_short_switch;
	}
	
	/**
	* 邮箱号码
	*@return 
	*/
	public String getSms_mail_number(){
		return  sms_mail_number;
	}
	/**
	* 邮箱号码
	*@param  sms_mail_number
	*/
	public void setSms_mail_number(String sms_mail_number ){
		this.sms_mail_number = sms_mail_number;
	}
	
	/**
	* 手机号码
	*@return 
	*/
	public String getSms_short_number(){
		return  sms_short_number;
	}
	/**
	* 手机号码
	*@param  sms_short_number
	*/
	public void setSms_short_number(String sms_short_number ){
		this.sms_short_number = sms_short_number;
	}
	

}
