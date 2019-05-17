package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_circle_thclass")
public class RaCircleThclass   {
	
	/*
	主题分类id
	*/
	private Integer thclassId ;
	/*
	所属圈子id
	*/
	private Integer circleId ;
	/*
	管理专属 1是，0否
	*/
	private Integer isModerator ;
	/*
	分类排序
	*/
	private Integer thclassSort ;
	/*
	主题状态 1开启，0关闭
	*/
	private Integer thclassStatus ;
	/*
	主题名称
	*/
	private String thclassName ;
	
	public RaCircleThclass() {
	}
	
	/**
	* 主题分类id
	*@return 
	*/
	public Integer getThclassId(){
		return  thclassId;
	}
	/**
	* 主题分类id
	*@param  thclassId
	*/
	public void setThclassId(Integer thclassId ){
		this.thclassId = thclassId;
	}
	
	/**
	* 所属圈子id
	*@return 
	*/
	public Integer getCircleId(){
		return  circleId;
	}
	/**
	* 所属圈子id
	*@param  circleId
	*/
	public void setCircleId(Integer circleId ){
		this.circleId = circleId;
	}
	
	/**
	* 管理专属 1是，0否
	*@return 
	*/
	public Integer getIsModerator(){
		return  isModerator;
	}
	/**
	* 管理专属 1是，0否
	*@param  isModerator
	*/
	public void setIsModerator(Integer isModerator ){
		this.isModerator = isModerator;
	}
	
	/**
	* 分类排序
	*@return 
	*/
	public Integer getThclassSort(){
		return  thclassSort;
	}
	/**
	* 分类排序
	*@param  thclassSort
	*/
	public void setThclassSort(Integer thclassSort ){
		this.thclassSort = thclassSort;
	}
	
	/**
	* 主题状态 1开启，0关闭
	*@return 
	*/
	public Integer getThclassStatus(){
		return  thclassStatus;
	}
	/**
	* 主题状态 1开启，0关闭
	*@param  thclassStatus
	*/
	public void setThclassStatus(Integer thclassStatus ){
		this.thclassStatus = thclassStatus;
	}
	
	/**
	* 主题名称
	*@return 
	*/
	public String getThclassName(){
		return  thclassName;
	}
	/**
	* 主题名称
	*@param  thclassName
	*/
	public void setThclassName(String thclassName ){
		this.thclassName = thclassName;
	}
	

}
