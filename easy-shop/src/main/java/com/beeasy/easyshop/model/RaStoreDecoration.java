package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_store_decoration")
public class RaStoreDecoration   {
	
	/*
	装修编号
	*/
	private Integer decorationId ;
	/*
	店铺编号
	*/
	private Integer storeId ;
	/*
	装修头部banner
	*/
	private String decorationBanner ;
	/*
	装修名称
	*/
	private String decorationName ;
	/*
	装修导航
	*/
	private String decorationNav ;
	/*
	装修整体设置(背景、边距等)
	*/
	private String decorationSetting ;
	
	public RaStoreDecoration() {
	}
	
	/**
	* 装修编号
	*@return 
	*/
	public Integer getDecorationId(){
		return  decorationId;
	}
	/**
	* 装修编号
	*@param  decorationId
	*/
	public void setDecorationId(Integer decorationId ){
		this.decorationId = decorationId;
	}
	
	/**
	* 店铺编号
	*@return 
	*/
	public Integer getStoreId(){
		return  storeId;
	}
	/**
	* 店铺编号
	*@param  storeId
	*/
	public void setStoreId(Integer storeId ){
		this.storeId = storeId;
	}
	
	/**
	* 装修头部banner
	*@return 
	*/
	public String getDecorationBanner(){
		return  decorationBanner;
	}
	/**
	* 装修头部banner
	*@param  decorationBanner
	*/
	public void setDecorationBanner(String decorationBanner ){
		this.decorationBanner = decorationBanner;
	}
	
	/**
	* 装修名称
	*@return 
	*/
	public String getDecorationName(){
		return  decorationName;
	}
	/**
	* 装修名称
	*@param  decorationName
	*/
	public void setDecorationName(String decorationName ){
		this.decorationName = decorationName;
	}
	
	/**
	* 装修导航
	*@return 
	*/
	public String getDecorationNav(){
		return  decorationNav;
	}
	/**
	* 装修导航
	*@param  decorationNav
	*/
	public void setDecorationNav(String decorationNav ){
		this.decorationNav = decorationNav;
	}
	
	/**
	* 装修整体设置(背景、边距等)
	*@return 
	*/
	public String getDecorationSetting(){
		return  decorationSetting;
	}
	/**
	* 装修整体设置(背景、边距等)
	*@param  decorationSetting
	*/
	public void setDecorationSetting(String decorationSetting ){
		this.decorationSetting = decorationSetting;
	}
	

}
