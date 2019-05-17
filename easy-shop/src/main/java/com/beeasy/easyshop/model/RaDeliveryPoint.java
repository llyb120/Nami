package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_delivery_point")
public class RaDeliveryPoint   {
	
	/*
	提货站id
	*/
	private Integer dlypId ;
	/*
	添加时间
	*/
	private Integer dlypAddtime ;
	/*
	二级地区id
	*/
	private Integer dlypArea2 ;
	/*
	三级地区id
	*/
	private Integer dlypArea3 ;
	/*
	提货站状态 0关闭，1开启，10等待审核, 20审核失败
	*/
	private Integer dlypState ;
	/*
	详细地址
	*/
	private String dlypAddress ;
	/*
	服务站名称
	*/
	private String dlypAddressName ;
	/*
	地区内容
	*/
	private String dlypAreaInfo ;
	/*
	失败原因
	*/
	private String dlypFailReason ;
	/*
	身份证号码
	*/
	private String dlypIdcard ;
	/*
	身份证照片
	*/
	private String dlypIdcardImage ;
	/*
	手机号码
	*/
	private String dlypMobile ;
	/*
	提货站登录名
	*/
	private String dlypName ;
	/*
	提货站登录密码
	*/
	private String dlypPasswd ;
	/*
	座机号码
	*/
	private String dlypTelephony ;
	/*
	真实姓名
	*/
	private String dlypTruename ;
	
	public RaDeliveryPoint() {
	}
	
	/**
	* 提货站id
	*@return 
	*/
	public Integer getDlypId(){
		return  dlypId;
	}
	/**
	* 提货站id
	*@param  dlypId
	*/
	public void setDlypId(Integer dlypId ){
		this.dlypId = dlypId;
	}
	
	/**
	* 添加时间
	*@return 
	*/
	public Integer getDlypAddtime(){
		return  dlypAddtime;
	}
	/**
	* 添加时间
	*@param  dlypAddtime
	*/
	public void setDlypAddtime(Integer dlypAddtime ){
		this.dlypAddtime = dlypAddtime;
	}
	
	/**
	* 二级地区id
	*@return 
	*/
	public Integer getDlypArea2(){
		return  dlypArea2;
	}
	/**
	* 二级地区id
	*@param  dlypArea2
	*/
	public void setDlypArea2(Integer dlypArea2 ){
		this.dlypArea2 = dlypArea2;
	}
	
	/**
	* 三级地区id
	*@return 
	*/
	public Integer getDlypArea3(){
		return  dlypArea3;
	}
	/**
	* 三级地区id
	*@param  dlypArea3
	*/
	public void setDlypArea3(Integer dlypArea3 ){
		this.dlypArea3 = dlypArea3;
	}
	
	/**
	* 提货站状态 0关闭，1开启，10等待审核, 20审核失败
	*@return 
	*/
	public Integer getDlypState(){
		return  dlypState;
	}
	/**
	* 提货站状态 0关闭，1开启，10等待审核, 20审核失败
	*@param  dlypState
	*/
	public void setDlypState(Integer dlypState ){
		this.dlypState = dlypState;
	}
	
	/**
	* 详细地址
	*@return 
	*/
	public String getDlypAddress(){
		return  dlypAddress;
	}
	/**
	* 详细地址
	*@param  dlypAddress
	*/
	public void setDlypAddress(String dlypAddress ){
		this.dlypAddress = dlypAddress;
	}
	
	/**
	* 服务站名称
	*@return 
	*/
	public String getDlypAddressName(){
		return  dlypAddressName;
	}
	/**
	* 服务站名称
	*@param  dlypAddressName
	*/
	public void setDlypAddressName(String dlypAddressName ){
		this.dlypAddressName = dlypAddressName;
	}
	
	/**
	* 地区内容
	*@return 
	*/
	public String getDlypAreaInfo(){
		return  dlypAreaInfo;
	}
	/**
	* 地区内容
	*@param  dlypAreaInfo
	*/
	public void setDlypAreaInfo(String dlypAreaInfo ){
		this.dlypAreaInfo = dlypAreaInfo;
	}
	
	/**
	* 失败原因
	*@return 
	*/
	public String getDlypFailReason(){
		return  dlypFailReason;
	}
	/**
	* 失败原因
	*@param  dlypFailReason
	*/
	public void setDlypFailReason(String dlypFailReason ){
		this.dlypFailReason = dlypFailReason;
	}
	
	/**
	* 身份证号码
	*@return 
	*/
	public String getDlypIdcard(){
		return  dlypIdcard;
	}
	/**
	* 身份证号码
	*@param  dlypIdcard
	*/
	public void setDlypIdcard(String dlypIdcard ){
		this.dlypIdcard = dlypIdcard;
	}
	
	/**
	* 身份证照片
	*@return 
	*/
	public String getDlypIdcardImage(){
		return  dlypIdcardImage;
	}
	/**
	* 身份证照片
	*@param  dlypIdcardImage
	*/
	public void setDlypIdcardImage(String dlypIdcardImage ){
		this.dlypIdcardImage = dlypIdcardImage;
	}
	
	/**
	* 手机号码
	*@return 
	*/
	public String getDlypMobile(){
		return  dlypMobile;
	}
	/**
	* 手机号码
	*@param  dlypMobile
	*/
	public void setDlypMobile(String dlypMobile ){
		this.dlypMobile = dlypMobile;
	}
	
	/**
	* 提货站登录名
	*@return 
	*/
	public String getDlypName(){
		return  dlypName;
	}
	/**
	* 提货站登录名
	*@param  dlypName
	*/
	public void setDlypName(String dlypName ){
		this.dlypName = dlypName;
	}
	
	/**
	* 提货站登录密码
	*@return 
	*/
	public String getDlypPasswd(){
		return  dlypPasswd;
	}
	/**
	* 提货站登录密码
	*@param  dlypPasswd
	*/
	public void setDlypPasswd(String dlypPasswd ){
		this.dlypPasswd = dlypPasswd;
	}
	
	/**
	* 座机号码
	*@return 
	*/
	public String getDlypTelephony(){
		return  dlypTelephony;
	}
	/**
	* 座机号码
	*@param  dlypTelephony
	*/
	public void setDlypTelephony(String dlypTelephony ){
		this.dlypTelephony = dlypTelephony;
	}
	
	/**
	* 真实姓名
	*@return 
	*/
	public String getDlypTruename(){
		return  dlypTruename;
	}
	/**
	* 真实姓名
	*@param  dlypTruename
	*/
	public void setDlypTruename(String dlypTruename ){
		this.dlypTruename = dlypTruename;
	}
	

}
