package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_circle_fs")
public class RaCircleFs   {
	
	// alias
	public static final String ALIAS_circle_id = "circle_id";
	public static final String ALIAS_friendship_id = "friendship_id";
	public static final String ALIAS_friendship_sort = "friendship_sort";
	public static final String ALIAS_friendship_status = "friendship_status";
	public static final String ALIAS_friendship_name = "friendship_name";
	
	/*
	圈子id
	*/
	private Integer circle_id ;
	/*
	友情圈子id
	*/
	private Integer friendship_id ;
	/*
	友情圈子排序
	*/
	private Integer friendship_sort ;
	/*
	友情圈子名称 1显示 0隐藏
	*/
	private Integer friendship_status ;
	/*
	友情圈子名称
	*/
	private String friendship_name ;
	
	public RaCircleFs() {
	}
	
	/**
	* 圈子id
	*@return 
	*/
	public Integer getCircle_id(){
		return  circle_id;
	}
	/**
	* 圈子id
	*@param  circle_id
	*/
	public void setCircle_id(Integer circle_id ){
		this.circle_id = circle_id;
	}
	
	/**
	* 友情圈子id
	*@return 
	*/
	public Integer getFriendship_id(){
		return  friendship_id;
	}
	/**
	* 友情圈子id
	*@param  friendship_id
	*/
	public void setFriendship_id(Integer friendship_id ){
		this.friendship_id = friendship_id;
	}
	
	/**
	* 友情圈子排序
	*@return 
	*/
	public Integer getFriendship_sort(){
		return  friendship_sort;
	}
	/**
	* 友情圈子排序
	*@param  friendship_sort
	*/
	public void setFriendship_sort(Integer friendship_sort ){
		this.friendship_sort = friendship_sort;
	}
	
	/**
	* 友情圈子名称 1显示 0隐藏
	*@return 
	*/
	public Integer getFriendship_status(){
		return  friendship_status;
	}
	/**
	* 友情圈子名称 1显示 0隐藏
	*@param  friendship_status
	*/
	public void setFriendship_status(Integer friendship_status ){
		this.friendship_status = friendship_status;
	}
	
	/**
	* 友情圈子名称
	*@return 
	*/
	public String getFriendship_name(){
		return  friendship_name;
	}
	/**
	* 友情圈子名称
	*@param  friendship_name
	*/
	public void setFriendship_name(String friendship_name ){
		this.friendship_name = friendship_name;
	}
	

}
