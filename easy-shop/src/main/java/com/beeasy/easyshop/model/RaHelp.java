package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_help")
public class RaHelp   {
	
	/*
	帮助ID
	*/
	private Integer helpId ;
	/*
	排序
	*/
	private Integer helpSort ;
	/*
	页面类型:1为店铺,2为会员,默认为1
	*/
	private Integer pageShow ;
	/*
	帮助类型
	*/
	private Integer typeId ;
	/*
	更新时间
	*/
	private Integer updateTime ;
	/*
	帮助内容
	*/
	private String helpInfo ;
	/*
	标题
	*/
	private String helpTitle ;
	/*
	跳转链接
	*/
	private String helpUrl ;
	
	public RaHelp() {
	}
	
	/**
	* 帮助ID
	*@return 
	*/
	public Integer getHelpId(){
		return  helpId;
	}
	/**
	* 帮助ID
	*@param  helpId
	*/
	public void setHelpId(Integer helpId ){
		this.helpId = helpId;
	}
	
	/**
	* 排序
	*@return 
	*/
	public Integer getHelpSort(){
		return  helpSort;
	}
	/**
	* 排序
	*@param  helpSort
	*/
	public void setHelpSort(Integer helpSort ){
		this.helpSort = helpSort;
	}
	
	/**
	* 页面类型:1为店铺,2为会员,默认为1
	*@return 
	*/
	public Integer getPageShow(){
		return  pageShow;
	}
	/**
	* 页面类型:1为店铺,2为会员,默认为1
	*@param  pageShow
	*/
	public void setPageShow(Integer pageShow ){
		this.pageShow = pageShow;
	}
	
	/**
	* 帮助类型
	*@return 
	*/
	public Integer getTypeId(){
		return  typeId;
	}
	/**
	* 帮助类型
	*@param  typeId
	*/
	public void setTypeId(Integer typeId ){
		this.typeId = typeId;
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
	* 帮助内容
	*@return 
	*/
	public String getHelpInfo(){
		return  helpInfo;
	}
	/**
	* 帮助内容
	*@param  helpInfo
	*/
	public void setHelpInfo(String helpInfo ){
		this.helpInfo = helpInfo;
	}
	
	/**
	* 标题
	*@return 
	*/
	public String getHelpTitle(){
		return  helpTitle;
	}
	/**
	* 标题
	*@param  helpTitle
	*/
	public void setHelpTitle(String helpTitle ){
		this.helpTitle = helpTitle;
	}
	
	/**
	* 跳转链接
	*@return 
	*/
	public String getHelpUrl(){
		return  helpUrl;
	}
	/**
	* 跳转链接
	*@param  helpUrl
	*/
	public void setHelpUrl(String helpUrl ){
		this.helpUrl = helpUrl;
	}
	

}
