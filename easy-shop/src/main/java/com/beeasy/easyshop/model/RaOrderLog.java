package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_order_log")
public class RaOrderLog   {
	
	// alias
	public static final String ALIAS_log_id = "log_id";
	public static final String ALIAS_log_time = "log_time";
	public static final String ALIAS_order_id = "order_id";
	public static final String ALIAS_log_msg = "log_msg";
	public static final String ALIAS_log_orderstate = "log_orderstate";
	public static final String ALIAS_log_role = "log_role";
	public static final String ALIAS_log_user = "log_user";
	
	/*
	主键
	*/
	private Integer log_id ;
	/*
	处理时间
	*/
	private Integer log_time ;
	/*
	订单id
	*/
	private Integer order_id ;
	/*
	文字描述
	*/
	private String log_msg ;
	/*
	订单状态：0(已取消)10:未付款;20:已付款;30:已发货;40:已收货;
	*/
	private String log_orderstate ;
	/*
	操作角色
	*/
	private String log_role ;
	/*
	操作人
	*/
	private String log_user ;
	
	public RaOrderLog() {
	}
	
	/**
	* 主键
	*@return 
	*/
	public Integer getLog_id(){
		return  log_id;
	}
	/**
	* 主键
	*@param  log_id
	*/
	public void setLog_id(Integer log_id ){
		this.log_id = log_id;
	}
	
	/**
	* 处理时间
	*@return 
	*/
	public Integer getLog_time(){
		return  log_time;
	}
	/**
	* 处理时间
	*@param  log_time
	*/
	public void setLog_time(Integer log_time ){
		this.log_time = log_time;
	}
	
	/**
	* 订单id
	*@return 
	*/
	public Integer getOrder_id(){
		return  order_id;
	}
	/**
	* 订单id
	*@param  order_id
	*/
	public void setOrder_id(Integer order_id ){
		this.order_id = order_id;
	}
	
	/**
	* 文字描述
	*@return 
	*/
	public String getLog_msg(){
		return  log_msg;
	}
	/**
	* 文字描述
	*@param  log_msg
	*/
	public void setLog_msg(String log_msg ){
		this.log_msg = log_msg;
	}
	
	/**
	* 订单状态：0(已取消)10:未付款;20:已付款;30:已发货;40:已收货;
	*@return 
	*/
	public String getLog_orderstate(){
		return  log_orderstate;
	}
	/**
	* 订单状态：0(已取消)10:未付款;20:已付款;30:已发货;40:已收货;
	*@param  log_orderstate
	*/
	public void setLog_orderstate(String log_orderstate ){
		this.log_orderstate = log_orderstate;
	}
	
	/**
	* 操作角色
	*@return 
	*/
	public String getLog_role(){
		return  log_role;
	}
	/**
	* 操作角色
	*@param  log_role
	*/
	public void setLog_role(String log_role ){
		this.log_role = log_role;
	}
	
	/**
	* 操作人
	*@return 
	*/
	public String getLog_user(){
		return  log_user;
	}
	/**
	* 操作人
	*@param  log_user
	*/
	public void setLog_user(String log_user ){
		this.log_user = log_user;
	}
	

}
