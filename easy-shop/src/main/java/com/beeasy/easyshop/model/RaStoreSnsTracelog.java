package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_store_sns_tracelog")
public class RaStoreSnsTracelog   {
	
	/*
	店铺动态id
	*/
	private Integer straceId ;
	/*
	评论数量
	*/
	private Integer straceComment ;
	/*
	赞数量
	*/
	private Integer straceCool ;
	/*
	转播数量
	*/
	private Integer straceSpread ;
	/*
	动态状态 1正常，0屏蔽
	*/
	private Integer straceState ;
	/*
	店铺id
	*/
	private Integer straceStoreid ;
	/*
	1=relay,2=normal,3=new,4=coupon,5=xianshi,6=mansong,7=bundling,8=groupbuy,9=recommend,10=hotsell
	*/
	private Integer straceType ;
	/*
	发表内容
	*/
	private String straceContent ;
	/*
	商品信息
	*/
	private String straceGoodsdata ;
	/*
	店标
	*/
	private String straceStorelogo ;
	/*
	店铺名称
	*/
	private String straceStorename ;
	/*
	发表时间
	*/
	private String straceTime ;
	/*
	动态标题
	*/
	private String straceTitle ;
	
	public RaStoreSnsTracelog() {
	}
	
	/**
	* 店铺动态id
	*@return 
	*/
	public Integer getStraceId(){
		return  straceId;
	}
	/**
	* 店铺动态id
	*@param  straceId
	*/
	public void setStraceId(Integer straceId ){
		this.straceId = straceId;
	}
	
	/**
	* 评论数量
	*@return 
	*/
	public Integer getStraceComment(){
		return  straceComment;
	}
	/**
	* 评论数量
	*@param  straceComment
	*/
	public void setStraceComment(Integer straceComment ){
		this.straceComment = straceComment;
	}
	
	/**
	* 赞数量
	*@return 
	*/
	public Integer getStraceCool(){
		return  straceCool;
	}
	/**
	* 赞数量
	*@param  straceCool
	*/
	public void setStraceCool(Integer straceCool ){
		this.straceCool = straceCool;
	}
	
	/**
	* 转播数量
	*@return 
	*/
	public Integer getStraceSpread(){
		return  straceSpread;
	}
	/**
	* 转播数量
	*@param  straceSpread
	*/
	public void setStraceSpread(Integer straceSpread ){
		this.straceSpread = straceSpread;
	}
	
	/**
	* 动态状态 1正常，0屏蔽
	*@return 
	*/
	public Integer getStraceState(){
		return  straceState;
	}
	/**
	* 动态状态 1正常，0屏蔽
	*@param  straceState
	*/
	public void setStraceState(Integer straceState ){
		this.straceState = straceState;
	}
	
	/**
	* 店铺id
	*@return 
	*/
	public Integer getStraceStoreid(){
		return  straceStoreid;
	}
	/**
	* 店铺id
	*@param  straceStoreid
	*/
	public void setStraceStoreid(Integer straceStoreid ){
		this.straceStoreid = straceStoreid;
	}
	
	/**
	* 1=relay,2=normal,3=new,4=coupon,5=xianshi,6=mansong,7=bundling,8=groupbuy,9=recommend,10=hotsell
	*@return 
	*/
	public Integer getStraceType(){
		return  straceType;
	}
	/**
	* 1=relay,2=normal,3=new,4=coupon,5=xianshi,6=mansong,7=bundling,8=groupbuy,9=recommend,10=hotsell
	*@param  straceType
	*/
	public void setStraceType(Integer straceType ){
		this.straceType = straceType;
	}
	
	/**
	* 发表内容
	*@return 
	*/
	public String getStraceContent(){
		return  straceContent;
	}
	/**
	* 发表内容
	*@param  straceContent
	*/
	public void setStraceContent(String straceContent ){
		this.straceContent = straceContent;
	}
	
	/**
	* 商品信息
	*@return 
	*/
	public String getStraceGoodsdata(){
		return  straceGoodsdata;
	}
	/**
	* 商品信息
	*@param  straceGoodsdata
	*/
	public void setStraceGoodsdata(String straceGoodsdata ){
		this.straceGoodsdata = straceGoodsdata;
	}
	
	/**
	* 店标
	*@return 
	*/
	public String getStraceStorelogo(){
		return  straceStorelogo;
	}
	/**
	* 店标
	*@param  straceStorelogo
	*/
	public void setStraceStorelogo(String straceStorelogo ){
		this.straceStorelogo = straceStorelogo;
	}
	
	/**
	* 店铺名称
	*@return 
	*/
	public String getStraceStorename(){
		return  straceStorename;
	}
	/**
	* 店铺名称
	*@param  straceStorename
	*/
	public void setStraceStorename(String straceStorename ){
		this.straceStorename = straceStorename;
	}
	
	/**
	* 发表时间
	*@return 
	*/
	public String getStraceTime(){
		return  straceTime;
	}
	/**
	* 发表时间
	*@param  straceTime
	*/
	public void setStraceTime(String straceTime ){
		this.straceTime = straceTime;
	}
	
	/**
	* 动态标题
	*@return 
	*/
	public String getStraceTitle(){
		return  straceTitle;
	}
	/**
	* 动态标题
	*@param  straceTitle
	*/
	public void setStraceTitle(String straceTitle ){
		this.straceTitle = straceTitle;
	}
	

}
