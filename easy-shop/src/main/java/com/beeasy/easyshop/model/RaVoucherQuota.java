package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_voucher_quota")
public class RaVoucherQuota   {
	
	/*
	套餐编号
	*/
	private Integer quotaId ;
	/*
	申请编号
	*/
	private Integer quotaApplyid ;
	/*
	结束时间
	*/
	private Integer quotaEndtime ;
	/*
	会员编号
	*/
	private Integer quotaMemberid ;
	/*
	开始时间
	*/
	private Integer quotaStarttime ;
	/*
	状态(1-可用/2-取消/3-结束)
	*/
	private Integer quotaState ;
	/*
	店铺编号
	*/
	private Integer quotaStoreid ;
	/*
	会员名称
	*/
	private String quotaMembername ;
	/*
	店铺名称
	*/
	private String quotaStorename ;
	
	public RaVoucherQuota() {
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
	* 申请编号
	*@return 
	*/
	public Integer getQuotaApplyid(){
		return  quotaApplyid;
	}
	/**
	* 申请编号
	*@param  quotaApplyid
	*/
	public void setQuotaApplyid(Integer quotaApplyid ){
		this.quotaApplyid = quotaApplyid;
	}
	
	/**
	* 结束时间
	*@return 
	*/
	public Integer getQuotaEndtime(){
		return  quotaEndtime;
	}
	/**
	* 结束时间
	*@param  quotaEndtime
	*/
	public void setQuotaEndtime(Integer quotaEndtime ){
		this.quotaEndtime = quotaEndtime;
	}
	
	/**
	* 会员编号
	*@return 
	*/
	public Integer getQuotaMemberid(){
		return  quotaMemberid;
	}
	/**
	* 会员编号
	*@param  quotaMemberid
	*/
	public void setQuotaMemberid(Integer quotaMemberid ){
		this.quotaMemberid = quotaMemberid;
	}
	
	/**
	* 开始时间
	*@return 
	*/
	public Integer getQuotaStarttime(){
		return  quotaStarttime;
	}
	/**
	* 开始时间
	*@param  quotaStarttime
	*/
	public void setQuotaStarttime(Integer quotaStarttime ){
		this.quotaStarttime = quotaStarttime;
	}
	
	/**
	* 状态(1-可用/2-取消/3-结束)
	*@return 
	*/
	public Integer getQuotaState(){
		return  quotaState;
	}
	/**
	* 状态(1-可用/2-取消/3-结束)
	*@param  quotaState
	*/
	public void setQuotaState(Integer quotaState ){
		this.quotaState = quotaState;
	}
	
	/**
	* 店铺编号
	*@return 
	*/
	public Integer getQuotaStoreid(){
		return  quotaStoreid;
	}
	/**
	* 店铺编号
	*@param  quotaStoreid
	*/
	public void setQuotaStoreid(Integer quotaStoreid ){
		this.quotaStoreid = quotaStoreid;
	}
	
	/**
	* 会员名称
	*@return 
	*/
	public String getQuotaMembername(){
		return  quotaMembername;
	}
	/**
	* 会员名称
	*@param  quotaMembername
	*/
	public void setQuotaMembername(String quotaMembername ){
		this.quotaMembername = quotaMembername;
	}
	
	/**
	* 店铺名称
	*@return 
	*/
	public String getQuotaStorename(){
		return  quotaStorename;
	}
	/**
	* 店铺名称
	*@param  quotaStorename
	*/
	public void setQuotaStorename(String quotaStorename ){
		this.quotaStorename = quotaStorename;
	}
	

}
