package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_web_code")
public class RaWebCode   {
	
	// alias
	public static final String ALIAS_code_id = "code_id";
	public static final String ALIAS_web_id = "web_id";
	public static final String ALIAS_code_info = "code_info";
	public static final String ALIAS_code_type = "code_type";
	public static final String ALIAS_show_name = "show_name";
	public static final String ALIAS_var_name = "var_name";
	
	/*
	内容ID
	*/
	private Integer code_id ;
	/*
	模块ID
	*/
	private Integer web_id ;
	/*
	内容数据
	*/
	private String code_info ;
	/*
	数据类型:array,html,json
	*/
	private String code_type ;
	/*
	页面名称
	*/
	private String show_name ;
	/*
	变量名称
	*/
	private String var_name ;
	
	public RaWebCode() {
	}
	
	/**
	* 内容ID
	*@return 
	*/
	public Integer getCode_id(){
		return  code_id;
	}
	/**
	* 内容ID
	*@param  code_id
	*/
	public void setCode_id(Integer code_id ){
		this.code_id = code_id;
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
	* 内容数据
	*@return 
	*/
	public String getCode_info(){
		return  code_info;
	}
	/**
	* 内容数据
	*@param  code_info
	*/
	public void setCode_info(String code_info ){
		this.code_info = code_info;
	}
	
	/**
	* 数据类型:array,html,json
	*@return 
	*/
	public String getCode_type(){
		return  code_type;
	}
	/**
	* 数据类型:array,html,json
	*@param  code_type
	*/
	public void setCode_type(String code_type ){
		this.code_type = code_type;
	}
	
	/**
	* 页面名称
	*@return 
	*/
	public String getShow_name(){
		return  show_name;
	}
	/**
	* 页面名称
	*@param  show_name
	*/
	public void setShow_name(String show_name ){
		this.show_name = show_name;
	}
	
	/**
	* 变量名称
	*@return 
	*/
	public String getVar_name(){
		return  var_name;
	}
	/**
	* 变量名称
	*@param  var_name
	*/
	public void setVar_name(String var_name ){
		this.var_name = var_name;
	}
	

}
