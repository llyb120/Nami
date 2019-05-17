package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_help_type")
public class RaHelpType   {
	
	/*
	类型ID
	*/
	private Integer typeId ;
	/*
	是否显示,0为否,1为是,默认为1
	*/
	private Integer helpShow ;
	/*
	页面类型:1为店铺,2为会员,默认为1
	*/
	private Integer pageShow ;
	/*
	排序
	*/
	private Integer typeSort ;
	/*
	调用编号(auto的可删除)
	*/
	private String helpCode ;
	/*
	类型名称
	*/
	private String typeName ;
	
	public RaHelpType() {
	}
	
	/**
	* 类型ID
	*@return 
	*/
	public Integer getTypeId(){
		return  typeId;
	}
	/**
	* 类型ID
	*@param  typeId
	*/
	public void setTypeId(Integer typeId ){
		this.typeId = typeId;
	}
	
	/**
	* 是否显示,0为否,1为是,默认为1
	*@return 
	*/
	public Integer getHelpShow(){
		return  helpShow;
	}
	/**
	* 是否显示,0为否,1为是,默认为1
	*@param  helpShow
	*/
	public void setHelpShow(Integer helpShow ){
		this.helpShow = helpShow;
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
	* 排序
	*@return 
	*/
	public Integer getTypeSort(){
		return  typeSort;
	}
	/**
	* 排序
	*@param  typeSort
	*/
	public void setTypeSort(Integer typeSort ){
		this.typeSort = typeSort;
	}
	
	/**
	* 调用编号(auto的可删除)
	*@return 
	*/
	public String getHelpCode(){
		return  helpCode;
	}
	/**
	* 调用编号(auto的可删除)
	*@param  helpCode
	*/
	public void setHelpCode(String helpCode ){
		this.helpCode = helpCode;
	}
	
	/**
	* 类型名称
	*@return 
	*/
	public String getTypeName(){
		return  typeName;
	}
	/**
	* 类型名称
	*@param  typeName
	*/
	public void setTypeName(String typeName ){
		this.typeName = typeName;
	}
	

}
