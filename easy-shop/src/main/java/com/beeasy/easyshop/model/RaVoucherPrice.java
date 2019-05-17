package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
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
	private Integer voucher_price_id ;
	/*
	代金劵默认的兑换所需积分可以为0
	*/
	private Integer voucher_defaultpoints ;
	/*
	代金券面值
	*/
	private Integer voucher_price ;
	/*
	代金券描述
	*/
	private String voucher_price_describe ;
	
	public RaVoucherPrice() {
	}
	
	/**
	* 代金券面值编号
	*@return 
	*/
	public Integer getVoucher_price_id(){
		return  voucher_price_id;
	}
	/**
	* 代金券面值编号
	*@param  voucher_price_id
	*/
	public void setVoucher_price_id(Integer voucher_price_id ){
		this.voucher_price_id = voucher_price_id;
	}
	
	/**
	* 代金劵默认的兑换所需积分可以为0
	*@return 
	*/
	public Integer getVoucher_defaultpoints(){
		return  voucher_defaultpoints;
	}
	/**
	* 代金劵默认的兑换所需积分可以为0
	*@param  voucher_defaultpoints
	*/
	public void setVoucher_defaultpoints(Integer voucher_defaultpoints ){
		this.voucher_defaultpoints = voucher_defaultpoints;
	}
	
	/**
	* 代金券面值
	*@return 
	*/
	public Integer getVoucher_price(){
		return  voucher_price;
	}
	/**
	* 代金券面值
	*@param  voucher_price
	*/
	public void setVoucher_price(Integer voucher_price ){
		this.voucher_price = voucher_price;
	}
	
	/**
	* 代金券描述
	*@return 
	*/
	public String getVoucher_price_describe(){
		return  voucher_price_describe;
	}
	/**
	* 代金券描述
	*@param  voucher_price_describe
	*/
	public void setVoucher_price_describe(String voucher_price_describe ){
		this.voucher_price_describe = voucher_price_describe;
	}
	

}
