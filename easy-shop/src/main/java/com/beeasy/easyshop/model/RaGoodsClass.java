package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_goods_class")
public class RaGoodsClass   {
	
	// alias
	public static final String ALIAS_gc_id = "gc_id";
	public static final String ALIAS_gc_parent_id = "gc_parent_id";
	public static final String ALIAS_gc_sort = "gc_sort";
	public static final String ALIAS_gc_virtual = "gc_virtual";
	public static final String ALIAS_type_id = "type_id";
	public static final String ALIAS_commis_rate = "commis_rate";
	public static final String ALIAS_gc_description = "gc_description";
	public static final String ALIAS_gc_keywords = "gc_keywords";
	public static final String ALIAS_gc_name = "gc_name";
	public static final String ALIAS_gc_title = "gc_title";
	public static final String ALIAS_type_name = "type_name";
	
	/*
	索引ID
	*/
	private Integer gc_id ;
	/*
	父ID
	*/
	private Integer gc_parent_id ;
	/*
	排序
	*/
	private Integer gc_sort ;
	/*
	是否允许发布虚拟商品，1是，0否
	*/
	private Integer gc_virtual ;
	/*
	类型id
	*/
	private Integer type_id ;
	/*
	佣金比例
	*/
	private BigDecimal commis_rate ;
	/*
	描述
	*/
	private String gc_description ;
	/*
	关键词
	*/
	private String gc_keywords ;
	/*
	分类名称
	*/
	private String gc_name ;
	/*
	名称
	*/
	private String gc_title ;
	/*
	类型名称
	*/
	private String type_name ;
	
	public RaGoodsClass() {
	}
	
	/**
	* 索引ID
	*@return 
	*/
	public Integer getGc_id(){
		return  gc_id;
	}
	/**
	* 索引ID
	*@param  gc_id
	*/
	public void setGc_id(Integer gc_id ){
		this.gc_id = gc_id;
	}
	
	/**
	* 父ID
	*@return 
	*/
	public Integer getGc_parent_id(){
		return  gc_parent_id;
	}
	/**
	* 父ID
	*@param  gc_parent_id
	*/
	public void setGc_parent_id(Integer gc_parent_id ){
		this.gc_parent_id = gc_parent_id;
	}
	
	/**
	* 排序
	*@return 
	*/
	public Integer getGc_sort(){
		return  gc_sort;
	}
	/**
	* 排序
	*@param  gc_sort
	*/
	public void setGc_sort(Integer gc_sort ){
		this.gc_sort = gc_sort;
	}
	
	/**
	* 是否允许发布虚拟商品，1是，0否
	*@return 
	*/
	public Integer getGc_virtual(){
		return  gc_virtual;
	}
	/**
	* 是否允许发布虚拟商品，1是，0否
	*@param  gc_virtual
	*/
	public void setGc_virtual(Integer gc_virtual ){
		this.gc_virtual = gc_virtual;
	}
	
	/**
	* 类型id
	*@return 
	*/
	public Integer getType_id(){
		return  type_id;
	}
	/**
	* 类型id
	*@param  type_id
	*/
	public void setType_id(Integer type_id ){
		this.type_id = type_id;
	}
	
	/**
	* 佣金比例
	*@return 
	*/
	public BigDecimal getCommis_rate(){
		return  commis_rate;
	}
	/**
	* 佣金比例
	*@param  commis_rate
	*/
	public void setCommis_rate(BigDecimal commis_rate ){
		this.commis_rate = commis_rate;
	}
	
	/**
	* 描述
	*@return 
	*/
	public String getGc_description(){
		return  gc_description;
	}
	/**
	* 描述
	*@param  gc_description
	*/
	public void setGc_description(String gc_description ){
		this.gc_description = gc_description;
	}
	
	/**
	* 关键词
	*@return 
	*/
	public String getGc_keywords(){
		return  gc_keywords;
	}
	/**
	* 关键词
	*@param  gc_keywords
	*/
	public void setGc_keywords(String gc_keywords ){
		this.gc_keywords = gc_keywords;
	}
	
	/**
	* 分类名称
	*@return 
	*/
	public String getGc_name(){
		return  gc_name;
	}
	/**
	* 分类名称
	*@param  gc_name
	*/
	public void setGc_name(String gc_name ){
		this.gc_name = gc_name;
	}
	
	/**
	* 名称
	*@return 
	*/
	public String getGc_title(){
		return  gc_title;
	}
	/**
	* 名称
	*@param  gc_title
	*/
	public void setGc_title(String gc_title ){
		this.gc_title = gc_title;
	}
	
	/**
	* 类型名称
	*@return 
	*/
	public String getType_name(){
		return  type_name;
	}
	/**
	* 类型名称
	*@param  type_name
	*/
	public void setType_name(String type_name ){
		this.type_name = type_name;
	}
	

}
