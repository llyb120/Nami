package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_circle_class")
public class RaCircleClass   {
	
	// alias
	public static final String ALIAS_class_id = "class_id";
	public static final String ALIAS_class_sort = "class_sort";
	public static final String ALIAS_class_status = "class_status";
	public static final String ALIAS_is_recommend = "is_recommend";
	public static final String ALIAS_class_addtime = "class_addtime";
	public static final String ALIAS_class_name = "class_name";
	
	/*
	圈子分类id
	*/
	private Integer class_id ;
	/*
	圈子分类排序
	*/
	private Integer class_sort ;
	/*
	圈子分类状态 0不显示，1显示
	*/
	private Integer class_status ;
	/*
	是否推荐 0未推荐，1已推荐
	*/
	private Integer is_recommend ;
	/*
	圈子分类创建时间
	*/
	private String class_addtime ;
	/*
	圈子分类名称
	*/
	private String class_name ;
	
	public RaCircleClass() {
	}
	
	/**
	* 圈子分类id
	*@return 
	*/
	public Integer getClass_id(){
		return  class_id;
	}
	/**
	* 圈子分类id
	*@param  class_id
	*/
	public void setClass_id(Integer class_id ){
		this.class_id = class_id;
	}
	
	/**
	* 圈子分类排序
	*@return 
	*/
	public Integer getClass_sort(){
		return  class_sort;
	}
	/**
	* 圈子分类排序
	*@param  class_sort
	*/
	public void setClass_sort(Integer class_sort ){
		this.class_sort = class_sort;
	}
	
	/**
	* 圈子分类状态 0不显示，1显示
	*@return 
	*/
	public Integer getClass_status(){
		return  class_status;
	}
	/**
	* 圈子分类状态 0不显示，1显示
	*@param  class_status
	*/
	public void setClass_status(Integer class_status ){
		this.class_status = class_status;
	}
	
	/**
	* 是否推荐 0未推荐，1已推荐
	*@return 
	*/
	public Integer getIs_recommend(){
		return  is_recommend;
	}
	/**
	* 是否推荐 0未推荐，1已推荐
	*@param  is_recommend
	*/
	public void setIs_recommend(Integer is_recommend ){
		this.is_recommend = is_recommend;
	}
	
	/**
	* 圈子分类创建时间
	*@return 
	*/
	public String getClass_addtime(){
		return  class_addtime;
	}
	/**
	* 圈子分类创建时间
	*@param  class_addtime
	*/
	public void setClass_addtime(String class_addtime ){
		this.class_addtime = class_addtime;
	}
	
	/**
	* 圈子分类名称
	*@return 
	*/
	public String getClass_name(){
		return  class_name;
	}
	/**
	* 圈子分类名称
	*@param  class_name
	*/
	public void setClass_name(String class_name ){
		this.class_name = class_name;
	}
	

}
