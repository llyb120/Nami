package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_area")
public class RaArea   {
	
	/*
	索引ID
	*/
	private Integer areaId ;
	/*
	地区深度，从1开始
	*/
	private Integer areaDeep ;
	/*
	地区父ID
	*/
	private Integer areaParentId ;
	/*
	排序
	*/
	private Integer areaSort ;
	private String areaCode ;
	/*
	地区名称
	*/
	private String areaName ;
	private String areaPCode ;
	/*
	大区名称
	*/
	private String areaRegion ;
	
	public RaArea() {
	}
	
	/**
	* 索引ID
	*@return 
	*/
	public Integer getAreaId(){
		return  areaId;
	}
	/**
	* 索引ID
	*@param  areaId
	*/
	public void setAreaId(Integer areaId ){
		this.areaId = areaId;
	}
	
	/**
	* 地区深度，从1开始
	*@return 
	*/
	public Integer getAreaDeep(){
		return  areaDeep;
	}
	/**
	* 地区深度，从1开始
	*@param  areaDeep
	*/
	public void setAreaDeep(Integer areaDeep ){
		this.areaDeep = areaDeep;
	}
	
	/**
	* 地区父ID
	*@return 
	*/
	public Integer getAreaParentId(){
		return  areaParentId;
	}
	/**
	* 地区父ID
	*@param  areaParentId
	*/
	public void setAreaParentId(Integer areaParentId ){
		this.areaParentId = areaParentId;
	}
	
	/**
	* 排序
	*@return 
	*/
	public Integer getAreaSort(){
		return  areaSort;
	}
	/**
	* 排序
	*@param  areaSort
	*/
	public void setAreaSort(Integer areaSort ){
		this.areaSort = areaSort;
	}
	
	public String getAreaCode(){
		return  areaCode;
	}
	public void setAreaCode(String areaCode ){
		this.areaCode = areaCode;
	}
	
	/**
	* 地区名称
	*@return 
	*/
	public String getAreaName(){
		return  areaName;
	}
	/**
	* 地区名称
	*@param  areaName
	*/
	public void setAreaName(String areaName ){
		this.areaName = areaName;
	}
	
	public String getAreaPCode(){
		return  areaPCode;
	}
	public void setAreaPCode(String areaPCode ){
		this.areaPCode = areaPCode;
	}
	
	/**
	* 大区名称
	*@return 
	*/
	public String getAreaRegion(){
		return  areaRegion;
	}
	/**
	* 大区名称
	*@param  areaRegion
	*/
	public void setAreaRegion(String areaRegion ){
		this.areaRegion = areaRegion;
	}
	

}
