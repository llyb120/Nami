package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_goods_browse")
public class RaGoodsBrowse   {
	
	private Integer browseId ;
	/*
	浏览时间
	*/
	private Integer browsetime ;
	/*
	商品分类
	*/
	private Integer gcId ;
	/*
	商品一级分类
	*/
	private Integer gcId1 ;
	/*
	商品二级分类
	*/
	private Integer gcId2 ;
	/*
	商品三级分类
	*/
	private Integer gcId3 ;
	/*
	商品ID
	*/
	private Integer goodsId ;
	/*
	会员ID
	*/
	private Integer memberId ;
	
	public RaGoodsBrowse() {
	}
	
	public Integer getBrowseId(){
		return  browseId;
	}
	public void setBrowseId(Integer browseId ){
		this.browseId = browseId;
	}
	
	/**
	* 浏览时间
	*@return 
	*/
	public Integer getBrowsetime(){
		return  browsetime;
	}
	/**
	* 浏览时间
	*@param  browsetime
	*/
	public void setBrowsetime(Integer browsetime ){
		this.browsetime = browsetime;
	}
	
	/**
	* 商品分类
	*@return 
	*/
	public Integer getGcId(){
		return  gcId;
	}
	/**
	* 商品分类
	*@param  gcId
	*/
	public void setGcId(Integer gcId ){
		this.gcId = gcId;
	}
	
	/**
	* 商品一级分类
	*@return 
	*/
	public Integer getGcId1(){
		return  gcId1;
	}
	/**
	* 商品一级分类
	*@param  gcId1
	*/
	public void setGcId1(Integer gcId1 ){
		this.gcId1 = gcId1;
	}
	
	/**
	* 商品二级分类
	*@return 
	*/
	public Integer getGcId2(){
		return  gcId2;
	}
	/**
	* 商品二级分类
	*@param  gcId2
	*/
	public void setGcId2(Integer gcId2 ){
		this.gcId2 = gcId2;
	}
	
	/**
	* 商品三级分类
	*@return 
	*/
	public Integer getGcId3(){
		return  gcId3;
	}
	/**
	* 商品三级分类
	*@param  gcId3
	*/
	public void setGcId3(Integer gcId3 ){
		this.gcId3 = gcId3;
	}
	
	/**
	* 商品ID
	*@return 
	*/
	public Integer getGoodsId(){
		return  goodsId;
	}
	/**
	* 商品ID
	*@param  goodsId
	*/
	public void setGoodsId(Integer goodsId ){
		this.goodsId = goodsId;
	}
	
	/**
	* 会员ID
	*@return 
	*/
	public Integer getMemberId(){
		return  memberId;
	}
	/**
	* 会员ID
	*@param  memberId
	*/
	public void setMemberId(Integer memberId ){
		this.memberId = memberId;
	}
	

}
