package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_store_decoration_album")
public class RaStoreDecorationAlbum   {
	
	// alias
	public static final String ALIAS_image_id = "image_id";
	public static final String ALIAS_image_height = "image_height";
	public static final String ALIAS_image_size = "image_size";
	public static final String ALIAS_image_width = "image_width";
	public static final String ALIAS_store_id = "store_id";
	public static final String ALIAS_upload_time = "upload_time";
	public static final String ALIAS_image_name = "image_name";
	public static final String ALIAS_image_origin_name = "image_origin_name";
	
	/*
	图片编号
	*/
	private Integer image_id ;
	/*
	图片高度
	*/
	private Integer image_height ;
	/*
	图片大小
	*/
	private Integer image_size ;
	/*
	图片宽度
	*/
	private Integer image_width ;
	/*
	店铺编号
	*/
	private Integer store_id ;
	/*
	上传时间
	*/
	private Integer upload_time ;
	/*
	图片名称
	*/
	private String image_name ;
	/*
	图片原始名称
	*/
	private String image_origin_name ;
	
	public RaStoreDecorationAlbum() {
	}
	
	/**
	* 图片编号
	*@return 
	*/
	public Integer getImage_id(){
		return  image_id;
	}
	/**
	* 图片编号
	*@param  image_id
	*/
	public void setImage_id(Integer image_id ){
		this.image_id = image_id;
	}
	
	/**
	* 图片高度
	*@return 
	*/
	public Integer getImage_height(){
		return  image_height;
	}
	/**
	* 图片高度
	*@param  image_height
	*/
	public void setImage_height(Integer image_height ){
		this.image_height = image_height;
	}
	
	/**
	* 图片大小
	*@return 
	*/
	public Integer getImage_size(){
		return  image_size;
	}
	/**
	* 图片大小
	*@param  image_size
	*/
	public void setImage_size(Integer image_size ){
		this.image_size = image_size;
	}
	
	/**
	* 图片宽度
	*@return 
	*/
	public Integer getImage_width(){
		return  image_width;
	}
	/**
	* 图片宽度
	*@param  image_width
	*/
	public void setImage_width(Integer image_width ){
		this.image_width = image_width;
	}
	
	/**
	* 店铺编号
	*@return 
	*/
	public Integer getStore_id(){
		return  store_id;
	}
	/**
	* 店铺编号
	*@param  store_id
	*/
	public void setStore_id(Integer store_id ){
		this.store_id = store_id;
	}
	
	/**
	* 上传时间
	*@return 
	*/
	public Integer getUpload_time(){
		return  upload_time;
	}
	/**
	* 上传时间
	*@param  upload_time
	*/
	public void setUpload_time(Integer upload_time ){
		this.upload_time = upload_time;
	}
	
	/**
	* 图片名称
	*@return 
	*/
	public String getImage_name(){
		return  image_name;
	}
	/**
	* 图片名称
	*@param  image_name
	*/
	public void setImage_name(String image_name ){
		this.image_name = image_name;
	}
	
	/**
	* 图片原始名称
	*@return 
	*/
	public String getImage_origin_name(){
		return  image_origin_name;
	}
	/**
	* 图片原始名称
	*@param  image_origin_name
	*/
	public void setImage_origin_name(String image_origin_name ){
		this.image_origin_name = image_origin_name;
	}
	

}
