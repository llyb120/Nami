package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_activity")
public class RaActivity   {
	
	/*
	id
	*/
	private Integer activityId ;
	/*
	结束时间
	*/
	private Integer activityEndDate ;
	/*
	排序
	*/
	private Integer activitySort ;
	/*
	开始时间
	*/
	private Integer activityStartDate ;
	/*
	活动状态 0为关闭 1为开启
	*/
	private Integer activityState ;
	/*
	活动横幅大图片
	*/
	private String activityBanner ;
	/*
	描述
	*/
	private String activityDesc ;
	/*
	活动页面模板样式标识码
	*/
	private String activityStyle ;
	/*
	标题
	*/
	private String activityTitle ;
	/*
	活动类型 1:商品 2:团购
	*/
	private String activityType ;
	
	public RaActivity() {
	}
	
	/**
	* id
	*@return 
	*/
	public Integer getActivityId(){
		return  activityId;
	}
	/**
	* id
	*@param  activityId
	*/
	public void setActivityId(Integer activityId ){
		this.activityId = activityId;
	}
	
	/**
	* 结束时间
	*@return 
	*/
	public Integer getActivityEndDate(){
		return  activityEndDate;
	}
	/**
	* 结束时间
	*@param  activityEndDate
	*/
	public void setActivityEndDate(Integer activityEndDate ){
		this.activityEndDate = activityEndDate;
	}
	
	/**
	* 排序
	*@return 
	*/
	public Integer getActivitySort(){
		return  activitySort;
	}
	/**
	* 排序
	*@param  activitySort
	*/
	public void setActivitySort(Integer activitySort ){
		this.activitySort = activitySort;
	}
	
	/**
	* 开始时间
	*@return 
	*/
	public Integer getActivityStartDate(){
		return  activityStartDate;
	}
	/**
	* 开始时间
	*@param  activityStartDate
	*/
	public void setActivityStartDate(Integer activityStartDate ){
		this.activityStartDate = activityStartDate;
	}
	
	/**
	* 活动状态 0为关闭 1为开启
	*@return 
	*/
	public Integer getActivityState(){
		return  activityState;
	}
	/**
	* 活动状态 0为关闭 1为开启
	*@param  activityState
	*/
	public void setActivityState(Integer activityState ){
		this.activityState = activityState;
	}
	
	/**
	* 活动横幅大图片
	*@return 
	*/
	public String getActivityBanner(){
		return  activityBanner;
	}
	/**
	* 活动横幅大图片
	*@param  activityBanner
	*/
	public void setActivityBanner(String activityBanner ){
		this.activityBanner = activityBanner;
	}
	
	/**
	* 描述
	*@return 
	*/
	public String getActivityDesc(){
		return  activityDesc;
	}
	/**
	* 描述
	*@param  activityDesc
	*/
	public void setActivityDesc(String activityDesc ){
		this.activityDesc = activityDesc;
	}
	
	/**
	* 活动页面模板样式标识码
	*@return 
	*/
	public String getActivityStyle(){
		return  activityStyle;
	}
	/**
	* 活动页面模板样式标识码
	*@param  activityStyle
	*/
	public void setActivityStyle(String activityStyle ){
		this.activityStyle = activityStyle;
	}
	
	/**
	* 标题
	*@return 
	*/
	public String getActivityTitle(){
		return  activityTitle;
	}
	/**
	* 标题
	*@param  activityTitle
	*/
	public void setActivityTitle(String activityTitle ){
		this.activityTitle = activityTitle;
	}
	
	/**
	* 活动类型 1:商品 2:团购
	*@return 
	*/
	public String getActivityType(){
		return  activityType;
	}
	/**
	* 活动类型 1:商品 2:团购
	*@param  activityType
	*/
	public void setActivityType(String activityType ){
		this.activityType = activityType;
	}
	

}
