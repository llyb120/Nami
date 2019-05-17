package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_groupbuy_class")
public class RaGroupbuyClass   {
	
	// alias
	public static final String ALIAS_class_id = "class_id";
	public static final String ALIAS_class_parent_id = "class_parent_id";
	public static final String ALIAS_deep = "deep";
	public static final String ALIAS_sort = "sort";
	public static final String ALIAS_class_name = "class_name";
	
	/*
	类别编号
	*/
	private Integer class_id ;
	/*
	父类别编号
	*/
	private Integer class_parent_id ;
	/*
	深度
	*/
	private Integer deep ;
	/*
	排序
	*/
	private Integer sort ;
	/*
	类别名称
	*/
	private String class_name ;
	
	public RaGroupbuyClass() {
	}
	
	/**
	* 类别编号
	*@return 
	*/
	public Integer getClass_id(){
		return  class_id;
	}
	/**
	* 类别编号
	*@param  class_id
	*/
	public void setClass_id(Integer class_id ){
		this.class_id = class_id;
	}
	
	/**
	* 父类别编号
	*@return 
	*/
	public Integer getClass_parent_id(){
		return  class_parent_id;
	}
	/**
	* 父类别编号
	*@param  class_parent_id
	*/
	public void setClass_parent_id(Integer class_parent_id ){
		this.class_parent_id = class_parent_id;
	}
	
	/**
	* 深度
	*@return 
	*/
	public Integer getDeep(){
		return  deep;
	}
	/**
	* 深度
	*@param  deep
	*/
	public void setDeep(Integer deep ){
		this.deep = deep;
	}
	
	/**
	* 排序
	*@return 
	*/
	public Integer getSort(){
		return  sort;
	}
	/**
	* 排序
	*@param  sort
	*/
	public void setSort(Integer sort ){
		this.sort = sort;
	}
	
	/**
	* 类别名称
	*@return 
	*/
	public String getClass_name(){
		return  class_name;
	}
	/**
	* 类别名称
	*@param  class_name
	*/
	public void setClass_name(String class_name ){
		this.class_name = class_name;
	}
	

}
