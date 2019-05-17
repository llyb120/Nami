package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_goods_images")
public class RaGoodsImages   {
	
	// alias
	public static final String ALIAS_goods_image_id = "goods_image_id";
	public static final String ALIAS_color_id = "color_id";
	public static final String ALIAS_goods_commonid = "goods_commonid";
	public static final String ALIAS_goods_image_sort = "goods_image_sort";
	public static final String ALIAS_is_default = "is_default";
	public static final String ALIAS_store_id = "store_id";
	public static final String ALIAS_goods_image = "goods_image";
	
	/*
	商品图片id
	*/
	private Integer goods_image_id ;
	/*
	颜色规格值id
	*/
	private Integer color_id ;
	/*
	商品公共内容id
	*/
	private Integer goods_commonid ;
	/*
	排序
	*/
	private Integer goods_image_sort ;
	/*
	默认主题，1是，0否
	*/
	private Integer is_default ;
	/*
	店铺id
	*/
	private Integer store_id ;
	/*
	商品图片
	*/
	private String goods_image ;
	
	public RaGoodsImages() {
	}
	
	/**
	* 商品图片id
	*@return 
	*/
	public Integer getGoods_image_id(){
		return  goods_image_id;
	}
	/**
	* 商品图片id
	*@param  goods_image_id
	*/
	public void setGoods_image_id(Integer goods_image_id ){
		this.goods_image_id = goods_image_id;
	}
	
	/**
	* 颜色规格值id
	*@return 
	*/
	public Integer getColor_id(){
		return  color_id;
	}
	/**
	* 颜色规格值id
	*@param  color_id
	*/
	public void setColor_id(Integer color_id ){
		this.color_id = color_id;
	}
	
	/**
	* 商品公共内容id
	*@return 
	*/
	public Integer getGoods_commonid(){
		return  goods_commonid;
	}
	/**
	* 商品公共内容id
	*@param  goods_commonid
	*/
	public void setGoods_commonid(Integer goods_commonid ){
		this.goods_commonid = goods_commonid;
	}
	
	/**
	* 排序
	*@return 
	*/
	public Integer getGoods_image_sort(){
		return  goods_image_sort;
	}
	/**
	* 排序
	*@param  goods_image_sort
	*/
	public void setGoods_image_sort(Integer goods_image_sort ){
		this.goods_image_sort = goods_image_sort;
	}
	
	/**
	* 默认主题，1是，0否
	*@return 
	*/
	public Integer getIs_default(){
		return  is_default;
	}
	/**
	* 默认主题，1是，0否
	*@param  is_default
	*/
	public void setIs_default(Integer is_default ){
		this.is_default = is_default;
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
	

}
