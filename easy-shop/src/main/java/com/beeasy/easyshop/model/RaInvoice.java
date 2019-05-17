package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_invoice")
public class RaInvoice   {
	
	/*
	索引id
	*/
	private Integer invId ;
	/*
	会员ID
	*/
	private Integer memberId ;
	/*
	纳税人识别号
	*/
	private String invCode ;
	/*
	单位名称
	*/
	private String invCompany ;
	/*
	发票内容[普通发票]
	*/
	private String invContent ;
	/*
	送票地址
	*/
	private String invGotoAddr ;
	/*
	收票人手机号
	*/
	private String invRecMobphone ;
	/*
	收票人姓名
	*/
	private String invRecName ;
	/*
	收票人省份
	*/
	private String invRecProvince ;
	/*
	注册地址
	*/
	private String invRegAddr ;
	/*
	银行帐户
	*/
	private String invRegBaccount ;
	/*
	开户银行
	*/
	private String invRegBname ;
	/*
	注册电话
	*/
	private String invRegPhone ;
	/*
	1普通发票2增值税发票
	*/
	private String invState ;
	/*
	发票抬头[普通发票]
	*/
	private String invTitle ;
	
	public RaInvoice() {
	}
	
	/**
	* 索引id
	*@return 
	*/
	public Integer getInvId(){
		return  invId;
	}
	/**
	* 索引id
	*@param  invId
	*/
	public void setInvId(Integer invId ){
		this.invId = invId;
	}
	
	/**
	* 会员ID
	*@return 
	*/
	public Integer getMemberId(){
		return  memberId;
	}
	/**
	* 会员ID
	*@param  memberId
	*/
	public void setMemberId(Integer memberId ){
		this.memberId = memberId;
	}
	
	/**
	* 纳税人识别号
	*@return 
	*/
	public String getInvCode(){
		return  invCode;
	}
	/**
	* 纳税人识别号
	*@param  invCode
	*/
	public void setInvCode(String invCode ){
		this.invCode = invCode;
	}
	
	/**
	* 单位名称
	*@return 
	*/
	public String getInvCompany(){
		return  invCompany;
	}
	/**
	* 单位名称
	*@param  invCompany
	*/
	public void setInvCompany(String invCompany ){
		this.invCompany = invCompany;
	}
	
	/**
	* 发票内容[普通发票]
	*@return 
	*/
	public String getInvContent(){
		return  invContent;
	}
	/**
	* 发票内容[普通发票]
	*@param  invContent
	*/
	public void setInvContent(String invContent ){
		this.invContent = invContent;
	}
	
	/**
	* 送票地址
	*@return 
	*/
	public String getInvGotoAddr(){
		return  invGotoAddr;
	}
	/**
	* 送票地址
	*@param  invGotoAddr
	*/
	public void setInvGotoAddr(String invGotoAddr ){
		this.invGotoAddr = invGotoAddr;
	}
	
	/**
	* 收票人手机号
	*@return 
	*/
	public String getInvRecMobphone(){
		return  invRecMobphone;
	}
	/**
	* 收票人手机号
	*@param  invRecMobphone
	*/
	public void setInvRecMobphone(String invRecMobphone ){
		this.invRecMobphone = invRecMobphone;
	}
	
	/**
	* 收票人姓名
	*@return 
	*/
	public String getInvRecName(){
		return  invRecName;
	}
	/**
	* 收票人姓名
	*@param  invRecName
	*/
	public void setInvRecName(String invRecName ){
		this.invRecName = invRecName;
	}
	
	/**
	* 收票人省份
	*@return 
	*/
	public String getInvRecProvince(){
		return  invRecProvince;
	}
	/**
	* 收票人省份
	*@param  invRecProvince
	*/
	public void setInvRecProvince(String invRecProvince ){
		this.invRecProvince = invRecProvince;
	}
	
	/**
	* 注册地址
	*@return 
	*/
	public String getInvRegAddr(){
		return  invRegAddr;
	}
	/**
	* 注册地址
	*@param  invRegAddr
	*/
	public void setInvRegAddr(String invRegAddr ){
		this.invRegAddr = invRegAddr;
	}
	
	/**
	* 银行帐户
	*@return 
	*/
	public String getInvRegBaccount(){
		return  invRegBaccount;
	}
	/**
	* 银行帐户
	*@param  invRegBaccount
	*/
	public void setInvRegBaccount(String invRegBaccount ){
		this.invRegBaccount = invRegBaccount;
	}
	
	/**
	* 开户银行
	*@return 
	*/
	public String getInvRegBname(){
		return  invRegBname;
	}
	/**
	* 开户银行
	*@param  invRegBname
	*/
	public void setInvRegBname(String invRegBname ){
		this.invRegBname = invRegBname;
	}
	
	/**
	* 注册电话
	*@return 
	*/
	public String getInvRegPhone(){
		return  invRegPhone;
	}
	/**
	* 注册电话
	*@param  invRegPhone
	*/
	public void setInvRegPhone(String invRegPhone ){
		this.invRegPhone = invRegPhone;
	}
	
	/**
	* 1普通发票2增值税发票
	*@return 
	*/
	public String getInvState(){
		return  invState;
	}
	/**
	* 1普通发票2增值税发票
	*@param  invState
	*/
	public void setInvState(String invState ){
		this.invState = invState;
	}
	
	/**
	* 发票抬头[普通发票]
	*@return 
	*/
	public String getInvTitle(){
		return  invTitle;
	}
	/**
	* 发票抬头[普通发票]
	*@param  invTitle
	*/
	public void setInvTitle(String invTitle ){
		this.invTitle = invTitle;
	}
	

}
