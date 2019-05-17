package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_groupbuy_class")
public class RaGroupbuyClass   {
	
	/*
	类别编号
	*/
	private Integer classId ;
	/*
	父类别编号
	*/
	private Integer classParentId ;
	/*
	深度
	*/
	private Integer deep ;
	/*
	排序
	*/
	private Integer sort ;
	/*
	类别名称
	*/
	private String className ;
	
	public RaGroupbuyClass() {
	}
	
	/**
	* 类别编号
	*@return 
	*/
	public Integer getClassId(){
		return  classId;
	}
	/**
	* 类别编号
	*@param  classId
	*/
	public void setClassId(Integer classId ){
		this.classId = classId;
	}
	
	/**
	* 父类别编号
	*@return 
	*/
	public Integer getClassParentId(){
		return  classParentId;
	}
	/**
	* 父类别编号
	*@param  classParentId
	*/
	public void setClassParentId(Integer classParentId ){
		this.classParentId = classParentId;
	}
	
	/**
	* 深度
	*@return 
	*/
	public Integer getDeep(){
		return  deep;
	}
	/**
	* 深度
	*@param  deep
	*/
	public void setDeep(Integer deep ){
		this.deep = deep;
	}
	
	/**
	* 排序
	*@return 
	*/
	public Integer getSort(){
		return  sort;
	}
	/**
	* 排序
	*@param  sort
	*/
	public void setSort(Integer sort ){
		this.sort = sort;
	}
	
	/**
	* 类别名称
	*@return 
	*/
	public String getClassName(){
		return  className;
	}
	/**
	* 类别名称
	*@param  className
	*/
	public void setClassName(String className ){
		this.className = className;
	}
	

}
