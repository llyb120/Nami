package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_sns_albumclass")
public class RaSnsAlbumclass   {
	
	// alias
	public static final String ALIAS_ac_id = "ac_id";
	public static final String ALIAS_ac_sort = "ac_sort";
	public static final String ALIAS_is_default = "is_default";
	public static final String ALIAS_member_id = "member_id";
	public static final String ALIAS_upload_time = "upload_time";
	public static final String ALIAS_ac_cover = "ac_cover";
	public static final String ALIAS_ac_des = "ac_des";
	public static final String ALIAS_ac_name = "ac_name";
	
	/*
	相册id
	*/
	private Integer ac_id ;
	/*
	排序
	*/
	private Integer ac_sort ;
	/*
	是否为买家秀相册  1为是,0为否
	*/
	private Integer is_default ;
	/*
	所属会员id
	*/
	private Integer member_id ;
	/*
	图片上传时间
	*/
	private Integer upload_time ;
	/*
	相册封面
	*/
	private String ac_cover ;
	/*
	相册描述
	*/
	private String ac_des ;
	/*
	相册名称
	*/
	private String ac_name ;
	
	public RaSnsAlbumclass() {
	}
	
	/**
	* 相册id
	*@return 
	*/
	public Integer getAc_id(){
		return  ac_id;
	}
	/**
	* 相册id
	*@param  ac_id
	*/
	public void setAc_id(Integer ac_id ){
		this.ac_id = ac_id;
	}
	
	/**
	* 排序
	*@return 
	*/
	public Integer getAc_sort(){
		return  ac_sort;
	}
	/**
	* 排序
	*@param  ac_sort
	*/
	public void setAc_sort(Integer ac_sort ){
		this.ac_sort = ac_sort;
	}
	
	/**
	* 是否为买家秀相册  1为是,0为否
	*@return 
	*/
	public Integer getIs_default(){
		return  is_default;
	}
	/**
	* 是否为买家秀相册  1为是,0为否
	*@param  is_default
	*/
	public void setIs_default(Integer is_default ){
		this.is_default = is_default;
	}
	
	/**
	* 所属会员id
	*@return 
	*/
	public Integer getMember_id(){
		return  member_id;
	}
	/**
	* 所属会员id
	*@param  member_id
	*/
	public void setMember_id(Integer member_id ){
		this.member_id = member_id;
	}
	
	/**
	* 图片上传时间
	*@return 
	*/
	public Integer getUpload_time(){
		return  upload_time;
	}
	/**
	* 图片上传时间
	*@param  upload_time
	*/
	public void setUpload_time(Integer upload_time ){
		this.upload_time = upload_time;
	}
	
	/**
	* 相册封面
	*@return 
	*/
	public String getAc_cover(){
		return  ac_cover;
	}
	/**
	* 相册封面
	*@param  ac_cover
	*/
	public void setAc_cover(String ac_cover ){
		this.ac_cover = ac_cover;
	}
	
	/**
	* 相册描述
	*@return 
	*/
	public String getAc_des(){
		return  ac_des;
	}
	/**
	* 相册描述
	*@param  ac_des
	*/
	public void setAc_des(String ac_des ){
		this.ac_des = ac_des;
	}
	
	/**
	* 相册名称
	*@return 
	*/
	public String getAc_name(){
		return  ac_name;
	}
	/**
	* 相册名称
	*@param  ac_name
	*/
	public void setAc_name(String ac_name ){
		this.ac_name = ac_name;
	}
	

}
