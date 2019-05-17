package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_store_waybill")
public class RaStoreWaybill   {
	
	/*
	店铺运单模板编号
	*/
	private Integer storeWaybillId ;
	/*
	物流公司编号
	*/
	private Integer expressId ;
	/*
	是否默认模板
	*/
	private Integer isDefault ;
	/*
	店铺编号
	*/
	private Integer storeId ;
	/*
	店铺运单左偏移
	*/
	private Integer storeWaybillLeft ;
	/*
	店铺运单上偏移
	*/
	private Integer storeWaybillTop ;
	/*
	运单模板编号
	*/
	private Integer waybillId ;
	/*
	店铺自定义设置
	*/
	private String storeWaybillData ;
	/*
	运单模板名称
	*/
	private String waybillName ;
	
	public RaStoreWaybill() {
	}
	
	/**
	* 店铺运单模板编号
	*@return 
	*/
	public Integer getStoreWaybillId(){
		return  storeWaybillId;
	}
	/**
	* 店铺运单模板编号
	*@param  storeWaybillId
	*/
	public void setStoreWaybillId(Integer storeWaybillId ){
		this.storeWaybillId = storeWaybillId;
	}
	
	/**
	* 物流公司编号
	*@return 
	*/
	public Integer getExpressId(){
		return  expressId;
	}
	/**
	* 物流公司编号
	*@param  expressId
	*/
	public void setExpressId(Integer expressId ){
		this.expressId = expressId;
	}
	
	/**
	* 是否默认模板
	*@return 
	*/
	public Integer getIsDefault(){
		return  isDefault;
	}
	/**
	* 是否默认模板
	*@param  isDefault
	*/
	public void setIsDefault(Integer isDefault ){
		this.isDefault = isDefault;
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
	* 店铺运单左偏移
	*@return 
	*/
	public Integer getStoreWaybillLeft(){
		return  storeWaybillLeft;
	}
	/**
	* 店铺运单左偏移
	*@param  storeWaybillLeft
	*/
	public void setStoreWaybillLeft(Integer storeWaybillLeft ){
		this.storeWaybillLeft = storeWaybillLeft;
	}
	
	/**
	* 店铺运单上偏移
	*@return 
	*/
	public Integer getStoreWaybillTop(){
		return  storeWaybillTop;
	}
	/**
	* 店铺运单上偏移
	*@param  storeWaybillTop
	*/
	public void setStoreWaybillTop(Integer storeWaybillTop ){
		this.storeWaybillTop = storeWaybillTop;
	}
	
	/**
	* 运单模板编号
	*@return 
	*/
	public Integer getWaybillId(){
		return  waybillId;
	}
	/**
	* 运单模板编号
	*@param  waybillId
	*/
	public void setWaybillId(Integer waybillId ){
		this.waybillId = waybillId;
	}
	
	/**
	* 店铺自定义设置
	*@return 
	*/
	public String getStoreWaybillData(){
		return  storeWaybillData;
	}
	/**
	* 店铺自定义设置
	*@param  storeWaybillData
	*/
	public void setStoreWaybillData(String storeWaybillData ){
		this.storeWaybillData = storeWaybillData;
	}
	
	/**
	* 运单模板名称
	*@return 
	*/
	public String getWaybillName(){
		return  waybillName;
	}
	/**
	* 运单模板名称
	*@param  waybillName
	*/
	public void setWaybillName(String waybillName ){
		this.waybillName = waybillName;
	}
	

}
