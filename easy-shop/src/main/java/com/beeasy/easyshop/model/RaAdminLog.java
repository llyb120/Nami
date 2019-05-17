package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_admin_log")
public class RaAdminLog   {
	
	// alias
	public static final String ALIAS_id = "id";
	public static final String ALIAS_admin_id = "admin_id";
	public static final String ALIAS_createtime = "createtime";
	public static final String ALIAS_admin_name = "admin_name";
	public static final String ALIAS_content = "content";
	public static final String ALIAS_ip = "ip";
	public static final String ALIAS_url = "url";
	
	private Integer id ;
	/*
	管理员ID
	*/
	private Integer admin_id ;
	/*
	发生时间
	*/
	private Integer createtime ;
	/*
	管理员
	*/
	private String admin_name ;
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
	public String getAdmin_name(){
		return  admin_name;
	}
	/**
	* 管理员
	*@param  admin_name
	*/
	public void setAdmin_name(String admin_name ){
		this.admin_name = admin_name;
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
