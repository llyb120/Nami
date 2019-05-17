package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_circle_class")
public class RaCircleClass   {
	
	/*
	圈子分类id
	*/
	private Integer classId ;
	/*
	圈子分类排序
	*/
	private Integer classSort ;
	/*
	圈子分类状态 0不显示，1显示
	*/
	private Integer classStatus ;
	/*
	是否推荐 0未推荐，1已推荐
	*/
	private Integer isRecommend ;
	/*
	圈子分类创建时间
	*/
	private String classAddtime ;
	/*
	圈子分类名称
	*/
	private String className ;
	
	public RaCircleClass() {
	}
	
	/**
	* 圈子分类id
	*@return 
	*/
	public Integer getClassId(){
		return  classId;
	}
	/**
	* 圈子分类id
	*@param  classId
	*/
	public void setClassId(Integer classId ){
		this.classId = classId;
	}
	
	/**
	* 圈子分类排序
	*@return 
	*/
	public Integer getClassSort(){
		return  classSort;
	}
	/**
	* 圈子分类排序
	*@param  classSort
	*/
	public void setClassSort(Integer classSort ){
		this.classSort = classSort;
	}
	
	/**
	* 圈子分类状态 0不显示，1显示
	*@return 
	*/
	public Integer getClassStatus(){
		return  classStatus;
	}
	/**
	* 圈子分类状态 0不显示，1显示
	*@param  classStatus
	*/
	public void setClassStatus(Integer classStatus ){
		this.classStatus = classStatus;
	}
	
	/**
	* 是否推荐 0未推荐，1已推荐
	*@return 
	*/
	public Integer getIsRecommend(){
		return  isRecommend;
	}
	/**
	* 是否推荐 0未推荐，1已推荐
	*@param  isRecommend
	*/
	public void setIsRecommend(Integer isRecommend ){
		this.isRecommend = isRecommend;
	}
	
	/**
	* 圈子分类创建时间
	*@return 
	*/
	public String getClassAddtime(){
		return  classAddtime;
	}
	/**
	* 圈子分类创建时间
	*@param  classAddtime
	*/
	public void setClassAddtime(String classAddtime ){
		this.classAddtime = classAddtime;
	}
	
	/**
	* 圈子分类名称
	*@return 
	*/
	public String getClassName(){
		return  className;
	}
	/**
	* 圈子分类名称
	*@param  className
	*/
	public void setClassName(String className ){
		this.className = className;
	}
	

}
