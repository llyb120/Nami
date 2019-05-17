package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_seller_log")
public class RaSellerLog   {
	
	// alias
	public static final String ALIAS_log_id = "log_id";
	public static final String ALIAS_log_seller_id = "log_seller_id";
	public static final String ALIAS_log_state = "log_state";
	public static final String ALIAS_log_store_id = "log_store_id";
	public static final String ALIAS_log_time = "log_time";
	public static final String ALIAS_log_content = "log_content";
	public static final String ALIAS_log_seller_ip = "log_seller_ip";
	public static final String ALIAS_log_seller_name = "log_seller_name";
	public static final String ALIAS_log_url = "log_url";
	
	/*
	日志编号
	*/
	private Integer log_id ;
	/*
	卖家编号
	*/
	private Integer log_seller_id ;
	/*
	日志状态(0-失败 1-成功)
	*/
	private Integer log_state ;
	/*
	店铺编号
	*/
	private Integer log_store_id ;
	/*
	日志时间
	*/
	private Integer log_time ;
	/*
	日志内容
	*/
	private String log_content ;
	/*
	卖家ip
	*/
	private String log_seller_ip ;
	/*
	卖家帐号
	*/
	private String log_seller_name ;
	/*
	日志url
	*/
	private String log_url ;
	
	public RaSellerLog() {
	}
	
	/**
	* 日志编号
	*@return 
	*/
	public Integer getLog_id(){
		return  log_id;
	}
	/**
	* 日志编号
	*@param  log_id
	*/
	public void setLog_id(Integer log_id ){
		this.log_id = log_id;
	}
	
	/**
	* 卖家编号
	*@return 
	*/
	public Integer getLog_seller_id(){
		return  log_seller_id;
	}
	/**
	* 卖家编号
	*@param  log_seller_id
	*/
	public void setLog_seller_id(Integer log_seller_id ){
		this.log_seller_id = log_seller_id;
	}
	
	/**
	* 日志状态(0-失败 1-成功)
	*@return 
	*/
	public Integer getLog_state(){
		return  log_state;
	}
	/**
	* 日志状态(0-失败 1-成功)
	*@param  log_state
	*/
	public void setLog_state(Integer log_state ){
		this.log_state = log_state;
	}
	
	/**
	* 店铺编号
	*@return 
	*/
	public Integer getLog_store_id(){
		return  log_store_id;
	}
	/**
	* 店铺编号
	*@param  log_store_id
	*/
	public void setLog_store_id(Integer log_store_id ){
		this.log_store_id = log_store_id;
	}
	
	/**
	* 日志时间
	*@return 
	*/
	public Integer getLog_time(){
		return  log_time;
	}
	/**
	* 日志时间
	*@param  log_time
	*/
	public void setLog_time(Integer log_time ){
		this.log_time = log_time;
	}
	
	/**
	* 日志内容
	*@return 
	*/
	public String getLog_content(){
		return  log_content;
	}
	/**
	* 日志内容
	*@param  log_content
	*/
	public void setLog_content(String log_content ){
		this.log_content = log_content;
	}
	
	/**
	* 卖家ip
	*@return 
	*/
	public String getLog_seller_ip(){
		return  log_seller_ip;
	}
	/**
	* 卖家ip
	*@param  log_seller_ip
	*/
	public void setLog_seller_ip(String log_seller_ip ){
		this.log_seller_ip = log_seller_ip;
	}
	
	/**
	* 卖家帐号
	*@return 
	*/
	public String getLog_seller_name(){
		return  log_seller_name;
	}
	/**
	* 卖家帐号
	*@param  log_seller_name
	*/
	public void setLog_seller_name(String log_seller_name ){
		this.log_seller_name = log_seller_name;
	}
	
	/**
	* 日志url
	*@return 
	*/
	public String getLog_url(){
		return  log_url;
	}
	/**
	* 日志url
	*@param  log_url
	*/
	public void setLog_url(String log_url ){
		this.log_url = log_url;
	}
	

}
