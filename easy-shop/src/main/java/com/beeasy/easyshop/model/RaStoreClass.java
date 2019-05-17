package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_store_class")
public class RaStoreClass   {
	
	/*
	索引ID
	*/
	private Integer scId ;
	/*
	保证金数额
	*/
	private Integer scBail ;
	/*
	排序
	*/
	private Integer scSort ;
	/*
	分类名称
	*/
	private String scName ;
	
	public RaStoreClass() {
	}
	
	/**
	* 索引ID
	*@return 
	*/
	public Integer getScId(){
		return  scId;
	}
	/**
	* 索引ID
	*@param  scId
	*/
	public void setScId(Integer scId ){
		this.scId = scId;
	}
	
	/**
	* 保证金数额
	*@return 
	*/
	public Integer getScBail(){
		return  scBail;
	}
	/**
	* 保证金数额
	*@param  scBail
	*/
	public void setScBail(Integer scBail ){
		this.scBail = scBail;
	}
	
	/**
	* 排序
	*@return 
	*/
	public Integer getScSort(){
		return  scSort;
	}
	/**
	* 排序
	*@param  scSort
	*/
	public void setScSort(Integer scSort ){
		this.scSort = scSort;
	}
	
	/**
	* 分类名称
	*@return 
	*/
	public String getScName(){
		return  scName;
	}
	/**
	* 分类名称
	*@param  scName
	*/
	public void setScName(String scName ){
		this.scName = scName;
	}
	

}
