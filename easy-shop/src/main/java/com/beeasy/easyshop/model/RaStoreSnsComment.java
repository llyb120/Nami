package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_store_sns_comment")
public class RaStoreSnsComment   {
	
	// alias
	public static final String ALIAS_scomm_id = "scomm_id";
	public static final String ALIAS_scomm_memberid = "scomm_memberid";
	public static final String ALIAS_scomm_state = "scomm_state";
	public static final String ALIAS_strace_id = "strace_id";
	public static final String ALIAS_scomm_content = "scomm_content";
	public static final String ALIAS_scomm_memberavatar = "scomm_memberavatar";
	public static final String ALIAS_scomm_membername = "scomm_membername";
	public static final String ALIAS_scomm_time = "scomm_time";
	
	/*
	店铺动态评论id
	*/
	private Integer scomm_id ;
	/*
	会员id
	*/
	private Integer scomm_memberid ;
	/*
	评论状态 1正常，0屏蔽
	*/
	private Integer scomm_state ;
	/*
	店铺动态id
	*/
	private Integer strace_id ;
	/*
	评论内容
	*/
	private String scomm_content ;
	/*
	会员头像
	*/
	private String scomm_memberavatar ;
	/*
	会员名称
	*/
	private String scomm_membername ;
	/*
	评论时间
	*/
	private String scomm_time ;
	
	public RaStoreSnsComment() {
	}
	
	/**
	* 店铺动态评论id
	*@return 
	*/
	public Integer getScomm_id(){
		return  scomm_id;
	}
	/**
	* 店铺动态评论id
	*@param  scomm_id
	*/
	public void setScomm_id(Integer scomm_id ){
		this.scomm_id = scomm_id;
	}
	
	/**
	* 会员id
	*@return 
	*/
	public Integer getScomm_memberid(){
		return  scomm_memberid;
	}
	/**
	* 会员id
	*@param  scomm_memberid
	*/
	public void setScomm_memberid(Integer scomm_memberid ){
		this.scomm_memberid = scomm_memberid;
	}
	
	/**
	* 评论状态 1正常，0屏蔽
	*@return 
	*/
	public Integer getScomm_state(){
		return  scomm_state;
	}
	/**
	* 评论状态 1正常，0屏蔽
	*@param  scomm_state
	*/
	public void setScomm_state(Integer scomm_state ){
		this.scomm_state = scomm_state;
	}
	
	/**
	* 店铺动态id
	*@return 
	*/
	public Integer getStrace_id(){
		return  strace_id;
	}
	/**
	* 店铺动态id
	*@param  strace_id
	*/
	public void setStrace_id(Integer strace_id ){
		this.strace_id = strace_id;
	}
	
	/**
	* 评论内容
	*@return 
	*/
	public String getScomm_content(){
		return  scomm_content;
	}
	/**
	* 评论内容
	*@param  scomm_content
	*/
	public void setScomm_content(String scomm_content ){
		this.scomm_content = scomm_content;
	}
	
	/**
	* 会员头像
	*@return 
	*/
	public String getScomm_memberavatar(){
		return  scomm_memberavatar;
	}
	/**
	* 会员头像
	*@param  scomm_memberavatar
	*/
	public void setScomm_memberavatar(String scomm_memberavatar ){
		this.scomm_memberavatar = scomm_memberavatar;
	}
	
	/**
	* 会员名称
	*@return 
	*/
	public String getScomm_membername(){
		return  scomm_membername;
	}
	/**
	* 会员名称
	*@param  scomm_membername
	*/
	public void setScomm_membername(String scomm_membername ){
		this.scomm_membername = scomm_membername;
	}
	
	/**
	* 评论时间
	*@return 
	*/
	public String getScomm_time(){
		return  scomm_time;
	}
	/**
	* 评论时间
	*@param  scomm_time
	*/
	public void setScomm_time(String scomm_time ){
		this.scomm_time = scomm_time;
	}
	

}
