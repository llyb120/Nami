package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_web")
public class RaWeb   {
	
	// alias
	public static final String ALIAS_web_id = "web_id";
	public static final String ALIAS_update_time = "update_time";
	public static final String ALIAS_web_show = "web_show";
	public static final String ALIAS_web_sort = "web_sort";
	public static final String ALIAS_style_name = "style_name";
	public static final String ALIAS_web_html = "web_html";
	public static final String ALIAS_web_name = "web_name";
	public static final String ALIAS_web_page = "web_page";
	
	/*
	模块ID
	*/
	private Integer web_id ;
	/*
	更新时间
	*/
	private Integer update_time ;
	/*
	是否显示，0为否，1为是，默认为1
	*/
	private Integer web_show ;
	/*
	排序
	*/
	private Integer web_sort ;
	/*
	风格名称
	*/
	private String style_name ;
	/*
	模块html代码
	*/
	private String web_html ;
	/*
	模块名称
	*/
	private String web_name ;
	/*
	所在页面(暂时只有index)
	*/
	private String web_page ;
	
	public RaWeb() {
	}
	
	/**
	* 模块ID
	*@return 
	*/
	public Integer getWeb_id(){
		return  web_id;
	}
	/**
	* 模块ID
	*@param  web_id
	*/
	public void setWeb_id(Integer web_id ){
		this.web_id = web_id;
	}
	
	/**
	* 更新时间
	*@return 
	*/
	public Integer getUpdate_time(){
		return  update_time;
	}
	/**
	* 更新时间
	*@param  update_time
	*/
	public void setUpdate_time(Integer update_time ){
		this.update_time = update_time;
	}
	
	/**
	* 是否显示，0为否，1为是，默认为1
	*@return 
	*/
	public Integer getWeb_show(){
		return  web_show;
	}
	/**
	* 是否显示，0为否，1为是，默认为1
	*@param  web_show
	*/
	public void setWeb_show(Integer web_show ){
		this.web_show = web_show;
	}
	
	/**
	* 排序
	*@return 
	*/
	public Integer getWeb_sort(){
		return  web_sort;
	}
	/**
	* 排序
	*@param  web_sort
	*/
	public void setWeb_sort(Integer web_sort ){
		this.web_sort = web_sort;
	}
	
	/**
	* 风格名称
	*@return 
	*/
	public String getStyle_name(){
		return  style_name;
	}
	/**
	* 风格名称
	*@param  style_name
	*/
	public void setStyle_name(String style_name ){
		this.style_name = style_name;
	}
	
	/**
	* 模块html代码
	*@return 
	*/
	public String getWeb_html(){
		return  web_html;
	}
	/**
	* 模块html代码
	*@param  web_html
	*/
	public void setWeb_html(String web_html ){
		this.web_html = web_html;
	}
	
	/**
	* 模块名称
	*@return 
	*/
	public String getWeb_name(){
		return  web_name;
	}
	/**
	* 模块名称
	*@param  web_name
	*/
	public void setWeb_name(String web_name ){
		this.web_name = web_name;
	}
	
	/**
	* 所在页面(暂时只有index)
	*@return 
	*/
	public String getWeb_page(){
		return  web_page;
	}
	/**
	* 所在页面(暂时只有index)
	*@param  web_page
	*/
	public void setWeb_page(String web_page ){
		this.web_page = web_page;
	}
	

}
