package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_navigation")
public class RaNavigation   {
	
	/*
	索引ID
	*/
	private Integer navId ;
	/*
	类别ID，对应着nav_type中的内容，默认为0
	*/
	private Integer itemId ;
	/*
	导航位置，0头部，1中部，2底部，默认为0
	*/
	private Integer navLocation ;
	/*
	是否以新窗口打开，0为否，1为是，默认为0
	*/
	private Integer navNewOpen ;
	/*
	排序
	*/
	private Integer navSort ;
	/*
	类别，0自定义导航，1商品分类，2文章导航，3活动导航，默认为0
	*/
	private Integer navType ;
	/*
	导航标题
	*/
	private String navTitle ;
	/*
	导航链接
	*/
	private String navUrl ;
	
	public RaNavigation() {
	}
	
	/**
	* 索引ID
	*@return 
	*/
	public Integer getNavId(){
		return  navId;
	}
	/**
	* 索引ID
	*@param  navId
	*/
	public void setNavId(Integer navId ){
		this.navId = navId;
	}
	
	/**
	* 类别ID，对应着nav_type中的内容，默认为0
	*@return 
	*/
	public Integer getItemId(){
		return  itemId;
	}
	/**
	* 类别ID，对应着nav_type中的内容，默认为0
	*@param  itemId
	*/
	public void setItemId(Integer itemId ){
		this.itemId = itemId;
	}
	
	/**
	* 导航位置，0头部，1中部，2底部，默认为0
	*@return 
	*/
	public Integer getNavLocation(){
		return  navLocation;
	}
	/**
	* 导航位置，0头部，1中部，2底部，默认为0
	*@param  navLocation
	*/
	public void setNavLocation(Integer navLocation ){
		this.navLocation = navLocation;
	}
	
	/**
	* 是否以新窗口打开，0为否，1为是，默认为0
	*@return 
	*/
	public Integer getNavNewOpen(){
		return  navNewOpen;
	}
	/**
	* 是否以新窗口打开，0为否，1为是，默认为0
	*@param  navNewOpen
	*/
	public void setNavNewOpen(Integer navNewOpen ){
		this.navNewOpen = navNewOpen;
	}
	
	/**
	* 排序
	*@return 
	*/
	public Integer getNavSort(){
		return  navSort;
	}
	/**
	* 排序
	*@param  navSort
	*/
	public void setNavSort(Integer navSort ){
		this.navSort = navSort;
	}
	
	/**
	* 类别，0自定义导航，1商品分类，2文章导航，3活动导航，默认为0
	*@return 
	*/
	public Integer getNavType(){
		return  navType;
	}
	/**
	* 类别，0自定义导航，1商品分类，2文章导航，3活动导航，默认为0
	*@param  navType
	*/
	public void setNavType(Integer navType ){
		this.navType = navType;
	}
	
	/**
	* 导航标题
	*@return 
	*/
	public String getNavTitle(){
		return  navTitle;
	}
	/**
	* 导航标题
	*@param  navTitle
	*/
	public void setNavTitle(String navTitle ){
		this.navTitle = navTitle;
	}
	
	/**
	* 导航链接
	*@return 
	*/
	public String getNavUrl(){
		return  navUrl;
	}
	/**
	* 导航链接
	*@param  navUrl
	*/
	public void setNavUrl(String navUrl ){
		this.navUrl = navUrl;
	}
	

}
