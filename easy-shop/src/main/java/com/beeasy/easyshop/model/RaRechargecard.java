package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_rechargecard")
public class RaRechargecard   {
	
	// alias
	public static final String ALIAS_id = "id";
	public static final String ALIAS_member_id = "member_id";
	public static final String ALIAS_state = "state";
	public static final String ALIAS_tscreated = "tscreated";
	public static final String ALIAS_tsused = "tsused";
	public static final String ALIAS_admin_name = "admin_name";
	public static final String ALIAS_batchflag = "batchflag";
	public static final String ALIAS_denomination = "denomination";
	public static final String ALIAS_member_name = "member_name";
	public static final String ALIAS_sn = "sn";
	
	/*
	自增ID
	*/
	private Integer id ;
	/*
	使用者会员ID
	*/
	private Integer member_id ;
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
	private String admin_name ;
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
	private String member_name ;
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
	public Integer getMember_id(){
		return  member_id;
	}
	/**
	* 使用者会员ID
	*@param  member_id
	*/
	public void setMember_id(Integer member_id ){
		this.member_id = member_id;
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
	public String getAdmin_name(){
		return  admin_name;
	}
	/**
	* 创建者名称
	*@param  admin_name
	*/
	public void setAdmin_name(String admin_name ){
		this.admin_name = admin_name;
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
	public String getMember_name(){
		return  member_name;
	}
	/**
	* 使用者会员名称
	*@param  member_name
	*/
	public void setMember_name(String member_name ){
		this.member_name = member_name;
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
