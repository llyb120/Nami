package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_store_navigation")
public class RaStoreNavigation   {
	
	/*
	导航ID
	*/
	private Integer snId ;
	/*
	导航
	*/
	private Integer snAddTime ;
	/*
	导航是否显示
	*/
	private Integer snIfShow ;
	/*
	店铺导航外链是否在新窗口打开：0不开新窗口1开新窗口，默认是0
	*/
	private Integer snNewOpen ;
	/*
	导航排序
	*/
	private Integer snSort ;
	/*
	卖家店铺ID
	*/
	private Integer snStoreId ;
	/*
	导航内容
	*/
	private String snContent ;
	/*
	导航名称
	*/
	private String snTitle ;
	/*
	店铺导航的外链URL
	*/
	private String snUrl ;
	
	public RaStoreNavigation() {
	}
	
	/**
	* 导航ID
	*@return 
	*/
	public Integer getSnId(){
		return  snId;
	}
	/**
	* 导航ID
	*@param  snId
	*/
	public void setSnId(Integer snId ){
		this.snId = snId;
	}
	
	/**
	* 导航
	*@return 
	*/
	public Integer getSnAddTime(){
		return  snAddTime;
	}
	/**
	* 导航
	*@param  snAddTime
	*/
	public void setSnAddTime(Integer snAddTime ){
		this.snAddTime = snAddTime;
	}
	
	/**
	* 导航是否显示
	*@return 
	*/
	public Integer getSnIfShow(){
		return  snIfShow;
	}
	/**
	* 导航是否显示
	*@param  snIfShow
	*/
	public void setSnIfShow(Integer snIfShow ){
		this.snIfShow = snIfShow;
	}
	
	/**
	* 店铺导航外链是否在新窗口打开：0不开新窗口1开新窗口，默认是0
	*@return 
	*/
	public Integer getSnNewOpen(){
		return  snNewOpen;
	}
	/**
	* 店铺导航外链是否在新窗口打开：0不开新窗口1开新窗口，默认是0
	*@param  snNewOpen
	*/
	public void setSnNewOpen(Integer snNewOpen ){
		this.snNewOpen = snNewOpen;
	}
	
	/**
	* 导航排序
	*@return 
	*/
	public Integer getSnSort(){
		return  snSort;
	}
	/**
	* 导航排序
	*@param  snSort
	*/
	public void setSnSort(Integer snSort ){
		this.snSort = snSort;
	}
	
	/**
	* 卖家店铺ID
	*@return 
	*/
	public Integer getSnStoreId(){
		return  snStoreId;
	}
	/**
	* 卖家店铺ID
	*@param  snStoreId
	*/
	public void setSnStoreId(Integer snStoreId ){
		this.snStoreId = snStoreId;
	}
	
	/**
	* 导航内容
	*@return 
	*/
	public String getSnContent(){
		return  snContent;
	}
	/**
	* 导航内容
	*@param  snContent
	*/
	public void setSnContent(String snContent ){
		this.snContent = snContent;
	}
	
	/**
	* 导航名称
	*@return 
	*/
	public String getSnTitle(){
		return  snTitle;
	}
	/**
	* 导航名称
	*@param  snTitle
	*/
	public void setSnTitle(String snTitle ){
		this.snTitle = snTitle;
	}
	
	/**
	* 店铺导航的外链URL
	*@return 
	*/
	public String getSnUrl(){
		return  snUrl;
	}
	/**
	* 店铺导航的外链URL
	*@param  snUrl
	*/
	public void setSnUrl(String snUrl ){
		this.snUrl = snUrl;
	}
	

}
