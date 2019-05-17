package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_attribute_value")
public class RaAttributeValue   {
	
	// alias
	public static final String ALIAS_attr_value_id = "attr_value_id";
	public static final String ALIAS_attr_id = "attr_id";
	public static final String ALIAS_attr_value_sort = "attr_value_sort";
	public static final String ALIAS_type_id = "type_id";
	public static final String ALIAS_attr_value_name = "attr_value_name";
	
	/*
	属性值id
	*/
	private Integer attr_value_id ;
	/*
	所属属性id
	*/
	private Integer attr_id ;
	/*
	属性值排序
	*/
	private Integer attr_value_sort ;
	/*
	类型id
	*/
	private Integer type_id ;
	/*
	属性值名称
	*/
	private String attr_value_name ;
	
	public RaAttributeValue() {
	}
	
	/**
	* 属性值id
	*@return 
	*/
	public Integer getAttr_value_id(){
		return  attr_value_id;
	}
	/**
	* 属性值id
	*@param  attr_value_id
	*/
	public void setAttr_value_id(Integer attr_value_id ){
		this.attr_value_id = attr_value_id;
	}
	
	/**
	* 所属属性id
	*@return 
	*/
	public Integer getAttr_id(){
		return  attr_id;
	}
	/**
	* 所属属性id
	*@param  attr_id
	*/
	public void setAttr_id(Integer attr_id ){
		this.attr_id = attr_id;
	}
	
	/**
	* 属性值排序
	*@return 
	*/
	public Integer getAttr_value_sort(){
		return  attr_value_sort;
	}
	/**
	* 属性值排序
	*@param  attr_value_sort
	*/
	public void setAttr_value_sort(Integer attr_value_sort ){
		this.attr_value_sort = attr_value_sort;
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
	* 属性值名称
	*@return 
	*/
	public String getAttr_value_name(){
		return  attr_value_name;
	}
	/**
	* 属性值名称
	*@param  attr_value_name
	*/
	public void setAttr_value_name(String attr_value_name ){
		this.attr_value_name = attr_value_name;
	}
	

}
