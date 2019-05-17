package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_upload")
public class RaUpload   {
	
	/*
	索引ID
	*/
	private Integer uploadId ;
	/*
	文件大小
	*/
	private Integer fileSize ;
	/*
	信息ID
	*/
	private Integer itemId ;
	/*
	添加时间
	*/
	private Integer uploadTime ;
	/*
	文件类别，0为无，1为文章图片，默认为0，2为帮助内容图片，3为店铺幻灯片，4为系统文章图片，5为积分礼品切换图片，6为积分礼品内容图片
	*/
	private Integer uploadType ;
	/*
	文件名
	*/
	private String fileName ;
	/*
	缩微图片
	*/
	private String fileThumb ;
	
	public RaUpload() {
	}
	
	/**
	* 索引ID
	*@return 
	*/
	public Integer getUploadId(){
		return  uploadId;
	}
	/**
	* 索引ID
	*@param  uploadId
	*/
	public void setUploadId(Integer uploadId ){
		this.uploadId = uploadId;
	}
	
	/**
	* 文件大小
	*@return 
	*/
	public Integer getFileSize(){
		return  fileSize;
	}
	/**
	* 文件大小
	*@param  fileSize
	*/
	public void setFileSize(Integer fileSize ){
		this.fileSize = fileSize;
	}
	
	/**
	* 信息ID
	*@return 
	*/
	public Integer getItemId(){
		return  itemId;
	}
	/**
	* 信息ID
	*@param  itemId
	*/
	public void setItemId(Integer itemId ){
		this.itemId = itemId;
	}
	
	/**
	* 添加时间
	*@return 
	*/
	public Integer getUploadTime(){
		return  uploadTime;
	}
	/**
	* 添加时间
	*@param  uploadTime
	*/
	public void setUploadTime(Integer uploadTime ){
		this.uploadTime = uploadTime;
	}
	
	/**
	* 文件类别，0为无，1为文章图片，默认为0，2为帮助内容图片，3为店铺幻灯片，4为系统文章图片，5为积分礼品切换图片，6为积分礼品内容图片
	*@return 
	*/
	public Integer getUploadType(){
		return  uploadType;
	}
	/**
	* 文件类别，0为无，1为文章图片，默认为0，2为帮助内容图片，3为店铺幻灯片，4为系统文章图片，5为积分礼品切换图片，6为积分礼品内容图片
	*@param  uploadType
	*/
	public void setUploadType(Integer uploadType ){
		this.uploadType = uploadType;
	}
	
	/**
	* 文件名
	*@return 
	*/
	public String getFileName(){
		return  fileName;
	}
	/**
	* 文件名
	*@param  fileName
	*/
	public void setFileName(String fileName ){
		this.fileName = fileName;
	}
	
	/**
	* 缩微图片
	*@return 
	*/
	public String getFileThumb(){
		return  fileThumb;
	}
	/**
	* 缩微图片
	*@param  fileThumb
	*/
	public void setFileThumb(String fileThumb ){
		this.fileThumb = fileThumb;
	}
	

}
