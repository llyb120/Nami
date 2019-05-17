package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_spec")
public class RaSpec   {
	
	// alias
	public static final String ALIAS_sp_id = "sp_id";
	public static final String ALIAS_class_id = "class_id";
	public static final String ALIAS_sp_sort = "sp_sort";
	public static final String ALIAS_class_name = "class_name";
	public static final String ALIAS_sp_name = "sp_name";
	
	/*
	规格id
	*/
	private Integer sp_id ;
	/*
	所属分类id
	*/
	private Integer class_id ;
	/*
	排序
	*/
	private Integer sp_sort ;
	/*
	所属分类名称
	*/
	private String class_name ;
	/*
	规格名称
	*/
	private String sp_name ;
	
	public RaSpec() {
	}
	
	/**
	* 规格id
	*@return 
	*/
	public Integer getSp_id(){
		return  sp_id;
	}
	/**
	* 规格id
	*@param  sp_id
	*/
	public void setSp_id(Integer sp_id ){
		this.sp_id = sp_id;
	}
	
	/**
	* 所属分类id
	*@return 
	*/
	public Integer getClass_id(){
		return  class_id;
	}
	/**
	* 所属分类id
	*@param  class_id
	*/
	public void setClass_id(Integer class_id ){
		this.class_id = class_id;
	}
	
	/**
	* 排序
	*@return 
	*/
	public Integer getSp_sort(){
		return  sp_sort;
	}
	/**
	* 排序
	*@param  sp_sort
	*/
	public void setSp_sort(Integer sp_sort ){
		this.sp_sort = sp_sort;
	}
	
	/**
	* 所属分类名称
	*@return 
	*/
	public String getClass_name(){
		return  class_name;
	}
	/**
	* 所属分类名称
	*@param  class_name
	*/
	public void setClass_name(String class_name ){
		this.class_name = class_name;
	}
	
	/**
	* 规格名称
	*@return 
	*/
	public String getSp_name(){
		return  sp_name;
	}
	/**
	* 规格名称
	*@param  sp_name
	*/
	public void setSp_name(String sp_name ){
		this.sp_name = sp_name;
	}
	

}
