package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_navigation")
public class RaNavigation   {
	
	// alias
	public static final String ALIAS_nav_id = "nav_id";
	public static final String ALIAS_item_id = "item_id";
	public static final String ALIAS_nav_location = "nav_location";
	public static final String ALIAS_nav_new_open = "nav_new_open";
	public static final String ALIAS_nav_sort = "nav_sort";
	public static final String ALIAS_nav_type = "nav_type";
	public static final String ALIAS_nav_title = "nav_title";
	public static final String ALIAS_nav_url = "nav_url";
	
	/*
	索引ID
	*/
	private Integer nav_id ;
	/*
	类别ID，对应着nav_type中的内容，默认为0
	*/
	private Integer item_id ;
	/*
	导航位置，0头部，1中部，2底部，默认为0
	*/
	private Integer nav_location ;
	/*
	是否以新窗口打开，0为否，1为是，默认为0
	*/
	private Integer nav_new_open ;
	/*
	排序
	*/
	private Integer nav_sort ;
	/*
	类别，0自定义导航，1商品分类，2文章导航，3活动导航，默认为0
	*/
	private Integer nav_type ;
	/*
	导航标题
	*/
	private String nav_title ;
	/*
	导航链接
	*/
	private String nav_url ;
	
	public RaNavigation() {
	}
	
	/**
	* 索引ID
	*@return 
	*/
	public Integer getNav_id(){
		return  nav_id;
	}
	/**
	* 索引ID
	*@param  nav_id
	*/
	public void setNav_id(Integer nav_id ){
		this.nav_id = nav_id;
	}
	
	/**
	* 类别ID，对应着nav_type中的内容，默认为0
	*@return 
	*/
	public Integer getItem_id(){
		return  item_id;
	}
	/**
	* 类别ID，对应着nav_type中的内容，默认为0
	*@param  item_id
	*/
	public void setItem_id(Integer item_id ){
		this.item_id = item_id;
	}
	
	/**
	* 导航位置，0头部，1中部，2底部，默认为0
	*@return 
	*/
	public Integer getNav_location(){
		return  nav_location;
	}
	/**
	* 导航位置，0头部，1中部，2底部，默认为0
	*@param  nav_location
	*/
	public void setNav_location(Integer nav_location ){
		this.nav_location = nav_location;
	}
	
	/**
	* 是否以新窗口打开，0为否，1为是，默认为0
	*@return 
	*/
	public Integer getNav_new_open(){
		return  nav_new_open;
	}
	/**
	* 是否以新窗口打开，0为否，1为是，默认为0
	*@param  nav_new_open
	*/
	public void setNav_new_open(Integer nav_new_open ){
		this.nav_new_open = nav_new_open;
	}
	
	/**
	* 排序
	*@return 
	*/
	public Integer getNav_sort(){
		return  nav_sort;
	}
	/**
	* 排序
	*@param  nav_sort
	*/
	public void setNav_sort(Integer nav_sort ){
		this.nav_sort = nav_sort;
	}
	
	/**
	* 类别，0自定义导航，1商品分类，2文章导航，3活动导航，默认为0
	*@return 
	*/
	public Integer getNav_type(){
		return  nav_type;
	}
	/**
	* 类别，0自定义导航，1商品分类，2文章导航，3活动导航，默认为0
	*@param  nav_type
	*/
	public void setNav_type(Integer nav_type ){
		this.nav_type = nav_type;
	}
	
	/**
	* 导航标题
	*@return 
	*/
	public String getNav_title(){
		return  nav_title;
	}
	/**
	* 导航标题
	*@param  nav_title
	*/
	public void setNav_title(String nav_title ){
		this.nav_title = nav_title;
	}
	
	/**
	* 导航链接
	*@return 
	*/
	public String getNav_url(){
		return  nav_url;
	}
	/**
	* 导航链接
	*@param  nav_url
	*/
	public void setNav_url(String nav_url ){
		this.nav_url = nav_url;
	}
	

}
