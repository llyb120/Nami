package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_vr_groupbuy_area")
public class RaVrGroupbuyArea   {
	
	// alias
	public static final String ALIAS_area_id = "area_id";
	public static final String ALIAS_add_time = "add_time";
	public static final String ALIAS_hot_city = "hot_city";
	public static final String ALIAS_number = "number";
	public static final String ALIAS_parent_area_id = "parent_area_id";
	public static final String ALIAS_area_name = "area_name";
	public static final String ALIAS_area_number = "area_number";
	public static final String ALIAS_first_letter = "first_letter";
	public static final String ALIAS_post = "post";
	
	/*
	区域id
	*/
	private Integer area_id ;
	/*
	添加时间
	*/
	private Integer add_time ;
	/*
	0.否 1.是
	*/
	private Integer hot_city ;
	/*
	数量
	*/
	private Integer number ;
	/*
	域区id
	*/
	private Integer parent_area_id ;
	/*
	域区名称
	*/
	private String area_name ;
	/*
	区号
	*/
	private String area_number ;
	/*
	首字母
	*/
	private String first_letter ;
	/*
	邮编
	*/
	private String post ;
	
	public RaVrGroupbuyArea() {
	}
	
	/**
	* 区域id
	*@return 
	*/
	public Integer getArea_id(){
		return  area_id;
	}
	/**
	* 区域id
	*@param  area_id
	*/
	public void setArea_id(Integer area_id ){
		this.area_id = area_id;
	}
	
	/**
	* 添加时间
	*@return 
	*/
	public Integer getAdd_time(){
		return  add_time;
	}
	/**
	* 添加时间
	*@param  add_time
	*/
	public void setAdd_time(Integer add_time ){
		this.add_time = add_time;
	}
	
	/**
	* 0.否 1.是
	*@return 
	*/
	public Integer getHot_city(){
		return  hot_city;
	}
	/**
	* 0.否 1.是
	*@param  hot_city
	*/
	public void setHot_city(Integer hot_city ){
		this.hot_city = hot_city;
	}
	
	/**
	* 数量
	*@return 
	*/
	public Integer getNumber(){
		return  number;
	}
	/**
	* 数量
	*@param  number
	*/
	public void setNumber(Integer number ){
		this.number = number;
	}
	
	/**
	* 域区id
	*@return 
	*/
	public Integer getParent_area_id(){
		return  parent_area_id;
	}
	/**
	* 域区id
	*@param  parent_area_id
	*/
	public void setParent_area_id(Integer parent_area_id ){
		this.parent_area_id = parent_area_id;
	}
	
	/**
	* 域区名称
	*@return 
	*/
	public String getArea_name(){
		return  area_name;
	}
	/**
	* 域区名称
	*@param  area_name
	*/
	public void setArea_name(String area_name ){
		this.area_name = area_name;
	}
	
	/**
	* 区号
	*@return 
	*/
	public String getArea_number(){
		return  area_number;
	}
	/**
	* 区号
	*@param  area_number
	*/
	public void setArea_number(String area_number ){
		this.area_number = area_number;
	}
	
	/**
	* 首字母
	*@return 
	*/
	public String getFirst_letter(){
		return  first_letter;
	}
	/**
	* 首字母
	*@param  first_letter
	*/
	public void setFirst_letter(String first_letter ){
		this.first_letter = first_letter;
	}
	
	/**
	* 邮编
	*@return 
	*/
	public String getPost(){
		return  post;
	}
	/**
	* 邮编
	*@param  post
	*/
	public void setPost(String post ){
		this.post = post;
	}
	

}
