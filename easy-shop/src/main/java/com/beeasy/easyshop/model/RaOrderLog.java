package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_order_log")
public class RaOrderLog   {
	
	/*
	主键
	*/
	private Integer logId ;
	/*
	处理时间
	*/
	private Integer logTime ;
	/*
	订单id
	*/
	private Integer orderId ;
	/*
	文字描述
	*/
	private String logMsg ;
	/*
	订单状态：0(已取消)10:未付款;20:已付款;30:已发货;40:已收货;
	*/
	private String logOrderstate ;
	/*
	操作角色
	*/
	private String logRole ;
	/*
	操作人
	*/
	private String logUser ;
	
	public RaOrderLog() {
	}
	
	/**
	* 主键
	*@return 
	*/
	public Integer getLogId(){
		return  logId;
	}
	/**
	* 主键
	*@param  logId
	*/
	public void setLogId(Integer logId ){
		this.logId = logId;
	}
	
	/**
	* 处理时间
	*@return 
	*/
	public Integer getLogTime(){
		return  logTime;
	}
	/**
	* 处理时间
	*@param  logTime
	*/
	public void setLogTime(Integer logTime ){
		this.logTime = logTime;
	}
	
	/**
	* 订单id
	*@return 
	*/
	public Integer getOrderId(){
		return  orderId;
	}
	/**
	* 订单id
	*@param  orderId
	*/
	public void setOrderId(Integer orderId ){
		this.orderId = orderId;
	}
	
	/**
	* 文字描述
	*@return 
	*/
	public String getLogMsg(){
		return  logMsg;
	}
	/**
	* 文字描述
	*@param  logMsg
	*/
	public void setLogMsg(String logMsg ){
		this.logMsg = logMsg;
	}
	
	/**
	* 订单状态：0(已取消)10:未付款;20:已付款;30:已发货;40:已收货;
	*@return 
	*/
	public String getLogOrderstate(){
		return  logOrderstate;
	}
	/**
	* 订单状态：0(已取消)10:未付款;20:已付款;30:已发货;40:已收货;
	*@param  logOrderstate
	*/
	public void setLogOrderstate(String logOrderstate ){
		this.logOrderstate = logOrderstate;
	}
	
	/**
	* 操作角色
	*@return 
	*/
	public String getLogRole(){
		return  logRole;
	}
	/**
	* 操作角色
	*@param  logRole
	*/
	public void setLogRole(String logRole ){
		this.logRole = logRole;
	}
	
	/**
	* 操作人
	*@return 
	*/
	public String getLogUser(){
		return  logUser;
	}
	/**
	* 操作人
	*@param  logUser
	*/
	public void setLogUser(String logUser ){
		this.logUser = logUser;
	}
	

}
