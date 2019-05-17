package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_help")
public class RaHelp   {
	
	// alias
	public static final String ALIAS_help_id = "help_id";
	public static final String ALIAS_help_sort = "help_sort";
	public static final String ALIAS_page_show = "page_show";
	public static final String ALIAS_type_id = "type_id";
	public static final String ALIAS_update_time = "update_time";
	public static final String ALIAS_help_info = "help_info";
	public static final String ALIAS_help_title = "help_title";
	public static final String ALIAS_help_url = "help_url";
	
	/*
	帮助ID
	*/
	private Integer help_id ;
	/*
	排序
	*/
	private Integer help_sort ;
	/*
	页面类型:1为店铺,2为会员,默认为1
	*/
	private Integer page_show ;
	/*
	帮助类型
	*/
	private Integer type_id ;
	/*
	更新时间
	*/
	private Integer update_time ;
	/*
	帮助内容
	*/
	private String help_info ;
	/*
	标题
	*/
	private String help_title ;
	/*
	跳转链接
	*/
	private String help_url ;
	
	public RaHelp() {
	}
	
	/**
	* 帮助ID
	*@return 
	*/
	public Integer getHelp_id(){
		return  help_id;
	}
	/**
	* 帮助ID
	*@param  help_id
	*/
	public void setHelp_id(Integer help_id ){
		this.help_id = help_id;
	}
	
	/**
	* 排序
	*@return 
	*/
	public Integer getHelp_sort(){
		return  help_sort;
	}
	/**
	* 排序
	*@param  help_sort
	*/
	public void setHelp_sort(Integer help_sort ){
		this.help_sort = help_sort;
	}
	
	/**
	* 页面类型:1为店铺,2为会员,默认为1
	*@return 
	*/
	public Integer getPage_show(){
		return  page_show;
	}
	/**
	* 页面类型:1为店铺,2为会员,默认为1
	*@param  page_show
	*/
	public void setPage_show(Integer page_show ){
		this.page_show = page_show;
	}
	
	/**
	* 帮助类型
	*@return 
	*/
	public Integer getType_id(){
		return  type_id;
	}
	/**
	* 帮助类型
	*@param  type_id
	*/
	public void setType_id(Integer type_id ){
		this.type_id = type_id;
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
	* 帮助内容
	*@return 
	*/
	public String getHelp_info(){
		return  help_info;
	}
	/**
	* 帮助内容
	*@param  help_info
	*/
	public void setHelp_info(String help_info ){
		this.help_info = help_info;
	}
	
	/**
	* 标题
	*@return 
	*/
	public String getHelp_title(){
		return  help_title;
	}
	/**
	* 标题
	*@param  help_title
	*/
	public void setHelp_title(String help_title ){
		this.help_title = help_title;
	}
	
	/**
	* 跳转链接
	*@return 
	*/
	public String getHelp_url(){
		return  help_url;
	}
	/**
	* 跳转链接
	*@param  help_url
	*/
	public void setHelp_url(String help_url ){
		this.help_url = help_url;
	}
	

}
