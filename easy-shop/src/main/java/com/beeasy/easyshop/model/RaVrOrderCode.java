package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_vr_order_code")
public class RaVrOrderCode   {
	
	// alias
	public static final String ALIAS_rec_id = "rec_id";
	public static final String ALIAS_buyer_id = "buyer_id";
	public static final String ALIAS_commis_rate = "commis_rate";
	public static final String ALIAS_order_id = "order_id";
	public static final String ALIAS_refund_lock = "refund_lock";
	public static final String ALIAS_store_id = "store_id";
	public static final String ALIAS_vr_indate = "vr_indate";
	public static final String ALIAS_vr_invalid_refund = "vr_invalid_refund";
	public static final String ALIAS_vr_state = "vr_state";
	public static final String ALIAS_vr_usetime = "vr_usetime";
	public static final String ALIAS_pay_price = "pay_price";
	public static final String ALIAS_vr_code = "vr_code";
	
	/*
	兑换码表索引id
	*/
	private Integer rec_id ;
	/*
	买家ID
	*/
	private Integer buyer_id ;
	/*
	佣金比例
	*/
	private Integer commis_rate ;
	/*
	虚拟订单id
	*/
	private Integer order_id ;
	/*
	退款锁定状态:0为正常,1为锁定,2为同意,默认为0
	*/
	private Integer refund_lock ;
	/*
	店铺ID
	*/
	private Integer store_id ;
	/*
	过期时间
	*/
	private Integer vr_indate ;
	/*
	允许过期退款1是0否
	*/
	private Integer vr_invalid_refund ;
	/*
	使用状态 0:(默认)未使用1:已使用2:已过期
	*/
	private Integer vr_state ;
	/*
	使用时间
	*/
	private Integer vr_usetime ;
	/*
	实际支付金额(结算)
	*/
	private BigDecimal pay_price ;
	/*
	兑换码
	*/
	private String vr_code ;
	
	public RaVrOrderCode() {
	}
	
	/**
	* 兑换码表索引id
	*@return 
	*/
	public Integer getRec_id(){
		return  rec_id;
	}
	/**
	* 兑换码表索引id
	*@param  rec_id
	*/
	public void setRec_id(Integer rec_id ){
		this.rec_id = rec_id;
	}
	
	/**
	* 买家ID
	*@return 
	*/
	public Integer getBuyer_id(){
		return  buyer_id;
	}
	/**
	* 买家ID
	*@param  buyer_id
	*/
	public void setBuyer_id(Integer buyer_id ){
		this.buyer_id = buyer_id;
	}
	
	/**
	* 佣金比例
	*@return 
	*/
	public Integer getCommis_rate(){
		return  commis_rate;
	}
	/**
	* 佣金比例
	*@param  commis_rate
	*/
	public void setCommis_rate(Integer commis_rate ){
		this.commis_rate = commis_rate;
	}
	
	/**
	* 虚拟订单id
	*@return 
	*/
	public Integer getOrder_id(){
		return  order_id;
	}
	/**
	* 虚拟订单id
	*@param  order_id
	*/
	public void setOrder_id(Integer order_id ){
		this.order_id = order_id;
	}
	
	/**
	* 退款锁定状态:0为正常,1为锁定,2为同意,默认为0
	*@return 
	*/
	public Integer getRefund_lock(){
		return  refund_lock;
	}
	/**
	* 退款锁定状态:0为正常,1为锁定,2为同意,默认为0
	*@param  refund_lock
	*/
	public void setRefund_lock(Integer refund_lock ){
		this.refund_lock = refund_lock;
	}
	
	/**
	* 店铺ID
	*@return 
	*/
	public Integer getStore_id(){
		return  store_id;
	}
	/**
	* 店铺ID
	*@param  store_id
	*/
	public void setStore_id(Integer store_id ){
		this.store_id = store_id;
	}
	
	/**
	* 过期时间
	*@return 
	*/
	public Integer getVr_indate(){
		return  vr_indate;
	}
	/**
	* 过期时间
	*@param  vr_indate
	*/
	public void setVr_indate(Integer vr_indate ){
		this.vr_indate = vr_indate;
	}
	
	/**
	* 允许过期退款1是0否
	*@return 
	*/
	public Integer getVr_invalid_refund(){
		return  vr_invalid_refund;
	}
	/**
	* 允许过期退款1是0否
	*@param  vr_invalid_refund
	*/
	public void setVr_invalid_refund(Integer vr_invalid_refund ){
		this.vr_invalid_refund = vr_invalid_refund;
	}
	
	/**
	* 使用状态 0:(默认)未使用1:已使用2:已过期
	*@return 
	*/
	public Integer getVr_state(){
		return  vr_state;
	}
	/**
	* 使用状态 0:(默认)未使用1:已使用2:已过期
	*@param  vr_state
	*/
	public void setVr_state(Integer vr_state ){
		this.vr_state = vr_state;
	}
	
	/**
	* 使用时间
	*@return 
	*/
	public Integer getVr_usetime(){
		return  vr_usetime;
	}
	/**
	* 使用时间
	*@param  vr_usetime
	*/
	public void setVr_usetime(Integer vr_usetime ){
		this.vr_usetime = vr_usetime;
	}
	
	/**
	* 实际支付金额(结算)
	*@return 
	*/
	public BigDecimal getPay_price(){
		return  pay_price;
	}
	/**
	* 实际支付金额(结算)
	*@param  pay_price
	*/
	public void setPay_price(BigDecimal pay_price ){
		this.pay_price = pay_price;
	}
	
	/**
	* 兑换码
	*@return 
	*/
	public String getVr_code(){
		return  vr_code;
	}
	/**
	* 兑换码
	*@param  vr_code
	*/
	public void setVr_code(String vr_code ){
		this.vr_code = vr_code;
	}
	

}
