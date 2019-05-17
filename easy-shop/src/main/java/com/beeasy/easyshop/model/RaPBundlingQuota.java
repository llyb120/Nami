package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_p_bundling_quota")
public class RaPBundlingQuota   {
	
	/*
	套餐ID
	*/
	private Integer blQuotaId ;
	/*
	购买数量（单位月）
	*/
	private Integer blQuotaMonth ;
	/*
	套餐状态：0关闭，1开启。默认为 1
	*/
	private Integer blState ;
	/*
	会员id
	*/
	private Integer memberId ;
	/*
	店铺id
	*/
	private Integer storeId ;
	/*
	套餐结束时间
	*/
	private String blQuotaEndtime ;
	/*
	套餐开始时间
	*/
	private String blQuotaStarttime ;
	/*
	会员名称
	*/
	private String memberName ;
	/*
	店铺名称
	*/
	private String storeName ;
	
	public RaPBundlingQuota() {
	}
	
	/**
	* 套餐ID
	*@return 
	*/
	public Integer getBlQuotaId(){
		return  blQuotaId;
	}
	/**
	* 套餐ID
	*@param  blQuotaId
	*/
	public void setBlQuotaId(Integer blQuotaId ){
		this.blQuotaId = blQuotaId;
	}
	
	/**
	* 购买数量（单位月）
	*@return 
	*/
	public Integer getBlQuotaMonth(){
		return  blQuotaMonth;
	}
	/**
	* 购买数量（单位月）
	*@param  blQuotaMonth
	*/
	public void setBlQuotaMonth(Integer blQuotaMonth ){
		this.blQuotaMonth = blQuotaMonth;
	}
	
	/**
	* 套餐状态：0关闭，1开启。默认为 1
	*@return 
	*/
	public Integer getBlState(){
		return  blState;
	}
	/**
	* 套餐状态：0关闭，1开启。默认为 1
	*@param  blState
	*/
	public void setBlState(Integer blState ){
		this.blState = blState;
	}
	
	/**
	* 会员id
	*@return 
	*/
	public Integer getMemberId(){
		return  memberId;
	}
	/**
	* 会员id
	*@param  memberId
	*/
	public void setMemberId(Integer memberId ){
		this.memberId = memberId;
	}
	
	/**
	* 店铺id
	*@return 
	*/
	public Integer getStoreId(){
		return  storeId;
	}
	/**
	* 店铺id
	*@param  storeId
	*/
	public void setStoreId(Integer storeId ){
		this.storeId = storeId;
	}
	
	/**
	* 套餐结束时间
	*@return 
	*/
	public String getBlQuotaEndtime(){
		return  blQuotaEndtime;
	}
	/**
	* 套餐结束时间
	*@param  blQuotaEndtime
	*/
	public void setBlQuotaEndtime(String blQuotaEndtime ){
		this.blQuotaEndtime = blQuotaEndtime;
	}
	
	/**
	* 套餐开始时间
	*@return 
	*/
	public String getBlQuotaStarttime(){
		return  blQuotaStarttime;
	}
	/**
	* 套餐开始时间
	*@param  blQuotaStarttime
	*/
	public void setBlQuotaStarttime(String blQuotaStarttime ){
		this.blQuotaStarttime = blQuotaStarttime;
	}
	
	/**
	* 会员名称
	*@return 
	*/
	public String getMemberName(){
		return  memberName;
	}
	/**
	* 会员名称
	*@param  memberName
	*/
	public void setMemberName(String memberName ){
		this.memberName = memberName;
	}
	
	/**
	* 店铺名称
	*@return 
	*/
	public String getStoreName(){
		return  storeName;
	}
	/**
	* 店铺名称
	*@param  storeName
	*/
	public void setStoreName(String storeName ){
		this.storeName = storeName;
	}
	

}
