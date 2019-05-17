package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_cart")
public class RaCart   {
	
	// alias
	public static final String ALIAS_cart_id = "cart_id";
	public static final String ALIAS_bl_id = "bl_id";
	public static final String ALIAS_buyer_id = "buyer_id";
	public static final String ALIAS_checked = "checked";
	public static final String ALIAS_goods_id = "goods_id";
	public static final String ALIAS_goods_num = "goods_num";
	public static final String ALIAS_store_id = "store_id";
	public static final String ALIAS_goods_image = "goods_image";
	public static final String ALIAS_goods_name = "goods_name";
	public static final String ALIAS_goods_price = "goods_price";
	public static final String ALIAS_store_name = "store_name";
	
	/*
	购物车id
	*/
	private Integer cart_id ;
	/*
	组合套装ID
	*/
	private Integer bl_id ;
	/*
	买家id
	*/
	private Integer buyer_id ;
	private Integer checked ;
	/*
	商品id
	*/
	private Integer goods_id ;
	/*
	购买商品数量
	*/
	private Integer goods_num ;
	/*
	店铺id
	*/
	private Integer store_id ;
	/*
	商品图片
	*/
	private String goods_image ;
	/*
	商品名称
	*/
	private String goods_name ;
	/*
	商品价格
	*/
	private BigDecimal goods_price ;
	/*
	店铺名称
	*/
	private String store_name ;
	
	public RaCart() {
	}
	
	/**
	* 购物车id
	*@return 
	*/
	public Integer getCart_id(){
		return  cart_id;
	}
	/**
	* 购物车id
	*@param  cart_id
	*/
	public void setCart_id(Integer cart_id ){
		this.cart_id = cart_id;
	}
	
	/**
	* 组合套装ID
	*@return 
	*/
	public Integer getBl_id(){
		return  bl_id;
	}
	/**
	* 组合套装ID
	*@param  bl_id
	*/
	public void setBl_id(Integer bl_id ){
		this.bl_id = bl_id;
	}
	
	/**
	* 买家id
	*@return 
	*/
	public Integer getBuyer_id(){
		return  buyer_id;
	}
	/**
	* 买家id
	*@param  buyer_id
	*/
	public void setBuyer_id(Integer buyer_id ){
		this.buyer_id = buyer_id;
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
	public Integer getGoods_id(){
		return  goods_id;
	}
	/**
	* 商品id
	*@param  goods_id
	*/
	public void setGoods_id(Integer goods_id ){
		this.goods_id = goods_id;
	}
	
	/**
	* 购买商品数量
	*@return 
	*/
	public Integer getGoods_num(){
		return  goods_num;
	}
	/**
	* 购买商品数量
	*@param  goods_num
	*/
	public void setGoods_num(Integer goods_num ){
		this.goods_num = goods_num;
	}
	
	/**
	* 店铺id
	*@return 
	*/
	public Integer getStore_id(){
		return  store_id;
	}
	/**
	* 店铺id
	*@param  store_id
	*/
	public void setStore_id(Integer store_id ){
		this.store_id = store_id;
	}
	
	/**
	* 商品图片
	*@return 
	*/
	public String getGoods_image(){
		return  goods_image;
	}
	/**
	* 商品图片
	*@param  goods_image
	*/
	public void setGoods_image(String goods_image ){
		this.goods_image = goods_image;
	}
	
	/**
	* 商品名称
	*@return 
	*/
	public String getGoods_name(){
		return  goods_name;
	}
	/**
	* 商品名称
	*@param  goods_name
	*/
	public void setGoods_name(String goods_name ){
		this.goods_name = goods_name;
	}
	
	/**
	* 商品价格
	*@return 
	*/
	public BigDecimal getGoods_price(){
		return  goods_price;
	}
	/**
	* 商品价格
	*@param  goods_price
	*/
	public void setGoods_price(BigDecimal goods_price ){
		this.goods_price = goods_price;
	}
	
	/**
	* 店铺名称
	*@return 
	*/
	public String getStore_name(){
		return  store_name;
	}
	/**
	* 店铺名称
	*@param  store_name
	*/
	public void setStore_name(String store_name ){
		this.store_name = store_name;
	}
	

}
