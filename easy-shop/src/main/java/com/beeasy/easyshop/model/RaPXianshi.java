package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_p_xianshi")
public class RaPXianshi   {
	
	/*
	限时编号
	*/
	private Integer xianshiId ;
	/*
	活动结束时间
	*/
	private Integer endTime ;
	/*
	购买下限，1为不限制
	*/
	private Integer lowerLimit ;
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
	状态，0-取消 1-正常
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
	/*
	活动说明
	*/
	private String xianshiExplain ;
	/*
	活动名称
	*/
	private String xianshiName ;
	/*
	活动标题
	*/
	private String xianshiTitle ;
	
	public RaPXianshi() {
	}
	
	/**
	* 限时编号
	*@return 
	*/
	public Integer getXianshiId(){
		return  xianshiId;
	}
	/**
	* 限时编号
	*@param  xianshiId
	*/
	public void setXianshiId(Integer xianshiId ){
		this.xianshiId = xianshiId;
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
	* 购买下限，1为不限制
	*@return 
	*/
	public Integer getLowerLimit(){
		return  lowerLimit;
	}
	/**
	* 购买下限，1为不限制
	*@param  lowerLimit
	*/
	public void setLowerLimit(Integer lowerLimit ){
		this.lowerLimit = lowerLimit;
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
	
	/**
	* 活动说明
	*@return 
	*/
	public String getXianshiExplain(){
		return  xianshiExplain;
	}
	/**
	* 活动说明
	*@param  xianshiExplain
	*/
	public void setXianshiExplain(String xianshiExplain ){
		this.xianshiExplain = xianshiExplain;
	}
	
	/**
	* 活动名称
	*@return 
	*/
	public String getXianshiName(){
		return  xianshiName;
	}
	/**
	* 活动名称
	*@param  xianshiName
	*/
	public void setXianshiName(String xianshiName ){
		this.xianshiName = xianshiName;
	}
	
	/**
	* 活动标题
	*@return 
	*/
	public String getXianshiTitle(){
		return  xianshiTitle;
	}
	/**
	* 活动标题
	*@param  xianshiTitle
	*/
	public void setXianshiTitle(String xianshiTitle ){
		this.xianshiTitle = xianshiTitle;
	}
	

}
