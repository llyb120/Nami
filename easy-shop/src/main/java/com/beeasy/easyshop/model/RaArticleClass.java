package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_article_class")
public class RaArticleClass   {
	
	/*
	索引ID
	*/
	private Integer acId ;
	/*
	父ID
	*/
	private Integer acParentId ;
	/*
	排序
	*/
	private Integer acSort ;
	/*
	分类标识码
	*/
	private String acCode ;
	/*
	分类名称
	*/
	private String acName ;
	
	public RaArticleClass() {
	}
	
	/**
	* 索引ID
	*@return 
	*/
	public Integer getAcId(){
		return  acId;
	}
	/**
	* 索引ID
	*@param  acId
	*/
	public void setAcId(Integer acId ){
		this.acId = acId;
	}
	
	/**
	* 父ID
	*@return 
	*/
	public Integer getAcParentId(){
		return  acParentId;
	}
	/**
	* 父ID
	*@param  acParentId
	*/
	public void setAcParentId(Integer acParentId ){
		this.acParentId = acParentId;
	}
	
	/**
	* 排序
	*@return 
	*/
	public Integer getAcSort(){
		return  acSort;
	}
	/**
	* 排序
	*@param  acSort
	*/
	public void setAcSort(Integer acSort ){
		this.acSort = acSort;
	}
	
	/**
	* 分类标识码
	*@return 
	*/
	public String getAcCode(){
		return  acCode;
	}
	/**
	* 分类标识码
	*@param  acCode
	*/
	public void setAcCode(String acCode ){
		this.acCode = acCode;
	}
	
	/**
	* 分类名称
	*@return 
	*/
	public String getAcName(){
		return  acName;
	}
	/**
	* 分类名称
	*@param  acName
	*/
	public void setAcName(String acName ){
		this.acName = acName;
	}
	

}
