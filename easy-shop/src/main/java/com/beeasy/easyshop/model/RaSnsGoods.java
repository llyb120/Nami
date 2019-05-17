package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_sns_goods")
public class RaSnsGoods   {
	
	// alias
	public static final String ALIAS_snsgoods_addtime = "snsgoods_addtime";
	public static final String ALIAS_snsgoods_goodsid = "snsgoods_goodsid";
	public static final String ALIAS_snsgoods_likenum = "snsgoods_likenum";
	public static final String ALIAS_snsgoods_sharenum = "snsgoods_sharenum";
	public static final String ALIAS_snsgoods_storeid = "snsgoods_storeid";
	public static final String ALIAS_snsgoods_goodsimage = "snsgoods_goodsimage";
	public static final String ALIAS_snsgoods_goodsname = "snsgoods_goodsname";
	public static final String ALIAS_snsgoods_goodsprice = "snsgoods_goodsprice";
	public static final String ALIAS_snsgoods_likemember = "snsgoods_likemember";
	public static final String ALIAS_snsgoods_storename = "snsgoods_storename";
	
	/*
	添加时间
	*/
	private Integer snsgoods_addtime ;
	/*
	商品ID
	*/
	private Integer snsgoods_goodsid ;
	/*
	喜欢数
	*/
	private Integer snsgoods_likenum ;
	/*
	分享数
	*/
	private Integer snsgoods_sharenum ;
	/*
	店铺ID
	*/
	private Integer snsgoods_storeid ;
	/*
	商品图片
	*/
	private String snsgoods_goodsimage ;
	/*
	商品名称
	*/
	private String snsgoods_goodsname ;
	/*
	商品价格
	*/
	private BigDecimal snsgoods_goodsprice ;
	/*
	喜欢过的会员ID，用逗号分隔
	*/
	private String snsgoods_likemember ;
	/*
	店铺名称
	*/
	private String snsgoods_storename ;
	
	public RaSnsGoods() {
	}
	
	/**
	* 添加时间
	*@return 
	*/
	public Integer getSnsgoods_addtime(){
		return  snsgoods_addtime;
	}
	/**
	* 添加时间
	*@param  snsgoods_addtime
	*/
	public void setSnsgoods_addtime(Integer snsgoods_addtime ){
		this.snsgoods_addtime = snsgoods_addtime;
	}
	
	/**
	* 商品ID
	*@return 
	*/
	public Integer getSnsgoods_goodsid(){
		return  snsgoods_goodsid;
	}
	/**
	* 商品ID
	*@param  snsgoods_goodsid
	*/
	public void setSnsgoods_goodsid(Integer snsgoods_goodsid ){
		this.snsgoods_goodsid = snsgoods_goodsid;
	}
	
	/**
	* 喜欢数
	*@return 
	*/
	public Integer getSnsgoods_likenum(){
		return  snsgoods_likenum;
	}
	/**
	* 喜欢数
	*@param  snsgoods_likenum
	*/
	public void setSnsgoods_likenum(Integer snsgoods_likenum ){
		this.snsgoods_likenum = snsgoods_likenum;
	}
	
	/**
	* 分享数
	*@return 
	*/
	public Integer getSnsgoods_sharenum(){
		return  snsgoods_sharenum;
	}
	/**
	* 分享数
	*@param  snsgoods_sharenum
	*/
	public void setSnsgoods_sharenum(Integer snsgoods_sharenum ){
		this.snsgoods_sharenum = snsgoods_sharenum;
	}
	
	/**
	* 店铺ID
	*@return 
	*/
	public Integer getSnsgoods_storeid(){
		return  snsgoods_storeid;
	}
	/**
	* 店铺ID
	*@param  snsgoods_storeid
	*/
	public void setSnsgoods_storeid(Integer snsgoods_storeid ){
		this.snsgoods_storeid = snsgoods_storeid;
	}
	
	/**
	* 商品图片
	*@return 
	*/
	public String getSnsgoods_goodsimage(){
		return  snsgoods_goodsimage;
	}
	/**
	* 商品图片
	*@param  snsgoods_goodsimage
	*/
	public void setSnsgoods_goodsimage(String snsgoods_goodsimage ){
		this.snsgoods_goodsimage = snsgoods_goodsimage;
	}
	
	/**
	* 商品名称
	*@return 
	*/
	public String getSnsgoods_goodsname(){
		return  snsgoods_goodsname;
	}
	/**
	* 商品名称
	*@param  snsgoods_goodsname
	*/
	public void setSnsgoods_goodsname(String snsgoods_goodsname ){
		this.snsgoods_goodsname = snsgoods_goodsname;
	}
	
	/**
	* 商品价格
	*@return 
	*/
	public BigDecimal getSnsgoods_goodsprice(){
		return  snsgoods_goodsprice;
	}
	/**
	* 商品价格
	*@param  snsgoods_goodsprice
	*/
	public void setSnsgoods_goodsprice(BigDecimal snsgoods_goodsprice ){
		this.snsgoods_goodsprice = snsgoods_goodsprice;
	}
	
	/**
	* 喜欢过的会员ID，用逗号分隔
	*@return 
	*/
	public String getSnsgoods_likemember(){
		return  snsgoods_likemember;
	}
	/**
	* 喜欢过的会员ID，用逗号分隔
	*@param  snsgoods_likemember
	*/
	public void setSnsgoods_likemember(String snsgoods_likemember ){
		this.snsgoods_likemember = snsgoods_likemember;
	}
	
	/**
	* 店铺名称
	*@return 
	*/
	public String getSnsgoods_storename(){
		return  snsgoods_storename;
	}
	/**
	* 店铺名称
	*@param  snsgoods_storename
	*/
	public void setSnsgoods_storename(String snsgoods_storename ){
		this.snsgoods_storename = snsgoods_storename;
	}
	

}
