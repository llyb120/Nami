package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_delivery_order")
public class RaDeliveryOrder   {
	
	/*
	订单ID
	*/
	private Integer orderId ;
	/*
	订单生成时间
	*/
	private Integer addtime ;
	/*
	订单状态 10(默认)未到站，20已到站，30已提取
	*/
	private Integer dlyoState ;
	/*
	自提点ID
	*/
	private Integer dlypId ;
	/*
	提货码
	*/
	private String dlyoPickupCode ;
	/*
	快递公司编码
	*/
	private String expressCode ;
	/*
	快递公司名称
	*/
	private String expressName ;
	/*
	订单号
	*/
	private Long orderSn ;
	/*
	手机
	*/
	private String reciverMobphone ;
	/*
	收货人
	*/
	private String reciverName ;
	/*
	电话
	*/
	private String reciverTelphone ;
	/*
	物流单号
	*/
	private String shippingCode ;
	
	public RaDeliveryOrder() {
	}
	
	/**
	* 订单ID
	*@return 
	*/
	public Integer getOrderId(){
		return  orderId;
	}
	/**
	* 订单ID
	*@param  orderId
	*/
	public void setOrderId(Integer orderId ){
		this.orderId = orderId;
	}
	
	/**
	* 订单生成时间
	*@return 
	*/
	public Integer getAddtime(){
		return  addtime;
	}
	/**
	* 订单生成时间
	*@param  addtime
	*/
	public void setAddtime(Integer addtime ){
		this.addtime = addtime;
	}
	
	/**
	* 订单状态 10(默认)未到站，20已到站，30已提取
	*@return 
	*/
	public Integer getDlyoState(){
		return  dlyoState;
	}
	/**
	* 订单状态 10(默认)未到站，20已到站，30已提取
	*@param  dlyoState
	*/
	public void setDlyoState(Integer dlyoState ){
		this.dlyoState = dlyoState;
	}
	
	/**
	* 自提点ID
	*@return 
	*/
	public Integer getDlypId(){
		return  dlypId;
	}
	/**
	* 自提点ID
	*@param  dlypId
	*/
	public void setDlypId(Integer dlypId ){
		this.dlypId = dlypId;
	}
	
	/**
	* 提货码
	*@return 
	*/
	public String getDlyoPickupCode(){
		return  dlyoPickupCode;
	}
	/**
	* 提货码
	*@param  dlyoPickupCode
	*/
	public void setDlyoPickupCode(String dlyoPickupCode ){
		this.dlyoPickupCode = dlyoPickupCode;
	}
	
	/**
	* 快递公司编码
	*@return 
	*/
	public String getExpressCode(){
		return  expressCode;
	}
	/**
	* 快递公司编码
	*@param  expressCode
	*/
	public void setExpressCode(String expressCode ){
		this.expressCode = expressCode;
	}
	
	/**
	* 快递公司名称
	*@return 
	*/
	public String getExpressName(){
		return  expressName;
	}
	/**
	* 快递公司名称
	*@param  expressName
	*/
	public void setExpressName(String expressName ){
		this.expressName = expressName;
	}
	
	/**
	* 订单号
	*@return 
	*/
	public Long getOrderSn(){
		return  orderSn;
	}
	/**
	* 订单号
	*@param  orderSn
	*/
	public void setOrderSn(Long orderSn ){
		this.orderSn = orderSn;
	}
	
	/**
	* 手机
	*@return 
	*/
	public String getReciverMobphone(){
		return  reciverMobphone;
	}
	/**
	* 手机
	*@param  reciverMobphone
	*/
	public void setReciverMobphone(String reciverMobphone ){
		this.reciverMobphone = reciverMobphone;
	}
	
	/**
	* 收货人
	*@return 
	*/
	public String getReciverName(){
		return  reciverName;
	}
	/**
	* 收货人
	*@param  reciverName
	*/
	public void setReciverName(String reciverName ){
		this.reciverName = reciverName;
	}
	
	/**
	* 电话
	*@return 
	*/
	public String getReciverTelphone(){
		return  reciverTelphone;
	}
	/**
	* 电话
	*@param  reciverTelphone
	*/
	public void setReciverTelphone(String reciverTelphone ){
		this.reciverTelphone = reciverTelphone;
	}
	
	/**
	* 物流单号
	*@return 
	*/
	public String getShippingCode(){
		return  shippingCode;
	}
	/**
	* 物流单号
	*@param  shippingCode
	*/
	public void setShippingCode(String shippingCode ){
		this.shippingCode = shippingCode;
	}
	

}
