package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_circle_fs")
public class RaCircleFs   {
	
	/*
	圈子id
	*/
	private Integer circleId ;
	/*
	友情圈子id
	*/
	private Integer friendshipId ;
	/*
	友情圈子排序
	*/
	private Integer friendshipSort ;
	/*
	友情圈子名称 1显示 0隐藏
	*/
	private Integer friendshipStatus ;
	/*
	友情圈子名称
	*/
	private String friendshipName ;
	
	public RaCircleFs() {
	}
	
	/**
	* 圈子id
	*@return 
	*/
	public Integer getCircleId(){
		return  circleId;
	}
	/**
	* 圈子id
	*@param  circleId
	*/
	public void setCircleId(Integer circleId ){
		this.circleId = circleId;
	}
	
	/**
	* 友情圈子id
	*@return 
	*/
	public Integer getFriendshipId(){
		return  friendshipId;
	}
	/**
	* 友情圈子id
	*@param  friendshipId
	*/
	public void setFriendshipId(Integer friendshipId ){
		this.friendshipId = friendshipId;
	}
	
	/**
	* 友情圈子排序
	*@return 
	*/
	public Integer getFriendshipSort(){
		return  friendshipSort;
	}
	/**
	* 友情圈子排序
	*@param  friendshipSort
	*/
	public void setFriendshipSort(Integer friendshipSort ){
		this.friendshipSort = friendshipSort;
	}
	
	/**
	* 友情圈子名称 1显示 0隐藏
	*@return 
	*/
	public Integer getFriendshipStatus(){
		return  friendshipStatus;
	}
	/**
	* 友情圈子名称 1显示 0隐藏
	*@param  friendshipStatus
	*/
	public void setFriendshipStatus(Integer friendshipStatus ){
		this.friendshipStatus = friendshipStatus;
	}
	
	/**
	* 友情圈子名称
	*@return 
	*/
	public String getFriendshipName(){
		return  friendshipName;
	}
	/**
	* 友情圈子名称
	*@param  friendshipName
	*/
	public void setFriendshipName(String friendshipName ){
		this.friendshipName = friendshipName;
	}
	

}
