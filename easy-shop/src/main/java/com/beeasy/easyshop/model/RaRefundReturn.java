package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_refund_return")
public class RaRefundReturn   {
	
	/*
	记录ID
	*/
	private Integer refundId ;
	/*
	添加时间
	*/
	private Integer addTime ;
	/*
	管理员处理时间,默认为0
	*/
	private Integer adminTime ;
	/*
	买家ID
	*/
	private Integer buyerId ;
	/*
	佣金比例
	*/
	private Integer commisRate ;
	private Integer daddressId ;
	/*
	收货延迟时间,默认为0
	*/
	private Integer delayTime ;
	/*
	物流公司编号
	*/
	private Integer expressId ;
	/*
	商品ID,全部退款是0
	*/
	private Integer goodsId ;
	/*
	商品数量
	*/
	private Integer goodsNum ;
	/*
	物流状态:1为待发货,2为待收货,3为未收到,4为已收货,默认为1
	*/
	private Integer goodsState ;
	/*
	订单商品ID,全部退款是0
	*/
	private Integer orderGoodsId ;
	/*
	订单商品类型:1默认2团购商品3限时折扣商品4组合套装
	*/
	private Integer orderGoodsType ;
	/*
	订单ID
	*/
	private Integer orderId ;
	/*
	订单锁定类型:1为不用锁定,2为需要锁定,默认为1
	*/
	private Integer orderLock ;
	/*
	原因ID:0为其它
	*/
	private Integer reasonId ;
	/*
	收货时间,默认为0
	*/
	private Integer receiveTime ;
	/*
	申请状态:1为处理中,2为待管理员处理,3为已完成,默认为1
	*/
	private Integer refundState ;
	/*
	申请类型:1为退款,2为退货,默认为1
	*/
	private Integer refundType ;
	/*
	退货类型:1为不用退货,2为需要退货,默认为1
	*/
	private Integer returnType ;
	/*
	卖家处理状态:1为待审核,2为同意,3为不同意,默认为1
	*/
	private Integer sellerState ;
	/*
	卖家处理时间
	*/
	private Integer sellerTime ;
	/*
	发货时间,默认为0
	*/
	private Integer shipTime ;
	/*
	店铺ID
	*/
	private Integer storeId ;
	/*
	管理员备注
	*/
	private String adminMessage ;
	/*
	申请原因
	*/
	private String buyerMessage ;
	/*
	买家会员名
	*/
	private String buyerName ;
	/*
	商品图片
	*/
	private String goodsImage ;
	/*
	商品名称
	*/
	private String goodsName ;
	/*
	物流单号
	*/
	private String invoiceNo ;
	/*
	订单编号
	*/
	private String orderSn ;
	/*
	图片
	*/
	private String picInfo ;
	/*
	原因内容
	*/
	private String reasonInfo ;
	/*
	收货备注
	*/
	private String receiveMessage ;
	private String refundAddress ;
	/*
	退款金额
	*/
	private BigDecimal refundAmount ;
	/*
	申请编号
	*/
	private String refundSn ;
	/*
	卖家备注
	*/
	private String sellerMessage ;
	/*
	店铺名称
	*/
	private String storeName ;
	
	public RaRefundReturn() {
	}
	
	/**
	* 记录ID
	*@return 
	*/
	public Integer getRefundId(){
		return  refundId;
	}
	/**
	* 记录ID
	*@param  refundId
	*/
	public void setRefundId(Integer refundId ){
		this.refundId = refundId;
	}
	
	/**
	* 添加时间
	*@return 
	*/
	public Integer getAddTime(){
		return  addTime;
	}
	/**
	* 添加时间
	*@param  addTime
	*/
	public void setAddTime(Integer addTime ){
		this.addTime = addTime;
	}
	
	/**
	* 管理员处理时间,默认为0
	*@return 
	*/
	public Integer getAdminTime(){
		return  adminTime;
	}
	/**
	* 管理员处理时间,默认为0
	*@param  adminTime
	*/
	public void setAdminTime(Integer adminTime ){
		this.adminTime = adminTime;
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
	
	public Integer getDaddressId(){
		return  daddressId;
	}
	public void setDaddressId(Integer daddressId ){
		this.daddressId = daddressId;
	}
	
	/**
	* 收货延迟时间,默认为0
	*@return 
	*/
	public Integer getDelayTime(){
		return  delayTime;
	}
	/**
	* 收货延迟时间,默认为0
	*@param  delayTime
	*/
	public void setDelayTime(Integer delayTime ){
		this.delayTime = delayTime;
	}
	
	/**
	* 物流公司编号
	*@return 
	*/
	public Integer getExpressId(){
		return  expressId;
	}
	/**
	* 物流公司编号
	*@param  expressId
	*/
	public void setExpressId(Integer expressId ){
		this.expressId = expressId;
	}
	
	/**
	* 商品ID,全部退款是0
	*@return 
	*/
	public Integer getGoodsId(){
		return  goodsId;
	}
	/**
	* 商品ID,全部退款是0
	*@param  goodsId
	*/
	public void setGoodsId(Integer goodsId ){
		this.goodsId = goodsId;
	}
	
	/**
	* 商品数量
	*@return 
	*/
	public Integer getGoodsNum(){
		return  goodsNum;
	}
	/**
	* 商品数量
	*@param  goodsNum
	*/
	public void setGoodsNum(Integer goodsNum ){
		this.goodsNum = goodsNum;
	}
	
	/**
	* 物流状态:1为待发货,2为待收货,3为未收到,4为已收货,默认为1
	*@return 
	*/
	public Integer getGoodsState(){
		return  goodsState;
	}
	/**
	* 物流状态:1为待发货,2为待收货,3为未收到,4为已收货,默认为1
	*@param  goodsState
	*/
	public void setGoodsState(Integer goodsState ){
		this.goodsState = goodsState;
	}
	
	/**
	* 订单商品ID,全部退款是0
	*@return 
	*/
	public Integer getOrderGoodsId(){
		return  orderGoodsId;
	}
	/**
	* 订单商品ID,全部退款是0
	*@param  orderGoodsId
	*/
	public void setOrderGoodsId(Integer orderGoodsId ){
		this.orderGoodsId = orderGoodsId;
	}
	
	/**
	* 订单商品类型:1默认2团购商品3限时折扣商品4组合套装
	*@return 
	*/
	public Integer getOrderGoodsType(){
		return  orderGoodsType;
	}
	/**
	* 订单商品类型:1默认2团购商品3限时折扣商品4组合套装
	*@param  orderGoodsType
	*/
	public void setOrderGoodsType(Integer orderGoodsType ){
		this.orderGoodsType = orderGoodsType;
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
	* 订单锁定类型:1为不用锁定,2为需要锁定,默认为1
	*@return 
	*/
	public Integer getOrderLock(){
		return  orderLock;
	}
	/**
	* 订单锁定类型:1为不用锁定,2为需要锁定,默认为1
	*@param  orderLock
	*/
	public void setOrderLock(Integer orderLock ){
		this.orderLock = orderLock;
	}
	
	/**
	* 原因ID:0为其它
	*@return 
	*/
	public Integer getReasonId(){
		return  reasonId;
	}
	/**
	* 原因ID:0为其它
	*@param  reasonId
	*/
	public void setReasonId(Integer reasonId ){
		this.reasonId = reasonId;
	}
	
	/**
	* 收货时间,默认为0
	*@return 
	*/
	public Integer getReceiveTime(){
		return  receiveTime;
	}
	/**
	* 收货时间,默认为0
	*@param  receiveTime
	*/
	public void setReceiveTime(Integer receiveTime ){
		this.receiveTime = receiveTime;
	}
	
	/**
	* 申请状态:1为处理中,2为待管理员处理,3为已完成,默认为1
	*@return 
	*/
	public Integer getRefundState(){
		return  refundState;
	}
	/**
	* 申请状态:1为处理中,2为待管理员处理,3为已完成,默认为1
	*@param  refundState
	*/
	public void setRefundState(Integer refundState ){
		this.refundState = refundState;
	}
	
	/**
	* 申请类型:1为退款,2为退货,默认为1
	*@return 
	*/
	public Integer getRefundType(){
		return  refundType;
	}
	/**
	* 申请类型:1为退款,2为退货,默认为1
	*@param  refundType
	*/
	public void setRefundType(Integer refundType ){
		this.refundType = refundType;
	}
	
	/**
	* 退货类型:1为不用退货,2为需要退货,默认为1
	*@return 
	*/
	public Integer getReturnType(){
		return  returnType;
	}
	/**
	* 退货类型:1为不用退货,2为需要退货,默认为1
	*@param  returnType
	*/
	public void setReturnType(Integer returnType ){
		this.returnType = returnType;
	}
	
	/**
	* 卖家处理状态:1为待审核,2为同意,3为不同意,默认为1
	*@return 
	*/
	public Integer getSellerState(){
		return  sellerState;
	}
	/**
	* 卖家处理状态:1为待审核,2为同意,3为不同意,默认为1
	*@param  sellerState
	*/
	public void setSellerState(Integer sellerState ){
		this.sellerState = sellerState;
	}
	
	/**
	* 卖家处理时间
	*@return 
	*/
	public Integer getSellerTime(){
		return  sellerTime;
	}
	/**
	* 卖家处理时间
	*@param  sellerTime
	*/
	public void setSellerTime(Integer sellerTime ){
		this.sellerTime = sellerTime;
	}
	
	/**
	* 发货时间,默认为0
	*@return 
	*/
	public Integer getShipTime(){
		return  shipTime;
	}
	/**
	* 发货时间,默认为0
	*@param  shipTime
	*/
	public void setShipTime(Integer shipTime ){
		this.shipTime = shipTime;
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
	* 管理员备注
	*@return 
	*/
	public String getAdminMessage(){
		return  adminMessage;
	}
	/**
	* 管理员备注
	*@param  adminMessage
	*/
	public void setAdminMessage(String adminMessage ){
		this.adminMessage = adminMessage;
	}
	
	/**
	* 申请原因
	*@return 
	*/
	public String getBuyerMessage(){
		return  buyerMessage;
	}
	/**
	* 申请原因
	*@param  buyerMessage
	*/
	public void setBuyerMessage(String buyerMessage ){
		this.buyerMessage = buyerMessage;
	}
	
	/**
	* 买家会员名
	*@return 
	*/
	public String getBuyerName(){
		return  buyerName;
	}
	/**
	* 买家会员名
	*@param  buyerName
	*/
	public void setBuyerName(String buyerName ){
		this.buyerName = buyerName;
	}
	
	/**
	* 商品图片
	*@return 
	*/
	public String getGoodsImage(){
		return  goodsImage;
	}
	/**
	* 商品图片
	*@param  goodsImage
	*/
	public void setGoodsImage(String goodsImage ){
		this.goodsImage = goodsImage;
	}
	
	/**
	* 商品名称
	*@return 
	*/
	public String getGoodsName(){
		return  goodsName;
	}
	/**
	* 商品名称
	*@param  goodsName
	*/
	public void setGoodsName(String goodsName ){
		this.goodsName = goodsName;
	}
	
	/**
	* 物流单号
	*@return 
	*/
	public String getInvoiceNo(){
		return  invoiceNo;
	}
	/**
	* 物流单号
	*@param  invoiceNo
	*/
	public void setInvoiceNo(String invoiceNo ){
		this.invoiceNo = invoiceNo;
	}
	
	/**
	* 订单编号
	*@return 
	*/
	public String getOrderSn(){
		return  orderSn;
	}
	/**
	* 订单编号
	*@param  orderSn
	*/
	public void setOrderSn(String orderSn ){
		this.orderSn = orderSn;
	}
	
	/**
	* 图片
	*@return 
	*/
	public String getPicInfo(){
		return  picInfo;
	}
	/**
	* 图片
	*@param  picInfo
	*/
	public void setPicInfo(String picInfo ){
		this.picInfo = picInfo;
	}
	
	/**
	* 原因内容
	*@return 
	*/
	public String getReasonInfo(){
		return  reasonInfo;
	}
	/**
	* 原因内容
	*@param  reasonInfo
	*/
	public void setReasonInfo(String reasonInfo ){
		this.reasonInfo = reasonInfo;
	}
	
	/**
	* 收货备注
	*@return 
	*/
	public String getReceiveMessage(){
		return  receiveMessage;
	}
	/**
	* 收货备注
	*@param  receiveMessage
	*/
	public void setReceiveMessage(String receiveMessage ){
		this.receiveMessage = receiveMessage;
	}
	
	public String getRefundAddress(){
		return  refundAddress;
	}
	public void setRefundAddress(String refundAddress ){
		this.refundAddress = refundAddress;
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
	* 申请编号
	*@return 
	*/
	public String getRefundSn(){
		return  refundSn;
	}
	/**
	* 申请编号
	*@param  refundSn
	*/
	public void setRefundSn(String refundSn ){
		this.refundSn = refundSn;
	}
	
	/**
	* 卖家备注
	*@return 
	*/
	public String getSellerMessage(){
		return  sellerMessage;
	}
	/**
	* 卖家备注
	*@param  sellerMessage
	*/
	public void setSellerMessage(String sellerMessage ){
		this.sellerMessage = sellerMessage;
	}
	
	/**
	* 店铺名称
	*@return 
	*/
	public String getStoreName(){
		return  storeName;
	}
	/**
	* 店铺名称
	*@param  storeName
	*/
	public void setStoreName(String storeName ){
		this.storeName = storeName;
	}
	

}
