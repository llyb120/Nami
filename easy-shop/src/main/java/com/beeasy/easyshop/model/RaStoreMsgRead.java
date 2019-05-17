package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_store_msg_read")
public class RaStoreMsgRead   {
	
	/*
	卖家id
	*/
	private Integer sellerId ;
	/*
	店铺消息id
	*/
	private Integer smId ;
	/*
	阅读时间
	*/
	private Integer readTime ;
	
	public RaStoreMsgRead() {
	}
	
	/**
	* 卖家id
	*@return 
	*/
	public Integer getSellerId(){
		return  sellerId;
	}
	/**
	* 卖家id
	*@param  sellerId
	*/
	public void setSellerId(Integer sellerId ){
		this.sellerId = sellerId;
	}
	
	/**
	* 店铺消息id
	*@return 
	*/
	public Integer getSmId(){
		return  smId;
	}
	/**
	* 店铺消息id
	*@param  smId
	*/
	public void setSmId(Integer smId ){
		this.smId = smId;
	}
	
	/**
	* 阅读时间
	*@return 
	*/
	public Integer getReadTime(){
		return  readTime;
	}
	/**
	* 阅读时间
	*@param  readTime
	*/
	public void setReadTime(Integer readTime ){
		this.readTime = readTime;
	}
	

}
