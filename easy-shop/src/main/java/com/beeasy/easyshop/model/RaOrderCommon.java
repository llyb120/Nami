package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_order_common")
public class RaOrderCommon   {
	
	/*
	订单索引id
	*/
	private Integer orderId ;
	/*
	发货地址ID
	*/
	private Integer daddressId ;
	/*
	卖家评价买家的时间
	*/
	private Integer evalsellerTime ;
	/*
	评价时间
	*/
	private Integer evaluationTime ;
	/*
	订单赠送积分
	*/
	private Integer orderPointscount ;
	private Integer reciverAreaId ;
	/*
	收货人市级ID
	*/
	private Integer reciverCityId ;
	/*
	收货人省级ID
	*/
	private Integer reciverProvinceId ;
	/*
	配送公司ID
	*/
	private Integer shippingExpressId ;
	/*
	配送时间
	*/
	private Integer shippingTime ;
	/*
	店铺ID
	*/
	private Integer storeId ;
	/*
	代金券面额
	*/
	private Integer voucherPrice ;
	private String address ;
	/*
	发货备注
	*/
	private String deliverExplain ;
	/*
	提货码
	*/
	private String dlyoPickupCode ;
	/*
	卖家是否已评价买家
	*/
	private String evalsellerState ;
	private String idcard ;
	/*
	发票信息
	*/
	private String invoiceInfo ;
	/*
	订单留言
	*/
	private String orderMessage ;
	private String phone ;
	/*
	促销信息备注
	*/
	private String promotionInfo ;
	/*
	收货人其它信息
	*/
	private String reciverInfo ;
	/*
	收货人姓名
	*/
	private String reciverName ;
	/*
	代金券编码
	*/
	private String voucherCode ;
	
	public RaOrderCommon() {
	}
	
	/**
	* 订单索引id
	*@return 
	*/
	public Integer getOrderId(){
		return  orderId;
	}
	/**
	* 订单索引id
	*@param  orderId
	*/
	public void setOrderId(Integer orderId ){
		this.orderId = orderId;
	}
	
	/**
	* 发货地址ID
	*@return 
	*/
	public Integer getDaddressId(){
		return  daddressId;
	}
	/**
	* 发货地址ID
	*@param  daddressId
	*/
	public void setDaddressId(Integer daddressId ){
		this.daddressId = daddressId;
	}
	
	/**
	* 卖家评价买家的时间
	*@return 
	*/
	public Integer getEvalsellerTime(){
		return  evalsellerTime;
	}
	/**
	* 卖家评价买家的时间
	*@param  evalsellerTime
	*/
	public void setEvalsellerTime(Integer evalsellerTime ){
		this.evalsellerTime = evalsellerTime;
	}
	
	/**
	* 评价时间
	*@return 
	*/
	public Integer getEvaluationTime(){
		return  evaluationTime;
	}
	/**
	* 评价时间
	*@param  evaluationTime
	*/
	public void setEvaluationTime(Integer evaluationTime ){
		this.evaluationTime = evaluationTime;
	}
	
	/**
	* 订单赠送积分
	*@return 
	*/
	public Integer getOrderPointscount(){
		return  orderPointscount;
	}
	/**
	* 订单赠送积分
	*@param  orderPointscount
	*/
	public void setOrderPointscount(Integer orderPointscount ){
		this.orderPointscount = orderPointscount;
	}
	
	public Integer getReciverAreaId(){
		return  reciverAreaId;
	}
	public void setReciverAreaId(Integer reciverAreaId ){
		this.reciverAreaId = reciverAreaId;
	}
	
	/**
	* 收货人市级ID
	*@return 
	*/
	public Integer getReciverCityId(){
		return  reciverCityId;
	}
	/**
	* 收货人市级ID
	*@param  reciverCityId
	*/
	public void setReciverCityId(Integer reciverCityId ){
		this.reciverCityId = reciverCityId;
	}
	
	/**
	* 收货人省级ID
	*@return 
	*/
	public Integer getReciverProvinceId(){
		return  reciverProvinceId;
	}
	/**
	* 收货人省级ID
	*@param  reciverProvinceId
	*/
	public void setReciverProvinceId(Integer reciverProvinceId ){
		this.reciverProvinceId = reciverProvinceId;
	}
	
	/**
	* 配送公司ID
	*@return 
	*/
	public Integer getShippingExpressId(){
		return  shippingExpressId;
	}
	/**
	* 配送公司ID
	*@param  shippingExpressId
	*/
	public void setShippingExpressId(Integer shippingExpressId ){
		this.shippingExpressId = shippingExpressId;
	}
	
	/**
	* 配送时间
	*@return 
	*/
	public Integer getShippingTime(){
		return  shippingTime;
	}
	/**
	* 配送时间
	*@param  shippingTime
	*/
	public void setShippingTime(Integer shippingTime ){
		this.shippingTime = shippingTime;
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
	
	public String getAddress(){
		return  address;
	}
	public void setAddress(String address ){
		this.address = address;
	}
	
	/**
	* 发货备注
	*@return 
	*/
	public String getDeliverExplain(){
		return  deliverExplain;
	}
	/**
	* 发货备注
	*@param  deliverExplain
	*/
	public void setDeliverExplain(String deliverExplain ){
		this.deliverExplain = deliverExplain;
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
	* 卖家是否已评价买家
	*@return 
	*/
	public String getEvalsellerState(){
		return  evalsellerState;
	}
	/**
	* 卖家是否已评价买家
	*@param  evalsellerState
	*/
	public void setEvalsellerState(String evalsellerState ){
		this.evalsellerState = evalsellerState;
	}
	
	public String getIdcard(){
		return  idcard;
	}
	public void setIdcard(String idcard ){
		this.idcard = idcard;
	}
	
	/**
	* 发票信息
	*@return 
	*/
	public String getInvoiceInfo(){
		return  invoiceInfo;
	}
	/**
	* 发票信息
	*@param  invoiceInfo
	*/
	public void setInvoiceInfo(String invoiceInfo ){
		this.invoiceInfo = invoiceInfo;
	}
	
	/**
	* 订单留言
	*@return 
	*/
	public String getOrderMessage(){
		return  orderMessage;
	}
	/**
	* 订单留言
	*@param  orderMessage
	*/
	public void setOrderMessage(String orderMessage ){
		this.orderMessage = orderMessage;
	}
	
	public String getPhone(){
		return  phone;
	}
	public void setPhone(String phone ){
		this.phone = phone;
	}
	
	/**
	* 促销信息备注
	*@return 
	*/
	public String getPromotionInfo(){
		return  promotionInfo;
	}
	/**
	* 促销信息备注
	*@param  promotionInfo
	*/
	public void setPromotionInfo(String promotionInfo ){
		this.promotionInfo = promotionInfo;
	}
	
	/**
	* 收货人其它信息
	*@return 
	*/
	public String getReciverInfo(){
		return  reciverInfo;
	}
	/**
	* 收货人其它信息
	*@param  reciverInfo
	*/
	public void setReciverInfo(String reciverInfo ){
		this.reciverInfo = reciverInfo;
	}
	
	/**
	* 收货人姓名
	*@return 
	*/
	public String getReciverName(){
		return  reciverName;
	}
	/**
	* 收货人姓名
	*@param  reciverName
	*/
	public void setReciverName(String reciverName ){
		this.reciverName = reciverName;
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
	

}
