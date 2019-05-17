package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_article")
public class RaArticle   {
	
	// alias
	public static final String ALIAS_article_id = "article_id";
	public static final String ALIAS_ac_id = "ac_id";
	public static final String ALIAS_article_show = "article_show";
	public static final String ALIAS_article_sort = "article_sort";
	public static final String ALIAS_article_time = "article_time";
	public static final String ALIAS_article_content = "article_content";
	public static final String ALIAS_article_title = "article_title";
	public static final String ALIAS_article_url = "article_url";
	
	/*
	索引id
	*/
	private Integer article_id ;
	/*
	分类id
	*/
	private Integer ac_id ;
	/*
	是否显示，0为否，1为是，默认为1
	*/
	private Integer article_show ;
	/*
	排序
	*/
	private Integer article_sort ;
	/*
	发布时间
	*/
	private Integer article_time ;
	/*
	内容
	*/
	private String article_content ;
	/*
	标题
	*/
	private String article_title ;
	/*
	跳转链接
	*/
	private String article_url ;
	
	public RaArticle() {
	}
	
	/**
	* 索引id
	*@return 
	*/
	public Integer getArticle_id(){
		return  article_id;
	}
	/**
	* 索引id
	*@param  article_id
	*/
	public void setArticle_id(Integer article_id ){
		this.article_id = article_id;
	}
	
	/**
	* 分类id
	*@return 
	*/
	public Integer getAc_id(){
		return  ac_id;
	}
	/**
	* 分类id
	*@param  ac_id
	*/
	public void setAc_id(Integer ac_id ){
		this.ac_id = ac_id;
	}
	
	/**
	* 是否显示，0为否，1为是，默认为1
	*@return 
	*/
	public Integer getArticle_show(){
		return  article_show;
	}
	/**
	* 是否显示，0为否，1为是，默认为1
	*@param  article_show
	*/
	public void setArticle_show(Integer article_show ){
		this.article_show = article_show;
	}
	
	/**
	* 排序
	*@return 
	*/
	public Integer getArticle_sort(){
		return  article_sort;
	}
	/**
	* 排序
	*@param  article_sort
	*/
	public void setArticle_sort(Integer article_sort ){
		this.article_sort = article_sort;
	}
	
	/**
	* 发布时间
	*@return 
	*/
	public Integer getArticle_time(){
		return  article_time;
	}
	/**
	* 发布时间
	*@param  article_time
	*/
	public void setArticle_time(Integer article_time ){
		this.article_time = article_time;
	}
	
	/**
	* 内容
	*@return 
	*/
	public String getArticle_content(){
		return  article_content;
	}
	/**
	* 内容
	*@param  article_content
	*/
	public void setArticle_content(String article_content ){
		this.article_content = article_content;
	}
	
	/**
	* 标题
	*@return 
	*/
	public String getArticle_title(){
		return  article_title;
	}
	/**
	* 标题
	*@param  article_title
	*/
	public void setArticle_title(String article_title ){
		this.article_title = article_title;
	}
	
	/**
	* 跳转链接
	*@return 
	*/
	public String getArticle_url(){
		return  article_url;
	}
	/**
	* 跳转链接
	*@param  article_url
	*/
	public void setArticle_url(String article_url ){
		this.article_url = article_url;
	}
	

}
