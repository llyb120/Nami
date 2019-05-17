package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_order_pay")
public class RaOrderPay   {
	
	private Integer payId ;
	/*
	买家ID
	*/
	private Integer buyerId ;
	/*
	0默认未支付1已支付(只有第三方支付接口通知到时才会更改此状态)
	*/
	private String apiPayState ;
	/*
	支付单号
	*/
	private Long paySn ;
	
	public RaOrderPay() {
	}
	
	public Integer getPayId(){
		return  payId;
	}
	public void setPayId(Integer payId ){
		this.payId = payId;
	}
	
	/**
	* 买家ID
	*@return 
	*/
	public Integer getBuyerId(){
		return  buyerId;
	}
	/**
	* 买家ID
	*@param  buyerId
	*/
	public void setBuyerId(Integer buyerId ){
		this.buyerId = buyerId;
	}
	
	/**
	* 0默认未支付1已支付(只有第三方支付接口通知到时才会更改此状态)
	*@return 
	*/
	public String getApiPayState(){
		return  apiPayState;
	}
	/**
	* 0默认未支付1已支付(只有第三方支付接口通知到时才会更改此状态)
	*@param  apiPayState
	*/
	public void setApiPayState(String apiPayState ){
		this.apiPayState = apiPayState;
	}
	
	/**
	* 支付单号
	*@return 
	*/
	public Long getPaySn(){
		return  paySn;
	}
	/**
	* 支付单号
	*@param  paySn
	*/
	public void setPaySn(Long paySn ){
		this.paySn = paySn;
	}
	

}
