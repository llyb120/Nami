package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_address")
public class RaAddress   {
	
	// alias
	public static final String ALIAS_address_id = "address_id";
	public static final String ALIAS_area_id = "area_id";
	public static final String ALIAS_city_id = "city_id";
	public static final String ALIAS_dlyp_id = "dlyp_id";
	public static final String ALIAS_is_default = "is_default";
	public static final String ALIAS_member_id = "member_id";
	public static final String ALIAS_address = "address";
	public static final String ALIAS_area_info = "area_info";
	public static final String ALIAS_idcard = "idcard";
	public static final String ALIAS_idtype = "idtype";
	public static final String ALIAS_mob_phone = "mob_phone";
	public static final String ALIAS_tel_phone = "tel_phone";
	public static final String ALIAS_true_name = "true_name";
	public static final String ALIAS_zip = "zip";
	
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
	自提点ID
	*/
	private Integer dlyp_id ;
	/*
	1默认收货地址
	*/
	private Integer is_default ;
	/*
	会员ID
	*/
	private Integer member_id ;
	/*
	地址
	*/
	private String address ;
	/*
	地区内容
	*/
	private String area_info ;
	private String idcard ;
	private String idtype ;
	/*
	手机电话
	*/
	private String mob_phone ;
	/*
	座机电话
	*/
	private String tel_phone ;
	/*
	会员姓名
	*/
	private String true_name ;
	private String zip ;
	
	public RaAddress() {
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
	* 自提点ID
	*@return 
	*/
	public Integer getDlyp_id(){
		return  dlyp_id;
	}
	/**
	* 自提点ID
	*@param  dlyp_id
	*/
	public void setDlyp_id(Integer dlyp_id ){
		this.dlyp_id = dlyp_id;
	}
	
	/**
	* 1默认收货地址
	*@return 
	*/
	public Integer getIs_default(){
		return  is_default;
	}
	/**
	* 1默认收货地址
	*@param  is_default
	*/
	public void setIs_default(Integer is_default ){
		this.is_default = is_default;
	}
	
	/**
	* 会员ID
	*@return 
	*/
	public Integer getMember_id(){
		return  member_id;
	}
	/**
	* 会员ID
	*@param  member_id
	*/
	public void setMember_id(Integer member_id ){
		this.member_id = member_id;
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
	public String getArea_info(){
		return  area_info;
	}
	/**
	* 地区内容
	*@param  area_info
	*/
	public void setArea_info(String area_info ){
		this.area_info = area_info;
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
	public String getMob_phone(){
		return  mob_phone;
	}
	/**
	* 手机电话
	*@param  mob_phone
	*/
	public void setMob_phone(String mob_phone ){
		this.mob_phone = mob_phone;
	}
	
	/**
	* 座机电话
	*@return 
	*/
	public String getTel_phone(){
		return  tel_phone;
	}
	/**
	* 座机电话
	*@param  tel_phone
	*/
	public void setTel_phone(String tel_phone ){
		this.tel_phone = tel_phone;
	}
	
	/**
	* 会员姓名
	*@return 
	*/
	public String getTrue_name(){
		return  true_name;
	}
	/**
	* 会员姓名
	*@param  true_name
	*/
	public void setTrue_name(String true_name ){
		this.true_name = true_name;
	}
	
	public String getZip(){
		return  zip;
	}
	public void setZip(String zip ){
		this.zip = zip;
	}
	

}
