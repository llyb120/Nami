package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_attribute")
public class RaAttribute   {
	
	/*
	属性id
	*/
	private Integer attrId ;
	/*
	是否显示。0为不显示、1为显示
	*/
	private Integer attrShow ;
	/*
	排序
	*/
	private Integer attrSort ;
	/*
	所属类型id
	*/
	private Integer typeId ;
	/*
	属性名称
	*/
	private String attrName ;
	/*
	属性值列
	*/
	private String attrValue ;
	
	public RaAttribute() {
	}
	
	/**
	* 属性id
	*@return 
	*/
	public Integer getAttrId(){
		return  attrId;
	}
	/**
	* 属性id
	*@param  attrId
	*/
	public void setAttrId(Integer attrId ){
		this.attrId = attrId;
	}
	
	/**
	* 是否显示。0为不显示、1为显示
	*@return 
	*/
	public Integer getAttrShow(){
		return  attrShow;
	}
	/**
	* 是否显示。0为不显示、1为显示
	*@param  attrShow
	*/
	public void setAttrShow(Integer attrShow ){
		this.attrShow = attrShow;
	}
	
	/**
	* 排序
	*@return 
	*/
	public Integer getAttrSort(){
		return  attrSort;
	}
	/**
	* 排序
	*@param  attrSort
	*/
	public void setAttrSort(Integer attrSort ){
		this.attrSort = attrSort;
	}
	
	/**
	* 所属类型id
	*@return 
	*/
	public Integer getTypeId(){
		return  typeId;
	}
	/**
	* 所属类型id
	*@param  typeId
	*/
	public void setTypeId(Integer typeId ){
		this.typeId = typeId;
	}
	
	/**
	* 属性名称
	*@return 
	*/
	public String getAttrName(){
		return  attrName;
	}
	/**
	* 属性名称
	*@param  attrName
	*/
	public void setAttrName(String attrName ){
		this.attrName = attrName;
	}
	
	/**
	* 属性值列
	*@return 
	*/
	public String getAttrValue(){
		return  attrValue;
	}
	/**
	* 属性值列
	*@param  attrValue
	*/
	public void setAttrValue(String attrValue ){
		this.attrValue = attrValue;
	}
	

}
