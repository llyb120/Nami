package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_we_groupbuying")
public class RaWeGroupbuying   {
	
	private Integer weGroupbuyingId ;
	/*
	0未支付佣金，1已支付佣金
	*/
	private Integer isPayBrokerage ;
	/*
	发起者ID
	*/
	private Integer sponsorId ;
	private Integer storeId ;
	/*
	微团购活动ID
	*/
	private Integer weGroupbuyId ;
	/*
	0进行中，-1已经取消，1已成团
	*/
	private Integer weGroupbuyStatus ;
	/*
	发起者
	*/
	private String sponsorName ;
	/*
	发起时间
	*/
	private String sponsorTime ;
	
	public RaWeGroupbuying() {
	}
	
	public Integer getWeGroupbuyingId(){
		return  weGroupbuyingId;
	}
	public void setWeGroupbuyingId(Integer weGroupbuyingId ){
		this.weGroupbuyingId = weGroupbuyingId;
	}
	
	/**
	* 0未支付佣金，1已支付佣金
	*@return 
	*/
	public Integer getIsPayBrokerage(){
		return  isPayBrokerage;
	}
	/**
	* 0未支付佣金，1已支付佣金
	*@param  isPayBrokerage
	*/
	public void setIsPayBrokerage(Integer isPayBrokerage ){
		this.isPayBrokerage = isPayBrokerage;
	}
	
	/**
	* 发起者ID
	*@return 
	*/
	public Integer getSponsorId(){
		return  sponsorId;
	}
	/**
	* 发起者ID
	*@param  sponsorId
	*/
	public void setSponsorId(Integer sponsorId ){
		this.sponsorId = sponsorId;
	}
	
	public Integer getStoreId(){
		return  storeId;
	}
	public void setStoreId(Integer storeId ){
		this.storeId = storeId;
	}
	
	/**
	* 微团购活动ID
	*@return 
	*/
	public Integer getWeGroupbuyId(){
		return  weGroupbuyId;
	}
	/**
	* 微团购活动ID
	*@param  weGroupbuyId
	*/
	public void setWeGroupbuyId(Integer weGroupbuyId ){
		this.weGroupbuyId = weGroupbuyId;
	}
	
	/**
	* 0进行中，-1已经取消，1已成团
	*@return 
	*/
	public Integer getWeGroupbuyStatus(){
		return  weGroupbuyStatus;
	}
	/**
	* 0进行中，-1已经取消，1已成团
	*@param  weGroupbuyStatus
	*/
	public void setWeGroupbuyStatus(Integer weGroupbuyStatus ){
		this.weGroupbuyStatus = weGroupbuyStatus;
	}
	
	/**
	* 发起者
	*@return 
	*/
	public String getSponsorName(){
		return  sponsorName;
	}
	/**
	* 发起者
	*@param  sponsorName
	*/
	public void setSponsorName(String sponsorName ){
		this.sponsorName = sponsorName;
	}
	
	/**
	* 发起时间
	*@return 
	*/
	public String getSponsorTime(){
		return  sponsorTime;
	}
	/**
	* 发起时间
	*@param  sponsorTime
	*/
	public void setSponsorTime(String sponsorTime ){
		this.sponsorTime = sponsorTime;
	}
	

}
