package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_spec_value")
public class RaSpecValue   {
	
	// alias
	public static final String ALIAS_sp_value_id = "sp_value_id";
	public static final String ALIAS_gc_id = "gc_id";
	public static final String ALIAS_sp_id = "sp_id";
	public static final String ALIAS_sp_value_sort = "sp_value_sort";
	public static final String ALIAS_store_id = "store_id";
	public static final String ALIAS_sp_value_color = "sp_value_color";
	public static final String ALIAS_sp_value_name = "sp_value_name";
	
	/*
	规格值id
	*/
	private Integer sp_value_id ;
	/*
	分类id
	*/
	private Integer gc_id ;
	/*
	所属规格id
	*/
	private Integer sp_id ;
	/*
	排序
	*/
	private Integer sp_value_sort ;
	/*
	店铺id
	*/
	private Integer store_id ;
	/*
	规格颜色
	*/
	private String sp_value_color ;
	/*
	规格值名称
	*/
	private String sp_value_name ;
	
	public RaSpecValue() {
	}
	
	/**
	* 规格值id
	*@return 
	*/
	public Integer getSp_value_id(){
		return  sp_value_id;
	}
	/**
	* 规格值id
	*@param  sp_value_id
	*/
	public void setSp_value_id(Integer sp_value_id ){
		this.sp_value_id = sp_value_id;
	}
	
	/**
	* 分类id
	*@return 
	*/
	public Integer getGc_id(){
		return  gc_id;
	}
	/**
	* 分类id
	*@param  gc_id
	*/
	public void setGc_id(Integer gc_id ){
		this.gc_id = gc_id;
	}
	
	/**
	* 所属规格id
	*@return 
	*/
	public Integer getSp_id(){
		return  sp_id;
	}
	/**
	* 所属规格id
	*@param  sp_id
	*/
	public void setSp_id(Integer sp_id ){
		this.sp_id = sp_id;
	}
	
	/**
	* 排序
	*@return 
	*/
	public Integer getSp_value_sort(){
		return  sp_value_sort;
	}
	/**
	* 排序
	*@param  sp_value_sort
	*/
	public void setSp_value_sort(Integer sp_value_sort ){
		this.sp_value_sort = sp_value_sort;
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
	* 规格颜色
	*@return 
	*/
	public String getSp_value_color(){
		return  sp_value_color;
	}
	/**
	* 规格颜色
	*@param  sp_value_color
	*/
	public void setSp_value_color(String sp_value_color ){
		this.sp_value_color = sp_value_color;
	}
	
	/**
	* 规格值名称
	*@return 
	*/
	public String getSp_value_name(){
		return  sp_value_name;
	}
	/**
	* 规格值名称
	*@param  sp_value_name
	*/
	public void setSp_value_name(String sp_value_name ){
		this.sp_value_name = sp_value_name;
	}
	

}
