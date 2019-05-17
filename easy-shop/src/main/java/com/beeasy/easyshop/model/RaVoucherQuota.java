package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_voucher_quota")
public class RaVoucherQuota   {
	
	// alias
	public static final String ALIAS_quota_id = "quota_id";
	public static final String ALIAS_quota_applyid = "quota_applyid";
	public static final String ALIAS_quota_endtime = "quota_endtime";
	public static final String ALIAS_quota_memberid = "quota_memberid";
	public static final String ALIAS_quota_starttime = "quota_starttime";
	public static final String ALIAS_quota_state = "quota_state";
	public static final String ALIAS_quota_storeid = "quota_storeid";
	public static final String ALIAS_quota_membername = "quota_membername";
	public static final String ALIAS_quota_storename = "quota_storename";
	
	/*
	套餐编号
	*/
	private Integer quota_id ;
	/*
	申请编号
	*/
	private Integer quota_applyid ;
	/*
	结束时间
	*/
	private Integer quota_endtime ;
	/*
	会员编号
	*/
	private Integer quota_memberid ;
	/*
	开始时间
	*/
	private Integer quota_starttime ;
	/*
	状态(1-可用/2-取消/3-结束)
	*/
	private Integer quota_state ;
	/*
	店铺编号
	*/
	private Integer quota_storeid ;
	/*
	会员名称
	*/
	private String quota_membername ;
	/*
	店铺名称
	*/
	private String quota_storename ;
	
	public RaVoucherQuota() {
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
	* 申请编号
	*@return 
	*/
	public Integer getQuota_applyid(){
		return  quota_applyid;
	}
	/**
	* 申请编号
	*@param  quota_applyid
	*/
	public void setQuota_applyid(Integer quota_applyid ){
		this.quota_applyid = quota_applyid;
	}
	
	/**
	* 结束时间
	*@return 
	*/
	public Integer getQuota_endtime(){
		return  quota_endtime;
	}
	/**
	* 结束时间
	*@param  quota_endtime
	*/
	public void setQuota_endtime(Integer quota_endtime ){
		this.quota_endtime = quota_endtime;
	}
	
	/**
	* 会员编号
	*@return 
	*/
	public Integer getQuota_memberid(){
		return  quota_memberid;
	}
	/**
	* 会员编号
	*@param  quota_memberid
	*/
	public void setQuota_memberid(Integer quota_memberid ){
		this.quota_memberid = quota_memberid;
	}
	
	/**
	* 开始时间
	*@return 
	*/
	public Integer getQuota_starttime(){
		return  quota_starttime;
	}
	/**
	* 开始时间
	*@param  quota_starttime
	*/
	public void setQuota_starttime(Integer quota_starttime ){
		this.quota_starttime = quota_starttime;
	}
	
	/**
	* 状态(1-可用/2-取消/3-结束)
	*@return 
	*/
	public Integer getQuota_state(){
		return  quota_state;
	}
	/**
	* 状态(1-可用/2-取消/3-结束)
	*@param  quota_state
	*/
	public void setQuota_state(Integer quota_state ){
		this.quota_state = quota_state;
	}
	
	/**
	* 店铺编号
	*@return 
	*/
	public Integer getQuota_storeid(){
		return  quota_storeid;
	}
	/**
	* 店铺编号
	*@param  quota_storeid
	*/
	public void setQuota_storeid(Integer quota_storeid ){
		this.quota_storeid = quota_storeid;
	}
	
	/**
	* 会员名称
	*@return 
	*/
	public String getQuota_membername(){
		return  quota_membername;
	}
	/**
	* 会员名称
	*@param  quota_membername
	*/
	public void setQuota_membername(String quota_membername ){
		this.quota_membername = quota_membername;
	}
	
	/**
	* 店铺名称
	*@return 
	*/
	public String getQuota_storename(){
		return  quota_storename;
	}
	/**
	* 店铺名称
	*@param  quota_storename
	*/
	public void setQuota_storename(String quota_storename ){
		this.quota_storename = quota_storename;
	}
	

}
