package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_goods_fcode")
public class RaGoodsFcode   {
	
	/*
	F码id
	*/
	private Integer fcId ;
	/*
	状态 0未使用，1已使用
	*/
	private Integer fcState ;
	/*
	商品公共id
	*/
	private Integer goodsCommonid ;
	/*
	F码
	*/
	private String fcCode ;
	
	public RaGoodsFcode() {
	}
	
	/**
	* F码id
	*@return 
	*/
	public Integer getFcId(){
		return  fcId;
	}
	/**
	* F码id
	*@param  fcId
	*/
	public void setFcId(Integer fcId ){
		this.fcId = fcId;
	}
	
	/**
	* 状态 0未使用，1已使用
	*@return 
	*/
	public Integer getFcState(){
		return  fcState;
	}
	/**
	* 状态 0未使用，1已使用
	*@param  fcState
	*/
	public void setFcState(Integer fcState ){
		this.fcState = fcState;
	}
	
	/**
	* 商品公共id
	*@return 
	*/
	public Integer getGoodsCommonid(){
		return  goodsCommonid;
	}
	/**
	* 商品公共id
	*@param  goodsCommonid
	*/
	public void setGoodsCommonid(Integer goodsCommonid ){
		this.goodsCommonid = goodsCommonid;
	}
	
	/**
	* F码
	*@return 
	*/
	public String getFcCode(){
		return  fcCode;
	}
	/**
	* F码
	*@param  fcCode
	*/
	public void setFcCode(String fcCode ){
		this.fcCode = fcCode;
	}
	

}
