package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_store_waybill")
public class RaStoreWaybill   {
	
	// alias
	public static final String ALIAS_store_waybill_id = "store_waybill_id";
	public static final String ALIAS_express_id = "express_id";
	public static final String ALIAS_is_default = "is_default";
	public static final String ALIAS_store_id = "store_id";
	public static final String ALIAS_store_waybill_left = "store_waybill_left";
	public static final String ALIAS_store_waybill_top = "store_waybill_top";
	public static final String ALIAS_waybill_id = "waybill_id";
	public static final String ALIAS_store_waybill_data = "store_waybill_data";
	public static final String ALIAS_waybill_name = "waybill_name";
	
	/*
	店铺运单模板编号
	*/
	private Integer store_waybill_id ;
	/*
	物流公司编号
	*/
	private Integer express_id ;
	/*
	是否默认模板
	*/
	private Integer is_default ;
	/*
	店铺编号
	*/
	private Integer store_id ;
	/*
	店铺运单左偏移
	*/
	private Integer store_waybill_left ;
	/*
	店铺运单上偏移
	*/
	private Integer store_waybill_top ;
	/*
	运单模板编号
	*/
	private Integer waybill_id ;
	/*
	店铺自定义设置
	*/
	private String store_waybill_data ;
	/*
	运单模板名称
	*/
	private String waybill_name ;
	
	public RaStoreWaybill() {
	}
	
	/**
	* 店铺运单模板编号
	*@return 
	*/
	public Integer getStore_waybill_id(){
		return  store_waybill_id;
	}
	/**
	* 店铺运单模板编号
	*@param  store_waybill_id
	*/
	public void setStore_waybill_id(Integer store_waybill_id ){
		this.store_waybill_id = store_waybill_id;
	}
	
	/**
	* 物流公司编号
	*@return 
	*/
	public Integer getExpress_id(){
		return  express_id;
	}
	/**
	* 物流公司编号
	*@param  express_id
	*/
	public void setExpress_id(Integer express_id ){
		this.express_id = express_id;
	}
	
	/**
	* 是否默认模板
	*@return 
	*/
	public Integer getIs_default(){
		return  is_default;
	}
	/**
	* 是否默认模板
	*@param  is_default
	*/
	public void setIs_default(Integer is_default ){
		this.is_default = is_default;
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
	* 店铺运单左偏移
	*@return 
	*/
	public Integer getStore_waybill_left(){
		return  store_waybill_left;
	}
	/**
	* 店铺运单左偏移
	*@param  store_waybill_left
	*/
	public void setStore_waybill_left(Integer store_waybill_left ){
		this.store_waybill_left = store_waybill_left;
	}
	
	/**
	* 店铺运单上偏移
	*@return 
	*/
	public Integer getStore_waybill_top(){
		return  store_waybill_top;
	}
	/**
	* 店铺运单上偏移
	*@param  store_waybill_top
	*/
	public void setStore_waybill_top(Integer store_waybill_top ){
		this.store_waybill_top = store_waybill_top;
	}
	
	/**
	* 运单模板编号
	*@return 
	*/
	public Integer getWaybill_id(){
		return  waybill_id;
	}
	/**
	* 运单模板编号
	*@param  waybill_id
	*/
	public void setWaybill_id(Integer waybill_id ){
		this.waybill_id = waybill_id;
	}
	
	/**
	* 店铺自定义设置
	*@return 
	*/
	public String getStore_waybill_data(){
		return  store_waybill_data;
	}
	/**
	* 店铺自定义设置
	*@param  store_waybill_data
	*/
	public void setStore_waybill_data(String store_waybill_data ){
		this.store_waybill_data = store_waybill_data;
	}
	
	/**
	* 运单模板名称
	*@return 
	*/
	public String getWaybill_name(){
		return  waybill_name;
	}
	/**
	* 运单模板名称
	*@param  waybill_name
	*/
	public void setWaybill_name(String waybill_name ){
		this.waybill_name = waybill_name;
	}
	

}
