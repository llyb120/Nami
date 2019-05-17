package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_spec")
public class RaSpec   {
	
	/*
	规格id
	*/
	private Integer spId ;
	/*
	所属分类id
	*/
	private Integer classId ;
	/*
	排序
	*/
	private Integer spSort ;
	/*
	所属分类名称
	*/
	private String className ;
	/*
	规格名称
	*/
	private String spName ;
	
	public RaSpec() {
	}
	
	/**
	* 规格id
	*@return 
	*/
	public Integer getSpId(){
		return  spId;
	}
	/**
	* 规格id
	*@param  spId
	*/
	public void setSpId(Integer spId ){
		this.spId = spId;
	}
	
	/**
	* 所属分类id
	*@return 
	*/
	public Integer getClassId(){
		return  classId;
	}
	/**
	* 所属分类id
	*@param  classId
	*/
	public void setClassId(Integer classId ){
		this.classId = classId;
	}
	
	/**
	* 排序
	*@return 
	*/
	public Integer getSpSort(){
		return  spSort;
	}
	/**
	* 排序
	*@param  spSort
	*/
	public void setSpSort(Integer spSort ){
		this.spSort = spSort;
	}
	
	/**
	* 所属分类名称
	*@return 
	*/
	public String getClassName(){
		return  className;
	}
	/**
	* 所属分类名称
	*@param  className
	*/
	public void setClassName(String className ){
		this.className = className;
	}
	
	/**
	* 规格名称
	*@return 
	*/
	public String getSpName(){
		return  spName;
	}
	/**
	* 规格名称
	*@param  spName
	*/
	public void setSpName(String spName ){
		this.spName = spName;
	}
	

}
