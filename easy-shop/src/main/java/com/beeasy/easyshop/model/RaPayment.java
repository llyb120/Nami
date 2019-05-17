package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_payment")
public class RaPayment   {
	
	// alias
	public static final String ALIAS_payment_id = "payment_id";
	public static final String ALIAS_payment_code = "payment_code";
	public static final String ALIAS_payment_config = "payment_config";
	public static final String ALIAS_payment_name = "payment_name";
	public static final String ALIAS_payment_state = "payment_state";
	
	/*
	支付索引id
	*/
	private Integer payment_id ;
	/*
	支付代码名称
	*/
	private String payment_code ;
	/*
	支付接口配置信息
	*/
	private String payment_config ;
	/*
	支付名称
	*/
	private String payment_name ;
	/*
	接口状态0禁用1启用
	*/
	private String payment_state ;
	
	public RaPayment() {
	}
	
	/**
	* 支付索引id
	*@return 
	*/
	public Integer getPayment_id(){
		return  payment_id;
	}
	/**
	* 支付索引id
	*@param  payment_id
	*/
	public void setPayment_id(Integer payment_id ){
		this.payment_id = payment_id;
	}
	
	/**
	* 支付代码名称
	*@return 
	*/
	public String getPayment_code(){
		return  payment_code;
	}
	/**
	* 支付代码名称
	*@param  payment_code
	*/
	public void setPayment_code(String payment_code ){
		this.payment_code = payment_code;
	}
	
	/**
	* 支付接口配置信息
	*@return 
	*/
	public String getPayment_config(){
		return  payment_config;
	}
	/**
	* 支付接口配置信息
	*@param  payment_config
	*/
	public void setPayment_config(String payment_config ){
		this.payment_config = payment_config;
	}
	
	/**
	* 支付名称
	*@return 
	*/
	public String getPayment_name(){
		return  payment_name;
	}
	/**
	* 支付名称
	*@param  payment_name
	*/
	public void setPayment_name(String payment_name ){
		this.payment_name = payment_name;
	}
	
	/**
	* 接口状态0禁用1启用
	*@return 
	*/
	public String getPayment_state(){
		return  payment_state;
	}
	/**
	* 接口状态0禁用1启用
	*@param  payment_state
	*/
	public void setPayment_state(String payment_state ){
		this.payment_state = payment_state;
	}
	

}
