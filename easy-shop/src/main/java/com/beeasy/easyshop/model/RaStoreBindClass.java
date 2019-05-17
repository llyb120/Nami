package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_store_bind_class")
public class RaStoreBindClass   {
	
	// alias
	public static final String ALIAS_bid = "bid";
	public static final String ALIAS_class_1 = "class_1";
	public static final String ALIAS_class_2 = "class_2";
	public static final String ALIAS_class_3 = "class_3";
	public static final String ALIAS_commis_rate = "commis_rate";
	public static final String ALIAS_state = "state";
	public static final String ALIAS_store_id = "store_id";
	
	private Integer bid ;
	/*
	一级分类
	*/
	private Integer class_1 ;
	/*
	二级分类
	*/
	private Integer class_2 ;
	/*
	三级分类
	*/
	private Integer class_3 ;
	/*
	佣金比例
	*/
	private Integer commis_rate ;
	/*
	状态0审核中1已审核 2平台自营店铺
	*/
	private Integer state ;
	/*
	店铺ID
	*/
	private Integer store_id ;
	
	public RaStoreBindClass() {
	}
	
	public Integer getBid(){
		return  bid;
	}
	public void setBid(Integer bid ){
		this.bid = bid;
	}
	
	/**
	* 一级分类
	*@return 
	*/
	public Integer getClass_1(){
		return  class_1;
	}
	/**
	* 一级分类
	*@param  class_1
	*/
	public void setClass_1(Integer class_1 ){
		this.class_1 = class_1;
	}
	
	/**
	* 二级分类
	*@return 
	*/
	public Integer getClass_2(){
		return  class_2;
	}
	/**
	* 二级分类
	*@param  class_2
	*/
	public void setClass_2(Integer class_2 ){
		this.class_2 = class_2;
	}
	
	/**
	* 三级分类
	*@return 
	*/
	public Integer getClass_3(){
		return  class_3;
	}
	/**
	* 三级分类
	*@param  class_3
	*/
	public void setClass_3(Integer class_3 ){
		this.class_3 = class_3;
	}
	
	/**
	* 佣金比例
	*@return 
	*/
	public Integer getCommis_rate(){
		return  commis_rate;
	}
	/**
	* 佣金比例
	*@param  commis_rate
	*/
	public void setCommis_rate(Integer commis_rate ){
		this.commis_rate = commis_rate;
	}
	
	/**
	* 状态0审核中1已审核 2平台自营店铺
	*@return 
	*/
	public Integer getState(){
		return  state;
	}
	/**
	* 状态0审核中1已审核 2平台自营店铺
	*@param  state
	*/
	public void setState(Integer state ){
		this.state = state;
	}
	
	/**
	* 店铺ID
	*@return 
	*/
	public Integer getStore_id(){
		return  store_id;
	}
	/**
	* 店铺ID
	*@param  store_id
	*/
	public void setStore_id(Integer store_id ){
		this.store_id = store_id;
	}
	

}
