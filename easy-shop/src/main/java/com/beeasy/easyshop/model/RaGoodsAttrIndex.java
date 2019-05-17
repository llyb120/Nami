package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_goods_attr_index")
public class RaGoodsAttrIndex   {
	
	/*
	属性值id
	*/
	private Integer attrValueId ;
	/*
	商品分类id
	*/
	private Integer gcId ;
	/*
	商品id
	*/
	private Integer goodsId ;
	/*
	属性id
	*/
	private Integer attrId ;
	/*
	商品公共表id
	*/
	private Integer goodsCommonid ;
	/*
	类型id
	*/
	private Integer typeId ;
	
	public RaGoodsAttrIndex() {
	}
	
	/**
	* 属性值id
	*@return 
	*/
	public Integer getAttrValueId(){
		return  attrValueId;
	}
	/**
	* 属性值id
	*@param  attrValueId
	*/
	public void setAttrValueId(Integer attrValueId ){
		this.attrValueId = attrValueId;
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
	* 属性id
	*@return 
	*/
	public Integer getAttrId(){
		return  attrId;
	}
	/**
	* 属性id
	*@param  attrId
	*/
	public void setAttrId(Integer attrId ){
		this.attrId = attrId;
	}
	
	/**
	* 商品公共表id
	*@return 
	*/
	public Integer getGoodsCommonid(){
		return  goodsCommonid;
	}
	/**
	* 商品公共表id
	*@param  goodsCommonid
	*/
	public void setGoodsCommonid(Integer goodsCommonid ){
		this.goodsCommonid = goodsCommonid;
	}
	
	/**
	* 类型id
	*@return 
	*/
	public Integer getTypeId(){
		return  typeId;
	}
	/**
	* 类型id
	*@param  typeId
	*/
	public void setTypeId(Integer typeId ){
		this.typeId = typeId;
	}
	

}
