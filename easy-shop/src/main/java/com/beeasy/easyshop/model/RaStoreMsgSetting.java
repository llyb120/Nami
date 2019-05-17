package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_store_msg_setting")
public class RaStoreMsgSetting   {
	
	/*
	模板编码
	*/
	private String smtCode ;
	/*
	店铺id
	*/
	private Integer storeId ;
	/*
	邮件接收开关，0关闭，1开启
	*/
	private Integer smsMailSwitch ;
	/*
	站内信接收开关，0关闭，1开启
	*/
	private Integer smsMessageSwitch ;
	/*
	短消息接收开关，0关闭，1开启
	*/
	private Integer smsShortSwitch ;
	/*
	邮箱号码
	*/
	private String smsMailNumber ;
	/*
	手机号码
	*/
	private String smsShortNumber ;
	
	public RaStoreMsgSetting() {
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
	* 店铺id
	*@return 
	*/
	public Integer getStoreId(){
		return  storeId;
	}
	/**
	* 店铺id
	*@param  storeId
	*/
	public void setStoreId(Integer storeId ){
		this.storeId = storeId;
	}
	
	/**
	* 邮件接收开关，0关闭，1开启
	*@return 
	*/
	public Integer getSmsMailSwitch(){
		return  smsMailSwitch;
	}
	/**
	* 邮件接收开关，0关闭，1开启
	*@param  smsMailSwitch
	*/
	public void setSmsMailSwitch(Integer smsMailSwitch ){
		this.smsMailSwitch = smsMailSwitch;
	}
	
	/**
	* 站内信接收开关，0关闭，1开启
	*@return 
	*/
	public Integer getSmsMessageSwitch(){
		return  smsMessageSwitch;
	}
	/**
	* 站内信接收开关，0关闭，1开启
	*@param  smsMessageSwitch
	*/
	public void setSmsMessageSwitch(Integer smsMessageSwitch ){
		this.smsMessageSwitch = smsMessageSwitch;
	}
	
	/**
	* 短消息接收开关，0关闭，1开启
	*@return 
	*/
	public Integer getSmsShortSwitch(){
		return  smsShortSwitch;
	}
	/**
	* 短消息接收开关，0关闭，1开启
	*@param  smsShortSwitch
	*/
	public void setSmsShortSwitch(Integer smsShortSwitch ){
		this.smsShortSwitch = smsShortSwitch;
	}
	
	/**
	* 邮箱号码
	*@return 
	*/
	public String getSmsMailNumber(){
		return  smsMailNumber;
	}
	/**
	* 邮箱号码
	*@param  smsMailNumber
	*/
	public void setSmsMailNumber(String smsMailNumber ){
		this.smsMailNumber = smsMailNumber;
	}
	
	/**
	* 手机号码
	*@return 
	*/
	public String getSmsShortNumber(){
		return  smsShortNumber;
	}
	/**
	* 手机号码
	*@param  smsShortNumber
	*/
	public void setSmsShortNumber(String smsShortNumber ){
		this.smsShortNumber = smsShortNumber;
	}
	

}
