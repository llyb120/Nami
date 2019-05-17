package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_goods_class")
public class RaGoodsClass   {
	
	/*
	索引ID
	*/
	private Integer gcId ;
	/*
	父ID
	*/
	private Integer gcParentId ;
	/*
	排序
	*/
	private Integer gcSort ;
	/*
	是否允许发布虚拟商品，1是，0否
	*/
	private Integer gcVirtual ;
	/*
	类型id
	*/
	private Integer typeId ;
	/*
	佣金比例
	*/
	private BigDecimal commisRate ;
	/*
	描述
	*/
	private String gcDescription ;
	/*
	关键词
	*/
	private String gcKeywords ;
	/*
	分类名称
	*/
	private String gcName ;
	/*
	名称
	*/
	private String gcTitle ;
	/*
	类型名称
	*/
	private String typeName ;
	
	public RaGoodsClass() {
	}
	
	/**
	* 索引ID
	*@return 
	*/
	public Integer getGcId(){
		return  gcId;
	}
	/**
	* 索引ID
	*@param  gcId
	*/
	public void setGcId(Integer gcId ){
		this.gcId = gcId;
	}
	
	/**
	* 父ID
	*@return 
	*/
	public Integer getGcParentId(){
		return  gcParentId;
	}
	/**
	* 父ID
	*@param  gcParentId
	*/
	public void setGcParentId(Integer gcParentId ){
		this.gcParentId = gcParentId;
	}
	
	/**
	* 排序
	*@return 
	*/
	public Integer getGcSort(){
		return  gcSort;
	}
	/**
	* 排序
	*@param  gcSort
	*/
	public void setGcSort(Integer gcSort ){
		this.gcSort = gcSort;
	}
	
	/**
	* 是否允许发布虚拟商品，1是，0否
	*@return 
	*/
	public Integer getGcVirtual(){
		return  gcVirtual;
	}
	/**
	* 是否允许发布虚拟商品，1是，0否
	*@param  gcVirtual
	*/
	public void setGcVirtual(Integer gcVirtual ){
		this.gcVirtual = gcVirtual;
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
	* 佣金比例
	*@return 
	*/
	public BigDecimal getCommisRate(){
		return  commisRate;
	}
	/**
	* 佣金比例
	*@param  commisRate
	*/
	public void setCommisRate(BigDecimal commisRate ){
		this.commisRate = commisRate;
	}
	
	/**
	* 描述
	*@return 
	*/
	public String getGcDescription(){
		return  gcDescription;
	}
	/**
	* 描述
	*@param  gcDescription
	*/
	public void setGcDescription(String gcDescription ){
		this.gcDescription = gcDescription;
	}
	
	/**
	* 关键词
	*@return 
	*/
	public String getGcKeywords(){
		return  gcKeywords;
	}
	/**
	* 关键词
	*@param  gcKeywords
	*/
	public void setGcKeywords(String gcKeywords ){
		this.gcKeywords = gcKeywords;
	}
	
	/**
	* 分类名称
	*@return 
	*/
	public String getGcName(){
		return  gcName;
	}
	/**
	* 分类名称
	*@param  gcName
	*/
	public void setGcName(String gcName ){
		this.gcName = gcName;
	}
	
	/**
	* 名称
	*@return 
	*/
	public String getGcTitle(){
		return  gcTitle;
	}
	/**
	* 名称
	*@param  gcTitle
	*/
	public void setGcTitle(String gcTitle ){
		this.gcTitle = gcTitle;
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
