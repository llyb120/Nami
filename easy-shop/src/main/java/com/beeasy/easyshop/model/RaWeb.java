package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_web")
public class RaWeb   {
	
	/*
	模块ID
	*/
	private Integer webId ;
	/*
	更新时间
	*/
	private Integer updateTime ;
	/*
	是否显示，0为否，1为是，默认为1
	*/
	private Integer webShow ;
	/*
	排序
	*/
	private Integer webSort ;
	/*
	风格名称
	*/
	private String styleName ;
	/*
	模块html代码
	*/
	private String webHtml ;
	/*
	模块名称
	*/
	private String webName ;
	/*
	所在页面(暂时只有index)
	*/
	private String webPage ;
	
	public RaWeb() {
	}
	
	/**
	* 模块ID
	*@return 
	*/
	public Integer getWebId(){
		return  webId;
	}
	/**
	* 模块ID
	*@param  webId
	*/
	public void setWebId(Integer webId ){
		this.webId = webId;
	}
	
	/**
	* 更新时间
	*@return 
	*/
	public Integer getUpdateTime(){
		return  updateTime;
	}
	/**
	* 更新时间
	*@param  updateTime
	*/
	public void setUpdateTime(Integer updateTime ){
		this.updateTime = updateTime;
	}
	
	/**
	* 是否显示，0为否，1为是，默认为1
	*@return 
	*/
	public Integer getWebShow(){
		return  webShow;
	}
	/**
	* 是否显示，0为否，1为是，默认为1
	*@param  webShow
	*/
	public void setWebShow(Integer webShow ){
		this.webShow = webShow;
	}
	
	/**
	* 排序
	*@return 
	*/
	public Integer getWebSort(){
		return  webSort;
	}
	/**
	* 排序
	*@param  webSort
	*/
	public void setWebSort(Integer webSort ){
		this.webSort = webSort;
	}
	
	/**
	* 风格名称
	*@return 
	*/
	public String getStyleName(){
		return  styleName;
	}
	/**
	* 风格名称
	*@param  styleName
	*/
	public void setStyleName(String styleName ){
		this.styleName = styleName;
	}
	
	/**
	* 模块html代码
	*@return 
	*/
	public String getWebHtml(){
		return  webHtml;
	}
	/**
	* 模块html代码
	*@param  webHtml
	*/
	public void setWebHtml(String webHtml ){
		this.webHtml = webHtml;
	}
	
	/**
	* 模块名称
	*@return 
	*/
	public String getWebName(){
		return  webName;
	}
	/**
	* 模块名称
	*@param  webName
	*/
	public void setWebName(String webName ){
		this.webName = webName;
	}
	
	/**
	* 所在页面(暂时只有index)
	*@return 
	*/
	public String getWebPage(){
		return  webPage;
	}
	/**
	* 所在页面(暂时只有index)
	*@param  webPage
	*/
	public void setWebPage(String webPage ){
		this.webPage = webPage;
	}
	

}
