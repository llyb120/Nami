package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_album_class")
public class RaAlbumClass   {
	
	// alias
	public static final String ALIAS_aclass_id = "aclass_id";
	public static final String ALIAS_aclass_sort = "aclass_sort";
	public static final String ALIAS_is_default = "is_default";
	public static final String ALIAS_store_id = "store_id";
	public static final String ALIAS_upload_time = "upload_time";
	public static final String ALIAS_aclass_cover = "aclass_cover";
	public static final String ALIAS_aclass_des = "aclass_des";
	public static final String ALIAS_aclass_name = "aclass_name";
	public static final String ALIAS_n_conver = "n_conver";
	
	/*
	相册id
	*/
	private Integer aclass_id ;
	/*
	排序
	*/
	private Integer aclass_sort ;
	/*
	是否为默认相册,1代表默认
	*/
	private Integer is_default ;
	/*
	所属店铺id
	*/
	private Integer store_id ;
	/*
	图片上传时间
	*/
	private Integer upload_time ;
	/*
	相册封面
	*/
	private String aclass_cover ;
	/*
	相册描述
	*/
	private String aclass_des ;
	/*
	相册名称
	*/
	private String aclass_name ;
	/*
	修复后的封面路径
	*/
	private String n_conver ;
	
	public RaAlbumClass() {
	}
	
	/**
	* 相册id
	*@return 
	*/
	public Integer getAclass_id(){
		return  aclass_id;
	}
	/**
	* 相册id
	*@param  aclass_id
	*/
	public void setAclass_id(Integer aclass_id ){
		this.aclass_id = aclass_id;
	}
	
	/**
	* 排序
	*@return 
	*/
	public Integer getAclass_sort(){
		return  aclass_sort;
	}
	/**
	* 排序
	*@param  aclass_sort
	*/
	public void setAclass_sort(Integer aclass_sort ){
		this.aclass_sort = aclass_sort;
	}
	
	/**
	* 是否为默认相册,1代表默认
	*@return 
	*/
	public Integer getIs_default(){
		return  is_default;
	}
	/**
	* 是否为默认相册,1代表默认
	*@param  is_default
	*/
	public void setIs_default(Integer is_default ){
		this.is_default = is_default;
	}
	
	/**
	* 所属店铺id
	*@return 
	*/
	public Integer getStore_id(){
		return  store_id;
	}
	/**
	* 所属店铺id
	*@param  store_id
	*/
	public void setStore_id(Integer store_id ){
		this.store_id = store_id;
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
	public String getAclass_cover(){
		return  aclass_cover;
	}
	/**
	* 相册封面
	*@param  aclass_cover
	*/
	public void setAclass_cover(String aclass_cover ){
		this.aclass_cover = aclass_cover;
	}
	
	/**
	* 相册描述
	*@return 
	*/
	public String getAclass_des(){
		return  aclass_des;
	}
	/**
	* 相册描述
	*@param  aclass_des
	*/
	public void setAclass_des(String aclass_des ){
		this.aclass_des = aclass_des;
	}
	
	/**
	* 相册名称
	*@return 
	*/
	public String getAclass_name(){
		return  aclass_name;
	}
	/**
	* 相册名称
	*@param  aclass_name
	*/
	public void setAclass_name(String aclass_name ){
		this.aclass_name = aclass_name;
	}
	
	/**
	* 修复后的封面路径
	*@return 
	*/
	public String getN_conver(){
		return  n_conver;
	}
	/**
	* 修复后的封面路径
	*@param  n_conver
	*/
	public void setN_conver(String n_conver ){
		this.n_conver = n_conver;
	}
	

}
