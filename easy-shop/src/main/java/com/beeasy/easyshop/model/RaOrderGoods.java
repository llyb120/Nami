package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_order_goods")
public class RaOrderGoods   {
	
	/*
	订单商品表索引id
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
	订单id
	*/
	private Integer orderId ;
	/*
	促销活动ID（团购ID/限时折扣ID/优惠套装ID）与goods_type搭配使用
	*/
	private Integer promotionsId ;
	/*
	海关实际发货数量
	*/
	private Integer realCount ;
	/*
	店铺ID
	*/
	private Integer storeId ;
	/*
	商品图片
	*/
	private String goodsImage ;
	/*
	商品名称
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
	private BigDecimal goodsProxy ;
	/*
	1默认2团购商品3限时折扣商品4组合套装5赠品
	*/
	private String goodsType ;
	/*
	杭州海关发货详情
	*/
	private String hangzhouDetails ;
	private BigDecimal margin ;
	private BigDecimal mobileMargin ;
	private BigDecimal sourcePrice ;
	private BigDecimal tax ;
	
	public RaOrderGoods() {
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
	* 海关实际发货数量
	*@return 
	*/
	public Integer getRealCount(){
		return  realCount;
	}
	/**
	* 海关实际发货数量
	*@param  realCount
	*/
	public void setRealCount(Integer realCount ){
		this.realCount = realCount;
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
	
	public BigDecimal getGoodsProxy(){
		return  goodsProxy;
	}
	public void setGoodsProxy(BigDecimal goodsProxy ){
		this.goodsProxy = goodsProxy;
	}
	
	/**
	* 1默认2团购商品3限时折扣商品4组合套装5赠品
	*@return 
	*/
	public String getGoodsType(){
		return  goodsType;
	}
	/**
	* 1默认2团购商品3限时折扣商品4组合套装5赠品
	*@param  goodsType
	*/
	public void setGoodsType(String goodsType ){
		this.goodsType = goodsType;
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
	
	public BigDecimal getMargin(){
		return  margin;
	}
	public void setMargin(BigDecimal margin ){
		this.margin = margin;
	}
	
	public BigDecimal getMobileMargin(){
		return  mobileMargin;
	}
	public void setMobileMargin(BigDecimal mobileMargin ){
		this.mobileMargin = mobileMargin;
	}
	
	public BigDecimal getSourcePrice(){
		return  sourcePrice;
	}
	public void setSourcePrice(BigDecimal sourcePrice ){
		this.sourcePrice = sourcePrice;
	}
	
	public BigDecimal getTax(){
		return  tax;
	}
	public void setTax(BigDecimal tax ){
		this.tax = tax;
	}
	

}
