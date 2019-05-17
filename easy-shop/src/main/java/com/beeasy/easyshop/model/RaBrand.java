package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_brand")
public class RaBrand   {
	
	/*
	索引ID
	*/
	private Integer brandId ;
	/*
	品牌申请，0为申请中，1为通过，默认为1，申请功能是会员使用，系统后台默认为1
	*/
	private Integer brandApply ;
	/*
	推荐，0为否，1为是，默认为0
	*/
	private Integer brandRecommend ;
	/*
	排序
	*/
	private Integer brandSort ;
	/*
	所属分类id
	*/
	private Integer classId ;
	private Integer fromPlace ;
	/*
	品牌展示类型 0表示图片 1表示文字 
	*/
	private Integer showType ;
	/*
	店铺ID
	*/
	private Integer storeId ;
	private String bigPic ;
	/*
	类别名称
	*/
	private String brandClass ;
	/*
	品牌首字母
	*/
	private String brandInitial ;
	/*
	品牌名称
	*/
	private String brandName ;
	/*
	图片
	*/
	private String brandPic ;
	
	public RaBrand() {
	}
	
	/**
	* 索引ID
	*@return 
	*/
	public Integer getBrandId(){
		return  brandId;
	}
	/**
	* 索引ID
	*@param  brandId
	*/
	public void setBrandId(Integer brandId ){
		this.brandId = brandId;
	}
	
	/**
	* 品牌申请，0为申请中，1为通过，默认为1，申请功能是会员使用，系统后台默认为1
	*@return 
	*/
	public Integer getBrandApply(){
		return  brandApply;
	}
	/**
	* 品牌申请，0为申请中，1为通过，默认为1，申请功能是会员使用，系统后台默认为1
	*@param  brandApply
	*/
	public void setBrandApply(Integer brandApply ){
		this.brandApply = brandApply;
	}
	
	/**
	* 推荐，0为否，1为是，默认为0
	*@return 
	*/
	public Integer getBrandRecommend(){
		return  brandRecommend;
	}
	/**
	* 推荐，0为否，1为是，默认为0
	*@param  brandRecommend
	*/
	public void setBrandRecommend(Integer brandRecommend ){
		this.brandRecommend = brandRecommend;
	}
	
	/**
	* 排序
	*@return 
	*/
	public Integer getBrandSort(){
		return  brandSort;
	}
	/**
	* 排序
	*@param  brandSort
	*/
	public void setBrandSort(Integer brandSort ){
		this.brandSort = brandSort;
	}
	
	/**
	* 所属分类id
	*@return 
	*/
	public Integer getClassId(){
		return  classId;
	}
	/**
	* 所属分类id
	*@param  classId
	*/
	public void setClassId(Integer classId ){
		this.classId = classId;
	}
	
	public Integer getFromPlace(){
		return  fromPlace;
	}
	public void setFromPlace(Integer fromPlace ){
		this.fromPlace = fromPlace;
	}
	
	/**
	* 品牌展示类型 0表示图片 1表示文字 
	*@return 
	*/
	public Integer getShowType(){
		return  showType;
	}
	/**
	* 品牌展示类型 0表示图片 1表示文字 
	*@param  showType
	*/
	public void setShowType(Integer showType ){
		this.showType = showType;
	}
	
	/**
	* 店铺ID
	*@return 
	*/
	public Integer getStoreId(){
		return  storeId;
	}
	/**
	* 店铺ID
	*@param  storeId
	*/
	public void setStoreId(Integer storeId ){
		this.storeId = storeId;
	}
	
	public String getBigPic(){
		return  bigPic;
	}
	public void setBigPic(String bigPic ){
		this.bigPic = bigPic;
	}
	
	/**
	* 类别名称
	*@return 
	*/
	public String getBrandClass(){
		return  brandClass;
	}
	/**
	* 类别名称
	*@param  brandClass
	*/
	public void setBrandClass(String brandClass ){
		this.brandClass = brandClass;
	}
	
	/**
	* 品牌首字母
	*@return 
	*/
	public String getBrandInitial(){
		return  brandInitial;
	}
	/**
	* 品牌首字母
	*@param  brandInitial
	*/
	public void setBrandInitial(String brandInitial ){
		this.brandInitial = brandInitial;
	}
	
	/**
	* 品牌名称
	*@return 
	*/
	public String getBrandName(){
		return  brandName;
	}
	/**
	* 品牌名称
	*@param  brandName
	*/
	public void setBrandName(String brandName ){
		this.brandName = brandName;
	}
	
	/**
	* 图片
	*@return 
	*/
	public String getBrandPic(){
		return  brandPic;
	}
	/**
	* 图片
	*@param  brandPic
	*/
	public void setBrandPic(String brandPic ){
		this.brandPic = brandPic;
	}
	

}
