package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_offpay_area")
public class RaOffpayArea   {
	
	/*
	商家ID
	*/
	private Integer storeId ;
	/*
	县ID组合
	*/
	private String areaId ;
	
	public RaOffpayArea() {
	}
	
	/**
	* 商家ID
	*@return 
	*/
	public Integer getStoreId(){
		return  storeId;
	}
	/**
	* 商家ID
	*@param  storeId
	*/
	public void setStoreId(Integer storeId ){
		this.storeId = storeId;
	}
	
	/**
	* 县ID组合
	*@return 
	*/
	public String getAreaId(){
		return  areaId;
	}
	/**
	* 县ID组合
	*@param  areaId
	*/
	public void setAreaId(String areaId ){
		this.areaId = areaId;
	}
	

}
