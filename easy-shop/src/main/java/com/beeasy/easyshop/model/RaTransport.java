package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_transport")
public class RaTransport   {
	
	/*
	运费模板ID
	*/
	private Integer id ;
	/*
	发货地区模板ID
	*/
	private Integer sendTplId ;
	/*
	店铺ID
	*/
	private Integer storeId ;
	/*
	最后更新时间
	*/
	private Integer updateTime ;
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
	public Integer getSendTplId(){
		return  sendTplId;
	}
	/**
	* 发货地区模板ID
	*@param  sendTplId
	*/
	public void setSendTplId(Integer sendTplId ){
		this.sendTplId = sendTplId;
	}
	
	/**
	* 店铺ID
	*@return 
	*/
	public Integer getStoreId(){
		return  storeId;
	}
	/**
	* 店铺ID
	*@param  storeId
	*/
	public void setStoreId(Integer storeId ){
		this.storeId = storeId;
	}
	
	/**
	* 最后更新时间
	*@return 
	*/
	public Integer getUpdateTime(){
		return  updateTime;
	}
	/**
	* 最后更新时间
	*@param  updateTime
	*/
	public void setUpdateTime(Integer updateTime ){
		this.updateTime = updateTime;
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
