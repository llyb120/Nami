package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_attribute")
public class RaAttribute   {
	
	// alias
	public static final String ALIAS_attr_id = "attr_id";
	public static final String ALIAS_attr_show = "attr_show";
	public static final String ALIAS_attr_sort = "attr_sort";
	public static final String ALIAS_type_id = "type_id";
	public static final String ALIAS_attr_name = "attr_name";
	public static final String ALIAS_attr_value = "attr_value";
	
	/*
	属性id
	*/
	private Integer attr_id ;
	/*
	是否显示。0为不显示、1为显示
	*/
	private Integer attr_show ;
	/*
	排序
	*/
	private Integer attr_sort ;
	/*
	所属类型id
	*/
	private Integer type_id ;
	/*
	属性名称
	*/
	private String attr_name ;
	/*
	属性值列
	*/
	private String attr_value ;
	
	public RaAttribute() {
	}
	
	/**
	* 属性id
	*@return 
	*/
	public Integer getAttr_id(){
		return  attr_id;
	}
	/**
	* 属性id
	*@param  attr_id
	*/
	public void setAttr_id(Integer attr_id ){
		this.attr_id = attr_id;
	}
	
	/**
	* 是否显示。0为不显示、1为显示
	*@return 
	*/
	public Integer getAttr_show(){
		return  attr_show;
	}
	/**
	* 是否显示。0为不显示、1为显示
	*@param  attr_show
	*/
	public void setAttr_show(Integer attr_show ){
		this.attr_show = attr_show;
	}
	
	/**
	* 排序
	*@return 
	*/
	public Integer getAttr_sort(){
		return  attr_sort;
	}
	/**
	* 排序
	*@param  attr_sort
	*/
	public void setAttr_sort(Integer attr_sort ){
		this.attr_sort = attr_sort;
	}
	
	/**
	* 所属类型id
	*@return 
	*/
	public Integer getType_id(){
		return  type_id;
	}
	/**
	* 所属类型id
	*@param  type_id
	*/
	public void setType_id(Integer type_id ){
		this.type_id = type_id;
	}
	
	/**
	* 属性名称
	*@return 
	*/
	public String getAttr_name(){
		return  attr_name;
	}
	/**
	* 属性名称
	*@param  attr_name
	*/
	public void setAttr_name(String attr_name ){
		this.attr_name = attr_name;
	}
	
	/**
	* 属性值列
	*@return 
	*/
	public String getAttr_value(){
		return  attr_value;
	}
	/**
	* 属性值列
	*@param  attr_value
	*/
	public void setAttr_value(String attr_value ){
		this.attr_value = attr_value;
	}
	

}
