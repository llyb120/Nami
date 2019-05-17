package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_daddress")
public class RaDaddress   {
	
	/*
	地址ID
	*/
	private Integer addressId ;
	/*
	地区ID
	*/
	private Integer areaId ;
	/*
	市级ID
	*/
	private Integer cityId ;
	/*
	店铺ID
	*/
	private Integer storeId ;
	/*
	地址
	*/
	private String address ;
	/*
	省市县
	*/
	private String areaInfo ;
	/*
	公司
	*/
	private String company ;
	/*
	是否默认1是
	*/
	private String isDefault ;
	/*
	联系人
	*/
	private String sellerName ;
	/*
	电话
	*/
	private String telphone ;
	
	public RaDaddress() {
	}
	
	/**
	* 地址ID
	*@return 
	*/
	public Integer getAddressId(){
		return  addressId;
	}
	/**
	* 地址ID
	*@param  addressId
	*/
	public void setAddressId(Integer addressId ){
		this.addressId = addressId;
	}
	
	/**
	* 地区ID
	*@return 
	*/
	public Integer getAreaId(){
		return  areaId;
	}
	/**
	* 地区ID
	*@param  areaId
	*/
	public void setAreaId(Integer areaId ){
		this.areaId = areaId;
	}
	
	/**
	* 市级ID
	*@return 
	*/
	public Integer getCityId(){
		return  cityId;
	}
	/**
	* 市级ID
	*@param  cityId
	*/
	public void setCityId(Integer cityId ){
		this.cityId = cityId;
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
	* 地址
	*@return 
	*/
	public String getAddress(){
		return  address;
	}
	/**
	* 地址
	*@param  address
	*/
	public void setAddress(String address ){
		this.address = address;
	}
	
	/**
	* 省市县
	*@return 
	*/
	public String getAreaInfo(){
		return  areaInfo;
	}
	/**
	* 省市县
	*@param  areaInfo
	*/
	public void setAreaInfo(String areaInfo ){
		this.areaInfo = areaInfo;
	}
	
	/**
	* 公司
	*@return 
	*/
	public String getCompany(){
		return  company;
	}
	/**
	* 公司
	*@param  company
	*/
	public void setCompany(String company ){
		this.company = company;
	}
	
	/**
	* 是否默认1是
	*@return 
	*/
	public String getIsDefault(){
		return  isDefault;
	}
	/**
	* 是否默认1是
	*@param  isDefault
	*/
	public void setIsDefault(String isDefault ){
		this.isDefault = isDefault;
	}
	
	/**
	* 联系人
	*@return 
	*/
	public String getSellerName(){
		return  sellerName;
	}
	/**
	* 联系人
	*@param  sellerName
	*/
	public void setSellerName(String sellerName ){
		this.sellerName = sellerName;
	}
	
	/**
	* 电话
	*@return 
	*/
	public String getTelphone(){
		return  telphone;
	}
	/**
	* 电话
	*@param  telphone
	*/
	public void setTelphone(String telphone ){
		this.telphone = telphone;
	}
	

}
