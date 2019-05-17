package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_vr_groupbuy_class")
public class RaVrGroupbuyClass   {
	
	/*
	分类id
	*/
	private Integer classId ;
	/*
	分类排序
	*/
	private Integer classSort ;
	/*
	父类class_id
	*/
	private Integer parentClassId ;
	/*
	分类名称
	*/
	private String className ;
	
	public RaVrGroupbuyClass() {
	}
	
	/**
	* 分类id
	*@return 
	*/
	public Integer getClassId(){
		return  classId;
	}
	/**
	* 分类id
	*@param  classId
	*/
	public void setClassId(Integer classId ){
		this.classId = classId;
	}
	
	/**
	* 分类排序
	*@return 
	*/
	public Integer getClassSort(){
		return  classSort;
	}
	/**
	* 分类排序
	*@param  classSort
	*/
	public void setClassSort(Integer classSort ){
		this.classSort = classSort;
	}
	
	/**
	* 父类class_id
	*@return 
	*/
	public Integer getParentClassId(){
		return  parentClassId;
	}
	/**
	* 父类class_id
	*@param  parentClassId
	*/
	public void setParentClassId(Integer parentClassId ){
		this.parentClassId = parentClassId;
	}
	
	/**
	* 分类名称
	*@return 
	*/
	public String getClassName(){
		return  className;
	}
	/**
	* 分类名称
	*@param  className
	*/
	public void setClassName(String className ){
		this.className = className;
	}
	

}
