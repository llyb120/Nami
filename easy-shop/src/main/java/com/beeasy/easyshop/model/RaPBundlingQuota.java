package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_p_bundling_quota")
public class RaPBundlingQuota   {
	
	// alias
	public static final String ALIAS_bl_quota_id = "bl_quota_id";
	public static final String ALIAS_bl_quota_month = "bl_quota_month";
	public static final String ALIAS_bl_state = "bl_state";
	public static final String ALIAS_member_id = "member_id";
	public static final String ALIAS_store_id = "store_id";
	public static final String ALIAS_bl_quota_endtime = "bl_quota_endtime";
	public static final String ALIAS_bl_quota_starttime = "bl_quota_starttime";
	public static final String ALIAS_member_name = "member_name";
	public static final String ALIAS_store_name = "store_name";
	
	/*
	套餐ID
	*/
	private Integer bl_quota_id ;
	/*
	购买数量（单位月）
	*/
	private Integer bl_quota_month ;
	/*
	套餐状态：0关闭，1开启。默认为 1
	*/
	private Integer bl_state ;
	/*
	会员id
	*/
	private Integer member_id ;
	/*
	店铺id
	*/
	private Integer store_id ;
	/*
	套餐结束时间
	*/
	private String bl_quota_endtime ;
	/*
	套餐开始时间
	*/
	private String bl_quota_starttime ;
	/*
	会员名称
	*/
	private String member_name ;
	/*
	店铺名称
	*/
	private String store_name ;
	
	public RaPBundlingQuota() {
	}
	
	/**
	* 套餐ID
	*@return 
	*/
	public Integer getBl_quota_id(){
		return  bl_quota_id;
	}
	/**
	* 套餐ID
	*@param  bl_quota_id
	*/
	public void setBl_quota_id(Integer bl_quota_id ){
		this.bl_quota_id = bl_quota_id;
	}
	
	/**
	* 购买数量（单位月）
	*@return 
	*/
	public Integer getBl_quota_month(){
		return  bl_quota_month;
	}
	/**
	* 购买数量（单位月）
	*@param  bl_quota_month
	*/
	public void setBl_quota_month(Integer bl_quota_month ){
		this.bl_quota_month = bl_quota_month;
	}
	
	/**
	* 套餐状态：0关闭，1开启。默认为 1
	*@return 
	*/
	public Integer getBl_state(){
		return  bl_state;
	}
	/**
	* 套餐状态：0关闭，1开启。默认为 1
	*@param  bl_state
	*/
	public void setBl_state(Integer bl_state ){
		this.bl_state = bl_state;
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
	* 店铺id
	*@return 
	*/
	public Integer getStore_id(){
		return  store_id;
	}
	/**
	* 店铺id
	*@param  store_id
	*/
	public void setStore_id(Integer store_id ){
		this.store_id = store_id;
	}
	
	/**
	* 套餐结束时间
	*@return 
	*/
	public String getBl_quota_endtime(){
		return  bl_quota_endtime;
	}
	/**
	* 套餐结束时间
	*@param  bl_quota_endtime
	*/
	public void setBl_quota_endtime(String bl_quota_endtime ){
		this.bl_quota_endtime = bl_quota_endtime;
	}
	
	/**
	* 套餐开始时间
	*@return 
	*/
	public String getBl_quota_starttime(){
		return  bl_quota_starttime;
	}
	/**
	* 套餐开始时间
	*@param  bl_quota_starttime
	*/
	public void setBl_quota_starttime(String bl_quota_starttime ){
		this.bl_quota_starttime = bl_quota_starttime;
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
	

}
