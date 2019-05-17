package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_refund_reason")
public class RaRefundReason   {
	
	/*
	原因ID
	*/
	private Integer reasonId ;
	/*
	排序
	*/
	private Integer sort ;
	/*
	更新时间
	*/
	private Integer updateTime ;
	/*
	原因内容
	*/
	private String reasonInfo ;
	
	public RaRefundReason() {
	}
	
	/**
	* 原因ID
	*@return 
	*/
	public Integer getReasonId(){
		return  reasonId;
	}
	/**
	* 原因ID
	*@param  reasonId
	*/
	public void setReasonId(Integer reasonId ){
		this.reasonId = reasonId;
	}
	
	/**
	* 排序
	*@return 
	*/
	public Integer getSort(){
		return  sort;
	}
	/**
	* 排序
	*@param  sort
	*/
	public void setSort(Integer sort ){
		this.sort = sort;
	}
	
	/**
	* 更新时间
	*@return 
	*/
	public Integer getUpdateTime(){
		return  updateTime;
	}
	/**
	* 更新时间
	*@param  updateTime
	*/
	public void setUpdateTime(Integer updateTime ){
		this.updateTime = updateTime;
	}
	
	/**
	* 原因内容
	*@return 
	*/
	public String getReasonInfo(){
		return  reasonInfo;
	}
	/**
	* 原因内容
	*@param  reasonInfo
	*/
	public void setReasonInfo(String reasonInfo ){
		this.reasonInfo = reasonInfo;
	}
	

}
