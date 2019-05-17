package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_album_pic")
public class RaAlbumPic   {
	
	// alias
	public static final String ALIAS_apic_id = "apic_id";
	public static final String ALIAS_aclass_id = "aclass_id";
	public static final String ALIAS_apic_size = "apic_size";
	public static final String ALIAS_store_id = "store_id";
	public static final String ALIAS_upload_time = "upload_time";
	public static final String ALIAS_apic_cover = "apic_cover";
	public static final String ALIAS_apic_name = "apic_name";
	public static final String ALIAS_apic_spec = "apic_spec";
	public static final String ALIAS_apic_tag = "apic_tag";
	
	/*
	相册图片表id
	*/
	private Integer apic_id ;
	/*
	相册id
	*/
	private Integer aclass_id ;
	/*
	图片大小
	*/
	private Integer apic_size ;
	/*
	所属店铺id
	*/
	private Integer store_id ;
	/*
	图片上传时间
	*/
	private Integer upload_time ;
	/*
	图片路径
	*/
	private String apic_cover ;
	/*
	图片名称
	*/
	private String apic_name ;
	/*
	图片规格
	*/
	private String apic_spec ;
	/*
	图片标签
	*/
	private String apic_tag ;
	
	public RaAlbumPic() {
	}
	
	/**
	* 相册图片表id
	*@return 
	*/
	public Integer getApic_id(){
		return  apic_id;
	}
	/**
	* 相册图片表id
	*@param  apic_id
	*/
	public void setApic_id(Integer apic_id ){
		this.apic_id = apic_id;
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
	* 图片大小
	*@return 
	*/
	public Integer getApic_size(){
		return  apic_size;
	}
	/**
	* 图片大小
	*@param  apic_size
	*/
	public void setApic_size(Integer apic_size ){
		this.apic_size = apic_size;
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
	* 图片路径
	*@return 
	*/
	public String getApic_cover(){
		return  apic_cover;
	}
	/**
	* 图片路径
	*@param  apic_cover
	*/
	public void setApic_cover(String apic_cover ){
		this.apic_cover = apic_cover;
	}
	
	/**
	* 图片名称
	*@return 
	*/
	public String getApic_name(){
		return  apic_name;
	}
	/**
	* 图片名称
	*@param  apic_name
	*/
	public void setApic_name(String apic_name ){
		this.apic_name = apic_name;
	}
	
	/**
	* 图片规格
	*@return 
	*/
	public String getApic_spec(){
		return  apic_spec;
	}
	/**
	* 图片规格
	*@param  apic_spec
	*/
	public void setApic_spec(String apic_spec ){
		this.apic_spec = apic_spec;
	}
	
	/**
	* 图片标签
	*@return 
	*/
	public String getApic_tag(){
		return  apic_tag;
	}
	/**
	* 图片标签
	*@param  apic_tag
	*/
	public void setApic_tag(String apic_tag ){
		this.apic_tag = apic_tag;
	}
	

}
