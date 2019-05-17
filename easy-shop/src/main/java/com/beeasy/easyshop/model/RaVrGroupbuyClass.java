package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_vr_groupbuy_class")
public class RaVrGroupbuyClass   {
	
	// alias
	public static final String ALIAS_class_id = "class_id";
	public static final String ALIAS_class_sort = "class_sort";
	public static final String ALIAS_parent_class_id = "parent_class_id";
	public static final String ALIAS_class_name = "class_name";
	
	/*
	分类id
	*/
	private Integer class_id ;
	/*
	分类排序
	*/
	private Integer class_sort ;
	/*
	父类class_id
	*/
	private Integer parent_class_id ;
	/*
	分类名称
	*/
	private String class_name ;
	
	public RaVrGroupbuyClass() {
	}
	
	/**
	* 分类id
	*@return 
	*/
	public Integer getClass_id(){
		return  class_id;
	}
	/**
	* 分类id
	*@param  class_id
	*/
	public void setClass_id(Integer class_id ){
		this.class_id = class_id;
	}
	
	/**
	* 分类排序
	*@return 
	*/
	public Integer getClass_sort(){
		return  class_sort;
	}
	/**
	* 分类排序
	*@param  class_sort
	*/
	public void setClass_sort(Integer class_sort ){
		this.class_sort = class_sort;
	}
	
	/**
	* 父类class_id
	*@return 
	*/
	public Integer getParent_class_id(){
		return  parent_class_id;
	}
	/**
	* 父类class_id
	*@param  parent_class_id
	*/
	public void setParent_class_id(Integer parent_class_id ){
		this.parent_class_id = parent_class_id;
	}
	
	/**
	* 分类名称
	*@return 
	*/
	public String getClass_name(){
		return  class_name;
	}
	/**
	* 分类名称
	*@param  class_name
	*/
	public void setClass_name(String class_name ){
		this.class_name = class_name;
	}
	

}
