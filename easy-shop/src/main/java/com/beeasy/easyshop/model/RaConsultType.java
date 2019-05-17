package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_consult_type")
public class RaConsultType   {
	
	/*
	咨询类型id
	*/
	private Integer ctId ;
	/*
	咨询类型排序
	*/
	private Integer ctSort ;
	/*
	咨询类型详细介绍
	*/
	private String ctIntroduce ;
	/*
	咨询类型名称
	*/
	private String ctName ;
	
	public RaConsultType() {
	}
	
	/**
	* 咨询类型id
	*@return 
	*/
	public Integer getCtId(){
		return  ctId;
	}
	/**
	* 咨询类型id
	*@param  ctId
	*/
	public void setCtId(Integer ctId ){
		this.ctId = ctId;
	}
	
	/**
	* 咨询类型排序
	*@return 
	*/
	public Integer getCtSort(){
		return  ctSort;
	}
	/**
	* 咨询类型排序
	*@param  ctSort
	*/
	public void setCtSort(Integer ctSort ){
		this.ctSort = ctSort;
	}
	
	/**
	* 咨询类型详细介绍
	*@return 
	*/
	public String getCtIntroduce(){
		return  ctIntroduce;
	}
	/**
	* 咨询类型详细介绍
	*@param  ctIntroduce
	*/
	public void setCtIntroduce(String ctIntroduce ){
		this.ctIntroduce = ctIntroduce;
	}
	
	/**
	* 咨询类型名称
	*@return 
	*/
	public String getCtName(){
		return  ctName;
	}
	/**
	* 咨询类型名称
	*@param  ctName
	*/
	public void setCtName(String ctName ){
		this.ctName = ctName;
	}
	

}
