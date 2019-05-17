package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_type_brand")
public class RaTypeBrand   {
	
	/*
	品牌id
	*/
	private Integer brandId ;
	/*
	类型id
	*/
	private Integer typeId ;
	
	public RaTypeBrand() {
	}
	
	/**
	* 品牌id
	*@return 
	*/
	public Integer getBrandId(){
		return  brandId;
	}
	/**
	* 品牌id
	*@param  brandId
	*/
	public void setBrandId(Integer brandId ){
		this.brandId = brandId;
	}
	
	/**
	* 类型id
	*@return 
	*/
	public Integer getTypeId(){
		return  typeId;
	}
	/**
	* 类型id
	*@param  typeId
	*/
	public void setTypeId(Integer typeId ){
		this.typeId = typeId;
	}
	

}
