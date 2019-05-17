package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_p_xianshi")
public class RaPXianshi   {
	
	// alias
	public static final String ALIAS_xianshi_id = "xianshi_id";
	public static final String ALIAS_end_time = "end_time";
	public static final String ALIAS_lower_limit = "lower_limit";
	public static final String ALIAS_member_id = "member_id";
	public static final String ALIAS_quota_id = "quota_id";
	public static final String ALIAS_start_time = "start_time";
	public static final String ALIAS_state = "state";
	public static final String ALIAS_store_id = "store_id";
	public static final String ALIAS_member_name = "member_name";
	public static final String ALIAS_store_name = "store_name";
	public static final String ALIAS_xianshi_explain = "xianshi_explain";
	public static final String ALIAS_xianshi_name = "xianshi_name";
	public static final String ALIAS_xianshi_title = "xianshi_title";
	
	/*
	限时编号
	*/
	private Integer xianshi_id ;
	/*
	活动结束时间
	*/
	private Integer end_time ;
	/*
	购买下限，1为不限制
	*/
	private Integer lower_limit ;
	/*
	用户编号
	*/
	private Integer member_id ;
	/*
	套餐编号
	*/
	private Integer quota_id ;
	/*
	活动开始时间
	*/
	private Integer start_time ;
	/*
	状态，0-取消 1-正常
	*/
	private Integer state ;
	/*
	店铺编号
	*/
	private Integer store_id ;
	/*
	用户名
	*/
	private String member_name ;
	/*
	店铺名称
	*/
	private String store_name ;
	/*
	活动说明
	*/
	private String xianshi_explain ;
	/*
	活动名称
	*/
	private String xianshi_name ;
	/*
	活动标题
	*/
	private String xianshi_title ;
	
	public RaPXianshi() {
	}
	
	/**
	* 限时编号
	*@return 
	*/
	public Integer getXianshi_id(){
		return  xianshi_id;
	}
	/**
	* 限时编号
	*@param  xianshi_id
	*/
	public void setXianshi_id(Integer xianshi_id ){
		this.xianshi_id = xianshi_id;
	}
	
	/**
	* 活动结束时间
	*@return 
	*/
	public Integer getEnd_time(){
		return  end_time;
	}
	/**
	* 活动结束时间
	*@param  end_time
	*/
	public void setEnd_time(Integer end_time ){
		this.end_time = end_time;
	}
	
	/**
	* 购买下限，1为不限制
	*@return 
	*/
	public Integer getLower_limit(){
		return  lower_limit;
	}
	/**
	* 购买下限，1为不限制
	*@param  lower_limit
	*/
	public void setLower_limit(Integer lower_limit ){
		this.lower_limit = lower_limit;
	}
	
	/**
	* 用户编号
	*@return 
	*/
	public Integer getMember_id(){
		return  member_id;
	}
	/**
	* 用户编号
	*@param  member_id
	*/
	public void setMember_id(Integer member_id ){
		this.member_id = member_id;
	}
	
	/**
	* 套餐编号
	*@return 
	*/
	public Integer getQuota_id(){
		return  quota_id;
	}
	/**
	* 套餐编号
	*@param  quota_id
	*/
	public void setQuota_id(Integer quota_id ){
		this.quota_id = quota_id;
	}
	
	/**
	* 活动开始时间
	*@return 
	*/
	public Integer getStart_time(){
		return  start_time;
	}
	/**
	* 活动开始时间
	*@param  start_time
	*/
	public void setStart_time(Integer start_time ){
		this.start_time = start_time;
	}
	
	/**
	* 状态，0-取消 1-正常
	*@return 
	*/
	public Integer getState(){
		return  state;
	}
	/**
	* 状态，0-取消 1-正常
	*@param  state
	*/
	public void setState(Integer state ){
		this.state = state;
	}
	
	/**
	* 店铺编号
	*@return 
	*/
	public Integer getStore_id(){
		return  store_id;
	}
	/**
	* 店铺编号
	*@param  store_id
	*/
	public void setStore_id(Integer store_id ){
		this.store_id = store_id;
	}
	
	/**
	* 用户名
	*@return 
	*/
	public String getMember_name(){
		return  member_name;
	}
	/**
	* 用户名
	*@param  member_name
	*/
	public void setMember_name(String member_name ){
		this.member_name = member_name;
	}
	
	/**
	* 店铺名称
	*@return 
	*/
	public String getStore_name(){
		return  store_name;
	}
	/**
	* 店铺名称
	*@param  store_name
	*/
	public void setStore_name(String store_name ){
		this.store_name = store_name;
	}
	
	/**
	* 活动说明
	*@return 
	*/
	public String getXianshi_explain(){
		return  xianshi_explain;
	}
	/**
	* 活动说明
	*@param  xianshi_explain
	*/
	public void setXianshi_explain(String xianshi_explain ){
		this.xianshi_explain = xianshi_explain;
	}
	
	/**
	* 活动名称
	*@return 
	*/
	public String getXianshi_name(){
		return  xianshi_name;
	}
	/**
	* 活动名称
	*@param  xianshi_name
	*/
	public void setXianshi_name(String xianshi_name ){
		this.xianshi_name = xianshi_name;
	}
	
	/**
	* 活动标题
	*@return 
	*/
	public String getXianshi_title(){
		return  xianshi_title;
	}
	/**
	* 活动标题
	*@param  xianshi_title
	*/
	public void setXianshi_title(String xianshi_title ){
		this.xianshi_title = xianshi_title;
	}
	

}
