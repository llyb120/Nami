package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_offpay_area")
public class RaOffpayArea   {
	
	// alias
	public static final String ALIAS_store_id = "store_id";
	public static final String ALIAS_area_id = "area_id";
	
	/*
	商家ID
	*/
	private Integer store_id ;
	/*
	县ID组合
	*/
	private String area_id ;
	
	public RaOffpayArea() {
	}
	
	/**
	* 商家ID
	*@return 
	*/
	public Integer getStore_id(){
		return  store_id;
	}
	/**
	* 商家ID
	*@param  store_id
	*/
	public void setStore_id(Integer store_id ){
		this.store_id = store_id;
	}
	
	/**
	* 县ID组合
	*@return 
	*/
	public String getArea_id(){
		return  area_id;
	}
	/**
	* 县ID组合
	*@param  area_id
	*/
	public void setArea_id(String area_id ){
		this.area_id = area_id;
	}
	

}
