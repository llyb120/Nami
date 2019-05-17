package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_favorites")
public class RaFavorites   {
	
	// alias
	public static final String ALIAS_id = "id";
	public static final String ALIAS_fav_id = "fav_id";
	public static final String ALIAS_fav_time = "fav_time";
	public static final String ALIAS_member_id = "member_id";
	public static final String ALIAS_fav_type = "fav_type";
	
	private Integer id ;
	/*
	收藏ID
	*/
	private Integer fav_id ;
	/*
	收藏时间
	*/
	private Integer fav_time ;
	/*
	会员ID
	*/
	private Integer member_id ;
	/*
	收藏类型
	*/
	private String fav_type ;
	
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
	public Integer getFav_id(){
		return  fav_id;
	}
	/**
	* 收藏ID
	*@param  fav_id
	*/
	public void setFav_id(Integer fav_id ){
		this.fav_id = fav_id;
	}
	
	/**
	* 收藏时间
	*@return 
	*/
	public Integer getFav_time(){
		return  fav_time;
	}
	/**
	* 收藏时间
	*@param  fav_time
	*/
	public void setFav_time(Integer fav_time ){
		this.fav_time = fav_time;
	}
	
	/**
	* 会员ID
	*@return 
	*/
	public Integer getMember_id(){
		return  member_id;
	}
	/**
	* 会员ID
	*@param  member_id
	*/
	public void setMember_id(Integer member_id ){
		this.member_id = member_id;
	}
	
	/**
	* 收藏类型
	*@return 
	*/
	public String getFav_type(){
		return  fav_type;
	}
	/**
	* 收藏类型
	*@param  fav_type
	*/
	public void setFav_type(String fav_type ){
		this.fav_type = fav_type;
	}
	

}
