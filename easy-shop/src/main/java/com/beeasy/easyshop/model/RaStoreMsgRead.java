package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_store_msg_read")
public class RaStoreMsgRead   {
	
	// alias
	public static final String ALIAS_seller_id = "seller_id";
	public static final String ALIAS_sm_id = "sm_id";
	public static final String ALIAS_read_time = "read_time";
	
	/*
	卖家id
	*/
	private Integer seller_id ;
	/*
	店铺消息id
	*/
	private Integer sm_id ;
	/*
	阅读时间
	*/
	private Integer read_time ;
	
	public RaStoreMsgRead() {
	}
	
	/**
	* 卖家id
	*@return 
	*/
	public Integer getSeller_id(){
		return  seller_id;
	}
	/**
	* 卖家id
	*@param  seller_id
	*/
	public void setSeller_id(Integer seller_id ){
		this.seller_id = seller_id;
	}
	
	/**
	* 店铺消息id
	*@return 
	*/
	public Integer getSm_id(){
		return  sm_id;
	}
	/**
	* 店铺消息id
	*@param  sm_id
	*/
	public void setSm_id(Integer sm_id ){
		this.sm_id = sm_id;
	}
	
	/**
	* 阅读时间
	*@return 
	*/
	public Integer getRead_time(){
		return  read_time;
	}
	/**
	* 阅读时间
	*@param  read_time
	*/
	public void setRead_time(Integer read_time ){
		this.read_time = read_time;
	}
	

}
