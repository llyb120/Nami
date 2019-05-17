package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_admin")
public class RaAdmin   {
	
	// alias
	public static final String ALIAS_admin_id = "admin_id";
	public static final String ALIAS_admin_gid = "admin_gid";
	public static final String ALIAS_admin_is_super = "admin_is_super";
	public static final String ALIAS_admin_login_num = "admin_login_num";
	public static final String ALIAS_admin_login_time = "admin_login_time";
	public static final String ALIAS_admin_name = "admin_name";
	public static final String ALIAS_admin_password = "admin_password";
	
	/*
	管理员ID
	*/
	private Integer admin_id ;
	/*
	权限组ID
	*/
	private Integer admin_gid ;
	/*
	是否超级管理员
	*/
	private Integer admin_is_super ;
	/*
	登录次数
	*/
	private Integer admin_login_num ;
	/*
	登录时间
	*/
	private Integer admin_login_time ;
	/*
	管理员名称
	*/
	private String admin_name ;
	/*
	管理员密码
	*/
	private String admin_password ;
	
	public RaAdmin() {
	}
	
	/**
	* 管理员ID
	*@return 
	*/
	public Integer getAdmin_id(){
		return  admin_id;
	}
	/**
	* 管理员ID
	*@param  admin_id
	*/
	public void setAdmin_id(Integer admin_id ){
		this.admin_id = admin_id;
	}
	
	/**
	* 权限组ID
	*@return 
	*/
	public Integer getAdmin_gid(){
		return  admin_gid;
	}
	/**
	* 权限组ID
	*@param  admin_gid
	*/
	public void setAdmin_gid(Integer admin_gid ){
		this.admin_gid = admin_gid;
	}
	
	/**
	* 是否超级管理员
	*@return 
	*/
	public Integer getAdmin_is_super(){
		return  admin_is_super;
	}
	/**
	* 是否超级管理员
	*@param  admin_is_super
	*/
	public void setAdmin_is_super(Integer admin_is_super ){
		this.admin_is_super = admin_is_super;
	}
	
	/**
	* 登录次数
	*@return 
	*/
	public Integer getAdmin_login_num(){
		return  admin_login_num;
	}
	/**
	* 登录次数
	*@param  admin_login_num
	*/
	public void setAdmin_login_num(Integer admin_login_num ){
		this.admin_login_num = admin_login_num;
	}
	
	/**
	* 登录时间
	*@return 
	*/
	public Integer getAdmin_login_time(){
		return  admin_login_time;
	}
	/**
	* 登录时间
	*@param  admin_login_time
	*/
	public void setAdmin_login_time(Integer admin_login_time ){
		this.admin_login_time = admin_login_time;
	}
	
	/**
	* 管理员名称
	*@return 
	*/
	public String getAdmin_name(){
		return  admin_name;
	}
	/**
	* 管理员名称
	*@param  admin_name
	*/
	public void setAdmin_name(String admin_name ){
		this.admin_name = admin_name;
	}
	
	/**
	* 管理员密码
	*@return 
	*/
	public String getAdmin_password(){
		return  admin_password;
	}
	/**
	* 管理员密码
	*@param  admin_password
	*/
	public void setAdmin_password(String admin_password ){
		this.admin_password = admin_password;
	}
	

}
