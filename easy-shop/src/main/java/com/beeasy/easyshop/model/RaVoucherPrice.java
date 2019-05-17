package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-15
*/
@Table(name="yoehi.ra_voucher_price")
public class RaVoucherPrice   {
	
	// alias
	public static final String ALIAS_voucher_price_id = "voucher_price_id";
	public static final String ALIAS_voucher_defaultpoints = "voucher_defaultpoints";
	public static final String ALIAS_voucher_price = "voucher_price";
	public static final String ALIAS_voucher_price_describe = "voucher_price_describe";
	
	/*
	代金券面值编号
	*/
	private Integer voucherPriceId ;
	/*
	代金劵默认的兑换所需积分可以为0
	*/
	private Integer voucherDefaultpoints ;
	/*
	代金券面值
	*/
	private Integer voucherPrice ;
	/*
	代金券描述
	*/
	private String voucherPriceDescribe ;
	
	public RaVoucherPrice() {
	}
	
	/**
	* 代金券面值编号
	*@return 
	*/
	public Integer getVoucherPriceId(){
		return  voucherPriceId;
	}
	/**
	* 代金券面值编号
	*@param  voucherPriceId
	*/
	public void setVoucherPriceId(Integer voucherPriceId ){
		this.voucherPriceId = voucherPriceId;
	}
	
	/**
	* 代金劵默认的兑换所需积分可以为0
	*@return 
	*/
	public Integer getVoucherDefaultpoints(){
		return  voucherDefaultpoints;
	}
	/**
	* 代金劵默认的兑换所需积分可以为0
	*@param  voucherDefaultpoints
	*/
	public void setVoucherDefaultpoints(Integer voucherDefaultpoints ){
		this.voucherDefaultpoints = voucherDefaultpoints;
	}
	
	/**
	* 代金券面值
	*@return 
	*/
	public Integer getVoucherPrice(){
		return  voucherPrice;
	}
	/**
	* 代金券面值
	*@param  voucherPrice
	*/
	public void setVoucherPrice(Integer voucherPrice ){
		this.voucherPrice = voucherPrice;
	}
	
	/**
	* 代金券描述
	*@return 
	*/
	public String getVoucherPriceDescribe(){
		return  voucherPriceDescribe;
	}
	/**
	* 代金券描述
	*@param  voucherPriceDescribe
	*/
	public void setVoucherPriceDescribe(String voucherPriceDescribe ){
		this.voucherPriceDescribe = voucherPriceDescribe;
	}
	

}
