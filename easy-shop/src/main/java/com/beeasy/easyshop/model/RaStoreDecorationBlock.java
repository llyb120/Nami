package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_store_decoration_block")
public class RaStoreDecorationBlock   {
	
	// alias
	public static final String ALIAS_block_id = "block_id";
	public static final String ALIAS_block_full_width = "block_full_width";
	public static final String ALIAS_block_sort = "block_sort";
	public static final String ALIAS_decoration_id = "decoration_id";
	public static final String ALIAS_store_id = "store_id";
	public static final String ALIAS_block_content = "block_content";
	public static final String ALIAS_block_layout = "block_layout";
	public static final String ALIAS_block_module_type = "block_module_type";
	
	/*
	装修块编号
	*/
	private Integer block_id ;
	/*
	是否100%宽度(0-否 1-是)
	*/
	private Integer block_full_width ;
	/*
	块排序
	*/
	private Integer block_sort ;
	/*
	装修编号
	*/
	private Integer decoration_id ;
	/*
	店铺编号
	*/
	private Integer store_id ;
	/*
	块内容
	*/
	private String block_content ;
	/*
	块布局
	*/
	private String block_layout ;
	/*
	装修块模块类型
	*/
	private String block_module_type ;
	
	public RaStoreDecorationBlock() {
	}
	
	/**
	* 装修块编号
	*@return 
	*/
	public Integer getBlock_id(){
		return  block_id;
	}
	/**
	* 装修块编号
	*@param  block_id
	*/
	public void setBlock_id(Integer block_id ){
		this.block_id = block_id;
	}
	
	/**
	* 是否100%宽度(0-否 1-是)
	*@return 
	*/
	public Integer getBlock_full_width(){
		return  block_full_width;
	}
	/**
	* 是否100%宽度(0-否 1-是)
	*@param  block_full_width
	*/
	public void setBlock_full_width(Integer block_full_width ){
		this.block_full_width = block_full_width;
	}
	
	/**
	* 块排序
	*@return 
	*/
	public Integer getBlock_sort(){
		return  block_sort;
	}
	/**
	* 块排序
	*@param  block_sort
	*/
	public void setBlock_sort(Integer block_sort ){
		this.block_sort = block_sort;
	}
	
	/**
	* 装修编号
	*@return 
	*/
	public Integer getDecoration_id(){
		return  decoration_id;
	}
	/**
	* 装修编号
	*@param  decoration_id
	*/
	public void setDecoration_id(Integer decoration_id ){
		this.decoration_id = decoration_id;
	}
	
	/**
	* 店铺编号
	*@return 
	*/
	public Integer getStore_id(){
		return  store_id;
	}
	/**
	* 店铺编号
	*@param  store_id
	*/
	public void setStore_id(Integer store_id ){
		this.store_id = store_id;
	}
	
	/**
	* 块内容
	*@return 
	*/
	public String getBlock_content(){
		return  block_content;
	}
	/**
	* 块内容
	*@param  block_content
	*/
	public void setBlock_content(String block_content ){
		this.block_content = block_content;
	}
	
	/**
	* 块布局
	*@return 
	*/
	public String getBlock_layout(){
		return  block_layout;
	}
	/**
	* 块布局
	*@param  block_layout
	*/
	public void setBlock_layout(String block_layout ){
		this.block_layout = block_layout;
	}
	
	/**
	* 装修块模块类型
	*@return 
	*/
	public String getBlock_module_type(){
		return  block_module_type;
	}
	/**
	* 装修块模块类型
	*@param  block_module_type
	*/
	public void setBlock_module_type(String block_module_type ){
		this.block_module_type = block_module_type;
	}
	

}
