package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_daddress")
public class RaDaddress   {
	
	// alias
	public static final String ALIAS_address_id = "address_id";
	public static final String ALIAS_area_id = "area_id";
	public static final String ALIAS_city_id = "city_id";
	public static final String ALIAS_store_id = "store_id";
	public static final String ALIAS_address = "address";
	public static final String ALIAS_area_info = "area_info";
	public static final String ALIAS_company = "company";
	public static final String ALIAS_is_default = "is_default";
	public static final String ALIAS_seller_name = "seller_name";
	public static final String ALIAS_telphone = "telphone";
	
	/*
	地址ID
	*/
	private Integer address_id ;
	/*
	地区ID
	*/
	private Integer area_id ;
	/*
	市级ID
	*/
	private Integer city_id ;
	/*
	店铺ID
	*/
	private Integer store_id ;
	/*
	地址
	*/
	private String address ;
	/*
	省市县
	*/
	private String area_info ;
	/*
	公司
	*/
	private String company ;
	/*
	是否默认1是
	*/
	private String is_default ;
	/*
	联系人
	*/
	private String seller_name ;
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
	public Integer getAddress_id(){
		return  address_id;
	}
	/**
	* 地址ID
	*@param  address_id
	*/
	public void setAddress_id(Integer address_id ){
		this.address_id = address_id;
	}
	
	/**
	* 地区ID
	*@return 
	*/
	public Integer getArea_id(){
		return  area_id;
	}
	/**
	* 地区ID
	*@param  area_id
	*/
	public void setArea_id(Integer area_id ){
		this.area_id = area_id;
	}
	
	/**
	* 市级ID
	*@return 
	*/
	public Integer getCity_id(){
		return  city_id;
	}
	/**
	* 市级ID
	*@param  city_id
	*/
	public void setCity_id(Integer city_id ){
		this.city_id = city_id;
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
	public String getArea_info(){
		return  area_info;
	}
	/**
	* 省市县
	*@param  area_info
	*/
	public void setArea_info(String area_info ){
		this.area_info = area_info;
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
	public String getIs_default(){
		return  is_default;
	}
	/**
	* 是否默认1是
	*@param  is_default
	*/
	public void setIs_default(String is_default ){
		this.is_default = is_default;
	}
	
	/**
	* 联系人
	*@return 
	*/
	public String getSeller_name(){
		return  seller_name;
	}
	/**
	* 联系人
	*@param  seller_name
	*/
	public void setSeller_name(String seller_name ){
		this.seller_name = seller_name;
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
