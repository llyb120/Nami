package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_vr_order_code")
public class RaVrOrderCode   {
	
	/*
	兑换码表索引id
	*/
	private Integer recId ;
	/*
	买家ID
	*/
	private Integer buyerId ;
	/*
	佣金比例
	*/
	private Integer commisRate ;
	/*
	虚拟订单id
	*/
	private Integer orderId ;
	/*
	退款锁定状态:0为正常,1为锁定,2为同意,默认为0
	*/
	private Integer refundLock ;
	/*
	店铺ID
	*/
	private Integer storeId ;
	/*
	过期时间
	*/
	private Integer vrIndate ;
	/*
	允许过期退款1是0否
	*/
	private Integer vrInvalidRefund ;
	/*
	使用状态 0:(默认)未使用1:已使用2:已过期
	*/
	private Integer vrState ;
	/*
	使用时间
	*/
	private Integer vrUsetime ;
	/*
	实际支付金额(结算)
	*/
	private BigDecimal payPrice ;
	/*
	兑换码
	*/
	private String vrCode ;
	
	public RaVrOrderCode() {
	}
	
	/**
	* 兑换码表索引id
	*@return 
	*/
	public Integer getRecId(){
		return  recId;
	}
	/**
	* 兑换码表索引id
	*@param  recId
	*/
	public void setRecId(Integer recId ){
		this.recId = recId;
	}
	
	/**
	* 买家ID
	*@return 
	*/
	public Integer getBuyerId(){
		return  buyerId;
	}
	/**
	* 买家ID
	*@param  buyerId
	*/
	public void setBuyerId(Integer buyerId ){
		this.buyerId = buyerId;
	}
	
	/**
	* 佣金比例
	*@return 
	*/
	public Integer getCommisRate(){
		return  commisRate;
	}
	/**
	* 佣金比例
	*@param  commisRate
	*/
	public void setCommisRate(Integer commisRate ){
		this.commisRate = commisRate;
	}
	
	/**
	* 虚拟订单id
	*@return 
	*/
	public Integer getOrderId(){
		return  orderId;
	}
	/**
	* 虚拟订单id
	*@param  orderId
	*/
	public void setOrderId(Integer orderId ){
		this.orderId = orderId;
	}
	
	/**
	* 退款锁定状态:0为正常,1为锁定,2为同意,默认为0
	*@return 
	*/
	public Integer getRefundLock(){
		return  refundLock;
	}
	/**
	* 退款锁定状态:0为正常,1为锁定,2为同意,默认为0
	*@param  refundLock
	*/
	public void setRefundLock(Integer refundLock ){
		this.refundLock = refundLock;
	}
	
	/**
	* 店铺ID
	*@return 
	*/
	public Integer getStoreId(){
		return  storeId;
	}
	/**
	* 店铺ID
	*@param  storeId
	*/
	public void setStoreId(Integer storeId ){
		this.storeId = storeId;
	}
	
	/**
	* 过期时间
	*@return 
	*/
	public Integer getVrIndate(){
		return  vrIndate;
	}
	/**
	* 过期时间
	*@param  vrIndate
	*/
	public void setVrIndate(Integer vrIndate ){
		this.vrIndate = vrIndate;
	}
	
	/**
	* 允许过期退款1是0否
	*@return 
	*/
	public Integer getVrInvalidRefund(){
		return  vrInvalidRefund;
	}
	/**
	* 允许过期退款1是0否
	*@param  vrInvalidRefund
	*/
	public void setVrInvalidRefund(Integer vrInvalidRefund ){
		this.vrInvalidRefund = vrInvalidRefund;
	}
	
	/**
	* 使用状态 0:(默认)未使用1:已使用2:已过期
	*@return 
	*/
	public Integer getVrState(){
		return  vrState;
	}
	/**
	* 使用状态 0:(默认)未使用1:已使用2:已过期
	*@param  vrState
	*/
	public void setVrState(Integer vrState ){
		this.vrState = vrState;
	}
	
	/**
	* 使用时间
	*@return 
	*/
	public Integer getVrUsetime(){
		return  vrUsetime;
	}
	/**
	* 使用时间
	*@param  vrUsetime
	*/
	public void setVrUsetime(Integer vrUsetime ){
		this.vrUsetime = vrUsetime;
	}
	
	/**
	* 实际支付金额(结算)
	*@return 
	*/
	public BigDecimal getPayPrice(){
		return  payPrice;
	}
	/**
	* 实际支付金额(结算)
	*@param  payPrice
	*/
	public void setPayPrice(BigDecimal payPrice ){
		this.payPrice = payPrice;
	}
	
	/**
	* 兑换码
	*@return 
	*/
	public String getVrCode(){
		return  vrCode;
	}
	/**
	* 兑换码
	*@param  vrCode
	*/
	public void setVrCode(String vrCode ){
		this.vrCode = vrCode;
	}
	

}
