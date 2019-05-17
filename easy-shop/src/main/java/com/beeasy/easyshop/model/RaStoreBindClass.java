package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_store_bind_class")
public class RaStoreBindClass   {
	
	private Integer bid ;
	/*
	一级分类
	*/
	private Integer class1 ;
	/*
	二级分类
	*/
	private Integer class2 ;
	/*
	三级分类
	*/
	private Integer class3 ;
	/*
	佣金比例
	*/
	private Integer commisRate ;
	/*
	状态0审核中1已审核 2平台自营店铺
	*/
	private Integer state ;
	/*
	店铺ID
	*/
	private Integer storeId ;
	
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
	public Integer getClass1(){
		return  class1;
	}
	/**
	* 一级分类
	*@param  class1
	*/
	public void setClass1(Integer class1 ){
		this.class1 = class1;
	}
	
	/**
	* 二级分类
	*@return 
	*/
	public Integer getClass2(){
		return  class2;
	}
	/**
	* 二级分类
	*@param  class2
	*/
	public void setClass2(Integer class2 ){
		this.class2 = class2;
	}
	
	/**
	* 三级分类
	*@return 
	*/
	public Integer getClass3(){
		return  class3;
	}
	/**
	* 三级分类
	*@param  class3
	*/
	public void setClass3(Integer class3 ){
		this.class3 = class3;
	}
	
	/**
	* 佣金比例
	*@return 
	*/
	public Integer getCommisRate(){
		return  commisRate;
	}
	/**
	* 佣金比例
	*@param  commisRate
	*/
	public void setCommisRate(Integer commisRate ){
		this.commisRate = commisRate;
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
	public Integer getStoreId(){
		return  storeId;
	}
	/**
	* 店铺ID
	*@param  storeId
	*/
	public void setStoreId(Integer storeId ){
		this.storeId = storeId;
	}
	

}
