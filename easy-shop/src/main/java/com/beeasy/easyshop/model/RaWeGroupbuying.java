package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_we_groupbuying")
public class RaWeGroupbuying   {
	
	// alias
	public static final String ALIAS_we_groupbuying_id = "we_groupbuying_id";
	public static final String ALIAS_is_pay_brokerage = "is_pay_brokerage";
	public static final String ALIAS_sponsor_id = "sponsor_id";
	public static final String ALIAS_store_id = "store_id";
	public static final String ALIAS_we_groupbuy_id = "we_groupbuy_id";
	public static final String ALIAS_we_groupbuy_status = "we_groupbuy_status";
	public static final String ALIAS_sponsor_name = "sponsor_name";
	public static final String ALIAS_sponsor_time = "sponsor_time";
	
	private Integer we_groupbuying_id ;
	/*
	0未支付佣金，1已支付佣金
	*/
	private Integer is_pay_brokerage ;
	/*
	发起者ID
	*/
	private Integer sponsor_id ;
	private Integer store_id ;
	/*
	微团购活动ID
	*/
	private Integer we_groupbuy_id ;
	/*
	0进行中，-1已经取消，1已成团
	*/
	private Integer we_groupbuy_status ;
	/*
	发起者
	*/
	private String sponsor_name ;
	/*
	发起时间
	*/
	private String sponsor_time ;
	
	public RaWeGroupbuying() {
	}
	
	public Integer getWe_groupbuying_id(){
		return  we_groupbuying_id;
	}
	public void setWe_groupbuying_id(Integer we_groupbuying_id ){
		this.we_groupbuying_id = we_groupbuying_id;
	}
	
	/**
	* 0未支付佣金，1已支付佣金
	*@return 
	*/
	public Integer getIs_pay_brokerage(){
		return  is_pay_brokerage;
	}
	/**
	* 0未支付佣金，1已支付佣金
	*@param  is_pay_brokerage
	*/
	public void setIs_pay_brokerage(Integer is_pay_brokerage ){
		this.is_pay_brokerage = is_pay_brokerage;
	}
	
	/**
	* 发起者ID
	*@return 
	*/
	public Integer getSponsor_id(){
		return  sponsor_id;
	}
	/**
	* 发起者ID
	*@param  sponsor_id
	*/
	public void setSponsor_id(Integer sponsor_id ){
		this.sponsor_id = sponsor_id;
	}
	
	public Integer getStore_id(){
		return  store_id;
	}
	public void setStore_id(Integer store_id ){
		this.store_id = store_id;
	}
	
	/**
	* 微团购活动ID
	*@return 
	*/
	public Integer getWe_groupbuy_id(){
		return  we_groupbuy_id;
	}
	/**
	* 微团购活动ID
	*@param  we_groupbuy_id
	*/
	public void setWe_groupbuy_id(Integer we_groupbuy_id ){
		this.we_groupbuy_id = we_groupbuy_id;
	}
	
	/**
	* 0进行中，-1已经取消，1已成团
	*@return 
	*/
	public Integer getWe_groupbuy_status(){
		return  we_groupbuy_status;
	}
	/**
	* 0进行中，-1已经取消，1已成团
	*@param  we_groupbuy_status
	*/
	public void setWe_groupbuy_status(Integer we_groupbuy_status ){
		this.we_groupbuy_status = we_groupbuy_status;
	}
	
	/**
	* 发起者
	*@return 
	*/
	public String getSponsor_name(){
		return  sponsor_name;
	}
	/**
	* 发起者
	*@param  sponsor_name
	*/
	public void setSponsor_name(String sponsor_name ){
		this.sponsor_name = sponsor_name;
	}
	
	/**
	* 发起时间
	*@return 
	*/
	public String getSponsor_time(){
		return  sponsor_time;
	}
	/**
	* 发起时间
	*@param  sponsor_time
	*/
	public void setSponsor_time(String sponsor_time ){
		this.sponsor_time = sponsor_time;
	}
	

}
