package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_refund_reason")
public class RaRefundReason   {
	
	// alias
	public static final String ALIAS_reason_id = "reason_id";
	public static final String ALIAS_sort = "sort";
	public static final String ALIAS_update_time = "update_time";
	public static final String ALIAS_reason_info = "reason_info";
	
	/*
	原因ID
	*/
	private Integer reason_id ;
	/*
	排序
	*/
	private Integer sort ;
	/*
	更新时间
	*/
	private Integer update_time ;
	/*
	原因内容
	*/
	private String reason_info ;
	
	public RaRefundReason() {
	}
	
	/**
	* 原因ID
	*@return 
	*/
	public Integer getReason_id(){
		return  reason_id;
	}
	/**
	* 原因ID
	*@param  reason_id
	*/
	public void setReason_id(Integer reason_id ){
		this.reason_id = reason_id;
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
	public Integer getUpdate_time(){
		return  update_time;
	}
	/**
	* 更新时间
	*@param  update_time
	*/
	public void setUpdate_time(Integer update_time ){
		this.update_time = update_time;
	}
	
	/**
	* 原因内容
	*@return 
	*/
	public String getReason_info(){
		return  reason_info;
	}
	/**
	* 原因内容
	*@param  reason_info
	*/
	public void setReason_info(String reason_info ){
		this.reason_info = reason_info;
	}
	

}
