package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_favorites")
public class RaFavorites   {
	
	private Integer id ;
	/*
	收藏ID
	*/
	private Integer favId ;
	/*
	收藏时间
	*/
	private Integer favTime ;
	/*
	会员ID
	*/
	private Integer memberId ;
	/*
	收藏类型
	*/
	private String favType ;
	
	public RaFavorites() {
	}
	
	public Integer getId(){
		return  id;
	}
	public void setId(Integer id ){
		this.id = id;
	}
	
	/**
	* 收藏ID
	*@return 
	*/
	public Integer getFavId(){
		return  favId;
	}
	/**
	* 收藏ID
	*@param  favId
	*/
	public void setFavId(Integer favId ){
		this.favId = favId;
	}
	
	/**
	* 收藏时间
	*@return 
	*/
	public Integer getFavTime(){
		return  favTime;
	}
	/**
	* 收藏时间
	*@param  favTime
	*/
	public void setFavTime(Integer favTime ){
		this.favTime = favTime;
	}
	
	/**
	* 会员ID
	*@return 
	*/
	public Integer getMemberId(){
		return  memberId;
	}
	/**
	* 会员ID
	*@param  memberId
	*/
	public void setMemberId(Integer memberId ){
		this.memberId = memberId;
	}
	
	/**
	* 收藏类型
	*@return 
	*/
	public String getFavType(){
		return  favType;
	}
	/**
	* 收藏类型
	*@param  favType
	*/
	public void setFavType(String favType ){
		this.favType = favType;
	}
	

}
