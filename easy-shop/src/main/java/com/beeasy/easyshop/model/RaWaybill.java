package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_waybill")
public class RaWaybill   {
	
	// alias
	public static final String ALIAS_waybill_id = "waybill_id";
	public static final String ALIAS_express_id = "express_id";
	public static final String ALIAS_store_id = "store_id";
	public static final String ALIAS_waybill_height = "waybill_height";
	public static final String ALIAS_waybill_left = "waybill_left";
	public static final String ALIAS_waybill_top = "waybill_top";
	public static final String ALIAS_waybill_usable = "waybill_usable";
	public static final String ALIAS_waybill_width = "waybill_width";
	public static final String ALIAS_express_name = "express_name";
	public static final String ALIAS_waybill_data = "waybill_data";
	public static final String ALIAS_waybill_image = "waybill_image";
	public static final String ALIAS_waybill_name = "waybill_name";
	
	/*
	编号
	*/
	private Integer waybill_id ;
	/*
	快递公司编号
	*/
	private Integer express_id ;
	/*
	店铺编号(0-代表系统模板)
	*/
	private Integer store_id ;
	/*
	高度
	*/
	private Integer waybill_height ;
	/*
	左偏移量
	*/
	private Integer waybill_left ;
	/*
	上偏移量
	*/
	private Integer waybill_top ;
	/*
	是否可用
	*/
	private Integer waybill_usable ;
	/*
	宽度
	*/
	private Integer waybill_width ;
	/*
	快递公司名称
	*/
	private String express_name ;
	/*
	打印位置数据
	*/
	private String waybill_data ;
	private String waybill_image ;
	private String waybill_name ;
	
	public RaWaybill() {
	}
	
	/**
	* 编号
	*@return 
	*/
	public Integer getWaybill_id(){
		return  waybill_id;
	}
	/**
	* 编号
	*@param  waybill_id
	*/
	public void setWaybill_id(Integer waybill_id ){
		this.waybill_id = waybill_id;
	}
	
	/**
	* 快递公司编号
	*@return 
	*/
	public Integer getExpress_id(){
		return  express_id;
	}
	/**
	* 快递公司编号
	*@param  express_id
	*/
	public void setExpress_id(Integer express_id ){
		this.express_id = express_id;
	}
	
	/**
	* 店铺编号(0-代表系统模板)
	*@return 
	*/
	public Integer getStore_id(){
		return  store_id;
	}
	/**
	* 店铺编号(0-代表系统模板)
	*@param  store_id
	*/
	public void setStore_id(Integer store_id ){
		this.store_id = store_id;
	}
	
	/**
	* 高度
	*@return 
	*/
	public Integer getWaybill_height(){
		return  waybill_height;
	}
	/**
	* 高度
	*@param  waybill_height
	*/
	public void setWaybill_height(Integer waybill_height ){
		this.waybill_height = waybill_height;
	}
	
	/**
	* 左偏移量
	*@return 
	*/
	public Integer getWaybill_left(){
		return  waybill_left;
	}
	/**
	* 左偏移量
	*@param  waybill_left
	*/
	public void setWaybill_left(Integer waybill_left ){
		this.waybill_left = waybill_left;
	}
	
	/**
	* 上偏移量
	*@return 
	*/
	public Integer getWaybill_top(){
		return  waybill_top;
	}
	/**
	* 上偏移量
	*@param  waybill_top
	*/
	public void setWaybill_top(Integer waybill_top ){
		this.waybill_top = waybill_top;
	}
	
	/**
	* 是否可用
	*@return 
	*/
	public Integer getWaybill_usable(){
		return  waybill_usable;
	}
	/**
	* 是否可用
	*@param  waybill_usable
	*/
	public void setWaybill_usable(Integer waybill_usable ){
		this.waybill_usable = waybill_usable;
	}
	
	/**
	* 宽度
	*@return 
	*/
	public Integer getWaybill_width(){
		return  waybill_width;
	}
	/**
	* 宽度
	*@param  waybill_width
	*/
	public void setWaybill_width(Integer waybill_width ){
		this.waybill_width = waybill_width;
	}
	
	/**
	* 快递公司名称
	*@return 
	*/
	public String getExpress_name(){
		return  express_name;
	}
	/**
	* 快递公司名称
	*@param  express_name
	*/
	public void setExpress_name(String express_name ){
		this.express_name = express_name;
	}
	
	/**
	* 打印位置数据
	*@return 
	*/
	public String getWaybill_data(){
		return  waybill_data;
	}
	/**
	* 打印位置数据
	*@param  waybill_data
	*/
	public void setWaybill_data(String waybill_data ){
		this.waybill_data = waybill_data;
	}
	
	public String getWaybill_image(){
		return  waybill_image;
	}
	public void setWaybill_image(String waybill_image ){
		this.waybill_image = waybill_image;
	}
	
	public String getWaybill_name(){
		return  waybill_name;
	}
	public void setWaybill_name(String waybill_name ){
		this.waybill_name = waybill_name;
	}
	

}
