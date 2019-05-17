package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_p_bundling")
public class RaPBundling   {
	
	/*
	组合ID
	*/
	private Integer blId ;
	/*
	运费承担方式
	*/
	private Integer blFreightChoose ;
	/*
	组合状态 0-关闭/1-开启
	*/
	private Integer blState ;
	/*
	店铺名称
	*/
	private Integer storeId ;
	/*
	组合价格
	*/
	private BigDecimal blDiscountPrice ;
	/*
	运费
	*/
	private BigDecimal blFreight ;
	/*
	组合名称
	*/
	private String blName ;
	/*
	店铺名称
	*/
	private String storeName ;
	
	public RaPBundling() {
	}
	
	/**
	* 组合ID
	*@return 
	*/
	public Integer getBlId(){
		return  blId;
	}
	/**
	* 组合ID
	*@param  blId
	*/
	public void setBlId(Integer blId ){
		this.blId = blId;
	}
	
	/**
	* 运费承担方式
	*@return 
	*/
	public Integer getBlFreightChoose(){
		return  blFreightChoose;
	}
	/**
	* 运费承担方式
	*@param  blFreightChoose
	*/
	public void setBlFreightChoose(Integer blFreightChoose ){
		this.blFreightChoose = blFreightChoose;
	}
	
	/**
	* 组合状态 0-关闭/1-开启
	*@return 
	*/
	public Integer getBlState(){
		return  blState;
	}
	/**
	* 组合状态 0-关闭/1-开启
	*@param  blState
	*/
	public void setBlState(Integer blState ){
		this.blState = blState;
	}
	
	/**
	* 店铺名称
	*@return 
	*/
	public Integer getStoreId(){
		return  storeId;
	}
	/**
	* 店铺名称
	*@param  storeId
	*/
	public void setStoreId(Integer storeId ){
		this.storeId = storeId;
	}
	
	/**
	* 组合价格
	*@return 
	*/
	public BigDecimal getBlDiscountPrice(){
		return  blDiscountPrice;
	}
	/**
	* 组合价格
	*@param  blDiscountPrice
	*/
	public void setBlDiscountPrice(BigDecimal blDiscountPrice ){
		this.blDiscountPrice = blDiscountPrice;
	}
	
	/**
	* 运费
	*@return 
	*/
	public BigDecimal getBlFreight(){
		return  blFreight;
	}
	/**
	* 运费
	*@param  blFreight
	*/
	public void setBlFreight(BigDecimal blFreight ){
		this.blFreight = blFreight;
	}
	
	/**
	* 组合名称
	*@return 
	*/
	public String getBlName(){
		return  blName;
	}
	/**
	* 组合名称
	*@param  blName
	*/
	public void setBlName(String blName ){
		this.blName = blName;
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
