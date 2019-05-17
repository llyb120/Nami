package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_mb_payment")
public class RaMbPayment   {
	
	/*
	支付索引id
	*/
	private Integer paymentId ;
	/*
	支付代码名称
	*/
	private String paymentCode ;
	/*
	支付接口配置信息
	*/
	private String paymentConfig ;
	/*
	支付名称
	*/
	private String paymentName ;
	/*
	接口状态0禁用1启用
	*/
	private String paymentState ;
	
	public RaMbPayment() {
	}
	
	/**
	* 支付索引id
	*@return 
	*/
	public Integer getPaymentId(){
		return  paymentId;
	}
	/**
	* 支付索引id
	*@param  paymentId
	*/
	public void setPaymentId(Integer paymentId ){
		this.paymentId = paymentId;
	}
	
	/**
	* 支付代码名称
	*@return 
	*/
	public String getPaymentCode(){
		return  paymentCode;
	}
	/**
	* 支付代码名称
	*@param  paymentCode
	*/
	public void setPaymentCode(String paymentCode ){
		this.paymentCode = paymentCode;
	}
	
	/**
	* 支付接口配置信息
	*@return 
	*/
	public String getPaymentConfig(){
		return  paymentConfig;
	}
	/**
	* 支付接口配置信息
	*@param  paymentConfig
	*/
	public void setPaymentConfig(String paymentConfig ){
		this.paymentConfig = paymentConfig;
	}
	
	/**
	* 支付名称
	*@return 
	*/
	public String getPaymentName(){
		return  paymentName;
	}
	/**
	* 支付名称
	*@param  paymentName
	*/
	public void setPaymentName(String paymentName ){
		this.paymentName = paymentName;
	}
	
	/**
	* 接口状态0禁用1启用
	*@return 
	*/
	public String getPaymentState(){
		return  paymentState;
	}
	/**
	* 接口状态0禁用1启用
	*@param  paymentState
	*/
	public void setPaymentState(String paymentState ){
		this.paymentState = paymentState;
	}
	

}
