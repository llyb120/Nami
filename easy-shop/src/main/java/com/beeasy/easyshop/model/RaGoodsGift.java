package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_goods_gift")
public class RaGoodsGift   {
	
	// alias
	public static final String ALIAS_gift_id = "gift_id";
	public static final String ALIAS_gift_amount = "gift_amount";
	public static final String ALIAS_gift_goodsid = "gift_goodsid";
	public static final String ALIAS_goods_commonid = "goods_commonid";
	public static final String ALIAS_goods_id = "goods_id";
	public static final String ALIAS_gift_goodsimage = "gift_goodsimage";
	public static final String ALIAS_gift_goodsname = "gift_goodsname";
	
	/*
	赠品id 
	*/
	private Integer gift_id ;
	/*
	赠品数量
	*/
	private Integer gift_amount ;
	/*
	赠品商品id 
	*/
	private Integer gift_goodsid ;
	/*
	主商品公共id
	*/
	private Integer goods_commonid ;
	/*
	主商品id
	*/
	private Integer goods_id ;
	/*
	主商品图片
	*/
	private String gift_goodsimage ;
	/*
	主商品名称
	*/
	private String gift_goodsname ;
	
	public RaGoodsGift() {
	}
	
	/**
	* 赠品id 
	*@return 
	*/
	public Integer getGift_id(){
		return  gift_id;
	}
	/**
	* 赠品id 
	*@param  gift_id
	*/
	public void setGift_id(Integer gift_id ){
		this.gift_id = gift_id;
	}
	
	/**
	* 赠品数量
	*@return 
	*/
	public Integer getGift_amount(){
		return  gift_amount;
	}
	/**
	* 赠品数量
	*@param  gift_amount
	*/
	public void setGift_amount(Integer gift_amount ){
		this.gift_amount = gift_amount;
	}
	
	/**
	* 赠品商品id 
	*@return 
	*/
	public Integer getGift_goodsid(){
		return  gift_goodsid;
	}
	/**
	* 赠品商品id 
	*@param  gift_goodsid
	*/
	public void setGift_goodsid(Integer gift_goodsid ){
		this.gift_goodsid = gift_goodsid;
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
	
	/**
	* 主商品图片
	*@return 
	*/
	public String getGift_goodsimage(){
		return  gift_goodsimage;
	}
	/**
	* 主商品图片
	*@param  gift_goodsimage
	*/
	public void setGift_goodsimage(String gift_goodsimage ){
		this.gift_goodsimage = gift_goodsimage;
	}
	
	/**
	* 主商品名称
	*@return 
	*/
	public String getGift_goodsname(){
		return  gift_goodsname;
	}
	/**
	* 主商品名称
	*@param  gift_goodsname
	*/
	public void setGift_goodsname(String gift_goodsname ){
		this.gift_goodsname = gift_goodsname;
	}
	

}
