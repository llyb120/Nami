package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_type")
public class RaType   {
	
	// alias
	public static final String ALIAS_type_id = "type_id";
	public static final String ALIAS_class_id = "class_id";
	public static final String ALIAS_type_sort = "type_sort";
	public static final String ALIAS_class_name = "class_name";
	public static final String ALIAS_type_name = "type_name";
	
	/*
	类型id
	*/
	private Integer type_id ;
	/*
	所属分类id
	*/
	private Integer class_id ;
	/*
	排序
	*/
	private Integer type_sort ;
	/*
	所属分类名称
	*/
	private String class_name ;
	/*
	类型名称
	*/
	private String type_name ;
	
	public RaType() {
	}
	
	/**
	* 类型id
	*@return 
	*/
	public Integer getType_id(){
		return  type_id;
	}
	/**
	* 类型id
	*@param  type_id
	*/
	public void setType_id(Integer type_id ){
		this.type_id = type_id;
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
	public Integer getType_sort(){
		return  type_sort;
	}
	/**
	* 排序
	*@param  type_sort
	*/
	public void setType_sort(Integer type_sort ){
		this.type_sort = type_sort;
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
	* 类型名称
	*@return 
	*/
	public String getType_name(){
		return  type_name;
	}
	/**
	* 类型名称
	*@param  type_name
	*/
	public void setType_name(String type_name ){
		this.type_name = type_name;
	}
	

}
