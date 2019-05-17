package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_admin_log")
public class RaAdminLog   {
	
	private Integer id ;
	/*
	管理员ID
	*/
	private Integer adminId ;
	/*
	发生时间
	*/
	private Integer createtime ;
	/*
	管理员
	*/
	private String adminName ;
	/*
	操作内容
	*/
	private String content ;
	/*
	IP
	*/
	private String ip ;
	/*
	act&op
	*/
	private String url ;
	
	public RaAdminLog() {
	}
	
	public Integer getId(){
		return  id;
	}
	public void setId(Integer id ){
		this.id = id;
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
	* 发生时间
	*@return 
	*/
	public Integer getCreatetime(){
		return  createtime;
	}
	/**
	* 发生时间
	*@param  createtime
	*/
	public void setCreatetime(Integer createtime ){
		this.createtime = createtime;
	}
	
	/**
	* 管理员
	*@return 
	*/
	public String getAdminName(){
		return  adminName;
	}
	/**
	* 管理员
	*@param  adminName
	*/
	public void setAdminName(String adminName ){
		this.adminName = adminName;
	}
	
	/**
	* 操作内容
	*@return 
	*/
	public String getContent(){
		return  content;
	}
	/**
	* 操作内容
	*@param  content
	*/
	public void setContent(String content ){
		this.content = content;
	}
	
	/**
	* IP
	*@return 
	*/
	public String getIp(){
		return  ip;
	}
	/**
	* IP
	*@param  ip
	*/
	public void setIp(String ip ){
		this.ip = ip;
	}
	
	/**
	* act&op
	*@return 
	*/
	public String getUrl(){
		return  url;
	}
	/**
	* act&op
	*@param  url
	*/
	public void setUrl(String url ){
		this.url = url;
	}
	

}
