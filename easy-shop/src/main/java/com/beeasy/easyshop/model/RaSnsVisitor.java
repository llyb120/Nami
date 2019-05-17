package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_sns_visitor")
public class RaSnsVisitor   {
	
	// alias
	public static final String ALIAS_v_id = "v_id";
	public static final String ALIAS_v_addtime = "v_addtime";
	public static final String ALIAS_v_mid = "v_mid";
	public static final String ALIAS_v_ownermid = "v_ownermid";
	public static final String ALIAS_v_mavatar = "v_mavatar";
	public static final String ALIAS_v_mname = "v_mname";
	public static final String ALIAS_v_ownermavatar = "v_ownermavatar";
	public static final String ALIAS_v_ownermname = "v_ownermname";
	
	/*
	自增ID
	*/
	private Integer v_id ;
	/*
	访问时间
	*/
	private Integer v_addtime ;
	/*
	访客会员ID
	*/
	private Integer v_mid ;
	/*
	主人会员ID
	*/
	private Integer v_ownermid ;
	/*
	访客会员头像
	*/
	private String v_mavatar ;
	/*
	访客会员名称
	*/
	private String v_mname ;
	/*
	主人会员头像
	*/
	private String v_ownermavatar ;
	/*
	主人会员名称
	*/
	private String v_ownermname ;
	
	public RaSnsVisitor() {
	}
	
	/**
	* 自增ID
	*@return 
	*/
	public Integer getV_id(){
		return  v_id;
	}
	/**
	* 自增ID
	*@param  v_id
	*/
	public void setV_id(Integer v_id ){
		this.v_id = v_id;
	}
	
	/**
	* 访问时间
	*@return 
	*/
	public Integer getV_addtime(){
		return  v_addtime;
	}
	/**
	* 访问时间
	*@param  v_addtime
	*/
	public void setV_addtime(Integer v_addtime ){
		this.v_addtime = v_addtime;
	}
	
	/**
	* 访客会员ID
	*@return 
	*/
	public Integer getV_mid(){
		return  v_mid;
	}
	/**
	* 访客会员ID
	*@param  v_mid
	*/
	public void setV_mid(Integer v_mid ){
		this.v_mid = v_mid;
	}
	
	/**
	* 主人会员ID
	*@return 
	*/
	public Integer getV_ownermid(){
		return  v_ownermid;
	}
	/**
	* 主人会员ID
	*@param  v_ownermid
	*/
	public void setV_ownermid(Integer v_ownermid ){
		this.v_ownermid = v_ownermid;
	}
	
	/**
	* 访客会员头像
	*@return 
	*/
	public String getV_mavatar(){
		return  v_mavatar;
	}
	/**
	* 访客会员头像
	*@param  v_mavatar
	*/
	public void setV_mavatar(String v_mavatar ){
		this.v_mavatar = v_mavatar;
	}
	
	/**
	* 访客会员名称
	*@return 
	*/
	public String getV_mname(){
		return  v_mname;
	}
	/**
	* 访客会员名称
	*@param  v_mname
	*/
	public void setV_mname(String v_mname ){
		this.v_mname = v_mname;
	}
	
	/**
	* 主人会员头像
	*@return 
	*/
	public String getV_ownermavatar(){
		return  v_ownermavatar;
	}
	/**
	* 主人会员头像
	*@param  v_ownermavatar
	*/
	public void setV_ownermavatar(String v_ownermavatar ){
		this.v_ownermavatar = v_ownermavatar;
	}
	
	/**
	* 主人会员名称
	*@return 
	*/
	public String getV_ownermname(){
		return  v_ownermname;
	}
	/**
	* 主人会员名称
	*@param  v_ownermname
	*/
	public void setV_ownermname(String v_ownermname ){
		this.v_ownermname = v_ownermname;
	}
	

}
