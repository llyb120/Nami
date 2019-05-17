package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_spec_value")
public class RaSpecValue   {
	
	/*
	规格值id
	*/
	private Integer spValueId ;
	/*
	分类id
	*/
	private Integer gcId ;
	/*
	所属规格id
	*/
	private Integer spId ;
	/*
	排序
	*/
	private Integer spValueSort ;
	/*
	店铺id
	*/
	private Integer storeId ;
	/*
	规格颜色
	*/
	private String spValueColor ;
	/*
	规格值名称
	*/
	private String spValueName ;
	
	public RaSpecValue() {
	}
	
	/**
	* 规格值id
	*@return 
	*/
	public Integer getSpValueId(){
		return  spValueId;
	}
	/**
	* 规格值id
	*@param  spValueId
	*/
	public void setSpValueId(Integer spValueId ){
		this.spValueId = spValueId;
	}
	
	/**
	* 分类id
	*@return 
	*/
	public Integer getGcId(){
		return  gcId;
	}
	/**
	* 分类id
	*@param  gcId
	*/
	public void setGcId(Integer gcId ){
		this.gcId = gcId;
	}
	
	/**
	* 所属规格id
	*@return 
	*/
	public Integer getSpId(){
		return  spId;
	}
	/**
	* 所属规格id
	*@param  spId
	*/
	public void setSpId(Integer spId ){
		this.spId = spId;
	}
	
	/**
	* 排序
	*@return 
	*/
	public Integer getSpValueSort(){
		return  spValueSort;
	}
	/**
	* 排序
	*@param  spValueSort
	*/
	public void setSpValueSort(Integer spValueSort ){
		this.spValueSort = spValueSort;
	}
	
	/**
	* 店铺id
	*@return 
	*/
	public Integer getStoreId(){
		return  storeId;
	}
	/**
	* 店铺id
	*@param  storeId
	*/
	public void setStoreId(Integer storeId ){
		this.storeId = storeId;
	}
	
	/**
	* 规格颜色
	*@return 
	*/
	public String getSpValueColor(){
		return  spValueColor;
	}
	/**
	* 规格颜色
	*@param  spValueColor
	*/
	public void setSpValueColor(String spValueColor ){
		this.spValueColor = spValueColor;
	}
	
	/**
	* 规格值名称
	*@return 
	*/
	public String getSpValueName(){
		return  spValueName;
	}
	/**
	* 规格值名称
	*@param  spValueName
	*/
	public void setSpValueName(String spValueName ){
		this.spValueName = spValueName;
	}
	

}
