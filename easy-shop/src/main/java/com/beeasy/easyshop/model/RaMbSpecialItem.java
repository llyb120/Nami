package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_mb_special_item")
public class RaMbSpecialItem   {
	
	/*
	专题项目编号
	*/
	private Integer itemId ;
	/*
	项目排序
	*/
	private Integer itemSort ;
	/*
	项目是否可用 0-不可用 1-可用
	*/
	private Integer itemUsable ;
	/*
	专题编号
	*/
	private Integer specialId ;
	/*
	项目内容
	*/
	private String itemData ;
	/*
	项目类型
	*/
	private String itemType ;
	
	public RaMbSpecialItem() {
	}
	
	/**
	* 专题项目编号
	*@return 
	*/
	public Integer getItemId(){
		return  itemId;
	}
	/**
	* 专题项目编号
	*@param  itemId
	*/
	public void setItemId(Integer itemId ){
		this.itemId = itemId;
	}
	
	/**
	* 项目排序
	*@return 
	*/
	public Integer getItemSort(){
		return  itemSort;
	}
	/**
	* 项目排序
	*@param  itemSort
	*/
	public void setItemSort(Integer itemSort ){
		this.itemSort = itemSort;
	}
	
	/**
	* 项目是否可用 0-不可用 1-可用
	*@return 
	*/
	public Integer getItemUsable(){
		return  itemUsable;
	}
	/**
	* 项目是否可用 0-不可用 1-可用
	*@param  itemUsable
	*/
	public void setItemUsable(Integer itemUsable ){
		this.itemUsable = itemUsable;
	}
	
	/**
	* 专题编号
	*@return 
	*/
	public Integer getSpecialId(){
		return  specialId;
	}
	/**
	* 专题编号
	*@param  specialId
	*/
	public void setSpecialId(Integer specialId ){
		this.specialId = specialId;
	}
	
	/**
	* 项目内容
	*@return 
	*/
	public String getItemData(){
		return  itemData;
	}
	/**
	* 项目内容
	*@param  itemData
	*/
	public void setItemData(String itemData ){
		this.itemData = itemData;
	}
	
	/**
	* 项目类型
	*@return 
	*/
	public String getItemType(){
		return  itemType;
	}
	/**
	* 项目类型
	*@param  itemType
	*/
	public void setItemType(String itemType ){
		this.itemType = itemType;
	}
	

}
