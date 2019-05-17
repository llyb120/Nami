package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_admin")
public class RaAdmin   {
	
	/*
	管理员ID
	*/
	private Integer adminId ;
	/*
	权限组ID
	*/
	private Integer adminGid ;
	/*
	是否超级管理员
	*/
	private Integer adminIsSuper ;
	/*
	登录次数
	*/
	private Integer adminLoginNum ;
	/*
	登录时间
	*/
	private Integer adminLoginTime ;
	/*
	管理员名称
	*/
	private String adminName ;
	/*
	管理员密码
	*/
	private String adminPassword ;
	
	public RaAdmin() {
	}
	
	/**
	* 管理员ID
	*@return 
	*/
	public Integer getAdminId(){
		return  adminId;
	}
	/**
	* 管理员ID
	*@param  adminId
	*/
	public void setAdminId(Integer adminId ){
		this.adminId = adminId;
	}
	
	/**
	* 权限组ID
	*@return 
	*/
	public Integer getAdminGid(){
		return  adminGid;
	}
	/**
	* 权限组ID
	*@param  adminGid
	*/
	public void setAdminGid(Integer adminGid ){
		this.adminGid = adminGid;
	}
	
	/**
	* 是否超级管理员
	*@return 
	*/
	public Integer getAdminIsSuper(){
		return  adminIsSuper;
	}
	/**
	* 是否超级管理员
	*@param  adminIsSuper
	*/
	public void setAdminIsSuper(Integer adminIsSuper ){
		this.adminIsSuper = adminIsSuper;
	}
	
	/**
	* 登录次数
	*@return 
	*/
	public Integer getAdminLoginNum(){
		return  adminLoginNum;
	}
	/**
	* 登录次数
	*@param  adminLoginNum
	*/
	public void setAdminLoginNum(Integer adminLoginNum ){
		this.adminLoginNum = adminLoginNum;
	}
	
	/**
	* 登录时间
	*@return 
	*/
	public Integer getAdminLoginTime(){
		return  adminLoginTime;
	}
	/**
	* 登录时间
	*@param  adminLoginTime
	*/
	public void setAdminLoginTime(Integer adminLoginTime ){
		this.adminLoginTime = adminLoginTime;
	}
	
	/**
	* 管理员名称
	*@return 
	*/
	public String getAdminName(){
		return  adminName;
	}
	/**
	* 管理员名称
	*@param  adminName
	*/
	public void setAdminName(String adminName ){
		this.adminName = adminName;
	}
	
	/**
	* 管理员密码
	*@return 
	*/
	public String getAdminPassword(){
		return  adminPassword;
	}
	/**
	* 管理员密码
	*@param  adminPassword
	*/
	public void setAdminPassword(String adminPassword ){
		this.adminPassword = adminPassword;
	}
	

}
