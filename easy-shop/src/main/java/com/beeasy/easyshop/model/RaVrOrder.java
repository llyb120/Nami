package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_vr_order")
public class RaVrOrder   {
	
	/*
	虚拟订单索引id
	*/
	private Integer orderId ;
	/*
	订单生成时间
	*/
	private Integer addTime ;
	/*
	买家id
	*/
	private Integer buyerId ;
	/*
	关闭时间
	*/
	private Integer closeTime ;
	/*
	佣金比例
	*/
	private Integer commisRate ;
	/*
	删除状态0未删除1放入回收站2彻底删除
	*/
	private Integer deleteState ;
	/*
	评价状态0默认1已评价2禁止评价
	*/
	private Integer evaluationState ;
	/*
	评价时间
	*/
	private Integer evaluationTime ;
	/*
	完成时间
	*/
	private Integer finnshedTime ;
	/*
	商品最底级分类ID
	*/
	private Integer gcId ;
	/*
	商品id
	*/
	private Integer goodsId ;
	/*
	商品数量
	*/
	private Integer goodsNum ;
	/*
	1WEB2mobile
	*/
	private Integer orderFrom ;
	/*
	订单参加的促销类型 0无促销1团购
	*/
	private Integer orderPromotionType ;
	/*
	订单状态：0(已取消)10(默认):未付款;20:已付款;40:已完成;
	*/
	private Integer orderState ;
	/*
	支付(付款)时间
	*/
	private Integer paymentTime ;
	/*
	促销ID，与order_promotion_type配合使用
	*/
	private Integer promotionsId ;
	/*
	退款状态:0是无退款,1是部分退款,2是全部退款
	*/
	private Integer refundState ;
	/*
	卖家店铺id
	*/
	private Integer storeId ;
	/*
	使用状态0默认，未使用1已使用，有一个被使用即为1
	*/
	private Integer useState ;
	/*
	有效期
	*/
	private Integer vrIndate ;
	/*
	允许过期退款1是0否
	*/
	private Integer vrInvalidRefund ;
	/*
	兑换码发送次数
	*/
	private Integer vrSendTimes ;
	/*
	买家留言
	*/
	private String buyerMsg ;
	/*
	买家登录名
	*/
	private String buyerName ;
	/*
	买家手机
	*/
	private String buyerPhone ;
	/*
	关闭原因
	*/
	private String closeReason ;
	/*
	商品图片
	*/
	private String goodsImage ;
	/*
	商品名称
	*/
	private String goodsName ;
	/*
	商品价格
	*/
	private BigDecimal goodsPrice ;
	/*
	订单总价格(支付金额)
	*/
	private BigDecimal orderAmount ;
	/*
	订单编号
	*/
	private Long orderSn ;
	/*
	支付方式名称代码
	*/
	private String paymentCode ;
	/*
	预存款支付金额
	*/
	private BigDecimal pdAmount ;
	/*
	充值卡支付金额
	*/
	private BigDecimal rcbAmount ;
	/*
	退款金额
	*/
	private BigDecimal refundAmount ;
	/*
	卖家店铺名称
	*/
	private String storeName ;
	/*
	第三方平台交易号
	*/
	private String tradeNo ;
	
	public RaVrOrder() {
	}
	
	/**
	* 虚拟订单索引id
	*@return 
	*/
	public Integer getOrderId(){
		return  orderId;
	}
	/**
	* 虚拟订单索引id
	*@param  orderId
	*/
	public void setOrderId(Integer orderId ){
		this.orderId = orderId;
	}
	
	/**
	* 订单生成时间
	*@return 
	*/
	public Integer getAddTime(){
		return  addTime;
	}
	/**
	* 订单生成时间
	*@param  addTime
	*/
	public void setAddTime(Integer addTime ){
		this.addTime = addTime;
	}
	
	/**
	* 买家id
	*@return 
	*/
	public Integer getBuyerId(){
		return  buyerId;
	}
	/**
	* 买家id
	*@param  buyerId
	*/
	public void setBuyerId(Integer buyerId ){
		this.buyerId = buyerId;
	}
	
	/**
	* 关闭时间
	*@return 
	*/
	public Integer getCloseTime(){
		return  closeTime;
	}
	/**
	* 关闭时间
	*@param  closeTime
	*/
	public void setCloseTime(Integer closeTime ){
		this.closeTime = closeTime;
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
	* 删除状态0未删除1放入回收站2彻底删除
	*@return 
	*/
	public Integer getDeleteState(){
		return  deleteState;
	}
	/**
	* 删除状态0未删除1放入回收站2彻底删除
	*@param  deleteState
	*/
	public void setDeleteState(Integer deleteState ){
		this.deleteState = deleteState;
	}
	
	/**
	* 评价状态0默认1已评价2禁止评价
	*@return 
	*/
	public Integer getEvaluationState(){
		return  evaluationState;
	}
	/**
	* 评价状态0默认1已评价2禁止评价
	*@param  evaluationState
	*/
	public void setEvaluationState(Integer evaluationState ){
		this.evaluationState = evaluationState;
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
	* 完成时间
	*@return 
	*/
	public Integer getFinnshedTime(){
		return  finnshedTime;
	}
	/**
	* 完成时间
	*@param  finnshedTime
	*/
	public void setFinnshedTime(Integer finnshedTime ){
		this.finnshedTime = finnshedTime;
	}
	
	/**
	* 商品最底级分类ID
	*@return 
	*/
	public Integer getGcId(){
		return  gcId;
	}
	/**
	* 商品最底级分类ID
	*@param  gcId
	*/
	public void setGcId(Integer gcId ){
		this.gcId = gcId;
	}
	
	/**
	* 商品id
	*@return 
	*/
	public Integer getGoodsId(){
		return  goodsId;
	}
	/**
	* 商品id
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
	* 1WEB2mobile
	*@return 
	*/
	public Integer getOrderFrom(){
		return  orderFrom;
	}
	/**
	* 1WEB2mobile
	*@param  orderFrom
	*/
	public void setOrderFrom(Integer orderFrom ){
		this.orderFrom = orderFrom;
	}
	
	/**
	* 订单参加的促销类型 0无促销1团购
	*@return 
	*/
	public Integer getOrderPromotionType(){
		return  orderPromotionType;
	}
	/**
	* 订单参加的促销类型 0无促销1团购
	*@param  orderPromotionType
	*/
	public void setOrderPromotionType(Integer orderPromotionType ){
		this.orderPromotionType = orderPromotionType;
	}
	
	/**
	* 订单状态：0(已取消)10(默认):未付款;20:已付款;40:已完成;
	*@return 
	*/
	public Integer getOrderState(){
		return  orderState;
	}
	/**
	* 订单状态：0(已取消)10(默认):未付款;20:已付款;40:已完成;
	*@param  orderState
	*/
	public void setOrderState(Integer orderState ){
		this.orderState = orderState;
	}
	
	/**
	* 支付(付款)时间
	*@return 
	*/
	public Integer getPaymentTime(){
		return  paymentTime;
	}
	/**
	* 支付(付款)时间
	*@param  paymentTime
	*/
	public void setPaymentTime(Integer paymentTime ){
		this.paymentTime = paymentTime;
	}
	
	/**
	* 促销ID，与order_promotion_type配合使用
	*@return 
	*/
	public Integer getPromotionsId(){
		return  promotionsId;
	}
	/**
	* 促销ID，与order_promotion_type配合使用
	*@param  promotionsId
	*/
	public void setPromotionsId(Integer promotionsId ){
		this.promotionsId = promotionsId;
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
	* 卖家店铺id
	*@return 
	*/
	public Integer getStoreId(){
		return  storeId;
	}
	/**
	* 卖家店铺id
	*@param  storeId
	*/
	public void setStoreId(Integer storeId ){
		this.storeId = storeId;
	}
	
	/**
	* 使用状态0默认，未使用1已使用，有一个被使用即为1
	*@return 
	*/
	public Integer getUseState(){
		return  useState;
	}
	/**
	* 使用状态0默认，未使用1已使用，有一个被使用即为1
	*@param  useState
	*/
	public void setUseState(Integer useState ){
		this.useState = useState;
	}
	
	/**
	* 有效期
	*@return 
	*/
	public Integer getVrIndate(){
		return  vrIndate;
	}
	/**
	* 有效期
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
	* 兑换码发送次数
	*@return 
	*/
	public Integer getVrSendTimes(){
		return  vrSendTimes;
	}
	/**
	* 兑换码发送次数
	*@param  vrSendTimes
	*/
	public void setVrSendTimes(Integer vrSendTimes ){
		this.vrSendTimes = vrSendTimes;
	}
	
	/**
	* 买家留言
	*@return 
	*/
	public String getBuyerMsg(){
		return  buyerMsg;
	}
	/**
	* 买家留言
	*@param  buyerMsg
	*/
	public void setBuyerMsg(String buyerMsg ){
		this.buyerMsg = buyerMsg;
	}
	
	/**
	* 买家登录名
	*@return 
	*/
	public String getBuyerName(){
		return  buyerName;
	}
	/**
	* 买家登录名
	*@param  buyerName
	*/
	public void setBuyerName(String buyerName ){
		this.buyerName = buyerName;
	}
	
	/**
	* 买家手机
	*@return 
	*/
	public String getBuyerPhone(){
		return  buyerPhone;
	}
	/**
	* 买家手机
	*@param  buyerPhone
	*/
	public void setBuyerPhone(String buyerPhone ){
		this.buyerPhone = buyerPhone;
	}
	
	/**
	* 关闭原因
	*@return 
	*/
	public String getCloseReason(){
		return  closeReason;
	}
	/**
	* 关闭原因
	*@param  closeReason
	*/
	public void setCloseReason(String closeReason ){
		this.closeReason = closeReason;
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
	* 商品价格
	*@return 
	*/
	public BigDecimal getGoodsPrice(){
		return  goodsPrice;
	}
	/**
	* 商品价格
	*@param  goodsPrice
	*/
	public void setGoodsPrice(BigDecimal goodsPrice ){
		this.goodsPrice = goodsPrice;
	}
	
	/**
	* 订单总价格(支付金额)
	*@return 
	*/
	public BigDecimal getOrderAmount(){
		return  orderAmount;
	}
	/**
	* 订单总价格(支付金额)
	*@param  orderAmount
	*/
	public void setOrderAmount(BigDecimal orderAmount ){
		this.orderAmount = orderAmount;
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
	* 支付方式名称代码
	*@return 
	*/
	public String getPaymentCode(){
		return  paymentCode;
	}
	/**
	* 支付方式名称代码
	*@param  paymentCode
	*/
	public void setPaymentCode(String paymentCode ){
		this.paymentCode = paymentCode;
	}
	
	/**
	* 预存款支付金额
	*@return 
	*/
	public BigDecimal getPdAmount(){
		return  pdAmount;
	}
	/**
	* 预存款支付金额
	*@param  pdAmount
	*/
	public void setPdAmount(BigDecimal pdAmount ){
		this.pdAmount = pdAmount;
	}
	
	/**
	* 充值卡支付金额
	*@return 
	*/
	public BigDecimal getRcbAmount(){
		return  rcbAmount;
	}
	/**
	* 充值卡支付金额
	*@param  rcbAmount
	*/
	public void setRcbAmount(BigDecimal rcbAmount ){
		this.rcbAmount = rcbAmount;
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
	
	/**
	* 第三方平台交易号
	*@return 
	*/
	public String getTradeNo(){
		return  tradeNo;
	}
	/**
	* 第三方平台交易号
	*@param  tradeNo
	*/
	public void setTradeNo(String tradeNo ){
		this.tradeNo = tradeNo;
	}
	

}
