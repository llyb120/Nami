package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_p_mansong_rule")
public class RaPMansongRule   {
	
	// alias
	public static final String ALIAS_rule_id = "rule_id";
	public static final String ALIAS_discount = "discount";
	public static final String ALIAS_goods_id = "goods_id";
	public static final String ALIAS_mansong_id = "mansong_id";
	public static final String ALIAS_price = "price";
	public static final String ALIAS_voucher_t_id = "voucher_t_id";
	public static final String ALIAS_mansong_goods_name = "mansong_goods_name";
	
	/*
	规则编号
	*/
	private Integer rule_id ;
	/*
	减现金优惠金额
	*/
	private Integer discount ;
	/*
	商品编号
	*/
	private Integer goods_id ;
	/*
	活动编号
	*/
	private Integer mansong_id ;
	/*
	级别价格
	*/
	private Integer price ;
	private Integer voucher_t_id ;
	/*
	礼品名称
	*/
	private String mansong_goods_name ;
	
	public RaPMansongRule() {
	}
	
	/**
	* 规则编号
	*@return 
	*/
	public Integer getRule_id(){
		return  rule_id;
	}
	/**
	* 规则编号
	*@param  rule_id
	*/
	public void setRule_id(Integer rule_id ){
		this.rule_id = rule_id;
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
	public Integer getGoods_id(){
		return  goods_id;
	}
	/**
	* 商品编号
	*@param  goods_id
	*/
	public void setGoods_id(Integer goods_id ){
		this.goods_id = goods_id;
	}
	
	/**
	* 活动编号
	*@return 
	*/
	public Integer getMansong_id(){
		return  mansong_id;
	}
	/**
	* 活动编号
	*@param  mansong_id
	*/
	public void setMansong_id(Integer mansong_id ){
		this.mansong_id = mansong_id;
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
	
	public Integer getVoucher_t_id(){
		return  voucher_t_id;
	}
	public void setVoucher_t_id(Integer voucher_t_id ){
		this.voucher_t_id = voucher_t_id;
	}
	
	/**
	* 礼品名称
	*@return 
	*/
	public String getMansong_goods_name(){
		return  mansong_goods_name;
	}
	/**
	* 礼品名称
	*@param  mansong_goods_name
	*/
	public void setMansong_goods_name(String mansong_goods_name ){
		this.mansong_goods_name = mansong_goods_name;
	}
	

}
