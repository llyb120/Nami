package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_p_mansong")
public class RaPMansong   {
	
	/*
	满送活动编号
	*/
	private Integer mansongId ;
	/*
	活动结束时间
	*/
	private Integer endTime ;
	/*
	用户编号
	*/
	private Integer memberId ;
	/*
	套餐编号
	*/
	private Integer quotaId ;
	/*
	活动开始时间
	*/
	private Integer startTime ;
	/*
	活动状态(1-未发布/2-正常/3-取消/4-失效/5-结束)
	*/
	private Integer state ;
	/*
	店铺编号
	*/
	private Integer storeId ;
	/*
	活动名称
	*/
	private String mansongName ;
	/*
	用户名
	*/
	private String memberName ;
	/*
	备注
	*/
	private String remark ;
	/*
	店铺名称
	*/
	private String storeName ;
	
	public RaPMansong() {
	}
	
	/**
	* 满送活动编号
	*@return 
	*/
	public Integer getMansongId(){
		return  mansongId;
	}
	/**
	* 满送活动编号
	*@param  mansongId
	*/
	public void setMansongId(Integer mansongId ){
		this.mansongId = mansongId;
	}
	
	/**
	* 活动结束时间
	*@return 
	*/
	public Integer getEndTime(){
		return  endTime;
	}
	/**
	* 活动结束时间
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
	* 套餐编号
	*@return 
	*/
	public Integer getQuotaId(){
		return  quotaId;
	}
	/**
	* 套餐编号
	*@param  quotaId
	*/
	public void setQuotaId(Integer quotaId ){
		this.quotaId = quotaId;
	}
	
	/**
	* 活动开始时间
	*@return 
	*/
	public Integer getStartTime(){
		return  startTime;
	}
	/**
	* 活动开始时间
	*@param  startTime
	*/
	public void setStartTime(Integer startTime ){
		this.startTime = startTime;
	}
	
	/**
	* 活动状态(1-未发布/2-正常/3-取消/4-失效/5-结束)
	*@return 
	*/
	public Integer getState(){
		return  state;
	}
	/**
	* 活动状态(1-未发布/2-正常/3-取消/4-失效/5-结束)
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
	* 活动名称
	*@return 
	*/
	public String getMansongName(){
		return  mansongName;
	}
	/**
	* 活动名称
	*@param  mansongName
	*/
	public void setMansongName(String mansongName ){
		this.mansongName = mansongName;
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
	* 备注
	*@return 
	*/
	public String getRemark(){
		return  remark;
	}
	/**
	* 备注
	*@param  remark
	*/
	public void setRemark(String remark ){
		this.remark = remark;
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
