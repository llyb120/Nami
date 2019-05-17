package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_mall_consult_type")
public class RaMallConsultType   {
	
	/*
	平台客服咨询类型id
	*/
	private Integer mctId ;
	/*
	咨询类型排序
	*/
	private Integer mctSort ;
	/*
	平台客服咨询类型备注
	*/
	private String mctIntroduce ;
	/*
	咨询类型名称
	*/
	private String mctName ;
	
	public RaMallConsultType() {
	}
	
	/**
	* 平台客服咨询类型id
	*@return 
	*/
	public Integer getMctId(){
		return  mctId;
	}
	/**
	* 平台客服咨询类型id
	*@param  mctId
	*/
	public void setMctId(Integer mctId ){
		this.mctId = mctId;
	}
	
	/**
	* 咨询类型排序
	*@return 
	*/
	public Integer getMctSort(){
		return  mctSort;
	}
	/**
	* 咨询类型排序
	*@param  mctSort
	*/
	public void setMctSort(Integer mctSort ){
		this.mctSort = mctSort;
	}
	
	/**
	* 平台客服咨询类型备注
	*@return 
	*/
	public String getMctIntroduce(){
		return  mctIntroduce;
	}
	/**
	* 平台客服咨询类型备注
	*@param  mctIntroduce
	*/
	public void setMctIntroduce(String mctIntroduce ){
		this.mctIntroduce = mctIntroduce;
	}
	
	/**
	* 咨询类型名称
	*@return 
	*/
	public String getMctName(){
		return  mctName;
	}
	/**
	* 咨询类型名称
	*@param  mctName
	*/
	public void setMctName(String mctName ){
		this.mctName = mctName;
	}
	

}
