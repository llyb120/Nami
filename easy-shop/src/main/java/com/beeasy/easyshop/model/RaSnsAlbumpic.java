package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_sns_albumpic")
public class RaSnsAlbumpic   {
	
	// alias
	public static final String ALIAS_ap_id = "ap_id";
	public static final String ALIAS_ac_id = "ac_id";
	public static final String ALIAS_ap_size = "ap_size";
	public static final String ALIAS_ap_type = "ap_type";
	public static final String ALIAS_item_id = "item_id";
	public static final String ALIAS_member_id = "member_id";
	public static final String ALIAS_upload_time = "upload_time";
	public static final String ALIAS_ap_cover = "ap_cover";
	public static final String ALIAS_ap_name = "ap_name";
	public static final String ALIAS_ap_spec = "ap_spec";
	
	/*
	相册图片表id
	*/
	private Integer ap_id ;
	/*
	相册id
	*/
	private Integer ac_id ;
	/*
	图片大小
	*/
	private Integer ap_size ;
	/*
	图片类型，0为无、1为买家秀
	*/
	private Integer ap_type ;
	/*
	信息ID
	*/
	private Integer item_id ;
	/*
	所属店铺id
	*/
	private Integer member_id ;
	/*
	图片上传时间
	*/
	private Integer upload_time ;
	/*
	图片路径
	*/
	private String ap_cover ;
	/*
	图片名称
	*/
	private String ap_name ;
	/*
	图片规格
	*/
	private String ap_spec ;
	
	public RaSnsAlbumpic() {
	}
	
	/**
	* 相册图片表id
	*@return 
	*/
	public Integer getAp_id(){
		return  ap_id;
	}
	/**
	* 相册图片表id
	*@param  ap_id
	*/
	public void setAp_id(Integer ap_id ){
		this.ap_id = ap_id;
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
	* 图片大小
	*@return 
	*/
	public Integer getAp_size(){
		return  ap_size;
	}
	/**
	* 图片大小
	*@param  ap_size
	*/
	public void setAp_size(Integer ap_size ){
		this.ap_size = ap_size;
	}
	
	/**
	* 图片类型，0为无、1为买家秀
	*@return 
	*/
	public Integer getAp_type(){
		return  ap_type;
	}
	/**
	* 图片类型，0为无、1为买家秀
	*@param  ap_type
	*/
	public void setAp_type(Integer ap_type ){
		this.ap_type = ap_type;
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
	* 所属店铺id
	*@return 
	*/
	public Integer getMember_id(){
		return  member_id;
	}
	/**
	* 所属店铺id
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
	* 图片路径
	*@return 
	*/
	public String getAp_cover(){
		return  ap_cover;
	}
	/**
	* 图片路径
	*@param  ap_cover
	*/
	public void setAp_cover(String ap_cover ){
		this.ap_cover = ap_cover;
	}
	
	/**
	* 图片名称
	*@return 
	*/
	public String getAp_name(){
		return  ap_name;
	}
	/**
	* 图片名称
	*@param  ap_name
	*/
	public void setAp_name(String ap_name ){
		this.ap_name = ap_name;
	}
	
	/**
	* 图片规格
	*@return 
	*/
	public String getAp_spec(){
		return  ap_spec;
	}
	/**
	* 图片规格
	*@param  ap_spec
	*/
	public void setAp_spec(String ap_spec ){
		this.ap_spec = ap_spec;
	}
	

}
