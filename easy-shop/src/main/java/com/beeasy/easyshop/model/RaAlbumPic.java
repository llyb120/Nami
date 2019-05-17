package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_album_pic")
public class RaAlbumPic   {
	
	/*
	相册图片表id
	*/
	private Integer apicId ;
	/*
	相册id
	*/
	private Integer aclassId ;
	/*
	图片大小
	*/
	private Integer apicSize ;
	/*
	所属店铺id
	*/
	private Integer storeId ;
	/*
	图片上传时间
	*/
	private Integer uploadTime ;
	/*
	图片路径
	*/
	private String apicCover ;
	/*
	图片名称
	*/
	private String apicName ;
	/*
	图片规格
	*/
	private String apicSpec ;
	/*
	图片标签
	*/
	private String apicTag ;
	
	public RaAlbumPic() {
	}
	
	/**
	* 相册图片表id
	*@return 
	*/
	public Integer getApicId(){
		return  apicId;
	}
	/**
	* 相册图片表id
	*@param  apicId
	*/
	public void setApicId(Integer apicId ){
		this.apicId = apicId;
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
	* 图片大小
	*@return 
	*/
	public Integer getApicSize(){
		return  apicSize;
	}
	/**
	* 图片大小
	*@param  apicSize
	*/
	public void setApicSize(Integer apicSize ){
		this.apicSize = apicSize;
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
	* 图片路径
	*@return 
	*/
	public String getApicCover(){
		return  apicCover;
	}
	/**
	* 图片路径
	*@param  apicCover
	*/
	public void setApicCover(String apicCover ){
		this.apicCover = apicCover;
	}
	
	/**
	* 图片名称
	*@return 
	*/
	public String getApicName(){
		return  apicName;
	}
	/**
	* 图片名称
	*@param  apicName
	*/
	public void setApicName(String apicName ){
		this.apicName = apicName;
	}
	
	/**
	* 图片规格
	*@return 
	*/
	public String getApicSpec(){
		return  apicSpec;
	}
	/**
	* 图片规格
	*@param  apicSpec
	*/
	public void setApicSpec(String apicSpec ){
		this.apicSpec = apicSpec;
	}
	
	/**
	* 图片标签
	*@return 
	*/
	public String getApicTag(){
		return  apicTag;
	}
	/**
	* 图片标签
	*@param  apicTag
	*/
	public void setApicTag(String apicTag ){
		this.apicTag = apicTag;
	}
	

}
