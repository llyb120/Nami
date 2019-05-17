package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_store_navigation")
public class RaStoreNavigation   {
	
	// alias
	public static final String ALIAS_sn_id = "sn_id";
	public static final String ALIAS_sn_add_time = "sn_add_time";
	public static final String ALIAS_sn_if_show = "sn_if_show";
	public static final String ALIAS_sn_new_open = "sn_new_open";
	public static final String ALIAS_sn_sort = "sn_sort";
	public static final String ALIAS_sn_store_id = "sn_store_id";
	public static final String ALIAS_sn_content = "sn_content";
	public static final String ALIAS_sn_title = "sn_title";
	public static final String ALIAS_sn_url = "sn_url";
	
	/*
	导航ID
	*/
	private Integer sn_id ;
	/*
	导航
	*/
	private Integer sn_add_time ;
	/*
	导航是否显示
	*/
	private Integer sn_if_show ;
	/*
	店铺导航外链是否在新窗口打开：0不开新窗口1开新窗口，默认是0
	*/
	private Integer sn_new_open ;
	/*
	导航排序
	*/
	private Integer sn_sort ;
	/*
	卖家店铺ID
	*/
	private Integer sn_store_id ;
	/*
	导航内容
	*/
	private String sn_content ;
	/*
	导航名称
	*/
	private String sn_title ;
	/*
	店铺导航的外链URL
	*/
	private String sn_url ;
	
	public RaStoreNavigation() {
	}
	
	/**
	* 导航ID
	*@return 
	*/
	public Integer getSn_id(){
		return  sn_id;
	}
	/**
	* 导航ID
	*@param  sn_id
	*/
	public void setSn_id(Integer sn_id ){
		this.sn_id = sn_id;
	}
	
	/**
	* 导航
	*@return 
	*/
	public Integer getSn_add_time(){
		return  sn_add_time;
	}
	/**
	* 导航
	*@param  sn_add_time
	*/
	public void setSn_add_time(Integer sn_add_time ){
		this.sn_add_time = sn_add_time;
	}
	
	/**
	* 导航是否显示
	*@return 
	*/
	public Integer getSn_if_show(){
		return  sn_if_show;
	}
	/**
	* 导航是否显示
	*@param  sn_if_show
	*/
	public void setSn_if_show(Integer sn_if_show ){
		this.sn_if_show = sn_if_show;
	}
	
	/**
	* 店铺导航外链是否在新窗口打开：0不开新窗口1开新窗口，默认是0
	*@return 
	*/
	public Integer getSn_new_open(){
		return  sn_new_open;
	}
	/**
	* 店铺导航外链是否在新窗口打开：0不开新窗口1开新窗口，默认是0
	*@param  sn_new_open
	*/
	public void setSn_new_open(Integer sn_new_open ){
		this.sn_new_open = sn_new_open;
	}
	
	/**
	* 导航排序
	*@return 
	*/
	public Integer getSn_sort(){
		return  sn_sort;
	}
	/**
	* 导航排序
	*@param  sn_sort
	*/
	public void setSn_sort(Integer sn_sort ){
		this.sn_sort = sn_sort;
	}
	
	/**
	* 卖家店铺ID
	*@return 
	*/
	public Integer getSn_store_id(){
		return  sn_store_id;
	}
	/**
	* 卖家店铺ID
	*@param  sn_store_id
	*/
	public void setSn_store_id(Integer sn_store_id ){
		this.sn_store_id = sn_store_id;
	}
	
	/**
	* 导航内容
	*@return 
	*/
	public String getSn_content(){
		return  sn_content;
	}
	/**
	* 导航内容
	*@param  sn_content
	*/
	public void setSn_content(String sn_content ){
		this.sn_content = sn_content;
	}
	
	/**
	* 导航名称
	*@return 
	*/
	public String getSn_title(){
		return  sn_title;
	}
	/**
	* 导航名称
	*@param  sn_title
	*/
	public void setSn_title(String sn_title ){
		this.sn_title = sn_title;
	}
	
	/**
	* 店铺导航的外链URL
	*@return 
	*/
	public String getSn_url(){
		return  sn_url;
	}
	/**
	* 店铺导航的外链URL
	*@param  sn_url
	*/
	public void setSn_url(String sn_url ){
		this.sn_url = sn_url;
	}
	

}
