package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_goods_class_tag")
public class RaGoodsClassTag   {
	
	// alias
	public static final String ALIAS_gc_tag_id = "gc_tag_id";
	public static final String ALIAS_gc_id = "gc_id";
	public static final String ALIAS_gc_id_1 = "gc_id_1";
	public static final String ALIAS_gc_id_2 = "gc_id_2";
	public static final String ALIAS_gc_id_3 = "gc_id_3";
	public static final String ALIAS_type_id = "type_id";
	public static final String ALIAS_gc_tag_name = "gc_tag_name";
	public static final String ALIAS_gc_tag_value = "gc_tag_value";
	
	/*
	TAGid
	*/
	private Integer gc_tag_id ;
	/*
	商品分类id
	*/
	private Integer gc_id ;
	/*
	一级分类id
	*/
	private Integer gc_id_1 ;
	/*
	二级分类id
	*/
	private Integer gc_id_2 ;
	/*
	三级分类id
	*/
	private Integer gc_id_3 ;
	/*
	类型id
	*/
	private Integer type_id ;
	/*
	分类TAG名称
	*/
	private String gc_tag_name ;
	/*
	分类TAG值
	*/
	private String gc_tag_value ;
	
	public RaGoodsClassTag() {
	}
	
	/**
	* TAGid
	*@return 
	*/
	public Integer getGc_tag_id(){
		return  gc_tag_id;
	}
	/**
	* TAGid
	*@param  gc_tag_id
	*/
	public void setGc_tag_id(Integer gc_tag_id ){
		this.gc_tag_id = gc_tag_id;
	}
	
	/**
	* 商品分类id
	*@return 
	*/
	public Integer getGc_id(){
		return  gc_id;
	}
	/**
	* 商品分类id
	*@param  gc_id
	*/
	public void setGc_id(Integer gc_id ){
		this.gc_id = gc_id;
	}
	
	/**
	* 一级分类id
	*@return 
	*/
	public Integer getGc_id_1(){
		return  gc_id_1;
	}
	/**
	* 一级分类id
	*@param  gc_id_1
	*/
	public void setGc_id_1(Integer gc_id_1 ){
		this.gc_id_1 = gc_id_1;
	}
	
	/**
	* 二级分类id
	*@return 
	*/
	public Integer getGc_id_2(){
		return  gc_id_2;
	}
	/**
	* 二级分类id
	*@param  gc_id_2
	*/
	public void setGc_id_2(Integer gc_id_2 ){
		this.gc_id_2 = gc_id_2;
	}
	
	/**
	* 三级分类id
	*@return 
	*/
	public Integer getGc_id_3(){
		return  gc_id_3;
	}
	/**
	* 三级分类id
	*@param  gc_id_3
	*/
	public void setGc_id_3(Integer gc_id_3 ){
		this.gc_id_3 = gc_id_3;
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
	* 分类TAG名称
	*@return 
	*/
	public String getGc_tag_name(){
		return  gc_tag_name;
	}
	/**
	* 分类TAG名称
	*@param  gc_tag_name
	*/
	public void setGc_tag_name(String gc_tag_name ){
		this.gc_tag_name = gc_tag_name;
	}
	
	/**
	* 分类TAG值
	*@return 
	*/
	public String getGc_tag_value(){
		return  gc_tag_value;
	}
	/**
	* 分类TAG值
	*@param  gc_tag_value
	*/
	public void setGc_tag_value(String gc_tag_value ){
		this.gc_tag_value = gc_tag_value;
	}
	

}
