package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_transport")
public class RaTransport   {
	
	// alias
	public static final String ALIAS_id = "id";
	public static final String ALIAS_send_tpl_id = "send_tpl_id";
	public static final String ALIAS_store_id = "store_id";
	public static final String ALIAS_update_time = "update_time";
	public static final String ALIAS_title = "title";
	
	/*
	运费模板ID
	*/
	private Integer id ;
	/*
	发货地区模板ID
	*/
	private Integer send_tpl_id ;
	/*
	店铺ID
	*/
	private Integer store_id ;
	/*
	最后更新时间
	*/
	private Integer update_time ;
	/*
	运费模板名称
	*/
	private String title ;
	
	public RaTransport() {
	}
	
	/**
	* 运费模板ID
	*@return 
	*/
	public Integer getId(){
		return  id;
	}
	/**
	* 运费模板ID
	*@param  id
	*/
	public void setId(Integer id ){
		this.id = id;
	}
	
	/**
	* 发货地区模板ID
	*@return 
	*/
	public Integer getSend_tpl_id(){
		return  send_tpl_id;
	}
	/**
	* 发货地区模板ID
	*@param  send_tpl_id
	*/
	public void setSend_tpl_id(Integer send_tpl_id ){
		this.send_tpl_id = send_tpl_id;
	}
	
	/**
	* 店铺ID
	*@return 
	*/
	public Integer getStore_id(){
		return  store_id;
	}
	/**
	* 店铺ID
	*@param  store_id
	*/
	public void setStore_id(Integer store_id ){
		this.store_id = store_id;
	}
	
	/**
	* 最后更新时间
	*@return 
	*/
	public Integer getUpdate_time(){
		return  update_time;
	}
	/**
	* 最后更新时间
	*@param  update_time
	*/
	public void setUpdate_time(Integer update_time ){
		this.update_time = update_time;
	}
	
	/**
	* 运费模板名称
	*@return 
	*/
	public String getTitle(){
		return  title;
	}
	/**
	* 运费模板名称
	*@param  title
	*/
	public void setTitle(String title ){
		this.title = title;
	}
	

}
