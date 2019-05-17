package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_type_brand")
public class RaTypeBrand   {
	
	// alias
	public static final String ALIAS_brand_id = "brand_id";
	public static final String ALIAS_type_id = "type_id";
	
	/*
	品牌id
	*/
	private Integer brand_id ;
	/*
	类型id
	*/
	private Integer type_id ;
	
	public RaTypeBrand() {
	}
	
	/**
	* 品牌id
	*@return 
	*/
	public Integer getBrand_id(){
		return  brand_id;
	}
	/**
	* 品牌id
	*@param  brand_id
	*/
	public void setBrand_id(Integer brand_id ){
		this.brand_id = brand_id;
	}
	
	/**
	* 类型id
	*@return 
	*/
	public Integer getType_id(){
		return  type_id;
	}
	/**
	* 类型id
	*@param  type_id
	*/
	public void setType_id(Integer type_id ){
		this.type_id = type_id;
	}
	

}
