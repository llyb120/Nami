package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_mall_consult")
public class RaMallConsult   {
	
	// alias
	public static final String ALIAS_mc_id = "mc_id";
	public static final String ALIAS_admin_id = "admin_id";
	public static final String ALIAS_is_reply = "is_reply";
	public static final String ALIAS_mc_addtime = "mc_addtime";
	public static final String ALIAS_mc_reply_time = "mc_reply_time";
	public static final String ALIAS_mct_id = "mct_id";
	public static final String ALIAS_member_id = "member_id";
	public static final String ALIAS_admin_name = "admin_name";
	public static final String ALIAS_mc_content = "mc_content";
	public static final String ALIAS_mc_reply = "mc_reply";
	public static final String ALIAS_member_name = "member_name";
	
	/*
	平台客服咨询id
	*/
	private Integer mc_id ;
	/*
	管理员id
	*/
	private Integer admin_id ;
	/*
	是否回复，1是，0否，默认0
	*/
	private Integer is_reply ;
	/*
	咨询时间
	*/
	private Integer mc_addtime ;
	/*
	回复时间
	*/
	private Integer mc_reply_time ;
	/*
	咨询类型id
	*/
	private Integer mct_id ;
	/*
	会员id
	*/
	private Integer member_id ;
	/*
	管理员名称
	*/
	private String admin_name ;
	/*
	咨询内容
	*/
	private String mc_content ;
	/*
	回复内容
	*/
	private String mc_reply ;
	/*
	会员名称
	*/
	private String member_name ;
	
	public RaMallConsult() {
	}
	
	/**
	* 平台客服咨询id
	*@return 
	*/
	public Integer getMc_id(){
		return  mc_id;
	}
	/**
	* 平台客服咨询id
	*@param  mc_id
	*/
	public void setMc_id(Integer mc_id ){
		this.mc_id = mc_id;
	}
	
	/**
	* 管理员id
	*@return 
	*/
	public Integer getAdmin_id(){
		return  admin_id;
	}
	/**
	* 管理员id
	*@param  admin_id
	*/
	public void setAdmin_id(Integer admin_id ){
		this.admin_id = admin_id;
	}
	
	/**
	* 是否回复，1是，0否，默认0
	*@return 
	*/
	public Integer getIs_reply(){
		return  is_reply;
	}
	/**
	* 是否回复，1是，0否，默认0
	*@param  is_reply
	*/
	public void setIs_reply(Integer is_reply ){
		this.is_reply = is_reply;
	}
	
	/**
	* 咨询时间
	*@return 
	*/
	public Integer getMc_addtime(){
		return  mc_addtime;
	}
	/**
	* 咨询时间
	*@param  mc_addtime
	*/
	public void setMc_addtime(Integer mc_addtime ){
		this.mc_addtime = mc_addtime;
	}
	
	/**
	* 回复时间
	*@return 
	*/
	public Integer getMc_reply_time(){
		return  mc_reply_time;
	}
	/**
	* 回复时间
	*@param  mc_reply_time
	*/
	public void setMc_reply_time(Integer mc_reply_time ){
		this.mc_reply_time = mc_reply_time;
	}
	
	/**
	* 咨询类型id
	*@return 
	*/
	public Integer getMct_id(){
		return  mct_id;
	}
	/**
	* 咨询类型id
	*@param  mct_id
	*/
	public void setMct_id(Integer mct_id ){
		this.mct_id = mct_id;
	}
	
	/**
	* 会员id
	*@return 
	*/
	public Integer getMember_id(){
		return  member_id;
	}
	/**
	* 会员id
	*@param  member_id
	*/
	public void setMember_id(Integer member_id ){
		this.member_id = member_id;
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
	* 咨询内容
	*@return 
	*/
	public String getMc_content(){
		return  mc_content;
	}
	/**
	* 咨询内容
	*@param  mc_content
	*/
	public void setMc_content(String mc_content ){
		this.mc_content = mc_content;
	}
	
	/**
	* 回复内容
	*@return 
	*/
	public String getMc_reply(){
		return  mc_reply;
	}
	/**
	* 回复内容
	*@param  mc_reply
	*/
	public void setMc_reply(String mc_reply ){
		this.mc_reply = mc_reply;
	}
	
	/**
	* 会员名称
	*@return 
	*/
	public String getMember_name(){
		return  member_name;
	}
	/**
	* 会员名称
	*@param  member_name
	*/
	public void setMember_name(String member_name ){
		this.member_name = member_name;
	}
	

}
