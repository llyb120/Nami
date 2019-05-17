package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_store_extend")
public class RaStoreExtend   {
	
	/*
	店铺ID
	*/
	private Integer storeId ;
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
