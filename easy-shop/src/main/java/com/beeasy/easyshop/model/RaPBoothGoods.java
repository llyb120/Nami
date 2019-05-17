package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_p_booth_goods")
public class RaPBoothGoods   {
	
	// alias
	public static final String ALIAS_booth_goods_id = "booth_goods_id";
	public static final String ALIAS_booth_state = "booth_state";
	public static final String ALIAS_gc_id = "gc_id";
	public static final String ALIAS_goods_id = "goods_id";
	public static final String ALIAS_store_id = "store_id";
	
	/*
	套餐商品id
	*/
	private Integer booth_goods_id ;
	/*
	套餐状态 1开启 0关闭 默认1
	*/
	private Integer booth_state ;
	/*
	商品分类id
	*/
	private Integer gc_id ;
	/*
	商品id
	*/
	private Integer goods_id ;
	/*
	店铺id
	*/
	private Integer store_id ;
	
	public RaPBoothGoods() {
	}
	
	/**
	* 套餐商品id
	*@return 
	*/
	public Integer getBooth_goods_id(){
		return  booth_goods_id;
	}
	/**
	* 套餐商品id
	*@param  booth_goods_id
	*/
	public void setBooth_goods_id(Integer booth_goods_id ){
		this.booth_goods_id = booth_goods_id;
	}
	
	/**
	* 套餐状态 1开启 0关闭 默认1
	*@return 
	*/
	public Integer getBooth_state(){
		return  booth_state;
	}
	/**
	* 套餐状态 1开启 0关闭 默认1
	*@param  booth_state
	*/
	public void setBooth_state(Integer booth_state ){
		this.booth_state = booth_state;
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
	

}
