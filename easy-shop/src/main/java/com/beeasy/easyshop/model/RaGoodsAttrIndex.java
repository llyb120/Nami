package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_goods_attr_index")
public class RaGoodsAttrIndex   {
	
	// alias
	public static final String ALIAS_attr_value_id = "attr_value_id";
	public static final String ALIAS_gc_id = "gc_id";
	public static final String ALIAS_goods_id = "goods_id";
	public static final String ALIAS_attr_id = "attr_id";
	public static final String ALIAS_goods_commonid = "goods_commonid";
	public static final String ALIAS_type_id = "type_id";
	
	/*
	属性值id
	*/
	private Integer attr_value_id ;
	/*
	商品分类id
	*/
	private Integer gc_id ;
	/*
	商品id
	*/
	private Integer goods_id ;
	/*
	属性id
	*/
	private Integer attr_id ;
	/*
	商品公共表id
	*/
	private Integer goods_commonid ;
	/*
	类型id
	*/
	private Integer type_id ;
	
	public RaGoodsAttrIndex() {
	}
	
	/**
	* 属性值id
	*@return 
	*/
	public Integer getAttr_value_id(){
		return  attr_value_id;
	}
	/**
	* 属性值id
	*@param  attr_value_id
	*/
	public void setAttr_value_id(Integer attr_value_id ){
		this.attr_value_id = attr_value_id;
	}
	
	/**
	* 商品分类id
	*@return 
	*/
	public Integer getGc_id(){
		return  gc_id;
	}
	/**
	* 商品分类id
	*@param  gc_id
	*/
	public void setGc_id(Integer gc_id ){
		this.gc_id = gc_id;
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
	* 属性id
	*@return 
	*/
	public Integer getAttr_id(){
		return  attr_id;
	}
	/**
	* 属性id
	*@param  attr_id
	*/
	public void setAttr_id(Integer attr_id ){
		this.attr_id = attr_id;
	}
	
	/**
	* 商品公共表id
	*@return 
	*/
	public Integer getGoods_commonid(){
		return  goods_commonid;
	}
	/**
	* 商品公共表id
	*@param  goods_commonid
	*/
	public void setGoods_commonid(Integer goods_commonid ){
		this.goods_commonid = goods_commonid;
	}
	
	/**
	* 类型id
	*@return 
	*/
	public Integer getType_id(){
		return  type_id;
	}
	/**
	* 类型id
	*@param  type_id
	*/
	public void setType_id(Integer type_id ){
		this.type_id = type_id;
	}
	

}
