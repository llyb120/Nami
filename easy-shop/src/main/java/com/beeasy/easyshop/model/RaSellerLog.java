package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_seller_log")
public class RaSellerLog   {
	
	/*
	日志编号
	*/
	private Integer logId ;
	/*
	卖家编号
	*/
	private Integer logSellerId ;
	/*
	日志状态(0-失败 1-成功)
	*/
	private Integer logState ;
	/*
	店铺编号
	*/
	private Integer logStoreId ;
	/*
	日志时间
	*/
	private Integer logTime ;
	/*
	日志内容
	*/
	private String logContent ;
	/*
	卖家ip
	*/
	private String logSellerIp ;
	/*
	卖家帐号
	*/
	private String logSellerName ;
	/*
	日志url
	*/
	private String logUrl ;
	
	public RaSellerLog() {
	}
	
	/**
	* 日志编号
	*@return 
	*/
	public Integer getLogId(){
		return  logId;
	}
	/**
	* 日志编号
	*@param  logId
	*/
	public void setLogId(Integer logId ){
		this.logId = logId;
	}
	
	/**
	* 卖家编号
	*@return 
	*/
	public Integer getLogSellerId(){
		return  logSellerId;
	}
	/**
	* 卖家编号
	*@param  logSellerId
	*/
	public void setLogSellerId(Integer logSellerId ){
		this.logSellerId = logSellerId;
	}
	
	/**
	* 日志状态(0-失败 1-成功)
	*@return 
	*/
	public Integer getLogState(){
		return  logState;
	}
	/**
	* 日志状态(0-失败 1-成功)
	*@param  logState
	*/
	public void setLogState(Integer logState ){
		this.logState = logState;
	}
	
	/**
	* 店铺编号
	*@return 
	*/
	public Integer getLogStoreId(){
		return  logStoreId;
	}
	/**
	* 店铺编号
	*@param  logStoreId
	*/
	public void setLogStoreId(Integer logStoreId ){
		this.logStoreId = logStoreId;
	}
	
	/**
	* 日志时间
	*@return 
	*/
	public Integer getLogTime(){
		return  logTime;
	}
	/**
	* 日志时间
	*@param  logTime
	*/
	public void setLogTime(Integer logTime ){
		this.logTime = logTime;
	}
	
	/**
	* 日志内容
	*@return 
	*/
	public String getLogContent(){
		return  logContent;
	}
	/**
	* 日志内容
	*@param  logContent
	*/
	public void setLogContent(String logContent ){
		this.logContent = logContent;
	}
	
	/**
	* 卖家ip
	*@return 
	*/
	public String getLogSellerIp(){
		return  logSellerIp;
	}
	/**
	* 卖家ip
	*@param  logSellerIp
	*/
	public void setLogSellerIp(String logSellerIp ){
		this.logSellerIp = logSellerIp;
	}
	
	/**
	* 卖家帐号
	*@return 
	*/
	public String getLogSellerName(){
		return  logSellerName;
	}
	/**
	* 卖家帐号
	*@param  logSellerName
	*/
	public void setLogSellerName(String logSellerName ){
		this.logSellerName = logSellerName;
	}
	
	/**
	* 日志url
	*@return 
	*/
	public String getLogUrl(){
		return  logUrl;
	}
	/**
	* 日志url
	*@param  logUrl
	*/
	public void setLogUrl(String logUrl ){
		this.logUrl = logUrl;
	}
	

}
