package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_circle_thclass")
public class RaCircleThclass   {
	
	// alias
	public static final String ALIAS_thclass_id = "thclass_id";
	public static final String ALIAS_circle_id = "circle_id";
	public static final String ALIAS_is_moderator = "is_moderator";
	public static final String ALIAS_thclass_sort = "thclass_sort";
	public static final String ALIAS_thclass_status = "thclass_status";
	public static final String ALIAS_thclass_name = "thclass_name";
	
	/*
	主题分类id
	*/
	private Integer thclass_id ;
	/*
	所属圈子id
	*/
	private Integer circle_id ;
	/*
	管理专属 1是，0否
	*/
	private Integer is_moderator ;
	/*
	分类排序
	*/
	private Integer thclass_sort ;
	/*
	主题状态 1开启，0关闭
	*/
	private Integer thclass_status ;
	/*
	主题名称
	*/
	private String thclass_name ;
	
	public RaCircleThclass() {
	}
	
	/**
	* 主题分类id
	*@return 
	*/
	public Integer getThclass_id(){
		return  thclass_id;
	}
	/**
	* 主题分类id
	*@param  thclass_id
	*/
	public void setThclass_id(Integer thclass_id ){
		this.thclass_id = thclass_id;
	}
	
	/**
	* 所属圈子id
	*@return 
	*/
	public Integer getCircle_id(){
		return  circle_id;
	}
	/**
	* 所属圈子id
	*@param  circle_id
	*/
	public void setCircle_id(Integer circle_id ){
		this.circle_id = circle_id;
	}
	
	/**
	* 管理专属 1是，0否
	*@return 
	*/
	public Integer getIs_moderator(){
		return  is_moderator;
	}
	/**
	* 管理专属 1是，0否
	*@param  is_moderator
	*/
	public void setIs_moderator(Integer is_moderator ){
		this.is_moderator = is_moderator;
	}
	
	/**
	* 分类排序
	*@return 
	*/
	public Integer getThclass_sort(){
		return  thclass_sort;
	}
	/**
	* 分类排序
	*@param  thclass_sort
	*/
	public void setThclass_sort(Integer thclass_sort ){
		this.thclass_sort = thclass_sort;
	}
	
	/**
	* 主题状态 1开启，0关闭
	*@return 
	*/
	public Integer getThclass_status(){
		return  thclass_status;
	}
	/**
	* 主题状态 1开启，0关闭
	*@param  thclass_status
	*/
	public void setThclass_status(Integer thclass_status ){
		this.thclass_status = thclass_status;
	}
	
	/**
	* 主题名称
	*@return 
	*/
	public String getThclass_name(){
		return  thclass_name;
	}
	/**
	* 主题名称
	*@param  thclass_name
	*/
	public void setThclass_name(String thclass_name ){
		this.thclass_name = thclass_name;
	}
	

}
