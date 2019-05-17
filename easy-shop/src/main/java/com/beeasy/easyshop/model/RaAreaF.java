package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_area_f")
public class RaAreaF   {
	
	// alias
	public static final String ALIAS_area_id = "area_id";
	public static final String ALIAS_area_deep = "area_deep";
	public static final String ALIAS_area_parent_id = "area_parent_id";
	public static final String ALIAS_area_sort = "area_sort";
	public static final String ALIAS_area_code = "area_code";
	public static final String ALIAS_area_name = "area_name";
	public static final String ALIAS_area_region = "area_region";
	
	/*
	索引ID
	*/
	private Integer area_id ;
	/*
	地区深度，从1开始
	*/
	private Integer area_deep ;
	/*
	地区父ID
	*/
	private Integer area_parent_id ;
	/*
	排序
	*/
	private Integer area_sort ;
	private String area_code ;
	/*
	地区名称
	*/
	private String area_name ;
	/*
	大区名称
	*/
	private String area_region ;
	
	public RaAreaF() {
	}
	
	/**
	* 索引ID
	*@return 
	*/
	public Integer getArea_id(){
		return  area_id;
	}
	/**
	* 索引ID
	*@param  area_id
	*/
	public void setArea_id(Integer area_id ){
		this.area_id = area_id;
	}
	
	/**
	* 地区深度，从1开始
	*@return 
	*/
	public Integer getArea_deep(){
		return  area_deep;
	}
	/**
	* 地区深度，从1开始
	*@param  area_deep
	*/
	public void setArea_deep(Integer area_deep ){
		this.area_deep = area_deep;
	}
	
	/**
	* 地区父ID
	*@return 
	*/
	public Integer getArea_parent_id(){
		return  area_parent_id;
	}
	/**
	* 地区父ID
	*@param  area_parent_id
	*/
	public void setArea_parent_id(Integer area_parent_id ){
		this.area_parent_id = area_parent_id;
	}
	
	/**
	* 排序
	*@return 
	*/
	public Integer getArea_sort(){
		return  area_sort;
	}
	/**
	* 排序
	*@param  area_sort
	*/
	public void setArea_sort(Integer area_sort ){
		this.area_sort = area_sort;
	}
	
	public String getArea_code(){
		return  area_code;
	}
	public void setArea_code(String area_code ){
		this.area_code = area_code;
	}
	
	/**
	* 地区名称
	*@return 
	*/
	public String getArea_name(){
		return  area_name;
	}
	/**
	* 地区名称
	*@param  area_name
	*/
	public void setArea_name(String area_name ){
		this.area_name = area_name;
	}
	
	/**
	* 大区名称
	*@return 
	*/
	public String getArea_region(){
		return  area_region;
	}
	/**
	* 大区名称
	*@param  area_region
	*/
	public void setArea_region(String area_region ){
		this.area_region = area_region;
	}
	

}
