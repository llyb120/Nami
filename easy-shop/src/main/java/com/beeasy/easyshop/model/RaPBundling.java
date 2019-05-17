package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_p_bundling")
public class RaPBundling   {
	
	// alias
	public static final String ALIAS_bl_id = "bl_id";
	public static final String ALIAS_bl_freight_choose = "bl_freight_choose";
	public static final String ALIAS_bl_state = "bl_state";
	public static final String ALIAS_store_id = "store_id";
	public static final String ALIAS_bl_discount_price = "bl_discount_price";
	public static final String ALIAS_bl_freight = "bl_freight";
	public static final String ALIAS_bl_name = "bl_name";
	public static final String ALIAS_store_name = "store_name";
	
	/*
	组合ID
	*/
	private Integer bl_id ;
	/*
	运费承担方式
	*/
	private Integer bl_freight_choose ;
	/*
	组合状态 0-关闭/1-开启
	*/
	private Integer bl_state ;
	/*
	店铺名称
	*/
	private Integer store_id ;
	/*
	组合价格
	*/
	private BigDecimal bl_discount_price ;
	/*
	运费
	*/
	private BigDecimal bl_freight ;
	/*
	组合名称
	*/
	private String bl_name ;
	/*
	店铺名称
	*/
	private String store_name ;
	
	public RaPBundling() {
	}
	
	/**
	* 组合ID
	*@return 
	*/
	public Integer getBl_id(){
		return  bl_id;
	}
	/**
	* 组合ID
	*@param  bl_id
	*/
	public void setBl_id(Integer bl_id ){
		this.bl_id = bl_id;
	}
	
	/**
	* 运费承担方式
	*@return 
	*/
	public Integer getBl_freight_choose(){
		return  bl_freight_choose;
	}
	/**
	* 运费承担方式
	*@param  bl_freight_choose
	*/
	public void setBl_freight_choose(Integer bl_freight_choose ){
		this.bl_freight_choose = bl_freight_choose;
	}
	
	/**
	* 组合状态 0-关闭/1-开启
	*@return 
	*/
	public Integer getBl_state(){
		return  bl_state;
	}
	/**
	* 组合状态 0-关闭/1-开启
	*@param  bl_state
	*/
	public void setBl_state(Integer bl_state ){
		this.bl_state = bl_state;
	}
	
	/**
	* 店铺名称
	*@return 
	*/
	public Integer getStore_id(){
		return  store_id;
	}
	/**
	* 店铺名称
	*@param  store_id
	*/
	public void setStore_id(Integer store_id ){
		this.store_id = store_id;
	}
	
	/**
	* 组合价格
	*@return 
	*/
	public BigDecimal getBl_discount_price(){
		return  bl_discount_price;
	}
	/**
	* 组合价格
	*@param  bl_discount_price
	*/
	public void setBl_discount_price(BigDecimal bl_discount_price ){
		this.bl_discount_price = bl_discount_price;
	}
	
	/**
	* 运费
	*@return 
	*/
	public BigDecimal getBl_freight(){
		return  bl_freight;
	}
	/**
	* 运费
	*@param  bl_freight
	*/
	public void setBl_freight(BigDecimal bl_freight ){
		this.bl_freight = bl_freight;
	}
	
	/**
	* 组合名称
	*@return 
	*/
	public String getBl_name(){
		return  bl_name;
	}
	/**
	* 组合名称
	*@param  bl_name
	*/
	public void setBl_name(String bl_name ){
		this.bl_name = bl_name;
	}
	
	/**
	* 店铺名称
	*@return 
	*/
	public String getStore_name(){
		return  store_name;
	}
	/**
	* 店铺名称
	*@param  store_name
	*/
	public void setStore_name(String store_name ){
		this.store_name = store_name;
	}
	

}
