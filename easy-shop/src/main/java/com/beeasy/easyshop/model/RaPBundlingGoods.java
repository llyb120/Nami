package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_p_bundling_goods")
public class RaPBundlingGoods   {
	
	/*
	组合商品id
	*/
	private Integer blGoodsId ;
	/*
	指定商品 1是，0否
	*/
	private Integer blAppoint ;
	/*
	组合id
	*/
	private Integer blId ;
	/*
	商品id
	*/
	private Integer goodsId ;
	/*
	商品价格
	*/
	private BigDecimal blGoodsPrice ;
	/*
	商品图片
	*/
	private String goodsImage ;
	/*
	商品名称
	*/
	private String goodsName ;
	
	public RaPBundlingGoods() {
	}
	
	/**
	* 组合商品id
	*@return 
	*/
	public Integer getBlGoodsId(){
		return  blGoodsId;
	}
	/**
	* 组合商品id
	*@param  blGoodsId
	*/
	public void setBlGoodsId(Integer blGoodsId ){
		this.blGoodsId = blGoodsId;
	}
	
	/**
	* 指定商品 1是，0否
	*@return 
	*/
	public Integer getBlAppoint(){
		return  blAppoint;
	}
	/**
	* 指定商品 1是，0否
	*@param  blAppoint
	*/
	public void setBlAppoint(Integer blAppoint ){
		this.blAppoint = blAppoint;
	}
	
	/**
	* 组合id
	*@return 
	*/
	public Integer getBlId(){
		return  blId;
	}
	/**
	* 组合id
	*@param  blId
	*/
	public void setBlId(Integer blId ){
		this.blId = blId;
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
	* 商品价格
	*@return 
	*/
	public BigDecimal getBlGoodsPrice(){
		return  blGoodsPrice;
	}
	/**
	* 商品价格
	*@param  blGoodsPrice
	*/
	public void setBlGoodsPrice(BigDecimal blGoodsPrice ){
		this.blGoodsPrice = blGoodsPrice;
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
	

}
