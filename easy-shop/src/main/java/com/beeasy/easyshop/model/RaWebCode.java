package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_web_code")
public class RaWebCode   {
	
	/*
	内容ID
	*/
	private Integer codeId ;
	/*
	模块ID
	*/
	private Integer webId ;
	/*
	内容数据
	*/
	private String codeInfo ;
	/*
	数据类型:array,html,json
	*/
	private String codeType ;
	/*
	页面名称
	*/
	private String showName ;
	/*
	变量名称
	*/
	private String varName ;
	
	public RaWebCode() {
	}
	
	/**
	* 内容ID
	*@return 
	*/
	public Integer getCodeId(){
		return  codeId;
	}
	/**
	* 内容ID
	*@param  codeId
	*/
	public void setCodeId(Integer codeId ){
		this.codeId = codeId;
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
	* 内容数据
	*@return 
	*/
	public String getCodeInfo(){
		return  codeInfo;
	}
	/**
	* 内容数据
	*@param  codeInfo
	*/
	public void setCodeInfo(String codeInfo ){
		this.codeInfo = codeInfo;
	}
	
	/**
	* 数据类型:array,html,json
	*@return 
	*/
	public String getCodeType(){
		return  codeType;
	}
	/**
	* 数据类型:array,html,json
	*@param  codeType
	*/
	public void setCodeType(String codeType ){
		this.codeType = codeType;
	}
	
	/**
	* 页面名称
	*@return 
	*/
	public String getShowName(){
		return  showName;
	}
	/**
	* 页面名称
	*@param  showName
	*/
	public void setShowName(String showName ){
		this.showName = showName;
	}
	
	/**
	* 变量名称
	*@return 
	*/
	public String getVarName(){
		return  varName;
	}
	/**
	* 变量名称
	*@param  varName
	*/
	public void setVarName(String varName ){
		this.varName = varName;
	}
	

}
