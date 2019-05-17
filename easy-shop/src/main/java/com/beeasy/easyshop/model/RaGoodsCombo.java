package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_goods_combo")
public class RaGoodsCombo   {
	
	// alias
	public static final String ALIAS_combo_id = "combo_id";
	public static final String ALIAS_combo_goodsid = "combo_goodsid";
	public static final String ALIAS_goods_commonid = "goods_commonid";
	public static final String ALIAS_goods_id = "goods_id";
	
	/*
	推荐组合id 
	*/
	private Integer combo_id ;
	/*
	推荐组合商品id
	*/
	private Integer combo_goodsid ;
	/*
	主商品公共id
	*/
	private Integer goods_commonid ;
	/*
	主商品id
	*/
	private Integer goods_id ;
	
	public RaGoodsCombo() {
	}
	
	/**
	* 推荐组合id 
	*@return 
	*/
	public Integer getCombo_id(){
		return  combo_id;
	}
	/**
	* 推荐组合id 
	*@param  combo_id
	*/
	public void setCombo_id(Integer combo_id ){
		this.combo_id = combo_id;
	}
	
	/**
	* 推荐组合商品id
	*@return 
	*/
	public Integer getCombo_goodsid(){
		return  combo_goodsid;
	}
	/**
	* 推荐组合商品id
	*@param  combo_goodsid
	*/
	public void setCombo_goodsid(Integer combo_goodsid ){
		this.combo_goodsid = combo_goodsid;
	}
	
	/**
	* 主商品公共id
	*@return 
	*/
	public Integer getGoods_commonid(){
		return  goods_commonid;
	}
	/**
	* 主商品公共id
	*@param  goods_commonid
	*/
	public void setGoods_commonid(Integer goods_commonid ){
		this.goods_commonid = goods_commonid;
	}
	
	/**
	* 主商品id
	*@return 
	*/
	public Integer getGoods_id(){
		return  goods_id;
	}
	/**
	* 主商品id
	*@param  goods_id
	*/
	public void setGoods_id(Integer goods_id ){
		this.goods_id = goods_id;
	}
	

}
