package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_rechargecard")
public class RaRechargecard   {
	
	/*
	自增ID
	*/
	private Integer id ;
	/*
	使用者会员ID
	*/
	private Integer memberId ;
	/*
	状态 0可用 1已用 2已删
	*/
	private Integer state ;
	/*
	创建时间
	*/
	private Integer tscreated ;
	/*
	使用时间
	*/
	private Integer tsused ;
	/*
	创建者名称
	*/
	private String adminName ;
	/*
	批次标识
	*/
	private String batchflag ;
	/*
	面额
	*/
	private BigDecimal denomination ;
	/*
	使用者会员名称
	*/
	private String memberName ;
	/*
	卡号
	*/
	private String sn ;
	
	public RaRechargecard() {
	}
	
	/**
	* 自增ID
	*@return 
	*/
	public Integer getId(){
		return  id;
	}
	/**
	* 自增ID
	*@param  id
	*/
	public void setId(Integer id ){
		this.id = id;
	}
	
	/**
	* 使用者会员ID
	*@return 
	*/
	public Integer getMemberId(){
		return  memberId;
	}
	/**
	* 使用者会员ID
	*@param  memberId
	*/
	public void setMemberId(Integer memberId ){
		this.memberId = memberId;
	}
	
	/**
	* 状态 0可用 1已用 2已删
	*@return 
	*/
	public Integer getState(){
		return  state;
	}
	/**
	* 状态 0可用 1已用 2已删
	*@param  state
	*/
	public void setState(Integer state ){
		this.state = state;
	}
	
	/**
	* 创建时间
	*@return 
	*/
	public Integer getTscreated(){
		return  tscreated;
	}
	/**
	* 创建时间
	*@param  tscreated
	*/
	public void setTscreated(Integer tscreated ){
		this.tscreated = tscreated;
	}
	
	/**
	* 使用时间
	*@return 
	*/
	public Integer getTsused(){
		return  tsused;
	}
	/**
	* 使用时间
	*@param  tsused
	*/
	public void setTsused(Integer tsused ){
		this.tsused = tsused;
	}
	
	/**
	* 创建者名称
	*@return 
	*/
	public String getAdminName(){
		return  adminName;
	}
	/**
	* 创建者名称
	*@param  adminName
	*/
	public void setAdminName(String adminName ){
		this.adminName = adminName;
	}
	
	/**
	* 批次标识
	*@return 
	*/
	public String getBatchflag(){
		return  batchflag;
	}
	/**
	* 批次标识
	*@param  batchflag
	*/
	public void setBatchflag(String batchflag ){
		this.batchflag = batchflag;
	}
	
	/**
	* 面额
	*@return 
	*/
	public BigDecimal getDenomination(){
		return  denomination;
	}
	/**
	* 面额
	*@param  denomination
	*/
	public void setDenomination(BigDecimal denomination ){
		this.denomination = denomination;
	}
	
	/**
	* 使用者会员名称
	*@return 
	*/
	public String getMemberName(){
		return  memberName;
	}
	/**
	* 使用者会员名称
	*@param  memberName
	*/
	public void setMemberName(String memberName ){
		this.memberName = memberName;
	}
	
	/**
	* 卡号
	*@return 
	*/
	public String getSn(){
		return  sn;
	}
	/**
	* 卡号
	*@param  sn
	*/
	public void setSn(String sn ){
		this.sn = sn;
	}
	

}
