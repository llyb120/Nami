package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_vr_groupbuy_area")
public class RaVrGroupbuyArea   {
	
	/*
	区域id
	*/
	private Integer areaId ;
	/*
	添加时间
	*/
	private Integer addTime ;
	/*
	0.否 1.是
	*/
	private Integer hotCity ;
	/*
	数量
	*/
	private Integer number ;
	/*
	域区id
	*/
	private Integer parentAreaId ;
	/*
	域区名称
	*/
	private String areaName ;
	/*
	区号
	*/
	private String areaNumber ;
	/*
	首字母
	*/
	private String firstLetter ;
	/*
	邮编
	*/
	private String post ;
	
	public RaVrGroupbuyArea() {
	}
	
	/**
	* 区域id
	*@return 
	*/
	public Integer getAreaId(){
		return  areaId;
	}
	/**
	* 区域id
	*@param  areaId
	*/
	public void setAreaId(Integer areaId ){
		this.areaId = areaId;
	}
	
	/**
	* 添加时间
	*@return 
	*/
	public Integer getAddTime(){
		return  addTime;
	}
	/**
	* 添加时间
	*@param  addTime
	*/
	public void setAddTime(Integer addTime ){
		this.addTime = addTime;
	}
	
	/**
	* 0.否 1.是
	*@return 
	*/
	public Integer getHotCity(){
		return  hotCity;
	}
	/**
	* 0.否 1.是
	*@param  hotCity
	*/
	public void setHotCity(Integer hotCity ){
		this.hotCity = hotCity;
	}
	
	/**
	* 数量
	*@return 
	*/
	public Integer getNumber(){
		return  number;
	}
	/**
	* 数量
	*@param  number
	*/
	public void setNumber(Integer number ){
		this.number = number;
	}
	
	/**
	* 域区id
	*@return 
	*/
	public Integer getParentAreaId(){
		return  parentAreaId;
	}
	/**
	* 域区id
	*@param  parentAreaId
	*/
	public void setParentAreaId(Integer parentAreaId ){
		this.parentAreaId = parentAreaId;
	}
	
	/**
	* 域区名称
	*@return 
	*/
	public String getAreaName(){
		return  areaName;
	}
	/**
	* 域区名称
	*@param  areaName
	*/
	public void setAreaName(String areaName ){
		this.areaName = areaName;
	}
	
	/**
	* 区号
	*@return 
	*/
	public String getAreaNumber(){
		return  areaNumber;
	}
	/**
	* 区号
	*@param  areaNumber
	*/
	public void setAreaNumber(String areaNumber ){
		this.areaNumber = areaNumber;
	}
	
	/**
	* 首字母
	*@return 
	*/
	public String getFirstLetter(){
		return  firstLetter;
	}
	/**
	* 首字母
	*@param  firstLetter
	*/
	public void setFirstLetter(String firstLetter ){
		this.firstLetter = firstLetter;
	}
	
	/**
	* 邮编
	*@return 
	*/
	public String getPost(){
		return  post;
	}
	/**
	* 邮编
	*@param  post
	*/
	public void setPost(String post ){
		this.post = post;
	}
	

}
