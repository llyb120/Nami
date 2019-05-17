package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_p_mansong_quota")
public class RaPMansongQuota   {
	
	// alias
	public static final String ALIAS_quota_id = "quota_id";
	public static final String ALIAS_apply_id = "apply_id";
	public static final String ALIAS_end_time = "end_time";
	public static final String ALIAS_member_id = "member_id";
	public static final String ALIAS_start_time = "start_time";
	public static final String ALIAS_state = "state";
	public static final String ALIAS_store_id = "store_id";
	public static final String ALIAS_member_name = "member_name";
	public static final String ALIAS_store_name = "store_name";
	
	/*
	满就送套餐编号
	*/
	private Integer quota_id ;
	/*
	申请编号
	*/
	private Integer apply_id ;
	/*
	结束时间
	*/
	private Integer end_time ;
	/*
	用户编号
	*/
	private Integer member_id ;
	/*
	开始时间
	*/
	private Integer start_time ;
	/*
	配额状态(1-可用/2-取消/3-结束)
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
	
	public RaPMansongQuota() {
	}
	
	/**
	* 满就送套餐编号
	*@return 
	*/
	public Integer getQuota_id(){
		return  quota_id;
	}
	/**
	* 满就送套餐编号
	*@param  quota_id
	*/
	public void setQuota_id(Integer quota_id ){
		this.quota_id = quota_id;
	}
	
	/**
	* 申请编号
	*@return 
	*/
	public Integer getApply_id(){
		return  apply_id;
	}
	/**
	* 申请编号
	*@param  apply_id
	*/
	public void setApply_id(Integer apply_id ){
		this.apply_id = apply_id;
	}
	
	/**
	* 结束时间
	*@return 
	*/
	public Integer getEnd_time(){
		return  end_time;
	}
	/**
	* 结束时间
	*@param  end_time
	*/
	public void setEnd_time(Integer end_time ){
		this.end_time = end_time;
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
	* 开始时间
	*@return 
	*/
	public Integer getStart_time(){
		return  start_time;
	}
	/**
	* 开始时间
	*@param  start_time
	*/
	public void setStart_time(Integer start_time ){
		this.start_time = start_time;
	}
	
	/**
	* 配额状态(1-可用/2-取消/3-结束)
	*@return 
	*/
	public Integer getState(){
		return  state;
	}
	/**
	* 配额状态(1-可用/2-取消/3-结束)
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
	

}
