package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_p_bundling_goods")
public class RaPBundlingGoods   {
	
	// alias
	public static final String ALIAS_bl_goods_id = "bl_goods_id";
	public static final String ALIAS_bl_appoint = "bl_appoint";
	public static final String ALIAS_bl_id = "bl_id";
	public static final String ALIAS_goods_id = "goods_id";
	public static final String ALIAS_bl_goods_price = "bl_goods_price";
	public static final String ALIAS_goods_image = "goods_image";
	public static final String ALIAS_goods_name = "goods_name";
	
	/*
	组合商品id
	*/
	private Integer bl_goods_id ;
	/*
	指定商品 1是，0否
	*/
	private Integer bl_appoint ;
	/*
	组合id
	*/
	private Integer bl_id ;
	/*
	商品id
	*/
	private Integer goods_id ;
	/*
	商品价格
	*/
	private BigDecimal bl_goods_price ;
	/*
	商品图片
	*/
	private String goods_image ;
	/*
	商品名称
	*/
	private String goods_name ;
	
	public RaPBundlingGoods() {
	}
	
	/**
	* 组合商品id
	*@return 
	*/
	public Integer getBl_goods_id(){
		return  bl_goods_id;
	}
	/**
	* 组合商品id
	*@param  bl_goods_id
	*/
	public void setBl_goods_id(Integer bl_goods_id ){
		this.bl_goods_id = bl_goods_id;
	}
	
	/**
	* 指定商品 1是，0否
	*@return 
	*/
	public Integer getBl_appoint(){
		return  bl_appoint;
	}
	/**
	* 指定商品 1是，0否
	*@param  bl_appoint
	*/
	public void setBl_appoint(Integer bl_appoint ){
		this.bl_appoint = bl_appoint;
	}
	
	/**
	* 组合id
	*@return 
	*/
	public Integer getBl_id(){
		return  bl_id;
	}
	/**
	* 组合id
	*@param  bl_id
	*/
	public void setBl_id(Integer bl_id ){
		this.bl_id = bl_id;
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
	* 商品价格
	*@return 
	*/
	public BigDecimal getBl_goods_price(){
		return  bl_goods_price;
	}
	/**
	* 商品价格
	*@param  bl_goods_price
	*/
	public void setBl_goods_price(BigDecimal bl_goods_price ){
		this.bl_goods_price = bl_goods_price;
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
	

}
