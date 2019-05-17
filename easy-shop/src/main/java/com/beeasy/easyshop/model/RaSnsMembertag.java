package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_sns_membertag")
public class RaSnsMembertag   {
	
	/*
	会员标签id
	*/
	private Integer mtagId ;
	/*
	标签推荐 0未推荐（默认），1为已推荐
	*/
	private Integer mtagRecommend ;
	/*
	会员标签排序
	*/
	private Integer mtagSort ;
	/*
	标签描述
	*/
	private String mtagDesc ;
	/*
	标签图片
	*/
	private String mtagImg ;
	/*
	会员标签名称
	*/
	private String mtagName ;
	
	public RaSnsMembertag() {
	}
	
	/**
	* 会员标签id
	*@return 
	*/
	public Integer getMtagId(){
		return  mtagId;
	}
	/**
	* 会员标签id
	*@param  mtagId
	*/
	public void setMtagId(Integer mtagId ){
		this.mtagId = mtagId;
	}
	
	/**
	* 标签推荐 0未推荐（默认），1为已推荐
	*@return 
	*/
	public Integer getMtagRecommend(){
		return  mtagRecommend;
	}
	/**
	* 标签推荐 0未推荐（默认），1为已推荐
	*@param  mtagRecommend
	*/
	public void setMtagRecommend(Integer mtagRecommend ){
		this.mtagRecommend = mtagRecommend;
	}
	
	/**
	* 会员标签排序
	*@return 
	*/
	public Integer getMtagSort(){
		return  mtagSort;
	}
	/**
	* 会员标签排序
	*@param  mtagSort
	*/
	public void setMtagSort(Integer mtagSort ){
		this.mtagSort = mtagSort;
	}
	
	/**
	* 标签描述
	*@return 
	*/
	public String getMtagDesc(){
		return  mtagDesc;
	}
	/**
	* 标签描述
	*@param  mtagDesc
	*/
	public void setMtagDesc(String mtagDesc ){
		this.mtagDesc = mtagDesc;
	}
	
	/**
	* 标签图片
	*@return 
	*/
	public String getMtagImg(){
		return  mtagImg;
	}
	/**
	* 标签图片
	*@param  mtagImg
	*/
	public void setMtagImg(String mtagImg ){
		this.mtagImg = mtagImg;
	}
	
	/**
	* 会员标签名称
	*@return 
	*/
	public String getMtagName(){
		return  mtagName;
	}
	/**
	* 会员标签名称
	*@param  mtagName
	*/
	public void setMtagName(String mtagName ){
		this.mtagName = mtagName;
	}
	

}
