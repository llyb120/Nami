package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_voucher")
public class RaVoucher   {
	
	/*
	代金券编号
	*/
	private Integer voucherId ;
	/*
	代金券发放日期
	*/
	private Integer voucherActiveDate ;
	/*
	代金券有效期结束时间
	*/
	private Integer voucherEndDate ;
	/*
	使用该代金券的订单编号
	*/
	private Integer voucherOrderId ;
	/*
	代金券所有者id
	*/
	private Integer voucherOwnerId ;
	/*
	代金券面额
	*/
	private Integer voucherPrice ;
	/*
	代金券有效期开始时间
	*/
	private Integer voucherStartDate ;
	/*
	代金券状态(1-未用,2-已用,3-过期,4-收回)
	*/
	private Integer voucherState ;
	/*
	代金券的店铺id
	*/
	private Integer voucherStoreId ;
	/*
	代金券模版编号
	*/
	private Integer voucherTId ;
	/*
	代金券类别
	*/
	private Integer voucherType ;
	/*
	代金券编码
	*/
	private String voucherCode ;
	/*
	代金券描述
	*/
	private String voucherDesc ;
	/*
	代金券使用时的订单限额
	*/
	private BigDecimal voucherLimit ;
	/*
	代金券所有者名称
	*/
	private String voucherOwnerName ;
	/*
	代金券标题
	*/
	private String voucherTitle ;
	
	public RaVoucher() {
	}
	
	/**
	* 代金券编号
	*@return 
	*/
	public Integer getVoucherId(){
		return  voucherId;
	}
	/**
	* 代金券编号
	*@param  voucherId
	*/
	public void setVoucherId(Integer voucherId ){
		this.voucherId = voucherId;
	}
	
	/**
	* 代金券发放日期
	*@return 
	*/
	public Integer getVoucherActiveDate(){
		return  voucherActiveDate;
	}
	/**
	* 代金券发放日期
	*@param  voucherActiveDate
	*/
	public void setVoucherActiveDate(Integer voucherActiveDate ){
		this.voucherActiveDate = voucherActiveDate;
	}
	
	/**
	* 代金券有效期结束时间
	*@return 
	*/
	public Integer getVoucherEndDate(){
		return  voucherEndDate;
	}
	/**
	* 代金券有效期结束时间
	*@param  voucherEndDate
	*/
	public void setVoucherEndDate(Integer voucherEndDate ){
		this.voucherEndDate = voucherEndDate;
	}
	
	/**
	* 使用该代金券的订单编号
	*@return 
	*/
	public Integer getVoucherOrderId(){
		return  voucherOrderId;
	}
	/**
	* 使用该代金券的订单编号
	*@param  voucherOrderId
	*/
	public void setVoucherOrderId(Integer voucherOrderId ){
		this.voucherOrderId = voucherOrderId;
	}
	
	/**
	* 代金券所有者id
	*@return 
	*/
	public Integer getVoucherOwnerId(){
		return  voucherOwnerId;
	}
	/**
	* 代金券所有者id
	*@param  voucherOwnerId
	*/
	public void setVoucherOwnerId(Integer voucherOwnerId ){
		this.voucherOwnerId = voucherOwnerId;
	}
	
	/**
	* 代金券面额
	*@return 
	*/
	public Integer getVoucherPrice(){
		return  voucherPrice;
	}
	/**
	* 代金券面额
	*@param  voucherPrice
	*/
	public void setVoucherPrice(Integer voucherPrice ){
		this.voucherPrice = voucherPrice;
	}
	
	/**
	* 代金券有效期开始时间
	*@return 
	*/
	public Integer getVoucherStartDate(){
		return  voucherStartDate;
	}
	/**
	* 代金券有效期开始时间
	*@param  voucherStartDate
	*/
	public void setVoucherStartDate(Integer voucherStartDate ){
		this.voucherStartDate = voucherStartDate;
	}
	
	/**
	* 代金券状态(1-未用,2-已用,3-过期,4-收回)
	*@return 
	*/
	public Integer getVoucherState(){
		return  voucherState;
	}
	/**
	* 代金券状态(1-未用,2-已用,3-过期,4-收回)
	*@param  voucherState
	*/
	public void setVoucherState(Integer voucherState ){
		this.voucherState = voucherState;
	}
	
	/**
	* 代金券的店铺id
	*@return 
	*/
	public Integer getVoucherStoreId(){
		return  voucherStoreId;
	}
	/**
	* 代金券的店铺id
	*@param  voucherStoreId
	*/
	public void setVoucherStoreId(Integer voucherStoreId ){
		this.voucherStoreId = voucherStoreId;
	}
	
	/**
	* 代金券模版编号
	*@return 
	*/
	public Integer getVoucherTId(){
		return  voucherTId;
	}
	/**
	* 代金券模版编号
	*@param  voucherTId
	*/
	public void setVoucherTId(Integer voucherTId ){
		this.voucherTId = voucherTId;
	}
	
	/**
	* 代金券类别
	*@return 
	*/
	public Integer getVoucherType(){
		return  voucherType;
	}
	/**
	* 代金券类别
	*@param  voucherType
	*/
	public void setVoucherType(Integer voucherType ){
		this.voucherType = voucherType;
	}
	
	/**
	* 代金券编码
	*@return 
	*/
	public String getVoucherCode(){
		return  voucherCode;
	}
	/**
	* 代金券编码
	*@param  voucherCode
	*/
	public void setVoucherCode(String voucherCode ){
		this.voucherCode = voucherCode;
	}
	
	/**
	* 代金券描述
	*@return 
	*/
	public String getVoucherDesc(){
		return  voucherDesc;
	}
	/**
	* 代金券描述
	*@param  voucherDesc
	*/
	public void setVoucherDesc(String voucherDesc ){
		this.voucherDesc = voucherDesc;
	}
	
	/**
	* 代金券使用时的订单限额
	*@return 
	*/
	public BigDecimal getVoucherLimit(){
		return  voucherLimit;
	}
	/**
	* 代金券使用时的订单限额
	*@param  voucherLimit
	*/
	public void setVoucherLimit(BigDecimal voucherLimit ){
		this.voucherLimit = voucherLimit;
	}
	
	/**
	* 代金券所有者名称
	*@return 
	*/
	public String getVoucherOwnerName(){
		return  voucherOwnerName;
	}
	/**
	* 代金券所有者名称
	*@param  voucherOwnerName
	*/
	public void setVoucherOwnerName(String voucherOwnerName ){
		this.voucherOwnerName = voucherOwnerName;
	}
	
	/**
	* 代金券标题
	*@return 
	*/
	public String getVoucherTitle(){
		return  voucherTitle;
	}
	/**
	* 代金券标题
	*@param  voucherTitle
	*/
	public void setVoucherTitle(String voucherTitle ){
		this.voucherTitle = voucherTitle;
	}
	

}
