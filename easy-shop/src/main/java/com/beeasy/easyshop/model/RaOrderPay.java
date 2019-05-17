package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_order_pay")
public class RaOrderPay   {
	
	// alias
	public static final String ALIAS_pay_id = "pay_id";
	public static final String ALIAS_buyer_id = "buyer_id";
	public static final String ALIAS_api_pay_state = "api_pay_state";
	public static final String ALIAS_pay_sn = "pay_sn";
	
	private Integer pay_id ;
	/*
	买家ID
	*/
	private Integer buyer_id ;
	/*
	0默认未支付1已支付(只有第三方支付接口通知到时才会更改此状态)
	*/
	private String api_pay_state ;
	/*
	支付单号
	*/
	private Long pay_sn ;
	
	public RaOrderPay() {
	}
	
	public Integer getPay_id(){
		return  pay_id;
	}
	public void setPay_id(Integer pay_id ){
		this.pay_id = pay_id;
	}
	
	/**
	* 买家ID
	*@return 
	*/
	public Integer getBuyer_id(){
		return  buyer_id;
	}
	/**
	* 买家ID
	*@param  buyer_id
	*/
	public void setBuyer_id(Integer buyer_id ){
		this.buyer_id = buyer_id;
	}
	
	/**
	* 0默认未支付1已支付(只有第三方支付接口通知到时才会更改此状态)
	*@return 
	*/
	public String getApi_pay_state(){
		return  api_pay_state;
	}
	/**
	* 0默认未支付1已支付(只有第三方支付接口通知到时才会更改此状态)
	*@param  api_pay_state
	*/
	public void setApi_pay_state(String api_pay_state ){
		this.api_pay_state = api_pay_state;
	}
	
	/**
	* 支付单号
	*@return 
	*/
	public Long getPay_sn(){
		return  pay_sn;
	}
	/**
	* 支付单号
	*@param  pay_sn
	*/
	public void setPay_sn(Long pay_sn ){
		this.pay_sn = pay_sn;
	}
	

}
