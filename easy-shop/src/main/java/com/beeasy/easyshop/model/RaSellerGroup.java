package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_seller_group")
public class RaSellerGroup   {
	
	// alias
	public static final String ALIAS_group_id = "group_id";
	public static final String ALIAS_store_id = "store_id";
	public static final String ALIAS_group_name = "group_name";
	public static final String ALIAS_limits = "limits";
	public static final String ALIAS_smt_limits = "smt_limits";
	
	/*
	卖家组编号
	*/
	private Integer group_id ;
	/*
	店铺编号
	*/
	private Integer store_id ;
	/*
	组名
	*/
	private String group_name ;
	/*
	权限
	*/
	private String limits ;
	/*
	消息权限范围
	*/
	private String smt_limits ;
	
	public RaSellerGroup() {
	}
	
	/**
	* 卖家组编号
	*@return 
	*/
	public Integer getGroup_id(){
		return  group_id;
	}
	/**
	* 卖家组编号
	*@param  group_id
	*/
	public void setGroup_id(Integer group_id ){
		this.group_id = group_id;
	}
	
	/**
	* 店铺编号
	*@return 
	*/
	public Integer getStore_id(){
		return  store_id;
	}
	/**
	* 店铺编号
	*@param  store_id
	*/
	public void setStore_id(Integer store_id ){
		this.store_id = store_id;
	}
	
	/**
	* 组名
	*@return 
	*/
	public String getGroup_name(){
		return  group_name;
	}
	/**
	* 组名
	*@param  group_name
	*/
	public void setGroup_name(String group_name ){
		this.group_name = group_name;
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
	public String getSmt_limits(){
		return  smt_limits;
	}
	/**
	* 消息权限范围
	*@param  smt_limits
	*/
	public void setSmt_limits(String smt_limits ){
		this.smt_limits = smt_limits;
	}
	

}
