package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_p_xianshi_goods")
public class RaPXianshiGoods   {
	
	/*
	限时折扣商品表
	*/
	private Integer xianshiGoodsId ;
	/*
	结束时间
	*/
	private Integer endTime ;
	/*
	商品编号
	*/
	private Integer goodsId ;
	/*
	购买下限，0为不限制
	*/
	private Integer lowerLimit ;
	/*
	开始时间
	*/
	private Integer startTime ;
	/*
	状态，0-取消 1-正常
	*/
	private Integer state ;
	/*
	店铺编号
	*/
	private Integer storeId ;
	/*
	限时活动编号
	*/
	private Integer xianshiId ;
	/*
	推荐标志 0-未推荐 1-已推荐
	*/
	private Integer xianshiRecommend ;
	/*
	商品图片
	*/
	private String goodsImage ;
	/*
	商品名称
	*/
	private String goodsName ;
	/*
	店铺价格
	*/
	private BigDecimal goodsPrice ;
	/*
	活动说明
	*/
	private String xianshiExplain ;
	/*
	活动名称
	*/
	private String xianshiName ;
	/*
	限时折扣价格
	*/
	private BigDecimal xianshiPrice ;
	/*
	活动标题
	*/
	private String xianshiTitle ;
	
	public RaPXianshiGoods() {
	}
	
	/**
	* 限时折扣商品表
	*@return 
	*/
	public Integer getXianshiGoodsId(){
		return  xianshiGoodsId;
	}
	/**
	* 限时折扣商品表
	*@param  xianshiGoodsId
	*/
	public void setXianshiGoodsId(Integer xianshiGoodsId ){
		this.xianshiGoodsId = xianshiGoodsId;
	}
	
	/**
	* 结束时间
	*@return 
	*/
	public Integer getEndTime(){
		return  endTime;
	}
	/**
	* 结束时间
	*@param  endTime
	*/
	public void setEndTime(Integer endTime ){
		this.endTime = endTime;
	}
	
	/**
	* 商品编号
	*@return 
	*/
	public Integer getGoodsId(){
		return  goodsId;
	}
	/**
	* 商品编号
	*@param  goodsId
	*/
	public void setGoodsId(Integer goodsId ){
		this.goodsId = goodsId;
	}
	
	/**
	* 购买下限，0为不限制
	*@return 
	*/
	public Integer getLowerLimit(){
		return  lowerLimit;
	}
	/**
	* 购买下限，0为不限制
	*@param  lowerLimit
	*/
	public void setLowerLimit(Integer lowerLimit ){
		this.lowerLimit = lowerLimit;
	}
	
	/**
	* 开始时间
	*@return 
	*/
	public Integer getStartTime(){
		return  startTime;
	}
	/**
	* 开始时间
	*@param  startTime
	*/
	public void setStartTime(Integer startTime ){
		this.startTime = startTime;
	}
	
	/**
	* 状态，0-取消 1-正常
	*@return 
	*/
	public Integer getState(){
		return  state;
	}
	/**
	* 状态，0-取消 1-正常
	*@param  state
	*/
	public void setState(Integer state ){
		this.state = state;
	}
	
	/**
	* 店铺编号
	*@return 
	*/
	public Integer getStoreId(){
		return  storeId;
	}
	/**
	* 店铺编号
	*@param  storeId
	*/
	public void setStoreId(Integer storeId ){
		this.storeId = storeId;
	}
	
	/**
	* 限时活动编号
	*@return 
	*/
	public Integer getXianshiId(){
		return  xianshiId;
	}
	/**
	* 限时活动编号
	*@param  xianshiId
	*/
	public void setXianshiId(Integer xianshiId ){
		this.xianshiId = xianshiId;
	}
	
	/**
	* 推荐标志 0-未推荐 1-已推荐
	*@return 
	*/
	public Integer getXianshiRecommend(){
		return  xianshiRecommend;
	}
	/**
	* 推荐标志 0-未推荐 1-已推荐
	*@param  xianshiRecommend
	*/
	public void setXianshiRecommend(Integer xianshiRecommend ){
		this.xianshiRecommend = xianshiRecommend;
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
	* 店铺价格
	*@return 
	*/
	public BigDecimal getGoodsPrice(){
		return  goodsPrice;
	}
	/**
	* 店铺价格
	*@param  goodsPrice
	*/
	public void setGoodsPrice(BigDecimal goodsPrice ){
		this.goodsPrice = goodsPrice;
	}
	
	/**
	* 活动说明
	*@return 
	*/
	public String getXianshiExplain(){
		return  xianshiExplain;
	}
	/**
	* 活动说明
	*@param  xianshiExplain
	*/
	public void setXianshiExplain(String xianshiExplain ){
		this.xianshiExplain = xianshiExplain;
	}
	
	/**
	* 活动名称
	*@return 
	*/
	public String getXianshiName(){
		return  xianshiName;
	}
	/**
	* 活动名称
	*@param  xianshiName
	*/
	public void setXianshiName(String xianshiName ){
		this.xianshiName = xianshiName;
	}
	
	/**
	* 限时折扣价格
	*@return 
	*/
	public BigDecimal getXianshiPrice(){
		return  xianshiPrice;
	}
	/**
	* 限时折扣价格
	*@param  xianshiPrice
	*/
	public void setXianshiPrice(BigDecimal xianshiPrice ){
		this.xianshiPrice = xianshiPrice;
	}
	
	/**
	* 活动标题
	*@return 
	*/
	public String getXianshiTitle(){
		return  xianshiTitle;
	}
	/**
	* 活动标题
	*@param  xianshiTitle
	*/
	public void setXianshiTitle(String xianshiTitle ){
		this.xianshiTitle = xianshiTitle;
	}
	

}
