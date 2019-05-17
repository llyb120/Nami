package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_goods_combo")
public class RaGoodsCombo   {
	
	/*
	推荐组合id 
	*/
	private Integer comboId ;
	/*
	推荐组合商品id
	*/
	private Integer comboGoodsid ;
	/*
	主商品公共id
	*/
	private Integer goodsCommonid ;
	/*
	主商品id
	*/
	private Integer goodsId ;
	
	public RaGoodsCombo() {
	}
	
	/**
	* 推荐组合id 
	*@return 
	*/
	public Integer getComboId(){
		return  comboId;
	}
	/**
	* 推荐组合id 
	*@param  comboId
	*/
	public void setComboId(Integer comboId ){
		this.comboId = comboId;
	}
	
	/**
	* 推荐组合商品id
	*@return 
	*/
	public Integer getComboGoodsid(){
		return  comboGoodsid;
	}
	/**
	* 推荐组合商品id
	*@param  comboGoodsid
	*/
	public void setComboGoodsid(Integer comboGoodsid ){
		this.comboGoodsid = comboGoodsid;
	}
	
	/**
	* 主商品公共id
	*@return 
	*/
	public Integer getGoodsCommonid(){
		return  goodsCommonid;
	}
	/**
	* 主商品公共id
	*@param  goodsCommonid
	*/
	public void setGoodsCommonid(Integer goodsCommonid ){
		this.goodsCommonid = goodsCommonid;
	}
	
	/**
	* 主商品id
	*@return 
	*/
	public Integer getGoodsId(){
		return  goodsId;
	}
	/**
	* 主商品id
	*@param  goodsId
	*/
	public void setGoodsId(Integer goodsId ){
		this.goodsId = goodsId;
	}
	

}
