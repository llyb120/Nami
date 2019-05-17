package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_cart")
public class RaCart   {
	
	/*
	购物车id
	*/
	private Integer cartId ;
	/*
	组合套装ID
	*/
	private Integer blId ;
	/*
	买家id
	*/
	private Integer buyerId ;
	private Integer checked ;
	/*
	商品id
	*/
	private Integer goodsId ;
	/*
	购买商品数量
	*/
	private Integer goodsNum ;
	/*
	店铺id
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
	商品价格
	*/
	private BigDecimal goodsPrice ;
	/*
	店铺名称
	*/
	private String storeName ;
	
	public RaCart() {
	}
	
	/**
	* 购物车id
	*@return 
	*/
	public Integer getCartId(){
		return  cartId;
	}
	/**
	* 购物车id
	*@param  cartId
	*/
	public void setCartId(Integer cartId ){
		this.cartId = cartId;
	}
	
	/**
	* 组合套装ID
	*@return 
	*/
	public Integer getBlId(){
		return  blId;
	}
	/**
	* 组合套装ID
	*@param  blId
	*/
	public void setBlId(Integer blId ){
		this.blId = blId;
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
	
	public Integer getChecked(){
		return  checked;
	}
	public void setChecked(Integer checked ){
		this.checked = checked;
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
	* 购买商品数量
	*@return 
	*/
	public Integer getGoodsNum(){
		return  goodsNum;
	}
	/**
	* 购买商品数量
	*@param  goodsNum
	*/
	public void setGoodsNum(Integer goodsNum ){
		this.goodsNum = goodsNum;
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
