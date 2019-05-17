package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_pd_cash")
public class RaPdCash   {
	
	/*
	自增编号
	*/
	private Integer pdcId ;
	/*
	添加时间
	*/
	private Integer pdcAddTime ;
	/*
	会员编号
	*/
	private Integer pdcMemberId ;
	/*
	付款时间
	*/
	private Integer pdcPaymentTime ;
	/*
	金额
	*/
	private BigDecimal pdcAmount ;
	/*
	收款银行
	*/
	private String pdcBankName ;
	/*
	收款账号
	*/
	private String pdcBankNo ;
	/*
	开户人姓名
	*/
	private String pdcBankUser ;
	/*
	会员名称
	*/
	private String pdcMemberName ;
	/*
	支付管理员
	*/
	private String pdcPaymentAdmin ;
	/*
	提现支付状态 0默认1支付完成
	*/
	private String pdcPaymentState ;
	/*
	记录唯一标示
	*/
	private Long pdcSn ;
	
	public RaPdCash() {
	}
	
	/**
	* 自增编号
	*@return 
	*/
	public Integer getPdcId(){
		return  pdcId;
	}
	/**
	* 自增编号
	*@param  pdcId
	*/
	public void setPdcId(Integer pdcId ){
		this.pdcId = pdcId;
	}
	
	/**
	* 添加时间
	*@return 
	*/
	public Integer getPdcAddTime(){
		return  pdcAddTime;
	}
	/**
	* 添加时间
	*@param  pdcAddTime
	*/
	public void setPdcAddTime(Integer pdcAddTime ){
		this.pdcAddTime = pdcAddTime;
	}
	
	/**
	* 会员编号
	*@return 
	*/
	public Integer getPdcMemberId(){
		return  pdcMemberId;
	}
	/**
	* 会员编号
	*@param  pdcMemberId
	*/
	public void setPdcMemberId(Integer pdcMemberId ){
		this.pdcMemberId = pdcMemberId;
	}
	
	/**
	* 付款时间
	*@return 
	*/
	public Integer getPdcPaymentTime(){
		return  pdcPaymentTime;
	}
	/**
	* 付款时间
	*@param  pdcPaymentTime
	*/
	public void setPdcPaymentTime(Integer pdcPaymentTime ){
		this.pdcPaymentTime = pdcPaymentTime;
	}
	
	/**
	* 金额
	*@return 
	*/
	public BigDecimal getPdcAmount(){
		return  pdcAmount;
	}
	/**
	* 金额
	*@param  pdcAmount
	*/
	public void setPdcAmount(BigDecimal pdcAmount ){
		this.pdcAmount = pdcAmount;
	}
	
	/**
	* 收款银行
	*@return 
	*/
	public String getPdcBankName(){
		return  pdcBankName;
	}
	/**
	* 收款银行
	*@param  pdcBankName
	*/
	public void setPdcBankName(String pdcBankName ){
		this.pdcBankName = pdcBankName;
	}
	
	/**
	* 收款账号
	*@return 
	*/
	public String getPdcBankNo(){
		return  pdcBankNo;
	}
	/**
	* 收款账号
	*@param  pdcBankNo
	*/
	public void setPdcBankNo(String pdcBankNo ){
		this.pdcBankNo = pdcBankNo;
	}
	
	/**
	* 开户人姓名
	*@return 
	*/
	public String getPdcBankUser(){
		return  pdcBankUser;
	}
	/**
	* 开户人姓名
	*@param  pdcBankUser
	*/
	public void setPdcBankUser(String pdcBankUser ){
		this.pdcBankUser = pdcBankUser;
	}
	
	/**
	* 会员名称
	*@return 
	*/
	public String getPdcMemberName(){
		return  pdcMemberName;
	}
	/**
	* 会员名称
	*@param  pdcMemberName
	*/
	public void setPdcMemberName(String pdcMemberName ){
		this.pdcMemberName = pdcMemberName;
	}
	
	/**
	* 支付管理员
	*@return 
	*/
	public String getPdcPaymentAdmin(){
		return  pdcPaymentAdmin;
	}
	/**
	* 支付管理员
	*@param  pdcPaymentAdmin
	*/
	public void setPdcPaymentAdmin(String pdcPaymentAdmin ){
		this.pdcPaymentAdmin = pdcPaymentAdmin;
	}
	
	/**
	* 提现支付状态 0默认1支付完成
	*@return 
	*/
	public String getPdcPaymentState(){
		return  pdcPaymentState;
	}
	/**
	* 提现支付状态 0默认1支付完成
	*@param  pdcPaymentState
	*/
	public void setPdcPaymentState(String pdcPaymentState ){
		this.pdcPaymentState = pdcPaymentState;
	}
	
	/**
	* 记录唯一标示
	*@return 
	*/
	public Long getPdcSn(){
		return  pdcSn;
	}
	/**
	* 记录唯一标示
	*@param  pdcSn
	*/
	public void setPdcSn(Long pdcSn ){
		this.pdcSn = pdcSn;
	}
	

}
