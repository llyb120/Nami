package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_store_decoration")
public class RaStoreDecoration   {
	
	// alias
	public static final String ALIAS_decoration_id = "decoration_id";
	public static final String ALIAS_store_id = "store_id";
	public static final String ALIAS_decoration_banner = "decoration_banner";
	public static final String ALIAS_decoration_name = "decoration_name";
	public static final String ALIAS_decoration_nav = "decoration_nav";
	public static final String ALIAS_decoration_setting = "decoration_setting";
	
	/*
	装修编号
	*/
	private Integer decoration_id ;
	/*
	店铺编号
	*/
	private Integer store_id ;
	/*
	装修头部banner
	*/
	private String decoration_banner ;
	/*
	装修名称
	*/
	private String decoration_name ;
	/*
	装修导航
	*/
	private String decoration_nav ;
	/*
	装修整体设置(背景、边距等)
	*/
	private String decoration_setting ;
	
	public RaStoreDecoration() {
	}
	
	/**
	* 装修编号
	*@return 
	*/
	public Integer getDecoration_id(){
		return  decoration_id;
	}
	/**
	* 装修编号
	*@param  decoration_id
	*/
	public void setDecoration_id(Integer decoration_id ){
		this.decoration_id = decoration_id;
	}
	
	/**
	* 店铺编号
	*@return 
	*/
	public Integer getStore_id(){
		return  store_id;
	}
	/**
	* 店铺编号
	*@param  store_id
	*/
	public void setStore_id(Integer store_id ){
		this.store_id = store_id;
	}
	
	/**
	* 装修头部banner
	*@return 
	*/
	public String getDecoration_banner(){
		return  decoration_banner;
	}
	/**
	* 装修头部banner
	*@param  decoration_banner
	*/
	public void setDecoration_banner(String decoration_banner ){
		this.decoration_banner = decoration_banner;
	}
	
	/**
	* 装修名称
	*@return 
	*/
	public String getDecoration_name(){
		return  decoration_name;
	}
	/**
	* 装修名称
	*@param  decoration_name
	*/
	public void setDecoration_name(String decoration_name ){
		this.decoration_name = decoration_name;
	}
	
	/**
	* 装修导航
	*@return 
	*/
	public String getDecoration_nav(){
		return  decoration_nav;
	}
	/**
	* 装修导航
	*@param  decoration_nav
	*/
	public void setDecoration_nav(String decoration_nav ){
		this.decoration_nav = decoration_nav;
	}
	
	/**
	* 装修整体设置(背景、边距等)
	*@return 
	*/
	public String getDecoration_setting(){
		return  decoration_setting;
	}
	/**
	* 装修整体设置(背景、边距等)
	*@param  decoration_setting
	*/
	public void setDecoration_setting(String decoration_setting ){
		this.decoration_setting = decoration_setting;
	}
	

}
