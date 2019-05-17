package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_mb_category")
public class RaMbCategory   {
	
	// alias
	public static final String ALIAS_gc_id = "gc_id";
	public static final String ALIAS_gc_thumb = "gc_thumb";
	
	/*
	商城系统的分类ID
	*/
	private Integer gc_id ;
	/*
	缩略图
	*/
	private String gc_thumb ;
	
	public RaMbCategory() {
	}
	
	/**
	* 商城系统的分类ID
	*@return 
	*/
	public Integer getGc_id(){
		return  gc_id;
	}
	/**
	* 商城系统的分类ID
	*@param  gc_id
	*/
	public void setGc_id(Integer gc_id ){
		this.gc_id = gc_id;
	}
	
	/**
	* 缩略图
	*@return 
	*/
	public String getGc_thumb(){
		return  gc_thumb;
	}
	/**
	* 缩略图
	*@param  gc_thumb
	*/
	public void setGc_thumb(String gc_thumb ){
		this.gc_thumb = gc_thumb;
	}
	

}
