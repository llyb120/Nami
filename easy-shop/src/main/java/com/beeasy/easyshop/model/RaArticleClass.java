package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_article_class")
public class RaArticleClass   {
	
	// alias
	public static final String ALIAS_ac_id = "ac_id";
	public static final String ALIAS_ac_parent_id = "ac_parent_id";
	public static final String ALIAS_ac_sort = "ac_sort";
	public static final String ALIAS_ac_code = "ac_code";
	public static final String ALIAS_ac_name = "ac_name";
	
	/*
	索引ID
	*/
	private Integer ac_id ;
	/*
	父ID
	*/
	private Integer ac_parent_id ;
	/*
	排序
	*/
	private Integer ac_sort ;
	/*
	分类标识码
	*/
	private String ac_code ;
	/*
	分类名称
	*/
	private String ac_name ;
	
	public RaArticleClass() {
	}
	
	/**
	* 索引ID
	*@return 
	*/
	public Integer getAc_id(){
		return  ac_id;
	}
	/**
	* 索引ID
	*@param  ac_id
	*/
	public void setAc_id(Integer ac_id ){
		this.ac_id = ac_id;
	}
	
	/**
	* 父ID
	*@return 
	*/
	public Integer getAc_parent_id(){
		return  ac_parent_id;
	}
	/**
	* 父ID
	*@param  ac_parent_id
	*/
	public void setAc_parent_id(Integer ac_parent_id ){
		this.ac_parent_id = ac_parent_id;
	}
	
	/**
	* 排序
	*@return 
	*/
	public Integer getAc_sort(){
		return  ac_sort;
	}
	/**
	* 排序
	*@param  ac_sort
	*/
	public void setAc_sort(Integer ac_sort ){
		this.ac_sort = ac_sort;
	}
	
	/**
	* 分类标识码
	*@return 
	*/
	public String getAc_code(){
		return  ac_code;
	}
	/**
	* 分类标识码
	*@param  ac_code
	*/
	public void setAc_code(String ac_code ){
		this.ac_code = ac_code;
	}
	
	/**
	* 分类名称
	*@return 
	*/
	public String getAc_name(){
		return  ac_name;
	}
	/**
	* 分类名称
	*@param  ac_name
	*/
	public void setAc_name(String ac_name ){
		this.ac_name = ac_name;
	}
	

}
