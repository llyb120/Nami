package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_pd_recharge")
public class RaPdRecharge   {
	
	/*
	自增编号
	*/
	private Integer pdrId ;
	/*
	添加时间
	*/
	private Integer pdrAddTime ;
	/*
	会员编号
	*/
	private Integer pdrMemberId ;
	/*
	支付时间
	*/
	private Integer pdrPaymentTime ;
	/*
	管理员名
	*/
	private String pdrAdmin ;
	/*
	充值金额
	*/
	private BigDecimal pdrAmount ;
	/*
	会员名称
	*/
	private String pdrMemberName ;
	/*
	支付方式
	*/
	private String pdrPaymentCode ;
	/*
	支付方式
	*/
	private String pdrPaymentName ;
	/*
	支付状态 0未支付1支付
	*/
	private String pdrPaymentState ;
	/*
	记录唯一标示
	*/
	private Long pdrSn ;
	/*
	第三方支付接口交易号
	*/
	private String pdrTradeSn ;
	
	public RaPdRecharge() {
	}
	
	/**
	* 自增编号
	*@return 
	*/
	public Integer getPdrId(){
		return  pdrId;
	}
	/**
	* 自增编号
	*@param  pdrId
	*/
	public void setPdrId(Integer pdrId ){
		this.pdrId = pdrId;
	}
	
	/**
	* 添加时间
	*@return 
	*/
	public Integer getPdrAddTime(){
		return  pdrAddTime;
	}
	/**
	* 添加时间
	*@param  pdrAddTime
	*/
	public void setPdrAddTime(Integer pdrAddTime ){
		this.pdrAddTime = pdrAddTime;
	}
	
	/**
	* 会员编号
	*@return 
	*/
	public Integer getPdrMemberId(){
		return  pdrMemberId;
	}
	/**
	* 会员编号
	*@param  pdrMemberId
	*/
	public void setPdrMemberId(Integer pdrMemberId ){
		this.pdrMemberId = pdrMemberId;
	}
	
	/**
	* 支付时间
	*@return 
	*/
	public Integer getPdrPaymentTime(){
		return  pdrPaymentTime;
	}
	/**
	* 支付时间
	*@param  pdrPaymentTime
	*/
	public void setPdrPaymentTime(Integer pdrPaymentTime ){
		this.pdrPaymentTime = pdrPaymentTime;
	}
	
	/**
	* 管理员名
	*@return 
	*/
	public String getPdrAdmin(){
		return  pdrAdmin;
	}
	/**
	* 管理员名
	*@param  pdrAdmin
	*/
	public void setPdrAdmin(String pdrAdmin ){
		this.pdrAdmin = pdrAdmin;
	}
	
	/**
	* 充值金额
	*@return 
	*/
	public BigDecimal getPdrAmount(){
		return  pdrAmount;
	}
	/**
	* 充值金额
	*@param  pdrAmount
	*/
	public void setPdrAmount(BigDecimal pdrAmount ){
		this.pdrAmount = pdrAmount;
	}
	
	/**
	* 会员名称
	*@return 
	*/
	public String getPdrMemberName(){
		return  pdrMemberName;
	}
	/**
	* 会员名称
	*@param  pdrMemberName
	*/
	public void setPdrMemberName(String pdrMemberName ){
		this.pdrMemberName = pdrMemberName;
	}
	
	/**
	* 支付方式
	*@return 
	*/
	public String getPdrPaymentCode(){
		return  pdrPaymentCode;
	}
	/**
	* 支付方式
	*@param  pdrPaymentCode
	*/
	public void setPdrPaymentCode(String pdrPaymentCode ){
		this.pdrPaymentCode = pdrPaymentCode;
	}
	
	/**
	* 支付方式
	*@return 
	*/
	public String getPdrPaymentName(){
		return  pdrPaymentName;
	}
	/**
	* 支付方式
	*@param  pdrPaymentName
	*/
	public void setPdrPaymentName(String pdrPaymentName ){
		this.pdrPaymentName = pdrPaymentName;
	}
	
	/**
	* 支付状态 0未支付1支付
	*@return 
	*/
	public String getPdrPaymentState(){
		return  pdrPaymentState;
	}
	/**
	* 支付状态 0未支付1支付
	*@param  pdrPaymentState
	*/
	public void setPdrPaymentState(String pdrPaymentState ){
		this.pdrPaymentState = pdrPaymentState;
	}
	
	/**
	* 记录唯一标示
	*@return 
	*/
	public Long getPdrSn(){
		return  pdrSn;
	}
	/**
	* 记录唯一标示
	*@param  pdrSn
	*/
	public void setPdrSn(Long pdrSn ){
		this.pdrSn = pdrSn;
	}
	
	/**
	* 第三方支付接口交易号
	*@return 
	*/
	public String getPdrTradeSn(){
		return  pdrTradeSn;
	}
	/**
	* 第三方支付接口交易号
	*@param  pdrTradeSn
	*/
	public void setPdrTradeSn(String pdrTradeSn ){
		this.pdrTradeSn = pdrTradeSn;
	}
	

}
