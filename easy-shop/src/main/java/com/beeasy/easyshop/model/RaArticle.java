package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_article")
public class RaArticle   {
	
	/*
	索引id
	*/
	private Integer articleId ;
	/*
	分类id
	*/
	private Integer acId ;
	/*
	是否显示，0为否，1为是，默认为1
	*/
	private Integer articleShow ;
	/*
	排序
	*/
	private Integer articleSort ;
	/*
	发布时间
	*/
	private Integer articleTime ;
	/*
	内容
	*/
	private String articleContent ;
	/*
	标题
	*/
	private String articleTitle ;
	/*
	跳转链接
	*/
	private String articleUrl ;
	
	public RaArticle() {
	}
	
	/**
	* 索引id
	*@return 
	*/
	public Integer getArticleId(){
		return  articleId;
	}
	/**
	* 索引id
	*@param  articleId
	*/
	public void setArticleId(Integer articleId ){
		this.articleId = articleId;
	}
	
	/**
	* 分类id
	*@return 
	*/
	public Integer getAcId(){
		return  acId;
	}
	/**
	* 分类id
	*@param  acId
	*/
	public void setAcId(Integer acId ){
		this.acId = acId;
	}
	
	/**
	* 是否显示，0为否，1为是，默认为1
	*@return 
	*/
	public Integer getArticleShow(){
		return  articleShow;
	}
	/**
	* 是否显示，0为否，1为是，默认为1
	*@param  articleShow
	*/
	public void setArticleShow(Integer articleShow ){
		this.articleShow = articleShow;
	}
	
	/**
	* 排序
	*@return 
	*/
	public Integer getArticleSort(){
		return  articleSort;
	}
	/**
	* 排序
	*@param  articleSort
	*/
	public void setArticleSort(Integer articleSort ){
		this.articleSort = articleSort;
	}
	
	/**
	* 发布时间
	*@return 
	*/
	public Integer getArticleTime(){
		return  articleTime;
	}
	/**
	* 发布时间
	*@param  articleTime
	*/
	public void setArticleTime(Integer articleTime ){
		this.articleTime = articleTime;
	}
	
	/**
	* 内容
	*@return 
	*/
	public String getArticleContent(){
		return  articleContent;
	}
	/**
	* 内容
	*@param  articleContent
	*/
	public void setArticleContent(String articleContent ){
		this.articleContent = articleContent;
	}
	
	/**
	* 标题
	*@return 
	*/
	public String getArticleTitle(){
		return  articleTitle;
	}
	/**
	* 标题
	*@param  articleTitle
	*/
	public void setArticleTitle(String articleTitle ){
		this.articleTitle = articleTitle;
	}
	
	/**
	* 跳转链接
	*@return 
	*/
	public String getArticleUrl(){
		return  articleUrl;
	}
	/**
	* 跳转链接
	*@param  articleUrl
	*/
	public void setArticleUrl(String articleUrl ){
		this.articleUrl = articleUrl;
	}
	

}
