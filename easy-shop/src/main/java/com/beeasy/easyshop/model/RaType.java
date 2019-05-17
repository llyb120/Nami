package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_type")
public class RaType   {
	
	/*
	类型id
	*/
	private Integer typeId ;
	/*
	所属分类id
	*/
	private Integer classId ;
	/*
	排序
	*/
	private Integer typeSort ;
	/*
	所属分类名称
	*/
	private String className ;
	/*
	类型名称
	*/
	private String typeName ;
	
	public RaType() {
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
	public Integer getTypeSort(){
		return  typeSort;
	}
	/**
	* 排序
	*@param  typeSort
	*/
	public void setTypeSort(Integer typeSort ){
		this.typeSort = typeSort;
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
	* 类型名称
	*@return 
	*/
	public String getTypeName(){
		return  typeName;
	}
	/**
	* 类型名称
	*@param  typeName
	*/
	public void setTypeName(String typeName ){
		this.typeName = typeName;
	}
	

}
