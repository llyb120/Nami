package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_stat_ordergoods")
public class RaStatOrdergoods   {
	
	/*
	品牌id
	*/
	private Integer brandId ;
	/*
	买家ID
	*/
	private Integer buyerId ;
	/*
	佣金比例
	*/
	private Integer commisRate ;
	/*
	商品最底级分类ID
	*/
	private Integer gcId ;
	/*
	一级父类ID
	*/
	private Integer gcParentid1 ;
	/*
	二级父类ID
	*/
	private Integer gcParentid2 ;
	/*
	三级父类ID
	*/
	private Integer gcParentid3 ;
	/*
	商品公共表id
	*/
	private Integer goodsCommonid ;
	/*
	商品id
	*/
	private Integer goodsId ;
	/*
	商品数量
	*/
	private Integer goodsNum ;
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
	促销活动ID（团购ID/限时折扣ID/优惠套装ID）与goods_type搭配使用
	*/
	private Integer promotionsId ;
	/*
	订单商品表索引id
	*/
	private Integer recId ;
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
	缓存生成时间
	*/
	private Integer statUpdatetime ;
	/*
	店铺ID
	*/
	private Integer storeId ;
	/*
	品牌名称
	*/
	private String brandName ;
	/*
	买家姓名
	*/
	private String buyerName ;
	/*
	评价状态 0未评价，1已评价
	*/
	private String evaluationState ;
	/*
	商品公共表中商品名称
	*/
	private String goodsCommonname ;
	/*
	商品图片
	*/
	private String goodsImage ;
	/*
	商品名称(+规格)
	*/
	private String goodsName ;
	/*
	商品实际成交价
	*/
	private BigDecimal goodsPayPrice ;
	/*
	商品价格
	*/
	private BigDecimal goodsPrice ;
	/*
	商家编号
	*/
	private String goodsSerial ;
	/*
	1默认2团购商品3限时折扣商品4优惠套装5赠品
	*/
	private String goodsType ;
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
	
	public RaStatOrdergoods() {
	}
	
	/**
	* 品牌id
	*@return 
	*/
	public Integer getBrandId(){
		return  brandId;
	}
	/**
	* 品牌id
	*@param  brandId
	*/
	public void setBrandId(Integer brandId ){
		this.brandId = brandId;
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
	* 一级父类ID
	*@return 
	*/
	public Integer getGcParentid1(){
		return  gcParentid1;
	}
	/**
	* 一级父类ID
	*@param  gcParentid1
	*/
	public void setGcParentid1(Integer gcParentid1 ){
		this.gcParentid1 = gcParentid1;
	}
	
	/**
	* 二级父类ID
	*@return 
	*/
	public Integer getGcParentid2(){
		return  gcParentid2;
	}
	/**
	* 二级父类ID
	*@param  gcParentid2
	*/
	public void setGcParentid2(Integer gcParentid2 ){
		this.gcParentid2 = gcParentid2;
	}
	
	/**
	* 三级父类ID
	*@return 
	*/
	public Integer getGcParentid3(){
		return  gcParentid3;
	}
	/**
	* 三级父类ID
	*@param  gcParentid3
	*/
	public void setGcParentid3(Integer gcParentid3 ){
		this.gcParentid3 = gcParentid3;
	}
	
	/**
	* 商品公共表id
	*@return 
	*/
	public Integer getGoodsCommonid(){
		return  goodsCommonid;
	}
	/**
	* 商品公共表id
	*@param  goodsCommonid
	*/
	public void setGoodsCommonid(Integer goodsCommonid ){
		this.goodsCommonid = goodsCommonid;
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
	* 促销活动ID（团购ID/限时折扣ID/优惠套装ID）与goods_type搭配使用
	*@return 
	*/
	public Integer getPromotionsId(){
		return  promotionsId;
	}
	/**
	* 促销活动ID（团购ID/限时折扣ID/优惠套装ID）与goods_type搭配使用
	*@param  promotionsId
	*/
	public void setPromotionsId(Integer promotionsId ){
		this.promotionsId = promotionsId;
	}
	
	/**
	* 订单商品表索引id
	*@return 
	*/
	public Integer getRecId(){
		return  recId;
	}
	/**
	* 订单商品表索引id
	*@param  recId
	*/
	public void setRecId(Integer recId ){
		this.recId = recId;
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
	* 缓存生成时间
	*@return 
	*/
	public Integer getStatUpdatetime(){
		return  statUpdatetime;
	}
	/**
	* 缓存生成时间
	*@param  statUpdatetime
	*/
	public void setStatUpdatetime(Integer statUpdatetime ){
		this.statUpdatetime = statUpdatetime;
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
	* 品牌名称
	*@return 
	*/
	public String getBrandName(){
		return  brandName;
	}
	/**
	* 品牌名称
	*@param  brandName
	*/
	public void setBrandName(String brandName ){
		this.brandName = brandName;
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
	* 商品公共表中商品名称
	*@return 
	*/
	public String getGoodsCommonname(){
		return  goodsCommonname;
	}
	/**
	* 商品公共表中商品名称
	*@param  goodsCommonname
	*/
	public void setGoodsCommonname(String goodsCommonname ){
		this.goodsCommonname = goodsCommonname;
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
	* 商品名称(+规格)
	*@return 
	*/
	public String getGoodsName(){
		return  goodsName;
	}
	/**
	* 商品名称(+规格)
	*@param  goodsName
	*/
	public void setGoodsName(String goodsName ){
		this.goodsName = goodsName;
	}
	
	/**
	* 商品实际成交价
	*@return 
	*/
	public BigDecimal getGoodsPayPrice(){
		return  goodsPayPrice;
	}
	/**
	* 商品实际成交价
	*@param  goodsPayPrice
	*/
	public void setGoodsPayPrice(BigDecimal goodsPayPrice ){
		this.goodsPayPrice = goodsPayPrice;
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
	* 商家编号
	*@return 
	*/
	public String getGoodsSerial(){
		return  goodsSerial;
	}
	/**
	* 商家编号
	*@param  goodsSerial
	*/
	public void setGoodsSerial(String goodsSerial ){
		this.goodsSerial = goodsSerial;
	}
	
	/**
	* 1默认2团购商品3限时折扣商品4优惠套装5赠品
	*@return 
	*/
	public String getGoodsType(){
		return  goodsType;
	}
	/**
	* 1默认2团购商品3限时折扣商品4优惠套装5赠品
	*@param  goodsType
	*/
	public void setGoodsType(String goodsType ){
		this.goodsType = goodsType;
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
