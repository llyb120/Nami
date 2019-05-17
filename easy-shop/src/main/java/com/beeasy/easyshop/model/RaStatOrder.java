package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_stat_order")
public class RaStatOrder   {
	
	/*
	买家ID
	*/
	private Integer buyerId ;
	/*
	店铺等级
	*/
	private Integer gradeId ;
	/*
	订单生成时间
	*/
	private Integer orderAddTime ;
	/*
	订单id
	*/
	private Integer orderId ;
	/*
	是否为计入统计的有效订单，0为无效 1为有效
	*/
	private Integer orderIsvalid ;
	/*
	收货人省级ID
	*/
	private Integer reciverProvinceId ;
	/*
	退款状态:0是无退款,1是部分退款,2是全部退款
	*/
	private Integer refundState ;
	/*
	店铺分类
	*/
	private Integer scId ;
	/*
	店铺ID
	*/
	private Integer storeId ;
	/*
	买家姓名
	*/
	private String buyerName ;
	/*
	评价状态 0未评价，1已评价
	*/
	private String evaluationState ;
	/*
	订单总价格
	*/
	private BigDecimal orderAmount ;
	/*
	1WEB2mobile
	*/
	private String orderFrom ;
	/*
	订单编号
	*/
	private Long orderSn ;
	/*
	订单状态：0(已取消)10(默认):未付款;20:已付款;30:已发货;40:已收货;
	*/
	private String orderState ;
	/*
	支付方式
	*/
	private String paymentCode ;
	/*
	退款金额
	*/
	private BigDecimal refundAmount ;
	/*
	运费
	*/
	private BigDecimal shippingFee ;
	/*
	卖家店铺名称
	*/
	private String storeName ;
	
	public RaStatOrder() {
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
	* 店铺等级
	*@return 
	*/
	public Integer getGradeId(){
		return  gradeId;
	}
	/**
	* 店铺等级
	*@param  gradeId
	*/
	public void setGradeId(Integer gradeId ){
		this.gradeId = gradeId;
	}
	
	/**
	* 订单生成时间
	*@return 
	*/
	public Integer getOrderAddTime(){
		return  orderAddTime;
	}
	/**
	* 订单生成时间
	*@param  orderAddTime
	*/
	public void setOrderAddTime(Integer orderAddTime ){
		this.orderAddTime = orderAddTime;
	}
	
	/**
	* 订单id
	*@return 
	*/
	public Integer getOrderId(){
		return  orderId;
	}
	/**
	* 订单id
	*@param  orderId
	*/
	public void setOrderId(Integer orderId ){
		this.orderId = orderId;
	}
	
	/**
	* 是否为计入统计的有效订单，0为无效 1为有效
	*@return 
	*/
	public Integer getOrderIsvalid(){
		return  orderIsvalid;
	}
	/**
	* 是否为计入统计的有效订单，0为无效 1为有效
	*@param  orderIsvalid
	*/
	public void setOrderIsvalid(Integer orderIsvalid ){
		this.orderIsvalid = orderIsvalid;
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
	* 退款状态:0是无退款,1是部分退款,2是全部退款
	*@return 
	*/
	public Integer getRefundState(){
		return  refundState;
	}
	/**
	* 退款状态:0是无退款,1是部分退款,2是全部退款
	*@param  refundState
	*/
	public void setRefundState(Integer refundState ){
		this.refundState = refundState;
	}
	
	/**
	* 店铺分类
	*@return 
	*/
	public Integer getScId(){
		return  scId;
	}
	/**
	* 店铺分类
	*@param  scId
	*/
	public void setScId(Integer scId ){
		this.scId = scId;
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
	* 买家姓名
	*@return 
	*/
	public String getBuyerName(){
		return  buyerName;
	}
	/**
	* 买家姓名
	*@param  buyerName
	*/
	public void setBuyerName(String buyerName ){
		this.buyerName = buyerName;
	}
	
	/**
	* 评价状态 0未评价，1已评价
	*@return 
	*/
	public String getEvaluationState(){
		return  evaluationState;
	}
	/**
	* 评价状态 0未评价，1已评价
	*@param  evaluationState
	*/
	public void setEvaluationState(String evaluationState ){
		this.evaluationState = evaluationState;
	}
	
	/**
	* 订单总价格
	*@return 
	*/
	public BigDecimal getOrderAmount(){
		return  orderAmount;
	}
	/**
	* 订单总价格
	*@param  orderAmount
	*/
	public void setOrderAmount(BigDecimal orderAmount ){
		this.orderAmount = orderAmount;
	}
	
	/**
	* 1WEB2mobile
	*@return 
	*/
	public String getOrderFrom(){
		return  orderFrom;
	}
	/**
	* 1WEB2mobile
	*@param  orderFrom
	*/
	public void setOrderFrom(String orderFrom ){
		this.orderFrom = orderFrom;
	}
	
	/**
	* 订单编号
	*@return 
	*/
	public Long getOrderSn(){
		return  orderSn;
	}
	/**
	* 订单编号
	*@param  orderSn
	*/
	public void setOrderSn(Long orderSn ){
		this.orderSn = orderSn;
	}
	
	/**
	* 订单状态：0(已取消)10(默认):未付款;20:已付款;30:已发货;40:已收货;
	*@return 
	*/
	public String getOrderState(){
		return  orderState;
	}
	/**
	* 订单状态：0(已取消)10(默认):未付款;20:已付款;30:已发货;40:已收货;
	*@param  orderState
	*/
	public void setOrderState(String orderState ){
		this.orderState = orderState;
	}
	
	/**
	* 支付方式
	*@return 
	*/
	public String getPaymentCode(){
		return  paymentCode;
	}
	/**
	* 支付方式
	*@param  paymentCode
	*/
	public void setPaymentCode(String paymentCode ){
		this.paymentCode = paymentCode;
	}
	
	/**
	* 退款金额
	*@return 
	*/
	public BigDecimal getRefundAmount(){
		return  refundAmount;
	}
	/**
	* 退款金额
	*@param  refundAmount
	*/
	public void setRefundAmount(BigDecimal refundAmount ){
		this.refundAmount = refundAmount;
	}
	
	/**
	* 运费
	*@return 
	*/
	public BigDecimal getShippingFee(){
		return  shippingFee;
	}
	/**
	* 运费
	*@param  shippingFee
	*/
	public void setShippingFee(BigDecimal shippingFee ){
		this.shippingFee = shippingFee;
	}
	
	/**
	* 卖家店铺名称
	*@return 
	*/
	public String getStoreName(){
		return  storeName;
	}
	/**
	* 卖家店铺名称
	*@param  storeName
	*/
	public void setStoreName(String storeName ){
		this.storeName = storeName;
	}
	

}
