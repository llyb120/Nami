package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_sns_binding")
public class RaSnsBinding   {
	
	// alias
	public static final String ALIAS_snsbind_id = "snsbind_id";
	public static final String ALIAS_snsbind_expiresin = "snsbind_expiresin";
	public static final String ALIAS_snsbind_memberid = "snsbind_memberid";
	public static final String ALIAS_snsbind_updatetime = "snsbind_updatetime";
	public static final String ALIAS_snsbind_accesstoken = "snsbind_accesstoken";
	public static final String ALIAS_snsbind_appsign = "snsbind_appsign";
	public static final String ALIAS_snsbind_membername = "snsbind_membername";
	public static final String ALIAS_snsbind_openid = "snsbind_openid";
	public static final String ALIAS_snsbind_openinfo = "snsbind_openinfo";
	public static final String ALIAS_snsbind_refreshtoken = "snsbind_refreshtoken";
	
	/*
	自增ID
	*/
	private Integer snsbind_id ;
	/*
	accesstoken过期时间，以返回的时间的准，单位为秒，注意过期时提醒用户重新授权
	*/
	private Integer snsbind_expiresin ;
	/*
	会员编号
	*/
	private Integer snsbind_memberid ;
	/*
	绑定更新时间
	*/
	private Integer snsbind_updatetime ;
	/*
	访问第三方资源的凭证
	*/
	private String snsbind_accesstoken ;
	/*
	应用标志
	*/
	private String snsbind_appsign ;
	/*
	会员名称
	*/
	private String snsbind_membername ;
	/*
	应用用户编号
	*/
	private String snsbind_openid ;
	/*
	应用用户信息
	*/
	private String snsbind_openinfo ;
	/*
	刷新token
	*/
	private String snsbind_refreshtoken ;
	
	public RaSnsBinding() {
	}
	
	/**
	* 自增ID
	*@return 
	*/
	public Integer getSnsbind_id(){
		return  snsbind_id;
	}
	/**
	* 自增ID
	*@param  snsbind_id
	*/
	public void setSnsbind_id(Integer snsbind_id ){
		this.snsbind_id = snsbind_id;
	}
	
	/**
	* accesstoken过期时间，以返回的时间的准，单位为秒，注意过期时提醒用户重新授权
	*@return 
	*/
	public Integer getSnsbind_expiresin(){
		return  snsbind_expiresin;
	}
	/**
	* accesstoken过期时间，以返回的时间的准，单位为秒，注意过期时提醒用户重新授权
	*@param  snsbind_expiresin
	*/
	public void setSnsbind_expiresin(Integer snsbind_expiresin ){
		this.snsbind_expiresin = snsbind_expiresin;
	}
	
	/**
	* 会员编号
	*@return 
	*/
	public Integer getSnsbind_memberid(){
		return  snsbind_memberid;
	}
	/**
	* 会员编号
	*@param  snsbind_memberid
	*/
	public void setSnsbind_memberid(Integer snsbind_memberid ){
		this.snsbind_memberid = snsbind_memberid;
	}
	
	/**
	* 绑定更新时间
	*@return 
	*/
	public Integer getSnsbind_updatetime(){
		return  snsbind_updatetime;
	}
	/**
	* 绑定更新时间
	*@param  snsbind_updatetime
	*/
	public void setSnsbind_updatetime(Integer snsbind_updatetime ){
		this.snsbind_updatetime = snsbind_updatetime;
	}
	
	/**
	* 访问第三方资源的凭证
	*@return 
	*/
	public String getSnsbind_accesstoken(){
		return  snsbind_accesstoken;
	}
	/**
	* 访问第三方资源的凭证
	*@param  snsbind_accesstoken
	*/
	public void setSnsbind_accesstoken(String snsbind_accesstoken ){
		this.snsbind_accesstoken = snsbind_accesstoken;
	}
	
	/**
	* 应用标志
	*@return 
	*/
	public String getSnsbind_appsign(){
		return  snsbind_appsign;
	}
	/**
	* 应用标志
	*@param  snsbind_appsign
	*/
	public void setSnsbind_appsign(String snsbind_appsign ){
		this.snsbind_appsign = snsbind_appsign;
	}
	
	/**
	* 会员名称
	*@return 
	*/
	public String getSnsbind_membername(){
		return  snsbind_membername;
	}
	/**
	* 会员名称
	*@param  snsbind_membername
	*/
	public void setSnsbind_membername(String snsbind_membername ){
		this.snsbind_membername = snsbind_membername;
	}
	
	/**
	* 应用用户编号
	*@return 
	*/
	public String getSnsbind_openid(){
		return  snsbind_openid;
	}
	/**
	* 应用用户编号
	*@param  snsbind_openid
	*/
	public void setSnsbind_openid(String snsbind_openid ){
		this.snsbind_openid = snsbind_openid;
	}
	
	/**
	* 应用用户信息
	*@return 
	*/
	public String getSnsbind_openinfo(){
		return  snsbind_openinfo;
	}
	/**
	* 应用用户信息
	*@param  snsbind_openinfo
	*/
	public void setSnsbind_openinfo(String snsbind_openinfo ){
		this.snsbind_openinfo = snsbind_openinfo;
	}
	
	/**
	* 刷新token
	*@return 
	*/
	public String getSnsbind_refreshtoken(){
		return  snsbind_refreshtoken;
	}
	/**
	* 刷新token
	*@param  snsbind_refreshtoken
	*/
	public void setSnsbind_refreshtoken(String snsbind_refreshtoken ){
		this.snsbind_refreshtoken = snsbind_refreshtoken;
	}
	

}
