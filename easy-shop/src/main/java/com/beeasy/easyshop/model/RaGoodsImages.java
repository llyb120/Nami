package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_goods_images")
public class RaGoodsImages   {
	
	/*
	商品图片id
	*/
	private Integer goodsImageId ;
	/*
	颜色规格值id
	*/
	private Integer colorId ;
	/*
	商品公共内容id
	*/
	private Integer goodsCommonid ;
	/*
	排序
	*/
	private Integer goodsImageSort ;
	/*
	默认主题，1是，0否
	*/
	private Integer isDefault ;
	/*
	店铺id
	*/
	private Integer storeId ;
	/*
	商品图片
	*/
	private String goodsImage ;
	
	public RaGoodsImages() {
	}
	
	/**
	* 商品图片id
	*@return 
	*/
	public Integer getGoodsImageId(){
		return  goodsImageId;
	}
	/**
	* 商品图片id
	*@param  goodsImageId
	*/
	public void setGoodsImageId(Integer goodsImageId ){
		this.goodsImageId = goodsImageId;
	}
	
	/**
	* 颜色规格值id
	*@return 
	*/
	public Integer getColorId(){
		return  colorId;
	}
	/**
	* 颜色规格值id
	*@param  colorId
	*/
	public void setColorId(Integer colorId ){
		this.colorId = colorId;
	}
	
	/**
	* 商品公共内容id
	*@return 
	*/
	public Integer getGoodsCommonid(){
		return  goodsCommonid;
	}
	/**
	* 商品公共内容id
	*@param  goodsCommonid
	*/
	public void setGoodsCommonid(Integer goodsCommonid ){
		this.goodsCommonid = goodsCommonid;
	}
	
	/**
	* 排序
	*@return 
	*/
	public Integer getGoodsImageSort(){
		return  goodsImageSort;
	}
	/**
	* 排序
	*@param  goodsImageSort
	*/
	public void setGoodsImageSort(Integer goodsImageSort ){
		this.goodsImageSort = goodsImageSort;
	}
	
	/**
	* 默认主题，1是，0否
	*@return 
	*/
	public Integer getIsDefault(){
		return  isDefault;
	}
	/**
	* 默认主题，1是，0否
	*@param  isDefault
	*/
	public void setIsDefault(Integer isDefault ){
		this.isDefault = isDefault;
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
	

}
