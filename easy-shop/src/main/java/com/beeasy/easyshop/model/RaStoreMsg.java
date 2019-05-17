package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_store_msg")
public class RaStoreMsg   {
	
	/*
	店铺消息id
	*/
	private Integer smId ;
	/*
	发送时间
	*/
	private Integer smAddtime ;
	/*
	店铺id
	*/
	private Integer storeId ;
	/*
	消息内容
	*/
	private String smContent ;
	/*
	已读卖家id
	*/
	private String smReadids ;
	/*
	模板编码
	*/
	private String smtCode ;
	
	public RaStoreMsg() {
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
	* 发送时间
	*@return 
	*/
	public Integer getSmAddtime(){
		return  smAddtime;
	}
	/**
	* 发送时间
	*@param  smAddtime
	*/
	public void setSmAddtime(Integer smAddtime ){
		this.smAddtime = smAddtime;
	}
	
	/**
	* 店铺id
	*@return 
	*/
	public Integer getStoreId(){
		return  storeId;
	}
	/**
	* 店铺id
	*@param  storeId
	*/
	public void setStoreId(Integer storeId ){
		this.storeId = storeId;
	}
	
	/**
	* 消息内容
	*@return 
	*/
	public String getSmContent(){
		return  smContent;
	}
	/**
	* 消息内容
	*@param  smContent
	*/
	public void setSmContent(String smContent ){
		this.smContent = smContent;
	}
	
	/**
	* 已读卖家id
	*@return 
	*/
	public String getSmReadids(){
		return  smReadids;
	}
	/**
	* 已读卖家id
	*@param  smReadids
	*/
	public void setSmReadids(String smReadids ){
		this.smReadids = smReadids;
	}
	
	/**
	* 模板编码
	*@return 
	*/
	public String getSmtCode(){
		return  smtCode;
	}
	/**
	* 模板编码
	*@param  smtCode
	*/
	public void setSmtCode(String smtCode ){
		this.smtCode = smtCode;
	}
	

}
