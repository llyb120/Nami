package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_help_type")
public class RaHelpType   {
	
	// alias
	public static final String ALIAS_type_id = "type_id";
	public static final String ALIAS_help_show = "help_show";
	public static final String ALIAS_page_show = "page_show";
	public static final String ALIAS_type_sort = "type_sort";
	public static final String ALIAS_help_code = "help_code";
	public static final String ALIAS_type_name = "type_name";
	
	/*
	类型ID
	*/
	private Integer type_id ;
	/*
	是否显示,0为否,1为是,默认为1
	*/
	private Integer help_show ;
	/*
	页面类型:1为店铺,2为会员,默认为1
	*/
	private Integer page_show ;
	/*
	排序
	*/
	private Integer type_sort ;
	/*
	调用编号(auto的可删除)
	*/
	private String help_code ;
	/*
	类型名称
	*/
	private String type_name ;
	
	public RaHelpType() {
	}
	
	/**
	* 类型ID
	*@return 
	*/
	public Integer getType_id(){
		return  type_id;
	}
	/**
	* 类型ID
	*@param  type_id
	*/
	public void setType_id(Integer type_id ){
		this.type_id = type_id;
	}
	
	/**
	* 是否显示,0为否,1为是,默认为1
	*@return 
	*/
	public Integer getHelp_show(){
		return  help_show;
	}
	/**
	* 是否显示,0为否,1为是,默认为1
	*@param  help_show
	*/
	public void setHelp_show(Integer help_show ){
		this.help_show = help_show;
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
	* 排序
	*@return 
	*/
	public Integer getType_sort(){
		return  type_sort;
	}
	/**
	* 排序
	*@param  type_sort
	*/
	public void setType_sort(Integer type_sort ){
		this.type_sort = type_sort;
	}
	
	/**
	* 调用编号(auto的可删除)
	*@return 
	*/
	public String getHelp_code(){
		return  help_code;
	}
	/**
	* 调用编号(auto的可删除)
	*@param  help_code
	*/
	public void setHelp_code(String help_code ){
		this.help_code = help_code;
	}
	
	/**
	* 类型名称
	*@return 
	*/
	public String getType_name(){
		return  type_name;
	}
	/**
	* 类型名称
	*@param  type_name
	*/
	public void setType_name(String type_name ){
		this.type_name = type_name;
	}
	

}
