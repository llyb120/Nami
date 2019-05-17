package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_goods_class_staple")
public class RaGoodsClassStaple   {
	
	// alias
	public static final String ALIAS_staple_id = "staple_id";
	public static final String ALIAS_counter = "counter";
	public static final String ALIAS_gc_id_1 = "gc_id_1";
	public static final String ALIAS_gc_id_2 = "gc_id_2";
	public static final String ALIAS_gc_id_3 = "gc_id_3";
	public static final String ALIAS_member_id = "member_id";
	public static final String ALIAS_type_id = "type_id";
	public static final String ALIAS_staple_name = "staple_name";
	
	/*
	常用分类id
	*/
	private Integer staple_id ;
	/*
	计数器
	*/
	private Integer counter ;
	/*
	一级分类id
	*/
	private Integer gc_id_1 ;
	/*
	二级商品分类
	*/
	private Integer gc_id_2 ;
	/*
	三级商品分类
	*/
	private Integer gc_id_3 ;
	/*
	会员id
	*/
	private Integer member_id ;
	/*
	类型id
	*/
	private Integer type_id ;
	/*
	常用分类名称
	*/
	private String staple_name ;
	
	public RaGoodsClassStaple() {
	}
	
	/**
	* 常用分类id
	*@return 
	*/
	public Integer getStaple_id(){
		return  staple_id;
	}
	/**
	* 常用分类id
	*@param  staple_id
	*/
	public void setStaple_id(Integer staple_id ){
		this.staple_id = staple_id;
	}
	
	/**
	* 计数器
	*@return 
	*/
	public Integer getCounter(){
		return  counter;
	}
	/**
	* 计数器
	*@param  counter
	*/
	public void setCounter(Integer counter ){
		this.counter = counter;
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
	* 二级商品分类
	*@return 
	*/
	public Integer getGc_id_2(){
		return  gc_id_2;
	}
	/**
	* 二级商品分类
	*@param  gc_id_2
	*/
	public void setGc_id_2(Integer gc_id_2 ){
		this.gc_id_2 = gc_id_2;
	}
	
	/**
	* 三级商品分类
	*@return 
	*/
	public Integer getGc_id_3(){
		return  gc_id_3;
	}
	/**
	* 三级商品分类
	*@param  gc_id_3
	*/
	public void setGc_id_3(Integer gc_id_3 ){
		this.gc_id_3 = gc_id_3;
	}
	
	/**
	* 会员id
	*@return 
	*/
	public Integer getMember_id(){
		return  member_id;
	}
	/**
	* 会员id
	*@param  member_id
	*/
	public void setMember_id(Integer member_id ){
		this.member_id = member_id;
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
	* 常用分类名称
	*@return 
	*/
	public String getStaple_name(){
		return  staple_name;
	}
	/**
	* 常用分类名称
	*@param  staple_name
	*/
	public void setStaple_name(String staple_name ){
		this.staple_name = staple_name;
	}
	

}
