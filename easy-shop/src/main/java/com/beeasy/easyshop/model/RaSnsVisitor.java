package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_sns_visitor")
public class RaSnsVisitor   {
	
	/*
	自增ID
	*/
	private Integer vId ;
	/*
	访问时间
	*/
	private Integer vAddtime ;
	/*
	访客会员ID
	*/
	private Integer vMid ;
	/*
	主人会员ID
	*/
	private Integer vOwnermid ;
	/*
	访客会员头像
	*/
	private String vMavatar ;
	/*
	访客会员名称
	*/
	private String vMname ;
	/*
	主人会员头像
	*/
	private String vOwnermavatar ;
	/*
	主人会员名称
	*/
	private String vOwnermname ;
	
	public RaSnsVisitor() {
	}
	
	/**
	* 自增ID
	*@return 
	*/
	public Integer getvId(){
		return  vId;
	}
	/**
	* 自增ID
	*@param  vId
	*/
	public void setvId(Integer vId ){
		this.vId = vId;
	}
	
	/**
	* 访问时间
	*@return 
	*/
	public Integer getvAddtime(){
		return  vAddtime;
	}
	/**
	* 访问时间
	*@param  vAddtime
	*/
	public void setvAddtime(Integer vAddtime ){
		this.vAddtime = vAddtime;
	}
	
	/**
	* 访客会员ID
	*@return 
	*/
	public Integer getvMid(){
		return  vMid;
	}
	/**
	* 访客会员ID
	*@param  vMid
	*/
	public void setvMid(Integer vMid ){
		this.vMid = vMid;
	}
	
	/**
	* 主人会员ID
	*@return 
	*/
	public Integer getvOwnermid(){
		return  vOwnermid;
	}
	/**
	* 主人会员ID
	*@param  vOwnermid
	*/
	public void setvOwnermid(Integer vOwnermid ){
		this.vOwnermid = vOwnermid;
	}
	
	/**
	* 访客会员头像
	*@return 
	*/
	public String getvMavatar(){
		return  vMavatar;
	}
	/**
	* 访客会员头像
	*@param  vMavatar
	*/
	public void setvMavatar(String vMavatar ){
		this.vMavatar = vMavatar;
	}
	
	/**
	* 访客会员名称
	*@return 
	*/
	public String getvMname(){
		return  vMname;
	}
	/**
	* 访客会员名称
	*@param  vMname
	*/
	public void setvMname(String vMname ){
		this.vMname = vMname;
	}
	
	/**
	* 主人会员头像
	*@return 
	*/
	public String getvOwnermavatar(){
		return  vOwnermavatar;
	}
	/**
	* 主人会员头像
	*@param  vOwnermavatar
	*/
	public void setvOwnermavatar(String vOwnermavatar ){
		this.vOwnermavatar = vOwnermavatar;
	}
	
	/**
	* 主人会员名称
	*@return 
	*/
	public String getvOwnermname(){
		return  vOwnermname;
	}
	/**
	* 主人会员名称
	*@param  vOwnermname
	*/
	public void setvOwnermname(String vOwnermname ){
		this.vOwnermname = vOwnermname;
	}
	

}
