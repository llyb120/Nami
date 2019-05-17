package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_brand")
public class RaBrand   {
	
	// alias
	public static final String ALIAS_brand_id = "brand_id";
	public static final String ALIAS_brand_apply = "brand_apply";
	public static final String ALIAS_brand_recommend = "brand_recommend";
	public static final String ALIAS_brand_sort = "brand_sort";
	public static final String ALIAS_class_id = "class_id";
	public static final String ALIAS_from_place = "from_place";
	public static final String ALIAS_show_type = "show_type";
	public static final String ALIAS_store_id = "store_id";
	public static final String ALIAS_big_pic = "big_pic";
	public static final String ALIAS_brand_class = "brand_class";
	public static final String ALIAS_brand_initial = "brand_initial";
	public static final String ALIAS_brand_name = "brand_name";
	public static final String ALIAS_brand_pic = "brand_pic";
	
	/*
	索引ID
	*/
	private Integer brand_id ;
	/*
	品牌申请，0为申请中，1为通过，默认为1，申请功能是会员使用，系统后台默认为1
	*/
	private Integer brand_apply ;
	/*
	推荐，0为否，1为是，默认为0
	*/
	private Integer brand_recommend ;
	/*
	排序
	*/
	private Integer brand_sort ;
	/*
	所属分类id
	*/
	private Integer class_id ;
	private Integer from_place ;
	/*
	品牌展示类型 0表示图片 1表示文字 
	*/
	private Integer show_type ;
	/*
	店铺ID
	*/
	private Integer store_id ;
	private String big_pic ;
	/*
	类别名称
	*/
	private String brand_class ;
	/*
	品牌首字母
	*/
	private String brand_initial ;
	/*
	品牌名称
	*/
	private String brand_name ;
	/*
	图片
	*/
	private String brand_pic ;
	
	public RaBrand() {
	}
	
	/**
	* 索引ID
	*@return 
	*/
	public Integer getBrand_id(){
		return  brand_id;
	}
	/**
	* 索引ID
	*@param  brand_id
	*/
	public void setBrand_id(Integer brand_id ){
		this.brand_id = brand_id;
	}
	
	/**
	* 品牌申请，0为申请中，1为通过，默认为1，申请功能是会员使用，系统后台默认为1
	*@return 
	*/
	public Integer getBrand_apply(){
		return  brand_apply;
	}
	/**
	* 品牌申请，0为申请中，1为通过，默认为1，申请功能是会员使用，系统后台默认为1
	*@param  brand_apply
	*/
	public void setBrand_apply(Integer brand_apply ){
		this.brand_apply = brand_apply;
	}
	
	/**
	* 推荐，0为否，1为是，默认为0
	*@return 
	*/
	public Integer getBrand_recommend(){
		return  brand_recommend;
	}
	/**
	* 推荐，0为否，1为是，默认为0
	*@param  brand_recommend
	*/
	public void setBrand_recommend(Integer brand_recommend ){
		this.brand_recommend = brand_recommend;
	}
	
	/**
	* 排序
	*@return 
	*/
	public Integer getBrand_sort(){
		return  brand_sort;
	}
	/**
	* 排序
	*@param  brand_sort
	*/
	public void setBrand_sort(Integer brand_sort ){
		this.brand_sort = brand_sort;
	}
	
	/**
	* 所属分类id
	*@return 
	*/
	public Integer getClass_id(){
		return  class_id;
	}
	/**
	* 所属分类id
	*@param  class_id
	*/
	public void setClass_id(Integer class_id ){
		this.class_id = class_id;
	}
	
	public Integer getFrom_place(){
		return  from_place;
	}
	public void setFrom_place(Integer from_place ){
		this.from_place = from_place;
	}
	
	/**
	* 品牌展示类型 0表示图片 1表示文字 
	*@return 
	*/
	public Integer getShow_type(){
		return  show_type;
	}
	/**
	* 品牌展示类型 0表示图片 1表示文字 
	*@param  show_type
	*/
	public void setShow_type(Integer show_type ){
		this.show_type = show_type;
	}
	
	/**
	* 店铺ID
	*@return 
	*/
	public Integer getStore_id(){
		return  store_id;
	}
	/**
	* 店铺ID
	*@param  store_id
	*/
	public void setStore_id(Integer store_id ){
		this.store_id = store_id;
	}
	
	public String getBig_pic(){
		return  big_pic;
	}
	public void setBig_pic(String big_pic ){
		this.big_pic = big_pic;
	}
	
	/**
	* 类别名称
	*@return 
	*/
	public String getBrand_class(){
		return  brand_class;
	}
	/**
	* 类别名称
	*@param  brand_class
	*/
	public void setBrand_class(String brand_class ){
		this.brand_class = brand_class;
	}
	
	/**
	* 品牌首字母
	*@return 
	*/
	public String getBrand_initial(){
		return  brand_initial;
	}
	/**
	* 品牌首字母
	*@param  brand_initial
	*/
	public void setBrand_initial(String brand_initial ){
		this.brand_initial = brand_initial;
	}
	
	/**
	* 品牌名称
	*@return 
	*/
	public String getBrand_name(){
		return  brand_name;
	}
	/**
	* 品牌名称
	*@param  brand_name
	*/
	public void setBrand_name(String brand_name ){
		this.brand_name = brand_name;
	}
	
	/**
	* 图片
	*@return 
	*/
	public String getBrand_pic(){
		return  brand_pic;
	}
	/**
	* 图片
	*@param  brand_pic
	*/
	public void setBrand_pic(String brand_pic ){
		this.brand_pic = brand_pic;
	}
	

}
