package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_store_goods_class")
public class RaStoreGoodsClass   {
	
	/*
	索引ID
	*/
	private Integer stcId ;
	/*
	父级id
	*/
	private Integer stcParentId ;
	/*
	商品分类排序
	*/
	private Integer stcSort ;
	/*
	店铺商品分类状态
	*/
	private Integer stcState ;
	/*
	店铺id
	*/
	private Integer storeId ;
	/*
	店铺商品分类名称
	*/
	private String stcName ;
	
	public RaStoreGoodsClass() {
	}
	
	/**
	* 索引ID
	*@return 
	*/
	public Integer getStcId(){
		return  stcId;
	}
	/**
	* 索引ID
	*@param  stcId
	*/
	public void setStcId(Integer stcId ){
		this.stcId = stcId;
	}
	
	/**
	* 父级id
	*@return 
	*/
	public Integer getStcParentId(){
		return  stcParentId;
	}
	/**
	* 父级id
	*@param  stcParentId
	*/
	public void setStcParentId(Integer stcParentId ){
		this.stcParentId = stcParentId;
	}
	
	/**
	* 商品分类排序
	*@return 
	*/
	public Integer getStcSort(){
		return  stcSort;
	}
	/**
	* 商品分类排序
	*@param  stcSort
	*/
	public void setStcSort(Integer stcSort ){
		this.stcSort = stcSort;
	}
	
	/**
	* 店铺商品分类状态
	*@return 
	*/
	public Integer getStcState(){
		return  stcState;
	}
	/**
	* 店铺商品分类状态
	*@param  stcState
	*/
	public void setStcState(Integer stcState ){
		this.stcState = stcState;
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
	* 店铺商品分类名称
	*@return 
	*/
	public String getStcName(){
		return  stcName;
	}
	/**
	* 店铺商品分类名称
	*@param  stcName
	*/
	public void setStcName(String stcName ){
		this.stcName = stcName;
	}
	

}
