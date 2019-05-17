package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_store_decoration_block")
public class RaStoreDecorationBlock   {
	
	/*
	装修块编号
	*/
	private Integer blockId ;
	/*
	是否100%宽度(0-否 1-是)
	*/
	private Integer blockFullWidth ;
	/*
	块排序
	*/
	private Integer blockSort ;
	/*
	装修编号
	*/
	private Integer decorationId ;
	/*
	店铺编号
	*/
	private Integer storeId ;
	/*
	块内容
	*/
	private String blockContent ;
	/*
	块布局
	*/
	private String blockLayout ;
	/*
	装修块模块类型
	*/
	private String blockModuleType ;
	
	public RaStoreDecorationBlock() {
	}
	
	/**
	* 装修块编号
	*@return 
	*/
	public Integer getBlockId(){
		return  blockId;
	}
	/**
	* 装修块编号
	*@param  blockId
	*/
	public void setBlockId(Integer blockId ){
		this.blockId = blockId;
	}
	
	/**
	* 是否100%宽度(0-否 1-是)
	*@return 
	*/
	public Integer getBlockFullWidth(){
		return  blockFullWidth;
	}
	/**
	* 是否100%宽度(0-否 1-是)
	*@param  blockFullWidth
	*/
	public void setBlockFullWidth(Integer blockFullWidth ){
		this.blockFullWidth = blockFullWidth;
	}
	
	/**
	* 块排序
	*@return 
	*/
	public Integer getBlockSort(){
		return  blockSort;
	}
	/**
	* 块排序
	*@param  blockSort
	*/
	public void setBlockSort(Integer blockSort ){
		this.blockSort = blockSort;
	}
	
	/**
	* 装修编号
	*@return 
	*/
	public Integer getDecorationId(){
		return  decorationId;
	}
	/**
	* 装修编号
	*@param  decorationId
	*/
	public void setDecorationId(Integer decorationId ){
		this.decorationId = decorationId;
	}
	
	/**
	* 店铺编号
	*@return 
	*/
	public Integer getStoreId(){
		return  storeId;
	}
	/**
	* 店铺编号
	*@param  storeId
	*/
	public void setStoreId(Integer storeId ){
		this.storeId = storeId;
	}
	
	/**
	* 块内容
	*@return 
	*/
	public String getBlockContent(){
		return  blockContent;
	}
	/**
	* 块内容
	*@param  blockContent
	*/
	public void setBlockContent(String blockContent ){
		this.blockContent = blockContent;
	}
	
	/**
	* 块布局
	*@return 
	*/
	public String getBlockLayout(){
		return  blockLayout;
	}
	/**
	* 块布局
	*@param  blockLayout
	*/
	public void setBlockLayout(String blockLayout ){
		this.blockLayout = blockLayout;
	}
	
	/**
	* 装修块模块类型
	*@return 
	*/
	public String getBlockModuleType(){
		return  blockModuleType;
	}
	/**
	* 装修块模块类型
	*@param  blockModuleType
	*/
	public void setBlockModuleType(String blockModuleType ){
		this.blockModuleType = blockModuleType;
	}
	

}
