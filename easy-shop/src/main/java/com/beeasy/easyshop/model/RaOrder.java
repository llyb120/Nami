package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_order")
public class RaOrder   {
	
	/*
	订单索引id
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
	延迟时间,默认为0
	*/
	private Integer delayTime ;
	/*
	删除状态0未删除1放入回收站2彻底删除
	*/
	private Integer deleteState ;
	/*
	评价状态 0未评价，1已评价，2已过期未评价
	*/
	private Integer evaluationState ;
	/*
	订单完成时间
	*/
	private Integer finnshedTime ;
	/*
	是否已经汇聚分账
	*/
	private Integer isJoinpayAlloc ;
	/*
	是否推送跨境易
	*/
	private Integer isPullKjy ;
	private Integer isTaxOrder ;
	/*
	是否为微团购订单
	*/
	private Integer isWeGroupbuy ;
	private Integer isWhole ;
	private Integer isZhiyou ;
	/*
	锁定状态:0是正常,大于0是锁定,默认是0
	*/
	private Integer lockState ;
	/*
	1WEB2mobile
	*/
	private Integer orderFrom ;
	/*
	订单状态：0(已取消)10(默认):未付款;20:已付款;30:已发货;40:已收货;
	*/
	private Integer orderState ;
	/*
	外部订单ID
	*/
	private Integer outOrder ;
	private Integer paystatus ;
	/*
	支付(付款)时间
	*/
	private Integer paymentTime ;
	/*
	退款状态:0是无退款,1是部分退款,2是全部退款
	*/
	private Integer refundState ;
	private Integer shenzhenAuditStatus ;
	private Integer shenzhenAuditStatusTraffic ;
	private Integer shenzhenRecordStatus ;
	private Integer shenzhenRecordStatusTraffic ;
	/*
	卖家店铺id
	*/
	private Integer storeId ;
	private Integer vertifyState ;
	private Integer weGroupbuyingId ;
	private String address ;
	private String apiPaySn ;
	/*
	买家电子邮箱
	*/
	private String buyerEmail ;
	/*
	买家姓名
	*/
	private String buyerName ;
	private String expressStatus ;
	/*
	商品总价格
	*/
	private BigDecimal goodsAmount ;
	/*
	杭州海关发货详情
	*/
	private String hangzhouDetails ;
	private String hangzhouState ;
	private String idcard ;
	private String importSn ;
	private BigDecimal margin ;
	private String nBuyerIdcard ;
	private String nBuyerPhone ;
	private String nBuyerTrueName ;
	/*
	订单总价格
	*/
	private BigDecimal orderAmount ;
	/*
	订单编号
	*/
	private String orderSn ;
	private BigDecimal orderTax ;
	private BigDecimal orderWeight ;
	private String outOrderSn ;
	private String outOrderSn2 ;
	private String outSourceData ;
	/*
	支付单号
	*/
	private String paySn ;
	/*
	支付方式名称代码
	*/
	private String paymentCode ;
	/*
	预存款支付金额
	*/
	private BigDecimal pdAmount ;
	private String phone ;
	private String printPdf ;
	private BigDecimal proamount ;
	/*
	充值卡支付金额
	*/
	private BigDecimal rcbAmount ;
	private String receiverName ;
	/*
	退款金额
	*/
	private BigDecimal refundAmount ;
	/*
	物流单号
	*/
	private String shippingCode ;
	/*
	运费
	*/
	private BigDecimal shippingFee ;
	/*
	卖家店铺名称
	*/
	private String storeName ;
	private String wxpay ;
	private String zip ;
	
	public RaOrder() {
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
	* 延迟时间,默认为0
	*@return 
	*/
	public Integer getDelayTime(){
		return  delayTime;
	}
	/**
	* 延迟时间,默认为0
	*@param  delayTime
	*/
	public void setDelayTime(Integer delayTime ){
		this.delayTime = delayTime;
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
	* 评价状态 0未评价，1已评价，2已过期未评价
	*@return 
	*/
	public Integer getEvaluationState(){
		return  evaluationState;
	}
	/**
	* 评价状态 0未评价，1已评价，2已过期未评价
	*@param  evaluationState
	*/
	public void setEvaluationState(Integer evaluationState ){
		this.evaluationState = evaluationState;
	}
	
	/**
	* 订单完成时间
	*@return 
	*/
	public Integer getFinnshedTime(){
		return  finnshedTime;
	}
	/**
	* 订单完成时间
	*@param  finnshedTime
	*/
	public void setFinnshedTime(Integer finnshedTime ){
		this.finnshedTime = finnshedTime;
	}
	
	/**
	* 是否已经汇聚分账
	*@return 
	*/
	public Integer getIsJoinpayAlloc(){
		return  isJoinpayAlloc;
	}
	/**
	* 是否已经汇聚分账
	*@param  isJoinpayAlloc
	*/
	public void setIsJoinpayAlloc(Integer isJoinpayAlloc ){
		this.isJoinpayAlloc = isJoinpayAlloc;
	}
	
	/**
	* 是否推送跨境易
	*@return 
	*/
	public Integer getIsPullKjy(){
		return  isPullKjy;
	}
	/**
	* 是否推送跨境易
	*@param  isPullKjy
	*/
	public void setIsPullKjy(Integer isPullKjy ){
		this.isPullKjy = isPullKjy;
	}
	
	public Integer getIsTaxOrder(){
		return  isTaxOrder;
	}
	public void setIsTaxOrder(Integer isTaxOrder ){
		this.isTaxOrder = isTaxOrder;
	}
	
	/**
	* 是否为微团购订单
	*@return 
	*/
	public Integer getIsWeGroupbuy(){
		return  isWeGroupbuy;
	}
	/**
	* 是否为微团购订单
	*@param  isWeGroupbuy
	*/
	public void setIsWeGroupbuy(Integer isWeGroupbuy ){
		this.isWeGroupbuy = isWeGroupbuy;
	}
	
	public Integer getIsWhole(){
		return  isWhole;
	}
	public void setIsWhole(Integer isWhole ){
		this.isWhole = isWhole;
	}
	
	public Integer getIsZhiyou(){
		return  isZhiyou;
	}
	public void setIsZhiyou(Integer isZhiyou ){
		this.isZhiyou = isZhiyou;
	}
	
	/**
	* 锁定状态:0是正常,大于0是锁定,默认是0
	*@return 
	*/
	public Integer getLockState(){
		return  lockState;
	}
	/**
	* 锁定状态:0是正常,大于0是锁定,默认是0
	*@param  lockState
	*/
	public void setLockState(Integer lockState ){
		this.lockState = lockState;
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
	* 订单状态：0(已取消)10(默认):未付款;20:已付款;30:已发货;40:已收货;
	*@return 
	*/
	public Integer getOrderState(){
		return  orderState;
	}
	/**
	* 订单状态：0(已取消)10(默认):未付款;20:已付款;30:已发货;40:已收货;
	*@param  orderState
	*/
	public void setOrderState(Integer orderState ){
		this.orderState = orderState;
	}
	
	/**
	* 外部订单ID
	*@return 
	*/
	public Integer getOutOrder(){
		return  outOrder;
	}
	/**
	* 外部订单ID
	*@param  outOrder
	*/
	public void setOutOrder(Integer outOrder ){
		this.outOrder = outOrder;
	}
	
	public Integer getPaystatus(){
		return  paystatus;
	}
	public void setPaystatus(Integer paystatus ){
		this.paystatus = paystatus;
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
	
	public Integer getShenzhenAuditStatus(){
		return  shenzhenAuditStatus;
	}
	public void setShenzhenAuditStatus(Integer shenzhenAuditStatus ){
		this.shenzhenAuditStatus = shenzhenAuditStatus;
	}
	
	public Integer getShenzhenAuditStatusTraffic(){
		return  shenzhenAuditStatusTraffic;
	}
	public void setShenzhenAuditStatusTraffic(Integer shenzhenAuditStatusTraffic ){
		this.shenzhenAuditStatusTraffic = shenzhenAuditStatusTraffic;
	}
	
	public Integer getShenzhenRecordStatus(){
		return  shenzhenRecordStatus;
	}
	public void setShenzhenRecordStatus(Integer shenzhenRecordStatus ){
		this.shenzhenRecordStatus = shenzhenRecordStatus;
	}
	
	public Integer getShenzhenRecordStatusTraffic(){
		return  shenzhenRecordStatusTraffic;
	}
	public void setShenzhenRecordStatusTraffic(Integer shenzhenRecordStatusTraffic ){
		this.shenzhenRecordStatusTraffic = shenzhenRecordStatusTraffic;
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
	
	public Integer getVertifyState(){
		return  vertifyState;
	}
	public void setVertifyState(Integer vertifyState ){
		this.vertifyState = vertifyState;
	}
	
	public Integer getWeGroupbuyingId(){
		return  weGroupbuyingId;
	}
	public void setWeGroupbuyingId(Integer weGroupbuyingId ){
		this.weGroupbuyingId = weGroupbuyingId;
	}
	
	public String getAddress(){
		return  address;
	}
	public void setAddress(String address ){
		this.address = address;
	}
	
	public String getApiPaySn(){
		return  apiPaySn;
	}
	public void setApiPaySn(String apiPaySn ){
		this.apiPaySn = apiPaySn;
	}
	
	/**
	* 买家电子邮箱
	*@return 
	*/
	public String getBuyerEmail(){
		return  buyerEmail;
	}
	/**
	* 买家电子邮箱
	*@param  buyerEmail
	*/
	public void setBuyerEmail(String buyerEmail ){
		this.buyerEmail = buyerEmail;
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
	
	public String getExpressStatus(){
		return  expressStatus;
	}
	public void setExpressStatus(String expressStatus ){
		this.expressStatus = expressStatus;
	}
	
	/**
	* 商品总价格
	*@return 
	*/
	public BigDecimal getGoodsAmount(){
		return  goodsAmount;
	}
	/**
	* 商品总价格
	*@param  goodsAmount
	*/
	public void setGoodsAmount(BigDecimal goodsAmount ){
		this.goodsAmount = goodsAmount;
	}
	
	/**
	* 杭州海关发货详情
	*@return 
	*/
	public String getHangzhouDetails(){
		return  hangzhouDetails;
	}
	/**
	* 杭州海关发货详情
	*@param  hangzhouDetails
	*/
	public void setHangzhouDetails(String hangzhouDetails ){
		this.hangzhouDetails = hangzhouDetails;
	}
	
	public String getHangzhouState(){
		return  hangzhouState;
	}
	public void setHangzhouState(String hangzhouState ){
		this.hangzhouState = hangzhouState;
	}
	
	public String getIdcard(){
		return  idcard;
	}
	public void setIdcard(String idcard ){
		this.idcard = idcard;
	}
	
	public String getImportSn(){
		return  importSn;
	}
	public void setImportSn(String importSn ){
		this.importSn = importSn;
	}
	
	public BigDecimal getMargin(){
		return  margin;
	}
	public void setMargin(BigDecimal margin ){
		this.margin = margin;
	}
	
	public String getnBuyerIdcard(){
		return  nBuyerIdcard;
	}
	public void setnBuyerIdcard(String nBuyerIdcard ){
		this.nBuyerIdcard = nBuyerIdcard;
	}
	
	public String getnBuyerPhone(){
		return  nBuyerPhone;
	}
	public void setnBuyerPhone(String nBuyerPhone ){
		this.nBuyerPhone = nBuyerPhone;
	}
	
	public String getnBuyerTrueName(){
		return  nBuyerTrueName;
	}
	public void setnBuyerTrueName(String nBuyerTrueName ){
		this.nBuyerTrueName = nBuyerTrueName;
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
	
	public BigDecimal getOrderTax(){
		return  orderTax;
	}
	public void setOrderTax(BigDecimal orderTax ){
		this.orderTax = orderTax;
	}
	
	public BigDecimal getOrderWeight(){
		return  orderWeight;
	}
	public void setOrderWeight(BigDecimal orderWeight ){
		this.orderWeight = orderWeight;
	}
	
	public String getOutOrderSn(){
		return  outOrderSn;
	}
	public void setOutOrderSn(String outOrderSn ){
		this.outOrderSn = outOrderSn;
	}
	
	public String getOutOrderSn2(){
		return  outOrderSn2;
	}
	public void setOutOrderSn2(String outOrderSn2 ){
		this.outOrderSn2 = outOrderSn2;
	}
	
	public String getOutSourceData(){
		return  outSourceData;
	}
	public void setOutSourceData(String outSourceData ){
		this.outSourceData = outSourceData;
	}
	
	/**
	* 支付单号
	*@return 
	*/
	public String getPaySn(){
		return  paySn;
	}
	/**
	* 支付单号
	*@param  paySn
	*/
	public void setPaySn(String paySn ){
		this.paySn = paySn;
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
	
	public String getPhone(){
		return  phone;
	}
	public void setPhone(String phone ){
		this.phone = phone;
	}
	
	public String getPrintPdf(){
		return  printPdf;
	}
	public void setPrintPdf(String printPdf ){
		this.printPdf = printPdf;
	}
	
	public BigDecimal getProamount(){
		return  proamount;
	}
	public void setProamount(BigDecimal proamount ){
		this.proamount = proamount;
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
	
	public String getReceiverName(){
		return  receiverName;
	}
	public void setReceiverName(String receiverName ){
		this.receiverName = receiverName;
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
	
	public String getWxpay(){
		return  wxpay;
	}
	public void setWxpay(String wxpay ){
		this.wxpay = wxpay;
	}
	
	public String getZip(){
		return  zip;
	}
	public void setZip(String zip ){
		this.zip = zip;
	}
	

}
