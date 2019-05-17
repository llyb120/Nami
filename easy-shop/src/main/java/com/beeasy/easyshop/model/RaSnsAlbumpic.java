package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_sns_albumpic")
public class RaSnsAlbumpic   {
	
	/*
	相册图片表id
	*/
	private Integer apId ;
	/*
	相册id
	*/
	private Integer acId ;
	/*
	图片大小
	*/
	private Integer apSize ;
	/*
	图片类型，0为无、1为买家秀
	*/
	private Integer apType ;
	/*
	信息ID
	*/
	private Integer itemId ;
	/*
	所属店铺id
	*/
	private Integer memberId ;
	/*
	图片上传时间
	*/
	private Integer uploadTime ;
	/*
	图片路径
	*/
	private String apCover ;
	/*
	图片名称
	*/
	private String apName ;
	/*
	图片规格
	*/
	private String apSpec ;
	
	public RaSnsAlbumpic() {
	}
	
	/**
	* 相册图片表id
	*@return 
	*/
	public Integer getApId(){
		return  apId;
	}
	/**
	* 相册图片表id
	*@param  apId
	*/
	public void setApId(Integer apId ){
		this.apId = apId;
	}
	
	/**
	* 相册id
	*@return 
	*/
	public Integer getAcId(){
		return  acId;
	}
	/**
	* 相册id
	*@param  acId
	*/
	public void setAcId(Integer acId ){
		this.acId = acId;
	}
	
	/**
	* 图片大小
	*@return 
	*/
	public Integer getApSize(){
		return  apSize;
	}
	/**
	* 图片大小
	*@param  apSize
	*/
	public void setApSize(Integer apSize ){
		this.apSize = apSize;
	}
	
	/**
	* 图片类型，0为无、1为买家秀
	*@return 
	*/
	public Integer getApType(){
		return  apType;
	}
	/**
	* 图片类型，0为无、1为买家秀
	*@param  apType
	*/
	public void setApType(Integer apType ){
		this.apType = apType;
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
	* 所属店铺id
	*@return 
	*/
	public Integer getMemberId(){
		return  memberId;
	}
	/**
	* 所属店铺id
	*@param  memberId
	*/
	public void setMemberId(Integer memberId ){
		this.memberId = memberId;
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
	public String getApCover(){
		return  apCover;
	}
	/**
	* 图片路径
	*@param  apCover
	*/
	public void setApCover(String apCover ){
		this.apCover = apCover;
	}
	
	/**
	* 图片名称
	*@return 
	*/
	public String getApName(){
		return  apName;
	}
	/**
	* 图片名称
	*@param  apName
	*/
	public void setApName(String apName ){
		this.apName = apName;
	}
	
	/**
	* 图片规格
	*@return 
	*/
	public String getApSpec(){
		return  apSpec;
	}
	/**
	* 图片规格
	*@param  apSpec
	*/
	public void setApSpec(String apSpec ){
		this.apSpec = apSpec;
	}
	

}
