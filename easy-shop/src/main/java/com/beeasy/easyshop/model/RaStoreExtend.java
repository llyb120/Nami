package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_store_extend")
public class RaStoreExtend   {
	
	// alias
	public static final String ALIAS_store_id = "store_id";
	public static final String ALIAS_express = "express";
	public static final String ALIAS_orderpricerange = "orderpricerange";
	public static final String ALIAS_pricerange = "pricerange";
	
	/*
	店铺ID
	*/
	private Integer store_id ;
	/*
	快递公司ID的组合
	*/
	private String express ;
	/*
	店铺统计设置的订单价格区间
	*/
	private String orderpricerange ;
	/*
	店铺统计设置的商品价格区间
	*/
	private String pricerange ;
	
	public RaStoreExtend() {
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
	* 快递公司ID的组合
	*@return 
	*/
	public String getExpress(){
		return  express;
	}
	/**
	* 快递公司ID的组合
	*@param  express
	*/
	public void setExpress(String express ){
		this.express = express;
	}
	
	/**
	* 店铺统计设置的订单价格区间
	*@return 
	*/
	public String getOrderpricerange(){
		return  orderpricerange;
	}
	/**
	* 店铺统计设置的订单价格区间
	*@param  orderpricerange
	*/
	public void setOrderpricerange(String orderpricerange ){
		this.orderpricerange = orderpricerange;
	}
	
	/**
	* 店铺统计设置的商品价格区间
	*@return 
	*/
	public String getPricerange(){
		return  pricerange;
	}
	/**
	* 店铺统计设置的商品价格区间
	*@param  pricerange
	*/
	public void setPricerange(String pricerange ){
		this.pricerange = pricerange;
	}
	

}
