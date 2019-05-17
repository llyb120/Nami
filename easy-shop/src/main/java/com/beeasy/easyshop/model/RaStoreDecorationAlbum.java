package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_store_decoration_album")
public class RaStoreDecorationAlbum   {
	
	/*
	图片编号
	*/
	private Integer imageId ;
	/*
	图片高度
	*/
	private Integer imageHeight ;
	/*
	图片大小
	*/
	private Integer imageSize ;
	/*
	图片宽度
	*/
	private Integer imageWidth ;
	/*
	店铺编号
	*/
	private Integer storeId ;
	/*
	上传时间
	*/
	private Integer uploadTime ;
	/*
	图片名称
	*/
	private String imageName ;
	/*
	图片原始名称
	*/
	private String imageOriginName ;
	
	public RaStoreDecorationAlbum() {
	}
	
	/**
	* 图片编号
	*@return 
	*/
	public Integer getImageId(){
		return  imageId;
	}
	/**
	* 图片编号
	*@param  imageId
	*/
	public void setImageId(Integer imageId ){
		this.imageId = imageId;
	}
	
	/**
	* 图片高度
	*@return 
	*/
	public Integer getImageHeight(){
		return  imageHeight;
	}
	/**
	* 图片高度
	*@param  imageHeight
	*/
	public void setImageHeight(Integer imageHeight ){
		this.imageHeight = imageHeight;
	}
	
	/**
	* 图片大小
	*@return 
	*/
	public Integer getImageSize(){
		return  imageSize;
	}
	/**
	* 图片大小
	*@param  imageSize
	*/
	public void setImageSize(Integer imageSize ){
		this.imageSize = imageSize;
	}
	
	/**
	* 图片宽度
	*@return 
	*/
	public Integer getImageWidth(){
		return  imageWidth;
	}
	/**
	* 图片宽度
	*@param  imageWidth
	*/
	public void setImageWidth(Integer imageWidth ){
		this.imageWidth = imageWidth;
	}
	
	/**
	* 店铺编号
	*@return 
	*/
	public Integer getStoreId(){
		return  storeId;
	}
	/**
	* 店铺编号
	*@param  storeId
	*/
	public void setStoreId(Integer storeId ){
		this.storeId = storeId;
	}
	
	/**
	* 上传时间
	*@return 
	*/
	public Integer getUploadTime(){
		return  uploadTime;
	}
	/**
	* 上传时间
	*@param  uploadTime
	*/
	public void setUploadTime(Integer uploadTime ){
		this.uploadTime = uploadTime;
	}
	
	/**
	* 图片名称
	*@return 
	*/
	public String getImageName(){
		return  imageName;
	}
	/**
	* 图片名称
	*@param  imageName
	*/
	public void setImageName(String imageName ){
		this.imageName = imageName;
	}
	
	/**
	* 图片原始名称
	*@return 
	*/
	public String getImageOriginName(){
		return  imageOriginName;
	}
	/**
	* 图片原始名称
	*@param  imageOriginName
	*/
	public void setImageOriginName(String imageOriginName ){
		this.imageOriginName = imageOriginName;
	}
	

}
