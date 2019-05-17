package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_goods_gift")
public class RaGoodsGift   {
	
	/*
	赠品id 
	*/
	private Integer giftId ;
	/*
	赠品数量
	*/
	private Integer giftAmount ;
	/*
	赠品商品id 
	*/
	private Integer giftGoodsid ;
	/*
	主商品公共id
	*/
	private Integer goodsCommonid ;
	/*
	主商品id
	*/
	private Integer goodsId ;
	/*
	主商品图片
	*/
	private String giftGoodsimage ;
	/*
	主商品名称
	*/
	private String giftGoodsname ;
	
	public RaGoodsGift() {
	}
	
	/**
	* 赠品id 
	*@return 
	*/
	public Integer getGiftId(){
		return  giftId;
	}
	/**
	* 赠品id 
	*@param  giftId
	*/
	public void setGiftId(Integer giftId ){
		this.giftId = giftId;
	}
	
	/**
	* 赠品数量
	*@return 
	*/
	public Integer getGiftAmount(){
		return  giftAmount;
	}
	/**
	* 赠品数量
	*@param  giftAmount
	*/
	public void setGiftAmount(Integer giftAmount ){
		this.giftAmount = giftAmount;
	}
	
	/**
	* 赠品商品id 
	*@return 
	*/
	public Integer getGiftGoodsid(){
		return  giftGoodsid;
	}
	/**
	* 赠品商品id 
	*@param  giftGoodsid
	*/
	public void setGiftGoodsid(Integer giftGoodsid ){
		this.giftGoodsid = giftGoodsid;
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
	
	/**
	* 主商品图片
	*@return 
	*/
	public String getGiftGoodsimage(){
		return  giftGoodsimage;
	}
	/**
	* 主商品图片
	*@param  giftGoodsimage
	*/
	public void setGiftGoodsimage(String giftGoodsimage ){
		this.giftGoodsimage = giftGoodsimage;
	}
	
	/**
	* 主商品名称
	*@return 
	*/
	public String getGiftGoodsname(){
		return  giftGoodsname;
	}
	/**
	* 主商品名称
	*@param  giftGoodsname
	*/
	public void setGiftGoodsname(String giftGoodsname ){
		this.giftGoodsname = giftGoodsname;
	}
	

}
