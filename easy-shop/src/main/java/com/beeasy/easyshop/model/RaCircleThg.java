package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_circle_thg")
public class RaCircleThg   {
	
	/*
	主题商品id
	*/
	private Integer themegoodsId ;
	/*
	圈子id
	*/
	private Integer circleId ;
	/*
	商品id
	*/
	private Integer goodsId ;
	/*
	回复id
	*/
	private Integer replyId ;
	/*
	店铺id
	*/
	private Integer storeId ;
	/*
	主题id
	*/
	private Integer themeId ;
	/*
	商品类型 0为本商城、1为淘宝 默认为0
	*/
	private Integer thgType ;
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
	商品链接
	*/
	private String thgUrl ;
	
	public RaCircleThg() {
	}
	
	/**
	* 主题商品id
	*@return 
	*/
	public Integer getThemegoodsId(){
		return  themegoodsId;
	}
	/**
	* 主题商品id
	*@param  themegoodsId
	*/
	public void setThemegoodsId(Integer themegoodsId ){
		this.themegoodsId = themegoodsId;
	}
	
	/**
	* 圈子id
	*@return 
	*/
	public Integer getCircleId(){
		return  circleId;
	}
	/**
	* 圈子id
	*@param  circleId
	*/
	public void setCircleId(Integer circleId ){
		this.circleId = circleId;
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
	* 回复id
	*@return 
	*/
	public Integer getReplyId(){
		return  replyId;
	}
	/**
	* 回复id
	*@param  replyId
	*/
	public void setReplyId(Integer replyId ){
		this.replyId = replyId;
	}
	
	/**
	* 店铺id
	*@return 
	*/
	public Integer getStoreId(){
		return  storeId;
	}
	/**
	* 店铺id
	*@param  storeId
	*/
	public void setStoreId(Integer storeId ){
		this.storeId = storeId;
	}
	
	/**
	* 主题id
	*@return 
	*/
	public Integer getThemeId(){
		return  themeId;
	}
	/**
	* 主题id
	*@param  themeId
	*/
	public void setThemeId(Integer themeId ){
		this.themeId = themeId;
	}
	
	/**
	* 商品类型 0为本商城、1为淘宝 默认为0
	*@return 
	*/
	public Integer getThgType(){
		return  thgType;
	}
	/**
	* 商品类型 0为本商城、1为淘宝 默认为0
	*@param  thgType
	*/
	public void setThgType(Integer thgType ){
		this.thgType = thgType;
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
	* 商品链接
	*@return 
	*/
	public String getThgUrl(){
		return  thgUrl;
	}
	/**
	* 商品链接
	*@param  thgUrl
	*/
	public void setThgUrl(String thgUrl ){
		this.thgUrl = thgUrl;
	}
	

}
