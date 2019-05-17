package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_address")
public class RaAddress   {
	
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
	自提点ID
	*/
	private Integer dlypId ;
	/*
	1默认收货地址
	*/
	private Integer isDefault ;
	/*
	会员ID
	*/
	private Integer memberId ;
	/*
	地址
	*/
	private String address ;
	/*
	地区内容
	*/
	private String areaInfo ;
	private String idcard ;
	private String idtype ;
	/*
	手机电话
	*/
	private String mobPhone ;
	/*
	座机电话
	*/
	private String telPhone ;
	/*
	会员姓名
	*/
	private String trueName ;
	private String zip ;
	
	public RaAddress() {
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
	* 自提点ID
	*@return 
	*/
	public Integer getDlypId(){
		return  dlypId;
	}
	/**
	* 自提点ID
	*@param  dlypId
	*/
	public void setDlypId(Integer dlypId ){
		this.dlypId = dlypId;
	}
	
	/**
	* 1默认收货地址
	*@return 
	*/
	public Integer getIsDefault(){
		return  isDefault;
	}
	/**
	* 1默认收货地址
	*@param  isDefault
	*/
	public void setIsDefault(Integer isDefault ){
		this.isDefault = isDefault;
	}
	
	/**
	* 会员ID
	*@return 
	*/
	public Integer getMemberId(){
		return  memberId;
	}
	/**
	* 会员ID
	*@param  memberId
	*/
	public void setMemberId(Integer memberId ){
		this.memberId = memberId;
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
	* 地区内容
	*@return 
	*/
	public String getAreaInfo(){
		return  areaInfo;
	}
	/**
	* 地区内容
	*@param  areaInfo
	*/
	public void setAreaInfo(String areaInfo ){
		this.areaInfo = areaInfo;
	}
	
	public String getIdcard(){
		return  idcard;
	}
	public void setIdcard(String idcard ){
		this.idcard = idcard;
	}
	
	public String getIdtype(){
		return  idtype;
	}
	public void setIdtype(String idtype ){
		this.idtype = idtype;
	}
	
	/**
	* 手机电话
	*@return 
	*/
	public String getMobPhone(){
		return  mobPhone;
	}
	/**
	* 手机电话
	*@param  mobPhone
	*/
	public void setMobPhone(String mobPhone ){
		this.mobPhone = mobPhone;
	}
	
	/**
	* 座机电话
	*@return 
	*/
	public String getTelPhone(){
		return  telPhone;
	}
	/**
	* 座机电话
	*@param  telPhone
	*/
	public void setTelPhone(String telPhone ){
		this.telPhone = telPhone;
	}
	
	/**
	* 会员姓名
	*@return 
	*/
	public String getTrueName(){
		return  trueName;
	}
	/**
	* 会员姓名
	*@param  trueName
	*/
	public void setTrueName(String trueName ){
		this.trueName = trueName;
	}
	
	public String getZip(){
		return  zip;
	}
	public void setZip(String zip ){
		this.zip = zip;
	}
	

}
