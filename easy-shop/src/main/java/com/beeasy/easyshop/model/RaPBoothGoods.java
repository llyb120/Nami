package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_p_booth_goods")
public class RaPBoothGoods   {
	
	/*
	套餐商品id
	*/
	private Integer boothGoodsId ;
	/*
	套餐状态 1开启 0关闭 默认1
	*/
	private Integer boothState ;
	/*
	商品分类id
	*/
	private Integer gcId ;
	/*
	商品id
	*/
	private Integer goodsId ;
	/*
	店铺id
	*/
	private Integer storeId ;
	
	public RaPBoothGoods() {
	}
	
	/**
	* 套餐商品id
	*@return 
	*/
	public Integer getBoothGoodsId(){
		return  boothGoodsId;
	}
	/**
	* 套餐商品id
	*@param  boothGoodsId
	*/
	public void setBoothGoodsId(Integer boothGoodsId ){
		this.boothGoodsId = boothGoodsId;
	}
	
	/**
	* 套餐状态 1开启 0关闭 默认1
	*@return 
	*/
	public Integer getBoothState(){
		return  boothState;
	}
	/**
	* 套餐状态 1开启 0关闭 默认1
	*@param  boothState
	*/
	public void setBoothState(Integer boothState ){
		this.boothState = boothState;
	}
	
	/**
	* 商品分类id
	*@return 
	*/
	public Integer getGcId(){
		return  gcId;
	}
	/**
	* 商品分类id
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
	

}
