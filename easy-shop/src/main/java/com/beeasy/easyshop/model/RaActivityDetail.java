package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_activity_detail")
public class RaActivityDetail   {
	
	/*
	id
	*/
	private Integer activityDetailId ;
	/*
	排序
	*/
	private Integer activityDetailSort ;
	/*
	活动编号
	*/
	private Integer activityId ;
	/*
	商品或团购的编号
	*/
	private Integer itemId ;
	/*
	店铺编号
	*/
	private Integer storeId ;
	/*
	审核状态 0:(默认)待审核 1:通过 2:未通过 3:再次申请
	*/
	private String activityDetailState ;
	/*
	商品或团购名称
	*/
	private String itemName ;
	/*
	店铺名称
	*/
	private String storeName ;
	
	public RaActivityDetail() {
	}
	
	/**
	* id
	*@return 
	*/
	public Integer getActivityDetailId(){
		return  activityDetailId;
	}
	/**
	* id
	*@param  activityDetailId
	*/
	public void setActivityDetailId(Integer activityDetailId ){
		this.activityDetailId = activityDetailId;
	}
	
	/**
	* 排序
	*@return 
	*/
	public Integer getActivityDetailSort(){
		return  activityDetailSort;
	}
	/**
	* 排序
	*@param  activityDetailSort
	*/
	public void setActivityDetailSort(Integer activityDetailSort ){
		this.activityDetailSort = activityDetailSort;
	}
	
	/**
	* 活动编号
	*@return 
	*/
	public Integer getActivityId(){
		return  activityId;
	}
	/**
	* 活动编号
	*@param  activityId
	*/
	public void setActivityId(Integer activityId ){
		this.activityId = activityId;
	}
	
	/**
	* 商品或团购的编号
	*@return 
	*/
	public Integer getItemId(){
		return  itemId;
	}
	/**
	* 商品或团购的编号
	*@param  itemId
	*/
	public void setItemId(Integer itemId ){
		this.itemId = itemId;
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
	* 审核状态 0:(默认)待审核 1:通过 2:未通过 3:再次申请
	*@return 
	*/
	public String getActivityDetailState(){
		return  activityDetailState;
	}
	/**
	* 审核状态 0:(默认)待审核 1:通过 2:未通过 3:再次申请
	*@param  activityDetailState
	*/
	public void setActivityDetailState(String activityDetailState ){
		this.activityDetailState = activityDetailState;
	}
	
	/**
	* 商品或团购名称
	*@return 
	*/
	public String getItemName(){
		return  itemName;
	}
	/**
	* 商品或团购名称
	*@param  itemName
	*/
	public void setItemName(String itemName ){
		this.itemName = itemName;
	}
	
	/**
	* 店铺名称
	*@return 
	*/
	public String getStoreName(){
		return  storeName;
	}
	/**
	* 店铺名称
	*@param  storeName
	*/
	public void setStoreName(String storeName ){
		this.storeName = storeName;
	}
	

}
