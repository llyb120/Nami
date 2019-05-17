package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_store_goods_class")
public class RaStoreGoodsClass   {
	
	// alias
	public static final String ALIAS_stc_id = "stc_id";
	public static final String ALIAS_stc_parent_id = "stc_parent_id";
	public static final String ALIAS_stc_sort = "stc_sort";
	public static final String ALIAS_stc_state = "stc_state";
	public static final String ALIAS_store_id = "store_id";
	public static final String ALIAS_stc_name = "stc_name";
	
	/*
	索引ID
	*/
	private Integer stc_id ;
	/*
	父级id
	*/
	private Integer stc_parent_id ;
	/*
	商品分类排序
	*/
	private Integer stc_sort ;
	/*
	店铺商品分类状态
	*/
	private Integer stc_state ;
	/*
	店铺id
	*/
	private Integer store_id ;
	/*
	店铺商品分类名称
	*/
	private String stc_name ;
	
	public RaStoreGoodsClass() {
	}
	
	/**
	* 索引ID
	*@return 
	*/
	public Integer getStc_id(){
		return  stc_id;
	}
	/**
	* 索引ID
	*@param  stc_id
	*/
	public void setStc_id(Integer stc_id ){
		this.stc_id = stc_id;
	}
	
	/**
	* 父级id
	*@return 
	*/
	public Integer getStc_parent_id(){
		return  stc_parent_id;
	}
	/**
	* 父级id
	*@param  stc_parent_id
	*/
	public void setStc_parent_id(Integer stc_parent_id ){
		this.stc_parent_id = stc_parent_id;
	}
	
	/**
	* 商品分类排序
	*@return 
	*/
	public Integer getStc_sort(){
		return  stc_sort;
	}
	/**
	* 商品分类排序
	*@param  stc_sort
	*/
	public void setStc_sort(Integer stc_sort ){
		this.stc_sort = stc_sort;
	}
	
	/**
	* 店铺商品分类状态
	*@return 
	*/
	public Integer getStc_state(){
		return  stc_state;
	}
	/**
	* 店铺商品分类状态
	*@param  stc_state
	*/
	public void setStc_state(Integer stc_state ){
		this.stc_state = stc_state;
	}
	
	/**
	* 店铺id
	*@return 
	*/
	public Integer getStore_id(){
		return  store_id;
	}
	/**
	* 店铺id
	*@param  store_id
	*/
	public void setStore_id(Integer store_id ){
		this.store_id = store_id;
	}
	
	/**
	* 店铺商品分类名称
	*@return 
	*/
	public String getStc_name(){
		return  stc_name;
	}
	/**
	* 店铺商品分类名称
	*@param  stc_name
	*/
	public void setStc_name(String stc_name ){
		this.stc_name = stc_name;
	}
	

}
