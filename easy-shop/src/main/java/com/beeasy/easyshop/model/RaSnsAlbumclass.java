package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_sns_albumclass")
public class RaSnsAlbumclass   {
	
	/*
	相册id
	*/
	private Integer acId ;
	/*
	排序
	*/
	private Integer acSort ;
	/*
	是否为买家秀相册  1为是,0为否
	*/
	private Integer isDefault ;
	/*
	所属会员id
	*/
	private Integer memberId ;
	/*
	图片上传时间
	*/
	private Integer uploadTime ;
	/*
	相册封面
	*/
	private String acCover ;
	/*
	相册描述
	*/
	private String acDes ;
	/*
	相册名称
	*/
	private String acName ;
	
	public RaSnsAlbumclass() {
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
	* 排序
	*@return 
	*/
	public Integer getAcSort(){
		return  acSort;
	}
	/**
	* 排序
	*@param  acSort
	*/
	public void setAcSort(Integer acSort ){
		this.acSort = acSort;
	}
	
	/**
	* 是否为买家秀相册  1为是,0为否
	*@return 
	*/
	public Integer getIsDefault(){
		return  isDefault;
	}
	/**
	* 是否为买家秀相册  1为是,0为否
	*@param  isDefault
	*/
	public void setIsDefault(Integer isDefault ){
		this.isDefault = isDefault;
	}
	
	/**
	* 所属会员id
	*@return 
	*/
	public Integer getMemberId(){
		return  memberId;
	}
	/**
	* 所属会员id
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
	* 相册封面
	*@return 
	*/
	public String getAcCover(){
		return  acCover;
	}
	/**
	* 相册封面
	*@param  acCover
	*/
	public void setAcCover(String acCover ){
		this.acCover = acCover;
	}
	
	/**
	* 相册描述
	*@return 
	*/
	public String getAcDes(){
		return  acDes;
	}
	/**
	* 相册描述
	*@param  acDes
	*/
	public void setAcDes(String acDes ){
		this.acDes = acDes;
	}
	
	/**
	* 相册名称
	*@return 
	*/
	public String getAcName(){
		return  acName;
	}
	/**
	* 相册名称
	*@param  acName
	*/
	public void setAcName(String acName ){
		this.acName = acName;
	}
	

}
