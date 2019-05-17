package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_sns_goods")
public class RaSnsGoods   {
	
	/*
	添加时间
	*/
	private Integer snsgoodsAddtime ;
	/*
	商品ID
	*/
	private Integer snsgoodsGoodsid ;
	/*
	喜欢数
	*/
	private Integer snsgoodsLikenum ;
	/*
	分享数
	*/
	private Integer snsgoodsSharenum ;
	/*
	店铺ID
	*/
	private Integer snsgoodsStoreid ;
	/*
	商品图片
	*/
	private String snsgoodsGoodsimage ;
	/*
	商品名称
	*/
	private String snsgoodsGoodsname ;
	/*
	商品价格
	*/
	private BigDecimal snsgoodsGoodsprice ;
	/*
	喜欢过的会员ID，用逗号分隔
	*/
	private String snsgoodsLikemember ;
	/*
	店铺名称
	*/
	private String snsgoodsStorename ;
	
	public RaSnsGoods() {
	}
	
	/**
	* 添加时间
	*@return 
	*/
	public Integer getSnsgoodsAddtime(){
		return  snsgoodsAddtime;
	}
	/**
	* 添加时间
	*@param  snsgoodsAddtime
	*/
	public void setSnsgoodsAddtime(Integer snsgoodsAddtime ){
		this.snsgoodsAddtime = snsgoodsAddtime;
	}
	
	/**
	* 商品ID
	*@return 
	*/
	public Integer getSnsgoodsGoodsid(){
		return  snsgoodsGoodsid;
	}
	/**
	* 商品ID
	*@param  snsgoodsGoodsid
	*/
	public void setSnsgoodsGoodsid(Integer snsgoodsGoodsid ){
		this.snsgoodsGoodsid = snsgoodsGoodsid;
	}
	
	/**
	* 喜欢数
	*@return 
	*/
	public Integer getSnsgoodsLikenum(){
		return  snsgoodsLikenum;
	}
	/**
	* 喜欢数
	*@param  snsgoodsLikenum
	*/
	public void setSnsgoodsLikenum(Integer snsgoodsLikenum ){
		this.snsgoodsLikenum = snsgoodsLikenum;
	}
	
	/**
	* 分享数
	*@return 
	*/
	public Integer getSnsgoodsSharenum(){
		return  snsgoodsSharenum;
	}
	/**
	* 分享数
	*@param  snsgoodsSharenum
	*/
	public void setSnsgoodsSharenum(Integer snsgoodsSharenum ){
		this.snsgoodsSharenum = snsgoodsSharenum;
	}
	
	/**
	* 店铺ID
	*@return 
	*/
	public Integer getSnsgoodsStoreid(){
		return  snsgoodsStoreid;
	}
	/**
	* 店铺ID
	*@param  snsgoodsStoreid
	*/
	public void setSnsgoodsStoreid(Integer snsgoodsStoreid ){
		this.snsgoodsStoreid = snsgoodsStoreid;
	}
	
	/**
	* 商品图片
	*@return 
	*/
	public String getSnsgoodsGoodsimage(){
		return  snsgoodsGoodsimage;
	}
	/**
	* 商品图片
	*@param  snsgoodsGoodsimage
	*/
	public void setSnsgoodsGoodsimage(String snsgoodsGoodsimage ){
		this.snsgoodsGoodsimage = snsgoodsGoodsimage;
	}
	
	/**
	* 商品名称
	*@return 
	*/
	public String getSnsgoodsGoodsname(){
		return  snsgoodsGoodsname;
	}
	/**
	* 商品名称
	*@param  snsgoodsGoodsname
	*/
	public void setSnsgoodsGoodsname(String snsgoodsGoodsname ){
		this.snsgoodsGoodsname = snsgoodsGoodsname;
	}
	
	/**
	* 商品价格
	*@return 
	*/
	public BigDecimal getSnsgoodsGoodsprice(){
		return  snsgoodsGoodsprice;
	}
	/**
	* 商品价格
	*@param  snsgoodsGoodsprice
	*/
	public void setSnsgoodsGoodsprice(BigDecimal snsgoodsGoodsprice ){
		this.snsgoodsGoodsprice = snsgoodsGoodsprice;
	}
	
	/**
	* 喜欢过的会员ID，用逗号分隔
	*@return 
	*/
	public String getSnsgoodsLikemember(){
		return  snsgoodsLikemember;
	}
	/**
	* 喜欢过的会员ID，用逗号分隔
	*@param  snsgoodsLikemember
	*/
	public void setSnsgoodsLikemember(String snsgoodsLikemember ){
		this.snsgoodsLikemember = snsgoodsLikemember;
	}
	
	/**
	* 店铺名称
	*@return 
	*/
	public String getSnsgoodsStorename(){
		return  snsgoodsStorename;
	}
	/**
	* 店铺名称
	*@param  snsgoodsStorename
	*/
	public void setSnsgoodsStorename(String snsgoodsStorename ){
		this.snsgoodsStorename = snsgoodsStorename;
	}
	

}
