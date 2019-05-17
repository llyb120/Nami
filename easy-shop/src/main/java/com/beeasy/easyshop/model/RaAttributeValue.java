package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_attribute_value")
public class RaAttributeValue   {
	
	/*
	属性值id
	*/
	private Integer attrValueId ;
	/*
	所属属性id
	*/
	private Integer attrId ;
	/*
	属性值排序
	*/
	private Integer attrValueSort ;
	/*
	类型id
	*/
	private Integer typeId ;
	/*
	属性值名称
	*/
	private String attrValueName ;
	
	public RaAttributeValue() {
	}
	
	/**
	* 属性值id
	*@return 
	*/
	public Integer getAttrValueId(){
		return  attrValueId;
	}
	/**
	* 属性值id
	*@param  attrValueId
	*/
	public void setAttrValueId(Integer attrValueId ){
		this.attrValueId = attrValueId;
	}
	
	/**
	* 所属属性id
	*@return 
	*/
	public Integer getAttrId(){
		return  attrId;
	}
	/**
	* 所属属性id
	*@param  attrId
	*/
	public void setAttrId(Integer attrId ){
		this.attrId = attrId;
	}
	
	/**
	* 属性值排序
	*@return 
	*/
	public Integer getAttrValueSort(){
		return  attrValueSort;
	}
	/**
	* 属性值排序
	*@param  attrValueSort
	*/
	public void setAttrValueSort(Integer attrValueSort ){
		this.attrValueSort = attrValueSort;
	}
	
	/**
	* 类型id
	*@return 
	*/
	public Integer getTypeId(){
		return  typeId;
	}
	/**
	* 类型id
	*@param  typeId
	*/
	public void setTypeId(Integer typeId ){
		this.typeId = typeId;
	}
	
	/**
	* 属性值名称
	*@return 
	*/
	public String getAttrValueName(){
		return  attrValueName;
	}
	/**
	* 属性值名称
	*@param  attrValueName
	*/
	public void setAttrValueName(String attrValueName ){
		this.attrValueName = attrValueName;
	}
	

}
