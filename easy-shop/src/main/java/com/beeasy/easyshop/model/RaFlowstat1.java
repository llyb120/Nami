package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_flowstat_1")
public class RaFlowstat1   {
	
	/*
	访问量
	*/
	private Integer clicknum ;
	/*
	商品ID
	*/
	private Integer goodsId ;
	/*
	访问日期
	*/
	private Integer stattime ;
	/*
	店铺ID
	*/
	private Integer storeId ;
	/*
	类型
	*/
	private String type ;
	
	public RaFlowstat1() {
	}
	
	/**
	* 访问量
	*@return 
	*/
	public Integer getClicknum(){
		return  clicknum;
	}
	/**
	* 访问量
	*@param  clicknum
	*/
	public void setClicknum(Integer clicknum ){
		this.clicknum = clicknum;
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
	* 访问日期
	*@return 
	*/
	public Integer getStattime(){
		return  stattime;
	}
	/**
	* 访问日期
	*@param  stattime
	*/
	public void setStattime(Integer stattime ){
		this.stattime = stattime;
	}
	
	/**
	* 店铺ID
	*@return 
	*/
	public Integer getStoreId(){
		return  storeId;
	}
	/**
	* 店铺ID
	*@param  storeId
	*/
	public void setStoreId(Integer storeId ){
		this.storeId = storeId;
	}
	
	/**
	* 类型
	*@return 
	*/
	public String getType(){
		return  type;
	}
	/**
	* 类型
	*@param  type
	*/
	public void setType(String type ){
		this.type = type;
	}
	

}
