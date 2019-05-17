package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_delivery_point")
public class RaDeliveryPoint   {
	
	// alias
	public static final String ALIAS_dlyp_id = "dlyp_id";
	public static final String ALIAS_dlyp_addtime = "dlyp_addtime";
	public static final String ALIAS_dlyp_area_2 = "dlyp_area_2";
	public static final String ALIAS_dlyp_area_3 = "dlyp_area_3";
	public static final String ALIAS_dlyp_state = "dlyp_state";
	public static final String ALIAS_dlyp_address = "dlyp_address";
	public static final String ALIAS_dlyp_address_name = "dlyp_address_name";
	public static final String ALIAS_dlyp_area_info = "dlyp_area_info";
	public static final String ALIAS_dlyp_fail_reason = "dlyp_fail_reason";
	public static final String ALIAS_dlyp_idcard = "dlyp_idcard";
	public static final String ALIAS_dlyp_idcard_image = "dlyp_idcard_image";
	public static final String ALIAS_dlyp_mobile = "dlyp_mobile";
	public static final String ALIAS_dlyp_name = "dlyp_name";
	public static final String ALIAS_dlyp_passwd = "dlyp_passwd";
	public static final String ALIAS_dlyp_telephony = "dlyp_telephony";
	public static final String ALIAS_dlyp_truename = "dlyp_truename";
	
	/*
	提货站id
	*/
	private Integer dlyp_id ;
	/*
	添加时间
	*/
	private Integer dlyp_addtime ;
	/*
	二级地区id
	*/
	private Integer dlyp_area_2 ;
	/*
	三级地区id
	*/
	private Integer dlyp_area_3 ;
	/*
	提货站状态 0关闭，1开启，10等待审核, 20审核失败
	*/
	private Integer dlyp_state ;
	/*
	详细地址
	*/
	private String dlyp_address ;
	/*
	服务站名称
	*/
	private String dlyp_address_name ;
	/*
	地区内容
	*/
	private String dlyp_area_info ;
	/*
	失败原因
	*/
	private String dlyp_fail_reason ;
	/*
	身份证号码
	*/
	private String dlyp_idcard ;
	/*
	身份证照片
	*/
	private String dlyp_idcard_image ;
	/*
	手机号码
	*/
	private String dlyp_mobile ;
	/*
	提货站登录名
	*/
	private String dlyp_name ;
	/*
	提货站登录密码
	*/
	private String dlyp_passwd ;
	/*
	座机号码
	*/
	private String dlyp_telephony ;
	/*
	真实姓名
	*/
	private String dlyp_truename ;
	
	public RaDeliveryPoint() {
	}
	
	/**
	* 提货站id
	*@return 
	*/
	public Integer getDlyp_id(){
		return  dlyp_id;
	}
	/**
	* 提货站id
	*@param  dlyp_id
	*/
	public void setDlyp_id(Integer dlyp_id ){
		this.dlyp_id = dlyp_id;
	}
	
	/**
	* 添加时间
	*@return 
	*/
	public Integer getDlyp_addtime(){
		return  dlyp_addtime;
	}
	/**
	* 添加时间
	*@param  dlyp_addtime
	*/
	public void setDlyp_addtime(Integer dlyp_addtime ){
		this.dlyp_addtime = dlyp_addtime;
	}
	
	/**
	* 二级地区id
	*@return 
	*/
	public Integer getDlyp_area_2(){
		return  dlyp_area_2;
	}
	/**
	* 二级地区id
	*@param  dlyp_area_2
	*/
	public void setDlyp_area_2(Integer dlyp_area_2 ){
		this.dlyp_area_2 = dlyp_area_2;
	}
	
	/**
	* 三级地区id
	*@return 
	*/
	public Integer getDlyp_area_3(){
		return  dlyp_area_3;
	}
	/**
	* 三级地区id
	*@param  dlyp_area_3
	*/
	public void setDlyp_area_3(Integer dlyp_area_3 ){
		this.dlyp_area_3 = dlyp_area_3;
	}
	
	/**
	* 提货站状态 0关闭，1开启，10等待审核, 20审核失败
	*@return 
	*/
	public Integer getDlyp_state(){
		return  dlyp_state;
	}
	/**
	* 提货站状态 0关闭，1开启，10等待审核, 20审核失败
	*@param  dlyp_state
	*/
	public void setDlyp_state(Integer dlyp_state ){
		this.dlyp_state = dlyp_state;
	}
	
	/**
	* 详细地址
	*@return 
	*/
	public String getDlyp_address(){
		return  dlyp_address;
	}
	/**
	* 详细地址
	*@param  dlyp_address
	*/
	public void setDlyp_address(String dlyp_address ){
		this.dlyp_address = dlyp_address;
	}
	
	/**
	* 服务站名称
	*@return 
	*/
	public String getDlyp_address_name(){
		return  dlyp_address_name;
	}
	/**
	* 服务站名称
	*@param  dlyp_address_name
	*/
	public void setDlyp_address_name(String dlyp_address_name ){
		this.dlyp_address_name = dlyp_address_name;
	}
	
	/**
	* 地区内容
	*@return 
	*/
	public String getDlyp_area_info(){
		return  dlyp_area_info;
	}
	/**
	* 地区内容
	*@param  dlyp_area_info
	*/
	public void setDlyp_area_info(String dlyp_area_info ){
		this.dlyp_area_info = dlyp_area_info;
	}
	
	/**
	* 失败原因
	*@return 
	*/
	public String getDlyp_fail_reason(){
		return  dlyp_fail_reason;
	}
	/**
	* 失败原因
	*@param  dlyp_fail_reason
	*/
	public void setDlyp_fail_reason(String dlyp_fail_reason ){
		this.dlyp_fail_reason = dlyp_fail_reason;
	}
	
	/**
	* 身份证号码
	*@return 
	*/
	public String getDlyp_idcard(){
		return  dlyp_idcard;
	}
	/**
	* 身份证号码
	*@param  dlyp_idcard
	*/
	public void setDlyp_idcard(String dlyp_idcard ){
		this.dlyp_idcard = dlyp_idcard;
	}
	
	/**
	* 身份证照片
	*@return 
	*/
	public String getDlyp_idcard_image(){
		return  dlyp_idcard_image;
	}
	/**
	* 身份证照片
	*@param  dlyp_idcard_image
	*/
	public void setDlyp_idcard_image(String dlyp_idcard_image ){
		this.dlyp_idcard_image = dlyp_idcard_image;
	}
	
	/**
	* 手机号码
	*@return 
	*/
	public String getDlyp_mobile(){
		return  dlyp_mobile;
	}
	/**
	* 手机号码
	*@param  dlyp_mobile
	*/
	public void setDlyp_mobile(String dlyp_mobile ){
		this.dlyp_mobile = dlyp_mobile;
	}
	
	/**
	* 提货站登录名
	*@return 
	*/
	public String getDlyp_name(){
		return  dlyp_name;
	}
	/**
	* 提货站登录名
	*@param  dlyp_name
	*/
	public void setDlyp_name(String dlyp_name ){
		this.dlyp_name = dlyp_name;
	}
	
	/**
	* 提货站登录密码
	*@return 
	*/
	public String getDlyp_passwd(){
		return  dlyp_passwd;
	}
	/**
	* 提货站登录密码
	*@param  dlyp_passwd
	*/
	public void setDlyp_passwd(String dlyp_passwd ){
		this.dlyp_passwd = dlyp_passwd;
	}
	
	/**
	* 座机号码
	*@return 
	*/
	public String getDlyp_telephony(){
		return  dlyp_telephony;
	}
	/**
	* 座机号码
	*@param  dlyp_telephony
	*/
	public void setDlyp_telephony(String dlyp_telephony ){
		this.dlyp_telephony = dlyp_telephony;
	}
	
	/**
	* 真实姓名
	*@return 
	*/
	public String getDlyp_truename(){
		return  dlyp_truename;
	}
	/**
	* 真实姓名
	*@param  dlyp_truename
	*/
	public void setDlyp_truename(String dlyp_truename ){
		this.dlyp_truename = dlyp_truename;
	}
	

}
