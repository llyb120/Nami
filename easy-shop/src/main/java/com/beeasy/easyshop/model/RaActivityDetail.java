package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_activity_detail")
public class RaActivityDetail   {
	
	// alias
	public static final String ALIAS_activity_detail_id = "activity_detail_id";
	public static final String ALIAS_activity_detail_sort = "activity_detail_sort";
	public static final String ALIAS_activity_id = "activity_id";
	public static final String ALIAS_item_id = "item_id";
	public static final String ALIAS_store_id = "store_id";
	public static final String ALIAS_activity_detail_state = "activity_detail_state";
	public static final String ALIAS_item_name = "item_name";
	public static final String ALIAS_store_name = "store_name";
	
	/*
	id
	*/
	private Integer activity_detail_id ;
	/*
	排序
	*/
	private Integer activity_detail_sort ;
	/*
	活动编号
	*/
	private Integer activity_id ;
	/*
	商品或团购的编号
	*/
	private Integer item_id ;
	/*
	店铺编号
	*/
	private Integer store_id ;
	/*
	审核状态 0:(默认)待审核 1:通过 2:未通过 3:再次申请
	*/
	private String activity_detail_state ;
	/*
	商品或团购名称
	*/
	private String item_name ;
	/*
	店铺名称
	*/
	private String store_name ;
	
	public RaActivityDetail() {
	}
	
	/**
	* id
	*@return 
	*/
	public Integer getActivity_detail_id(){
		return  activity_detail_id;
	}
	/**
	* id
	*@param  activity_detail_id
	*/
	public void setActivity_detail_id(Integer activity_detail_id ){
		this.activity_detail_id = activity_detail_id;
	}
	
	/**
	* 排序
	*@return 
	*/
	public Integer getActivity_detail_sort(){
		return  activity_detail_sort;
	}
	/**
	* 排序
	*@param  activity_detail_sort
	*/
	public void setActivity_detail_sort(Integer activity_detail_sort ){
		this.activity_detail_sort = activity_detail_sort;
	}
	
	/**
	* 活动编号
	*@return 
	*/
	public Integer getActivity_id(){
		return  activity_id;
	}
	/**
	* 活动编号
	*@param  activity_id
	*/
	public void setActivity_id(Integer activity_id ){
		this.activity_id = activity_id;
	}
	
	/**
	* 商品或团购的编号
	*@return 
	*/
	public Integer getItem_id(){
		return  item_id;
	}
	/**
	* 商品或团购的编号
	*@param  item_id
	*/
	public void setItem_id(Integer item_id ){
		this.item_id = item_id;
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
	* 审核状态 0:(默认)待审核 1:通过 2:未通过 3:再次申请
	*@return 
	*/
	public String getActivity_detail_state(){
		return  activity_detail_state;
	}
	/**
	* 审核状态 0:(默认)待审核 1:通过 2:未通过 3:再次申请
	*@param  activity_detail_state
	*/
	public void setActivity_detail_state(String activity_detail_state ){
		this.activity_detail_state = activity_detail_state;
	}
	
	/**
	* 商品或团购名称
	*@return 
	*/
	public String getItem_name(){
		return  item_name;
	}
	/**
	* 商品或团购名称
	*@param  item_name
	*/
	public void setItem_name(String item_name ){
		this.item_name = item_name;
	}
	
	/**
	* 店铺名称
	*@return 
	*/
	public String getStore_name(){
		return  store_name;
	}
	/**
	* 店铺名称
	*@param  store_name
	*/
	public void setStore_name(String store_name ){
		this.store_name = store_name;
	}
	

}
