package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_p_mansong_rule")
public class RaPMansongRule   {
	
	/*
	规则编号
	*/
	private Integer ruleId ;
	/*
	减现金优惠金额
	*/
	private Integer discount ;
	/*
	商品编号
	*/
	private Integer goodsId ;
	/*
	活动编号
	*/
	private Integer mansongId ;
	/*
	级别价格
	*/
	private Integer price ;
	private Integer voucherTId ;
	/*
	礼品名称
	*/
	private String mansongGoodsName ;
	
	public RaPMansongRule() {
	}
	
	/**
	* 规则编号
	*@return 
	*/
	public Integer getRuleId(){
		return  ruleId;
	}
	/**
	* 规则编号
	*@param  ruleId
	*/
	public void setRuleId(Integer ruleId ){
		this.ruleId = ruleId;
	}
	
	/**
	* 减现金优惠金额
	*@return 
	*/
	public Integer getDiscount(){
		return  discount;
	}
	/**
	* 减现金优惠金额
	*@param  discount
	*/
	public void setDiscount(Integer discount ){
		this.discount = discount;
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
	* 活动编号
	*@return 
	*/
	public Integer getMansongId(){
		return  mansongId;
	}
	/**
	* 活动编号
	*@param  mansongId
	*/
	public void setMansongId(Integer mansongId ){
		this.mansongId = mansongId;
	}
	
	/**
	* 级别价格
	*@return 
	*/
	public Integer getPrice(){
		return  price;
	}
	/**
	* 级别价格
	*@param  price
	*/
	public void setPrice(Integer price ){
		this.price = price;
	}
	
	public Integer getVoucherTId(){
		return  voucherTId;
	}
	public void setVoucherTId(Integer voucherTId ){
		this.voucherTId = voucherTId;
	}
	
	/**
	* 礼品名称
	*@return 
	*/
	public String getMansongGoodsName(){
		return  mansongGoodsName;
	}
	/**
	* 礼品名称
	*@param  mansongGoodsName
	*/
	public void setMansongGoodsName(String mansongGoodsName ){
		this.mansongGoodsName = mansongGoodsName;
	}
	

}
