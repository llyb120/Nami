package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_vr_refund")
public class RaVrRefund   {
	
	/*
	记录ID
	*/
	private Integer refundId ;
	/*
	添加时间
	*/
	private Integer addTime ;
	/*
	退款状态:1为待审核,2为同意,3为不同意,默认为1
	*/
	private Integer adminState ;
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
	/*
	商品ID
	*/
	private Integer goodsId ;
	/*
	退款商品数量
	*/
	private Integer goodsNum ;
	/*
	虚拟订单ID
	*/
	private Integer orderId ;
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
	兑换码编号
	*/
	private String codeSn ;
	/*
	商品图片
	*/
	private String goodsImage ;
	/*
	商品名称
	*/
	private String goodsName ;
	/*
	虚拟订单编号
	*/
	private String orderSn ;
	/*
	退款金额
	*/
	private BigDecimal refundAmount ;
	/*
	申请编号
	*/
	private String refundSn ;
	/*
	店铺名称
	*/
	private String storeName ;
	
	public RaVrRefund() {
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
	* 退款状态:1为待审核,2为同意,3为不同意,默认为1
	*@return 
	*/
	public Integer getAdminState(){
		return  adminState;
	}
	/**
	* 退款状态:1为待审核,2为同意,3为不同意,默认为1
	*@param  adminState
	*/
	public void setAdminState(Integer adminState ){
		this.adminState = adminState;
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
	
	/**
	* 商品ID
	*@return 
	*/
	public Integer getGoodsId(){
		return  goodsId;
	}
	/**
	* 商品ID
	*@param  goodsId
	*/
	public void setGoodsId(Integer goodsId ){
		this.goodsId = goodsId;
	}
	
	/**
	* 退款商品数量
	*@return 
	*/
	public Integer getGoodsNum(){
		return  goodsNum;
	}
	/**
	* 退款商品数量
	*@param  goodsNum
	*/
	public void setGoodsNum(Integer goodsNum ){
		this.goodsNum = goodsNum;
	}
	
	/**
	* 虚拟订单ID
	*@return 
	*/
	public Integer getOrderId(){
		return  orderId;
	}
	/**
	* 虚拟订单ID
	*@param  orderId
	*/
	public void setOrderId(Integer orderId ){
		this.orderId = orderId;
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
	* 兑换码编号
	*@return 
	*/
	public String getCodeSn(){
		return  codeSn;
	}
	/**
	* 兑换码编号
	*@param  codeSn
	*/
	public void setCodeSn(String codeSn ){
		this.codeSn = codeSn;
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
	* 虚拟订单编号
	*@return 
	*/
	public String getOrderSn(){
		return  orderSn;
	}
	/**
	* 虚拟订单编号
	*@param  orderSn
	*/
	public void setOrderSn(String orderSn ){
		this.orderSn = orderSn;
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
