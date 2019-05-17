package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-16
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
	private Integer aclassId ;
	/*
	排序
	*/
	private Integer aclassSort ;
	/*
	是否为默认相册,1代表默认
	*/
	private Integer isDefault ;
	/*
	所属店铺id
	*/
	private Integer storeId ;
	/*
	图片上传时间
	*/
	private Integer uploadTime ;
	/*
	相册封面
	*/
	private String aclassCover ;
	/*
	相册描述
	*/
	private String aclassDes ;
	/*
	相册名称
	*/
	private String aclassName ;
	/*
	修复后的封面路径
	*/
	private String nConver ;
	
	public RaAlbumClass() {
	}
	
	/**
	* 相册id
	*@return 
	*/
	public Integer getAclassId(){
		return  aclassId;
	}
	/**
	* 相册id
	*@param  aclassId
	*/
	public void setAclassId(Integer aclassId ){
		this.aclassId = aclassId;
	}
	
	/**
	* 排序
	*@return 
	*/
	public Integer getAclassSort(){
		return  aclassSort;
	}
	/**
	* 排序
	*@param  aclassSort
	*/
	public void setAclassSort(Integer aclassSort ){
		this.aclassSort = aclassSort;
	}
	
	/**
	* 是否为默认相册,1代表默认
	*@return 
	*/
	public Integer getIsDefault(){
		return  isDefault;
	}
	/**
	* 是否为默认相册,1代表默认
	*@param  isDefault
	*/
	public void setIsDefault(Integer isDefault ){
		this.isDefault = isDefault;
	}
	
	/**
	* 所属店铺id
	*@return 
	*/
	public Integer getStoreId(){
		return  storeId;
	}
	/**
	* 所属店铺id
	*@param  storeId
	*/
	public void setStoreId(Integer storeId ){
		this.storeId = storeId;
	}
	
	/**
	* 图片上传时间
	*@return 
	*/
	public Integer getUploadTime(){
		return  uploadTime;
	}
	/**
	* 图片上传时间
	*@param  uploadTime
	*/
	public void setUploadTime(Integer uploadTime ){
		this.uploadTime = uploadTime;
	}
	
	/**
	* 相册封面
	*@return 
	*/
	public String getAclassCover(){
		return  aclassCover;
	}
	/**
	* 相册封面
	*@param  aclassCover
	*/
	public void setAclassCover(String aclassCover ){
		this.aclassCover = aclassCover;
	}
	
	/**
	* 相册描述
	*@return 
	*/
	public String getAclassDes(){
		return  aclassDes;
	}
	/**
	* 相册描述
	*@param  aclassDes
	*/
	public void setAclassDes(String aclassDes ){
		this.aclassDes = aclassDes;
	}
	
	/**
	* 相册名称
	*@return 
	*/
	public String getAclassName(){
		return  aclassName;
	}
	/**
	* 相册名称
	*@param  aclassName
	*/
	public void setAclassName(String aclassName ){
		this.aclassName = aclassName;
	}
	
	/**
	* 修复后的封面路径
	*@return 
	*/
	public String getnConver(){
		return  nConver;
	}
	/**
	* 修复后的封面路径
	*@param  nConver
	*/
	public void setnConver(String nConver ){
		this.nConver = nConver;
	}
	

}
