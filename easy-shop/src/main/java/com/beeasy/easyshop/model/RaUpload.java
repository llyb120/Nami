package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_upload")
public class RaUpload   {
	
	// alias
	public static final String ALIAS_upload_id = "upload_id";
	public static final String ALIAS_file_size = "file_size";
	public static final String ALIAS_item_id = "item_id";
	public static final String ALIAS_upload_time = "upload_time";
	public static final String ALIAS_upload_type = "upload_type";
	public static final String ALIAS_file_name = "file_name";
	public static final String ALIAS_file_thumb = "file_thumb";
	
	/*
	索引ID
	*/
	private Integer upload_id ;
	/*
	文件大小
	*/
	private Integer file_size ;
	/*
	信息ID
	*/
	private Integer item_id ;
	/*
	添加时间
	*/
	private Integer upload_time ;
	/*
	文件类别，0为无，1为文章图片，默认为0，2为帮助内容图片，3为店铺幻灯片，4为系统文章图片，5为积分礼品切换图片，6为积分礼品内容图片
	*/
	private Integer upload_type ;
	/*
	文件名
	*/
	private String file_name ;
	/*
	缩微图片
	*/
	private String file_thumb ;
	
	public RaUpload() {
	}
	
	/**
	* 索引ID
	*@return 
	*/
	public Integer getUpload_id(){
		return  upload_id;
	}
	/**
	* 索引ID
	*@param  upload_id
	*/
	public void setUpload_id(Integer upload_id ){
		this.upload_id = upload_id;
	}
	
	/**
	* 文件大小
	*@return 
	*/
	public Integer getFile_size(){
		return  file_size;
	}
	/**
	* 文件大小
	*@param  file_size
	*/
	public void setFile_size(Integer file_size ){
		this.file_size = file_size;
	}
	
	/**
	* 信息ID
	*@return 
	*/
	public Integer getItem_id(){
		return  item_id;
	}
	/**
	* 信息ID
	*@param  item_id
	*/
	public void setItem_id(Integer item_id ){
		this.item_id = item_id;
	}
	
	/**
	* 添加时间
	*@return 
	*/
	public Integer getUpload_time(){
		return  upload_time;
	}
	/**
	* 添加时间
	*@param  upload_time
	*/
	public void setUpload_time(Integer upload_time ){
		this.upload_time = upload_time;
	}
	
	/**
	* 文件类别，0为无，1为文章图片，默认为0，2为帮助内容图片，3为店铺幻灯片，4为系统文章图片，5为积分礼品切换图片，6为积分礼品内容图片
	*@return 
	*/
	public Integer getUpload_type(){
		return  upload_type;
	}
	/**
	* 文件类别，0为无，1为文章图片，默认为0，2为帮助内容图片，3为店铺幻灯片，4为系统文章图片，5为积分礼品切换图片，6为积分礼品内容图片
	*@param  upload_type
	*/
	public void setUpload_type(Integer upload_type ){
		this.upload_type = upload_type;
	}
	
	/**
	* 文件名
	*@return 
	*/
	public String getFile_name(){
		return  file_name;
	}
	/**
	* 文件名
	*@param  file_name
	*/
	public void setFile_name(String file_name ){
		this.file_name = file_name;
	}
	
	/**
	* 缩微图片
	*@return 
	*/
	public String getFile_thumb(){
		return  file_thumb;
	}
	/**
	* 缩微图片
	*@param  file_thumb
	*/
	public void setFile_thumb(String file_thumb ){
		this.file_thumb = file_thumb;
	}
	

}
