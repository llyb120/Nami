package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_circle_thg")
public class RaCircleThg   {
	
	// alias
	public static final String ALIAS_themegoods_id = "themegoods_id";
	public static final String ALIAS_circle_id = "circle_id";
	public static final String ALIAS_goods_id = "goods_id";
	public static final String ALIAS_reply_id = "reply_id";
	public static final String ALIAS_store_id = "store_id";
	public static final String ALIAS_theme_id = "theme_id";
	public static final String ALIAS_thg_type = "thg_type";
	public static final String ALIAS_goods_image = "goods_image";
	public static final String ALIAS_goods_name = "goods_name";
	public static final String ALIAS_goods_price = "goods_price";
	public static final String ALIAS_thg_url = "thg_url";
	
	/*
	主题商品id
	*/
	private Integer themegoods_id ;
	/*
	圈子id
	*/
	private Integer circle_id ;
	/*
	商品id
	*/
	private Integer goods_id ;
	/*
	回复id
	*/
	private Integer reply_id ;
	/*
	店铺id
	*/
	private Integer store_id ;
	/*
	主题id
	*/
	private Integer theme_id ;
	/*
	商品类型 0为本商城、1为淘宝 默认为0
	*/
	private Integer thg_type ;
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
	商品链接
	*/
	private String thg_url ;
	
	public RaCircleThg() {
	}
	
	/**
	* 主题商品id
	*@return 
	*/
	public Integer getThemegoods_id(){
		return  themegoods_id;
	}
	/**
	* 主题商品id
	*@param  themegoods_id
	*/
	public void setThemegoods_id(Integer themegoods_id ){
		this.themegoods_id = themegoods_id;
	}
	
	/**
	* 圈子id
	*@return 
	*/
	public Integer getCircle_id(){
		return  circle_id;
	}
	/**
	* 圈子id
	*@param  circle_id
	*/
	public void setCircle_id(Integer circle_id ){
		this.circle_id = circle_id;
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
	* 回复id
	*@return 
	*/
	public Integer getReply_id(){
		return  reply_id;
	}
	/**
	* 回复id
	*@param  reply_id
	*/
	public void setReply_id(Integer reply_id ){
		this.reply_id = reply_id;
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
	* 主题id
	*@return 
	*/
	public Integer getTheme_id(){
		return  theme_id;
	}
	/**
	* 主题id
	*@param  theme_id
	*/
	public void setTheme_id(Integer theme_id ){
		this.theme_id = theme_id;
	}
	
	/**
	* 商品类型 0为本商城、1为淘宝 默认为0
	*@return 
	*/
	public Integer getThg_type(){
		return  thg_type;
	}
	/**
	* 商品类型 0为本商城、1为淘宝 默认为0
	*@param  thg_type
	*/
	public void setThg_type(Integer thg_type ){
		this.thg_type = thg_type;
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
	* 商品链接
	*@return 
	*/
	public String getThg_url(){
		return  thg_url;
	}
	/**
	* 商品链接
	*@param  thg_url
	*/
	public void setThg_url(String thg_url ){
		this.thg_url = thg_url;
	}
	

}
