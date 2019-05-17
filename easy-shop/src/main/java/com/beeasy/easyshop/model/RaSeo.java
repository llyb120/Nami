package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_seo")
public class RaSeo   {
	
	/*
	主键
	*/
	private Integer id ;
	/*
	描述
	*/
	private String description ;
	/*
	关键词
	*/
	private String keywords ;
	/*
	标题
	*/
	private String title ;
	/*
	类型
	*/
	private String type ;
	
	public RaSeo() {
	}
	
	/**
	* 主键
	*@return 
	*/
	public Integer getId(){
		return  id;
	}
	/**
	* 主键
	*@param  id
	*/
	public void setId(Integer id ){
		this.id = id;
	}
	
	/**
	* 描述
	*@return 
	*/
	public String getDescription(){
		return  description;
	}
	/**
	* 描述
	*@param  description
	*/
	public void setDescription(String description ){
		this.description = description;
	}
	
	/**
	* 关键词
	*@return 
	*/
	public String getKeywords(){
		return  keywords;
	}
	/**
	* 关键词
	*@param  keywords
	*/
	public void setKeywords(String keywords ){
		this.keywords = keywords;
	}
	
	/**
	* 标题
	*@return 
	*/
	public String getTitle(){
		return  title;
	}
	/**
	* 标题
	*@param  title
	*/
	public void setTitle(String title ){
		this.title = title;
	}
	
	/**
	* 类型
	*@return 
	*/
	public String getType(){
		return  type;
	}
	/**
	* 类型
	*@param  type
	*/
	public void setType(String type ){
		this.type = type;
	}
	

}
