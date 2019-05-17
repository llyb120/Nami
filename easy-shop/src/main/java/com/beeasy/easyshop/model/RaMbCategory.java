package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_mb_category")
public class RaMbCategory   {
	
	/*
	商城系统的分类ID
	*/
	private Integer gcId ;
	/*
	缩略图
	*/
	private String gcThumb ;
	
	public RaMbCategory() {
	}
	
	/**
	* 商城系统的分类ID
	*@return 
	*/
	public Integer getGcId(){
		return  gcId;
	}
	/**
	* 商城系统的分类ID
	*@param  gcId
	*/
	public void setGcId(Integer gcId ){
		this.gcId = gcId;
	}
	
	/**
	* 缩略图
	*@return 
	*/
	public String getGcThumb(){
		return  gcThumb;
	}
	/**
	* 缩略图
	*@param  gcThumb
	*/
	public void setGcThumb(String gcThumb ){
		this.gcThumb = gcThumb;
	}
	

}
