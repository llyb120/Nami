package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_seller_group")
public class RaSellerGroup   {
	
	/*
	卖家组编号
	*/
	private Integer groupId ;
	/*
	店铺编号
	*/
	private Integer storeId ;
	/*
	组名
	*/
	private String groupName ;
	/*
	权限
	*/
	private String limits ;
	/*
	消息权限范围
	*/
	private String smtLimits ;
	
	public RaSellerGroup() {
	}
	
	/**
	* 卖家组编号
	*@return 
	*/
	public Integer getGroupId(){
		return  groupId;
	}
	/**
	* 卖家组编号
	*@param  groupId
	*/
	public void setGroupId(Integer groupId ){
		this.groupId = groupId;
	}
	
	/**
	* 店铺编号
	*@return 
	*/
	public Integer getStoreId(){
		return  storeId;
	}
	/**
	* 店铺编号
	*@param  storeId
	*/
	public void setStoreId(Integer storeId ){
		this.storeId = storeId;
	}
	
	/**
	* 组名
	*@return 
	*/
	public String getGroupName(){
		return  groupName;
	}
	/**
	* 组名
	*@param  groupName
	*/
	public void setGroupName(String groupName ){
		this.groupName = groupName;
	}
	
	/**
	* 权限
	*@return 
	*/
	public String getLimits(){
		return  limits;
	}
	/**
	* 权限
	*@param  limits
	*/
	public void setLimits(String limits ){
		this.limits = limits;
	}
	
	/**
	* 消息权限范围
	*@return 
	*/
	public String getSmtLimits(){
		return  smtLimits;
	}
	/**
	* 消息权限范围
	*@param  smtLimits
	*/
	public void setSmtLimits(String smtLimits ){
		this.smtLimits = smtLimits;
	}
	

}
