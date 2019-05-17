package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_sns_binding")
public class RaSnsBinding   {
	
	/*
	自增ID
	*/
	private Integer snsbindId ;
	/*
	accesstoken过期时间，以返回的时间的准，单位为秒，注意过期时提醒用户重新授权
	*/
	private Integer snsbindExpiresin ;
	/*
	会员编号
	*/
	private Integer snsbindMemberid ;
	/*
	绑定更新时间
	*/
	private Integer snsbindUpdatetime ;
	/*
	访问第三方资源的凭证
	*/
	private String snsbindAccesstoken ;
	/*
	应用标志
	*/
	private String snsbindAppsign ;
	/*
	会员名称
	*/
	private String snsbindMembername ;
	/*
	应用用户编号
	*/
	private String snsbindOpenid ;
	/*
	应用用户信息
	*/
	private String snsbindOpeninfo ;
	/*
	刷新token
	*/
	private String snsbindRefreshtoken ;
	
	public RaSnsBinding() {
	}
	
	/**
	* 自增ID
	*@return 
	*/
	public Integer getSnsbindId(){
		return  snsbindId;
	}
	/**
	* 自增ID
	*@param  snsbindId
	*/
	public void setSnsbindId(Integer snsbindId ){
		this.snsbindId = snsbindId;
	}
	
	/**
	* accesstoken过期时间，以返回的时间的准，单位为秒，注意过期时提醒用户重新授权
	*@return 
	*/
	public Integer getSnsbindExpiresin(){
		return  snsbindExpiresin;
	}
	/**
	* accesstoken过期时间，以返回的时间的准，单位为秒，注意过期时提醒用户重新授权
	*@param  snsbindExpiresin
	*/
	public void setSnsbindExpiresin(Integer snsbindExpiresin ){
		this.snsbindExpiresin = snsbindExpiresin;
	}
	
	/**
	* 会员编号
	*@return 
	*/
	public Integer getSnsbindMemberid(){
		return  snsbindMemberid;
	}
	/**
	* 会员编号
	*@param  snsbindMemberid
	*/
	public void setSnsbindMemberid(Integer snsbindMemberid ){
		this.snsbindMemberid = snsbindMemberid;
	}
	
	/**
	* 绑定更新时间
	*@return 
	*/
	public Integer getSnsbindUpdatetime(){
		return  snsbindUpdatetime;
	}
	/**
	* 绑定更新时间
	*@param  snsbindUpdatetime
	*/
	public void setSnsbindUpdatetime(Integer snsbindUpdatetime ){
		this.snsbindUpdatetime = snsbindUpdatetime;
	}
	
	/**
	* 访问第三方资源的凭证
	*@return 
	*/
	public String getSnsbindAccesstoken(){
		return  snsbindAccesstoken;
	}
	/**
	* 访问第三方资源的凭证
	*@param  snsbindAccesstoken
	*/
	public void setSnsbindAccesstoken(String snsbindAccesstoken ){
		this.snsbindAccesstoken = snsbindAccesstoken;
	}
	
	/**
	* 应用标志
	*@return 
	*/
	public String getSnsbindAppsign(){
		return  snsbindAppsign;
	}
	/**
	* 应用标志
	*@param  snsbindAppsign
	*/
	public void setSnsbindAppsign(String snsbindAppsign ){
		this.snsbindAppsign = snsbindAppsign;
	}
	
	/**
	* 会员名称
	*@return 
	*/
	public String getSnsbindMembername(){
		return  snsbindMembername;
	}
	/**
	* 会员名称
	*@param  snsbindMembername
	*/
	public void setSnsbindMembername(String snsbindMembername ){
		this.snsbindMembername = snsbindMembername;
	}
	
	/**
	* 应用用户编号
	*@return 
	*/
	public String getSnsbindOpenid(){
		return  snsbindOpenid;
	}
	/**
	* 应用用户编号
	*@param  snsbindOpenid
	*/
	public void setSnsbindOpenid(String snsbindOpenid ){
		this.snsbindOpenid = snsbindOpenid;
	}
	
	/**
	* 应用用户信息
	*@return 
	*/
	public String getSnsbindOpeninfo(){
		return  snsbindOpeninfo;
	}
	/**
	* 应用用户信息
	*@param  snsbindOpeninfo
	*/
	public void setSnsbindOpeninfo(String snsbindOpeninfo ){
		this.snsbindOpeninfo = snsbindOpeninfo;
	}
	
	/**
	* 刷新token
	*@return 
	*/
	public String getSnsbindRefreshtoken(){
		return  snsbindRefreshtoken;
	}
	/**
	* 刷新token
	*@param  snsbindRefreshtoken
	*/
	public void setSnsbindRefreshtoken(String snsbindRefreshtoken ){
		this.snsbindRefreshtoken = snsbindRefreshtoken;
	}
	

}
