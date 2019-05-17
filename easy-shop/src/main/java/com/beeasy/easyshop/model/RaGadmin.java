package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_gadmin")
public class RaGadmin   {
	
	// alias
	public static final String ALIAS_gid = "gid";
	public static final String ALIAS_gname = "gname";
	public static final String ALIAS_limits = "limits";
	
	/*
	自增id
	*/
	private Integer gid ;
	/*
	组名
	*/
	private String gname ;
	/*
	权限内容
	*/
	private String limits ;
	
	public RaGadmin() {
	}
	
	/**
	* 自增id
	*@return 
	*/
	public Integer getGid(){
		return  gid;
	}
	/**
	* 自增id
	*@param  gid
	*/
	public void setGid(Integer gid ){
		this.gid = gid;
	}
	
	/**
	* 组名
	*@return 
	*/
	public String getGname(){
		return  gname;
	}
	/**
	* 组名
	*@param  gname
	*/
	public void setGname(String gname ){
		this.gname = gname;
	}
	
	/**
	* 权限内容
	*@return 
	*/
	public String getLimits(){
		return  limits;
	}
	/**
	* 权限内容
	*@param  limits
	*/
	public void setLimits(String limits ){
		this.limits = limits;
	}
	

}
