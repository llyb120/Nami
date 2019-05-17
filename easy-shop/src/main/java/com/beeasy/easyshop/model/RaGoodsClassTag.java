package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_goods_class_tag")
public class RaGoodsClassTag   {
	
	/*
	TAGid
	*/
	private Integer gcTagId ;
	/*
	商品分类id
	*/
	private Integer gcId ;
	/*
	一级分类id
	*/
	private Integer gcId1 ;
	/*
	二级分类id
	*/
	private Integer gcId2 ;
	/*
	三级分类id
	*/
	private Integer gcId3 ;
	/*
	类型id
	*/
	private Integer typeId ;
	/*
	分类TAG名称
	*/
	private String gcTagName ;
	/*
	分类TAG值
	*/
	private String gcTagValue ;
	
	public RaGoodsClassTag() {
	}
	
	/**
	* TAGid
	*@return 
	*/
	public Integer getGcTagId(){
		return  gcTagId;
	}
	/**
	* TAGid
	*@param  gcTagId
	*/
	public void setGcTagId(Integer gcTagId ){
		this.gcTagId = gcTagId;
	}
	
	/**
	* 商品分类id
	*@return 
	*/
	public Integer getGcId(){
		return  gcId;
	}
	/**
	* 商品分类id
	*@param  gcId
	*/
	public void setGcId(Integer gcId ){
		this.gcId = gcId;
	}
	
	/**
	* 一级分类id
	*@return 
	*/
	public Integer getGcId1(){
		return  gcId1;
	}
	/**
	* 一级分类id
	*@param  gcId1
	*/
	public void setGcId1(Integer gcId1 ){
		this.gcId1 = gcId1;
	}
	
	/**
	* 二级分类id
	*@return 
	*/
	public Integer getGcId2(){
		return  gcId2;
	}
	/**
	* 二级分类id
	*@param  gcId2
	*/
	public void setGcId2(Integer gcId2 ){
		this.gcId2 = gcId2;
	}
	
	/**
	* 三级分类id
	*@return 
	*/
	public Integer getGcId3(){
		return  gcId3;
	}
	/**
	* 三级分类id
	*@param  gcId3
	*/
	public void setGcId3(Integer gcId3 ){
		this.gcId3 = gcId3;
	}
	
	/**
	* 类型id
	*@return 
	*/
	public Integer getTypeId(){
		return  typeId;
	}
	/**
	* 类型id
	*@param  typeId
	*/
	public void setTypeId(Integer typeId ){
		this.typeId = typeId;
	}
	
	/**
	* 分类TAG名称
	*@return 
	*/
	public String getGcTagName(){
		return  gcTagName;
	}
	/**
	* 分类TAG名称
	*@param  gcTagName
	*/
	public void setGcTagName(String gcTagName ){
		this.gcTagName = gcTagName;
	}
	
	/**
	* 分类TAG值
	*@return 
	*/
	public String getGcTagValue(){
		return  gcTagValue;
	}
	/**
	* 分类TAG值
	*@param  gcTagValue
	*/
	public void setGcTagValue(String gcTagValue ){
		this.gcTagValue = gcTagValue;
	}
	

}
