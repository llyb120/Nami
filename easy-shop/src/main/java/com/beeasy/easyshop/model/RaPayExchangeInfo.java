package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_pay_exchange_info")
public class RaPayExchangeInfo   {
	
	private String orderno ;
	private String currency ;
	private String ebpcode ;
	/*
	企业系统生成36位唯一序号（英文字母大写）。
	*/
	private String guid ;
	/*
	跨境电商平台企业向支付企业发送的原始信息
	*/
	private String initalrequest ;
	private String initalresponse ;
	private String note ;
	private String paycode ;
	private String paytransactionid ;
	private String paytype ;
	/*
	收款账号
	*/
	private String recpaccount ;
	/*
	收款企业代码
	*/
	private String recpcode ;
	/*
	收款企业名称
	*/
	private String recpname ;
	private Long servicetime ;
	private String sessionid ;
	private BigDecimal totalamount ;
	private String tradingtime ;
	private String verdept ;
	
	public RaPayExchangeInfo() {
	}
	
	public String getOrderno(){
		return  orderno;
	}
	public void setOrderno(String orderno ){
		this.orderno = orderno;
	}
	
	public String getCurrency(){
		return  currency;
	}
	public void setCurrency(String currency ){
		this.currency = currency;
	}
	
	public String getEbpcode(){
		return  ebpcode;
	}
	public void setEbpcode(String ebpcode ){
		this.ebpcode = ebpcode;
	}
	
	/**
	* 企业系统生成36位唯一序号（英文字母大写）。
	*@return 
	*/
	public String getGuid(){
		return  guid;
	}
	/**
	* 企业系统生成36位唯一序号（英文字母大写）。
	*@param  guid
	*/
	public void setGuid(String guid ){
		this.guid = guid;
	}
	
	/**
	* 跨境电商平台企业向支付企业发送的原始信息
	*@return 
	*/
	public String getInitalrequest(){
		return  initalrequest;
	}
	/**
	* 跨境电商平台企业向支付企业发送的原始信息
	*@param  initalrequest
	*/
	public void setInitalrequest(String initalrequest ){
		this.initalrequest = initalrequest;
	}
	
	public String getInitalresponse(){
		return  initalresponse;
	}
	public void setInitalresponse(String initalresponse ){
		this.initalresponse = initalresponse;
	}
	
	public String getNote(){
		return  note;
	}
	public void setNote(String note ){
		this.note = note;
	}
	
	public String getPaycode(){
		return  paycode;
	}
	public void setPaycode(String paycode ){
		this.paycode = paycode;
	}
	
	public String getPaytransactionid(){
		return  paytransactionid;
	}
	public void setPaytransactionid(String paytransactionid ){
		this.paytransactionid = paytransactionid;
	}
	
	public String getPaytype(){
		return  paytype;
	}
	public void setPaytype(String paytype ){
		this.paytype = paytype;
	}
	
	/**
	* 收款账号
	*@return 
	*/
	public String getRecpaccount(){
		return  recpaccount;
	}
	/**
	* 收款账号
	*@param  recpaccount
	*/
	public void setRecpaccount(String recpaccount ){
		this.recpaccount = recpaccount;
	}
	
	/**
	* 收款企业代码
	*@return 
	*/
	public String getRecpcode(){
		return  recpcode;
	}
	/**
	* 收款企业代码
	*@param  recpcode
	*/
	public void setRecpcode(String recpcode ){
		this.recpcode = recpcode;
	}
	
	/**
	* 收款企业名称
	*@return 
	*/
	public String getRecpname(){
		return  recpname;
	}
	/**
	* 收款企业名称
	*@param  recpname
	*/
	public void setRecpname(String recpname ){
		this.recpname = recpname;
	}
	
	public Long getServicetime(){
		return  servicetime;
	}
	public void setServicetime(Long servicetime ){
		this.servicetime = servicetime;
	}
	
	public String getSessionid(){
		return  sessionid;
	}
	public void setSessionid(String sessionid ){
		this.sessionid = sessionid;
	}
	
	public BigDecimal getTotalamount(){
		return  totalamount;
	}
	public void setTotalamount(BigDecimal totalamount ){
		this.totalamount = totalamount;
	}
	
	public String getTradingtime(){
		return  tradingtime;
	}
	public void setTradingtime(String tradingtime ){
		this.tradingtime = tradingtime;
	}
	
	public String getVerdept(){
		return  verdept;
	}
	public void setVerdept(String verdept ){
		this.verdept = verdept;
	}
	

}
