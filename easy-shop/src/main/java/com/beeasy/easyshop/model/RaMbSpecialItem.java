package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_mb_special_item")
public class RaMbSpecialItem   {
	
	// alias
	public static final String ALIAS_item_id = "item_id";
	public static final String ALIAS_item_sort = "item_sort";
	public static final String ALIAS_item_usable = "item_usable";
	public static final String ALIAS_special_id = "special_id";
	public static final String ALIAS_item_data = "item_data";
	public static final String ALIAS_item_type = "item_type";
	
	/*
	专题项目编号
	*/
	private Integer item_id ;
	/*
	项目排序
	*/
	private Integer item_sort ;
	/*
	项目是否可用 0-不可用 1-可用
	*/
	private Integer item_usable ;
	/*
	专题编号
	*/
	private Integer special_id ;
	/*
	项目内容
	*/
	private String item_data ;
	/*
	项目类型
	*/
	private String item_type ;
	
	public RaMbSpecialItem() {
	}
	
	/**
	* 专题项目编号
	*@return 
	*/
	public Integer getItem_id(){
		return  item_id;
	}
	/**
	* 专题项目编号
	*@param  item_id
	*/
	public void setItem_id(Integer item_id ){
		this.item_id = item_id;
	}
	
	/**
	* 项目排序
	*@return 
	*/
	public Integer getItem_sort(){
		return  item_sort;
	}
	/**
	* 项目排序
	*@param  item_sort
	*/
	public void setItem_sort(Integer item_sort ){
		this.item_sort = item_sort;
	}
	
	/**
	* 项目是否可用 0-不可用 1-可用
	*@return 
	*/
	public Integer getItem_usable(){
		return  item_usable;
	}
	/**
	* 项目是否可用 0-不可用 1-可用
	*@param  item_usable
	*/
	public void setItem_usable(Integer item_usable ){
		this.item_usable = item_usable;
	}
	
	/**
	* 专题编号
	*@return 
	*/
	public Integer getSpecial_id(){
		return  special_id;
	}
	/**
	* 专题编号
	*@param  special_id
	*/
	public void setSpecial_id(Integer special_id ){
		this.special_id = special_id;
	}
	
	/**
	* 项目内容
	*@return 
	*/
	public String getItem_data(){
		return  item_data;
	}
	/**
	* 项目内容
	*@param  item_data
	*/
	public void setItem_data(String item_data ){
		this.item_data = item_data;
	}
	
	/**
	* 项目类型
	*@return 
	*/
	public String getItem_type(){
		return  item_type;
	}
	/**
	* 项目类型
	*@param  item_type
	*/
	public void setItem_type(String item_type ){
		this.item_type = item_type;
	}
	

}
