package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_p_mansong_quota")
public class RaPMansongQuota   {
	
	/*
	满就送套餐编号
	*/
	private Integer quotaId ;
	/*
	申请编号
	*/
	private Integer applyId ;
	/*
	结束时间
	*/
	private Integer endTime ;
	/*
	用户编号
	*/
	private Integer memberId ;
	/*
	开始时间
	*/
	private Integer startTime ;
	/*
	配额状态(1-可用/2-取消/3-结束)
	*/
	private Integer state ;
	/*
	店铺编号
	*/
	private Integer storeId ;
	/*
	用户名
	*/
	private String memberName ;
	/*
	店铺名称
	*/
	private String storeName ;
	
	public RaPMansongQuota() {
	}
	
	/**
	* 满就送套餐编号
	*@return 
	*/
	public Integer getQuotaId(){
		return  quotaId;
	}
	/**
	* 满就送套餐编号
	*@param  quotaId
	*/
	public void setQuotaId(Integer quotaId ){
		this.quotaId = quotaId;
	}
	
	/**
	* 申请编号
	*@return 
	*/
	public Integer getApplyId(){
		return  applyId;
	}
	/**
	* 申请编号
	*@param  applyId
	*/
	public void setApplyId(Integer applyId ){
		this.applyId = applyId;
	}
	
	/**
	* 结束时间
	*@return 
	*/
	public Integer getEndTime(){
		return  endTime;
	}
	/**
	* 结束时间
	*@param  endTime
	*/
	public void setEndTime(Integer endTime ){
		this.endTime = endTime;
	}
	
	/**
	* 用户编号
	*@return 
	*/
	public Integer getMemberId(){
		return  memberId;
	}
	/**
	* 用户编号
	*@param  memberId
	*/
	public void setMemberId(Integer memberId ){
		this.memberId = memberId;
	}
	
	/**
	* 开始时间
	*@return 
	*/
	public Integer getStartTime(){
		return  startTime;
	}
	/**
	* 开始时间
	*@param  startTime
	*/
	public void setStartTime(Integer startTime ){
		this.startTime = startTime;
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
	public Integer getStoreId(){
		return  storeId;
	}
	/**
	* 店铺编号
	*@param  storeId
	*/
	public void setStoreId(Integer storeId ){
		this.storeId = storeId;
	}
	
	/**
	* 用户名
	*@return 
	*/
	public String getMemberName(){
		return  memberName;
	}
	/**
	* 用户名
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
