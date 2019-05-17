package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_goods_class_staple")
public class RaGoodsClassStaple   {
	
	/*
	常用分类id
	*/
	private Integer stapleId ;
	/*
	计数器
	*/
	private Integer counter ;
	/*
	一级分类id
	*/
	private Integer gcId1 ;
	/*
	二级商品分类
	*/
	private Integer gcId2 ;
	/*
	三级商品分类
	*/
	private Integer gcId3 ;
	/*
	会员id
	*/
	private Integer memberId ;
	/*
	类型id
	*/
	private Integer typeId ;
	/*
	常用分类名称
	*/
	private String stapleName ;
	
	public RaGoodsClassStaple() {
	}
	
	/**
	* 常用分类id
	*@return 
	*/
	public Integer getStapleId(){
		return  stapleId;
	}
	/**
	* 常用分类id
	*@param  stapleId
	*/
	public void setStapleId(Integer stapleId ){
		this.stapleId = stapleId;
	}
	
	/**
	* 计数器
	*@return 
	*/
	public Integer getCounter(){
		return  counter;
	}
	/**
	* 计数器
	*@param  counter
	*/
	public void setCounter(Integer counter ){
		this.counter = counter;
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
	* 二级商品分类
	*@return 
	*/
	public Integer getGcId2(){
		return  gcId2;
	}
	/**
	* 二级商品分类
	*@param  gcId2
	*/
	public void setGcId2(Integer gcId2 ){
		this.gcId2 = gcId2;
	}
	
	/**
	* 三级商品分类
	*@return 
	*/
	public Integer getGcId3(){
		return  gcId3;
	}
	/**
	* 三级商品分类
	*@param  gcId3
	*/
	public void setGcId3(Integer gcId3 ){
		this.gcId3 = gcId3;
	}
	
	/**
	* 会员id
	*@return 
	*/
	public Integer getMemberId(){
		return  memberId;
	}
	/**
	* 会员id
	*@param  memberId
	*/
	public void setMemberId(Integer memberId ){
		this.memberId = memberId;
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
	* 常用分类名称
	*@return 
	*/
	public String getStapleName(){
		return  stapleName;
	}
	/**
	* 常用分类名称
	*@param  stapleName
	*/
	public void setStapleName(String stapleName ){
		this.stapleName = stapleName;
	}
	

}
